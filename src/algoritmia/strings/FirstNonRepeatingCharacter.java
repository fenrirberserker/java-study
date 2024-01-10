package algoritmia.strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Find the character inside a String that doesn't repeat
 * if there are many return first
 * if there are none return null,0
 */

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String s1 = "abcdcaf";
        String s2 = "aaabcccdeeef";

        char result = findFirstNonRepeating(s1);
        System.out.println("result: "+result);
        char result1 = findFirstNonRepeating(s2);
        System.out.println("result1: "+result1);

    }

    public static char findFirstNonRepeating(String s){

        Map<Character, Integer> map = new LinkedHashMap<>();//linkedHashMap keeps the order of insertion

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.replace(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }

        System.out.println(map);
        Optional<Map.Entry<Character,Integer>> result =
        map.entrySet()
                .stream()
                .filter(entry -> {return entry.getValue() == 1;})
                .findFirst();

        char n = '0';
        if(result.isPresent()){
            n = result.get().getKey();
        }else{
            return '0';
        }

        System.out.println("Char non repeating "+n);

        return n;
    }
}
