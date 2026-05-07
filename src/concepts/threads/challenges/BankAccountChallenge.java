package concepts.threads.challenges;

/**
 * ============================================================================
 *  CHALLENGE — Thread-safe bank account
 * ============================================================================
 *  GOAL
 *    Implement deposit(amount) and withdraw(amount) on a shared account so
 *    that concurrent transfers never corrupt the balance and never overdraw.
 *
 *  CONCEPTS USED
 *    - critical section
 *    - synchronized methods
 *    - precondition check INSIDE the lock (read-modify-write must be atomic)
 *
 *  Try replacing "synchronized" with nothing → race conditions appear.
 * ============================================================================
 */
public class BankAccountChallenge {

    static class Account {
        private double balance;
        public Account(double initial) { this.balance = initial; }

        public synchronized void deposit(double amount) {
            balance += amount;
        }

        public synchronized boolean withdraw(double amount) {
            if (balance < amount) return false;     // check + modify must be atomic
            balance -= amount;
            return true;
        }

        public synchronized double balance() { return balance; }
    }

    public static void main(String[] args) throws InterruptedException {
        Account acc = new Account(1000);

        Runnable deposits   = () -> { for (int i = 0; i < 1000; i++) acc.deposit(1); };
        Runnable withdraws  = () -> { for (int i = 0; i < 1000; i++) acc.withdraw(1); };

        Thread d1 = new Thread(deposits), d2 = new Thread(deposits);
        Thread w1 = new Thread(withdraws), w2 = new Thread(withdraws);

        d1.start(); d2.start(); w1.start(); w2.start();
        d1.join();  d2.join();  w1.join();  w2.join();

        // 1000 + 2*1000 - 2*1000 = 1000
        System.out.println("final balance = " + acc.balance());
    }
}
