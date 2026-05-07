package concepts.threads.atomic;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/**
 * ============================================================================
 *  ATOMIC — lock-free thread-safe primitives (java.util.concurrent.atomic)
 * ============================================================================
 *  These classes use low-level Compare-And-Swap (CAS) hardware instructions
 *  to update a value atomically without acquiring a monitor lock. Faster
 *  than "synchronized" for simple counters, flags, and references.
 *
 *  COMMON CLASSES
 *    AtomicInteger / AtomicLong / AtomicBoolean
 *    AtomicReference<T>          — atomic object reference
 *    LongAdder / DoubleAdder     — high-contention counters (faster than
 *                                  AtomicLong under heavy parallel updates)
 *
 *  CORE OPERATIONS
 *    get(), set(v), incrementAndGet(), getAndIncrement()
 *    compareAndSet(expected, new) — succeeds only if current == expected
 *    updateAndGet(unaryOperator)  — apply a function atomically
 * ============================================================================
 */
public class AtomicExample {

    private static final AtomicInteger counter = new AtomicInteger(0);
    private static final AtomicReference<String> winner = new AtomicReference<>(null);

    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            for (int i = 0; i < 100_000; i++) counter.incrementAndGet();   // atomic ++
            winner.compareAndSet(null, Thread.currentThread().getName());  // first wins
        };

        Thread t1 = new Thread(task, "alpha");
        Thread t2 = new Thread(task, "beta");
        t1.start(); t2.start();
        t1.join();  t2.join();

        System.out.println("counter = " + counter.get());   // always 200000
        System.out.println("winner  = " + winner.get());    // alpha or beta
    }
}
