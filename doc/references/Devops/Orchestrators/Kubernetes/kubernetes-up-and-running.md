# Kubernetes: Up and Running, 2nd Edition (Brendan Burns, Joe Beda, Kelsey Hightower)

Distilled from the book's technical core: the reconciliation-loop pattern underlying every
Kubernetes controller, Custom Resource Definitions (CRDs) and the Operator pattern built on
them, admission webhooks (validating and mutating) with their exact wire mechanics, and
Role-Based Access Control (RBAC) internals beyond the basics. See
[the-complete-kubernetes-guide.md](the-complete-kubernetes-guide.md) for control-plane
component architecture (etcd, API server, scheduler, kubelet, Container Runtime Interface),
kube-proxy's iptables mechanics, and the Container Network Interface (CNI) plugin contract,
which that book covers in more depth.

## The reconciliation loop: the pattern behind every controller

**What**: A reconciliation loop is a control-flow pattern built around **desired state** versus
**observed (current) state**. It runs continuously, observing the current state of the system
and taking action to move the observed state toward the desired state.

**Why**: This is the mechanism that makes Kubernetes self-healing and declarative. Instead of
imperative "do X then Y" scripts that only run once, a reconciliation loop keeps re-evaluating
forever, so it transparently handles both explicit user actions (scaling a Deployment up or
down) and implicit environmental changes (a node failing, or rejoining after being absent) with
the *same* code path — there is no special-cased "handle a node failure" branch, just "does
observed state match desired state; if not, act."

**How**: For a ReplicaSet, desired state is "N replicas of this pod template exist"; observed
state is "M pods matching this ReplicaSet's label selector currently exist." The loop creates or
deletes pods until M equals N. Critically, a ReplicaSet does not *own* its pods in a tight,
compile-time sense — it finds them via a **label query** at every reconciliation pass, which is
why the relationship between a ReplicaSet and its pods is loosely coupled (a design decision
that also explains why Kubernetes lets you re-parent orphaned pods by relabeling them). Every
higher-level controller (Deployment, StatefulSet, DaemonSet, Job) is built on the same
desired-vs-observed reconciliation pattern, which is why they all expose broadly the same
mental model despite managing different kinds of workloads.

## Custom Resource Definitions and the Operator pattern

**What**: A **CustomResourceDefinition (CRD)** is a meta-resource — a resource that defines a
new *kind* of resource, extending the Kubernetes API surface with an entirely new object type
that behaves like any built-in type: it can be namespaced, is subject to RBAC, and can be
manipulated with `kubectl` or the API directly. An **Operator** is a CRD paired with a
**controller** that runs a reconciliation loop against instances of that custom resource,
implementing whatever custom behavior the CRD represents. Registering the CRD alone only gets
you a CRUD (create/read/update/delete) API for inert data — the controller is the other half
that actually makes something happen.

**Why**: Kubernetes' built-in objects cover generic workload/networking/storage concerns, but
operational knowledge specific to one piece of software (how to safely fail over this specific
clustered database, how to run a specific load-testing job) does not fit any built-in object.
CRDs let that domain-specific operational knowledge be expressed as a native Kubernetes API
object and reconciled the same way built-in controllers work, instead of living in an external
script or runbook disconnected from the cluster's own state model.

**How**: A CRD's name must follow `<resource-plural>.<api-group>` (e.g.,
`loadtests.beta.kuar.com`), guaranteeing uniqueness cluster-wide since no two objects can share
a name. Its `spec` declares the API group, one or more `versions` (exactly one of which has
`storage: true`, marking which version's representation is what etcd actually persists), a
`scope` (`Namespaced` by default, or cluster-wide), and `names` (plural/singular/kind/short
names for `kubectl` ergonomics). No schema is required by default — `kubectl get loadtests`
works immediately after creating the CRD, and instances can be created freely with any fields,
though an OpenAPI schema can be attached for basic structural validation.

```yaml
apiVersion: apiextensions.k8s.io/v1beta1
kind: CustomResourceDefinition
metadata:
  name: loadtests.beta.kuar.com
spec:
  group: beta.kuar.com
  versions:
    - name: v1
      served: true
      storage: true
  scope: Namespaced
  names:
    plural: loadtests
    singular: loadtest
    kind: LoadTest
    shortNames: ["lt"]
```

The controller side watches the API server for `LoadTest` objects (via the **watch API**, not
polling — see below) and reconciles: creating, modifying, or deleting the underlying resources
(e.g., worker pods) needed to satisfy each `LoadTest` object's spec. A naive controller can poll
in a loop, but polling adds latency (bounded by the poll interval) and unnecessary API server
load; the recommended approach is the **Informer pattern** from the `client-go` library, which
consumes the watch API's stream of change events directly and is nontrivial to implement
correctly by hand — hence the strong recommendation to use the library rather than reimplement
watch-handling logic.

## Admission webhooks: validating vs. mutating, exact mechanics

**What**: An **admission controller** intercepts a request to the API server *after*
authentication and authorization but *before* the object is persisted to etcd, and can either
reject the request outright (a **validating** admission controller) or rewrite the request body
in flight (a **mutating** admission controller) before it is stored. Both are configured
dynamically via Kubernetes objects rather than requiring an API server restart:
`ValidatingWebhookConfiguration` and `MutatingWebhookConfiguration` respectively.

**Why**: Built-in admission controllers cover generic policy (e.g., the limit-range admission
controller injects default resource limits onto pods that don't specify them), but
organization-specific policy — "every `LoadTest` must specify a positive
`requestsPerSecond`," "every pod gets a sidecar auto-injected" — needs a pluggable extension
point that runs inline with every matching API request, not a periodic batch check that would
let invalid objects exist even briefly.

**How**: A webhook admission controller is a plain HTTP(S) application; the API server calls it
either via an in-cluster `Service` or an arbitrary URL, meaning it can run entirely outside the
cluster (e.g., a cloud Function-as-a-Service endpoint). The API server **requires HTTPS** for
this call, which means the webhook needs a valid Transport Layer Security (TLS) certificate
before it can be registered — commonly issued by the cluster's own certificate authority (CA)
via a `CertificateSigningRequest` object, approved with `kubectl certificate approve`. The
`ValidatingWebhookConfiguration` / `MutatingWebhookConfiguration` object declares which
resource, API group, and operation (e.g., `CREATE` on `loadtests.beta.kuar.com`) should trigger
the webhook, plus the webhook's URL and the base64-encoded CA bundle needed to trust it:

```yaml
apiVersion: admissionregistration.k8s.io/v1beta1
kind: ValidatingWebhookConfiguration
metadata:
  name: kuar-validator
webhooks:
  - name: validator.kuar.com
    rules:
      - apiGroups: ["beta.kuar.com"]
        apiVersions: ["v1"]
        operations: ["CREATE"]
        resources: ["loadtests"]
    clientConfig:
      url: https://192.168.1.233:8080
      caBundle: <base64-encoded CA cert>
```

When a matching request arrives, the API server sends the webhook an `AdmissionReview` object
containing the request metadata and the object body. A **validating** webhook inspects the
object and returns an allow/deny verdict (with a reason on deny) — it cannot alter the request.
A **mutating** webhook is registered identically but via `MutatingWebhookConfiguration`, and
instead of a plain allow/deny, its response can include a **JSONPatch** describing edits to
apply to the object before it's persisted — e.g., defaulting an empty `paths` field:

```json
{ "response": { "patch": "<base64 JSONPatch>", "patchType": "JSONPatch" } }
```

The ordering matters operationally: mutating webhooks run before validating webhooks in the
admission chain, so defaulting logic in a mutating webhook can supply values that a subsequent
validating webhook then checks.

## Role-Based Access Control beyond Role/RoleBinding basics

Building on the Role/ClusterRole/RoleBinding/ClusterRoleBinding mechanics already covered in
`doc/Study.md`, this book adds:
- **Verbs map to HTTP methods**: `create`→POST, `delete`→DELETE, `get`/`list`/`watch`→GET,
  `patch`→PATCH, `update`→PUT, plus `proxy`→GET (connect to a resource via a streaming
  WebSocket proxy) — useful for reasoning about exactly what a Role grants beyond the common
  verbs.
- **Built-in ClusterRoles for end users**: `cluster-admin` (full cluster access), `admin` (full
  access to one namespace), `edit` (modify resources in a namespace, no RBAC changes), `view`
  (read-only). These are auto-installed by the API server at startup and are
  **auto-reconciled** — any manual edit to a built-in ClusterRole is silently overwritten on
  the next API server restart unless the `rbac.authorization.kubernetes.io/autoupdate: "false"`
  annotation is set on it first.
- **`kubectl auth can-i`**: tests authorization directly — `kubectl auth can-i create pods` or,
  for subresources, `kubectl auth can-i get pods --subresource=logs` — useful both for
  validating configuration while building RBAC policy and for users self-diagnosing an
  "unauthorized" error.
- **`kubectl auth reconcile -f rbac.yaml`**: reconciles a text/version-controlled set of
  Role/RoleBinding definitions against the live cluster state (`--dry-run` to preview), which is
  the recommended way to manage RBAC as code rather than ad hoc `kubectl create`/`edit`.
- **ClusterRole aggregation**: rather than hand-copying rules between overlapping roles (which
  drifts as one is edited and the other isn't), a ClusterRole can declare an
  `aggregationRule.clusterRoleSelector` label selector; every ClusterRole matching that selector
  has its rules automatically merged into the aggregate role, and stays in sync as the
  constituent roles change. This is how Kubernetes builds its own `edit`/`view` roles internally
  — from smaller, fine-grained ClusterRoles aggregated together.
- **Identity**: every request carries an identity, even an unauthenticated one (mapped to the
  `system:unauthenticated` group). Kubernetes distinguishes **service account** identities
  (managed by Kubernetes itself, used by in-cluster components) from **user** identities
  (external, via a pluggable authentication provider — x509 client certs, static token files,
  cloud identity and access management (IAM) integration, or authentication webhooks).

## Init containers: solving the readiness-probe timing trade-off

**What**: A pod can declare one or more `initContainers`, which run to completion, in order,
before any of the pod's regular `containers` start.

**Why**: Liveness/readiness probes alone force an awkward trade-off for non-deterministic
startup work (e.g., waiting on a dependency, running a one-time setup script): if
`initialDelaySeconds` is set short, a slow start gets misclassified as a failure; if set long
"just in case," every instance of a high-traffic service sits idle for that entire delay after
every rollout, even when startup is usually fast — at scale, that wasted delay can make a
service effectively unavailable during rollouts. Init containers separate the
non-deterministic setup phase from the application container's own readiness probing, so the
probe's delay budget only has to account for the application's own (more predictable) startup.

**How**: `initContainers` uses the same schema as `containers`; each init container must exit
successfully before the next one (or the main containers) starts. This composes cleanly with
the sidecar/ambassador/adapter multi-container patterns (see
[the-complete-kubernetes-guide.md](the-complete-kubernetes-guide.md)) — init containers handle
one-time setup, while sidecars handle ongoing co-located behavior.

## Reference

Kubernetes: Up and Running, 2nd Edition, Burns/Beda/Hightower, O'Reilly, 2019 (486 pages).
Covers cluster deployment, core objects (pods, labels, Services, Ingress, ReplicaSets,
Deployments, DaemonSets, Jobs, ConfigMaps/Secrets), RBAC, storage integration, extending
Kubernetes (admission webhooks, CRDs, API aggregation), and application deployment patterns
(worldwide/multi-region rollout, templating with Helm). Command-reference material (`kubectl`
basics) is intentionally omitted here since `doc/Study.md` already covers it.
