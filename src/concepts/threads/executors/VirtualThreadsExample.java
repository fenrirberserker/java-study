package concepts.threads.executors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * ============================================================================
 *  VIRTUAL THREADS — Java 21+ lightweight threads (Project Loom)
 * ============================================================================
 *  A virtual thread is a thread implemented by the Java Virtual Machine
 *  rather than the operating system. They are very cheap to create
 *  (millions per process), so the recommended pattern for blocking I/O is:
 *
 *      "one task = one virtual thread"
 *
 *  Each blocking call (sleep, network read, database query) parks the
 *  virtual thread, freeing the underlying carrier thread for other work.
 *
 *  TWO WAYS TO LAUNCH ONE
 *    1) Thread.ofVirtual().start(runnable)
 *    2) Executors.newVirtualThreadPerTaskExecutor()
 *
 *  Virtual threads are NOT faster for CPU-bound work — they shine for
 *  highly concurrent workloads dominated by waiting.
 *
 *  REQUIRES Java 21 or newer.
 * ============================================================================
 */
public class VirtualThreadsExample {

    public static void main(String[] args) throws Exception {
        // 1) Start a single virtual thread directly
        Thread t = Thread.ofVirtual().name("v-hello").start(
                () -> System.out.println("hi from " + Thread.currentThread()));
        t.join();

        // 2) An executor that creates one virtual thread per submitted task
        try (ExecutorService pool = Executors.newVirtualThreadPerTaskExecutor()) {
            List<Future<Integer>> results = new ArrayList<>();
            for (int i = 0; i < 10_000; i++) {
                final int id = i;
                results.add(pool.submit(() -> {
                    Thread.sleep(50);                  // simulated I/O
                    return id;
                }));
            }
            // wait for everyone (try-with-resources closes the pool, awaiting termination)
            int sum = 0;
            for (Future<Integer> f : results) sum += f.get();
            System.out.println("completed " + results.size()
                    + " tasks, sum = " + sum);
        }

        // 3) A factory you can hand to other executor builders
        ExecutorService perTask = Executors.newThreadPerTaskExecutor(
                Thread.ofVirtual().name("worker-", 0).factory());
        perTask.submit(() -> System.out.println("named " + Thread.currentThread().getName()));
        perTask.shutdown();
        perTask.awaitTermination(1, TimeUnit.SECONDS);
    }
}
