package algorithm.concepts.oop.exceptions;

/**
 * ============================================================================
 *  EXCEPTIONS — basic try / catch / finally
 * ============================================================================
 *  An EXCEPTION is an event that disrupts the normal flow of a program. When
 *  thrown, the Java Virtual Machine looks up the call stack for a matching
 *  catch clause; if none is found, the thread terminates.
 *
 *  ANATOMY
 *    try     — code that may throw
 *    catch   — handles a specific exception type (zero or more catches)
 *    finally — ALWAYS runs (even on exception or return); for cleanup
 *
 *  RULE
 *    A try block must be followed by AT LEAST one catch OR a finally
 *    (or both).
 * ============================================================================
 */
public class BasicTryCatch {

    public static void main(String[] args) {

        try {
            int result = 10 / 0;                    // ArithmeticException
            System.out.println("never reached: " + result);
        } catch (ArithmeticException e) {
            System.out.println("caught: " + e.getMessage());
        } finally {
            System.out.println("finally always runs");
        }

        // try with finally only (no catch) — exception still propagates,
        // but finally still runs first.
        try {
            System.out.println("doing work");
        } finally {
            System.out.println("cleanup");
        }
    }
}
