package algoritmia.arrays.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array
 * and integer n
 * find the nth largest element
 */

public class NthLargest {

    public static void main(String[] args) {
        //ans should be 6
        int[] array = {4,2,9,7,5,6,7,1,3};
        int n = 4;

        int result = findNthLargest(n,array);

        System.out.println("Largets: "+result);
    }

    public static int findNthLargest(int n, int[] array){

        int lastLargest =0;
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            int largest = 0;
            largest = largest(largest, array);
            for (int j = 0; j <array.length ; j++) {
                if(array[j]==largest){
                    array[j]=0;
                }
            }

            if(largest>lastLargest && i==n-1){
                lastLargest=largest;
            }
            System.out.println("lastLargest: "+lastLargest);

        }


        return lastLargest;
    }

    private static int largest(int largest, int[] array) {
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]+" ");
            if(array[j]> largest){
                largest = array[j];
                //array[j]=0;
            }
        }

        System.out.println("Largest: "+ largest);
        return largest;
    }


}
