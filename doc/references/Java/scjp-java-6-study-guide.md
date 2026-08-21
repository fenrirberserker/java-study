# Sun Certified Programmer (SCJP) for Java 6 Study Guide (Exam 310-065)

Source: Kathy Sierra and Bert Bates, *SCJP Sun Certified Programmer for Java 6 Study Guide* (McGraw-Hill/Osborne, 890 pages). Sampled: full chapter/section outline (via PDF bookmarks), and a deep read of the Threads chapter's synchronization and thread-interaction sections (pages 766-789) covering the classic check-then-act race-condition example and the raw `wait()`/`notify()`/`notifyAll()` mechanism.

**Relationship to the other two Java certification guides in this folder**: SCJP 6 predates OCA/OCP 8 by several major Java versions (no lambdas, no Streams Application Programming Interface, or API, no `java.time`, no try-with-resources, no `java.util.concurrent` emphasis). Most of its chapters (Declarations/Access Control, Object Orientation, Assignments, Operators, Flow Control/Exceptions, Strings/I/O, Generics/Collections, Inner Classes, Development/`javac`/JAR) cover the same ground as `oca-java-se8-programmer-1.md` and `ocp-java-se8-programmer-2.md`, just against an older language baseline. This file does **not** re-derive that overlapping content. It focuses on the one chapter that is genuinely complementary rather than redundant: **Chapter 9, Threads**, which teaches Java's raw, low-level concurrency primitives (`synchronized`, `wait()`/`notify()`/`notifyAll()`, thread states) — material the OCP 8 guide's Concurrency chapter deliberately sidesteps in favor of the higher-level `java.util.concurrent` API (`ExecutorService`, atomic classes, concurrent collections). Understanding *both* layers matters: the high-level API is what you should reach for in production code, but the low-level primitives are what the high-level API is built on, and are still what you encounter when reading JDK source, debugging deadlocks, or working in codebases that predate `java.util.concurrent` maturity.

## The Canonical Check-Then-Act Race Condition (worked example worth remembering)

The book's `Account`/`Fred and Lucy` example is one of the clearest illustrations of a check-then-act race condition in circulation, worth having as a go-to explanation:

- Two threads share one `Account` object with a `withdraw(amount)` method and a `getBalance()` method.
- Each thread's withdrawal logic is a two-step sequence: **(1)** check `getBalance() >= amount`, **(2)** if so, call `withdraw(amount)`. Between steps 1 and 2, the thread simulates work by sleeping briefly.
- Because the check and the act are two separate, non-atomic operations, both threads can pass the check *before either has performed the withdrawal* — both then proceed to withdraw, overdrawing the account even though each individually "verified" sufficient balance first.
- **Fix**: mark the method containing both steps (`makeWithdrawal()`) `synchronized`. This forces the check-then-act sequence to be atomic with respect to other threads — once one thread enters the synchronized method, no other thread can enter *any* synchronized method on the same object instance until the first releases the lock.

This example generalizes directly to any "check availability, then commit" logic — inventory decrements, seat reservations, unique-username registration (the same category of problem the OCP guide's race-condition section frames from a web-request angle in `ocp-java-se8-programmer-2.md`). The lesson is the same at every level of the stack: **checking a condition and acting on it are two operations, and anything that can interleave between them is a race condition**, whether the interleaving is two JVM threads, two application server instances, or two database transactions.

## How Java Object Locking Works (mental model)

- **Every Java object has an intrinsic lock** (also called a monitor), which only becomes relevant when synchronized code touches that object.
- Entering a `synchronized` instance method acquires the lock on `this`; entering a `synchronized(obj) { }` block acquires the lock on `obj` explicitly, allowing finer-grained locking than "the whole method locks on `this`."
- **Only one thread can hold a given object's lock at a time.** Any other thread attempting to enter synchronized code guarded by the same lock blocks until the lock is released.
- Locking is per-object, not per-method — if a class has two separate `synchronized` methods, a thread inside one blocks other threads from entering *either* one (both are guarded by the same instance lock), not just the specific method it's in.
- **Static synchronized methods lock on the `Class` object**, not on any instance — meaning a static synchronized method and an instance synchronized method on the same object do *not* exclude each other, since they synchronize on two different locks (a subtle, easy-to-miss distinction worth double-checking whenever mixing static and instance synchronization on related data).

## `wait()` / `notify()` / `notifyAll()` — the Raw Signaling Mechanism

These are methods on `Object` (not `Thread`) because they operate on the object being used as a lock/monitor, not on the thread itself:

- **Must be called from within a synchronized context on the target object** — calling `wait()`/`notify()`/`notifyAll()` without holding that object's lock throws `IllegalMonitorStateException` (an unchecked exception, so the compiler won't catch the mistake).
- `wait()` releases the lock the calling thread currently holds on that object and suspends the thread until another thread calls `notify()`/`notifyAll()` on the same object — critically, the waiting thread needs to **re-acquire the lock** before it can resume executing past the `wait()` call, so it may still block briefly even after being notified if another thread currently holds the lock.
- `notify()` wakes **one** arbitrary waiting thread (no ordering guarantee which one, if multiple are waiting); `notifyAll()` wakes all of them, letting them re-contend for the lock. `notifyAll()` is the generally safer default when more than one thread might legitimately be waiting for different reasons, since `notify()` could accidentally wake the "wrong" thread and leave others waiting forever.
- This is the primitive mechanism behind producer/consumer coordination (the book's worked example: a "hardware" thread `wait()`s for machine instructions; an "operator" thread computes them and calls `notify()`) — conceptually the same shape as a modern `BlockingQueue` from `java.util.concurrent`, which is now the preferred, higher-level way to implement the same pattern without hand-rolling `wait()`/`notify()` correctly (getting this raw mechanism right — spurious wakeups, missed signals, lost notifications — is notoriously easy to get subtly wrong).

## Deadlock (low-level framing)

Consistent with the higher-level treatment in `ocp-java-se8-programmer-2.md`, the book demonstrates deadlock arising from two threads acquiring the same two locks in opposite order (reader thread locks `resourceA` then wants `resourceB`; writer thread locks `resourceB` then wants `resourceA`). Notably, the book stresses that such code **can run correctly the vast majority of the time** — the deadlock only manifests when the thread scheduler happens to interleave execution at exactly the wrong point — which is precisely what makes concurrency bugs of this kind so dangerous in production: passing tests and normal operation for a long time provide no assurance the code is actually race-free. The fix, as in the OCP treatment, is consistent lock-acquisition ordering across all threads.

## Chapters Not Re-Derived Here (scope only, redundant with OCA/OCP content)

- **Declarations and Access Control**: identifiers, JavaBeans conventions, access/non-access modifiers, constructors, enums — see `oca-java-se8-programmer-1.md`.
- **Object Orientation**: encapsulation, is-a/has-a, polymorphism, overriding/overloading, casting — see `oca-java-se8-programmer-1.md` and `ocp-java-se8-programmer-2.md` (which cover the same rules in Java 8 terms, unchanged in substance).
- **Assignments**: literals, pass-by-value semantics, arrays, autoboxing, garbage collection basics — largely unchanged fundamentals, covered at `oca-java-se8-programmer-1.md`.
- **Generics and Collections**: `equals()`/`hashCode()` contract, `List`/`Set`/`Map`/`Queue`, generic bounds — see `ocp-java-se8-programmer-2.md`'s Chapter 3 scope note; the `equals()`/`hashCode()` contract specifically (reflexive/symmetric/transitive/consistent, and "equal objects must have equal hash codes") is foundational and worth knowing cold regardless of source, but this book's treatment doesn't add anything beyond standard coverage.
- **Inner Classes**: member/local/anonymous/static nested classes — mechanically unchanged since Java 6, though anonymous inner classes are now frequently superseded by lambdas for single-method interfaces (see the Lambda coverage in `oca-java-se8-programmer-1.md` and `ocp-java-se8-programmer-2.md`).
- **Development**: `javac`/`java` command-line usage, JAR files, static imports — operationally unchanged basics.

## Takeaways for a Senior Backend Java Developer

- The Fred-and-Lucy check-then-act example is one of the most reusable teaching illustrations of a race condition available — worth keeping mentally on hand for onboarding or code review conversations about why "check then act" patterns need explicit synchronization even when they "look" safe.
- Knowing raw `wait()`/`notify()`/`notifyAll()` semantics (particularly the "must hold the lock" and "notify wakes an arbitrary thread" rules) is valuable less for writing new code with them directly — modern code should prefer `java.util.concurrent` primitives like `BlockingQueue`, `CountDownLatch`, or `CompletableFuture` — and more for correctly reading and debugging older or lower-level concurrent code, and for understanding what those higher-level utilities are abstracting away.
- The static-vs-instance synchronized method locking distinction (`Class` object vs. instance) is a genuine, still-relevant gotcha in any modern Java codebase that mixes static and instance synchronization on related shared state.
