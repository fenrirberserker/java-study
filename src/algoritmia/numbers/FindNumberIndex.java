package algoritmia.numbers;

import java.util.Arrays;

/**
 *
 * Given an array of numbers
 * return the first and last indexes of a number
 */

public class FindNumberIndex {

    public static void main(String[] args) {

        int[] array = {2,4,5,5,5,5,5,7,9,9};
        int target = 5;

        int[] result = findIndexes(target,array);
        Arrays.stream(result).boxed().forEach(n->{
            System.out.println(n);
        });


    }

    public static int[] findIndexes(int target, int[] arrays){

        int[] resultArray = new int[2];
        int inversei=arrays.length-1;

        for (int i = 0; i < arrays.length; i++) {

            if(arrays[i]==target){
                resultArray[1]=i;//at the end will be the last iteration for i
            }
            if(arrays[inversei]==target){
                resultArray[0]=inversei;//at the end will be the first iteration for inverse
            }
            inversei--;

        }
        return resultArray;

    }
}
