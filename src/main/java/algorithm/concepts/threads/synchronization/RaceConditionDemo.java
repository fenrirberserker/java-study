package algorithm.concepts.threads.synchronization;

/**
 * ============================================================================
 *  RACE CONDITION — what happens without synchronization
 * ============================================================================
 *  A RACE CONDITION occurs when two or more threads access shared mutable
 *  state at the same time AND at least one of them modifies it. The final
 *  result depends on the unpredictable order of operations.
 *
 *  Example: counter++ is NOT atomic. It is three steps:
 *    1) read counter
 *    2) add 1
 *    3) write counter
 *  Two threads can read the same value, both add 1, and both write the same
 *  result — losing one increment.
 *
 *  Run this class repeatedly: the printed final value will usually be LESS
 *  than 200000 (the expected sum if increments were atomic).
 * ============================================================================
 */
public class RaceConditionDemo {

    private static int counter = 0;            // shared mutable state

    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            for (int i = 0; i < 100_000; i++) {
                counter++;                      // NOT atomic → race
            }
        };

        Thread t1 = new Thread(task, "t1");
        Thread t2 = new Thread(task, "t2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("expected = 200000, actual = " + counter);
        System.out.println("Run again — the result will likely change.");
    }
}
