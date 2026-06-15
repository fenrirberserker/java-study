package algorithm.concepts.threads.advanced;

import java.util.concurrent.Phaser;

/**
 * ============================================================================
 *  PHASER — flexible multi-phase barrier
 * ============================================================================
 *  A Phaser generalises CyclicBarrier with two extra powers:
 *
 *    1) The number of registered parties can change at runtime
 *       (register(), arriveAndDeregister()).
 *    2) An onAdvance(phase, parties) hook can decide when the phaser
 *       terminates — return true to stop, false to keep going.
 *
 *  CORE METHODS
 *    register()                 — add one party
 *    arriveAndAwaitAdvance()    — say "I'm done with this phase, wait
 *                                 for the others"
 *    arriveAndDeregister()      — say "I'm done forever, drop my count"
 *    getPhase()                 — current phase number (0, 1, 2, ...)
 *
 *  EXAMPLE: three workers complete three rounds of work in lock-step.
 * ============================================================================
 */
public class PhaserExample {

    public static void main(String[] args) {
        final int rounds = 3;
        Phaser phaser = new Phaser(1) {                // "1" = the main thread
            @Override
            protected boolean onAdvance(int phase, int registeredParties) {
                System.out.println("--- end of round " + phase + " ---");
                return phase >= rounds - 1 || registeredParties == 0;
            }
        };

        for (int id = 1; id <= 3; id++) {
            phaser.register();                          // add a worker
            final int worker = id;
            new Thread(() -> {
                for (int r = 0; r < rounds; r++) {
                    System.out.println("worker " + worker + " round " + r);
                    phaser.arriveAndAwaitAdvance();     // sync between rounds
                }
                phaser.arriveAndDeregister();           // leave permanently
            }, "worker-" + id).start();
        }

        // Main also participates so it sees every phase end.
        while (!phaser.isTerminated()) {
            phaser.arriveAndAwaitAdvance();
        }
        System.out.println("phaser terminated");
    }
}
