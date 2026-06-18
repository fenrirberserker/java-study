package algorithm.implementation.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Backtracking basics: a recursive depth-first walk through a decision tree that
 * abandons a partial candidate the moment it can't lead to a valid solution, and
 * undoes each choice on the way back up.
 *
 * Examples here: permutations (all n! orderings), subsets (the 2^n powerset),
 * and the classic N-Queens constraint problem.
 */
public class BacktrackingBasics {

    public static void main(String[] args) {
        System.out.println("=== Backtracking Basics ===");
        System.out.println("permutations([1,2,3]) = " + permutations(new int[]{1, 2, 3}));
        System.out.println("subsets([1,2,3])      = " + subsets(new int[]{1, 2, 3}));

        List<int[]> queens = solveNQueens(4);
        System.out.println("N-Queens(4) -> " + queens.size() + " solution(s):");
        for (int[] solution : queens) printBoard(solution);
    }

    /**
     * All orderings of the input. The state is the permutation built so far plus
     * a used[] flag per number so the same one is never placed twice.
     */
    public static List<List<Integer>> permutations(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permute(nums, new boolean[nums.length], new ArrayList<>(), result);
        return result;
    }

    private static void permute(int[] nums, boolean[] used, List<Integer> current, List<List<Integer>> out) {
        if (current.size() == nums.length) {       // a complete ordering
            out.add(new ArrayList<>(current));     // copy it, since current keeps mutating
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;                 // skip numbers already in this permutation

            used[i] = true;                        // take nums[i]
            current.add(nums[i]);
            permute(nums, used, current, out);     // recurse with that choice in place
            used[i] = false;                       // undo it and let the next number try this slot
            current.remove(current.size() - 1);
        }
    }

    /**
     * The 2^n subsets. At each index there is one binary decision: leave the
     * element out, or put it in.
     */
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        buildSubsets(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private static void buildSubsets(int[] nums, int index, List<Integer> current, List<List<Integer>> out) {
        if (index == nums.length) {                // every element has been decided
            out.add(new ArrayList<>(current));
            return;
        }
        // branch that leaves nums[index] out
        buildSubsets(nums, index + 1, current, out);

        // branch that includes nums[index], then undoes it before returning
        current.add(nums[index]);
        buildSubsets(nums, index + 1, current, out);
        current.remove(current.size() - 1);
    }

    /**
     * Place n queens on an n×n board with no two sharing a row, column or
     * diagonal. One queen goes in each row, so queens[row] holds its column and
     * only column and diagonal clashes need checking.
     */
    public static List<int[]> solveNQueens(int n) {
        List<int[]> solutions = new ArrayList<>();
        placeQueen(0, new int[n], solutions);
        return solutions;
    }

    private static void placeQueen(int row, int[] queens, List<int[]> solutions) {
        if (row == queens.length) {                // a queen sits safely in every row
            solutions.add(queens.clone());
            return;
        }
        for (int col = 0; col < queens.length; col++) {
            if (isSafe(queens, row, col)) {        // prune clashing columns before recursing
                queens[row] = col;
                placeQueen(row + 1, queens, solutions);
                // no explicit undo needed: the next column just overwrites queens[row]
            }
        }
    }

    /** True if a queen at (row, col) attacks none of the queens already placed above it. */
    private static boolean isSafe(int[] queens, int row, int col) {
        for (int r = 0; r < row; r++) {
            int c = queens[r];
            if (c == col) return false;                                 // same column
            if (Math.abs(c - col) == Math.abs(r - row)) return false;   // same diagonal
        }
        return true;
    }

    private static void printBoard(int[] queens) {
        int n = queens.length;
        for (int r = 0; r < n; r++) {
            StringBuilder row = new StringBuilder();
            for (int c = 0; c < n; c++) row.append(queens[r] == c ? "Q " : ". ");
            System.out.println("   " + row);
        }
        System.out.println();
    }
}
