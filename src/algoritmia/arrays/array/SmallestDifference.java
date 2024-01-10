package algoritmia.arrays.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Return a pair of numbers each from each array
 * that represent the smallest sum
 */

public class SmallestDifference {

    public static void main(String[] args) {

        int[] one = {-1,5,10,20,28,3};
        int[] two ={23,134,137,15,17};

        smallestDifference(one,two);

    }

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {


        Map<Integer,List<Integer>> differences = new TreeMap<>();

        for (int i = 0; i < arrayOne.length ; i++) {
            int first = arrayOne[i];
            for (int j = 0; j < arrayTwo.length; j++) {
                int second = arrayTwo[j];

                //System.out.println("fisrt "+first+" - second "+second+" = "+(first-second));
                int difference = (first-second);
                List<Integer> values = new ArrayList<>();
                values.add(first);
                values.add(second);
                differences.put(difference<0?difference*(-1):difference,values);
            }
        }



        System.out.println(differences);

        List<Integer> pair =

        differences
                .entrySet()
                .stream()
                .findFirst()
                .get()
                .getValue();

        int[] result =
                pair
                .stream()
                .mapToInt(i->i)
                .toArray();

        for (Integer i: result) {
            System.out.println(i);

        }


        return result;
        //return new int[] {};
    }
}
