package algorithms.arrays.array;

import java.util.Arrays;

/**
 * Write a function that returns an array of the same length with the squares of the input*
 */
public class SortedSquaredArray {

    public static void main(String[] args) {

        int[] array = {-2,-1,3,4,5,6,7};


        System.out.println("original array: ");
        Arrays.stream(array).forEach(System.out::println);
        System.out.println("squared array: ");
        Arrays.stream(returnSquaredSrray(array)).forEach(System.out::println);

    }

    public static int[] returnSquaredSrray(int[] array){

        int[] squaredarray = new int[array.length];

        for (int i=0;i<array.length;i++){
            squaredarray[i]= array[i]*array[i];
        }

        Arrays.sort(squaredarray);
        return squaredarray;

    }


}
