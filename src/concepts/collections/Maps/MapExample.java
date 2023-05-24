package concepts.collections.Maps;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<Character, Integer> map = new HashMap<>();
        String s = "sagfdsgdsgds";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }



        System.out.println(map);
    }
}
