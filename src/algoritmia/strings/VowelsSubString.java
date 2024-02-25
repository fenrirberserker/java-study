package algoritmia.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Find the substring containing the most number of vowels inside a String
 * where:
 * n = size sub strings
 * s = String
 */
public class VowelsSubString {

    public static void main(String[] args) {

        Map<String,Integer> test = new HashMap<>();
        test.put("caberqiitefg",5);
        test.put("ghmgpkhgfhkmktyrtk",4);


        test.entrySet().stream().forEach(
                e -> findSubstring(e.getKey(),e.getValue())
        );


    }


    public static String findSubstring(String s, int k) {
        // Write your code here
        System.out.println("String "+s);
        System.out.println("Length "+s.length());
        System.out.println("n = "+k);

        //need a map
        //if no vowels, return Not found!
        //if all vowels, return substring start 0
        //iterate over string +count vowels per loop
        //return highest number of vowels
        Map<String, Integer> loopsMap = new HashMap<>();


        int loops = (s.length() - k)+1;
        for (int i = 0; i < loops; i++) {
            String sub = s.substring(i,i+k);
            System.out.println("sub "+sub);
            Map<Character, Integer> map = new HashMap<>();
            for (Character c : sub.toCharArray() ) {
                map.merge(c, 1, Integer::sum);
            }
            System.out.println("loop "+i+" map "+map);
            Integer vowelsCount = map
                    .entrySet()
                    .stream()
                    .filter(e->
                            e.getKey().equals('a') ||
                            e.getKey().equals('e') ||
                            e.getKey().equals('i') ||
                            e.getKey().equals('o') ||
                            e.getKey().equals('u')
                    )
                    .map( e-> e.getValue() )
                    .reduce(0,(a,b) ->  a+b);

            System.out.println("Vowels "+vowelsCount);
            if(vowelsCount>0){
                loopsMap.put(sub,vowelsCount);
            }


        }
        System.out.println("Loops map "+loopsMap);
        Optional<Map.Entry<String, Integer>> res = loopsMap.entrySet().stream().max( (key, val) -> val.getValue());

        String value = res.orElse(Map.entry("Not Found!",0)).getKey();
        System.out.println("Result "+value);
        return value;


    }






}
