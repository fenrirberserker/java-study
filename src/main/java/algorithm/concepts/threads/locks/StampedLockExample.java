package algorithm.concepts.threads.locks;

import java.util.concurrent.locks.StampedLock;

/**
 * ============================================================================
 *  STAMPED LOCK — write, read, and OPTIMISTIC read modes
 * ============================================================================
 *  StampedLock (Java 8+) is a high-performance lock with three modes:
 *    - writeLock()              — exclusive
 *    - readLock()               — shared, blocking
 *    - tryOptimisticRead()      — NO actual lock; returns a stamp the
 *                                 caller validates after reading
 *
 *  Optimistic reads let many readers run with zero contention as long as
 *  no writer interferes. If a writer did interfere, validate() returns
 *  false and the reader must fall back to a normal read lock.
 *
 *  IMPORTANT
 *    - StampedLock is NOT reentrant.
 *    - Always release with the matching unlock(stamp) call.
 *    - Use a try/finally around every locked section.
 *
 *  EXAMPLE: a 2D point with thread-safe read and write of (x, y).
 * ============================================================================
 */
public class StampedLockExample {

    private double x, y;
    private final StampedLock sl = new StampedLock();

    /* Exclusive write — blocks readers and other writers. */
    public void move(double dx, double dy) {
        long stamp = sl.writeLock();
        try {
            x += dx;
            y += dy;
        } finally {
            sl.unlockWrite(stamp);
        }
    }

    /* Optimistic read — fastest path; validates afterwards. */
    public double distanceFromOrigin() {
        long stamp = sl.tryOptimisticRead();        // no lock acquired
        double cx = x, cy = y;                      // read fields
        if (!sl.validate(stamp)) {                  // a writer interfered?
            stamp = sl.readLock();                  // fall back to read lock
            try {
                cx = x;
                cy = y;
            } finally {
                sl.unlockRead(stamp);
            }
        }
        return Math.hypot(cx, cy);
    }

    public static void main(String[] args) throws InterruptedException {
        StampedLockExample p = new StampedLockExample();

        Thread writer = new Thread(() -> {
            for (int i = 0; i < 1_000; i++) p.move(1, 1);
        }, "writer");

        Thread reader = new Thread(() -> {
            for (int i = 0; i < 1_000; i++) p.distanceFromOrigin();
        }, "reader");

        writer.start(); reader.start();
        writer.join();  reader.join();

        System.out.printf("final distance = %.2f%n", p.distanceFromOrigin());
    }
}
