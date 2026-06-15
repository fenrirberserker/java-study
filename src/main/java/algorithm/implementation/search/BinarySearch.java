package algorithm.implementation.search;

import java.util.Arrays;

/**
 * Binary Search — find a target in a sorted array in O(log n).
 * The array MUST be sorted before searching.
 */
public class BinarySearch {

    public static void main(String[] args) {
        int target = 5;
        int[] array = {7, 9, 6, 3, 4, 5, 8, 2, 1};
        Arrays.sort(array);
        System.out.println("found " + target + "? " + recursive(array, target));
        System.out.println("found " + target + "? " + iterative(array, target));
    }

    public static boolean recursive(int[] array, int target) {
        return recursive(array, target, 0, array.length - 1);
    }

    private static boolean recursive(int[] array, int target, int left, int right) {
        if (left > right) return false;
        int mid = left + (right - left) / 2;  // avoids integer overflow vs (left+right)/2
        if (array[mid] == target)  return true;
        if (target < array[mid])   return recursive(array, target, left, mid - 1);
        return recursive(array, target, mid + 1, right);
    }

    public static boolean iterative(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target)  return true;
            if (target < array[mid])   right = mid - 1;
            else                       left  = mid + 1;
        }
        return false;
    }
}
