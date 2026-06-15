package algorithm.implementation.dynamic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Min coins — top-down DP (memoization).
 * Given coin denominations and a target amount, return the minimum number of
 * coins needed, or -1 if impossible.
 * See DynamicBasics.coinChange for the bottom-up (tabulation) version.
 */
public class MinAmountCoins {

    public static void main(String[] args) {
        System.out.println(minCoins(4, List.of(1, 2, 3)));  // 2 (1+3 or 2+2)
    }

    public static int minCoins(int amount, List<Integer> coins) {
        return minCoins(amount, coins, new HashMap<>());
    }

    private static int minCoins(int amount, List<Integer> coins, Map<Integer, Integer> memo) {
        if (amount == 0) return 0;
        if (amount < 0)  return -1;
        if (memo.containsKey(amount)) return memo.get(amount);

        int best = -1;
        for (int coin : coins) {
            int subResult = minCoins(amount - coin, coins, memo);
            if (subResult != -1) {
                int candidate = subResult + 1;
                if (best == -1 || candidate < best) best = candidate;
            }
        }

        memo.put(amount, best);
        return best;
    }
}
