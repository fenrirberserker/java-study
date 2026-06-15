package algorithm.concepts.threads.communication;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * ============================================================================
 *  PRODUCER — CONSUMER with BlockingQueue
 * ============================================================================
 *  Classic concurrency pattern: one or more producers add items, one or more
 *  consumers remove them. The queue handles all synchronization, blocking,
 *  and signalling.
 *
 *  put()  — adds; blocks while the queue is full
 *  take() — removes; blocks while the queue is empty
 *
 *  No "synchronized", no "wait/notify" needed — the queue does it for you.
 * ============================================================================
 */
public class ProducerConsumerExample {

    private static final String STOP = "__STOP__";

    public static void main(String[] args) {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(5);

        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    String item = "item-" + i;
                    queue.put(item);
                    System.out.println("produced " + item);
                }
                queue.put(STOP);                    // poison pill to stop the consumer
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "producer");

        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    String item = queue.take();
                    if (STOP.equals(item)) break;
                    System.out.println("consumed " + item);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "consumer");

        producer.start();
        consumer.start();
    }
}
