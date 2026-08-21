# Kafka in Action (Dylan Scott, Manning)

Practitioner-focused book centered on running and operating a ZooKeeper-era Kafka cluster (no KRaft coverage — see `kafka-the-definitive-guide.md` for that). Its distinct value over the other three books here is operational depth: broker/controller internals, monitoring, and a full security walkthrough (Transport Layer Security (TLS), Simple Authentication and Security Layer (SASL)/Kerberos, Access Control Lists (ACLs), quotas).

## Broker, controller, and leader mechanics

**What**: In a cluster, exactly one broker acts as the **controller**, responsible for tracking partition/replica state, electing new leaders when a broker fails, and pushing leadership/In-Sync Replica (ISR) changes to every other broker.

**Why**: Leader election needs a single source of truth; without a controller, every broker would need to independently detect failures and race to elect leaders, risking split-brain.

**How**: The controller watches ZooKeeper for broker membership changes (this book predates KRaft). On a broker failure it picks a new leader from the partition's ISR list, persists the change to ZooKeeper, and broadcasts a `LeaderAndISR` update to all affected brokers. Three log files are useful for diagnosing controller/replication issues: `server.log` (startup errors, general broker activity), `controller.log` (only present on the controller broker; shows leadership decisions), and `state-change.log` (records every partition state transition the broker received from the controller). Avoid forcing unnecessary controller moves during rolling restarts — each move triggers a full metadata reload.

**ISR and unclean leader election**: A replica falls out of the In-Sync Replicas (ISR) list if it lags too far behind the leader; Kafka does **not** self-heal a lost replica back up to the configured replication factor automatically — that's an operational task (reassignment), not automatic like HDFS block re-replication. `unclean.leader.election.enable=true` allows the controller to elect a leader from *outside* the ISR when no in-sync replica is available, trading data loss for availability; it can be set per-topic to override the cluster-wide default. Default is `false` (favor durability) in modern Kafka.

## Consumer group coordination and rebalancing

**What**: The **GroupCoordinator** is the broker responsible for tracking offset commits and membership for a specific consumer group (a `(group, topic, partition)` triple maps to a specific committed offset).

**Why**: Consumers in the same `group.id` split partitions among themselves so each partition is read by at most one consumer per group at a time — this is what lets you scale consumption horizontally while still letting independent applications (different `group.id`) each get their own full copy of the stream.

**How**: A consumer that stops sending heartbeats (crash, or its poll loop takes longer than `max.poll.interval.ms` to return) is dropped from the group, triggering a rebalance that reassigns its partitions. `partition.assignment.strategy` controls how partitions are divided: `Range` (default; partitions per topic divided by consumer count in order — can concentrate extra partitions on the first-listed consumers across many topics), `RoundRobin` (evens out assignment across all subscribed topics), and `Sticky` (introduced 0.11.0; minimizes partition movement across a rebalance to speed recovery — the direct predecessor to the cooperative-sticky *protocol*, not just assignor, covered in `doc/Study.md`). During any rebalance, consumption pauses cluster-wide for the affected group, so rebalance frequency directly costs throughput. A `ConsumerRebalanceListener` lets application code hook `onPartitionsRevoked` (save state/offsets before losing a partition) and `onPartitionsAssigned` (e.g., `consumer.seek()` to a custom-stored offset) — useful when committing offsets to an external store instead of Kafka's own offset topic. For full manual control, `consumer.assign(List<TopicPartition>)` bypasses group coordination entirely (no rebalancing, no shared work) — appropriate only for single-consumer or externally-orchestrated partition ownership.

**Offset commit modes**: `enable.auto.commit=true` commits on a timer (`auto.commit.interval.ms`) regardless of whether processing actually finished — this yields at-most-once-leaning behavior since a crash between commit and completed processing loses the record. `enable.auto.commit=false` with manual `commitSync()` (blocking, simple) or `commitAsync(callback)` (non-blocking, needs a callback to observe failures) gives you at-least-once by committing only after processing succeeds, at the cost of possible duplicate reprocessing after a crash.

## Producer configuration depth

- **`acks`**: `0` = fire-and-forget (lowest latency, no durability guarantee, no retry); `1` = leader-only acknowledgment (durable against non-leader failures, but a message can be lost if the leader fails before followers replicate it); `all`/`-1` = leader waits for every ISR member (strongest durability, highest latency — bounded by the slowest in-sync replica).
- **Compression** (`compression.type`: `snappy`, `gzip`, `lz4`, `none`) operates at the **batch** level, not per-message — compressing a batch of small messages together is efficient; compressing isolated large messages individually is not, so compression benefit depends on message size and throughput.
- **Custom `Partitioner`**: implementing `Partitioner.partition(...)` lets you route specific keys to specific partitions deliberately (e.g., routing a `CRITICAL` alert level to its own partition so a downstream consumer can prioritize it) — the default behavior is round-robin for a null key, or `hash(key) % partitionCount` otherwise.
- **Custom `Serializer`**: implementing `Serializer<T>`/`Deserializer<T>` (jointly nicknamed a "Serde") lets producer and consumer agree on a wire format beyond the built-in `StringSerializer`/Avro serializers; key and value can use independent serializers on the same record.
- **Producer interceptors** (`interceptor.classes`, from KIP-42): hook into the send pipeline before partition assignment, primarily for cross-cutting measurement/monitoring rather than business logic — Kafka Streams internally uses this style of hook more heavily than application code typically should.

## Log compaction mechanics (beyond the what/why already in `doc/Study.md`)

**How compaction actually executes**: a compacted partition's log segments are either **clean** (already deduplicated — only the latest value per key remains) or **dirty** (not yet processed — may still hold multiple values for the same key). Compaction only ever runs on **inactive** segments; the currently-active (still being written) segment is never touched, so a consumer reading from the log can legitimately see more than one value for the same key until the active segment rolls over (`log.roll.hours`, commonly `24`). Deleting a key is done by producing a **tombstone**: a record with that key and a `null` value. The tombstone is retained (not immediately purged) for a configurable period so consumers that haven't yet seen it still observe the deletion — relevant for General Data Protection Regulation (GDPR)-style "right to be forgotten" requirements, where compaction plus tombstones is often the mechanism used to actually purge a customer's data from Kafka's log over time.

## Kafka Connect (introductory)

**What**: A framework (bundled with Kafka core, in the `connect` module) for moving data into and out of Kafka using pre-built or custom **connectors**, instead of hand-written producer/consumer code. **Source connectors** import data into Kafka (e.g., a database table → topic); **sink connectors** export data out of Kafka (e.g., topic → Elasticsearch index or Hadoop Distributed File System (HDFS)).

**Why**: Internally, `WorkerSourceTask` and `WorkerSinkTask` in Connect are themselves just a producer and a consumer respectively — Connect's value is standardizing the surrounding lifecycle (offset tracking, restart/retry, configuration, format conversion) that every hand-rolled pipeline had to reimplement. This makes Connect the direct successor to bespoke tools like Camus and Apache Flume for Kafka-adjacent data movement.

**How** (standalone mode, the simplest on-ramp): a worker config (`connect-standalone.properties`, common settings like `bootstrap.servers`, `key.converter`) plus a per-connector config file are passed to `connect-standalone.sh`. A file source connector config looks like:

```properties
name=local-file-source
connector.class=FileStreamSource
tasks.max=1
file=test.txt
topic=connect-test
```

**When to reach for Connect vs. hand-written clients**: if you don't control the source/sink system's code (a third-party database, Elasticsearch, S3) and a maintained connector already exists for it, Connect avoids reinventing offset management and fault tolerance. If you need custom in-flight business logic beyond simple transforms, a hand-written client or Kafka Streams is more appropriate — Connect's Single Message Transforms are meant for lightweight reshaping, not joins/aggregations.

**Change Data Capture (CDC) via Debezium**: a widely used source connector that reads a database's internal replication/operations log (e.g., MySQL binlog) and emits one Kafka event per row-level change (insert/update/delete), avoiding the inefficiency of polling the database for changes.

## Security (the deepest treatment among the four books)

- **Encryption in transit**: brokers can expose multiple `listeners` simultaneously (e.g., `PLAINTEXT://:9092,SSL://:9093`), letting you migrate clients to TLS without downtime. Each broker needs its own keystore (private key + signed certificate); clients need a truststore containing the Certificate Authority (CA) certificate. `security.inter.broker.protocol=SSL` separately controls broker-to-broker traffic.
- **Authentication**: SASL with Kerberos is the traditional enterprise option (common in Hadoop-adjacent shops already running a Kerberos Key Distribution Center), configured via a Java Authentication and Authorization Service (JAAS) login file specifying a keytab and principal per broker/client.
- **Authorization**: Kafka's `Authorizer` interface is pluggable; the built-in `SimpleAclAuthorizer` stores Access Control Lists (ACLs) in ZooKeeper and is managed via `kafka-acls.sh` (e.g., granting `Read`+`Write` on a topic to specific principals). Role-Based Access Control (RBAC) — grouping permissions into named roles instead of per-user ACL entries — was, at the time of this book, a Confluent Platform-only extension layered on top of ACLs, not open-source Kafka.
- **ZooKeeper hardening**: securing brokers is not enough if ZooKeeper itself is left open — `zookeeper.set.acl=true` plus a ZooKeeper-side JAAS/Kerberos setup prevents an attacker with ZooKeeper access from rewriting broker metadata or ACLs directly.
- **Quotas**: defined **per broker**, not cluster-wide (the cluster doesn't sum usage across brokers to enforce a global limit), and stored in ZooKeeper for near-instant propagation without a broker restart. Two independent quota types: **network bandwidth** (`producer_byte_rate` / `consumer_byte_rate`, bytes/sec per client) and **request rate** (`request_percentage`, caps the percentage of I/O+network thread capacity a client can consume — protects against CPU-heavy requests like SSL handshakes or aggressive `fetch.max.wait.ms=0` polling, which a bandwidth quota alone wouldn't catch). Quota precedence, highest first: user+`client.id` combination, then user alone, then `client.id` alone.
- **Data at rest**: Kafka does not encrypt log segments on disk by default; encryption at rest, when required, is typically handled at the filesystem/disk layer rather than by Kafka itself.
