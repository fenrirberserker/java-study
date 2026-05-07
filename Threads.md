# 🧵 Threads & Concurrency — A Java Study Guide

A focused, practical reference for **multithreading** and **concurrency** in
Java: how threads work, how to coordinate them safely, and which high-level
tools to reach for. Every section links to a runnable Java file under
`src/concepts/threads/<topic>/...`.

---

## 📑 Table of Contents

1. [Concepts & Vocabulary](#1-concepts--vocabulary)
2. [`extends Thread` vs `implements Runnable`](#2-extends-thread-vs-implements-runnable)
3. [Lambdas as Thread Tasks](#3-lambdas-as-thread-tasks)
4. [Creating Threads — three ways](#4-creating-threads--three-ways)
5. [Thread Lifecycle, Sleep, Join, Interrupt, Daemon](#5-thread-lifecycle-sleep-join-interrupt-daemon)
6. [Race Conditions](#6-race-conditions)
7. [`synchronized` — intrinsic locks](#7-synchronized--intrinsic-locks)
8. [Explicit Locks (`ReentrantLock`, `ReadWriteLock`)](#8-explicit-locks-reentrantlock-readwritelock)
9. [Atomic Variables](#9-atomic-variables)
10. [Concurrent Collections](#10-concurrent-collections)
11. [The Concurrent Application Programming Interface — `ExecutorService`, `Callable`, `Future`](#11-the-concurrent-application-programming-interface--executorservice-callable-future)
12. [Thread Communication — `wait` / `notify`, Producer-Consumer](#12-thread-communication--wait--notify-producer-consumer)
13. [`CompletableFuture`](#13-completablefuture)
14. [Coordination Primitives — `CountDownLatch`, `CyclicBarrier`, `Semaphore`, `Phaser`, `Exchanger`](#14-coordination-primitives--countdownlatch-cyclicbarrier-semaphore-phaser-exchanger)
15. [Deadlock, Livelock, Starvation](#15-deadlock-livelock-starvation)
16. [Code Challenges](#16-code-challenges)
17. [Cheat Sheet](#-cheat-sheet)

---

## 1. Concepts & Vocabulary

| Term | Meaning |
|---|---|
| **Process** | A program running on the operating system, with its own isolated memory and resources. Two processes cannot directly read each other's data. |
| **Thread** | A single line of execution living inside a process. Multiple threads of the same process share its memory, so they can collaborate — but also collide — on the same data. |
| **Concurrency** | Structuring a program so several tasks can be in progress during overlapping time windows. On a single processor core this is achieved by rapidly switching between them, giving the illusion of simultaneity. |
| **Parallelism** | Actually running multiple tasks at the same instant on different processor cores. Requires multi-core hardware; concurrency does not. |
| **Multithreading** | The technique of splitting a single program's work across several threads to achieve concurrency, parallelism, or both. |
| **Critical Section** | A region of code that touches data shared between threads and must therefore be executed by only one thread at a time to stay correct. |
| **Race Condition** | A bug whose outcome depends on the unpredictable order in which threads happen to run, so the program produces different (sometimes wrong) results across executions. |
| **Mutual Exclusion (mutex)** | A guarantee that, no matter how many threads compete, at most one of them is executing inside a given critical section at any moment. |
| **Atomic Operation** | An operation that completes as one indivisible step. Other threads can never observe it half-done — they see the state strictly before or strictly after. |
| **Visibility** | Whether the changes one thread makes to shared data are actually seen by other threads. Without proper synchronization, updates can remain trapped in a thread's local cache. |
| **Happens-Before** | A formal ordering rule from the Java Memory Model: when action A happens-before action B, A's effects are guaranteed to be visible and ordered before B across threads. |
| **Deadlock** | A frozen state in which two or more threads each hold a resource the other needs and none will release, so they wait on each other forever. |
| **Livelock** | A situation where threads stay active and keep reacting to each other, but their constant adjustments cancel out and no real progress is made. |
| **Starvation** | A condition in which a thread is repeatedly passed over for a resource or for processor time, so it never gets the chance to make progress. |
| **Daemon Thread** | A background-support thread that the Java Virtual Machine does not wait for at shutdown — once only daemon threads remain, the program exits immediately. |

---

## 2. `extends Thread` vs `implements Runnable`

Java offers two foundational ways to define what a thread does. The keyword
you use comes from how Java models them: `Thread` is a **class** (so you
`extends` it), while `Runnable` is an **interface** (so you `implements` it).

| | `extends Thread` | `implements Runnable` |
|---|---|---|
| What you write | Subclass of `Thread`, override `run()` | Class (or lambda) providing `run()` |
| Inheritance cost | Consumes your single-inheritance slot | Free — your class can still extend something else |
| Reusability | Tied to a specific `Thread` subclass | Same `Runnable` works with any `Thread` or any `Executor` |
| Separation of concerns | Mixes "what to run" with "how it runs" | Keeps the task separate from the thread that runs it |
| Idiomatic style | Rarely preferred | Preferred — also expressible as a lambda |

```java
// extends Thread — couples your task to the Thread class
class Worker extends Thread {
    @Override public void run() { doWork(); }
}
new Worker().start();

// implements Runnable — task is decoupled from the runner
class Task implements Runnable {
    @Override public void run() { doWork(); }
}
new Thread(new Task()).start();

// lambda Runnable — shortest form
new Thread(() -> doWork()).start();
```

**Rule of thumb:** prefer `implements Runnable` (or a lambda). A `Runnable`
can run on any `Thread`, on any `ExecutorService`, and your class stays
free to extend something else. For thread creation, `Callable<V>` is the
related interface used when the task must return a value or throw a checked
exception.

---

## 3. Lambdas as Thread Tasks

In multithreading code, a lambda is the most concise way to describe **the
work a thread should run**. Every concurrency entry point in Java accepts a
lambda directly as the task body, so you rarely need a named class just to
launch a thread.

```java
new Thread(() -> doWork()).start();                 // task for a raw thread
executor.submit(() -> compute());                   // task with a result
CompletableFuture.supplyAsync(() -> fetchData());   // task in an async pipeline
```

Each line above hands a thread (or worker pool) a small bundle of work to
execute. The lambda stands in for the thread's task; the runtime decides
which thread actually runs it.

---

## 4. Creating Threads — three ways

| Approach | Pros | Cons |
|---|---|---|
| `extends Thread` | Quick to write for a throwaway demo where the class will not extend anything else. | Spends the class's single inheritance slot and welds the task tightly to a specific `Thread` subclass. |
| `implements Runnable` | Cleanly separates the task from the runner — the same `Runnable` can run on any `Thread` or any `Executor`. | A few extra lines compared to a lambda for very small tasks. |
| Lambda (`Runnable`) | The shortest and most idiomatic form for inline work, ideal for one-liners and short bodies. | Becomes hard to read once the task grows; for non-trivial logic, promote it to a named class or method. |

```java
new Thread(() -> System.out.println("hi")).start();
```

📁 [src/concepts/threads/basics/ThreadBasics.java](src/concepts/threads/basics/ThreadBasics.java)

---

## 5. Thread Lifecycle, Sleep, Join, Interrupt, Daemon

A thread moves through a fixed set of states during its life:
`NEW → RUNNABLE → (BLOCKED | WAITING | TIMED_WAITING) → TERMINATED`.
It starts *new*, becomes *runnable* once `start()` is called, may briefly
become *blocked* (waiting for a lock), *waiting* (parked on `wait()` or
`join()`), or *timed-waiting* (parked with a deadline like `sleep`),
and finally *terminates* when its `run()` method returns.

**Lifecycle and execution control**

| Method | What it does |
|---|---|
| `start()` | Asks the operating system to launch a fresh thread that will run `run()` concurrently. A given thread can be started exactly once. |
| `run()` | The body of work the thread performs. Calling `run()` directly just executes the code on the **current** thread — it does not start a new one. |
| `Thread.sleep(ms)` | Pauses the calling thread for the requested number of milliseconds, parking it in `TIMED_WAITING`. The thread keeps any locks it already holds. |
| `Thread.yield()` | A hint to the scheduler that the current thread is willing to give up the CPU. Implementations may ignore it; do not rely on it for correctness. |
| `Thread.onSpinWait()` | A hint (since Java 9) that the current thread is in a busy-wait loop, allowing the JVM to insert CPU-friendly pauses. |
| `t.join()` / `t.join(ms)` | Blocks the calling thread until thread `t` has finished, optionally with a timeout. |

**Cancellation and the interrupted flag**

| Method | What it does |
|---|---|
| `t.interrupt()` | Sends a polite cancellation request by raising `t`'s interrupted flag. The target thread decides how — and whether — to respond. |
| `t.isInterrupted()` | Reads `t`'s interrupted flag without changing it. |
| `Thread.interrupted()` | Static: reads **and clears** the interrupted flag of the current thread. |

**Identity, naming, and state**

| Method | What it does |
|---|---|
| `Thread.currentThread()` | Returns a reference to the thread executing the call. |
| `getName()` / `setName(String)` | Reads or sets the thread's display name; helpful for logging and debugging. |
| `getId()` / `threadId()` (Java 19+) | Returns the thread's unique numeric identifier. |
| `getState()` | Returns the current `Thread.State` (NEW, RUNNABLE, …, TERMINATED). |
| `isAlive()` | True if the thread has been started and has not yet terminated. |
| `isVirtual()` (Java 21+) | True if the thread is a virtual thread rather than a platform thread. |

**Daemon, priority, and grouping**

| Method | What it does |
|---|---|
| `setDaemon(true)` / `isDaemon()` | Marks (or queries) whether the thread is a daemon. The Java Virtual Machine does not wait for daemon threads at shutdown. Must be set before `start()`. |
| `setPriority(int)` / `getPriority()` | Suggests a scheduling priority from 1 (lowest) to 10 (highest). The operating system is free to ignore it; never rely on priority for correctness. |
| `getThreadGroup()` | Returns the `ThreadGroup` the thread belongs to (mostly historical; rarely used in modern code). |
| `setUncaughtExceptionHandler(handler)` | Installs a handler that is invoked if the thread terminates because of an uncaught exception. |

**Static utilities and factories**

| Method | What it does |
|---|---|
| `Thread.activeCount()` / `Thread.enumerate(arr)` | Estimate or list the active threads in the current thread group. Diagnostic only. |
| `Thread.holdsLock(obj)` | True if the current thread holds the monitor of `obj`; useful in assertions. |
| `Thread.dumpStack()` | Prints the current thread's stack trace to standard error — debugging aid. |
| `Thread.ofPlatform()` (Java 21+) | Builder for a traditional platform thread, exposing `name`, `daemon`, `priority`, `group`, and `start(Runnable)`. |
| `Thread.ofVirtual()` (Java 21+) | Builder for a lightweight virtual thread; the same shape as `ofPlatform()`. |

Cooperative cancellation pattern:

```java
while (!Thread.currentThread().isInterrupted()) {
    // ... do work
}
```

When you catch `InterruptedException` and don't rethrow, **re-set** the flag:

```java
try { Thread.sleep(...); }
catch (InterruptedException e) { Thread.currentThread().interrupt(); }
```

📁 [src/concepts/threads/lifecycle/ThreadLifecycle.java](src/concepts/threads/lifecycle/ThreadLifecycle.java)

---

## 6. Race Conditions

A race condition appears whenever the program's correctness depends on
the exact order in which threads happen to run. Because thread scheduling
is decided by the operating system, that order is unpredictable, so the
same code can produce different results on different runs.

The textbook example is `counter++`. Although it looks like a single
statement, it really expands into three steps: **read** the current
value, **add one**, and **write** the new value back. Two threads can
both read the same starting value, both add one, and both write the same
result — silently losing one of the increments.

📁 [src/concepts/threads/synchronization/RaceConditionDemo.java](src/concepts/threads/synchronization/RaceConditionDemo.java)

The standard fixes (each covered in the sections that follow): wrap the
critical section in `synchronized`, use an explicit lock, swap the field
for an atomic variable, or hand data between threads through a concurrent
collection instead of sharing it directly.

---

## 7. `synchronized` — intrinsic locks

Every Java object carries an invisible **lock** (also called a *monitor*).
Only one thread at a time can hold a given object's lock. The
`synchronized` keyword automatically picks up that lock when a thread
enters the protected code and releases it when the thread leaves —
including when an exception is thrown — so you cannot forget to unlock.

That single mechanism delivers two guarantees at once:

- **Mutual exclusion** — no two threads execute the protected code at the same time, so shared state stays consistent.
- **Visibility** — every change a thread makes before releasing the lock is guaranteed to be observed by the next thread that acquires it, with no stale-cache surprises.

The keyword can be applied in three forms:

```java
public synchronized void m() { ... }      // locks "this"
public static synchronized void s() {...} // locks the Class object
synchronized (lockObject) { ... }         // locks any chosen object
```

**Best practice:** lock on a `private final Object` that is owned by the
class. If you lock on `this` or on the class itself, any unrelated piece
of code that synchronizes on the same object can interfere with — or even
deadlock — your locking strategy. A private dedicated lock object keeps
that strategy under your control.

📁 [src/concepts/threads/synchronization/SynchronizedExample.java](src/concepts/threads/synchronization/SynchronizedExample.java)

---

## 8. Explicit Locks (`ReentrantLock`, `ReadWriteLock`)

The `java.util.concurrent.locks` package offers explicit lock objects that
do everything `synchronized` does — and more. They cost a little more
discipline (you must release the lock yourself) but give you fine control
over how a thread waits, fails, or recovers.

**Interfaces in `java.util.concurrent.locks`**

| Type | Use |
|---|---|
| `Lock` | The general contract for explicit locks: `lock()`, `lockInterruptibly()`, `tryLock()`, `tryLock(t, unit)`, `unlock()`, and `newCondition()`. |
| `Condition` | A wait set associated with a `Lock`, used like `wait`/`notify` but with `await()`, `signal()`, and `signalAll()`. A single lock can host many independent conditions. |
| `ReadWriteLock` | A pair of cooperating locks (`readLock()` and `writeLock()`) so multiple readers can share access while writers stay exclusive. |

**Implementations**

| Class | Use |
|---|---|
| `ReentrantLock` | The standard general-purpose `Lock`. Reentrant — the same thread may acquire it multiple times — and supports an optional fair mode. |
| `ReentrantReadWriteLock` | The standard `ReadWriteLock` implementation. Both views are reentrant; supports lock downgrading (write → read) but not upgrading. |
| `StampedLock` | A high-performance lock with three modes — write, read, and **optimistic read**. Optimistic reads return a stamp that the caller validates afterward, allowing fully concurrent reads when there are no writers. Not reentrant. |
| `LockSupport` | Low-level utility for parking and unparking threads (`park`, `parkNanos`, `unpark`). Building block for custom synchronizers; rarely used directly in application code. |

**`synchronized` versus `ReentrantLock` at a glance**

| Feature | `synchronized` | `ReentrantLock` |
|---|---|---|
| Block-style | The lock is scoped automatically to the surrounding `synchronized` block. | Acquired and released manually with `lock()` / `unlock()`. |
| Try without blocking | Not supported — a thread must wait. | `tryLock()` returns immediately, succeeding or giving up so the thread can do something else. |
| Time-bounded wait | Not supported. | `tryLock(t, unit)` waits at most the given duration before giving up. |
| Interruptible while waiting | Not supported — a blocked thread cannot be interrupted. | `lockInterruptibly()` allows another thread to cancel the wait via `interrupt()`. |
| Fairness option | No guarantee about who gets the lock next. | Optional fair mode grants the lock in roughly first-come-first-served order. |
| Multiple condition queues | Only one implicit wait set per object. | `newCondition()` produces independent wait queues, so different threads can wait on different conditions on the same lock. |

**Always release the lock in `finally`.**

```java
lock.lock();
try { /* critical section */ }
finally { lock.unlock(); }
```

📁 [src/concepts/threads/locks/ReentrantLockExample.java](src/concepts/threads/locks/ReentrantLockExample.java)
📁 [src/concepts/threads/locks/ReadWriteLockExample.java](src/concepts/threads/locks/ReadWriteLockExample.java)
📁 [src/concepts/threads/locks/ConditionExample.java](src/concepts/threads/locks/ConditionExample.java)
📁 [src/concepts/threads/locks/StampedLockExample.java](src/concepts/threads/locks/StampedLockExample.java)

`ReadWriteLock` splits a lock into two cooperating views: any number of
threads can hold the **read** lock at the same time, but the **write**
lock is exclusive and blocks all readers and writers. It is ideal for
data structures that are read very often and updated only occasionally.

---

## 9. Atomic Variables

The classes in `java.util.concurrent.atomic` provide thread-safe updates
**without using any lock**. Internally they rely on the processor's
**Compare-And-Swap** instruction: read the current value, attempt to
replace it only if it has not changed in the meantime, and retry on
failure. For simple counters, flags, and reference swaps this is much
faster than acquiring a lock and never blocks the thread.

**Single-value atomics**

| Class | Use |
|---|---|
| `AtomicInteger` / `AtomicLong` / `AtomicBoolean` | Thread-safe holders for a single primitive value, with atomic increment, decrement, get-and-set, and compare-and-set operations. |
| `AtomicReference<T>` | An atomic slot for an object reference. Useful for swapping in immutable snapshots of state without locking. |

**Atomic arrays**

| Class | Use |
|---|---|
| `AtomicIntegerArray` / `AtomicLongArray` | Fixed-size arrays whose elements can each be updated atomically without locking the whole array. |
| `AtomicReferenceArray<T>` | Fixed-size array of object references with per-slot atomic get, set, and compare-and-set. |

**Tagged references** — defeat the *ABA problem*, where a value changes from A to B and back to A and a naive compare-and-set cannot tell.

| Class | Use |
|---|---|
| `AtomicMarkableReference<T>` | An atomic pair of a reference and a single boolean mark; useful for marking nodes as logically deleted in lock-free data structures. |
| `AtomicStampedReference<T>` | An atomic pair of a reference and an integer stamp; the stamp increments on each update so ABA changes are detectable. |

**Field updaters** — operate atomically on a `volatile` field of an existing object, without converting it into an `AtomicX` instance.

| Class | Use |
|---|---|
| `AtomicIntegerFieldUpdater<T>` | Atomic operations on a named `volatile int` field of a class `T`. |
| `AtomicLongFieldUpdater<T>` | Same for a `volatile long` field. |
| `AtomicReferenceFieldUpdater<T,V>` | Same for a `volatile` reference field of type `V`. |

**Accumulators and adders** — optimized for high-contention aggregation by spreading writes across internal cells.

| Class | Use |
|---|---|
| `LongAdder` / `DoubleAdder` | High-throughput counters built for many threads incrementing concurrently. They beat `AtomicLong` under heavy contention by spreading updates across internal cells and summing them on read. |
| `LongAccumulator` / `DoubleAccumulator` | Generalize the adders to any associative function (max, min, multiply, …). You supply the binary operator and the identity value. |

```java
AtomicInteger counter = new AtomicInteger(0);
counter.incrementAndGet();                         // atomic ++
counter.compareAndSet(0, 1);                       // CAS
```

📁 [src/concepts/threads/atomic/AtomicExample.java](src/concepts/threads/atomic/AtomicExample.java)

---

## 10. Concurrent Collections

Wrapping a regular collection with `Collections.synchronizedList(...)`
makes it safe but turns every access into a serialized chokepoint. The
concurrent collections in `java.util.concurrent` are purpose-built to
scale: each one is tuned for a specific access pattern. The full
inventory is grouped below by role.

**Core interfaces**

| Interface | Use |
|---|---|
| `ConcurrentMap` | The contract for thread-safe maps. Adds atomic compound operations like `putIfAbsent`, `replace`, and `compute`. |
| `ConcurrentNavigableMap` | A `ConcurrentMap` that is also sorted, supporting range views and floor/ceiling lookups. |
| `BlockingQueue` | A queue that coordinates producers and consumers: `put` blocks when the queue is full, `take` blocks when it is empty. The backbone of producer-consumer designs. |
| `BlockingDeque` | A double-ended `BlockingQueue` — both ends support blocking inserts and removes. |
| `TransferQueue` | A `BlockingQueue` whose producers can `transfer()` an element directly to a waiting consumer, blocking until one arrives. |

**Lists and sets**

| Collection | Use |
|---|---|
| `CopyOnWriteArrayList` | Optimized for read-heavy lists. Each modification copies the underlying array, so iteration is cheap and never throws `ConcurrentModificationException`. Best when writes are rare. |
| `CopyOnWriteArraySet` | Set built on `CopyOnWriteArrayList` — same trade-offs (cheap reads, expensive writes), useful for small sets that change rarely. |

**Maps**

| Collection | Use |
|---|---|
| `ConcurrentHashMap` | A thread-safe map with bucket-level locking, so reads and many writes can happen in parallel without locking the whole structure. |
| `ConcurrentSkipListMap` | The concurrent counterpart of `TreeMap`: a sorted map backed by a skip list, supporting concurrent reads and writes with `O(log n)` operations. |
| `ConcurrentSkipListSet` | The concurrent counterpart of `TreeSet`, backed by a `ConcurrentSkipListMap`. |

**Non-blocking queues and deques**

| Collection | Use |
|---|---|
| `ConcurrentLinkedQueue` | A non-blocking, unbounded first-in-first-out queue based on lock-free algorithms — fast under high contention. |
| `ConcurrentLinkedDeque` | A non-blocking, unbounded double-ended queue, also lock-free. Useful for work-stealing patterns. |

**Blocking queues and deques**

| Collection | Use |
|---|---|
| `ArrayBlockingQueue` | Bounded blocking queue backed by a fixed-size array. Provides natural backpressure: producers slow down when the buffer fills up. |
| `LinkedBlockingQueue` | Linked-node blocking queue, optionally bounded. High throughput when producers and consumers are roughly balanced. |
| `LinkedBlockingDeque` | Optionally-bounded blocking double-ended queue, the deque flavor of `LinkedBlockingQueue`. |
| `PriorityBlockingQueue` | Unbounded blocking queue that orders elements by priority instead of arrival order. |
| `SynchronousQueue` | A zero-capacity queue: every `put` waits for a matching `take` and vice versa, forcing a direct hand-off between threads. |
| `LinkedTransferQueue` | An unbounded `TransferQueue` that combines the throughput of `ConcurrentLinkedQueue` with optional blocking and direct hand-off via `transfer()`. |
| `DelayQueue` | An unbounded blocking queue of `Delayed` elements; an element only becomes available to `take()` once its delay has elapsed. Ideal for scheduled work. |

📁 [src/concepts/threads/concurrent/ConcurrentCollectionsExample.java](src/concepts/threads/concurrent/ConcurrentCollectionsExample.java)

---

## 11. The Concurrent Application Programming Interface — `ExecutorService`, `Callable`, `Future`

**`ExecutorService`** is a managed pool of reusable worker threads.
Instead of creating and destroying a `Thread` for every piece of work,
you submit tasks to the pool and let it schedule them across its
workers. This is almost always the right way to run concurrent work in
Java: it caps the number of threads, queues overflow tasks, and
integrates cleanly with `Future` for results.

**Core interfaces**

| Interface | Use |
|---|---|
| `Executor` | The minimal contract: a single `execute(Runnable)` method. Decouples task submission from how the task is run. |
| `ExecutorService` | Adds task lifecycle: `submit`, `invokeAll`, `invokeAny`, `shutdown`, `shutdownNow`, and `awaitTermination`. |
| `ScheduledExecutorService` | Extends `ExecutorService` with `schedule`, `scheduleAtFixedRate`, and `scheduleWithFixedDelay`. |
| `CompletionService<V>` | Decouples production from consumption of completed `Future`s — submit tasks here, then `take()` results in completion order. |

**Implementations**

| Class | Use |
|---|---|
| `ThreadPoolExecutor` | The configurable thread-pool implementation behind most `Executors` factories. Lets you set core/max pool sizes, keep-alive time, work queue, `ThreadFactory`, and rejection policy. |
| `ScheduledThreadPoolExecutor` | The configurable implementation behind the scheduled factories. |
| `ForkJoinPool` | A work-stealing pool optimized for divide-and-conquer tasks. Each worker has its own deque and steals from others when idle. Used by parallel streams via `commonPool()`. |
| `ExecutorCompletionService<V>` | The standard `CompletionService` implementation, wrapping any `Executor`. |

**Fork/Join task types**

| Class | Use |
|---|---|
| `ForkJoinTask<V>` | The base task type for `ForkJoinPool`, supporting `fork()` and `join()` for recursive decomposition. |
| `RecursiveTask<V>` | A `ForkJoinTask` that returns a value — extend it for divide-and-conquer computations. |
| `RecursiveAction` | A `ForkJoinTask` with no return value, for side-effecting recursive work. |
| `CountedCompleter<T>` | A `ForkJoinTask` that completes only after a tracked count of pending sub-tasks reaches zero. |

**Helper interfaces**

| Type | Use |
|---|---|
| `ThreadFactory` | Controls how a pool creates its worker threads (naming, daemon flag, priority, exception handler). |
| `RejectedExecutionHandler` | Decides what happens when a task is submitted to a pool that cannot accept it: `AbortPolicy` (default), `CallerRunsPolicy`, `DiscardPolicy`, `DiscardOldestPolicy`. |

**Factories in `java.util.concurrent.Executors`**

| Factory | Behavior |
|---|---|
| `newFixedThreadPool(n)` | Keeps exactly `n` worker threads alive. Extra tasks wait in an unbounded queue until a worker is free. |
| `newCachedThreadPool()` | Creates new threads on demand and reaps idle ones after 60 seconds. Ideal for bursty, short-lived tasks. |
| `newSingleThreadExecutor()` | A single worker that processes tasks strictly in submission order. Useful for serializing work off the calling thread. |
| `newWorkStealingPool(parallelism)` | Returns a `ForkJoinPool` configured for the given parallelism level. Best for recursive or fan-out workloads. |
| `newScheduledThreadPool(n)` | A pool that can run tasks after a delay or repeatedly at a fixed rate or fixed delay. |
| `newSingleThreadScheduledExecutor()` | The single-threaded version of `newScheduledThreadPool`. |
| `newThreadPerTaskExecutor(threadFactory)` | Java 21+: starts a brand-new thread per task using the given factory — pair with `Thread.ofVirtual().factory()` for cheap virtual threads. |
| `newVirtualThreadPerTaskExecutor()` | Java 21+: shorthand for the above using the default virtual-thread factory. Ideal when you have huge numbers of tasks that mostly block on I/O. |

**`Runnable` vs `Callable<V>`:** both describe a unit of work. A `Runnable`
returns nothing and cannot throw checked exceptions; a `Callable<V>`
returns a value of type `V` and may throw any exception, which is what
you submit when you actually need a result back.

```java
Runnable    r = () -> { ... };                      // void run(),       no checked throws
Callable<V> c = () -> { return v; };                // V call() throws Exception
```

**`Future<V>`** represents the eventual result of a submitted task. You
can ask whether it is done, block waiting for the value, fetch the
result, or cancel the task before it finishes:

```java
Future<Integer> f = pool.submit(() -> 2 + 2);
Integer result = f.get();                           // blocks until done
```

Lifecycle:

```java
ExecutorService pool = Executors.newFixedThreadPool(4);
pool.submit(task);
pool.shutdown();                                    // no more tasks
pool.awaitTermination(5, TimeUnit.SECONDS);
```

📁 [src/concepts/threads/executors/ExecutorServiceExample.java](src/concepts/threads/executors/ExecutorServiceExample.java)
📁 [src/concepts/threads/executors/CallableFutureExample.java](src/concepts/threads/executors/CallableFutureExample.java)
📁 [src/concepts/threads/executors/ScheduledExecutorExample.java](src/concepts/threads/executors/ScheduledExecutorExample.java)
📁 [src/concepts/threads/executors/ForkJoinExample.java](src/concepts/threads/executors/ForkJoinExample.java)
📁 [src/concepts/threads/executors/VirtualThreadsExample.java](src/concepts/threads/executors/VirtualThreadsExample.java)

---

## 12. Thread Communication — `wait` / `notify`, Producer-Consumer

`wait()`, `notify()`, and `notifyAll()` are the original way Java threads
talk to each other. They live on `Object` itself — every object can act
as a condition variable — and may only be invoked by a thread that
already holds that object's lock, so the calls always appear inside a
`synchronized` block.

- `wait()` releases the lock and parks the calling thread until another thread signals it.
- `notify()` wakes one of the threads waiting on the same object; `notifyAll()` wakes them all so they can re-check the condition and one will proceed.

```java
synchronized (lock) {
    while (!condition) lock.wait();    // ALWAYS while-loop, not if
    // ...
}
synchronized (lock) {
    condition = true;
    lock.notifyAll();
}
```

Always re-check the condition inside a `while` loop, not an `if`. A
thread can wake up *spuriously* (with no notification at all) or because
several waiters were notified at once and another one already consumed
the signal — looping ensures the thread only proceeds when the condition
is genuinely true.

📁 [src/concepts/threads/communication/WaitNotifyExample.java](src/concepts/threads/communication/WaitNotifyExample.java)

For producer-consumer designs, prefer a `BlockingQueue` over hand-written
`wait`/`notify` code. The queue takes care of all the synchronization,
parking, and signaling for you, and it is much harder to get wrong:

📁 [src/concepts/threads/communication/ProducerConsumerExample.java](src/concepts/threads/communication/ProducerConsumerExample.java)

---

## 13. `CompletableFuture`

A `CompletableFuture` is a `Future` you can build pipelines on top of.
Instead of blocking with `get()` and orchestrating threads yourself, you
**describe what should happen next** once a result arrives —
transformations, side effects, error recovery, or combinations of
several futures — and the runtime stitches the stages together,
running each one when its inputs are ready.

**Creation**

| Method | Purpose |
|---|---|
| `supplyAsync(Supplier)` | Start an asynchronous computation that produces a value when it finishes. |
| `supplyAsync(Supplier, Executor)` | Same, but run the work on a specific executor instead of the common pool. |
| `runAsync(Runnable)` / `runAsync(Runnable, Executor)` | Start an asynchronous action that performs side effects but has no result. |
| `completedFuture(value)` | Create a future that is already successfully completed with the given value. |
| `failedFuture(throwable)` | Create a future that is already completed exceptionally with the given throwable. |

**Chaining a single stage** — synchronous variants run on the thread that completes the previous stage; `Async` variants hop to the common pool (or to an explicit `Executor`).

| Method | Purpose |
|---|---|
| `thenApply(Function)` / `thenApplyAsync(Function[, Executor])` | Transform the previous result into a new value. |
| `thenAccept(Consumer)` / `thenAcceptAsync(Consumer[, Executor])` | Consume the previous result for its side effect, with no further value. |
| `thenRun(Runnable)` / `thenRunAsync(Runnable[, Executor])` | Run an action after the previous stage completes, ignoring its result. |
| `thenCompose(Function)` / `thenComposeAsync(...)` | Chain another future after this one, flattening `CompletableFuture<CompletableFuture<X>>` into `CompletableFuture<X>`. |

**Combining two stages**

| Method | Purpose |
|---|---|
| `thenCombine(other, BiFn)` / `thenCombineAsync(...)` | Wait until both this future and another have completed, then merge their results. |
| `runAfterBoth(other, Runnable)` / `runAfterBothAsync(...)` | Run an action after both futures complete; the values are ignored. |
| `applyToEither(other, Fn)` / `applyToEitherAsync(...)` | Take the result of whichever of the two completes first and transform it. |
| `acceptEither(other, Consumer)` / `acceptEitherAsync(...)` | Consume the result of whichever completes first. |
| `runAfterEither(other, Runnable)` / `runAfterEitherAsync(...)` | Run an action once either of the two futures completes. |

**Combining many stages**

| Method | Purpose |
|---|---|
| `allOf(CompletableFuture...)` | Returns a `CompletableFuture<Void>` that completes when **all** of the given futures complete. |
| `anyOf(CompletableFuture...)` | Returns a `CompletableFuture<Object>` that completes with the result of the **first** future to complete. |

**Error handling**

| Method | Purpose |
|---|---|
| `exceptionally(Function)` | Recover from a failure by turning the thrown exception into a fallback value. |
| `handle(BiFunction)` / `handleAsync(...)` | Inspect the outcome — value or exception — and produce a result either way. |
| `whenComplete(BiConsumer)` / `whenCompleteAsync(...)` | Observe the outcome (value and/or exception) without changing it; useful for logging and cleanup. |

**Reading the result**

| Method | Purpose |
|---|---|
| `get()` / `get(t, unit)` | Block until the future completes, optionally with a timeout. Throws checked exceptions. |
| `join()` | Like `get()` but wraps checked exceptions in `CompletionException` — works inside lambdas and streams. |
| `getNow(default)` | Returns the result if already completed, or the supplied default otherwise. |
| `isDone()` / `isCancelled()` / `isCompletedExceptionally()` | Inspect the current state without blocking. |

**Manual completion and timeouts**

| Method | Purpose |
|---|---|
| `complete(value)` / `completeExceptionally(throwable)` | Manually transition the future to a completed state, releasing every waiting stage. |
| `cancel(mayInterruptIfRunning)` | Cancel the future, completing it exceptionally with `CancellationException`. |
| `obtrudeValue(v)` / `obtrudeException(t)` | Force a new outcome on an already-completed future. Use sparingly — breaks the usual immutability contract. |
| `orTimeout(t, unit)` (Java 9+) | Complete exceptionally with `TimeoutException` if the future has not finished within the deadline. |
| `completeOnTimeout(value, t, unit)` (Java 9+) | Complete with the given fallback value if the future has not finished within the deadline. |

📁 [src/concepts/threads/advanced/CompletableFutureExample.java](src/concepts/threads/advanced/CompletableFutureExample.java)

---

## 14. Coordination Primitives — `CountDownLatch`, `CyclicBarrier`, `Semaphore`, `Phaser`, `Exchanger`

These primitives let groups of threads synchronize at specific moments —
when `N` events have happened, when everyone has reached the same point,
when a limited number of permits is available, when phased work needs to
advance together, or when two threads want to swap data — instead of
synchronizing on every shared field.

| Primitive | Purpose | Reusable? |
|---|---|---|
| **`CountDownLatch`** | A one-shot gate. A counter starts at `N`; each event calls `countDown()`, and any thread waiting on `await()` is released the moment the counter reaches zero. | No — once it has opened, it stays open. |
| **`CyclicBarrier`** | A meeting point for a fixed number of threads. Each calls `await()`; once all have arrived, they are released together — and the barrier resets for the next round. An optional barrier action runs once per cycle. | Yes — designed for repeated phases with a constant party count. |
| **`Semaphore`** | A bag of permits limiting concurrent access to a resource. A thread `acquire()`s a permit before using the resource and `release()`s it afterward; threads block when no permits are left. Supports an optional fair mode. | Yes — permits are reused indefinitely. |
| **`Phaser`** | A more flexible barrier: parties can register and deregister dynamically, threads call `arriveAndAwaitAdvance()` to move to the next phase, and an optional `onAdvance` hook can decide when to terminate. | Yes — supports an unlimited number of phases. |
| **`Exchanger<V>`** | A rendezvous point for **exactly two** threads. Each calls `exchange(value)`; both block until the other arrives, then they swap values and proceed. | Yes — can be used for repeated exchanges. |

```java
CountDownLatch latch = new CountDownLatch(3);
latch.countDown();
latch.await();

CyclicBarrier barrier = new CyclicBarrier(3);
barrier.await();

Semaphore permits = new Semaphore(2);
permits.acquire(); try { ... } finally { permits.release(); }
```

📁 [src/concepts/threads/advanced/CountDownLatchExample.java](src/concepts/threads/advanced/CountDownLatchExample.java)
📁 [src/concepts/threads/advanced/CyclicBarrierExample.java](src/concepts/threads/advanced/CyclicBarrierExample.java)
📁 [src/concepts/threads/advanced/SemaphoreExample.java](src/concepts/threads/advanced/SemaphoreExample.java)
📁 [src/concepts/threads/advanced/PhaserExample.java](src/concepts/threads/advanced/PhaserExample.java)
📁 [src/concepts/threads/advanced/ExchangerExample.java](src/concepts/threads/advanced/ExchangerExample.java)

---

## 15. Deadlock, Livelock, Starvation

**Deadlock** — a circular dependency between threads holding locks: thread
A waits for a lock held by thread B, while B waits for one held by A.
Neither can move, so both are frozen forever. The classic *Coffman
conditions* describe when deadlock becomes possible: **mutual exclusion**
(locks are exclusive), **hold-and-wait** (a thread holds one lock while
asking for another), **no preemption** (locks cannot be forcibly taken
back), and **circular wait** (a cycle exists in the wait-for graph).
Breaking any one of those four conditions prevents deadlock.

**Prevention:** acquire locks in a single, agreed-upon **global order**
across the whole program; use `tryLock(timeout)` so a thread can give up
and retry instead of waiting forever; and avoid holding more than one
lock at a time when you can.

**Livelock** — threads stay active and keep reacting to each other, but
their actions cancel out and no real progress happens. The classic
analogy: two people in a narrow hallway each step aside the same way at
the same time and end up dancing in place instead of passing.

**Starvation** — a thread is repeatedly skipped over when resources or
processor time are handed out, so it never gets to run. It often comes
from unfair locks that always hand the lock to whoever asked most
recently, or from higher-priority threads monopolizing the CPU. Counter
it with fair locks, bounded queues that throttle producers, and balanced
thread priorities.

---

## 16. Code Challenges

| # | Challenge | Concepts | File |
|---|---|---|---|
| 1 | Print `ping`/`pong` strictly alternating from two threads | `synchronized`, `wait/notifyAll`, shared flag | [PingPongChallenge.java](src/concepts/threads/challenges/PingPongChallenge.java) |
| 2 | Thread-safe bank account with deposits and withdrawals | critical section, atomic check + update | [BankAccountChallenge.java](src/concepts/threads/challenges/BankAccountChallenge.java) |
| 3 | Build a deadlock, then fix it with consistent lock order | monitor locks, lock ordering | [DeadlockChallenge.java](src/concepts/threads/challenges/DeadlockChallenge.java) |

### More to try yourself

- **Producer / Consumer with multiple producers and consumers** using
  `BlockingQueue` and a poison-pill protocol.
- **Parallel sum** of a large array using `ExecutorService` + `Future`,
  splitting into chunks.
- **Web crawler** that limits parallelism with a `Semaphore`.
- **Dining Philosophers** — five philosophers, five forks; avoid deadlock
  using lock ordering or a `Semaphore` of size 4.
- **Rate limiter** using a `Semaphore` and scheduled refills.
- **Print numbers 1..N in order** with N threads, each printing one number.

---

## 🧠 Cheat Sheet

```java
// 1) Create a thread
new Thread(() -> work()).start();

// 2) Wait for it
t.join();

// 3) Cancel cooperatively
t.interrupt();
while (!Thread.currentThread().isInterrupted()) { ... }

// 4) Protect shared mutable state
synchronized (lock) { ... }
// or
lock.lock(); try { ... } finally { lock.unlock(); }
// or use atomics / concurrent collections

// 5) Run many tasks
ExecutorService pool = Executors.newFixedThreadPool(4);
Future<T> f = pool.submit(callable);
pool.shutdown();

// 6) Async pipeline
CompletableFuture
    .supplyAsync(this::load)
    .thenApply(this::transform)
    .thenAccept(this::save)
    .exceptionally(this::recover);
```

### Decision flowchart

```
need to share mutable state?
│
├─ no  → just use threads / executors. Done.
│
└─ yes → is the operation a single primitive update?
         │
         ├─ yes → use AtomicX
         │
         └─ no  → is it a known data structure (map/queue/list)?
                  │
                  ├─ yes → use a concurrent collection
                  │
                  └─ no  → use a lock (synchronized or ReentrantLock)
                           protect the smallest possible critical section
```
