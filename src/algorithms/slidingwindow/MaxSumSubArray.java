package algorithms.slidingwindow;

/**
 * Let's consider a simple scenario where we need to find the maximum sum of a subarray with a fixed length k.
 */

public class MaxSumSubArray {

    public static void main(String[] args) {

        int[][] arrays = {
                {2,1,5,1,3,2},//9
                {3,6,8,9,7,1},//24
                {8,2,7,3,5,1},//17
                {1,6,8,5,9,3},//22
                {3,5,8,2,4,6}//16
        };
        int k = 3;

        for (int i = 0; i < arrays.length; i++) {
//            int result = maxSumSubarray(arrays[i],k);
            int result = findMaxSumSubArray(arrays[i],k);
            System.out.println("result: " + result);
        }



    }

    public static int findMaxSumSubArray(int[] nums, int k) {

        int max = 0;

        for (int i = 0;i<=nums.length-k; i++) {//number of possible iterations
            int sum = 0;
//            System.out.println("iter "+(i));
            for (int j = i; j < (i+k); j++) {//number of positions to sum
//                System.out.println("pos "+j);
                sum += nums[j];
//                System.out.println("sum "+sum);
            }
            if (sum > max) {//if a new max is found, replace max
                max = sum;
            }
        }

        return max;
    }

    public static int maxSumSubarray(int[] arr, int k) {
        // Handle edge case where array length is less than k
        if (arr.length < k) {
            throw new IllegalArgumentException("Array length should be at least as long as k.");
        }

        // Calculate the sum of the first window
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += arr[i];
        }

        // This is the current sum of the first window
        int currentSum = maxSum;

        // Slide the window from left to right over the array
        for (int i = k; i < arr.length; i++) {
            // Subtract the element that is left out of the window and add the new element
            currentSum += arr[i] - arr[i - k];

            // Update maxSum if the current window's sum is greater
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }




}
