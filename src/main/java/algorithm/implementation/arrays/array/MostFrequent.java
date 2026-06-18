package algorithm.implementation.arrays.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Returns the value that appears most often in the array, or null when the array
 * is empty. One pass tallies each value, a second pass keeps the highest tally.
 */
public class MostFrequent {

    public static void main(String[] args) {
        System.out.println("mostFrequent = " + mostFrequent(new int[]{0, 1, 7, 10, 5, 10, 9, 5, 2, 5}));  // 5
    }

    public static Integer mostFrequent(int[] array) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int value : array) {
            counts.merge(value, 1, Integer::sum);
        }

        Integer best = null;
        int bestCount = 0;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > bestCount) {
                best = entry.getKey();
                bestCount = entry.getValue();
            }
        }
        return best;
    }
}
