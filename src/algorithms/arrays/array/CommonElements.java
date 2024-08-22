package algorithms.arrays.array;

import java.util.ArrayList;

/**
 * Find the common elements between two arrays
 */

public class CommonElements {
    public static void main(String[] args) {
        // NOTE: The following input values are used for testing your solution.

        int[] array1A = {1, 3, 4, 6, 7, 9};
        int[] array2A = {1, 2, 4, 5, 9, 10};
        // commonElements(array1A, array2A) should return [1, 4, 9] (an array).

        int[] array1B = {1, 2, 9, 10, 11, 12};
        int[] array2B = {0, 1, 2, 3, 4, 5, 8, 9, 10, 12, 14, 15};
        // commonElements(array1B, array2B) should return [1, 2, 9, 10, 12] (an array).

        int[] array1C = {0, 1, 2, 3, 4, 5};
        int[] array2C = {6, 7, 8, 9, 10, 11};
        // common_elements(array1C, array2C) should return [] (an empty array).

        commonElements(array1A,array2A);
    }

    // Implement your solution below.
    // NOTE: Remember to return an Integer array, not an int array.
    public static Integer[] commonElements(int[] array1, int[] array2) {
        int i1 = 0;
        int i2 = 0;
        // Need to use ArrayList because we don't know the size of the resulting
        // array yet. Note that an ArrayList is resizable.
        ArrayList<Integer> result = new ArrayList();
        while(i1 < array1.length && i2 < array2.length){

            if (array1[i1] > array2[i2]) {
                i2 += 1;
            } else if (array1[i1] < array2[i2]){
                i1 += 1;
            } else {
                System.out.println("Common "+array1[i1] +" "+ array2[i2]);
                result.add(array1[i1]);
                i1 += 1;
                i2 += 1;
            }
        }
        // Convert the result to a regular array.
        Integer[] resultInArray = new Integer[result.size()];
        return result.toArray(resultInArray);
    }
}
