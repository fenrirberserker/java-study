package algorithm.implementation.recursion;

/**
 * Recursion basics: a method that calls itself on a smaller input until it
 * reaches a base case that returns a known answer. The call stack remembers
 * every pending call, so the recursion depth is the extra space it costs.
 *
 * Each method needs three things: a base case that stops it, a recursive case
 * that calls itself, and progress so every call moves toward the base case.
 *
 * Examples here: factorial (one recursive call), sumToN (the same shape),
 * fibonacci (two calls per step, so exponential), and reversing a string
 * (recursion over data rather than numbers).
 */
public class RecursionBasics {

    public static void main(String[] args) {
        System.out.println("=== Recursion Basics ===");
        System.out.println("factorial(5)      = " + factorial(5));        // 120
        System.out.println("sumToN(5)         = " + sumToN(5));           // 15
        System.out.println("fibonacci(6)      = " + fibonacci(6));        // 8
        System.out.println("reverse(\"hello\") = " + reverseString("hello"));
    }

    /** factorial(n) = n * (n-1) * ... * 1, with factorial(0) = 1. Time O(n). */
    public static long factorial(int n) {
        if (n == 0) return 1;             // nothing left to multiply
        return n * factorial(n - 1);      // n shrinks each call, so it always reaches 0
    }

    /** Sum of 1..n. Same single-branch shape as factorial, with addition. */
    public static int sumToN(int n) {
        if (n <= 0) return 0;
        return n + sumToN(n - 1);
    }

    /**
     * fib(n) = fib(n-1) + fib(n-2), with fib(0)=0 and fib(1)=1. Two calls per
     * step make this O(2^n): it recomputes the same values repeatedly. The
     * Dynamic Programming chapter fixes that with memoization.
     */
    public static int fibonacci(int n) {
        if (n <= 1) return n;                              // fib(0)=0, fib(1)=1
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /** reverse("hello") peels off the first char and appends it after reversing the rest. */
    public static String reverseString(String s) {
        if (s == null || s.length() <= 1) return s;        // empty or single char is its own reverse
        return reverseString(s.substring(1)) + s.charAt(0);
    }
}
