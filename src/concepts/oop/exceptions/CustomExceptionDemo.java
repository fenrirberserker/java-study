package concepts.oop.exceptions;

/**
 * ============================================================================
 *  Using a custom exception
 * ============================================================================
 *  Demonstrates throwing, catching, and reading custom data from
 *  InsufficientFundsException.
 * ============================================================================
 */
public class CustomExceptionDemo {

    static void withdraw(double balance, double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(
                    "cannot withdraw " + amount + " from balance " + balance,
                    amount - balance);
        }
        System.out.println("withdrew " + amount);
    }

    public static void main(String[] args) {
        try {
            withdraw(100, 250);
        } catch (InsufficientFundsException e) {
            System.out.println("error: " + e.getMessage());
            System.out.println("short by: " + e.getShortfall());
        }
    }
}
