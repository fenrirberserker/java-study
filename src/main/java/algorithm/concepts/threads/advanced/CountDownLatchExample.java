package algorithm.concepts.threads.advanced;

import java.util.concurrent.CountDownLatch;

/**
 * ============================================================================
 *  CountDownLatch — wait until N events have occurred
 * ============================================================================
 *  Initialized with a positive count. Threads call:
 *    await()      — block until count reaches zero
 *    countDown()  — decrement the count
 *
 *  Once it hits zero, ALL waiting threads are released and the latch cannot
 *  be reset. Use it for "wait until N workers finish" or "release all when
 *  the system is ready".
 *
 *  Reusable equivalent? → CyclicBarrier.
 * ============================================================================
 */
public class CountDownLatchExample {

    public static void main(String[] args) throws InterruptedException {
        int workers = 3;
        CountDownLatch done = new CountDownLatch(workers);

        for (int i = 1; i <= workers; i++) {
            final int id = i;
            new Thread(() -> {
                try { Thread.sleep(100L * id); } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("worker " + id + " finished");
                done.countDown();
            }, "worker-" + id).start();
        }

        done.await();                                 // main waits until count == 0
        System.out.println("all workers done — main proceeds");
    }
}
