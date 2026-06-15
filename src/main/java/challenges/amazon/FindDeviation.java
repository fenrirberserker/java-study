package challenges.amazon;

import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

/**
 * Find the difference between the frequency of letters in a String
 */

public class FindDeviation {

    public static void main(String[] args) {



        String s = "bbacabbcaca";

        Integer i = calculateDeviation(s);
        System.out.println("Deviation "+i);


    }

    public static int calculateDeviation(String s){

        Map<Character, Integer> map = new TreeMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.merge(c, 1, Integer::sum);

        }
        System.out.println(map);

        Stream<Map.Entry<Character,Integer>> sorted =
                map.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue());
        IntSummaryStatistics st = sorted.mapToInt(e->e.getValue()).summaryStatistics();

        Integer max = st.getMax();
        Integer min = st.getMin();
        System.out.println("Max "+max);
        System.out.println("Min "+min);

        return max - min;
    }


}
