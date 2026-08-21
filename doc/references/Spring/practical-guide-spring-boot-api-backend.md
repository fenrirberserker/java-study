# Practical Guide to Building an API Back End with Spring Boot

Source: Wim Deblauwe, *Practical Guide to Building an API Back End with Spring Boot* (InfoQ mini-book, 2018, Spring Boot 2.0.3, 156 pages). Read in full. Content is version-dated (Spring Boot 2.0, `WebSecurityConfigurerAdapter`-era OAuth2, JUnit 4) but the architectural patterns and testing discipline it teaches are still directly applicable to modern Spring Boot 3.x projects — mentally substitute the current equivalents (Spring Authorization Server / OAuth2 Resource Server starter instead of `spring-security-oauth2-autoconfigure`; JUnit 5). Worked example throughout: a fictional police-reporting API called "CopsBoot."

## Project Shape and Package-by-Feature

The book organizes code by feature/domain (`com.example.copsboot.user`, `com.example.copsboot.report`), each containing its entity, repository, service, and a `web` sub-package for controllers/Data Transfer Objects (DTOs) — rather than the classic layer-first split (`controller/`, `service/`, `repository/`). Rationale: package-by-feature keeps the core abstractions of the project visible in the package tree; package-by-layer scatters a single feature's code across many directories. Worth defaulting to package-by-feature for new services.

## Entity/Primary-Key Design Pattern

- **Early primary-key generation**: generate the identifier (Universally Unique Identifier, or UUID) in application code before construction, not via database auto-increment. Benefits: no "incomplete" object ever exists mid-construction, and `equals()`/`hashCode()` can rely on identity immediately after construction (no null-id edge case).
- **Dedicated ID value classes** (`UserId`, `ReportId`) instead of raw `UUID`/`long` fields, following Vaughn Vernon's *Implementing Domain-Driven Design*. Advantages: the type signature documents intent (`UserId` vs. anonymous `UUID`), the compiler prevents assigning a `UserId` where an `OrderId` is expected, and swapping the underlying primitive type later touches one class instead of every call site.
- Shared `AbstractEntityId<T>` / `AbstractEntity<T>` superclasses centralize `equals()`, `hashCode()`, and `toString()` for every entity/ID pair — avoids re-deriving identity logic per entity.
- ID generation is abstracted behind a `UniqueIdGenerator` interface injected into a custom repository method (`nextId()`), rather than called inline (`UUID.randomUUID()`) — this makes it trivial to swap in a database sequence or distributed ID generator later without touching call sites.

## Spring Data Repository Pattern

Repositories extend `CrudRepository<Entity, IdType>`; Spring Data generates the implementation at runtime. To add custom behavior beyond the standard Create-Read-Update-Delete (CRUD) methods (e.g., `nextId()`), define a `XxxRepositoryCustom` interface, have the main repository interface extend both `CrudRepository` and the custom interface, and provide a `XxxRepositoryImpl` class (the `Impl` suffix is a Spring Data naming convention it detects automatically) — Spring Data merges both sets of methods into the single injectable repository bean.

Query derivation by method-name convention (`findByEmailIgnoreCase(String email)`) generates SQL automatically — no query string or annotation needed for simple lookups. Return `Optional<Entity>` from finder methods to force callers to handle the "not found" case explicitly instead of risking a `NullPointerException`.

## Authentication: OAuth2 Password Grant

The book implements OAuth2 password-grant flow for a mobile-app client talking to its own backend (appropriate only for first-party/trusted clients — third-party integrations should use authorization-code flow instead).

- **Authorization server** vs. **resource server** are separate concerns even when colocated in one Spring Boot app: the authorization server issues/validates tokens (`@EnableAuthorizationServer`); the resource server decides which endpoints require which authenticated principal (`@EnableResourceServer`).
- `UserDetailsService` is the single integration point between the application's own `User` entity and Spring Security — implement `loadUserByUsername`, look up by email (case-insensitive), throw `UsernameNotFoundException` if absent.
- Wrap the domain entity in a class extending Spring Security's `User` (`ApplicationUserDetails`) rather than making the domain entity itself implement `UserDetails` — keeps security machinery (`GrantedAuthority` mapping, credential exposure) out of the domain model. (The book notes the alternative is possible but has three gotchas: authorities must be returned pre-sorted, the entity must become `Serializable`, and Spring Security caches the object so mutations after caching won't be reflected — reasons to prefer the wrapper.)
- Passwords are always hashed with `PasswordEncoder` (`BCryptPasswordEncoder` used here) — hashing is one-way, so even a full database leak doesn't recover plaintext passwords.
- Externalize client ID/secret via `@ConfigurationProperties` POJOs bound to `application-<profile>.properties`, never hard-code credentials in security configuration classes or tests.
- Access tokens are short-lived (`expires_in`); refresh tokens allow obtaining a new access token without re-entering the password, but can themselves expire/be revoked, at which point the user must re-authenticate.

## REST Controllers

- Use `@RestController` (JSON serialization) rather than `@Controller` (server-rendered HTML/Thymeleaf) for Application Programming Interface (API) endpoints.
- **Controllers should be thin.** All business logic belongs in a service class; the controller's job is strictly HTTP concerns (deserialization, validation trigger, status codes, DTO conversion).
- **Never return entities directly from controllers.** Always map to a dedicated DTO. Reasons: the wire format often needs to differ from the persistence shape (hide fields, reformat, aggregate from multiple sources), and directly annotating entities with Jackson serialization annotations tends to accumulate more annotation noise than actual entity logic over time.
- `@AuthenticationPrincipal` injects the current authenticated user's `UserDetails` implementation directly as a controller-method parameter — avoids manually pulling it from `SecurityContextHolder`.
- Custom exceptions annotated `@ResponseStatus(HttpStatus.NOT_FOUND)` let a thrown domain exception (e.g., `UserNotFoundException`) automatically translate to the correct HTTP status without try/catch boilerplate in the controller.
- Centralize cross-cutting exception-to-response mapping in a single `@ControllerAdvice` class with `@ExceptionHandler` methods — e.g., converting Bean Validation's `MethodArgumentNotValidException` into a structured JSON error body listing every failing field and message, instead of letting it collapse into an opaque 400 with no body.

## Validation

- Standard annotations from `javax.validation.constraints` (`@NotNull`, `@Size`, `@Pattern`, etc.) plus Hibernate Validator extensions (`@Email`, `@NotBlank`, `@NotEmpty`, `@URL`, `@Range`, `@CreditCardNumber`) cover most field-level cases. Apply with `@Valid @RequestBody SomeParameters params` on the controller method parameter.
- **Custom field validator**: define an annotation with `@Constraint(validatedBy = SomeValidator.class)`, implement `ConstraintValidator<Annotation, FieldType>`. Good for single-field business rules that built-in annotations can't express (e.g., "description must mention a specific keyword").
- **Custom object/class-level validator**: same mechanism but targeting `ElementType.TYPE` and implementing `ConstraintValidator<Annotation, WholeParameterObject>` — needed when a rule spans multiple fields (e.g., "if `trafficIncident` is true, `numberOfInvolvedCars` must be positive").
- **Validators needing a Spring-managed dependency** (e.g., checking the database for an existing user with the same email) are themselves Spring beans — `ConstraintValidator` implementations can have constructor-injected dependencies (`UserService` etc.) just like any other bean, since Spring's `LocalValidatorFactoryBean` wires them through the application context. This is the pattern to reach for whenever validation logic needs to query external state, not just the object's own fields.
- Test validators directly via `Validation.buildDefaultValidatorFactory().getValidator().validate(object)` and asserting on the returned `ConstraintViolation` set — no need to spin up a controller/MockMvc just to exercise validation logic in isolation.

## Working with a Real Database

- Develop against H2 (in-memory) for speed, but always run integration tests and production against the target database (PostgreSQL in the example) — H2 is not a perfect behavioral substitute for a real relational database, and if migrations are H2-only they're effectively untested.
- **Schema migrations via Flyway** (SQL-script based) or Liquibase (XML-based) — the book default is Flyway. Golden rule: once a migration script has shipped to production, never edit it; Flyway checksums each applied script and refuses to start the app if a previously-applied script's content changed. To alter a shipped schema, always add a new migration file.
- Bootstrap migration scripts by letting Hibernate generate DDL once (`spring.jpa.properties.javax.persistence.schema-generation.scripts.action=create`), then hand-copy/clean the output into a versioned Flyway script — faster than hand-writing DDL from scratch, but the generated script still needs review.
- **Testcontainers** spins up a real, disposable PostgreSQL instance (via Docker) for integration tests, exercising the actual production migration scripts and database engine instead of H2 — closes the gap between what's tested and what runs in production. Config detail: the JDBC URL uses a `jdbc:tc:postgresql://...` prefix that Testcontainers intercepts; host/db-name in the URL are ignored.
- Externalize datasource credentials per environment via `application-<profile>.properties`, and never commit the file containing real secrets — commit a `.template` variant instead and add the real file to `.gitignore`.

## File Upload

- Accept `MultipartFile` as a field on the request parameter object; drop `@RequestBody` from the controller method (multipart form data and a JSON body are mutually exclusive on one request).
- Enforce file-size limits declaratively via `spring.servlet.multipart.max-file-size` / `max-request-size` — Tomcat itself rejects oversized uploads before the controller runs, which means `MockMvc`-based unit tests can't reach that code path (Tomcat isn't started). Testing the actual limit requires a real embedded-server integration test (the book uses REST Assured with `webEnvironment = RANDOM_PORT`).
- By default an oversized upload surfaces as a raw 500 with a stack trace (`MultipartException`) rather than a clean 400 — add an explicit `@ExceptionHandler(MultipartException.class)` to translate it, otherwise clients get an unhelpful, information-leaking error.

## Testing Strategy (recurring theme throughout)

- **Test slicing**: Spring Boot's `@DataJpaTest` (repository layer only) and `@WebMvcTest` (web layer only, mocking the service layer via `@MockBean`) start a fraction of the application context — faster and more focused than `@SpringBootTest`, which boots everything.
- **`@SpringBootTest`** (full context) is reserved for true end-to-end checks, e.g., verifying the whole OAuth2 token-issuing flow actually works wired together.
- Factory classes per entity (`Users.newRandomOfficer()`, `Users.officer()`) centralize test-data construction — a constructor signature change only requires updating the factory, not every test file.
- Compose reusable test setup as a custom meta-annotation (`@CopsbootControllerTest`) built on top of `@WebMvcTest` + `@ContextConfiguration` + `@ActiveProfiles`, avoiding duplicated boilerplate across every controller test class.
- Prefer AssertJ's fluent assertions (`assertThat(x).isEqualTo(y)`) over classic JUnit assertions for readability, and consider writing custom AssertJ assertions for domain-specific checks (e.g., `hasViolationOnPath("email")` for validation results).

## Executable API Documentation (Spring REST Docs)

Rather than hand-maintained API docs that drift from behavior, generate AsciiDoc snippets directly from passing MockMvc-driven tests (`spring-restdocs-mockmvc`). Each test both verifies behavior and produces the exact request/response JSON to embed in the published documentation — the documentation cannot go stale without a test also failing, since `fieldWithPath(...)` assertions fail the build if a documented field is missing or an actual response field is undocumented. Compiled to HTML/PDF via the `asciidoctor-maven-plugin`, typically gated behind a dedicated Maven profile (e.g., `ci`) so it isn't rebuilt on every local `mvn install`.

## Takeaways for a Senior Backend Role

- The recurring principle across every chapter: push a concern (validation, documentation correctness, migration correctness) into something the build enforces automatically, rather than relying on developer discipline.
- DTOs at the API boundary and dedicated ID types are cheap insurance against subtle bugs (wrong ID type passed, entity internals leaking through JSON) and are worth defaulting to even in greenfield services.
- The Testcontainers pattern (test against the real database engine via ephemeral Docker containers) generalizes well beyond PostgreSQL — same idea applies to Kafka, Redis, Elasticsearch, etc., and is now considered standard practice for integration testing (more mainstream in 2026 than it was when this 2018 book was written).
