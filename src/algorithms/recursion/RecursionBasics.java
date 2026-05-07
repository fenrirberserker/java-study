package algorithms.recursion;

/**
 * ============================================================================
 *  RECURSION — BASICS
 * ============================================================================
 *
 *  A recursive method calls itself with a "smaller" input until it hits a
 *  BASE CASE that returns a known answer. The JVM uses the call stack to
 *  remember each pending call.
 *
 *  ANATOMY OF A RECURSIVE METHOD
 *  -----------------------------
 *    1) BASE CASE       → stops the recursion (mandatory!)
 *    2) RECURSIVE CASE  → calls itself with a smaller input
 *    3) PROGRESS        → each call must move toward the base case
 *
 *  COMPLEXITY
 *  ----------
 *    • Time:  depends on the recurrence (e.g. factorial → O(n), naive fib → O(2^n))
 *    • Space: O(depth of recursion) for the call stack
 *
 *  WARNING
 *  -------
 *    Java does NOT optimize tail calls. Very deep recursion → StackOverflowError.
 *
 *  This class shows the four most-iconic introductory examples:
 *    1) factorial(n)        — single recursive call
 *    2) sumToN(n)           — accumulator pattern
 *    3) fibonacci(n)        — multiple recursive calls (exponential!)
 *    4) reverseString(s)    — recursion on data, not numbers
 * ============================================================================
 */
public class RecursionBasics {

    public static void main(String[] args) {
        System.out.println("=== Recursion Basics ===");

        // 1) factorial: 5! = 5*4*3*2*1 = 120
        System.out.println("factorial(5)      = " + factorial(5));

        // 2) sum from 1 to n: 1+2+3+4+5 = 15
        System.out.println("sumToN(5)         = " + sumToN(5));

        // 3) fibonacci: 0,1,1,2,3,5,8 → fib(6) = 8
        System.out.println("fibonacci(6)      = " + fibonacci(6));

        // 4) reverse a string
        System.out.println("reverse(\"hello\") = " + reverseString("hello"));
    }

    /* ----------------------------------------------------------------- */
    /* 1) FACTORIAL — classic single-branch recursion                    */
    /* ----------------------------------------------------------------- */
    /**
     * factorial(n) = n * (n-1) * (n-2) * ... * 1
     * Base case:    factorial(0) = 1
     */
    public static long factorial(int n) {
        if (n == 0) return 1;             // BASE CASE
        return n * factorial(n - 1);      // RECURSIVE CASE (n shrinks → progress)
    }

    /* ----------------------------------------------------------------- */
    /* 2) SUM 1..N — same shape, different operation                     */
    /* ----------------------------------------------------------------- */
    public static int sumToN(int n) {
        if (n <= 0) return 0;             // BASE CASE
        return n + sumToN(n - 1);         // RECURSIVE CASE
    }

    /* ----------------------------------------------------------------- */
    /* 3) FIBONACCI — TWO recursive calls per step (tree recursion)      */
    /* ----------------------------------------------------------------- */
    /**
     * fib(n) = fib(n-1) + fib(n-2),  fib(0)=0, fib(1)=1
     *
     * NOTE: this implementation is O(2^n). Try fibonacci(40) and feel the lag.
     *       To fix it, see the Dynamic Programming chapter (memoization).
     */
    public static int fibonacci(int n) {
        if (n <= 1) return n;                              // BASE CASES (0,1)
        return fibonacci(n - 1) + fibonacci(n - 2);        // RECURSIVE CASE
    }

    /* ----------------------------------------------------------------- */
    /* 4) REVERSE STRING — recursion on a data structure                 */
    /* ----------------------------------------------------------------- */
    /**
     * reverse("hello") = reverse("ello") + "h" = "olleh"
     */
    public static String reverseString(String s) {
        if (s == null || s.length() <= 1) return s;        // BASE CASE
        return reverseString(s.substring(1)) + s.charAt(0); // RECURSIVE CASE
    }

}
