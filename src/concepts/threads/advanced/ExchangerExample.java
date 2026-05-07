package concepts.threads.advanced;

import java.util.concurrent.Exchanger;

/**
 * ============================================================================
 *  EXCHANGER — rendezvous between exactly two threads
 * ============================================================================
 *  An Exchanger<V> is a one-on-one meeting point. Each thread calls
 *  exchange(value); both block until the other arrives, then they swap
 *  their values and continue.
 *
 *  KEY FEATURES
 *    - Symmetric: there is no "producer" and "consumer" — both sides give
 *      and receive.
 *    - Reusable: the same Exchanger can be used for repeated exchanges.
 *    - Optional timeout: exchange(value, timeout, unit).
 *
 *  EXAMPLE: two threads each prepare a buffer, then swap them on every
 *  iteration — a classic double-buffer pattern.
 * ============================================================================
 */
public class ExchangerExample {

    public static void main(String[] args) throws InterruptedException {
        Exchanger<String> ex = new Exchanger<>();

        Thread a = new Thread(() -> {
            try {
                String mine = "A0";
                for (int i = 1; i <= 3; i++) {
                    String got = ex.exchange(mine);
                    System.out.println("A: gave '" + mine + "' got '" + got + "'");
                    mine = "A" + i;
                }
            } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        }, "A");

        Thread b = new Thread(() -> {
            try {
                String mine = "B0";
                for (int i = 1; i <= 3; i++) {
                    String got = ex.exchange(mine);
                    System.out.println("B: gave '" + mine + "' got '" + got + "'");
                    mine = "B" + i;
                }
            } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        }, "B");

        a.start(); b.start();
        a.join();  b.join();
    }
}
