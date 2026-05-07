package concepts.threads.executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * ============================================================================
 *  SCHEDULED EXECUTOR — run tasks after a delay or at a fixed cadence
 * ============================================================================
 *  ScheduledExecutorService extends ExecutorService with three scheduling
 *  methods:
 *
 *    schedule(task, delay, unit)
 *        run once after the given delay
 *
 *    scheduleAtFixedRate(task, initialDelay, period, unit)
 *        run repeatedly; each start time is initialDelay, +period, +2*period
 *        regardless of how long the task takes (overruns can pile up)
 *
 *    scheduleWithFixedDelay(task, initialDelay, delay, unit)
 *        run repeatedly; the next run starts `delay` AFTER the previous run
 *        FINISHED — overruns push everything back, no pile-up
 *
 *  Always shut the scheduler down; it owns daemon-or-not threads that will
 *  otherwise keep the JVM alive.
 * ============================================================================
 */
public class ScheduledExecutorExample {

    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

        // 1) one-shot delayed task
        scheduler.schedule(
                () -> System.out.println("[delayed] fired at " + System.currentTimeMillis()),
                500, TimeUnit.MILLISECONDS);

        // 2) fixed-rate beat — every 200 ms
        ScheduledFuture<?> beat = scheduler.scheduleAtFixedRate(
                () -> System.out.println("tick"),
                100, 200, TimeUnit.MILLISECONDS);

        // let it run for ~1 second, then cancel the beat
        Thread.sleep(1_000);
        beat.cancel(false);                     // stop the periodic task

        scheduler.shutdown();
        scheduler.awaitTermination(1, TimeUnit.SECONDS);
        System.out.println("scheduler stopped");
    }
}
