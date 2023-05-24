package algoritmia.arrays.array;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Find the element in an array that repeats the most
 */

public class MostFrequent {
    public static void main(String[] args) {
        // NOTE: The following input values are used for testing your solution.

        // mostFrequent(array1) should return 1.
        int[] array1 = {1, 3, 1, 3, 2, 1};
        // mostFrequent(array2) should return 3.
        int[] array2 = {3, 3, 1, 3, 2, 1};
        // mostFrequent(array3) should return null.
        int[] array3 = {};
        // mostFrequent(array4) should return 0.
        int[] array4 = {0};
        // mostFrequent(array5) should return 5.
        int[] array5 = {0, 1, 7, 10, 5, 10, 9, 5, 2, 5};

        int result = mostFrequent(array5);
        System.out.println("Most freq = "+result);


    }

    public static Integer mostFrequent(int[] array) {

        AtomicInteger mostFreq = new AtomicInteger();
        Map<Integer,Integer> map = new TreeMap<>();

        for (int i = 0; i < array.length; i++) {

            if(map.containsKey(array[i])){
                map.replace(array[i],map.get(array[i])+1);
            }else{
                map.put(array[i],1);
            }

        }
        map
                .entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .forEach((entry)->{
            System.out.println(entry.getKey()+" "+entry.getValue());
            mostFreq.set(entry.getKey());
        });
        System.out.println(map);

        return mostFreq.get();

    }
}
