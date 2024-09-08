package algorithms.greedy;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Given an array of ints representing denominations and an integer representing target change
 * return the List of coins that add up to that target
 *
 * *unlimited coins*
 */
public class ChangeCombinations {

    public static void main(String[] args) {


        int[][] samples = {
                {6,1,3,4},//not an optimal solution, should be [3,3]
                {18,5,2,1}//an optimal solution
        };

        for (int i = 0; i < samples.length; i++) {
            int target = samples[i][0];//first elem is target
            int[] array = Arrays.copyOfRange(samples[i], 1, samples[i].length); //from index 1 to arr.length is the array
            List<Integer> result = numberOfWaysToMakeChange(target,array);
            System.out.println("Coins used to make change: " + result);

        }


    }

    public static List<Integer> numberOfWaysToMakeChange(int n, int[] denoms) {

        List<Integer> result = new ArrayList<>();
        int sum = 0;

        List<Integer> ordered = Arrays.stream(denoms).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        System.out.println("ordered list: " + ordered);

        // Iterate over the denominations
        for (int coin : ordered) {
            while (sum + coin <= n) {  // Add the coin as long as it doesn't exceed n
                result.add(coin);
                sum += coin;
            }
            if (sum == n) {  // If the target sum is reached, break out of the loop
                break;
            }
        }

        // Return the list of coins used to make the change
        return result;
    }
}
