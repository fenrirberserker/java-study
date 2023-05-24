package algoritmia.strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class FindFirstNonRepeatingIndex {

    public static void main(String[] args) {

        String s1 = "intercontinental";
        Integer i1 = getIndex(s1);
        System.out.println(i1);

        String s2 = "hello";
        Integer i2 = getIndex(s2);
        System.out.println(i2);

    }

    public static Integer getIndex(String string){

        Integer val = -1;

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);

            if (map.containsKey(c)){
                map.replace(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }

        Optional<Map.Entry<Character,Integer>> opt =
        map.entrySet()
                .stream()
                .filter(n->n.getValue()==1)
                .findFirst();
        System.out.println(opt.get());

        if(opt.isPresent()){
            return string.indexOf(opt.get().getKey());
        }

        return val;
    }
}
