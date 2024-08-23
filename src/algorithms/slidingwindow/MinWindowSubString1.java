package algorithms.slidingwindow;


import java.util.*;
import java.util.function.Predicate;

/**
 * Find all the characters from t in the smallest window in s
 *
 * Return only the first result found
 */

public class MinWindowSubString1 {

    public static void main(String[] args) {
        String[][] s = {
                {"ADOBECODEBANC", "ABC"},// Output: "BANC"
                {"ASUFHUSAFUHSAIU","SHF"}
        };
        for (String[] a : s) {
            System.out.println("result is: "+ minWindow2(a[0], a[1]));
        }


    }

    public static String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }

        int start =0,end=1;
        Map<Character, Integer> target = new HashMap<>();

        for (char c : t.toCharArray()) {
            target.merge(c,1,Integer::sum);
        }
        List<String> subStrings = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            System.out.println("start "+start);
            System.out.println("end "+end);
            String sub = s.substring(start,end);
            System.out.println("substring "+sub);
            System.out.println("target "+t);
            Map<Character,Integer> smap = new HashMap<>();
            for(char c: sub.toCharArray()){
                smap.merge(c,1,Integer::sum);
            }
            System.out.println("smap "+smap);
            boolean compare  = compareMaps(smap,target);
            System.out.println(compare+" smap "+smap+" target "+target);
            if(compare){
                subStrings.add(sub);
                start = end;
                end = start +1;
            }else {
                if(end<s.length())
                end++;
            }

        }
        String min = subStrings.stream().min(Comparator.comparing(String::length)).get();
        return min;
    }

    public static String minWindow2(String s, String t){

        int start = 0,end = t.length()-1;
        Map<Character, Integer> target = new HashMap<>();
        for (char c : t.toCharArray()) {
            target.merge(c,1,Integer::sum);
        }
        System.out.println("target "+target);

        List<String> subStrings = new ArrayList<>();



        while (start<=(s.length()-t.length())-1) {

            Map<Character, Integer> origin = new HashMap<>();
            for (char c : s.substring(start,end+1).toCharArray()) {
                origin.merge(c,1,Integer::sum);
            }
            System.out.println("origin "+origin);


            if (compareMaps(origin,target)) {
                subStrings.add(s.substring(start,end+1));
            }

            if(end<s.length()-1){
                end++;
            }
            if(end==s.length()-1){
                start++;
            }



        }
        System.out.println("subStrings "+subStrings);

        String result = subStrings.stream().min(Comparator.comparing(String::length)).get();


        return result;

    }



    public static boolean compareMaps(Map<Character,Integer> origin, Map<Character,Integer> target){

        Predicate<Map.Entry<Character,Integer>> pred = (p) -> {
            return origin.containsKey(p.getKey()) &&
                    origin.get(p.getKey()) >= p.getValue();
        };

        for (Map.Entry<Character,Integer> e: target.entrySet()){
            if(!pred.test(e)){
                return false;
            }
        }

        return true;

    }


}

