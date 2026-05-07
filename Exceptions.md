# ⚠️ Exceptions — A Java Study Guide

A focused, practical reference for Java's exception model: how throwing
and catching work, which types belong to which family, and which idioms
to reach for. Every section links to a runnable file under
`src/concepts/exceptions/...`.

---

## 📑 Table of Contents

1. [Concepts & Vocabulary](#1-concepts--vocabulary)
2. [The `Throwable` hierarchy](#2-the-throwable-hierarchy)
3. [Core `Throwable` API](#3-core-throwable-api)
4. [`try` / `catch` / `finally`](#4-try--catch--finally)
5. [Multiple catches and multi-catch](#5-multiple-catches-and-multi-catch)
6. [`throw` vs `throws`](#6-throw-vs-throws)
7. [Checked vs Unchecked](#7-checked-vs-unchecked)
8. [Try-with-resources](#8-try-with-resources)
9. [Exception chaining (causes)](#9-exception-chaining-causes)
10. [Stack traces](#10-stack-traces)
11. [Custom Exceptions](#11-custom-exceptions)
12. [Common standard exceptions](#12-common-standard-exceptions)
13. [Best Practices](#13-best-practices)
14. [Cheat Sheet](#-cheat-sheet)

---

## 1. Concepts & Vocabulary

| Term | Meaning |
|---|---|
| **Exception** | An object representing an event that disrupts the normal flow of a program. Throwing one transfers control to the nearest matching handler. |
| **Throw** | The act of creating an exception object and handing it to the runtime, which then searches the call stack for a handler. |
| **Catch (handler)** | A `catch` block that takes responsibility for an exception of a matching type, replacing the abrupt exit with normal execution. |
| **Propagation** | The runtime's upward search through the call stack for a handler. Each method whose body lacks a matching catch is exited abruptly. |
| **Stack frame** | One activation of a method on the call stack. The chain of frames at the moment an exception is thrown becomes its stack trace. |
| **Stack trace** | The list of stack frames captured when the exception was created — the standard tool for diagnosing where and how an error happened. |
| **Cause** | Another `Throwable` attached to an exception to explain *why* it was thrown. Used when wrapping a low-level failure in a higher-level one. |
| **Suppressed exception** | A secondary exception attached to a primary one, typically thrown by `close()` during a try-with-resources after the body already failed. |
| **Checked exception** | A subclass of `Exception` (but not `RuntimeException`) the compiler forces you to either catch or declare with `throws`. |
| **Unchecked exception** | A `RuntimeException` (or `Error`); no compile-time enforcement. Used for programming errors and broken preconditions. |
| **Error** | A `Throwable` subclass for serious VM-level problems (out of memory, stack overflow). Application code should not try to catch them. |
| **Recovery** | The process of handling an exception and restoring the program to a usable state. Not every exception is recoverable. |

Use exceptions for **exceptional** conditions — situations that are
expected to be rare and that the calling code may want to react to.
Don't use them for ordinary control flow: throwing and catching is
significantly more expensive than a regular branch.

---

## 2. The `Throwable` hierarchy

Every object that can be thrown in Java is a subclass of `Throwable`.
Like every other class in Java, `Throwable` ultimately extends
`java.lang.Object` and (because exceptions need to travel through
network protocols, files, and the like) implements
`java.io.Serializable`. Below `Throwable` the hierarchy splits into
two arms — `Error` (for Java Virtual Machine-level problems your code
should not handle) and `Exception` (for application-level failures),
with `RuntimeException` carving out the unchecked subtree.

```
java.lang.Object
└── java.lang.Throwable                            implements java.io.Serializable
      ├── java.lang.Error                          — serious Java Virtual Machine problems; do NOT catch
      │     ├── java.lang.VirtualMachineError
      │     │     ├── java.lang.OutOfMemoryError
      │     │     ├── java.lang.StackOverflowError
      │     │     ├── java.lang.InternalError
      │     │     └── java.lang.UnknownError
      │     ├── java.lang.LinkageError
      │     │     ├── java.lang.NoClassDefFoundError
      │     │     ├── java.lang.ExceptionInInitializerError
      │     │     ├── java.lang.UnsatisfiedLinkError
      │     │     ├── java.lang.VerifyError
      │     │     └── java.lang.IncompatibleClassChangeError
      │     │           ├── java.lang.AbstractMethodError
      │     │           ├── java.lang.IllegalAccessError
      │     │           ├── java.lang.NoSuchFieldError
      │     │           └── java.lang.NoSuchMethodError
      │     ├── java.lang.AssertionError
      │     ├── java.lang.ThreadDeath                       (deprecated)
      │     ├── java.io.IOError
      │     └── java.lang.annotation.AnnotationFormatError
      │
      └── java.lang.Exception                      — application-level failures
            ├── (checked)                          — must be declared or caught
            │     ├── java.io.IOException
            │     │     ├── java.io.FileNotFoundException
            │     │     ├── java.io.EOFException
            │     │     ├── java.io.InterruptedIOException
            │     │     ├── java.io.UnsupportedEncodingException
            │     │     ├── java.io.NotSerializableException
            │     │     ├── java.io.ObjectStreamException
            │     │     │     ├── java.io.InvalidClassException
            │     │     │     ├── java.io.InvalidObjectException
            │     │     │     └── java.io.StreamCorruptedException
            │     │     ├── java.net.SocketException
            │     │     │     ├── java.net.BindException
            │     │     │     ├── java.net.ConnectException
            │     │     │     └── java.net.NoRouteToHostException
            │     │     ├── java.net.MalformedURLException
            │     │     ├── java.net.UnknownHostException
            │     │     └── java.nio.file.FileSystemException
            │     │           ├── java.nio.file.AccessDeniedException
            │     │           ├── java.nio.file.NoSuchFileException
            │     │           └── java.nio.file.FileAlreadyExistsException
            │     ├── java.sql.SQLException
            │     │     ├── java.sql.SQLTimeoutException
            │     │     ├── java.sql.SQLNonTransientException
            │     │     └── java.sql.SQLTransientException
            │     ├── java.lang.ClassNotFoundException
            │     ├── java.lang.InterruptedException
            │     ├── java.lang.ReflectiveOperationException
            │     │     ├── java.lang.NoSuchMethodException
            │     │     ├── java.lang.NoSuchFieldException
            │     │     ├── java.lang.IllegalAccessException
            │     │     ├── java.lang.InstantiationException
            │     │     └── java.lang.reflect.InvocationTargetException
            │     ├── java.lang.CloneNotSupportedException
            │     ├── java.text.ParseException
            │     ├── java.util.TimeoutException
            │     └── java.util.concurrent.ExecutionException
            │
            └── java.lang.RuntimeException         — unchecked
                  ├── java.lang.NullPointerException
                  ├── java.lang.IllegalArgumentException
                  │     ├── java.lang.NumberFormatException
                  │     └── java.lang.IllegalThreadStateException
                  ├── java.lang.IllegalStateException
                  ├── java.lang.IndexOutOfBoundsException
                  │     ├── java.lang.ArrayIndexOutOfBoundsException
                  │     └── java.lang.StringIndexOutOfBoundsException
                  ├── java.lang.ArithmeticException
                  ├── java.lang.ClassCastException
                  ├── java.lang.UnsupportedOperationException
                  ├── java.util.ConcurrentModificationException
                  ├── java.lang.SecurityException
                  ├── java.lang.ArrayStoreException
                  ├── java.lang.NegativeArraySizeException
                  ├── java.lang.EnumConstantNotPresentException
                  ├── java.lang.TypeNotPresentException
                  ├── java.util.NoSuchElementException
                  │     └── java.util.InputMismatchException
                  ├── java.util.MissingResourceException
                  ├── java.util.EmptyStackException
                  ├── java.util.regex.PatternSyntaxException
                  └── java.lang.reflect.UndeclaredThrowableException
```

The diagram lists fully qualified package names so you can see exactly
which library each exception ships with — for example `java.io` for
stream and file failures, `java.net` for sockets, `java.nio.file` for
the modern file-system application programming interface, `java.sql`
for database access, `java.util.concurrent` for the high-level
concurrency utilities, and `java.lang.reflect` for reflection.

`Error` represents conditions a normal program is not expected to handle.
`Exception` represents anything else, with the `RuntimeException` branch
reserved for **programming errors** the compiler does not force you to
declare.

📁 [src/concepts/exceptions/CheckedVsUncheckedExample.java](src/concepts/exceptions/CheckedVsUncheckedExample.java)

---

## 3. Core `Throwable` API

Every `Throwable` carries the metadata an exception handler needs to
diagnose, log, or wrap it. These methods are inherited by every
exception class in Java.

| Method | Purpose |
|---|---|
| `getMessage()` | Returns the human-readable message supplied at construction (`new IOException("file missing")`). May be `null`. |
| `getLocalizedMessage()` | Like `getMessage()`, but subclasses may override it to localize the text. |
| `getCause()` | Returns the underlying `Throwable` that triggered this one, or `null` if none was set. The basis of exception chaining. |
| `initCause(Throwable)` | Sets the cause once, when the cause was not passed to the constructor. Throws if the cause is already set. |
| `getStackTrace()` | Returns the captured stack frames as a `StackTraceElement[]`, suitable for programmatic inspection. |
| `setStackTrace(StackTraceElement[])` | Replaces the stack trace. Rarely used outside of frameworks that re-throw across boundaries. |
| `printStackTrace()` / `printStackTrace(PrintStream)` | Writes the exception class, message, stack trace, cause chain, and suppressed exceptions to standard error or the given stream. |
| `fillInStackTrace()` | Recaptures the stack trace at the call site. Called automatically by the constructor; can be overridden to skip capture for performance. |
| `addSuppressed(Throwable)` | Attaches a secondary exception to this one. Called automatically by try-with-resources. |
| `getSuppressed()` | Returns the array of suppressed exceptions attached during recovery. |

---

## 4. `try` / `catch` / `finally`

A `try` block guards code that may throw. When an exception escapes the
`try`, the runtime walks the attached `catch` clauses top-to-bottom and
runs the first one whose declared type matches. If no handler matches,
the exception keeps propagating up the call stack.

| Block | Role | When it runs | How many allowed |
|---|---|---|---|
| `try` | Holds the code that may throw. | Always — its body is the entry point of the construct. | Exactly one per construct. |
| `catch (Type e)` | Handles an exception of the declared type (or a subtype). | Only when the `try` body throws an exception that matches the declared type. | Zero or more, ordered most-specific to most-general. |
| `finally` | Performs cleanup that must happen no matter what. | Always — after `try` and after any matching `catch`, even on thrown exceptions, unmatched exceptions, or `return`. | Zero or one per construct. |

A `try` must be followed by **at least one** `catch` or a `finally`
(or both). A `finally` block executes even on `return` — its statements
run before control actually leaves the method.

```java
try {
    risky();                       // code that may throw
} catch (IOException e) {
    log(e);                        // recover or report
} finally {
    cleanup();                     // always runs
}
```

**Caveats to remember:**

- A `return` inside `finally` overrides any `return` or thrown exception from the `try`/`catch` — almost always a bug.
- An exception thrown inside `finally` replaces (and hides) any exception thrown from the `try` block. Prefer try-with-resources, which preserves both via *suppressed* exceptions.
- If the code can avoid throwing, prefer that to catching: exceptions are not free.

📁 [src/concepts/exceptions/BasicTryCatch.java](src/concepts/exceptions/BasicTryCatch.java)

---

## 5. Multiple catches and multi-catch

Multiple `catch` clauses are tested top-down; the first one whose
declared type is a supertype of the thrown exception runs. You must
order them **most-specific to most-general** — listing a parent before
a child is a compile error (the child's catch becomes unreachable).

**Multi-catch** (Java 7+) lets you handle several unrelated types in one
clause when the recovery is identical. The variable is implicitly
`final` inside a multi-catch block — you cannot reassign `e`.

```java
try { ... }
catch (NullPointerException e)            { /* specific */ }
catch (IOException | SQLException e)      { /* multi-catch */ }
catch (RuntimeException e)                { /* general — keep last */ }
```

**More-precise rethrow** (Java 7+): if you `catch (Exception e)` but
the compiler can prove that only `IOException` and `SQLException` can
actually reach that catch, you may declare the enclosing method as
`throws IOException, SQLException` and rethrow `e` — without widening
the signature to `throws Exception`.

📁 [src/concepts/exceptions/MultipleCatchExample.java](src/concepts/exceptions/MultipleCatchExample.java)

---

## 6. `throw` vs `throws`

Two related keywords that are easy to confuse: `throw` is a *statement*
that raises an exception now; `throws` is a *clause* on a method header
that declares which checked exceptions the method might let escape.

| | `throw` | `throws` |
|---|---|---|
| Kind of construct | A *statement* that runs at execution time. | A *clause* on a method or constructor signature, evaluated by the compiler. |
| What it does | Raises an exception immediately, transferring control to the nearest matching handler. | Declares which checked exceptions the method or constructor may let escape to its caller. |
| Where it appears | Inside the method or constructor body. | In the method or constructor header, between the parameter list and the body. |
| Example | `throw new IllegalArgumentException("bad");` | `void load() throws IOException { ... }` |
| Operand / payload | A single `Throwable` instance. | A comma-separated list of one or more checked exception types. |

**Rules:**

- An **unchecked** exception (`RuntimeException` or `Error`) does NOT need to be declared with `throws`, though declaring it for documentation is allowed.
- A **checked** exception MUST be either caught or declared with `throws` — the *handle-or-declare* rule.
- When **overriding** a method, the override may throw the same checked exceptions or **narrower** ones (subclasses or fewer), never broader ones the caller did not expect.
- Constructors can also declare `throws`.

📁 [src/concepts/exceptions/ThrowsExample.java](src/concepts/exceptions/ThrowsExample.java)

---

## 7. Checked vs Unchecked

Java is one of the few mainstream languages that splits exceptions into
two categories at compile time. The distinction is purely about
compiler enforcement, not severity.

| | Checked (`Exception`, excluding `RuntimeException`) | Unchecked (`RuntimeException` and `Error`) |
|---|---|---|
| Base class | Direct or indirect subclass of `Exception` that is NOT a subclass of `RuntimeException`. | Subclass of `RuntimeException` (programming errors) or `Error` (Java Virtual Machine problems). |
| Compiler enforces handling? | Yes — must be caught with `catch` or declared with `throws`. | No — handling is optional; the compiler stays silent. |
| Use for | External, recoverable conditions the caller may reasonably react to (network failure, missing file, malformed parse input). | Programming errors and broken preconditions (null where forbidden, negative size, wrong state). |
| Examples | `IOException`, `SQLException`, `InterruptedException`. | `NullPointerException`, `IllegalArgumentException`, `IllegalStateException`. |
| Must appear in `throws` clause? | Yes, unless caught locally. | No, though declaring it is allowed for documentation. |
| If unhandled at compile time | Compile error — the file does not build. | Compiles cleanly — the failure surfaces only at run time. |
| If unhandled at run time | Propagates up the call stack and may terminate the thread. | Propagates up the call stack and may terminate the thread. |

**Special case — `InterruptedException`:** it is checked, and catching
it without re-asserting the interrupt clears the thread's interrupted
flag. Always either re-throw or call `Thread.currentThread().interrupt()`
in the handler so cancellation is not silently lost.

📁 [src/concepts/exceptions/CheckedVsUncheckedExample.java](src/concepts/exceptions/CheckedVsUncheckedExample.java)

---

## 8. Try-with-resources

Any object implementing `AutoCloseable` (or its subinterface `Closeable`)
can be declared in the header of a `try` statement. Java guarantees
`close()` is called automatically at the end of the block — even when an
exception is thrown — so you cannot forget to release resources.

```java
try (BufferedReader r = new BufferedReader(new FileReader("f.txt"))) {
    return r.readLine();
}   // r.close() runs here automatically
```

**Key facts:**

- Multiple resources may be declared, separated by `;`. They are closed in **reverse** order of declaration — last opened, first closed.
- If the body throws **and** `close()` also throws, the body's exception is the primary one; the `close()` exception is attached as a **suppressed** exception, retrievable via `getSuppressed()`. With a manual `finally`, you would lose one of the two.
- (Java 9+) A variable that is already `final` or *effectively final* may be referenced directly in the resource header — you do not have to re-declare it inside the parentheses.
- `AutoCloseable.close()` may throw any `Exception`; `Closeable.close()` is restricted to `IOException`. Streams, channels, readers, writers, JDBC connections, locks, and most I/O types implement one of them.

📁 [src/concepts/exceptions/TryWithResourcesExample.java](src/concepts/exceptions/TryWithResourcesExample.java)

---

## 9. Exception chaining (causes)

When you catch a low-level exception and throw a higher-level one,
**preserve the original** as the cause. The chain travels with the
exception so the eventual handler can diagnose the root.

```java
try {
    parseConfig(file);
} catch (IOException e) {
    throw new ConfigException("could not load config", e);   // e is the cause
}
```

Internally the chain is just a linked list of `Throwable` references
reachable through `getCause()`. The default `printStackTrace()` walks
the chain and prints each one with a `Caused by:` header. Use chaining
whenever you wrap an exception so a stack trace tells the full story.

If a constructor of an exception class does not accept a cause, set it
afterwards with `initCause(Throwable)` — but only once.

---

## 10. Stack traces

A stack trace is a snapshot of the call stack taken when the exception
was constructed (specifically, by `fillInStackTrace()`, which the
constructor calls). Each entry is a `StackTraceElement` with the class
name, method name, file name, and line number of one frame.

| Method | Purpose |
|---|---|
| `printStackTrace()` | Writes the exception's class, message, stack trace, cause chain, and suppressed exceptions to standard error. |
| `printStackTrace(PrintStream)` / `printStackTrace(PrintWriter)` | Same, but written to a chosen stream — usually a logger. |
| `getStackTrace()` | Returns the frames as a `StackTraceElement[]` for programmatic inspection. |
| `setStackTrace(StackTraceElement[])` | Replaces the captured frames, used when re-throwing across boundaries. |
| `fillInStackTrace()` | Recaptures the trace at the call site. Override to return `this` if you want a "lightweight" exception that does not pay the capture cost (rare). |

**Reading a stack trace top-down:** the first line is the failing call
site; each `at` line below is one frame further up the call stack. A
`Caused by:` block beneath shows the chained cause's own stack trace.

---

## 11. Custom Exceptions

Define your own exception class when no standard type fits, when you
want callers to be able to catch your domain failures specifically, or
when the failure carries extra structured data. Extend `Exception`
for **checked**, or `RuntimeException` for **unchecked**.

A well-behaved custom exception offers four standard constructors so
callers can supply a message, a cause, both, or neither — matching the
constructors of the supertypes:

```java
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException()                                { super(); }
    public InsufficientFundsException(String message)                  { super(message); }
    public InsufficientFundsException(Throwable cause)                 { super(cause); }
    public InsufficientFundsException(String message, Throwable cause) { super(message, cause); }
}
```

For richer reporting you can also add fields (account id, requested
amount, …) with their own getters; expose them through `getMessage()`
or dedicated accessors.

📁 [src/concepts/exceptions/InsufficientFundsException.java](src/concepts/exceptions/InsufficientFundsException.java)
📁 [src/concepts/exceptions/CustomExceptionDemo.java](src/concepts/exceptions/CustomExceptionDemo.java)

---

## 12. Common standard exceptions

A reference of the exceptions you will encounter most often in everyday
Java code, with the situation that produces each one.

**Unchecked — programming errors and broken preconditions**

| Type | Parent | Typical cause |
|---|---|---|
| `NullPointerException` | `RuntimeException` | Dereferencing a `null` reference (method call, field access, array access). |
| `IllegalArgumentException` | `RuntimeException` | A method received an argument that does not satisfy its contract. |
| `NumberFormatException` | `IllegalArgumentException` | `Integer.parseInt`, `Double.parseDouble`, … given a string that is not a number. |
| `IllegalStateException` | `RuntimeException` | The object is not in a state where the call is valid (e.g. iterator after `remove`). |
| `IndexOutOfBoundsException` | `RuntimeException` | Index is negative or out of range. |
| `ArrayIndexOutOfBoundsException` | `IndexOutOfBoundsException` | Array index outside `0 .. length - 1`. |
| `StringIndexOutOfBoundsException` | `IndexOutOfBoundsException` | String index outside `0 .. length() - 1`. |
| `ArithmeticException` | `RuntimeException` | Integer division by zero, decimal overflow, and similar arithmetic faults. |
| `ClassCastException` | `RuntimeException` | A cast that does not match the actual runtime type of the object. |
| `UnsupportedOperationException` | `RuntimeException` | An interface method that is required to exist but is not supported by this implementation (e.g. `List.of(...).add(x)`). |
| `ConcurrentModificationException` | `RuntimeException` | A collection was modified during iteration through a non-concurrent iterator. |
| `ArrayStoreException` | `RuntimeException` | Storing a reference of the wrong type into a covariant array. |
| `SecurityException` | `RuntimeException` | A security check (such as one performed by a `SecurityManager`) refused an operation. |

**Checked — recoverable conditions the caller should be aware of**

| Type | Parent | Typical cause |
|---|---|---|
| `IOException` | `Exception` | Any input/output failure: file missing, network reset, stream closed. |
| `FileNotFoundException` | `IOException` | Open call could not locate the file. |
| `EOFException` | `IOException` | End of stream reached unexpectedly during a read. |
| `SQLException` | `Exception` | A database call failed or returned an error. |
| `ClassNotFoundException` | `ReflectiveOperationException` | `Class.forName(name)` could not load the requested class. |
| `InterruptedException` | `Exception` | A blocking call was interrupted via `Thread.interrupt()`. Always re-assert the flag if you do not rethrow. |
| `CloneNotSupportedException` | `Exception` | `Object.clone()` called on a class that does not implement `Cloneable`. |
| `NoSuchMethodException` | `ReflectiveOperationException` | Reflective method lookup failed. |
| `NoSuchFieldException` | `ReflectiveOperationException` | Reflective field lookup failed. |
| `InvocationTargetException` | `ReflectiveOperationException` | A reflectively invoked method itself threw — the underlying exception is the cause. |

**Errors — do not catch in application code**

| Type | Parent | Typical cause |
|---|---|---|
| `OutOfMemoryError` | `VirtualMachineError` | The heap (or another memory pool) is exhausted. |
| `StackOverflowError` | `VirtualMachineError` | Recursion depth exceeded the thread stack size. |
| `NoClassDefFoundError` | `LinkageError` | The class loader saw the class at compile time but cannot find it now. |
| `ExceptionInInitializerError` | `LinkageError` | A static initializer threw an exception. |
| `AssertionError` | `Error` | A failed `assert` (with `-ea`) or a deliberate invariant failure. |

---

## 13. Best Practices

- **Catch the most specific type** you can handle. Catching `Exception`
  or `Throwable` hides bugs.
- **Never swallow** an exception with an empty catch. At minimum, log
  it with its message and stack trace.
- **Don't use exceptions for control flow.** They are significantly
  slower than ordinary branches and they obscure intent.
- **Preserve the cause** when wrapping: `throw new MyException("...", e);`
  so the root failure survives in the chain.
- **Re-set the interrupt flag** when catching `InterruptedException`
  without re-throwing: `Thread.currentThread().interrupt();`
- **Prefer try-with-resources** over manual `finally` for any
  `AutoCloseable` — it is shorter and preserves suppressed exceptions.
- **Validate inputs early** with `IllegalArgumentException` /
  `IllegalStateException` instead of letting `NullPointerException`
  surface deeper in the call stack with no useful message.
- **Don't catch `Error`.** You usually cannot recover from
  `OutOfMemoryError` or `StackOverflowError`; let the JVM tear down
  cleanly.
- **Throw early, catch late.** Detect failures as close to their cause
  as possible; handle them at the layer that has enough context to react.
- **Document each `throws`** in Javadoc with `@throws` and a description
  of the precondition that produces it.

---

## 🧠 Cheat Sheet

```java
// Basic
try { risky(); }
catch (IOException e) { log(e); }
finally { cleanup(); }

// Multi-catch (same handling)
try { ... }
catch (IOException | SQLException e) { handle(e); }

// Try-with-resources (multiple resources, closed in reverse order)
try (var in  = Files.newInputStream(src);
     var out = Files.newOutputStream(dst)) {
    in.transferTo(out);
}

// Throw
if (x < 0) throw new IllegalArgumentException("x < 0");

// Throws (declare in signature)
void load() throws IOException { ... }

// Wrap & re-throw, preserving cause
try { parse(); }
catch (IOException e) { throw new ConfigException("bad config", e); }

// Re-assert interrupt when catching InterruptedException
try { Thread.sleep(100); }
catch (InterruptedException e) { Thread.currentThread().interrupt(); }

// Inspect chain and suppressed
for (Throwable c = ex; c != null; c = c.getCause()) log(c);
for (Throwable s : ex.getSuppressed()) log(s);
```
