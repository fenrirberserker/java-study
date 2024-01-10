package algoritmia.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *Write a function that takes in an array of words and returns the smallest array of characters needed to form all of the words.
 * The characters don't need to be in any particular order.
 *
 * For example, the characters ["y", "r", "o", "u"] are needed to form the words ["your", "you", "or", "yo"].
 *
 * Note: the input words won't contain any spaces; however, they might contain punctuation and/or special characters.
 *
 */

public class MinimumCharacterForWords {

    public static void main(String[] args) {

        String[] words = {"this", "that", "did", "deed", "them!", "a"};

        char[] chars = minimumCharactersForWords(words);


    }

    public static char[] minimumCharactersForWords(String[] words) {
        // Write your code here.


        //create a map
        Map<Character, Integer> gen = new HashMap<>();

        //iterate over array
        for(int i=0; i< words.length; i++){
            String current = words[i];
            System.out.println(current);
            Map<Character, Integer> map = new HashMap<>();

            //iterate over strings
            char[] chars = current.toCharArray();
            for(int j=0; j<chars.length; j++){
                char c = chars[j];
                //validate max freq
                map.put(c,map.getOrDefault(c,0)+1);
            }
            for (Map.Entry<Character,Integer> e: map.entrySet()) {
                if(gen.containsKey(e.getKey())){
                    int max = gen.get(e.getKey()) < e.getValue()? e.getValue() :gen.get(e.getKey());
                    gen.replace(e.getKey(),max);
                }else{
                    gen.put(e.getKey(),e.getValue());
                }
            }

        }

        List<Character> list = new ArrayList<>();

        for (Map.Entry<Character,Integer> e: gen.entrySet()) {
            int times = e.getValue();
            for (int j = 0; j < times; j++) {
                list.add(e.getKey());
            }
        }



        System.out.println(gen);
        System.out.println(list);

        char[] arr = new char[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        System.out.println(arr);

        return arr;
    }
}
