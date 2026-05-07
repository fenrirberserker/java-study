package concepts.threads.locks;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ============================================================================
 *  CONDITION — explicit wait queues paired with a Lock
 * ============================================================================
 *  A Condition is the explicit-lock equivalent of Object.wait()/notify().
 *  One Lock can host MANY independent Condition objects, so different
 *  threads can wait for different reasons on the same lock — something
 *  intrinsic monitors cannot do.
 *
 *  CORE METHODS
 *    cond.await()        — release the lock and park the thread
 *    cond.signal()       — wake one waiter
 *    cond.signalAll()    — wake every waiter
 *
 *  RULES
 *    - Always call await/signal while holding the associated Lock.
 *    - Always re-check the condition inside a while-loop (spurious wakeups).
 *    - Always release the Lock in a finally block.
 *
 *  EXAMPLE: a tiny bounded buffer with two conditions ("not full", "not
 *  empty") on the same lock — exactly what BlockingQueue does internally.
 * ============================================================================
 */
public class ConditionExample {

    private static final int CAPACITY = 3;
    private static final int[] buffer = new int[CAPACITY];
    private static int count = 0, head = 0, tail = 0;

    private static final Lock lock = new ReentrantLock();
    private static final Condition notFull  = lock.newCondition();
    private static final Condition notEmpty = lock.newCondition();

    private static void put(int v) throws InterruptedException {
        lock.lock();
        try {
            while (count == CAPACITY) notFull.await();   // wait for space
            buffer[tail] = v;
            tail = (tail + 1) % CAPACITY;
            count++;
            notEmpty.signal();                           // wake one consumer
        } finally {
            lock.unlock();
        }
    }

    private static int take() throws InterruptedException {
        lock.lock();
        try {
            while (count == 0) notEmpty.await();         // wait for items
            int v = buffer[head];
            head = (head + 1) % CAPACITY;
            count--;
            notFull.signal();                            // wake one producer
            return v;
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    put(i);
                    System.out.println("produced " + i);
                }
            } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        }, "producer");

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("consumed " + take());
                }
            } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        }, "consumer");

        producer.start(); consumer.start();
        producer.join();  consumer.join();
    }
}
