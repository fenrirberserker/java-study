package algorithm.implementation.dynamic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Dynamic Programming basics. It applies when a problem has optimal substructure
 * (the best answer is built from the best answers of subproblems) and overlapping
 * subproblems (a naive recursion keeps solving the same ones).
 *
 * Two styles appear here. Top-down (memoization) keeps the natural recursion but
 * caches each result. Bottom-up (tabulation) fills a table from the smallest
 * subproblem upward, with no recursion and often less memory.
 *
 * Examples: Fibonacci in all three forms (memoized, tabulated, and rolling with
 * O(1) space), counting ways to climb stairs, and the minimum-coins problem
 * where a greedy choice can be wrong but Dynamic Programming is always right.
 */
public class DynamicBasics {

    public static void main(String[] args) {
        System.out.println("=== Dynamic Programming Basics ===");
        System.out.println("fibMemo(10)       = " + fibMemo(10));        // 55
        System.out.println("fibTab(10)        = " + fibTab(10));         // 55
        System.out.println("fibTabRolling(10) = " + fibTabRolling(10));  // 55
        System.out.println("climbStairs(5)    = " + climbStairs(5));     // 8

        // greedy would pick 4+1+1 = 3 coins here; the real minimum is 3+3 = 2
        System.out.println("coinChange(6, {1,3,4}) = " + coinChange(new int[]{1, 3, 4}, 6));
    }

    /** Fibonacci, top-down. Caching each result turns the O(2^n) recursion into O(n). */
    public static long fibMemo(int n) {
        return fibMemo(n, new HashMap<>());
    }

    private static long fibMemo(int n, Map<Integer, Long> memo) {
        if (n <= 1) return n;
        if (memo.containsKey(n)) return memo.get(n);       // already computed, reuse it
        long result = fibMemo(n - 1, memo) + fibMemo(n - 2, memo);
        memo.put(n, result);
        return result;
    }

    /** Fibonacci, bottom-up. Fill dp[i] from the two values below it. Time O(n), space O(n). */
    public static long fibTab(int n) {
        if (n <= 1) return n;
        long[] dp = new long[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    /** Fibonacci with only the last two values kept, so space drops to O(1). */
    public static long fibTabRolling(int n) {
        if (n <= 1) return n;
        long prev2 = 0, prev1 = 1, current = 0;
        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return current;
    }

    /**
     * Ways to climb a staircase of n steps taking 1 or 2 at a time. Reaching
     * step i means arriving from step i-1 or i-2, so the count is Fibonacci-shaped:
     * ways(i) = ways(i-1) + ways(i-2), with one way to stand at the bottom.
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

    /**
     * Minimum number of coins that sum to amount, or -1 if it can't be made.
     * dp[a] is the fewest coins for amount a: for each coin that fits, a is one
     * coin more than the amount a-coin, so dp[a] = 1 + min(dp[a-coin]).
     * Time O(amount * coins.length), space O(amount).
     */
    public static int coinChange(int[] coins, int amount) {
        int unreachable = amount + 1;                      // larger than any real coin count
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, unreachable);
        dp[0] = 0;                                         // zero coins make amount 0
        for (int a = 1; a <= amount; a++) {
            for (int coin : coins) {
                if (coin <= a && dp[a - coin] + 1 < dp[a]) {
                    dp[a] = dp[a - coin] + 1;
                }
            }
        }
        return dp[amount] >= unreachable ? -1 : dp[amount];
    }
}
