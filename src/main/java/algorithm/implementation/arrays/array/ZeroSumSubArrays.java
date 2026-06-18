package algorithm.implementation.arrays.array;

import java.util.HashSet;
import java.util.Set;

/**
 * Returns whether nums has a contiguous subarray that sums to zero.
 *
 * Running prefix sums make this O(n): if the same prefix sum shows up twice, the
 * elements between those two positions cancel to zero. A prefix sum of zero means
 * the subarray from the start already sums to zero, so the running total begins
 * in the seen set.
 */
public class ZeroSumSubArrays {

    public static void main(String[] args) {
        int[] array = {-5, -5, 2, 3, -2};
        System.out.println("zeroSumSubarray = " + zeroSumSubarray(array));   // true: -5, 2, 3
    }

    public static boolean zeroSumSubarray(int[] nums) {
        Set<Integer> seenSums = new HashSet<>();
        seenSums.add(0);                       // the empty prefix already sums to zero
        int prefix = 0;
        for (int value : nums) {
            prefix += value;
            if (!seenSums.add(prefix)) {       // this prefix sum repeated, so the gap between sums to zero
                return true;
            }
        }
        return false;
    }
}
