package algorithm.concepts.spring.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * ============================================================================
 *  BEAN LIFECYCLE & SCOPES — BASICS
 * ============================================================================
 *
 *  LIFECYCLE OF A SINGLETON BEAN
 *  -----------------------------
 *    constructor → dependencies injected → @PostConstruct → ready to use
 *    ... container.close() → @PreDestroy → destroyed
 *
 *  SCOPES SHOWN HERE
 *  -----------------
 *    SINGLETON (default) — ONE instance per container, created eagerly at
 *                          startup, destroyed at shutdown.
 *    PROTOTYPE           — a NEW instance for EVERY getBean() call; the
 *                          container hands it over and forgets it, so
 *                          @PreDestroy is NEVER called for prototypes.
 *
 *  Run the main and read the prints in order — they tell the whole story.
 * ============================================================================
 */
@Configuration
@ComponentScan(basePackageClasses = BeanLifecycleAndScopesExample.class)
public class BeanLifecycleAndScopesExample {

    public static void main(String[] args) {
        System.out.println("=== Bean lifecycle & scopes ===");

        // Creating the container instantiates every SINGLETON eagerly:
        var context = new AnnotationConfigApplicationContext(BeanLifecycleAndScopesExample.class);
        System.out.println("-- container ready --");

        // SINGLETON: both lookups return the very same object
        var s1 = context.getBean(SingletonBean.class);
        var s2 = context.getBean(SingletonBean.class);
        System.out.println("singleton: same instance? " + (s1 == s2));

        // PROTOTYPE: each lookup constructs a brand-new object
        var p1 = context.getBean(PrototypeBean.class);
        var p2 = context.getBean(PrototypeBean.class);
        System.out.println("prototype: same instance? " + (p1 == p2));

        System.out.println("-- closing container --");
        context.close();   // singleton @PreDestroy fires; prototype's never does
    }

    @Component
    static class SingletonBean {
        SingletonBean() {
            System.out.println("[singleton] 1. constructor (instantiation)");
        }

        @PostConstruct
        void init() {
            System.out.println("[singleton] 2. @PostConstruct (dependencies are in, bean about to be ready)");
        }

        @PreDestroy
        void cleanup() {
            System.out.println("[singleton] 3. @PreDestroy (container is shutting down)");
        }
    }

    @Component
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    static class PrototypeBean {
        PrototypeBean() {
            System.out.println("[prototype] constructor — new instance for this getBean() call");
        }

        @PreDestroy
        void cleanup() {
            // The container does not track prototypes after creation:
            System.out.println("[prototype] @PreDestroy — you will NEVER see this line!");
        }
    }
}
