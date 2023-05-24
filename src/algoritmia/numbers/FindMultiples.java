package algoritmia.numbers;

import java.util.Arrays;

/**
 * Find 2 numbers in a given array that are multiple of a target num
 */
public class FindMultiples {

    public static void main(String[] args) {
        int[] nums = {2,4,1,6,5,40,-1};
        int target = 20;

        int[] result = findMultiples(target,nums);
        System.out.println("Result: ");
        for (int n: result) {
            System.out.println(n);
        }
    }

    public static int[] findMultiples(int target, int[] array){//brute force

        int[] pairs = new int[2];

        for (int i = 0; i <array.length-1 ; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]*array[j]==target){
                    pairs[0]=array[i];
                    pairs[1]=array[j];
                    return pairs;
                }
            }

        }
        return pairs;
    }


}
