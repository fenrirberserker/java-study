package concepts.spring.events;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * ============================================================================
 *  APPLICATION EVENTS — THE OBSERVER PATTERN, SPRING STYLE
 * ============================================================================
 *
 *  The publisher fires an event and knows NOTHING about who listens. Each
 *  listener declares interest with @EventListener. Adding a new reaction to
 *  "order placed" means adding a new listener bean — the publisher does not
 *  change (Open/Closed principle).
 *
 *  GOOD TO KNOW
 *  ------------
 *    • Since Spring 4.2 an event is any plain object — no base class needed.
 *    • Listeners run SYNCHRONOUSLY on the caller thread by default
 *      (add @Async + @EnableAsync to detach them).
 *    • This is the same thinking that scales up to Kafka events between
 *      services — here it is inside one Java Virtual Machine.
 * ============================================================================
 */
@Configuration
@ComponentScan(basePackageClasses = ApplicationEventsExample.class)
public class ApplicationEventsExample {

    public static void main(String[] args) {
        System.out.println("=== Application events (Observer pattern) ===");
        try (var context = new AnnotationConfigApplicationContext(ApplicationEventsExample.class)) {
            context.getBean(OrderService.class).placeOrder("order-42");
        }
    }

    /** The event: an immutable fact that already happened. */
    record OrderPlaced(String orderId) {}

    @Component
    static class OrderService {
        private final ApplicationEventPublisher publisher;

        OrderService(ApplicationEventPublisher publisher) {
            this.publisher = publisher;
        }

        void placeOrder(String orderId) {
            System.out.println("[service]  order placed: " + orderId);
            publisher.publishEvent(new OrderPlaced(orderId));   // fire and forget
            System.out.println("[service]  publisher does not know who reacted");
        }
    }

    @Component
    static class EmailListener {
        @EventListener
        void on(OrderPlaced event) {
            System.out.println("[email]    sending confirmation for " + event.orderId());
        }
    }

    @Component
    static class LoyaltyListener {
        @EventListener
        void on(OrderPlaced event) {
            System.out.println("[loyalty]  granting points for " + event.orderId());
        }
    }
}
