package concepts.threads.advanced;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * ============================================================================
 *  CompletableFuture — composable asynchronous pipelines
 * ============================================================================
 *  A Future you can CHAIN. Lets you describe "do A, then B, then combine with
 *  C" without manually managing threads. Built on the common ForkJoinPool
 *  (or any Executor you supply).
 *
 *  STARTING
 *    runAsync(Runnable)         — async, no return
 *    supplyAsync(Supplier<T>)   — async, returns T
 *
 *  CHAINING
 *    thenApply(Function)        — transform the result
 *    thenAccept(Consumer)       — consume the result
 *    thenRun(Runnable)          — run after (no input)
 *    thenCompose(Function)      — flatMap of futures
 *    thenCombine(other, BiFn)   — wait for both, combine
 *
 *  ERRORS
 *    exceptionally(Function)    — recover from a failure
 *    handle(BiFunction)         — handle both success and failure
 *
 *  WAIT
 *    get() / join()             — block until complete
 * ============================================================================
 */
public class CompletableFutureExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<String> pipeline =
                CompletableFuture
                        .supplyAsync(() -> "hello")                       // async produce
                        .thenApply(s -> s + " world")                     // transform
                        .thenApply(String::toUpperCase)                   // transform
                        .exceptionally(ex -> "fallback: " + ex.getMessage());

        System.out.println(pipeline.get());                              // HELLO WORLD

        // Combine two independent async results
        CompletableFuture<Integer> a = CompletableFuture.supplyAsync(() -> 2);
        CompletableFuture<Integer> b = CompletableFuture.supplyAsync(() -> 3);
        Integer sum = a.thenCombine(b, Integer::sum).get();
        System.out.println("sum = " + sum);                              // 5
    }
}
