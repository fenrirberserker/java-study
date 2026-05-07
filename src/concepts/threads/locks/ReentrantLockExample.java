package concepts.threads.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ============================================================================
 *  ReentrantLock — explicit lock from java.util.concurrent.locks
 * ============================================================================
 *  Equivalent to "synchronized" but with extra capabilities:
 *    - tryLock()                  — attempt without blocking
 *    - tryLock(timeout, unit)     — attempt with a maximum wait
 *    - lockInterruptibly()        — interruptible while waiting
 *    - fairness option            — first-come-first-served queue
 *    - multiple Condition objects — finer-grained wait/notify
 *
 *  REENTRANT means the same thread can acquire the lock multiple times
 *  (and must unlock the same number of times).
 *
 *  GOLDEN RULE
 *    Always release the lock in a "finally" block, otherwise an exception
 *    inside the critical section leaves the lock permanently held.
 * ============================================================================
 */
public class ReentrantLockExample {

    private final Lock lock = new ReentrantLock();
    private int counter = 0;

    public void increment() {
        lock.lock();                  // acquire
        try {
            counter++;                // critical section
        } finally {
            lock.unlock();            // ALWAYS release
        }
    }

    public boolean tryIncrement() {
        if (!lock.tryLock()) return false;   // skip if busy
        try {
            counter++;
            return true;
        } finally {
            lock.unlock();
        }
    }

    public int get() { return counter; }

    public static void main(String[] args) throws InterruptedException {
        ReentrantLockExample r = new ReentrantLockExample();

        Runnable task = () -> {
            for (int i = 0; i < 100_000; i++) r.increment();
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start(); t2.start();
        t1.join();  t2.join();

        System.out.println("counter = " + r.get());   // 200000
    }
}
