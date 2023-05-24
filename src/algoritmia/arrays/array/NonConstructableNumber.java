package algoritmia.arrays.array;

import java.util.Arrays;

/**
 *
 *   Given an array of positive integers representing the values of coins in your
 *   possession, write a function that returns the minimum amount of change (the
 *   minimum sum of money) that you cannot  create. The given coins can have
 *   any positive integer value and aren't necessarily unique (i.e., you can have
 *   multiple coins of the same value).
 *
 *
 *   For example, if you're given coins = [1, 2, 5] , the minimum
 *   amount of change that you can't create is  4 . If you're given no
 *   coins, the minimum amount of change that you can't create is 1
 *   *   *   *
 */
public class NonConstructableNumber {

    public static void main(String[] args) {

        int[] array = {5,7,1,1,2,3,22};

        int result = nonConstructibleChange(array);

        System.out.println("Result: "+result);

    }

    public static int nonConstructibleChange(int[] coins){

        int currentChangeCreated=0;

        //first order the array
        Arrays.sort(coins);

        for (int i = 0; i <coins.length ; i++) {
            if(coins[i]>currentChangeCreated+1){
                return currentChangeCreated+1;
            }
            currentChangeCreated+=coins[i];

        }

        return currentChangeCreated+1;
    }

}
