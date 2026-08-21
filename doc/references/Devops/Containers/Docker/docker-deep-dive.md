# Docker Deep Dive (Nigel Poulton)

Distilled from the book's technical core: the Docker Engine's internal architecture, image
internals, and the Linux security primitives containers are built from. This book's distinct
value versus *Docker in Action* is the engine architecture chain (`dockerd` → `containerd` →
`containerd-shim` → `runc`) and the Open Container Initiative specs, plus image manifest /
content-addressable-storage internals and a broader (if less mechanistic) tour of the Linux
security stack. See [docker-in-action.md](docker-in-action.md) for deeper namespace/cgroup/
capability mechanics and union-filesystem copy-on-write behavior.

## Engine architecture: dockerd, containerd, containerd-shim, runc

**What**: The Docker Engine is not one monolithic process. It is four cooperating components,
each with one job:
- **`dockerd`** (the daemon) — exposes the Docker REST API, and still owns image management,
  builds, authentication, core networking, and volumes. It no longer contains any container
  *execution* code.
- **`containerd`** — a container supervisor. Its only job is container lifecycle operations
  (create, start, stop, pause, destroy). Originally extracted from `dockerd`, donated to the
  Cloud Native Computing Foundation (CNCF), and small/lightweight by design so other projects
  can reuse it (Kubernetes' container runtime interface implementations use it directly).
- **`runc`** — the reference implementation of the Open Container Initiative (OCI)
  container-runtime-spec. A small, fast command-line interface (CLI) wrapping `libcontainer`.
  Its only job is to create a container and exit — it does not supervise anything long-running.
- **`containerd-shim`** — becomes the container's parent process once `runc` exits. It keeps
  stdin/stdout streams open (so pipes are not closed if `dockerd` restarts) and reports the
  container's exit status back to `dockerd`.

**Why**: The original architecture had a single monolithic daemon that also contained the
Linux Containers (LXC) execution logic, later replaced by Docker's own `libcontainer`. A
monolithic daemon meant: (1) every container's runtime was coupled to the daemon process, so
restarting/upgrading `dockerd` killed every running container — a severe problem in production
where Docker releases were frequent; (2) it was hard to innovate on a single large binary; (3)
it locked the whole runtime to Docker, Inc.'s implementation, blocking reuse by other
ecosystem tools. Breaking the runtime out into `containerd` + `runc`, and building both around
the OCI's image-spec and container-runtime-spec (both released as v1.0 in July 2017), gave
"daemonless containers": the runtime is fully decoupled from the daemon, so `dockerd` can be
stopped, upgraded, and restarted without killing any running container.

**How**: `docker container run` → Docker CLI converts the command to an API payload, POSTs it
to `dockerd`'s REST API → `dockerd` calls `containerd` over gRPC (a CRUD-style API) →
`containerd` converts the Docker image into an OCI-compliant bundle and forks a new `runc`
instance for *this* container → `runc` interfaces directly with the Linux kernel to assemble
namespaces and control groups (cgroups) and starts the container process as `runc`'s child →
`runc` exits immediately once the container process is running (it does not linger) →
`containerd-shim` becomes the new parent process and stays alive for the container's lifetime.
Because `containerd` forks a new `runc` process *per container* but that process exits
immediately, a host can run hundreds of containers without hundreds of persistent `runc`
processes — only the lightweight shims persist. On Linux the components are separate
binaries: `dockerd`, `docker-containerd`, `docker-containerd-shim`, `docker-runc`, visible with
`ps` on the host.

## Image internals: manifests, layers, content-addressable storage

**What**: An image is not a monolithic blob. Since Docker 1.10, an image is a loose collection
of independent, immutable layers plus a config object that lists them. Each **layer** is
identified by a **content hash** (a cryptographic hash of the layer's actual content); the
**image** itself is identified by a content hash of its config object. A **manifest** is the
metadata document listing which layers (by digest) make up a given image; a **fat manifest**
(for multi-architecture repositories) lists which per-platform manifests exist for a tag.

**Why**: Content-addressable identifiers (a hash of content, rather than a randomly assigned
ID) give two guarantees a random ID cannot: (1) tamper-evidence — changing any byte of a layer
or the config changes its hash, so a corrupted or tampered layer is immediately detectable;
(2) natural deduplication — if two images share a layer (e.g., both `FROM node:20`), the
shared layer has the same digest in both, so `docker pull` only downloads it once regardless
of how many images reference it, and the local `/var/lib/docker/<storage-driver>` blob store
only stores it once.

**How**: When you `docker image pull ubuntu:latest`, the Docker client resolves `ubuntu:latest`
against the registry's Registry API. If the repository serves multi-architecture images, a fat
manifest is fetched first and parsed to find the entry matching the local platform
(e.g., `linux/amd64`); the image manifest for that platform is then fetched and parsed for its
list of layer digests. Each layer digest is checked against the local blob store — layers
already present (matching digest) are skipped ("Already exists" in `docker pull` output);
only missing layers are downloaded. Because compressing a layer for network transfer changes
its bytes (and therefore its content hash), each layer actually carries two hashes: a
**content hash** of the uncompressed content (used for the stable layer/image ID) and a
**distribution hash** of the compressed transfer form (used to verify the layer arrived intact
over the wire). You can pin an exact image by digest instead of a mutable tag —
`docker image pull alpine@sha256:c0537...` — which guarantees you get exactly that content
regardless of what the `latest` (or any other) tag is later repointed to. This also matters for
Dockerfile `FROM` lines: `FROM debian@sha256:...` pins the base image content itself, not just
a tag that can silently move.

```bash
docker image ls --digests alpine     # shows the content digest alongside the mutable tag
docker image pull alpine@sha256:c0537ff6a5218...   # pull by immutable content digest
```

## Linux security technologies Docker builds on

Docker on Linux is built directly on five kernel/OS security mechanisms; Docker supplies
sensible defaults for all of them but every one is configurable.

- **Namespaces** — provide *isolation* (what a process can see). Docker uses six: **pid**
  (isolated process tree — a container can have its own PID 1 and cannot see the host's or
  other containers' processes), **net** (isolated network stack: interfaces, IP addresses, port
  ranges, routing tables — every container gets its own `eth0`), **mnt** (isolated root
  filesystem — a container's `/etc`, `/var`, `/dev` are private), **ipc** (isolated shared-memory
  segments, semaphores, message queues), **user** (maps a container's root user to an
  unprivileged host user — optional, still maturing at time of writing), **uts** (isolated
  hostname). A container *is*, mechanically, an organized collection of these namespaces plus
  a cgroup — there is no separate "container" kernel object.
- **Control groups (cgroups)** — provide *limits* (how much a process can consume), not
  isolation. They cap CPU, memory, and disk I/O per container so no single container can
  starve the others of shared host resources.
- **Capabilities** — split the Linux root account's monolithic power into ~40 discrete
  privileges (`CAP_CHOWN`, `CAP_NET_BIND_SERVICE`, `CAP_SETUID`, `CAP_SYS_BOOT`, etc.), letting
  a container run *as* root but with most of root's power stripped. Docker's default policy is
  to drop a specific set of dangerous capabilities from every new container by default (see
  [docker-in-action.md](docker-in-action.md) for the exact default-dropped list) and disallow
  a container from re-adding a capability that was explicitly dropped.
- **Mandatory Access Control (MAC)** — Docker applies a default AppArmor profile (on
  distributions that support it) described by the Docker documentation as "moderately
  protective while providing wide application compatibility"; SELinux integration is also
  supported. Both can be customized or disabled per container.
- **seccomp** (secure computing mode) — Docker applies a default seccomp profile, in filter
  mode, to every new container, restricting which system calls (syscalls) the container's
  processes may make to the host kernel. This narrows the kernel attack surface a compromised
  container process can reach, independent of capabilities (a process can hold a capability and
  still be blocked from the syscall by seccomp).

**Why this combination matters**: namespaces alone only hide resources from a process — they
do not limit consumption (a namespaced process can still exhaust host memory) and do not
restrict privileged operations (a root process in a pid/net/mnt namespace is still root with
respect to the kernel unless capabilities/seccomp/MAC also constrain it). The four layers are
complementary, not redundant: namespaces isolate what is *visible*, cgroups bound what is
*consumable*, capabilities bound what *privileged operations* are permitted, and
seccomp/MAC bound what *kernel surface* is reachable at all.

## Docker platform security (Swarm-specific, native to Docker Engine)

Beyond the Linux-level primitives above, the Docker platform itself provides security features
with zero required configuration once Swarm mode is enabled: cryptographic node IDs, mutual
Transport Layer Security (TLS) authentication between all nodes, automatic certificate
authority (CA) configuration with automatic certificate rotation (default 90 days), an
encrypted cluster configuration store, and encrypted overlay networks. `docker swarm init` on
one node bootstraps all of this in a single command — that node becomes both the first manager
and the root CA. Joining additional managers or workers requires only the relevant join
token (`docker swarm join-token manager` / `worker`), a value with the format
`SWMTKN-<version>-<swarm-id-hash>-<token>` that must be kept secret since possessing it is
sufficient to join the cluster.

## Reference

Docker Deep Dive v4, Nigel Poulton, 2017 (191 pages). Covers Docker Engine internals, image
internals, container internals, Swarm mode, overlay networking, and Linux/platform security.
Command-reference material (image/container/network CRUD) is intentionally omitted here since
it duplicates [doc/Study.md](../../../../Study.md)'s Docker section, which already has it.
