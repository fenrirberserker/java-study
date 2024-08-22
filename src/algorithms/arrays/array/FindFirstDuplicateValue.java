package algorithms.arrays.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Given an array of integers between 1 and n, inclusive, where n is the length of the array,
 * write a function that returns the first integer that appears more than once (when the array is read from left to right).
 *
 * In other words, out of all the integers that might occur more than once in the input array,
 * your function should return the one whose first duplicate value has the minimum index.
 *
 * If no integer appears more than once, your function should return -1.
 *
 * Note that you're allowed to mutate the input array.
 */

public class FindFirstDuplicateValue {

    public static void main(String[] args) {

        //int[] array = {2, 1, 5, 2, 3, 3, 4};
        int[] array = {2, 1, 5, 3, 3, 2, 4};

        //int first = firstDuplicateValueV1(array);
        int first = firstDuplicateValueV2(array);
        System.out.println(first);

    }

    public static int firstDuplicateValueV1(int[] array) {
        // Write your code here.

        int result = -1;


        Map<Integer, Long> freq = Arrays.stream(array).boxed().
                collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));
        Optional<Map.Entry<Integer, Long>> key = freq.entrySet().stream().filter((e)-> e.getValue()==2).findFirst();


        result = key.isPresent()?key.get().getKey():result;

        System.out.println(freq);
        System.out.println(key);

        return result;
    }

    public static int firstDuplicateValueV2(int[] array) {
        // Write your code here.

        int result = -1;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if(map.containsKey(array[i])){
                int count = map.get(array[i])+1;
                map.replace(array[i], count);
                if(count == 2){
                    return array[i];
                }
            }else{
                map.put(array[i],1);
            }
        }

        System.out.println(map);


        return result;
    }
}
