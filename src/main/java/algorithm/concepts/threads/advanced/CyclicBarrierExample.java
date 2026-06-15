package algorithm.concepts.threads.advanced;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * ============================================================================
 *  CyclicBarrier — N threads wait for each other, then all proceed
 * ============================================================================
 *  Like a meeting point. Each thread calls await() and is held until exactly
 *  N have arrived. Then ALL are released together. Unlike CountDownLatch, it
 *  is REUSABLE — after release, the barrier resets to its initial count.
 *
 *  Use for phased computations: every thread completes phase 1, all sync,
 *  then they all start phase 2.
 * ============================================================================
 */
public class CyclicBarrierExample {

    public static void main(String[] args) {
        int parties = 3;
        CyclicBarrier barrier = new CyclicBarrier(parties,
                () -> System.out.println("--- all arrived; running barrier action ---"));

        for (int i = 1; i <= parties; i++) {
            final int id = i;
            new Thread(() -> {
                try {
                    System.out.println("worker " + id + " phase 1");
                    barrier.await();
                    System.out.println("worker " + id + " phase 2");
                    barrier.await();
                    System.out.println("worker " + id + " done");
                } catch (InterruptedException | BrokenBarrierException e) {
                    Thread.currentThread().interrupt();
                }
            }, "worker-" + id).start();
        }
    }
}
