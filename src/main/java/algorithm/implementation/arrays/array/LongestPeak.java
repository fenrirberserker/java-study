package algorithm.implementation.arrays.array;

/**
 * Longest Peak — find the maximum number of elements forming a single peak.
 * A peak: strictly increasing to a tip, then strictly decreasing.
 * Minimum valid peak length is 3.
 */
public class LongestPeak {

    public static void main(String[] args) {
        System.out.println(longestPeak(new int[]{1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3})); // 6
        System.out.println(longestPeak(new int[]{1, 3, 2}));                                    // 3
    }

    public static int longestPeak(int[] array) {
        if (array.length < 3) return 0;

        int maxLength = 0;

        for (int tipIndex = 1; tipIndex < array.length - 1; tipIndex++) {
            boolean isPeakTip = array[tipIndex] > array[tipIndex - 1]
                             && array[tipIndex] > array[tipIndex + 1];
            if (!isPeakTip) continue;

            // Expand left while strictly decreasing away from tip
            int leftBound = tipIndex - 1;
            while (leftBound > 0 && array[leftBound - 1] < array[leftBound]) leftBound--;

            // Expand right while strictly decreasing away from tip
            int rightBound = tipIndex + 1;
            while (rightBound < array.length - 1 && array[rightBound + 1] < array[rightBound]) rightBound++;

            maxLength = Math.max(maxLength, rightBound - leftBound + 1);
        }

        return maxLength;
    }
}
