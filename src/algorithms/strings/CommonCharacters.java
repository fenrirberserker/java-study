package algorithms.strings;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Write a function that takes in a non-empty list of non-empty strings
 * and returns a list of characters that are common to all strings in the list, ignoring multiplicity.
 *
 * Note that the strings are not guaranteed to only contain alphanumeric characters.
 * The list you return can be in any order.
 */

public class CommonCharacters {

    public static void main(String[] args) {

        String[] strings = {"abc", "bcd", "cbaccd"};
        commonCharacters(strings);

    }

    public static String[] commonCharacters(String[] strings) {
        // Write your code here.

        Map<Character, Long> map = new HashMap<>();
        AtomicReference<String> characters = new AtomicReference<>("");
        List<Character> result = new ArrayList<>();

        String all = Arrays.stream(strings).collect(Collectors.joining());
        System.out.println("all "+all);
        char[] chars = all.toCharArray();
        List<Character> lc = new ArrayList<>();

        for (int i = 0; i < chars.length; i++) {
            lc.add(chars[i]);
        }
        map = lc.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));



        System.out.println(map);

        map.entrySet().forEach(
                e->{
                    boolean contains = true;
                    for (String s: strings) {
                        System.out.println("string "+s);
                        System.out.println("key "+e.getKey());

                        if(!s.contains(e.getKey().toString())){
                            contains = false;
                            break;
                        }
                    }
                    System.out.println("contains "+contains);
                    if(contains)
                        result.add(e.getKey() );
                }
        );


        System.out.println(result);
        String[] asd = new String[result.size()];
        for (int i=0;i<result.size();i++) {
            asd[i] = result.get(i).toString();
            System.out.println(asd[i]);
        }



        return asd;
    }


}
