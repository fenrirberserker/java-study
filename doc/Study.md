# 🎓 Study — Main Entry Point

Two levels, from general to specific:

1. **Study.md (this file)** — the index: what each area covers and why it matters.
2. **Area files** — one file per main topic, holding the full content with every sub-topic inside it:
   [⚙️ Backend](Backend.md) · [🌐 Frontend](Frontend.md) · [🔧 DevOps](DevOps.md) · [🤖 AI](AI.md)

Throughout the area files, a 💻 line links the concept to the runnable Java file under [src/](../src/) that demonstrates it with prints.

---

# ⚙️ Backend — [Backend.md](Backend.md)

The core of the stack: data structures and algorithms, the programming languages, the backend frameworks, persistence, security, and the architectural discipline to combine them into systems that survive production. The hierarchy below mirrors the structure inside [Backend.md](Backend.md) — indentation shows nesting.

| Topic | Summary |
|---|---|
| [📑 Data Structures](Backend.md#-data-structures) | Cost of every operation on lists, sets, maps, queues and trees — so you justify a choice instead of guessing |
| [📘 Algorithms](Backend.md#-algorithms) | The five paradigms (recursion, greedy, backtracking, graphs, dynamic programming) plus Big O, interview questions and code-challenge strategy |
| [💻 **Programming Languages**](Backend.md#-programming-languages) | The three that matter for a backend engineer, mapped onto concepts you already own |
| &nbsp;&nbsp;↳ [☕ Java](Backend.md#-java) | Memory and garbage collection, the OOP pillars, collections with HashMap internals, streams, Optional, modern Java 9–21 |
| &nbsp;&nbsp;&nbsp;&nbsp;↳ [🧵 Concurrency & Parallelism (deep dive)](Backend.md#-concurrency-and-parallelism) | Thread creation, locks, atomics, executors, CompletableFuture, coordination primitives, deadlocks |
| &nbsp;&nbsp;&nbsp;&nbsp;↳ [⚠️ Exceptions (deep dive)](Backend.md#-exceptions) | The Throwable hierarchy, checked vs unchecked, try-with-resources, chaining, custom exceptions |
| &nbsp;&nbsp;↳ [🟪 Kotlin](Backend.md#-kotlin) | Modern JVM language: full Java interop, null safety, data classes, coroutines — and how it maps to Java |
| &nbsp;&nbsp;↳ [🐍 Python](Backend.md#-python) | Dynamic typing, comprehensions, decorators, generators, the Global Interpreter Lock — the language of data and scripting |
| [🧩 **Frameworks**](Backend.md#-frameworks) | Spring vs the build-time challengers; same mental model, different wiring stage |
| &nbsp;&nbsp;↳ [🌱 Spring](Backend.md#-spring) | Inversion of control and dependency injection, bean lifecycle, the annotations, `@Transactional` proxying, MVC and WebFlux |
| &nbsp;&nbsp;↳ [⚡ Quarkus](Backend.md#-quarkus) | Kubernetes-native, build-time dependency injection, GraalVM native, Jakarta/MicroProfile |
| &nbsp;&nbsp;↳ [🚀 Micronaut](Backend.md#-micronaut) | Compile-time, reflection-free dependency injection; flat startup and memory as the codebase grows |
| [🗄️ Database](Backend.md#-database) | SQL (joins, window functions, indexes, isolation, locking), ORM with JPA/Hibernate, the N+1 problem, MongoDB |
| [🔒 Security](Backend.md#-security) | Authentication vs authorization, JWT, OAuth 2.0, single sign-on, role-based access, Spring Security, common attacks |
| [🏢 **System Design**](Backend.md#-system-design) | Availability and scalability principles, API design (REST, GraphQL, gRPC), SOLID |
| &nbsp;&nbsp;↳ [🎨 Design Patterns](Backend.md#design-patterns-each-with-its-spring-incarnation) | The GoF patterns, each with its Spring incarnation |
| &nbsp;&nbsp;↳ [🌐 Distributed Design Patterns](Backend.md#-distributed-design-patterns) | Microservices, resilience (circuit breaker, bulkhead), data (saga, outbox, CQRS) |
| &nbsp;&nbsp;&nbsp;&nbsp;↳ [📨 Messaging → Kafka](Backend.md#apache-kafka) | Partitions and ordering, consumer groups, delivery semantics, acknowledgements, Spring Kafka, Kafka vs RabbitMQ |
| [🧪 Testing](Backend.md#-testing) | JUnit and Mockito, the test pyramid, integration slices and Testcontainers, performance testing |
| [🔤 Data Formats](Backend.md#data-formats) | JSON, binary, Avro, Protocol Buffers — and what drives the choice |

---

# 🌐 Frontend — [Frontend.md](Frontend.md)

The client side, at working-knowledge level for a backend-leaning developer:
- **HTML5**: Semantic structure, media, web workers, local vs session storage
- **CSS**: The box model, selectors and specificity
- **JavaScript**: Scopes, closures, hoisting, callbacks, promises and async/await
- **TypeScript**: A statically typed superset transpiled to JavaScript — annotations, inference, union types
- **React**: Components, unidirectional props, state, and the core hooks (useState, useEffect, useContext, useRef)

---

# 🔧 DevOps — [DevOps.md](DevOps.md)

Everything between "the code compiles" and "the code serves traffic":
- **Software development lifecycle and Git**: From requirements to maintenance; merging strategies
- **Docker**: Images, containers, layered builds — including multi-stage builds and layered jars for Java
- **Kubernetes**: Pod → Deployment → Service → Ingress, probes wired to Spring Boot Actuator, resource limits and Java heap sizing in containers
- **Cloud**: The AWS service catalog, and the AWS → Azure mapping for transferring that knowledge
- **Infrastructure as Code and pipelines**: Terraform, Jenkins

---

# 🤖 AI — [AI.md](AI.md)

The newest area, structured as an outline to grow: large language model fundamentals (tokens, context windows, temperature), prompt engineering, Retrieval-Augmented Generation with embeddings and vector databases, agents and tool use (including the Model Context Protocol), the Java ecosystem (Spring AI, LangChain4j), and evaluation and safety practices.

---

*Entry point of the study documentation. Areas: [Backend](Backend.md) · [Frontend](Frontend.md) · [DevOps](DevOps.md) · [AI](AI.md).*
