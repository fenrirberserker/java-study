package algorithm.concepts.spring.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * ============================================================================
 *  PROXIES & ASPECT ORIENTED PROGRAMMING — HOW @Transactional REALLY WORKS
 * ============================================================================
 *
 *  Spring does not modify your class. It wraps the bean in a runtime PROXY
 *  (a generated subclass via CGLIB, or a dynamic proxy for interfaces) and
 *  injects THE PROXY everywhere. The proxy runs the aspect code around your
 *  method. This is exactly the mechanism behind @Transactional, @Cacheable,
 *  @Async and Spring Security method guards.
 *
 *  THE CLASSIC GOTCHA — SELF-INVOCATION
 *  ------------------------------------
 *  Inside the bean, 'this' is the RAW object, not the proxy. So a method
 *  calling another method of the SAME class bypasses the proxy — and the
 *  aspect (or the transaction!) silently does not run.
 *
 *  Here a custom @Logged annotation plays the role of @Transactional, and a
 *  logging aspect plays the role of the transaction interceptor.
 * ============================================================================
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackageClasses = AopProxyExample.class)
public class AopProxyExample {

    public static void main(String[] args) {
        System.out.println("=== Proxies & Aspect Oriented Programming ===");
        try (var context = new AnnotationConfigApplicationContext(AopProxyExample.class)) {
            BankService bank = context.getBean(BankService.class);

            // Proof that we hold a proxy, not the plain class:
            System.out.println("injected type: " + bank.getClass().getSimpleName());

            System.out.println();
            System.out.println("1) EXTERNAL call -> enters through the proxy -> aspect RUNS:");
            bank.transfer("alice", "bob");

            System.out.println();
            System.out.println("2) SELF-INVOCATION -> 'this.transfer()' skips the proxy -> aspect SILENT:");
            bank.transferTwice("alice", "bob");
        }
    }

    /** Stand-in for @Transactional: a marker the aspect reacts to. */
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface Logged {}

    /** The behavior the proxy adds around every @Logged method. */
    @Aspect
    @Component
    static class LoggingAspect {

        @Around("@annotation(logged)")
        Object around(ProceedingJoinPoint joinPoint, Logged logged) throws Throwable {
            String method = joinPoint.getSignature().getName();
            System.out.println("  [aspect] BEFORE " + method + "  <- @Transactional would OPEN the transaction here");
            Object result = joinPoint.proceed();             // the real method
            System.out.println("  [aspect] AFTER  " + method + "  <- COMMIT (or ROLLBACK on exception) here");
            return result;
        }
    }

    @Component
    static class BankService {

        @Logged
        public void transfer(String from, String to) {
            System.out.println("  [bank] transferring " + from + " -> " + to);
        }

        /** Not annotated itself — and it calls the annotated method INTERNALLY. */
        public void transferTwice(String from, String to) {
            // 'this' is the raw object: the proxy never sees these two calls
            transfer(from, to);
            transfer(from, to);
        }
    }
}
