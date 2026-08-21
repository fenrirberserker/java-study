# Oracle Certified Associate (OCA): Java SE 8 Programmer I (Exam 1Z0-808)

Source: Jeanne Boyarsky and Scott Selikoff, *OCA: Oracle Certified Associate Java SE 8 Programmer I Study Guide* (Sybex/Wiley, 2015, 435 pages). Sampled: full table of contents (exam objective structure), Chapter 1 introduction (Java class structure basics), the end-of-chapter "Exam Essentials" summaries for Chapters 1-2 and 4, and detailed gotcha examples from Chapter 4 (lambdas/`Predicate`) and Chapter 5 (method overriding rules, casting, polymorphism).

This book targets an entry-level certification, so most core content (variables, loops, classes, basic OOP) is already covered by `doc/Study.md`. This reference is intentionally narrow: it captures the **exact, exam-precise rules** around Java's trickier compile-time semantics — the kind of detail a working developer usually gets right by instinct/IDE feedback but can't always articulate crisply, which matters for code review, mentoring, and technical interviews.

## Exam Scope (six chapters/domains)

1. Java Building Blocks — class/file structure, packages/imports, object lifecycle, primitives vs. references, variable scope, garbage collection.
2. Operators and Statements — arithmetic/logical/relational operators, numeric promotion, `if`/`switch`/loops, labeled `break`/`continue`.
3. Core Java Application Programming Interfaces (APIs) — `String`/`StringBuilder`, arrays, `ArrayList`, wrapper classes/autoboxing, `java.time` Date/Time API.
4. Methods and Encapsulation — access modifiers, static vs. instance, method overloading resolution, constructors, encapsulation/immutability, basic lambdas.
5. Class Design — inheritance, method overriding rules, abstract classes, interfaces, polymorphism, casting.
6. Exceptions — checked vs. unchecked, try/catch/finally, multi-catch.

## Precise Rules Worth Having Memorized

### Method Overload Resolution Order
When multiple overloads could match a call, Java prefers, in this exact order:
1. Exact type match (no conversion).
2. Match via widening primitive conversion (e.g., `int` -> `long`).
3. Match via autoboxing (e.g., `int` -> `Integer`).
4. Match via varargs (`...`).

This ordering is a common interview/code-review trap: a method call that "looks like" it should hit the varargs overload will instead silently bind to a boxing or widening overload if one exists, because varargs is the last resort.

### Method Overriding — the Four Compiler Checks
For a nonprivate method overridden in a subclass, the compiler enforces all of:
1. **Same signature** (name + parameter types) as the parent method — a different signature makes it an *overload*, not an override, and the two methods become entirely unrelated (in particular, an "overriding" method with a different signature is free to change its return type arbitrarily, because it isn't actually overriding anything).
2. **Equal or wider accessibility** than the parent method (cannot narrow `protected` down to `private`, for example).
3. **No new or broader checked exception** than the parent method declares (a child method may narrow, eliminate, or replace a checked exception with a subclass of the original, but never introduce a broader or unrelated checked exception).
4. **Covariant return type** — the overriding method's return type must be the same type or a subtype of the parent method's return type.

A subtle consequence of rule 1: if you intend to override a method but the parameter list doesn't match exactly, the compiler treats it as an overload instead, and none of rules 2-4 apply — which is precisely why an "override" with a narrower access modifier or an unrelated return type can sometimes compile without error (it silently became an overload).

### `this`/`super` and Accidental Recursion
Calling an unqualified method name from within an overriding method invokes the *current* class's version, not the parent's, even from inside the override itself. Omitting `super.` when the intent was to call the parent implementation produces infinite recursion (a runtime `StackOverflowError`), not a compile error — a classic subtle bug, not just an exam trick.

### Casting and `ClassCastException`
- Casting between two reference types that share no relationship in the class hierarchy known to the compiler is a **compile-time error**.
- Casting between related types (e.g., a supertype reference down to a subtype) always **compiles**, but throws `ClassCastException` at **runtime** if the actual object isn't an instance of the target type. The compiler only checks static type relationships, not the object's actual runtime type.
- `instanceof` is the standard guard against this: check membership before casting down to avoid the runtime exception.

### Polymorphism / Virtual Methods
All non-final, non-static, non-private Java methods are "virtual" — the implementation that actually runs is resolved by the object's runtime type, not the reference's declared (compile-time) type, even when the call happens from inside a method defined on the supertype. This is why a superclass method that calls an overridable method internally can end up executing subclass behavior it has no static knowledge of ("template method" pattern relies on exactly this).

**Polymorphic parameters** (accepting a supertype or interface type as a method parameter, e.g., `void feed(Reptile r)` instead of a specific subclass) is called out explicitly as a code-reusability best practice — prefer the interface type (`List`) over a concrete implementation type (`ArrayList`) in method signatures whenever the caller doesn't need implementation-specific behavior, for the same reason "program to an interface, not an implementation" is a general design principle (see `doc/references/Design Patterns/`).

### Lambda Syntax Gotchas (Java 8 baseline, `Predicate<T>` scope)
- Parentheses around the parameter list are optional **only** when there is exactly one parameter and its type is not explicitly declared.
- If braces `{ }` are used for the lambda body, an explicit `return` statement and semicolon are required even for a single expression; the concise `a -> a.startsWith("test")` form (no braces) omits both.
- A lambda cannot redeclare a variable name that shadows one of its own parameter names (`(a, b) -> { int a = 0; ... }` does not compile) — Java's "no local variable redeclaration" rule applies inside the lambda body too.
- `Predicate<T>` (`java.util.function`) is the single-abstract-method interface most central to this exam's lambda coverage: `boolean test(T t)`. `ArrayList.removeIf(Predicate)` is the one built-in collection method the exam expects you to combine with a lambda, e.g., `list.removeIf(s -> s.charAt(0) != 'h')` instead of a manual loop with an iterator.

## Initialization Order (frequently tested, easy to get wrong under pressure)

For object construction, Java initializes in this fixed order:
1. Superclass initialization (recursively, all the way up the hierarchy).
2. Static variables and static initializer blocks, in the order they appear in the class.
3. Instance variables and instance initializer blocks, in the order they appear in the class.
4. The constructor body.

Static initialization happens once per class (at class-loading time), while instance initialization repeats on every object construction — a distinction worth being explicit about when explaining "why does this field have value X the second time" bugs.

## Access Modifier Summary

| Modifier | Same class | Same package | Subclass (different package) | World |
|---|---|---|---|---|
| `private` | yes | no | no | no |
| default (package-private) | yes | yes | no | no |
| `protected` | yes | yes | yes | no |
| `public` | yes | yes | yes | yes |

Static members are accessed through the class name from outside the class; instance members can call static members freely, but static members cannot call instance members without an explicit object reference (there is no implicit `this` in a static context).

## Takeaways for a Senior Backend Java Developer

- The overload-resolution order (exact match -> widening -> autoboxing -> varargs) and the four override-compatibility rules are the two most reliably interview-relevant, easy-to-misstate pieces of this book — worth having crisp, correct one-sentence answers ready for both.
- The "casting compiles but throws at runtime vs. doesn't compile at all" distinction is a good example to reach for when explaining the difference between compile-time and runtime type checking to a junior developer.
- Certification-exam-style question banks (this book's "Review Questions" per chapter) are a reasonable low-effort way to stress-test whether these rules are actually internalized versus just recognized when read — worth doing a timed self-quiz pass if preparing for a Java-heavy technical interview.
