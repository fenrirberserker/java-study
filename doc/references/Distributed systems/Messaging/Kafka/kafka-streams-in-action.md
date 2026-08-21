# Kafka Streams in Action (Bill Bejeck, Manning)

The deepest of the four books on Kafka Streams specifically: the high-level Domain-Specific Language (DSL) (`KStream`/`KTable`), the lower-level Processor Application Programming Interface (API), windowing, testing, and an appendix dedicated to exactly-once semantics. Complements `doc/Study.md`'s existing `StreamsBuilder` example with the concepts needed to go beyond a basic word-count-style topology.

## KStream vs. KTable: event stream vs. update stream

**What**: A `KStream<K,V>` represents an unbounded sequence of independent events (every record matters, none supersede each other). A `KTable<K,V>` represents a changelog: each new record for a given key **replaces** the previous value for that key, so a `KTable` is conceptually the materialized, continuously-updated result of applying a stream of updates.

**Why**: Most real streaming logic needs both views of the same underlying log — the raw event sequence for triggering actions (fraud alert on this specific transaction) and the latest-state view for lookups and aggregation (this customer's *current* account balance). Kafka Streams' KStream/KTable duality is a direct application of the stream/table duality also covered from a storage-engine angle in `doc/references/System design/designing-data-intensive-applications.md`.

**How grouping/aggregation connects the two**: `KStream.groupByKey()`/`groupBy()` produces an intermediate `KGroupedStream` (never used directly — it exists purely to feed an aggregation). Calling `.reduce()`, `.aggregate()`, or `.count()` on it always yields a `KTable`, because aggregation output is inherently a per-key current-state view. `groupByKey()` should be preferred over `groupBy()` whenever the key doesn't need to change: `groupByKey()` keeps the "needs repartitioning" flag unset (no extra Kafka round-trip through a repartition topic), while `groupBy()` — used when you derive a new key — always forces repartitioning before the aggregation can proceed, since Kafka Streams needs all records for a key co-located on one partition/task.

**`reduce` vs. `aggregate`**: `reduce` combines two values of the *same* type (e.g., summing share volumes) and doesn't need an initializer. `aggregate` can produce a *different* output type from the input (e.g., building a running top-N `PriorityQueue` of `ShareVolume` objects from individual `ShareVolume` records) and requires an explicit initializer supplier plus separate "add" and "remove" functions — the "remove" function matters specifically for windowed aggregations, where an older record can fall out of a session window and needs to be subtracted back out.

## Windowing

**What**: Windowing groups aggregation results into fixed or activity-based time buckets instead of one running total since the beginning of time. Kafka Streams provides three window types, applied via `KGroupedStream.windowedBy(...)`, which return a `TimeWindowedKStream` (tumbling/hopping) or `SessionWindowedKStream` (session).

- **Tumbling windows** (`TimeWindows.of(size)`): fixed-size, non-overlapping, back-to-back buckets (e.g., a new 20-second window starts exactly when the previous one ends). Every record belongs to exactly one window.
- **Hopping/sliding windows** (`TimeWindows.of(size).advanceBy(advance)`): fixed-size windows that advance by an interval smaller than their size, so consecutive windows overlap and a single record can land in multiple windows. Use this when you want a smoothed/rolling metric (e.g., a 20-second window recomputed every 5 seconds) rather than a hard reset every period.
- **Session windows** (`SessionWindows.with(inactivityGap)`): *not* time-bound at all — a session is delimited purely by a gap of inactivity for a given key. Two records for the same key within the inactivity gap of each other get merged into one growing session (taking the earliest start and latest end across the merge); a record arriving after the gap starts a brand-new session. This models genuine user/entity activity bursts (e.g., a shopping session) rather than clock-aligned buckets.

**Why it matters mechanically**: window boundaries are computed from **timestamps embedded in the records**, not wall-clock processing time — late-arriving or out-of-order records are still assigned to the window their timestamp falls into (up to the window's retention period), which is what makes Kafka Streams' windowing usable for out-of-order, at-least-once-delivered input rather than requiring perfectly ordered arrival.

**How** (tumbling window count, illustrating the minimal code change between window types):

```java
KTable<Windowed<TransactionSummary>, Long> counts =
    builder.stream(STOCK_TRANSACTIONS_TOPIC, Consumed.with(stringSerde, transactionSerde))
        .groupBy((noKey, tx) -> TransactionSummary.from(tx),
                 Serialized.with(transactionKeySerde, transactionSerde))
        .windowedBy(TimeWindows.of(twentySeconds))   // swap for SessionWindows.with(...) or .advanceBy(...) — nothing else changes
        .count();
```

The result key type becomes `Windowed<K>`, which carries the window's start/end alongside the original key — necessary because the same logical key now has one entry per window instead of one entry overall.

## The Processor API: when the DSL isn't enough

**What**: A lower-level API (`Topology.addSource()`, `.addProcessor()`, `.addSink()`) for building a topology node-by-node with an imperative `Processor` implementation, instead of the fluent `KStream`/`KTable` DSL.

**Why**: The DSL controls *when* records move downstream (e.g., a `KTable` aggregation doesn't forward every single update). Some use cases need explicit control: scheduling periodic actions on a wall-clock or record-timestamp basis (`punctuate`), forwarding a record to only one of several possible downstream children based on custom logic, or implementing an operation the DSL simply doesn't expose (the book's example: a custom co-grouping processor). The trade-off mirrors Object-Relational Mapping (ORM) frameworks vs. raw Structured Query Language (SQL): the DSL is faster to write and covers most cases; the Processor API trades that convenience for full control.

**How**: nodes are named explicitly (the DSL auto-generates names; the Processor API requires you to because parent/child wiring is done by name):

```java
topology.addSource(LATEST, sourceNodeName, timestampExtractor,
                    keyDeserializer, valueDeserializer, sourceTopic)
        .addProcessor(processorNodeName, () -> new MyProcessor(), sourceNodeName);
```

The third argument to `addProcessor` is the parent node name, establishing the data-flow edge. Every call returns the same `Topology` instance (unlike the DSL, where each call returns a new `KStream`/`KTable`). The DSL and Processor API are not mutually exclusive — `KStream.process()`/`.transform()` let you drop into Processor API logic from within an otherwise-DSL topology.

## Exactly-once semantics in Kafka Streams (appendix)

**What**: Setting `StreamsConfig.PROCESSING_GUARANTEE_CONFIG` to `exactly_once` (the version available at the time of this book; current Kafka uses `exactly_once_v2` — see `kafka-the-definitive-guide.md` for the underlying transactional protocol this builds on) makes Kafka Streams handle every step of transactional read-process-write internally, without application code touching the transactional producer API directly.

**Why**: Kafka's base delivery guarantee (absent transactions) is at-least-once with `acks=all` and retries enabled, or at-most-once with retries disabled — a resent-but-already-persisted message causes a visible duplicate under at-least-once. For a stream processor doing aggregation or joins, a single duplicate input record corrupts the aggregate irrecoverably without reprocessing everything, so at-least-once isn't good enough once state accumulates across records.

**How, at the client level** (the underlying mechanism Kafka Streams automates): a `KafkaProducer` configured with a `transactional.id` calls `initTransactions()` once, then wraps each batch of sends in `beginTransaction()` / `commitTransaction()` (or `abortTransaction()` on failure):

```java
producer.initTransactions();
try {
    producer.beginTransaction();
    // ...send records...
    producer.commitTransaction();
} catch (ProducerFencedException | OutOfOrderSequenceException | AuthorizationException e) {
    producer.close();               // non-recoverable — must close
} catch (KafkaException e) {
    producer.abortTransaction();    // recoverable — abort and retry
}
```

On the consumer side, `isolation.level=read_committed` (default is `read_uncommitted`) makes the consumer skip records from transactions that were aborted or never committed — non-transactional records are always visible regardless of this setting. Kafka Streams sets this automatically when `processing.guarantee` is transactional.

## Testing Kafka Streams topologies without a live cluster

**What**: The `TopologyTestDriver` (named `ProcessorTopologyTestDriver` in the Kafka Streams version this book targets) drives a `Topology` in-process, feeding input records and reading output records without connecting to a real Kafka cluster or ZooKeeper.

**Why**: Spinning up a real broker per test is slow and couples unit tests to cluster availability; a topology built as a standalone factory method (`MyTopology.build()`) rather than inline in `main()` becomes trivially unit-testable this way.

**How**: instantiate the driver once with the built `Topology` and `StreamsConfig`, then per test call `pipeInput(...)` (or the older `process(topic, key, value, ...)`) to inject a record and `readOutput(topic, ...)` to assert on what came out — this validates the wiring and transformation logic of an entire topology (source → several processors → multiple sinks) with one input record, without mocking each processor individually.
