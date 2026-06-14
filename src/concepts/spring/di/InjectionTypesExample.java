package concepts.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * ============================================================================
 *  DEPENDENCY INJECTION TYPES & DISAMBIGUATION — BASICS
 * ============================================================================
 *
 *  THE THREE INJECTION TYPES
 *  -------------------------
 *    1) CONSTRUCTOR (preferred) — dependency can be final (immutability),
 *       the class is trivially testable with 'new', and a missing dependency
 *       fails at startup (fail fast). With a single constructor, @Autowired
 *       is implicit since Spring 4.3.
 *    2) SETTER — for optional or changeable dependencies.
 *    3) FIELD (avoid) — hides the dependency, needs reflection, cannot be
 *       final, and the class cannot be built without a container.
 *
 *  WHEN TWO BEANS IMPLEMENT THE SAME INTERFACE
 *  -------------------------------------------
 *    @Primary             → "pick me by default"
 *    @Qualifier("name")   → "pick exactly this one, by bean name"
 *    (no disambiguation   → NoUniqueBeanDefinitionException at startup)
 * ============================================================================
 */
@Configuration
@ComponentScan(basePackageClasses = InjectionTypesExample.class)
public class InjectionTypesExample {

    public static void main(String[] args) {
        System.out.println("=== Dependency injection types ===");
        try (var context = new AnnotationConfigApplicationContext(InjectionTypesExample.class)) {
            context.getBean(NotificationService.class).notifyUser("alice");
        }
    }

    interface MessageChannel {
        String send(String to);
    }

    /** Two implementations of the same interface → ambiguity must be resolved. */
    @Component
    @Primary                                   // the default candidate
    static class EmailChannel implements MessageChannel {
        public String send(String to) { return "email sent to " + to; }
    }

    @Component("sms")                          // explicit bean name for @Qualifier
    static class SmsChannel implements MessageChannel {
        public String send(String to) { return "sms sent to " + to; }
    }

    @Component
    static class NotificationService {

        // 1) CONSTRUCTOR injection — final field, ambiguity resolved by @Primary
        private final MessageChannel defaultChannel;

        // 3) FIELD injection — shown for comparison; avoid in real code
        @Autowired
        @Qualifier("sms")
        private MessageChannel fieldInjectedChannel;

        // 2) SETTER injection — optional dependency, set after construction
        private MessageChannel setterInjectedChannel;

        NotificationService(MessageChannel defaultChannel) {   // @Autowired implicit
            this.defaultChannel = defaultChannel;
        }

        @Autowired
        void setSetterInjectedChannel(@Qualifier("sms") MessageChannel channel) {
            this.setterInjectedChannel = channel;
        }

        void notifyUser(String user) {
            System.out.println("constructor + @Primary    -> " + defaultChannel.send(user));
            System.out.println("setter      + @Qualifier  -> " + setterInjectedChannel.send(user));
            System.out.println("field       + @Qualifier  -> " + fieldInjectedChannel.send(user));
        }
    }
}
