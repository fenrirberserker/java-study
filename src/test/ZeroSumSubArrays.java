package test;

import java.util.ArrayList;
import java.util.List;

/**
 * You're given a list of integers nums. Write a function that returns a boolean representing whether there exists a zero-sum subarray of nums.
 *
 * A zero-sum subarray is any subarray where all of the values add up to zero.
 * A subarray is any contiguous section of the array.
 * For the purposes of this problem, a subarray can be as small as one element and as long as the original array.
 */

public class ZeroSumSubArrays {

    public static void main(String[] args) {

        int[] array = {-5, -5, 2, 3, -2};
        
        boolean result = zeroSumSubarray(array);
        System.out.println("Result is "+result);

    }

    public static boolean zeroSumSubarray(int[] nums) {
        // Write your code here.
        int elems = nums.length;
        int target =0;
        List<Integer> pointers = new ArrayList<Integer>();
        int i=1;
        while(i<=elems){//num pointers

            System.out.println("Nums: "+i);


            int sum = 0;
            for(int j=0;j< i;j++){//put pointers
                pointers.add(j,nums[j]);
                int val = pointers.get(j);
                System.out.println("Pointer pos: "+j+": "+val);
                System.out.println("Pointers size() "+pointers.size());

            }
            for (int j = elems-(elems-pointers.size())-1; j >=0 ; j--) {
                int start = j;
                int end = (j+(elems-i));
                System.out.println("Pointer start "+j);
                System.out.println("Pointer end "+end);
                for (int k = start; k <= end; k++) {
                    int value = nums[k];

                    System.out.println("Iter "+k+" "+value);
                    sum+=value;
                    System.out.println("sum: "+sum);
                    if(sum==0){
                        return true;
                    }
                }
            }


            pointers.clear();

            i++;
            System.out.println();
        }

        return false;
    }
}
