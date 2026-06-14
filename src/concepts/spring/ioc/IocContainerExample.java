package concepts.spring.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * ============================================================================
 *  INVERSION OF CONTROL & THE SPRING CONTAINER — BASICS
 * ============================================================================
 *
 *  WITHOUT Spring: you create and wire objects yourself.
 *      InventoryRepository repo = new InventoryRepository();
 *      OrderService service    = new OrderService(repo);
 *
 *  WITH Spring: you only DECLARE components. The CONTAINER instantiates them,
 *  injects their dependencies and manages their lifecycle. The control over
 *  object creation is INVERTED — from your code to the framework.
 *
 *  TWO WAYS TO DECLARE A BEAN
 *  --------------------------
 *    @Component  on a class YOU own  → found by component scanning
 *    @Bean       on a method inside a @Configuration class → for classes you
 *                do NOT own (third-party) or that need construction logic
 *
 *  EXAMPLES IN THIS CLASS
 *  ----------------------
 *    1) getBean(...)         — asking the container for a ready, wired bean
 *    2) singleton by default — two lookups, one single instance
 *    3) @Bean registration   — managing a "third-party" object
 * ============================================================================
 */
@Configuration
@ComponentScan(basePackageClasses = IocContainerExample.class)
public class IocContainerExample {

    public static void main(String[] args) {
        System.out.println("=== Inversion of Control basics ===");

        // The container reads this configuration class, creates every declared
        // bean and wires them together — before we ask for anything.
        try (var context = new AnnotationConfigApplicationContext(IocContainerExample.class)) {

            // 1) The bean we receive is already constructed AND injected
            OrderService service = context.getBean(OrderService.class);
            service.placeOrder("book-123");

            // 2) Singleton scope (the default): every lookup → the SAME instance
            OrderService again = context.getBean(OrderService.class);
            System.out.println("same instance from two lookups? " + (service == again));

            // 3) The @Bean method below registered an object the scanner
            //    could never discover (imagine it comes from an external jar)
            ThirdPartyClient client = context.getBean(ThirdPartyClient.class);
            System.out.println("third-party bean answered: " + client.ping());

        } // closing the context shuts the singletons down cleanly
    }

    /** Pretend this class ships inside a library: you cannot annotate it. */
    static class ThirdPartyClient {
        String ping() { return "pong"; }
    }

    /** @Bean = "container, call this method once and manage what it returns". */
    @Bean
    ThirdPartyClient thirdPartyClient() {
        return new ThirdPartyClient();
    }

    @Component
    static class InventoryRepository {
        boolean reserve(String productId) {
            System.out.println("  [repository] reserving " + productId);
            return true;
        }
    }

    @Component
    static class OrderService {
        private final InventoryRepository inventory;   // never 'new'-ed by us

        OrderService(InventoryRepository inventory) {  // injected by the container
            this.inventory = inventory;
        }

        void placeOrder(String productId) {
            System.out.println("  [service] placing order for " + productId);
            inventory.reserve(productId);
        }
    }
}
