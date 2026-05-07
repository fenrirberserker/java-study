package concepts.exceptions;

import java.io.IOException;

/**
 * ============================================================================
 *  throw vs throws
 * ============================================================================
 *  throw  — STATEMENT that actually raises an exception object NOW
 *           e.g.  throw new IllegalArgumentException("bad input");
 *
 *  throws — METHOD SIGNATURE clause declaring which CHECKED exceptions the
 *           method may propagate to its caller. Callers must either catch
 *           them or also declare them with throws.
 *
 *  RULES
 *    - Unchecked (RuntimeException) → no need to declare.
 *    - Checked (extends Exception)  → must declare with throws OR catch.
 *    - Overriding methods may throw the same checked exceptions or
 *      narrower ones, never broader ones.
 * ============================================================================
 */
public class ThrowsExample {

    /** Declares the checked exception it may propagate. */
    static void readFile(String name) throws IOException {
        if (name == null) {
            throw new IOException("file name is null");        // throw STATEMENT
        }
        // imagine real I/O here
    }

    /** No throws clause — IllegalArgumentException is unchecked. */
    static void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("age must be >= 0");
        }
    }

    public static void main(String[] args) {
        try {
            readFile(null);
        } catch (IOException e) {
            System.out.println("caught checked: " + e.getMessage());
        }

        try {
            validateAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("caught unchecked: " + e.getMessage());
        }
    }
}
