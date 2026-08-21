# Docker in Action (Jeff Nickoloff)

Distilled from the book's technical core: the mechanics of Linux namespace/cgroup/capability
isolation as Docker actually configures them, the union filesystem's copy-on-write mechanics,
and the four network container archetypes that explain what `docker run` networking flags
actually do at the kernel level. See [docker-deep-dive.md](docker-deep-dive.md) for the
`dockerd`/`containerd`/`runc` engine architecture and image manifest/digest internals, which
this book does not cover in comparable depth (published 2016, before that split matured).

## The union filesystem: how layered images work at the filesystem level

**What**: A Docker image's root filesystem is not a single filesystem — it is a **union
filesystem** (UnionFS-family driver; the modern default on Linux is `overlay2`) made of a
stack of independent, read-only layers, presented to processes as a single merged view. A
running container adds exactly one more layer on top: a **writable layer** unique to that
container.

**Why**: Representing an image as a stack of layers, rather than a flat filesystem image, is
what makes layer caching, layer sharing between images, and small incremental image updates
possible. Without it, every image change would require redistributing the entire filesystem;
with it, only the changed layer needs to be rebuilt, pushed, and pulled — the rest are already
shared/cached.

**How — copy-on-write and the read path**: When a container reads a file, the union filesystem
driver searches the layers **top-down**: the container's writable layer first, then each
read-only image layer in order, returning the file from the first layer where it is found. When
a container modifies a file that lives in one of the read-only layers below the writable layer,
the filesystem does **copy-on-write** (functionally copy-on-change): the entire file is copied
from the read-only layer up into the writable layer first, and the modification is then applied
to that copy — the original file in the read-only layer is untouched. This has two direct
consequences: (1) modifying a large file that exists in a lower layer is expensive relative to
modifying a small one, because the whole file is copied up regardless of how small the change
is — a key reason to design images so large files that need frequent changes aren't baked deep
into lower layers; (2) `mmap()` (memory-mapped file access) is difficult to implement correctly
against a copy-on-write union filesystem, which is a known weakness of the model.

**How — the write path and `docker diff`**: Every filesystem write inside a running container
lands in that container's writable top layer, recorded as one of three operation types visible
via `docker diff <container>`:
- `A` (added) — a new file that didn't exist in any lower layer.
- `C` (changed) — a file that existed in a lower layer, now shadowed by a modified copy in the
  writable layer (this is the copy-on-write path above). Changing a nested file also marks
  every parent directory in the path as `C`.
- `D` (deleted) — a **whiteout** record written to the writable layer that shadows/hides the
  file from the lower layers, without actually removing it from the read-only layer beneath
  (the read-only layer is immutable and cannot be edited in place).

```bash
docker run --name mod_ubuntu ubuntu:latest touch /mychange
docker diff mod_ubuntu
# A /mychange
docker run --name mod_busybox_delete busybox:latest rm /etc/profile
docker diff mod_busybox_delete
# C /etc
# D /etc/profile
```

`docker commit` saves exactly this writable top layer as a new, independently addressable
layer, generating a new content ID for it and stacking it as a new immutable layer for any
image built from that commit — this is the mechanical reason multi-stage/layered image builds
work the way they do.

## Kernel namespaces and cgroups, mechanism by mechanism

This book frames a container as an **eight-sided** isolation boundary — six Linux namespaces
plus cgroups plus capabilities acting together, and walks each one with runnable examples
(complementary to [docker-deep-dive.md](docker-deep-dive.md)'s higher-level namespace list):

- **PID namespace** — isolates the process tree; a container's process 1 cannot see host or
  sibling-container processes.
- **MNT namespace** — isolates the filesystem root via `chroot()`-style remapping.
- **NET namespace** — isolates network interfaces and routing.
- **UTS namespace** — isolates hostname/domain name.
- **USR namespace** — maps container user IDs to different host user IDs. At the time of this
  book's writing Docker had not yet integrated with the USR namespace: a container process
  running as host user ID 1000 has exactly the host user 1000's file permissions on anything it
  can reach (e.g., bind-mounted volumes) — there was no remapping. This is a concrete gap
  between namespace *isolation* and actual *permission* boundaries: namespaces hide, they do
  not by themselves re-authorize.
- **IPC namespace** — isolates shared-memory primitives (named shared-memory blocks,
  semaphores, message queues) so one container's shared-memory IPC is invisible to another.

**Cgroups mechanism (resource allowances, not authorization)**:
- **Memory**: `docker run --memory 256m` sets a hard ceiling, not a reservation — it does not
  guarantee 256 MB is available, only that the container cannot exceed it. Docker does not
  detect or gracefully handle out-of-memory conditions itself; the kernel's out-of-memory
  killer terminates the offending process, and only the container's `--restart` policy (if set)
  brings it back.
- **CPU — two independent controls**: (1) `--cpu-shares <int>` sets a *relative weight*, not an
  absolute limit — it only takes effect when there is CPU contention. A container is entitled to
  `its_shares / sum_of_all_running_containers_shares` of total CPU time when the CPU is
  saturated; if the CPU is idle, a container can burst past its share, because the goal is
  avoiding *waste*, not artificially throttling an uncontested process. Example: containers with
  1024 and 512 shares split contested CPU time roughly 66%/33%; adding a third container with
  2048 shares changes the split to roughly 57%/28%/14% of a now-larger total (3584). (2)
  `--cpuset-cpus 0,1` (or `0-2`) pins a container to specific physical CPU cores, which reduces
  costly context switching for latency-sensitive workloads by guaranteeing the process never
  migrates off its assigned cores.

## Linux capabilities: the exact default-dropped set

**What**: Capabilities split the monolithic power of the Linux root account into individually
grantable/revocable privileges. A gated syscall checks the calling process's capability set
before allowing the operation; lacking the capability, the syscall fails regardless of whether
the process is otherwise running as UID 0 (root).

**Why**: Running a container process as root is often operationally necessary (installing
packages at build time, binding to reserved low ports, etc.), but full root inside a container
is dangerous because a successful container-breakout exploit inherits every privilege the
process holds. Capabilities let an operator keep the convenience of `root` while stripping the
specific host-level powers that process does not need — least privilege without switching to a
non-root user.

**How**: Docker drops a specific, fixed set of capabilities from **every** new container by
default, on top of Linux's normal non-root restrictions:

| Capability | What it authorizes |
|---|---|
| `SETPCAP` | Modify another process's capability set |
| `SYS_MODULE` | Insert/remove kernel modules |
| `SYS_RAWIO` | Direct/raw access to kernel memory and I/O ports |
| `SYS_PACCT` | Configure process accounting |
| `SYS_NICE` | Modify the scheduling priority of other processes |
| `SYS_RESOURCE` | Override resource limits (`ulimit`-style ceilings) |
| `SYS_TIME` | Modify the system clock |
| `SYS_TTY_CONFIG` | Configure TTY devices |
| `AUDIT_WRITE` | Write to the kernel audit log |
| `AUDIT_CONTROL` | Configure the audit subsystem |
| `MAC_OVERRIDE` | Bypass Mandatory Access Control (MAC) policy |
| `MAC_ADMIN` | Reconfigure MAC policy |
| `SYSLOG` | Modify kernel `printk` (ring buffer log) behavior |
| `NET_ADMIN` | Reconfigure network interfaces/routing |
| `SYS_ADMIN` | Catch-all for a long list of administrative operations |

Further capabilities can be stripped with `--cap-drop <name>` or added back with
`--cap-add <name>` (unprefixed, lowercase — the `CAP_` prefix used in kernel documentation is
not accepted by the flag). Both flags are repeatable. `--privileged` is the opposite extreme: it
grants a container *all* capabilities plus access to all host devices, while still preserving
filesystem and network namespace isolation — used narrowly for administrative tasks like
running Docker-in-Docker, never for ordinary application workloads.

```bash
docker run --rm -u nobody ubuntu:latest --cap-drop net_raw \
  /bin/bash -c "capsh --print | grep net_raw"   # confirms NET_RAW is no longer available
docker run --rm -u nobody --cap-add sys_admin ubuntu:latest \
  /bin/bash -c "capsh --print | grep sys_admin"  # explicitly re-adds a capability Docker drops implicitly by omission
```

## Network container archetypes: what bridge networking actually builds

**What**: Every Docker container's networking falls into one of four archetypes, ordered from
most to least isolated: **closed** (`--net none`, loopback interface only, no route to any
other network — used for offline batch jobs or anything that must not reach the network at
all), **bridged** (the default — a private interface connected to the host via the `docker0`
virtual bridge), **joined** (`--net container:<name>`, shares another container's entire
network namespace/interfaces), and **open** (`--net host`, shares the host's network namespace
directly with no isolation).

**How bridged networking works mechanically**: Docker creates a **virtual Ethernet (veth)
pair** for each container — one end lives inside the container's network namespace as its
`eth0`, the other end is attached to the `docker0` Linux bridge in the host's network
namespace. All bridged containers' host-side veth ends attach to the same `docker0` bridge,
which is why they can address each other directly by IP without any extra configuration:
they're on the same virtual subnet. The *namespace itself does not provide network isolation
from the outside* — the host's firewall rules (present on every modern Linux distribution) are
what actually block or allow traffic in and out; the namespace only provides the container its
own private stack (interfaces, routes, ports).

**How port publishing (`-p`) works**: A bridged container is not reachable from outside the
host by default — there is no route from the host's external interface to a container's
interface. `docker run -p <hostPort>:<containerPort>` creates that route by programming a
port-forwarding rule into the host's firewall/NAT layer, mapping traffic that arrives on the
host's port to the container's private IP and port. Four forms of `-p` exist:
`<containerPort>` (dynamic host port, all host interfaces), `<hostPort>:<containerPort>` (fixed
host port, all interfaces), `<ip>::<containerPort>` (dynamic host port, one interface),
`<ip>:<hostPort>:<containerPort>` (fixed host port, one interface). `-P`/`--publish-all`
auto-publishes every port an image declares via `EXPOSE`, each to a dynamic host port —
`docker port <container>` reveals what those dynamic ports resolved to.

**How inter-container communication works, and how to lock it down**: By default, every
bridged container on the same `docker0` bridge can reach every other one directly (this is
demonstrable by scanning `172.17.0.0/24` for open ports from inside one container and finding
another's service). Disabling this — `dockerd --icc=false` — makes the host firewall block all
container-to-container traffic except where explicitly allowed (e.g., via `--link`), which is a
defense-in-depth best practice in any multi-tenant host, since it forces every real dependency
between containers to be an explicit, auditable declaration rather than ambient open access.

## Content-addressable image identifiers

Since Docker 1.6, an image reference can include an optional digest component — an `@sha256:…`
suffix instead of (or alongside) a mutable tag — called a content-addressable image identifier.
Because the digest is a hash of the actual layer content, pinning a `FROM` instruction to a
digest (`FROM debian@sha256:d5e87cfcb730...`) guarantees every build from that Dockerfile uses
byte-identical base content, regardless of how many times the tag `debian:jessie` is later
repointed at new content upstream. This closes a transparency gap: an image author who only
pins a tag has no guarantee the base they vetted is the base still being pulled.

## Reference

Docker in Action, Jeff Nickoloff, Manning, 2016 (306 pages). Covers container fundamentals,
volumes, single-host networking, resource/user/capability isolation, image/layer internals,
distribution (registries), Compose, and Machine/Swarm clustering (superseded material, not
distilled here — see [docker-deep-dive.md](docker-deep-dive.md) for current Swarm security).
