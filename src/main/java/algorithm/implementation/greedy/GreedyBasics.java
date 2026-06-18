package algorithm.implementation.greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Greedy basics. A greedy algorithm builds the answer step by step, always taking
 * the option that looks best right now and never reconsidering earlier choices.
 *
 * That only reaches the optimum when the problem has the greedy-choice property
 * (a global optimum is reachable through local best choices) and optimal
 * substructure (an optimal answer contains optimal sub-answers). The work is
 * usually dominated by a sort, so O(n log n).
 *
 * Examples: coin change (optimal for canonical coin systems, but shown failing on
 * an arbitrary set) and activity selection (provably optimal).
 */
public class GreedyBasics {

    public static void main(String[] args) {
        System.out.println("=== Greedy Basics ===");

        int[] usCoins = {25, 10, 5, 1};
        System.out.println("coinChangeGreedy(63, US)     = " + coinChangeGreedy(63, usCoins));   // 6

        int[][] activities = {{1, 4}, {3, 5}, {0, 6}, {5, 7}, {3, 9}, {5, 9}, {6, 10}, {8, 11}, {8, 12}, {2, 14}, {12, 16}};
        System.out.println("activitySelection            = " + activitySelection(activities));   // 4

        // on this arbitrary set greedy takes 4+1+1 = 3, but the real minimum is 3+3 = 2
        System.out.println("coinChangeGreedy(6, {1,3,4}) = " + coinChangeGreedy(6, new int[]{4, 3, 1})
                         + "  (wrong here, use Dynamic Programming)");
    }

    /**
     * Number of coins to make reminder by repeatedly taking as many of the largest
     * coin as fit. This is optimal only for canonical systems such as US or EUR
     * coins; for arbitrary denominations it can overshoot, as main() shows.
     */
    public static int coinChangeGreedy(int reminder, int[] coins) {
        Arrays.sort(coins);                            // ascending, so the largest coin is last
        int numcoins = 0;
        for (int i = coins.length - 1; i >= 0; i--) {  // walk from the largest coin down
            int current = coins[i];
            numcoins += reminder / current;            // take every coin of this value that fits
            reminder %= current;                       // carry the remainder to smaller coins
        }
        return numcoins;
    }

    /**
     * Maximum number of non-overlapping activities one person can do, given each
     * activity's [start, end]. Sorting by earliest finish and taking every activity
     * that starts after the last one ends leaves the most room for the rest, which
     * is why this is optimal.
     */
    public static int activitySelection(int[][] activities) {
        Arrays.sort(activities, Comparator.comparingInt(activity -> activity[1]));

        int count = 0;
        int lastEnd = Integer.MIN_VALUE;
        for (int[] activity : activities) {
            if (activity[0] >= lastEnd) {              // compatible with the ones already chosen
                count++;
                lastEnd = activity[1];
            }
        }
        return count;
    }
}
