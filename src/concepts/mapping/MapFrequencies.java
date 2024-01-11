package concepts.mapping;

import java.util.HashMap;
import java.util.Map;

public class MapFrequencies {

    public static void main(String[] args) {

        String str = "aaaabbbc";

        Map<Character,Integer> freq = new HashMap<>();


        for (char c: str.toCharArray()  ) {
            System.out.println(c);
            freq.merge(c,1,Integer::sum);
        }
        System.out.println(freq);
    }
}
