package algorithm.implementation.arrays.array;

import java.util.Arrays;

/**
 * Sorted Squared Array — return a sorted array of squares from a sorted input
 * that may contain negative numbers. Two-pointer approach is O(n).
 */
public class SortedSquaredArray {

    public static void main(String[] args) {
        int[] array = {-2, -1, 3, 4, 5, 6, 7};
        System.out.println("original: " + Arrays.toString(array));
        System.out.println("squared:  " + Arrays.toString(sortedSquares(array)));
    }

    // Two-pointer O(n): compare absolute values at both ends, fill result from largest to smallest.
    public static int[] sortedSquares(int[] array) {
        int[] result = new int[array.length];
        int left  = 0;
        int right = array.length - 1;
        int fill  = array.length - 1;

        while (left <= right) {
            int leftSq  = array[left]  * array[left];
            int rightSq = array[right] * array[right];
            if (leftSq > rightSq) { result[fill--] = leftSq;  left++;  }
            else                  { result[fill--] = rightSq; right--; }
        }
        return result;
    }
}
