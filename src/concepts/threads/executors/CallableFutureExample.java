package concepts.threads.executors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * ============================================================================
 *  Callable & Future — tasks that return a value (or throw)
 * ============================================================================
 *  Runnable          → void run()                       — no return, no checked throws
 *  Callable<V>       → V call() throws Exception        — returns V, may throw
 *
 *  Future<V> represents the eventual result of an asynchronous task:
 *    get()                — block until done, return result (or rethrow)
 *    get(timeout, unit)   — block up to a maximum time
 *    cancel(mayInterrupt) — request cancellation
 *    isDone() / isCancelled()
 *
 *  TIP — when results are unrelated, use invokeAll() / invokeAny() to submit
 *  many Callables at once. For composing async work, prefer CompletableFuture.
 * ============================================================================
 */
public class CallableFutureExample {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService pool = Executors.newFixedThreadPool(4);

        List<Future<Integer>> futures = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            final int n = i;
            Callable<Integer> task = () -> {
                Thread.sleep(100);
                return n * n;
            };
            futures.add(pool.submit(task));
        }

        int total = 0;
        for (Future<Integer> f : futures) {
            total += f.get();                  // blocks until that task finishes
        }
        System.out.println("sum of squares = " + total);   // 55

        pool.shutdown();
    }
}
