package algorithm.concepts.threads.challenges;

/**
 * ============================================================================
 *  CHALLENGE — Deadlock demonstration and fix
 * ============================================================================
 *  DEADLOCK
 *    Two or more threads are blocked forever, each waiting for a lock held
 *    by the other. Coffman conditions: mutual exclusion, hold-and-wait, no
 *    preemption, circular wait.
 *
 *  THE BUG
 *    Thread A locks lock1 then tries lock2.
 *    Thread B locks lock2 then tries lock1.
 *    → both wait forever.
 *
 *  THE FIX (lock ordering)
 *    Always acquire locks in a CONSISTENT GLOBAL ORDER (e.g. by identity
 *    hash code, by id, alphabetically). Both threads then ask for lock1
 *    first, lock2 second — no cycle is possible.
 * ============================================================================
 */
public class DeadlockChallenge {

    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    /* BUGGY VERSION — deadlocks */
    static void deadlocking() {
        Thread a = new Thread(() -> {
            synchronized (lock1) {
                sleep(50);
                synchronized (lock2) {
                    System.out.println("A got both");
                }
            }
        }, "A");
        Thread b = new Thread(() -> {
            synchronized (lock2) {                  // opposite order — danger
                sleep(50);
                synchronized (lock1) {
                    System.out.println("B got both");
                }
            }
        }, "B");
        a.start(); b.start();
    }

    /* FIXED VERSION — global lock order */
    static void safe() {
        Runnable both = () -> {
            synchronized (lock1) {                  // always lock1 first
                synchronized (lock2) {
                    System.out.println(Thread.currentThread().getName() + " got both");
                }
            }
        };
        new Thread(both, "A").start();
        new Thread(both, "B").start();
    }

    private static void sleep(long ms) {
        try { Thread.sleep(ms); } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        // Uncomment ONE at a time. The first will hang; the second will finish.
        // deadlocking();
        safe();
    }
}
