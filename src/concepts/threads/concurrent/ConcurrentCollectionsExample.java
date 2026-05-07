package concepts.threads.concurrent;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * ============================================================================
 *  CONCURRENT COLLECTIONS — thread-safe data structures
 * ============================================================================
 *  Found in java.util.concurrent. Designed for HIGH parallelism by using
 *  fine-grained locking or lock-free algorithms instead of one big monitor.
 *
 *  PICKING ONE
 *    ConcurrentHashMap         — replacement for synchronized HashMap. Bucket
 *                                level locking. Many readers, many writers.
 *    CopyOnWriteArrayList      — read-mostly list. Each write copies the
 *                                whole array. Iteration is snapshot-safe.
 *    ConcurrentLinkedQueue     — non-blocking unbounded FIFO queue.
 *    BlockingQueue (interface) — producer/consumer queue. put() blocks when
 *                                full, take() blocks when empty.
 *      - LinkedBlockingQueue   (optionally bounded)
 *      - ArrayBlockingQueue    (bounded, fixed capacity)
 *      - PriorityBlockingQueue (ordered)
 *      - SynchronousQueue      (handoff: every put waits for a take)
 *
 *  AVOID
 *    Collections.synchronizedMap / synchronizedList — single global lock,
 *    much slower under contention than the concurrent versions above.
 * ============================================================================
 */
public class ConcurrentCollectionsExample {

    public static void main(String[] args) throws InterruptedException {
        // ConcurrentHashMap: safe parallel updates
        Map<String, Integer> map = new ConcurrentHashMap<>();
        Runnable mapTask = () -> {
            for (int i = 0; i < 1000; i++) map.merge("hits", 1, Integer::sum);
        };
        Thread a = new Thread(mapTask), b = new Thread(mapTask);
        a.start(); b.start(); a.join(); b.join();
        System.out.println("hits = " + map.get("hits"));   // 2000

        // ConcurrentLinkedQueue: non-blocking
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        queue.offer(1); queue.offer(2);
        System.out.println("polled = " + queue.poll());

        // BlockingQueue: producer/consumer
        BlockingQueue<String> bq = new LinkedBlockingQueue<>(2);
        bq.put("one");                       // blocks if full
        bq.put("two");
        System.out.println("taken = " + bq.take());   // blocks if empty
    }
}
