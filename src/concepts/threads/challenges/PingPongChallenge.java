package concepts.threads.challenges;

/**
 * ============================================================================
 *  CHALLENGE — Ping/Pong: two threads alternate strictly
 * ============================================================================
 *  GOAL
 *    Print: ping, pong, ping, pong, ... exactly N times each, with two
 *    threads — one only prints "ping", the other only prints "pong".
 *
 *  CONCEPTS USED
 *    - shared state (a "turn" flag)
 *    - synchronized + wait/notifyAll for strict ordering
 * ============================================================================
 */
public class PingPongChallenge {

    private final Object lock = new Object();
    private boolean pingTurn = true;
    private final int rounds;

    public PingPongChallenge(int rounds) { this.rounds = rounds; }

    public void ping() throws InterruptedException {
        for (int i = 0; i < rounds; i++) {
            synchronized (lock) {
                while (!pingTurn) lock.wait();
                System.out.println("ping");
                pingTurn = false;
                lock.notifyAll();
            }
        }
    }

    public void pong() throws InterruptedException {
        for (int i = 0; i < rounds; i++) {
            synchronized (lock) {
                while (pingTurn) lock.wait();
                System.out.println("pong");
                pingTurn = true;
                lock.notifyAll();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        PingPongChallenge game = new PingPongChallenge(5);

        Thread a = new Thread(() -> {
            try { game.ping(); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        });
        Thread b = new Thread(() -> {
            try { game.pong(); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        });

        a.start(); b.start();
        a.join();  b.join();
    }
}
