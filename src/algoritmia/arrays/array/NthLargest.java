package algoritmia.arrays.array;

import java.util.ArrayList;
import java.util.Arrays;
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

        int[] result = findNthLargest(n,array);

        for (int i:result) {
            System.out.print(i+",");
        }
    }

    public static int[] findNthLargest(int n, int[] array){

        int[] result = new int[n];
        int ir = 0;

        Arrays.sort(array);
        for (int i=array.length-1;i>0;i--){
            if(n==0){
                return result;
            }
            System.out.println(array[i]);
            result[ir]=array[i];
            n--;
            ir++;
        }


        return result;
    }



}
