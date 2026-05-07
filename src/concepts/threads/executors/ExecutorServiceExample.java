package concepts.threads.executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * ============================================================================
 *  ExecutorService — high-level thread pool API
 * ============================================================================
 *  Creating a Thread per task is expensive and uncontrolled. ExecutorService
 *  manages a pool of reusable worker threads and a task queue.
 *
 *  FACTORIES (java.util.concurrent.Executors)
 *    newFixedThreadPool(n)        — exactly n threads, unbounded queue
 *    newCachedThreadPool()        — grows on demand, threads die after 60s idle
 *    newSingleThreadExecutor()    — one worker, sequential, ordered
 *    newScheduledThreadPool(n)    — schedule tasks at delays / fixed rate
 *    newVirtualThreadPerTaskExecutor() — Java 21+ virtual threads
 *
 *  EXECUTE vs SUBMIT — three task-handoff styles
 *
 *    execute(Runnable)
 *        - returns void; fire-and-forget
 *        - an uncaught exception goes to the thread's UncaughtExceptionHandler
 *        - use when you do NOT need a result, completion signal, or cancel
 *
 *    submit(Runnable)
 *        - returns Future<?> whose get() yields null on success
 *        - lets you await completion, cancel the task, or re-throw the
 *          underlying exception via get() (wrapped in ExecutionException)
 *
 *    submit(Callable<V>)
 *        - returns Future<V> carrying the task's result
 *        - the only form that lets the task return a value or throw a
 *          checked exception
 *
 *  SHUTDOWN
 *    shutdown()        — accept no new tasks, finish queued ones, then stop
 *    shutdownNow()     — interrupt running tasks, drop queued ones
 *    awaitTermination(timeout) — block until pool fully stops
 * ============================================================================
 */
public class ExecutorServiceExample {

    public static void main(String[] args)
            throws InterruptedException, ExecutionException {

        ExecutorService pool = Executors.newFixedThreadPool(3);

        /* ------------------------------------------------------------------ *
         * 1) execute(Runnable) — fire and forget, no Future returned.
         *    Cannot wait on it, cannot cancel it, and any exception thrown
         *    inside the task is delivered to the UncaughtExceptionHandler.
         * ------------------------------------------------------------------ */
        pool.execute(() ->
                System.out.println("[execute] hi from " + Thread.currentThread().getName()));

        /* ------------------------------------------------------------------ *
         * 2) submit(Runnable) — fire, but receive a Future<?> handle.
         *    Useful when you only need to wait for completion or cancel.
         *    future.get() returns null on success and throws
         *    ExecutionException if the Runnable failed.
         * ------------------------------------------------------------------ */
        Future<?> done = pool.submit(() ->
                System.out.println("[submit Runnable] hi from " + Thread.currentThread().getName()));
        done.get();                                         // block until finished

        /* ------------------------------------------------------------------ *
         * 3) submit(Callable<V>) — task returns a value (and may throw a
         *    checked exception). The Future carries the result.
         * ------------------------------------------------------------------ */
        Future<Integer> answer = pool.submit(() -> {
            System.out.println("[submit Callable] computing on " + Thread.currentThread().getName());
            Thread.sleep(100);
            return 6 * 7;
        });
        System.out.println("[submit Callable] result = " + answer.get());

        /* ------------------------------------------------------------------ *
         * Submit a batch of tasks and let the pool schedule them across its
         * three workers — the original "many tasks, few threads" pattern.
         * ------------------------------------------------------------------ */
        for (int i = 1; i <= 6; i++) {
            final int id = i;
            pool.execute(() -> {
                System.out.println("task " + id + " on " + Thread.currentThread().getName());
                try { Thread.sleep(100); } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        pool.shutdown();                                   // no more tasks accepted
        pool.awaitTermination(5, TimeUnit.SECONDS);        // wait for completion
        System.out.println("all tasks done");
    }
}
