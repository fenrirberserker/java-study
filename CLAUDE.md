# CLAUDE.md

Guidance for Claude Code (and other agents) working in this repository.

## Project Context

This is a personal study repository for a backend Java developer preparing for senior-level roles. `doc/Study.md` is the primary, always-relevant study document (algorithms, data structures, Java, Spring, databases, system design, DevOps). `src/` contains small runnable Java examples referenced from `doc/Study.md`.

## Reference Library

`doc/references/` is a condensed knowledge base distilled from a personal technical book library (originally at `D:\IT\BOOKS`), organized by topic folder. Each file is a knowledge distillation (not a verbatim copy) of one book, written for a working backend Java developer — consult these when giving guidance that touches a topic below, or when `doc/Study.md` points to one for deeper detail.

**Excluded permanently**: Oracle Application Development Framework (ADF) material (`D:\IT\BOOKS\ADF\` and its exact duplicate `D:\IT\BOOKS\Legacy\`) is excluded from this library by explicit instruction and must not be reintroduced.

### Algorithms & Data Structures
- [algorithms-notes-for-professionals.md](doc/references/Algorithms%20&%20Data%20Structures/algorithms-notes-for-professionals.md) — Catalog of named algorithms beyond `doc/Study.md`'s core coverage: Dijkstra/Bellman-Ford/Floyd-Warshall/A* shortest paths, Prim's/Kruskal's minimum spanning trees, KMP/Rabin-Karp string matching, and specialized techniques (Catalan numbers, FFT, matrix exponentiation, online algorithms).
- [data-structures-and-algorithms-in-java.md](doc/references/Algorithms%20&%20Data%20Structures/data-structures-and-algorithms-in-java.md) — Goodrich/Tamassia/Goldwasser's academic textbook: balanced-tree rotation mechanics as a template-method example, JVM memory management (stack frames, heap allocation, mark-sweep garbage collection), and B-trees/external-memory data structures underlying database indexes.
- [fxtbook-algorithms-for-programmers.md](doc/references/Algorithms%20&%20Data%20Structures/fxtbook-algorithms-for-programmers.md) — Niche C/C++ numerical-algorithms reference; only the bit-manipulation chapter (popcount, power-of-two tests, bit-swap tricks) is broadly relevant to Java work.

### Big data
- [snowpark-for-dummies.md](doc/references/Big%20data/snowpark-for-dummies.md) — Snowflake's Snowpark platform: client libraries/server runtimes for running Python/Java/Scala next to data, UDFs vs. stored procedures, and the "compute to the data" architecture principle.

### Design Patterns
- [gang-of-four-design-patterns.md](doc/references/Design%20Patterns/gang-of-four-design-patterns.md) — The original 1994 catalog: the two foundational principles (program to an interface, favor composition over inheritance), the causes-of-redesign lookup table, and precise intents for all 23 classic patterns.
- [dive-into-design-patterns.md](doc/references/Design%20Patterns/dive-into-design-patterns.md) — Refactoring.Guru's modern treatment; its standout addition is a full, precise SOLID principles chapter (especially a checkable Liskov Substitution Principle rule list).
- [head-first-design-patterns.md](doc/references/Design%20Patterns/head-first-design-patterns.md) — Teaches the same catalog through memorable worked scenarios (SimUDuck, Starbuzz Coffee, pizza store, gumball machine); a design-principle checklist and a State-vs-Strategy disambiguation guide.

### Devops/Containers/Docker
- [docker-deep-dive.md](doc/references/Devops/Containers/Docker/docker-deep-dive.md) — The Docker Engine's internal architecture (`dockerd` → `containerd` → `containerd-shim` → `runc`, and the Open Container Initiative specs that chain implements), image manifest/content-addressable-digest internals, and the five Linux security technologies (namespaces, cgroups, capabilities, Mandatory Access Control, seccomp) Docker builds on.
- [docker-in-action.md](doc/references/Devops/Containers/Docker/docker-in-action.md) — Mechanism-level depth on union-filesystem copy-on-write, the exact default-dropped Linux capabilities list, CPU-shares/cpuset resource-limiting internals, and the four network container archetypes explaining how bridge networking/port publishing actually work.

### Devops/Orchestrators/Kubernetes
- [kubernetes-up-and-running.md](doc/references/Devops/Orchestrators/Kubernetes/kubernetes-up-and-running.md) — The reconciliation-loop pattern behind every controller, Custom Resource Definitions and the Operator pattern, validating/mutating admission webhook wire mechanics, and Role-Based Access Control internals (verb-to-HTTP-method mapping, built-in ClusterRoles, `can-i`/`reconcile`, ClusterRole aggregation).
- [the-complete-kubernetes-guide.md](doc/references/Devops/Orchestrators/Kubernetes/the-complete-kubernetes-guide.md) — Control-plane architecture (etcd, API server, scheduler, kubelet), the Container Runtime Interface and Container Network Interface plugin contracts, the API request security chain (authentication → authorization → admission), kube-proxy's iptables mechanics, NetworkPolicy enforcement, and the sidecar/ambassador/adapter multi-container patterns.

### Distributed systems/Messaging/Kafka
- [apache-kafka.md](doc/references/Distributed%20systems/Messaging/Kafka/apache-kafka.md) — Historical reference only (Kafka 0.7.x/0.8, 2013, ZooKeeper-only era, pre-Connect/pre-Streams); kept for the origins of MirrorMaker, leader/ISR election, and the Camus-style Hadoop pipelines Kafka Connect later replaced.
- [kafka-in-action.md](doc/references/Distributed%20systems/Messaging/Kafka/kafka-in-action.md) — Operational depth: broker/controller/ISR internals, consumer group rebalancing mechanics, log compaction cleaning internals, an introductory Kafka Connect walkthrough, and the deepest security coverage of the four books (TLS, SASL/Kerberos, ACLs, quotas).
- [kafka-streams-in-action.md](doc/references/Distributed%20systems/Messaging/Kafka/kafka-streams-in-action.md) — KStream/KTable duality, all three windowing types (tumbling/hopping/session) with worked code, the Processor API vs. DSL trade-off, exactly-once semantics at the transactional-producer level, and topology unit testing with `TopologyTestDriver`.
- [kafka-the-definitive-guide.md](doc/references/Distributed%20systems/Messaging/Kafka/kafka-the-definitive-guide.md) — The authoritative source: KRaft vs. legacy ZooKeeper controller election, the idempotent producer and the transactional two-phase-commit-like protocol in full mechanical detail, consumer poll-loop internals (`max.poll.interval.ms` vs. `max.poll.records`), and a full Kafka Connect architecture chapter.

### Interviews
- [cracking-the-coding-interview.md](doc/references/Interviews/cracking-the-coding-interview.md) — Interview process discipline: the five-step technical-question framework, the five algorithm-design approaches, and quick-reference knowledge-based trivia (Java, databases, threading, networking).
- [cracking-programming-interview-java-qa.md](doc/references/Interviews/cracking-programming-interview-java-qa.md) — Large but uneven Q&A dump; its one substantively useful section is a detailed Java exception-handling Q&A set (checked vs. unchecked, try-with-resources, multi-catch).
- [java-interview-questions-top-20.md](doc/references/Interviews/java-interview-questions-top-20.md) — Entry-level "learn to program" content mislabeled as interview prep; minimal unique value for a senior developer, kept for library completeness.

### Java
- [oca-java-se8-programmer-1.md](doc/references/Java/oca-java-se8-programmer-1.md) — Oracle Certified Associate (OCA) exam guide distilled to its exam-precise gotchas: method-overload resolution order, the four method-overriding compiler rules, casting/`ClassCastException` semantics, and initialization order.
- [ocp-java-se8-programmer-2.md](doc/references/Java/ocp-java-se8-programmer-2.md) — Oracle Certified Professional (OCP) exam guide's advanced chapters: the four creational design patterns as taught for the exam (including double-checked-locking Singleton), and concurrency liveness failures (deadlock/starvation/livelock/race conditions).
- [scjp-java-6-study-guide.md](doc/references/Java/scjp-java-6-study-guide.md) — Older (Java 6) certification guide; kept narrowly for its raw `wait()`/`notify()`/`notifyAll()` and `synchronized` mechanics, which the newer guides' `java.util.concurrent`-focused chapters skip.

### Spring
- [practical-guide-spring-boot-api-backend.md](doc/references/Spring/practical-guide-spring-boot-api-backend.md) — End-to-end Spring Boot REST API build: package-by-feature structure, OAuth2 password-grant flow, DTO/entity separation, Bean Validation (declarative and custom), Flyway migrations with Testcontainers, and Spring REST Docs.

### System design
- [designing-data-intensive-applications.md](doc/references/System%20design/designing-data-intensive-applications.md) — Martin Kleppmann's foundational text: LSM-tree/B-tree storage engine internals, replication/partitioning/transaction-isolation anomalies (including write skew), distributed-systems failure modes, linearizability/consensus, and a deep stream-processing chapter (log-based brokers, event sourcing, log compaction) — the primary source for this repo's expanded Kafka coverage.
- [system-design-interview-alex-xu.md](doc/references/System%20design/system-design-interview-alex-xu.md) — Alex Xu's interview guide; its standout chapters derive a Dynamo/Cassandra-style key-value store from scratch (quorum consensus, vector clocks, gossip protocol, Merkle trees, SSTable write/read path) and the Twitter Snowflake unique-ID-generator design.
- [grokking-system-design-interview.md](doc/references/System%20design/grokking-system-design-interview.md) — The seven-step system-design interview framework, a full distributed-systems glossary (consistent hashing, CAP theorem, long-polling/WebSockets/Server-Sent Events), and a worked rate-limiter algorithm progression (fixed window → exact sliding window → sliding window with counters).
- [software-architecture-patterns.md](doc/references/System%20design/software-architecture-patterns.md) — Mark Richards' concise comparison of five whole-system architecture patterns (Layered, Event-Driven, Microkernel, Microservices, Space-Based) scored against a consistent set of characteristics (agility, deployability, testability, performance, scalability).
