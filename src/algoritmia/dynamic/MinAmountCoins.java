package algoritmia.dynamic;

import java.util.HashMap;
import java.util.List;

/**
 * Given a target
 * and an array
 * return the min combinations of coins to get to the amount of the target
 */
public class MinAmountCoins {

    public static void main(String[] args) {

        int min = min(4,List.of(1,2,3));
        System.out.println("result "+min);

    }

    public static int min(int target, List<Integer> coins){
        return min( target,  coins, new HashMap<>());
    }

    public static int min(int target, List<Integer> coins, HashMap<Integer, Integer> memo){

        if(target==0){
            return 0;
        }

        if(target<0){
            return -1;
        }

        if(memo.containsKey(target)){
            return memo.get(target);
        }

        int minCoins = -1;

        for (int coin:coins){
            int sub = target-coin;
            int subCoins = min(sub,coins, memo);
            if (subCoins != -1){
                int numCoins = subCoins +1;
                if(numCoins < minCoins || minCoins == -1){
                    minCoins = numCoins;
                }
            }
        }

        memo.put(target,minCoins);

        return minCoins;
    }

    //brute force
    /*public static int min(int target, List<Integer> coins){

        if(target==0){
            return 0;
        }

        if(target<0){
            return -1;
        }

        int minCoins = -1;

        for (int coin:coins){
            int sub = target-coin;
            int subCoins = min(sub,coins);
            if (subCoins != -1){
                int numCoins = subCoins +1;
                if(numCoins < minCoins || minCoins == -1){
                    minCoins = numCoins;
                }
            }
        }

        return minCoins;
    }*/


}
