package algorithm.concepts.spring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;

/**
 * ============================================================================
 *  @Value & @Profile — EXTERNALIZED CONFIGURATION BASICS
 * ============================================================================
 *
 *  @Value("${key}")          injects one property from the Environment
 *  @Value("${key:default}")  same, with a fallback when the key is missing
 *  @Profile("dev")           the bean only exists when that profile is active
 *
 *  In Spring Boot, properties come from application.properties / yml and the
 *  placeholder resolution is configured automatically. In this plain example
 *  we set a system property in code and register the resolver ourselves, so
 *  the mechanics are visible.
 * ============================================================================
 */
@Configuration
@ComponentScan(basePackageClasses = ValueAndProfilesExample.class)
public class ValueAndProfilesExample {

    public static void main(String[] args) {
        System.out.println("=== @Value & @Profile ===");

        // Normally lives in application.properties; set in code to stay self-contained
        System.setProperty("app.name", "study-app");

        var context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("dev");   // = spring.profiles.active=dev
        context.register(ValueAndProfilesExample.class);
        context.refresh();

        context.getBean(AppInfo.class).print();
        System.out.println("active datasource -> " + context.getBean(DataSourceStub.class).url());
        System.out.println("(rerun with profile 'prod' to get the other bean)");

        context.close();
    }

    /** Boot registers this automatically; plain Spring needs it for ${...} resolution. */
    @Bean
    static PropertySourcesPlaceholderConfigurer propertyResolver() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Component
    static class AppInfo {

        @Value("${app.name}")                  // resolved from the Environment
        private String name;

        @Value("${app.timeout:30}")            // ':' introduces the default value
        private int timeoutSeconds;

        void print() {
            System.out.println("app.name    = " + name);
            System.out.println("app.timeout = " + timeoutSeconds + "  (key missing -> default used)");
        }
    }

    interface DataSourceStub {
        String url();
    }

    @Bean
    @Profile("dev")
    DataSourceStub devDatabase() {
        return () -> "jdbc:h2:mem:dev  (in-memory database, profile 'dev')";
    }

    @Bean
    @Profile("prod")
    DataSourceStub prodDatabase() {
        return () -> "jdbc:postgresql://prod-host/app  (profile 'prod')";
    }
}
