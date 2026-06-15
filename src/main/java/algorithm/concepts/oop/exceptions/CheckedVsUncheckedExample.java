package algorithm.concepts.oop.exceptions;

/**
 * ============================================================================
 *  CHECKED vs UNCHECKED EXCEPTIONS
 * ============================================================================
 *  Throwable
 *    ├── Error                 — serious problems (OutOfMemoryError,
 *    │                           StackOverflowError). Do NOT catch.
 *    └── Exception             — application-level failures
 *           ├── (checked)      — must be declared with throws or caught
 *           │                    e.g. IOException, SQLException,
 *           │                         ClassNotFoundException, InterruptedException
 *           └── RuntimeException (unchecked) — no compile-time enforcement
 *                  e.g. NullPointerException, IllegalArgumentException,
 *                       ArithmeticException, IndexOutOfBoundsException,
 *                       ClassCastException, NumberFormatException
 *
 *  GUIDELINE
 *    - Use CHECKED for recoverable conditions a caller is expected to handle
 *      (network down, file missing).
 *    - Use UNCHECKED for programming errors / preconditions (null passed,
 *      negative size, wrong state).
 * ============================================================================
 */
public class CheckedVsUncheckedExample {

    public static void main(String[] args) {

        // UNCHECKED — compiler does not force you to handle
        try {
            String s = null;
            s.length();                                     // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("unchecked: " + e);
        }

        try {
            Integer.parseInt("abc");                        // NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("unchecked: " + e);
        }

        try {
            int[] a = new int[2];
            int v = a[10];                                  // ArrayIndexOutOfBoundsException
            System.out.println(v);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("unchecked: " + e);
        }

        // CHECKED would be e.g. throw new java.io.IOException(...)
        // — would not compile without throws or catch (see ThrowsExample).
    }
}
