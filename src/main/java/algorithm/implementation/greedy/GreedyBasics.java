package algorithm.implementation.greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ============================================================================
 *  GREEDY — BASICS
 * ============================================================================
 *
 *  A greedy algorithm builds the solution step by step, ALWAYS choosing the
 *  option that looks best RIGHT NOW (the "locally optimal" choice), and
 *  NEVER reconsiders past decisions.
 *
 *  WHEN GREEDY IS CORRECT
 *  ----------------------
 *  Greedy gives the OPTIMAL answer only if the problem has both:
 *    • Greedy choice property: the global optimum can be reached by local
 *      optimal choices.
 *    • Optimal substructure:    optimal solution contains optimal sub-solutions.
 *
 *  COMPLEXITY
 *  ----------
 *  Usually dominated by sorting → O(n log n).
 *
 *  EXAMPLES IN THIS CLASS
 *  ----------------------
 *    1) coinChangeGreedy  — works for canonical coin systems (US/EUR coins)
 *    2) activitySelection — pick max non-overlapping intervals (PROVABLY optimal)
 *    3) coinChangeFails   — DEMO of a case where greedy gives a wrong answer
 * ============================================================================
 */
public class GreedyBasics {

    public static void main(String[] args) {
        System.out.println("=== Greedy Basics ===");

        // 1) Coin change with canonical US-style coins → greedy is optimal
        int[] coinsUS = {25, 10, 5, 1};
        int amount = 63; // expect: 2x25 + 1x10 + 0x5 + 3x1 = 6 coins
        System.out.println("coinChangeGreedy(63, US) = " + coinChangeGreedy(amount, coinsUS));

        // 2) Activity selection
        int[][] activities = { {1, 4}, {3, 5}, {0, 6}, {5, 7}, {3, 9}, {5, 9}, {6, 10}, {8, 11}, {8, 12}, {2, 14}, {12, 16} };
        System.out.println("activitySelection         = " + activitySelection(activities));
        // Optimal selection includes 4 activities

        // 3) Greedy FAILS demo: coins {1, 3, 4}, amount = 6
        //    Greedy picks 4+1+1 = 3 coins. Optimal is 3+3 = 2 coins.
        int[] coinsTrap = {4, 3, 1};
        System.out.println("coinChangeGreedy(6, {1,3,4}) = " + coinChangeGreedy(6, coinsTrap)
                         + "   <-- WRONG, optimal = 2 (use Dynamic Programming)");
    }

    /* ----------------------------------------------------------------- */
    /* 1) COIN CHANGE — GREEDY                                           */
    /* ----------------------------------------------------------------- */
    /**
     * Returns the number of coins used to make `reminder` by always picking the
     * largest coin that still fits. Coins must be sorted in DESCENDING order.
     *
     * IMPORTANT: this is OPTIMAL only for "canonical" coin systems
     * (e.g. US: {1,5,10,25}, EUR: {1,2,5,10,20,50}). For arbitrary coin sets
     * it can be wrong — see the demo in main().
     */
    public static int coinChangeGreedy(int reminder, int[] coins) {
        Arrays.sort(coins);                // sort ascending
        System.out.println("coins ordered "+Arrays.toString(coins));
        int numcoins = 0;
        for (int i = coins.length - 1; i >= 0; i--) {  // walk from largest
            int current = coins[i];
            numcoins += reminder / current;               // GREEDY: take as many as possible
            String calc = ("reminder "+reminder+" / current "+current+" = "+(reminder / current));
            reminder %= current;                       // remainder for the next coin
            System.out.println(calc+ " sum "+numcoins);
        }
        return numcoins;
    }

    /* ----------------------------------------------------------------- */
    /* 2) ACTIVITY SELECTION — PROVABLY OPTIMAL GREEDY                    */
    /* ----------------------------------------------------------------- */
    /**
     * Given a set of activities with [start, end] times, return the maximum
     * number of activities that can be performed by a single person, assuming
     * a person can only work on one activity at a time.
     *
     * STRATEGY: sort by EARLIEST FINISH TIME, then keep picking the next
     * activity whose start ≥ last picked finish.
     *
     * Why does this work? Picking the activity that finishes first leaves
     * the most room for future activities → provably optimal.
     */
    public static int activitySelection(int[][] activities) {
        // Sort by end time (index 1)
        Arrays.sort(activities, Comparator.comparingInt(a -> a[1]));

        int count = 0;
        int lastEnd = Integer.MIN_VALUE;
        for (int[] act : activities) {
            if (act[0] >= lastEnd) {           // GREEDY: take it if compatible
                count++;
                lastEnd = act[1];
            }
        }
        return count;
    }
}
