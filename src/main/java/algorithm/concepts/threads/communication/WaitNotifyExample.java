package algorithm.concepts.threads.communication;

/**
 * ============================================================================
 *  wait() / notify() / notifyAll() — low-level thread communication
 * ============================================================================
 *  Defined on Object. Must be called while holding the object's monitor
 *  (i.e. inside a synchronized block on the SAME object).
 *
 *    wait()       — release the monitor and wait until notified or interrupted
 *    notify()     — wake ONE waiting thread on this monitor
 *    notifyAll()  — wake ALL waiting threads on this monitor
 *
 *  ALWAYS use a while-loop, not an if, to re-check the condition after waking
 *  (spurious wakeups + multiple notified threads).
 *
 *  PREFER higher-level alternatives:
 *    BlockingQueue, CountDownLatch, Semaphore, Condition (from a Lock).
 *    They are easier to use correctly.
 * ============================================================================
 */
public class WaitNotifyExample {

    private final Object lock = new Object();
    private boolean ready = false;

    public void awaitReady() throws InterruptedException {
        synchronized (lock) {
            while (!ready) {        // while-loop, not if
                lock.wait();
            }
            System.out.println(Thread.currentThread().getName() + ": proceeding");
        }
    }

    public void signal() {
        synchronized (lock) {
            ready = true;
            lock.notifyAll();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        WaitNotifyExample w = new WaitNotifyExample();

        Runnable waiter = () -> {
            try { w.awaitReady(); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        };

        new Thread(waiter, "w1").start();
        new Thread(waiter, "w2").start();

        Thread.sleep(200);
        System.out.println("main: signalling");
        w.signal();
    }
}
