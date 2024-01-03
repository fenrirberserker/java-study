package algoritmia.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a function that takes in an array of unique integers and returns its powerset.
 *
 * The powerset P(X) of a set X is the set of all subsets of X. For example, the powerset of [1,2] is [[], [1], [2], [1,2]].
 *
 * Note that the sets in the powerset do not need to be in any particular order.
 */

public class Powerset {

    public static void main(String[] args) {

        int[] array = {1, 2};

        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        List<List<Integer>> result = powerset(list);
        System.out.println("Result "+result);
    }

    public static List<List<Integer>> powerset(List<Integer> array) {
        // Write your code here.
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());




        for (int i = 0; i < array.size(); i++) {
            int current = array.get(i);
            System.out.println("i "+i+" "+current);
            List<Integer> outer = new ArrayList<>();
            outer.add(current);
            System.out.println("outer "+outer);
//            if(!result.contains(outer))
            result.add(outer);
            System.out.println("res "+result);


            List<List<Integer>> temp = new ArrayList<>();
            for (int j = 0; j < result.size() ; j++) {
                List<Integer> inside = result.get(j);
                System.out.println("inside "+j+" "+inside);
                if(!inside.contains(current)){
                    inside.add(current);
                }

                if(!temp.contains(inside)){
                    temp.add(inside);
                }

            }

            result.addAll(temp);

            System.out.println();
            System.out.println("temp "+temp);
//            List<Integer> all = temp.stream().flatMap(l ->l.stream()).collect(Collectors.toList());
//            System.out.println("all "+all);

        }

        System.out.println(result);


        return result;
    }
}
