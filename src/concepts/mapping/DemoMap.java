package concepts.mapping;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {

    public static void main(String[] args) {

        Map<Integer,Integer> map = new HashMap<>();

        map.put(1,3);
        map.put(2,5);
        map.computeIfPresent(2, (k,v) -> k*v );
        map.computeIfAbsent(7,k -> k*k);


        System.out.println(map);


        Map<Character,Integer> mapCountChar = new HashMap<>();
        String str = "aaaaaaaaabcdeeefffffff";

        for (Character c : str.toCharArray() ) {
            mapCountChar.merge(c, 1, Integer::sum);
        }

        System.out.println(mapCountChar);

        Map<Integer, Integer> mapCountNum = new HashMap<>();
        int[] nums = {1, 1, 1, 2, 3, 4, 4, 4, 5, 5, 5, 5, 5};

        for (int n : nums) {
            mapCountNum.merge(n, 1, Integer::sum);
        }

        System.out.println(mapCountNum);



    }
}
