package concepts.threads.executors;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * ============================================================================
 *  FORK / JOIN — divide-and-conquer with a work-stealing pool
 * ============================================================================
 *  ForkJoinPool is a thread pool optimised for recursive tasks. Each worker
 *  has its own deque; idle workers STEAL tasks from busy workers' deques,
 *  so the cores stay loaded with minimal coordination.
 *
 *  TASK TYPES
 *    RecursiveTask<V>   — task that returns a value
 *    RecursiveAction    — task with no return value
 *
 *  PATTERN
 *    if (problem small)  solve sequentially
 *    else                split, fork() one half, compute the other,
 *                        join() the forked half, combine results
 *
 *  EXAMPLE: parallel sum of an int array.
 * ============================================================================
 */
public class ForkJoinExample {

    private static final int THRESHOLD = 10_000;

    static class SumTask extends RecursiveTask<Long> {
        private final int[] data;
        private final int from, to;

        SumTask(int[] data, int from, int to) {
            this.data = data; this.from = from; this.to = to;
        }

        @Override
        protected Long compute() {
            int len = to - from;
            if (len <= THRESHOLD) {                 // base case: sequential
                long s = 0;
                for (int i = from; i < to; i++) s += data[i];
                return s;
            }
            int mid = from + len / 2;
            SumTask left  = new SumTask(data, from, mid);
            SumTask right = new SumTask(data, mid, to);
            left.fork();                            // schedule left in pool
            long rightSum = right.compute();        // compute right inline
            long leftSum  = left.join();            // wait for left
            return leftSum + rightSum;
        }
    }

    public static void main(String[] args) {
        int[] data = new int[1_000_000];
        for (int i = 0; i < data.length; i++) data[i] = i + 1;

        // commonPool() is shared by parallel streams; create a private one for isolation
        ForkJoinPool pool = new ForkJoinPool();
        long total = pool.invoke(new SumTask(data, 0, data.length));
        pool.shutdown();

        System.out.println("sum = " + total);       // expected 500_000_500_000
    }
}
