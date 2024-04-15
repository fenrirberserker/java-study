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


        Map<Character,Integer> other = new HashMap<>();
        String str = "aaaaaaaaabcdeeefffffff";

        for (Character c : str.toCharArray() ) {
            other.merge(c, 1, Integer::sum);
        }

        System.out.println(other);



    }
}
