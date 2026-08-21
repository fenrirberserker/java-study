# Apache Kafka (Nishant Garg, Packt, 2013)

Historical reference only: covers Kafka 0.7.x/0.8, before the modern Java producer/consumer API (Kafka 0.9+), before Kafka Connect and Kafka Streams existed, and while Kafka still used a fully ZooKeeper-driven design (no Kafka Controller Quorum). Kept for library completeness and for the few concepts whose *origin* is clearer from this era; for anything about current Kafka, prefer `kafka-the-definitive-guide.md`, `kafka-in-action.md`, or `kafka-streams-in-action.md`.

## What was genuinely new about Kafka in this era

**What**: A distributed log-based publish/subscribe messaging system built at LinkedIn to replace ad hoc point-to-point feeds for activity-stream data (page views, clicks) and operational metrics (CPU, I/O, request timings).

**Why**: Existing Java Message Service (JMS) brokers didn't scale to LinkedIn's throughput and added operational overhead per consumer. Kafka's founding design goals were low-overhead persistence, high throughput for millions of messages, and a producer/consumer API simple enough for custom integrations.

**How (original design choices, most still true today)**:
- Messages are grouped into **message sets** before being written, amortizing network and disk I/O overhead per message.
- Data is written straight to the operating system's page cache rather than through an application-level buffer; the OS handles flushing to disk. This is still how Kafka achieves high write throughput.
- Unlike brokers that track per-consumer delivery state, Kafka brokers do not track what each consumer has read — the *consumer* tracks its own position (originally in ZooKeeper; today in the internal `__consumer_offsets` topic). This is the origin of Kafka's core "dumb broker, smart client" trade-off, and the reason a poorly written consumer can quietly reread the same messages.

## Cluster mirroring (predecessor to MirrorMaker 2 / geo-replication)

**What**: A separate `MirrorMaker` tool that consumes an entire source cluster and republishes every message to a target cluster, used for active/passive datacenter replication.

**Why**: Kafka has no built-in cross-cluster replication — replication is only within a cluster (see In-Sync Replicas). Cross-datacenter durability and disaster recovery require an external process.

**How**: MirrorMaker is a wrapped consumer group (reads from source) plus producer (writes to target), run as a standalone process between two clusters. This design — external process, not a broker feature — persists conceptually in MirrorMaker 2, though MM2 (built on Kafka Connect) adds topic renaming, offset translation, and active/active support that this 2013-era tool lacked entirely.

## Original leader/follower replication model

**What**: Each partition has *n* replicas and can tolerate *n-1* failures without losing the partition. One replica is the **lead replica** (today: leader replica); the rest are followers.

**Why**: Without replication, a single broker failure loses every partition it hosted. Replication is Kafka's core durability mechanism.

**How**: Followers register with ZooKeeper; the first to register after a leader failure becomes the new leader (a simpler, more failure-prone precursor to today's controller-driven leader election — see `kafka-the-definitive-guide.md` for the current KRaft-based mechanism). The book also documents Kafka's original **synchronous vs. asynchronous replication** distinction: synchronous mode has the leader wait for every follower acknowledgment before acking the producer (durable, higher latency); asynchronous mode acks the producer as soon as the leader's own log write succeeds (lower latency, risk of data loss on leader failure). This is the conceptual ancestor of the modern per-request `acks` producer setting (`acks=all` vs `acks=1`).

## Legacy consumer API split (superseded)

The book documents two consumer APIs that no longer exist in current Kafka: the **high-level consumer** (group-coordinated via ZooKeeper, no manual offset/partition control) and the **simple consumer** (manual partition/offset control, no group coordination). Kafka 0.9 replaced both with the single unified `KafkaConsumer` API that exposes both automatic group management and manual `assign()`/`seek()` control from one client — see `kafka-in-action.md` and `kafka-the-definitive-guide.md` for that model.

## Early data-pipeline integrations (predecessors to Kafka Connect)

**What**: Hand-rolled MapReduce-based bridges — a **Hadoop consumer** job that pulls Kafka data into HDFS, and **Camus** (LinkedIn's open-source Kafka-to-HDFS pipeline that auto-discovers topics/partitions from ZooKeeper and checkpoints offsets to HDFS after each job).

**Why**: Before Kafka Connect existed (introduced in Kafka 0.9, well after this book), every team wanting to move data between Kafka and an external system wrote its own producer/consumer glue code, duplicating serialization, offset management, and fault-tolerance logic.

**How this connects to today**: Kafka Connect (see `kafka-the-definitive-guide.md` and `kafka-in-action.md`) standardized exactly this pattern into a framework with pluggable source/sink connectors, replacing the need for bespoke tools like Camus.

## Operational tools worth knowing the origin of

- **Controlled shutdown**: a broker being taken down for maintenance proactively hands off leadership of its partitions to an in-sync replica, avoiding the availability gap of waiting for ZooKeeper to notice the broker is gone. The same behavior exists today via `controlled.shutdown.enable` (default `true`).
- **Preferred replica election**: a tool to rebalance partition leadership back to the "preferred" (first-listed) replica after leadership has drifted unevenly across brokers from failures/restarts — the ancestor of today's `kafka-leader-election.sh` and Cruise Control-style automated rebalancing.
- **Message compression** (GZIP/Snappy) was already batch-level (a whole message set compressed as one unit, decompressed lazily by the consumer) — this remains true in modern Kafka, which added LZ4 and Zstandard as further codec options.
