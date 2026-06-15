package algorithm.implementation.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * ============================================================================
 *  BACKTRACKING — BASICS
 * ============================================================================
 *
 *  Backtracking = recursive DFS through a "decision tree" that ABANDONS a
 *  partial candidate as soon as it cannot possibly be completed into a valid
 *  full solution. Whenever we go back up the tree, we UNDO the choice we made.
 *
 *  TEMPLATE
 *  --------
 *      void backtrack(state, choices):
 *          if isSolution(state):
 *              record(state)
 *              return
 *          for choice in choices:
 *              if isValid(state, choice):
 *                  apply(state, choice)        // CHOOSE
 *                  backtrack(state, choices)   // EXPLORE
 *                  undo(state, choice)         // UN-CHOOSE  ← the "back" in "backtracking"
 *
 *  COMPLEXITY
 *  ----------
 *  Worst case O(b^d) (branching factor ^ depth). Pruning ("isValid" check
 *  BEFORE recursing) is what makes backtracking practical.
 *
 *  EXAMPLES IN THIS CLASS
 *  ----------------------
 *    1) permutations([1,2,3])  — generate all n! orderings
 *    2) subsets([1,2,3])       — generate the 2^n subsets (powerset)
 *    3) solveNQueens(4)        — classic constraint problem with pruning
 * ============================================================================
 */
public class BacktrackingBasics {

    public static void main(String[] args) {
        System.out.println("=== Backtracking Basics ===");

        // 1) Permutations of [1,2,3]  → 3! = 6 results
        System.out.println("permutations([1,2,3]) = " + permutations(new int[]{1, 2, 3}));

        // 2) Subsets of [1,2,3]       → 2^3 = 8 results
        System.out.println("subsets([1,2,3])      = " + subsets(new int[]{1, 2, 3}));

        // 3) N-Queens for N=4 → 2 distinct solutions
        List<int[]> sols = solveNQueens(4);
        System.out.println("N-Queens(4) → " + sols.size() + " solution(s):");
        for (int[] s : sols) printBoard(s);
    }

    /* ----------------------------------------------------------------- */
    /* 1) PERMUTATIONS                                                    */
    /* ----------------------------------------------------------------- */
    /**
     * Generates all orderings of the input numbers.
     * State = "current permutation built so far" + "used[] flags".
     */
    public static List<List<Integer>> permutations(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permute(nums, new boolean[nums.length], new ArrayList<>(), result);
        return result;
    }

    private static void permute(int[] nums, boolean[] used, List<Integer> current, List<List<Integer>> out) {
        if (current.size() == nums.length) {       // SOLUTION FOUND
            out.add(new ArrayList<>(current));     // copy! lists are mutable
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;                 // PRUNE: can't reuse a number

            used[i] = true;                        // CHOOSE
            current.add(nums[i]);

            permute(nums, used, current, out);     // EXPLORE

            used[i] = false;                       // UN-CHOOSE (backtrack!)
            current.remove(current.size() - 1);
        }
    }

    /* ----------------------------------------------------------------- */
    /* 2) SUBSETS (powerset)                                              */
    /* ----------------------------------------------------------------- */
    /**
     * For each element we make a binary choice: include it or skip it.
     * That gives us 2^n subsets.
     */
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        buildSubsets(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private static void buildSubsets(int[] nums, int index,
                                     List<Integer> current, List<List<Integer>> out) {
        if (index == nums.length) {                // SOLUTION FOUND (one subset)
            out.add(new ArrayList<>(current));
            return;
        }

        // Choice A: SKIP nums[index]
        buildSubsets(nums, index + 1, current, out);

        // Choice B: INCLUDE nums[index]
        current.add(nums[index]);                  // CHOOSE
        buildSubsets(nums, index + 1, current, out); // EXPLORE
        current.remove(current.size() - 1);        // UN-CHOOSE
    }

    /* ----------------------------------------------------------------- */
    /* 3) N-QUEENS — backtracking with constraint pruning                 */
    /* ----------------------------------------------------------------- */
    /**
     * Place N queens on an N×N board so that no two attack each other
     * (no shared row, column, or diagonal).
     *
     * State: queens[row] = column of the queen placed in `row`.
     * We place one queen per row (rows can't repeat by construction),
     * so we only need to check column + diagonal conflicts.
     */
    public static List<int[]> solveNQueens(int n) {
        List<int[]> solutions = new ArrayList<>();
        placeQueen(0, new int[n], solutions);
        return solutions;
    }

    private static void placeQueen(int row, int[] queens, List<int[]> solutions) {
        int n = queens.length;
        if (row == n) {                            // SOLUTION FOUND
            solutions.add(queens.clone());
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(queens, row, col)) {        // PRUNE invalid placements
                queens[row] = col;                 // CHOOSE
                placeQueen(row + 1, queens, solutions); // EXPLORE
                // UN-CHOOSE is implicit: next iteration overwrites queens[row]
            }
        }
    }

    /** Returns true if placing a queen at (row, col) does not attack any earlier queen. */
    private static boolean isSafe(int[] queens, int row, int col) {
        for (int r = 0; r < row; r++) {
            int c = queens[r];
            if (c == col) return false;                       // same column
            if (Math.abs(c - col) == Math.abs(r - row)) return false; // same diagonal
        }
        return true;
    }

    private static void printBoard(int[] queens) {
        int n = queens.length;
        for (int r = 0; r < n; r++) {
            StringBuilder sb = new StringBuilder();
            for (int c = 0; c < n; c++) sb.append(queens[r] == c ? "Q " : ". ");
            System.out.println("   " + sb);
        }
        System.out.println();
    }
}
