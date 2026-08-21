# Oracle Certified Professional (OCP): Java SE 8 Programmer II (Exam 1Z0-809)

Source: Jeanne Boyarsky and Scott Selikoff, *OCP: Oracle Certified Professional Java SE 8 Programmer II Study Guide* (Sybex/Wiley, 2015, 723 pages). Sampled: full chapter outline (via PDF bookmarks — precise page map), the complete Design Patterns and Principles chapter (encapsulation/invariants, JavaBeans, is-a/has-a/composition, the four creational patterns: singleton, immutable object, builder, factory), and the Concurrency chapter's threading-problem section (liveness: deadlock/starvation/livelock, race conditions, exam-essentials summary).

This is the more advanced companion to the OCA guide (`oca-java-se8-programmer-1.md`) and covers material genuinely relevant to a senior backend Java role: design patterns, generics/collections internals, the Streams API in depth, concurrency, and I/O. This file focuses on the two chapters sampled in most depth (Design Patterns and Concurrency) since they translate most directly into daily engineering judgment; the remaining chapters (Advanced Class Design, Generics/Collections, Functional Programming, Dates/Strings/Localization, Exceptions/Assertions, I/O, NIO.2, JDBC) are listed below by scope only.

## Chapter Map (10 chapters, exam 1Z0-809)

1. Advanced Class Design — `instanceof`, virtual method invocation, `@Override`, `equals`/`hashCode`/`toString` contracts, enums, nested/inner/local/anonymous classes.
2. **Design Patterns and Principles** (sampled in depth below).
3. Generics and Collections — generic classes/interfaces/methods, bounded type parameters, `List`/`Set`/`Map`/`Queue`, `Comparable` vs. `Comparator`, Java 8 collection additions.
4. Functional Programming — built-in functional interfaces (`Supplier`, `Consumer`/`BiConsumer`, `Predicate`/`BiPredicate`, `Function`/`BiFunction`, `UnaryOperator`/`BinaryOperator`), `Optional`, the Streams API (sources, intermediate/terminal operations, primitive streams, collectors).
5. Dates, Strings, and Localization — `java.time` deep dive, `Locale`, resource bundles, number/date formatting.
6. Exceptions and Assertions — multi-catch, try-with-resources internals (`AutoCloseable`, suppressed exceptions), assertions.
7. **Concurrency** (sampled in depth below).
8. I/O — `java.io` streams (byte/character), object serialization.
9. NIO.2 — `Path`/`Files`, file attributes, directory walking/searching with streams.
10. JDBC — connecting, `Statement`/`ResultSet`, `ResultSet` types/concurrency modes.

## Design Principles

### Encapsulation as Invariant Enforcement
The book frames encapsulation not just as "make fields private, add getters/setters" but specifically as the mechanism for preserving **class invariants** — properties that must always hold (e.g., "age is never negative," "species is never null/empty"). A class with public fields cannot guarantee any invariant, since any caller can assign an invalid value directly. Validating in setters (and in the constructor, by routing through the same setters) is what actually makes the invariant durable. This is a sharper framing than the usual "encapsulation is good practice" — it gives a concrete test: *can any invariant be violated by code outside this class?* If yes, encapsulation is incomplete.

A related point on API evolution: even a field with *no* validation rules today should still be encapsulated behind a getter/setter, because changing a public field to private later forces every caller to recompile; changing what happens inside an already-private field's setter does not.

### JavaBeans Naming Convention
- Properties are `private`.
- Getter for a non-boolean property: `getX()`.
- Getter for a `boolean` primitive property: `isX()` or `getX()` (both acceptable) — but for the `Boolean` **wrapper** type, only `getX()` is conventional (`isX()` is not standard for the boxed type). This distinction is a specific, easy-to-miss exam/code-review gotcha.
- Setter: `setX(value)`.

### Is-a vs. Has-a as Design Diagnostics
- **Is-a** (the inheritance/`instanceof` test): if `A` is-a `B`, every instance of `A` must be substitutable wherever a `B` is expected. Use this as a correctness check on an inheritance hierarchy, not just a starting design decision — the book's worked example: modeling `Tiger extends Pet` initially looks reasonable, but once a `Dog extends Pet` and `Pet` is framed as `Feline`, the hierarchy implies "a Dog is-a Feline," which is false. The fix is either separate hierarchies or converting `Pet` to an **interface** (Java's limited form of multiple inheritance) so `Cat`/`Dog`/`Tiger` can each independently be `Animal` and optionally `Pet`, without forcing a false is-a relationship.
- **Has-a** (the composition/field test): an object has-a member if it holds a reference to it, as a field. Under inheritance, a `protected`/`public` has-a relationship on a parent is inherited by every child — which can silently introduce an incorrect has-a relationship (the book's example: giving `Primate` a `protected Tail tail` field means every subclass, including `Chimpanzee`, "has-a" tail — but chimpanzees don't have tails in reality). **The fix is to push shared fields only as far up the hierarchy as they are universally true for every subtype**, not just "true for most subtypes so far."
- **Object composition** (building a class out of has-a references to other classes, delegating to them) is presented as a direct alternative to inheritance, useful specifically when the is-a test fails or a class needs behavior from two unrelated sources — Java's lack of multiple class inheritance is the practical reason composition matters so much in this language, versus languages that support multiple inheritance. Trade-off: composition promotes reuse and avoids inheriting a false is-a relationship, but requires manually re-exposing (delegating) every method you want callers to use — inheritance gives you `protected`/`public` members for free, composition does not.

## The Four Creational Design Patterns (OCP Exam Scope)

The exam only tests Singleton and Immutable Object in depth, but the book covers all four since they recur throughout the Java Application Programming Interface (API) and later chapters.

### Singleton
Structure: `private` constructor(s) (which implicitly makes the class effectively final — no subclass can call a private constructor via `super()`), a `private static` instance field, and a `public static getInstance()` accessor.

- **Eager instantiation**: instance created directly at the field declaration or in a `static` initializer block, at class-loading time. Can be marked `final` since it's created exactly once, deterministically.
- **Lazy instantiation**: instance created on first call to `getInstance()`. Saves memory/startup time if the singleton might never be used, at the cost of a first-access delay and — critically — **not thread-safe as written naively**: two threads can both observe `instance == null` and each construct their own object.
- **Thread-safe lazy singleton**: mark `getInstance()` `synchronized` — simple, correct, but pays a synchronization cost on *every* call forever, even after the instance already exists.
- **Double-checked locking**: check `instance == null` outside a `synchronized` block first, then re-check inside the block before constructing — synchronization overhead is paid only for the handful of calls that race during first construction, not for the (likely millions of) calls afterward. Requires the instance field to be declared `volatile` to prevent the Java Memory Model from allowing another thread to observe a partially-constructed object (a genuinely subtle, easy-to-get-wrong correctness detail even outside exam context).

### Immutable Object Pattern
Five-rule checklist for a defensibly immutable class:
1. Set all properties via the constructor.
2. Mark every instance variable `private` and `final`.
3. Provide no setters.
4. **Never expose direct references to mutable fields** — a getter that returns the internal `List`/`Map`/array directly lets a caller mutate "immutable" state through the back door (e.g., `getFavoriteFoods().clear()`). Either return an unmodifiable view (`Collections.unmodifiableList(...)`), a defensive copy, or expose only narrow accessor methods (count, get-by-index) instead of the raw collection.
5. **Prevent subclassing from re-introducing mutability** — mark the class (or all its methods) `final`, or make the constructor `private`/package-private and force construction through a factory, so a subclass can't hide a mutable field behind an overridden accessor.
6. (Implementation detail folded into rule 4/constructor discipline) Any mutable object passed *into* the constructor must be **defensively copied**, not stored by reference — otherwise the caller that originally constructed the argument retains a live handle into the "immutable" object's internal state and can mutate it after the fact.

"Modifying" an immutable object always means constructing a *new* instance that copies the old state plus the delta — this is exactly how `String` concatenation and `java.time` types (`LocalDate.plusDays()`, etc.) behave, and is the same mental model.

### Builder Pattern
Solves the "telescoping constructor" **anti-pattern** (a constructor that accumulates parameters one at a time across many small changes until it becomes unmanageable — a named example of an anti-pattern: "a common solution to a recurring problem that tends to produce unmanageable code over time"). A mutable builder object exposes chainable setter methods (each returning `this`) and a final `build()` method that constructs the (often immutable) target object. Particularly necessary for immutable target classes, since they have no setters to configure incrementally after construction.

Trade-off called out explicitly: builder and target classes end up **tightly coupled** (the builder needs intimate knowledge of the target's constructor) — this tight coupling is accepted deliberately so that *callers* of the builder remain loosely coupled to the target's constructor signature, which can then grow without breaking client code. Builders are often packaged as a `static` inner class of the target class specifically so both evolve together.

### Factory Pattern
A `static` (usually) factory method that returns instances of a common supertype/interface, selecting the concrete subtype based on input parameters unknown until runtime. Purpose: **loose coupling** between the calling code and the concrete classes being instantiated — the caller only depends on the common abstraction (`Food`), never on `Hay`/`Pellets`/`Fish` directly, so adding a new subtype or changing selection rules requires no change to caller code. A secondary technique worth remembering: giving the concrete subclasses **package-private (default) constructors** forces all outside callers through the factory, without requiring `private` (which would exclude the factory itself if it isn't a nested class).

The chapter explicitly cites the *Design Patterns* "Gang of Four" book (Gamma, Helm, Johnson, Vlissides, Addison-Wesley, 1994) as the canonical source these four patterns (and many more) originate from — see `doc/references/Design Patterns/` for deeper coverage of the full catalog.

## Concurrency: Threading Problems (Liveness and Race Conditions)

**Liveness** is an application's ability to keep making progress in a timely manner; a liveness failure means some thread (or the whole application) is stuck. Three named failure modes:

- **Deadlock**: two or more threads each hold a resource the other needs and each wait forever for the other to release theirs — classic worked example: thread A locks `food` then tries to lock `water`; thread B locks `water` then tries to lock `food`; both block permanently. **Prevention, not cure**: once deadlocked, there's generally no recovery — the standard mitigation is enforcing a consistent global lock-acquisition order across all threads (e.g., "always lock food before water," no exceptions), which eliminates the circular-wait condition (the same Coffman-conditions logic covered from a systems angle in `doc/references/Interviews/cracking-the-coding-interview.md`).
- **Starvation**: a thread is perpetually denied access to a resource because other threads keep taking it first — the thread is alive and unblocked in principle, but never actually makes progress.
- **Livelock**: a special case of starvation where two or more threads *actively* respond to a perceived deadlock by releasing their locks and retrying — but do so in a way that repeats the same conflict indefinitely. Threads appear busy/responsive (unlike deadlock), which makes livelock notably harder to detect in practice than deadlock.

**Race conditions**: an undesirable outcome when operations meant to happen sequentially instead overlap in time. Worked example: two users concurrently registering the same username. The book ranks three possible system designs by desirability: (worst) both succeed, producing two accounts with the same username and unrecoverable ambiguity later; (acceptable) both fail, preserving data integrity but wasting both requests; (best) exactly one succeeds and the other gets a clear "already taken" error — preserves integrity *and* lets at least one request complete. General principle worth generalizing beyond this exam: **when a race condition can't be eliminated, prefer a design where it fails safely (rejecting one side) over one where it corrupts state**, and prefer "exactly one wins" over "everyone loses" when it's achievable without extra cost. Standard fix: synchronize on the specific shared resource/decision point (a monitor, or a singleton coordinating access), not the entire request path.

### Concurrency API Building Blocks (exam-essentials level)
- `Runnable` (no return value, cannot throw checked exceptions) vs. `Callable<V>` (returns a value, can throw a checked exception) — both are lambda-compatible functional interfaces.
- `ExecutorService`/`ScheduledExecutorService` abstract thread creation/pooling away from manual `new Thread(...)` management; `submit()` returns a `Future` for retrieving results/checking completion.
- Atomic classes (`AtomicInteger`, `AtomicLong`, etc.) provide lock-free thread-safe operations on single values — an alternative to `synchronized` for simple counters/accumulators.
- `synchronized` blocks/methods implement mutual exclusion via a monitor; two threads only actually exclude each other if they synchronize on the *same* object — synchronizing on different objects (or forgetting to synchronize a related read alongside a synchronized write) provides no protection at all, a common real-world bug.
- Concurrent collections (`ConcurrentHashMap`, `CopyOnWriteArrayList`, etc.) provide built-in thread safety with better throughput than externally-synchronized standard collections under contention; `CopyOnWriteArrayList` specifically rebuilds its entire backing array on every mutation — cheap reads, expensive writes, so it's suited to read-heavy/write-rare workloads only.
- Parallel streams can silently break assumptions that depend on encounter order, and operations like `reduce()`/`collect()` need an associative/stateless combining function to produce correct results under parallel execution — a frequent source of subtle bugs when a sequential stream is casually switched to `.parallel()` without auditing the pipeline for order-dependence or shared mutable state.
- The fork/join framework (`RecursiveTask`/`RecursiveAction`, `fork()`/`join()`) supports divide-and-conquer parallelism; `fork()` submits a subtask asynchronously while `join()` blocks for its result — calling `compute()` directly (instead of `fork()`) runs a subtask synchronously on the current thread instead of parallelizing it, a distinction the exam (and real profiling) cares about.

## Takeaways for a Senior Backend Java Developer

- The encapsulation-as-invariant-enforcement framing and the is-a/has-a diagnostic tests are genuinely useful design-review tools, not just exam trivia — "what invariant does this encapsulation actually protect" and "does this inheritance relationship hold for every subtype, not just the ones I've written so far" are good questions to ask in code review.
- The double-checked-locking singleton and the `volatile` requirement are a good concrete example to reach for when explaining why naive lazy initialization is unsafe under concurrency, and why `volatile` exists at all.
- The deadlock/starvation/livelock/race-condition vocabulary and the "fail safely rather than corrupt state" race-condition design principle are directly transferable to any distributed-systems or backend-concurrency discussion, not just single-JVM threading.
- This chapter's four-pattern subset (Singleton, Immutable, Builder, Factory) is the practical "20% you'll actually reach for" from the much larger Gang-of-Four catalog covered in `doc/references/Design Patterns/` — worth treating as the baseline fluency check before going deeper into that catalog.
