package algorithm.implementation.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * Generates every k-sized combination of the numbers 1..n. Combinations ignore
 * order, so to avoid repeats each choice only moves forward: once a number is
 * picked, the recursion continues from the next one.
 */
public class Combinations {

    public static void main(String[] args) {
        System.out.println("combinations(4, 2) = " + combinations(4, 2));
    }

    public static List<List<Integer>> combinations(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        build(1, n, k, new ArrayList<>(), result);
        return result;
    }

    private static void build(int start, int n, int k, List<Integer> current, List<List<Integer>> out) {
        if (current.size() == k) {                 // a full combination of k numbers
            out.add(new ArrayList<>(current));
            return;
        }
        for (int value = start; value <= n; value++) {
            current.add(value);
            build(value + 1, n, k, current, out);  // continue from the next number, never reuse one
            current.remove(current.size() - 1);
        }
    }
}
