package algoritmia.arrays.array;

/**
 *
 * Write a function that takes in an array of integers and returns a boolean representing whether the array is monotonic.
 *
 * An array is said to be monotonic if its elements, from left to right, are entirely non-increasing or entirely non-decreasing.
 *
 * Non-increasing elements aren't necessarily exclusively decreasing; they simply don't increase.
 * Similarly, non-decreasing elements aren't necessarily exclusively increasing; they simply don't decrease.
 *
 * Note that empty arrays and arrays of one element are monotonic.
 */

public class MonotonicArray {

    public static void main(String[] args) {

        int[] array = {-1, -5, -10, -1100, -1100, -1101, -1102, -9001};
        boolean result = isMonotonic(array);
        System.out.println("Result "+result);

    }

    public static boolean isMonotonic(int[] array) {
        // Write your code here.

        boolean result = true;

        if(array[0]<array[1]){
            result = isDecrease(array);
        }else if(array[0]>array[1]){
            result = isIncrease(array);
        }



        return result;
    }

    public static boolean isIncrease(int[] array){
        for(int i=0; i<array.length-1; i++){
            if(!(array[i] >= array[i+1])){
                return false;
            }

        }
        return true;
    }

    public static boolean isDecrease(int[] array){
        for(int i=0; i<array.length-1; i++){
            if(!(array[i] <= array[i+1])){
                return false;
            }

        }
        return true;

    }
}
