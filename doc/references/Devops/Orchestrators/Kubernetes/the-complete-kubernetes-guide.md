# The Complete Kubernetes Guide (Jonathan Baier, Gigi Sayfan, Jesse White)

Distilled from the book's technical core: control-plane component architecture (etcd, API
server, controller manager, scheduler, kubelet), the Container Runtime Interface (CRI), the API
request security chain (authentication → authorization → admission), kube-proxy's iptables
mechanics, the Container Network Interface (CNI) plugin contract, and the multi-container pod
design patterns. See [kubernetes-up-and-running.md](kubernetes-up-and-running.md) for
reconciliation loops, CRDs/Operators, and the exact wire mechanics of validating/mutating
admission webhooks, which that book covers in more depth.

## Control plane architecture: etcd, API server, controller manager, scheduler

**What each component actually is**:
- **etcd** — a highly reliable, distributed key-value store. It holds the **entire cluster
  state**; nothing else in Kubernetes is the source of truth. For any cluster beyond a small,
  transient one, etcd runs as its own 3- or 5-node cluster (odd numbers for quorum) separate
  from the other control-plane components, for redundancy and high availability.
  Serialization to protocol buffers (rather than JSON) in etcd3 is one of the concrete
  optimizations the book cites for improving Kubernetes' performance and scalability at
  cluster scale.
- **API server (`kube-apiserver`)** — exposes the Kubernetes REST API and is "the embodiment
  of the Kubernetes control plane." It is **stateless** — it stores no state of its own, reading
  and writing everything to/from etcd — which is what lets it scale horizontally by simply
  running more replicas behind a load balancer. It also **caches reads**, reducing direct load
  on etcd for repeated queries.
- **Controller manager (`kube-controller-manager`)** — a single binary bundling multiple
  independent controllers (replication controller, pod controller, services controller,
  endpoints controller, and others), each running its own reconciliation loop, each watching
  cluster state through the API server and steering it toward the declared desired state.
- **Cloud controller manager** — an optional, cloud-provider-specific component (introduced in
  Kubernetes 1.6) that takes over the load balancer/instance/zone/route management
  responsibilities the controller manager would otherwise handle in a cloud environment; running
  it requires setting `--cloud-provider=external` on the controller manager to disable the
  control loops it is replacing.
- **kube-scheduler** — assigns unscheduled pods to nodes. Its decision has to weigh several
  interacting factors simultaneously: resource requirements, explicit service requirements,
  hardware/software policy constraints, node affinity/anti-affinity, pod affinity/anti-affinity,
  taints and tolerations, data locality, and deadlines. The scheduler is pluggable: a cluster can
  run a custom scheduler alongside the default one, with pods opting into it via
  `spec.schedulerName`, so only a subset of pods use the custom logic.
- **kube-proxy** (node component) — does low-level network housekeeping on every node,
  reflecting Service definitions locally and handling TCP/UDP forwarding to the correct pod
  (mechanics below).
- **kubelet** (node component) — the Kubernetes agent on each node. It downloads pod secrets
  from the API server, mounts volumes, runs each pod's containers through the Container Runtime
  Interface, reports node and pod status back to the API server, and runs the container liveness
  probes itself (the probe HTTP/TCP checks are executed by the kubelet, not the API server).

**Why the split matters**: every one of these is independently horizontally scalable or
replaceable *because* the API server is stateless and etcd is the single source of truth —
any component's state is reconstructable purely by reading from the API server. This is also
why a custom scheduler, a custom controller, or a CRD's controller can be written by a
third party and run alongside the built-in ones without modifying Kubernetes itself: they are
just additional clients of the same API server/etcd source of truth.

## The Container Runtime Interface: how kubelet talks to containerd/CRI-O

**What**: The Container Runtime Interface (CRI) is a gRPC API — a specification plus supporting
libraries — that lets the kubelet integrate with **any** CRI-compliant container runtime
without the kubelet needing runtime-specific code. It replaced Kubernetes' internal, hardcoded
Docker integration starting in Kubernetes 1.7.

**Why**: Before CRI, adding support for a new container runtime meant patching kubelet itself.
Decoupling the kubelet from any specific runtime via a stable gRPC contract let the ecosystem
diversify (containerd, CRI-O, and others) without coupling Kubernetes' release cycle to any one
runtime's internals — the same "small tool, stable interface" philosophy that motivated
splitting `containerd`/`runc` out of the Docker daemon (see
[docker-deep-dive.md](../../Containers/Docker/docker-deep-dive.md)).

**How**: CRI defines two gRPC service interfaces a runtime (or a shim in front of one) must
implement:
- **`ImageService`** — `ListImages`, `ImageStatus`, `PullImage`, `RemoveImage`, `ImageFsInfo`.
- **`RuntimeService`** — pod-sandbox lifecycle (`RunPodSandbox`, `StopPodSandbox`,
  `RemovePodSandbox`, `PodSandboxStatus`, `ListPodSandbox`) and container lifecycle
  (`CreateContainer`, `StartContainer`, `StopContainer`, `RemoveContainer`, `ListContainers`,
  `ContainerStatus`, `UpdateContainerResources`, `ExecSync`/`Exec`).

The kubelet calls these RPCs directly; it never needs to know whether the RPCs are ultimately
satisfied by containerd, CRI-O, or another implementation. This is the same relationship
`containerd` has to `runc` inside plain Docker — a stable interface in front of a swappable
implementation — applied one layer up, between the kubelet and whichever container engine a
node actually runs.

## API request security chain: authentication → authorization → admission

**What**: Every API server request passes through three sequential stages before it can
change cluster state: **authentication** (who is this?), **authorization** (is this identity
allowed to do this?), and **admission control** (should this specific request additionally be
transformed or rejected, even if authorized?). This all happens after Transport Layer Security
(TLS) is established for the connection.

**Why three separate stages**: they answer different questions and are pluggable
independently. Authentication only establishes identity — it says nothing about permissions.
Authorization checks a fixed policy (who can do what) but cannot express dynamic,
content-dependent logic ("reject this pod because its image isn't from an approved registry").
Admission control is the layer built specifically for that dynamic, content-aware policy,
running after the request is already known to be authenticated and authorized — so it never has
to re-derive identity or re-check permissions, only evaluate the request body itself.

**How**:
- **Authentication** methods include client certificates, static token files, and third-party
  OpenID Connect providers (e.g., Dex).
- **Authorization** supports three pluggable modes simultaneously: **RBAC** (the standard
  role/binding model), **Attribute-Based Access Control (ABAC)** (privileges defined via
  attributes in a static file), and a **Webhook** mode delegating the decision to an external
  REST service. A `SubjectAccessReview` object is the wire format for a webhook authorization
  check — it carries the requesting user/groups and the resource/verb being attempted, and gets
  back an `allowed: true/false` (with a reason on denial):
  ```json
  {
    "apiVersion": "authorization.k8s.io/v1beta1",
    "kind": "SubjectAccessReview",
    "spec": { "resourceAttributes": { "namespace": "ns", "verb": "get", "resource": "pods" },
              "user": "alice@example.com" }
  }
  ```
- **Admission control** runs as a chain of controllers, each able to reject or (for the subset
  that support it) mutate the request before it's persisted. `PodSecurityPolicy` objects, for
  example, are enforced entirely via an admission controller — the policy itself does nothing
  without that hook, and PodSecurityPolicy is disabled by default in most distributions until
  the admission controller is explicitly enabled. The chain is dynamically extensible via
  `ExternalAdmissionHookConfiguration`/webhook-based admission controllers, registered with a
  Certificate Authority (CA) bundle and a target Service, without requiring an API server
  restart.

## kube-proxy: iptables mode mechanics

**What**: kube-proxy is the component that makes a Service's stable Cluster IP actually route
to one of its backing pods. Historically it has run in two modes: **userspace** mode (legacy)
and **iptables** mode (the long-standing default).

**Why iptables mode replaced userspace mode**: in userspace mode, kube-proxy itself sits in the
data path — a packet is redirected by an `iptables` rule to a random port kube-proxy listens
on, and kube-proxy then proxies it onward to a pod in user space. Every packet takes an extra
hop through a userspace process, which is both slower and introduces kube-proxy itself as a
potential single point of failure in the data path. iptables mode removes kube-proxy from the
data path entirely.

**How iptables mode works**: kube-proxy watches the API server for Service and Endpoint
changes. For every Service, it programs `iptables` rules directly in the kernel's netfilter
tables that rewrite (destination network address translation, or DNAT) a packet destined for
the Service's virtual Cluster IP straight to one of the Service's backing pod IPs — the pod is
selected directly by the kernel's rule evaluation, with no proxy process touching the packet.
When the set of ready endpoints changes (pods coming/going, or failing a readiness check), the
`iptables` rule set is rewritten to match. A `sessionAffinity: ClientIP` field on the Service
adds rules that pin a given client IP to the same backend pod for the life of the affinity
window. Because iptables mode removes kube-proxy from the data path, it also removes
kube-proxy's ability to *retry* a request against a different pod if the first one fails — this
is why a correctly configured **readiness probe** matters even more under iptables mode: a pod
that fails readiness is pulled out of the `iptables` rules entirely rather than silently retried
around.

(A newer kube-proxy mode, **IPVS** — built on the Linux kernel's IP Virtual Server load-balancer
subsystem rather than sequential `iptables` rule matching — offers O(1) hash-table lookup of the
right backend instead of iptables' O(n) linear rule scan, and supports additional load-balancing
algorithms beyond iptables mode's random selection; it matters most at Service/endpoint counts
large enough for `iptables` rule-chain length itself to become a bottleneck.)

## Container Network Interface: the plugin contract

**What**: CNI is a plugin specification for wiring container network interfaces, used by
Kubernetes (and other orchestrators). A CNI "container" is any network-addressable entity with
its own IP — for Kubernetes specifically, that unit is the **pod**, not the individual
containers inside it (all containers in a pod share one network namespace and therefore one IP).

**Why**: Separating "how do I get an IP and route set up for this sandbox" from "how do I
orchestrate pods" lets Kubernetes support many different networking backends (Flannel, Calico,
Weave, cloud-native VPC networking, etc.) through one stable contract, the same
decouple-with-a-stable-interface pattern used by the Container Runtime Interface.

**How**: The **container runtime**'s job is to create the network namespace and then invoke a
CNI plugin as a subprocess, passing it a JSON network configuration on standard input and
context via environment variables:
- `CNI_COMMAND` — `ADD`, `DEL`, or `VERSION`.
- `CNI_CONTAINERID`, `CNI_NETNS` (path to the network namespace file), `CNI_IFNAME` (interface
  name the plugin must create), `CNI_ARGS` (extra key-value pairs), `CNI_PATH` (search path for
  plugin executables).

The **CNI plugin**'s job is narrow and mechanical: add a network interface into the container's
network namespace, bridge it to the host via a virtual Ethernet (veth) pair, assign an IP
address (typically delegating to a separate IP address management, or IPAM, plugin), and set up
routes. On success it exits with code 0 and streams the resulting interface/IP/route
configuration back as JSON on standard output:

```json
{
  "cniVersion": "0.3.0",
  "interfaces": [{ "name": "eth0", "mac": "...", "sandbox": "<netns path>" }],
  "ip": [{ "version": "4", "address": "10.1.0.5/16", "gateway": "10.1.0.1" }]
}
```

Because the contract is just "an executable that reads JSON from stdin and writes JSON to
stdout," CNI plugins can be written in any language — no shared library or binary API is
required, only the input/output convention.

## NetworkPolicy: enforcement is delegated to the CNI plugin, not built into core

**What**: A `NetworkPolicy` object specifies which pods (via label selectors) may communicate
with which other pods/namespaces/ports — a whitelist layered on top of whatever the namespace's
default isolation policy already is.

**Why it is not a complete security boundary on its own**: the Kubernetes API only *stores* the
policy — it does not enforce it. Enforcement requires a networking solution whose CNI plugin
implements policy enforcement (Calico is a common example; Canal combines Calico's policy
engine with Flannel's overlay). If an attacker can reach the internal pod network directly and
create their own pod matching the policy's allowed selectors, they can still communicate freely
— NetworkPolicy constrains legitimate pod-to-pod traffic patterns, it is not a substitute for
network-perimeter security.

**How**: on each node, an agent tied to the networking solution intercepts all inbound traffic
to that node's pods, checks it against the currently configured policies, and forwards or
rejects accordingly.

```yaml
apiVersion: networking.k8s.io/v1
kind: NetworkPolicy
metadata: { name: test-network-policy, namespace: default }
spec:
  podSelector: { matchLabels: { role: db } }
  ingress:
    - from:
        - namespaceSelector: { matchLabels: { project: awesome-project } }
        - podSelector: { matchLabels: { role: frontend } }
      ports: [{ protocol: TCP, port: 6379 }]
```

## Multi-container pod design patterns

Three single-node patterns are directly supported by co-locating containers in one pod (sharing
network and storage, as `doc/Study.md` already describes for the Pod object):

- **Sidecar** — a second container added alongside the main application container, which
  remains unaware of it. Canonical example: a logging agent sidecar that ships the main
  container's `stdout` to a central logging service. The benefit is decoupling — swapping the
  logging backend means changing only the sidecar, never the application container, so the
  application can never be broken by a logging policy change.
- **Ambassador** — a local proxy container that represents a remote service as if it were
  local. Canonical example: a Redis ambassador exposed on `localhost:6379` inside the pod, which
  transparently routes writes to a Redis primary and reads to one of several replicas. The main
  application only ever talks to `localhost` — it is unaware of the real topology, so topology
  changes (adding/removing replicas, failover) only require updating the ambassador.
  co-located in the same pod, not the application.
- **Adapter** — standardizes/transforms the main container's output to match a format
  downstream consumers still expect. Canonical example: a service mid-rollout emitting a new
  report format, with an adapter container sharing the filesystem to rewrite that output back
  into the old format until every consumer has upgraded. Unlike the sidecar and ambassador
  patterns (which run independently alongside the app), the adapter pattern depends on a shared
  filesystem with the main container to observe and transform its output.

Multi-node patterns (leader election, work queues, scatter-gather) are not directly supported by
any single Kubernetes object the way the three patterns above are — they require composing
multiple pods with a standard interface between them, built on top of core primitives rather
than expressed as one.

## Reference

The Complete Kubernetes Guide, Baier/Sayfan/White, Packt, 2019 (616 pages). Covers cluster
architecture and CRI runtimes, kubectl-driven core constructs, networking/load
balancing/Ingress, storage, monitoring/logging/troubleshooting, cluster federation, cluster
authentication/authorization/container security, stateful applications, scaling/quotas,
advanced networking (CNI plugin authoring, network policy, load-balancer options), and
customizing Kubernetes (API extension, CRDs, custom schedulers, admission webhooks). Deployment
walkthroughs for specific cloud providers (Google Kubernetes Engine, Azure Kubernetes Service,
Amazon Elastic Kubernetes Service) are intentionally omitted here as operationally
time-sensitive rather than durable mechanism knowledge.
