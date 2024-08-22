package algorithms.dynamic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an array and a number
 * return true if the number can be the sum of any combination of numbers in the array
 */
public class ArrayAmountSum {

    public static void main(String[] args) {
        int n = 4;
        List<Integer> nums = List.of(1,2,1);

        boolean result = eval(n,nums);
        System.out.println("result "+result);
    }

    public static boolean eval(int n, List<Integer> nums){
        return eval(n,nums,new HashMap<>());
    }

    public static boolean eval(int n, List<Integer> nums, Map<Integer, Boolean> memo){
        if(n==0){
            return true;
        }

        if(n<0){
            return false;
        }

        if(memo.containsKey(n)){
            return memo.get(n);
        }

        for (int num:nums){
            int sub = n-num;
            if(eval(sub,nums,memo)){
                memo.put(n,true);
                return true;
            }
        }

        memo.put(n,false);
        return false;
    }



    //brute force
    /*public static boolean eval(int n, List<Integer> nums){
        if(n==0){
            return true;
        }

        if(n<0){
            return false;
        }

        for (int num:nums){
            int sub = n-num;
            if(eval(sub,nums)){
                return true;
            }
        }


        return false;
    }*/

}
