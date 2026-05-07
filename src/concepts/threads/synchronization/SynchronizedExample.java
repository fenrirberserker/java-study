package concepts.threads.synchronization;

/**
 * ============================================================================
 *  SYNCHRONIZED — Java's built-in mutual exclusion (intrinsic locks)
 * ============================================================================
 *  Think of every Java object as having a single key attached to it. To run
 *  code marked "synchronized", a thread must first pick up that key. While
 *  one thread is holding the key, any other thread that tries to enter the
 *  same protected code has to wait its turn outside. When the thread is
 *  finished — or if something goes wrong and the code throws an error —
 *  the key is automatically handed back so the next waiting thread can go in.
 *
 *  THREE FORMS
 *    1) Synchronized instance method  → locks "this"
 *    2) Synchronized static method    → locks the Class object
 *    3) Synchronized block            → locks any chosen object (finer grain)
 *
 *  GUARANTEES
 *    - MUTUAL EXCLUSION: only one thread at a time inside the protected code.
 *    - VISIBILITY (happens-before): writes by one thread inside the block are
 *      visible to the next thread that enters a block locked on the same
 *      object.
 *
 *  COSTS
 *    - Threads waiting on the monitor BLOCK (no CPU cycles, but no progress).
 *    - Coarse-grained locks reduce parallelism.
 * ============================================================================
 */
public class SynchronizedExample {

    private int counter = 0;
    private final Object lock = new Object();   // private dedicated lock object

    /* 1) Synchronized instance method — locks "this" */
    public synchronized void incMethod() {
        counter++;
    }

    /* 2) Synchronized block — finer control, locks any chosen object */
    public void incBlock() {
        synchronized (lock) {
            counter++;
        }
    }

    public int get() {
        synchronized (lock) {
            return counter;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedExample s = new SynchronizedExample();

        Runnable task = () -> {
            for (int i = 0; i < 100_000; i++) s.incBlock();
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start(); t2.start();
        t1.join();  t2.join();

        System.out.println("counter = " + s.get());   // always 200000
    }
}
