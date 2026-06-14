package concepts.spring.strategy;

import java.util.Map;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * ============================================================================
 *  STRATEGY PATTERN WITH SPRING — THE INTERVIEW FAVORITE
 * ============================================================================
 *
 *  Instead of a switch statement over payment methods, declare one bean per
 *  strategy and let Spring inject ALL of them as a Map<beanName, bean>.
 *
 *  WHY IT IMPRESSES
 *  ----------------
 *    • No switch to modify: adding "crypto" = adding ONE new @Component
 *      (Open/Closed principle in action).
 *    • The processor depends only on the PaymentStrategy abstraction
 *      (Dependency Inversion principle).
 *
 *  Spring fills the Map automatically: every bean implementing the interface
 *  lands in it, keyed by its bean name.
 * ============================================================================
 */
@Configuration
@ComponentScan(basePackageClasses = StrategyPatternExample.class)
public class StrategyPatternExample {

    public static void main(String[] args) {
        System.out.println("=== Strategy pattern with Spring ===");
        try (var context = new AnnotationConfigApplicationContext(StrategyPatternExample.class)) {
            PaymentProcessor processor = context.getBean(PaymentProcessor.class);
            processor.pay("card", 100.0);
            processor.pay("paypal", 250.0);
            processor.pay("crypto", 10.0);    // not registered -> graceful message
        }
    }

    interface PaymentStrategy {
        void pay(double amount);
    }

    @Component("card")
    static class CardPayment implements PaymentStrategy {
        public void pay(double amount) {
            System.out.println("  [card]   charging credit card: " + amount);
        }
    }

    @Component("paypal")
    static class PaypalPayment implements PaymentStrategy {
        public void pay(double amount) {
            System.out.println("  [paypal] redirecting to wallet: " + amount);
        }
    }

    @Component
    static class PaymentProcessor {

        /** Spring injects EVERY PaymentStrategy bean, keyed by bean name. */
        private final Map<String, PaymentStrategy> strategies;

        PaymentProcessor(Map<String, PaymentStrategy> strategies) {
            this.strategies = strategies;
        }

        void pay(String method, double amount) {
            PaymentStrategy strategy = strategies.get(method);
            if (strategy == null) {
                System.out.println("  no strategy for '" + method + "' — supported: " + strategies.keySet());
                return;
            }
            strategy.pay(amount);   // polymorphic dispatch — zero switch statements
        }
    }
}
