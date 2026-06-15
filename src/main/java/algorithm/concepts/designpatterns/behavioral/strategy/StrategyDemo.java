package algorithm.concepts.designpatterns.behavioral.strategy;

/**
 * ============================================================================
 *  STRATEGY (behavioral)
 * ============================================================================
 *
 *  Define a family of interchangeable algorithms behind a common interface,
 *  and let the client pick which one to use at runtime. The "context" delegates
 *  the work to whichever strategy it holds — no if/switch over types.
 *
 *  WHEN TO USE
 *  -----------
 *  You have several ways to do one thing (sort, pay, compress, route) and want
 *  to choose or swap them without touching the calling code (Open/Closed).
 * ============================================================================
 */
public class StrategyDemo {

    public static void main(String[] args) {
        System.out.println("=== Strategy ===");
        ShoppingCart cart = new ShoppingCart();

        cart.setPayment(new CreditCardPayment("1234-5678"));
        cart.checkout(100);

        cart.setPayment(new PayPalPayment("buyer@mail.com")); // swap strategy at runtime
        cart.checkout(250);
    }

    /** The strategy interface — the contract every algorithm implements. */
    interface PaymentStrategy {
        void pay(int amount);
    }

    static class CreditCardPayment implements PaymentStrategy {
        private final String card;
        CreditCardPayment(String card) { this.card = card; }
        public void pay(int amount) {
            System.out.println("Paid " + amount + " with credit card " + card);
        }
    }

    static class PayPalPayment implements PaymentStrategy {
        private final String email;
        PayPalPayment(String email) { this.email = email; }
        public void pay(int amount) {
            System.out.println("Paid " + amount + " via PayPal account " + email);
        }
    }

    /** The context — holds a strategy and delegates to it. */
    static class ShoppingCart {
        private PaymentStrategy payment;
        void setPayment(PaymentStrategy payment) { this.payment = payment; }
        void checkout(int amount) {
            if (payment == null) throw new IllegalStateException("no payment strategy set");
            payment.pay(amount);                 // delegation — the heart of Strategy
        }
    }
}
