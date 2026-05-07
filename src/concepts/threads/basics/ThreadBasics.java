package concepts.threads.basics;

/**
 * ============================================================================
 *  THREAD BASICS — three ways to create a thread
 * ============================================================================
 *  A Thread is an independent path of execution inside the same Java Virtual
 *  Machine process. Every Java program starts with one thread (the "main"
 *  thread) and can spawn more.
 *
 *  Three ways to create one:
 *    1) EXTENDS Thread        — subclass and override run()
 *    2) IMPLEMENTS Runnable   — pass an instance to a Thread (preferred)
 *    3) LAMBDA                — Runnable is a functional interface, so a
 *                               lambda expression is the most concise form
 *
 *  EXTENDS vs IMPLEMENTS — quick rule
 *    - extends Thread     → uses your "is-a-Thread" inheritance slot. Java
 *                           supports SINGLE inheritance, so you cannot extend
 *                           anything else. Tighter coupling. Avoid.
 *    - implements Runnable → keeps the inheritance slot free, lets you reuse
 *                            the same Runnable across multiple Thread objects
 *                            and Executors. PREFERRED.
 *
 *  start() vs run()
 *    - start() schedules a NEW operating-system thread that calls run().
 *    - run() called directly is a normal method call on the CURRENT thread.
 * ============================================================================
 */
public class ThreadBasics {

    /* 1) EXTENDS Thread ---------------------------------------------------- */
    static class HelloThread extends Thread {
        @Override
        public void run() {
            System.out.println("[extends Thread] running on " + Thread.currentThread().getName());
        }
    }

    /* 2) IMPLEMENTS Runnable ---------------------------------------------- */
    static class HelloRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("[implements Runnable] running on " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // 1) extends Thread
        Thread t1 = new HelloThread();
        t1.start();

        // 2) implements Runnable
        Thread t2 = new Thread(new HelloRunnable(), "runnable-thread");
        t2.start();

        // 3) lambda — Runnable is a functional interface (one abstract method)
        Thread t3 = new Thread(
                () -> System.out.println("[lambda] running on " + Thread.currentThread().getName()),
                "lambda-thread");
        t3.start();

        // join() waits for the thread to finish before continuing
        t1.join();
        t2.join();
        t3.join();

        System.out.println("All threads finished. Main exits.");
    }
}
