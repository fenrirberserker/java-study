package algorithm.implementation.dynamic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * ============================================================================
 *  DYNAMIC PROGRAMMING — BASICS
 * ============================================================================
 *
 *  DP solves problems that exhibit BOTH:
 *    1) OPTIMAL SUBSTRUCTURE     — optimal answer is built from optimal
 *                                   answers of subproblems.
 *    2) OVERLAPPING SUBPROBLEMS  — the same subproblems are solved again and
 *                                   again by a naive recursion.
 *
 *  TWO STYLES OF DP
 *  ----------------
 *    • TOP-DOWN (MEMOIZATION)
 *        Recurse naturally, but CACHE each computed answer.
 *        Easy to write once you have the recursion.
 *
 *    • BOTTOM-UP (TABULATION)
 *        Fill a table from the smallest subproblem upward, iteratively.
 *        Usually more memory- and cache-friendly. No recursion.
 *
 *  5-STEP DESIGN RECIPE
 *  --------------------
 *    1. Define the STATE:    what does dp[i] (or dp[i][j]) mean?
 *    2. Write the RECURRENCE: how is dp[i] built from smaller states?
 *    3. Identify BASE CASES.
 *    4. Pick the ITERATION ORDER (smaller states first).
 *    5. Read the ANSWER out of the table.
 *
 *  EXAMPLES IN THIS CLASS
 *  ----------------------
 *    1) fibMemo(n)       — classic Fibonacci, top-down with a HashMap
 *    2) fibTab(n)        — classic Fibonacci, bottom-up with an array
 *    3) fibTabRolling(n) — bottom-up with O(1) extra space
 *    4) climbStairs(n)   — count ways to reach step n (1 or 2 at a time)
 *    5) coinChange(...)  — MIN coins to make `amount` (where greedy fails!)
 * ============================================================================
 */
public class DynamicBasics {

    public static void main(String[] args) {
        System.out.println("=== Dynamic Programming Basics ===");

        // 1) Fibonacci — three styles, same answer
        System.out.println("fibMemo(10)       = " + fibMemo(10));        // 55
        System.out.println("fibTab(10)        = " + fibTab(10));         // 55
        System.out.println("fibTabRolling(10) = " + fibTabRolling(10));  // 55

        // 2) Climb stairs — fib-like
        System.out.println("climbStairs(5)    = " + climbStairs(5));     // 8

        // 3) Coin change — classic DP win where greedy fails
        int[] coins = {1, 3, 4};
        int amount = 6;
        // Best: 3+3 = 2 coins (greedy would pick 4+1+1 = 3 → wrong)
        System.out.println("coinChange(6, {1,3,4}) = " + coinChange(coins, amount));
    }

    /* ----------------------------------------------------------------- */
    /* 1) FIBONACCI — TOP-DOWN (memoization)                              */
    /* ----------------------------------------------------------------- */
    /**
     *   fib(n) = fib(n-1) + fib(n-2), fib(0)=0, fib(1)=1
     *
     *   Naive recursion is O(2^n). Memoization caches each result → O(n).
     */
    public static long fibMemo(int n) {
        return fibMemoHelper(n, new HashMap<>());
    }

    private static long fibMemoHelper(int n, Map<Integer, Long> memo) {
        if (n <= 1) return n;                              // BASE CASES
        if (memo.containsKey(n)) return memo.get(n);       // CACHE HIT

        long result = fibMemoHelper(n - 1, memo)
                    + fibMemoHelper(n - 2, memo);          // RECURRENCE
        memo.put(n, result);                               // CACHE IT
        return result;
    }

    /* ----------------------------------------------------------------- */
    /* 2) FIBONACCI — BOTTOM-UP (tabulation)                              */
    /* ----------------------------------------------------------------- */
    /**
     * Build the answer iteratively, smallest subproblem first.
     * Time O(n), Space O(n).
     */
    public static long fibTab(int n) {
        if (n <= 1) return n;
        long[] dp = new long[n + 1];
        dp[0] = 0;                                         // BASE CASE
        dp[1] = 1;                                         // BASE CASE
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];                 // RECURRENCE
        }
        return dp[n];                                      // ANSWER
    }

    /* ----------------------------------------------------------------- */
    /* 3) FIBONACCI — BOTTOM-UP with O(1) SPACE (rolling variables)       */
    /* ----------------------------------------------------------------- */
    /**
     * We only ever need the last two values → two variables are enough.
     * Time O(n), Space O(1). This is the pattern you'll use in production.
     */
    public static long fibTabRolling(int n) {
        if (n <= 1) return n;
        long prev2 = 0, prev1 = 1, cur = 0;
        for (int i = 2; i <= n; i++) {
            cur = prev1 + prev2;
            prev2 = prev1;
            prev1 = cur;
        }
        return cur;
    }

    /* ----------------------------------------------------------------- */
    /* 4) CLIMB STAIRS                                                    */
    /* ----------------------------------------------------------------- */
    /**
     * You're at the bottom of a staircase with n steps. Each move you can
     * climb 1 or 2 steps. How many distinct ways can you reach the top?
     *
     * ways(n) = ways(n-1) + ways(n-2)   ← Fibonacci-shaped recurrence
     * ways(0) = 1 (one way: do nothing),  ways(1) = 1
     */
    public static int climbStairs(int n) {
        if (n <= 1) return 1;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    /* ----------------------------------------------------------------- */
    /* 5) COIN CHANGE — MIN COINS                                         */
    /* ----------------------------------------------------------------- */
    /**
     * Given denominations `coins` and a target `amount`, return the MINIMUM
     * number of coins needed to make `amount`, or -1 if impossible.
     *
     * STATE:        dp[a] = minimum coins needed to make amount `a`
     * BASE CASE:    dp[0] = 0
     * RECURRENCE:   dp[a] = 1 + min(dp[a - c])  for every coin c ≤ a
     * ANSWER:       dp[amount]   (or -1 if still "infinity")
     *
     * Time: O(amount × coins.length)    Space: O(amount)
     *
     * ⚠ This is the canonical example where GREEDY IS WRONG but DP is right.
     */
    public static int coinChange(int[] coins, int amount) {
        int INF = amount + 1;                              // sentinel > any real answer
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, INF);
        dp[0] = 0;                                         // BASE CASE

        for (int a = 1; a <= amount; a++) {
            for (int c : coins) {
                if (c <= a && dp[a - c] + 1 < dp[a]) {
                    dp[a] = dp[a - c] + 1;                 // RECURRENCE
                }
            }
        }
        return dp[amount] >= INF ? -1 : dp[amount];        // ANSWER
    }
}
