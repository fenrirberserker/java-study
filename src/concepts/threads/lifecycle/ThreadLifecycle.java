package concepts.threads.lifecycle;

/**
 * ============================================================================
 *  THREAD LIFECYCLE — states, sleep, join, interrupt, daemon, priority
 * ============================================================================
 *
 *  STATES (Thread.State enum)
 *    NEW            — created but not started
 *    RUNNABLE       — eligible to run (running or waiting for the operating
 *                     system scheduler)
 *    BLOCKED        — waiting to acquire a monitor lock
 *    WAITING        — waiting indefinitely (wait(), join(), park())
 *    TIMED_WAITING  — waiting with a timeout (sleep(ms), wait(ms), join(ms))
 *    TERMINATED     — finished (run() returned or threw)
 *
 *  KEY METHODS
 *    Thread.sleep(ms)   — pause the CURRENT thread for ms milliseconds
 *    t.join()           — wait until thread t finishes
 *    t.interrupt()      — politely ask t to stop; sets its interrupted flag
 *    Thread.currentThread().isInterrupted() — check the flag
 *    setDaemon(true)    — mark as daemon: Java Virtual Machine exits when
 *                         only daemons remain
 *    setPriority(int)   — hint to the scheduler (1..10, default 5)
 * ============================================================================
 */
public class ThreadLifecycle {

    public static void main(String[] args) throws InterruptedException {
        // Sleep — pause the current thread
        Thread sleeper = new Thread(() -> {
            try {
                System.out.println("sleeper: going to sleep");
                Thread.sleep(500);
                System.out.println("sleeper: awake");
            } catch (InterruptedException e) {
                // Re-set the interrupted flag, then exit cleanly
                Thread.currentThread().interrupt();
                System.out.println("sleeper: interrupted while sleeping");
            }
        }, "sleeper");

        // Interrupt — cooperative cancellation
        Thread worker = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                // simulate work
            }
            System.out.println("worker: noticed interrupt, exiting");
        }, "worker");

        // Daemon — Java Virtual Machine will not wait for this one
        Thread heartbeat = new Thread(() -> {
            while (true) {
                try { Thread.sleep(200); } catch (InterruptedException e) { return; }
            }
        }, "heartbeat");
        heartbeat.setDaemon(true);

        sleeper.start();
        worker.start();
        heartbeat.start();

        Thread.sleep(100);
        System.out.println("worker state = " + worker.getState());   // RUNNABLE
        System.out.println("sleeper state = " + sleeper.getState()); // TIMED_WAITING

        worker.interrupt();   // ask worker to stop
        sleeper.join();       // wait for sleeper to finish
        worker.join();        // wait for worker to finish
        // heartbeat is daemon → Java Virtual Machine exits without waiting
        System.out.println("main: done");
    }
}
