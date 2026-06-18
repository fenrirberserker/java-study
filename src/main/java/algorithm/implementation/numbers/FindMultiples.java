package algorithm.implementation.numbers;

import java.util.Arrays;

/**
 * Finds the first pair of values in the array whose product equals target, or an
 * empty array when no such pair exists. Brute force over every pair, O(n^2).
 */
public class FindMultiples {

    public static void main(String[] args) {
        int[] nums = {2, 4, 1, 6, 5, 40, -1};
        System.out.println("pair with product 20 = " + Arrays.toString(findMultiples(20, nums)));
    }

    public static int[] findMultiples(int target, int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] * array[j] == target) {
                    return new int[]{array[i], array[j]};
                }
            }
        }
        return new int[0];
    }
}
