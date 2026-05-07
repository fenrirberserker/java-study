package concepts.threads.advanced;

import java.util.concurrent.Semaphore;

/**
 * ============================================================================
 *  Semaphore — limit concurrent access to a resource
 * ============================================================================
 *  Holds a number of "permits". A thread must acquire() a permit before using
 *  the resource and release() it when done. If no permits remain, acquire()
 *  blocks.
 *
 *  Examples: cap parallel database connections, throttle outgoing network
 *  calls, restrict simultaneous file handles.
 *
 *  A Semaphore with permits = 1 acts like a non-reentrant mutex.
 * ============================================================================
 */
public class SemaphoreExample {

    public static void main(String[] args) {
        Semaphore parkingSpots = new Semaphore(2);   // only 2 cars at a time

        for (int i = 1; i <= 5; i++) {
            final int car = i;
            new Thread(() -> {
                try {
                    parkingSpots.acquire();
                    System.out.println("car " + car + " parked");
                    Thread.sleep(200);
                    System.out.println("car " + car + " leaving");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    parkingSpots.release();
                }
            }, "car-" + car).start();
        }
    }
}
