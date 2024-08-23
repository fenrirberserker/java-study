package algorithms.slidingwindow;


import java.util.*;
import java.util.function.Predicate;

public class MinWindowSubString2 {
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

    public static String removeLeft(String str, String target){
        String result = target;
        for(int i=0;i<str.length();i++){
            Character c = str.charAt(i);
            System.out.println("char left "+c);
            if(!target.contains( c.toString())){
                //result =
            }
        }
        return  result;
    }

    public static boolean compareMaps(Map<Character,Integer> origin, Map<Character,Integer> sub){

        Predicate<Map.Entry<Character,Integer>> pred = (p) -> {
            return origin.containsKey(p.getKey()) &&
                    origin.get(p.getKey()) >= p.getValue();
        };
        boolean value = false;
        for (Map.Entry<Character,Integer> e: sub.entrySet()){
            if(!pred.test(e)){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";
        System.out.println(minWindow(s, t)); // Output: "BANC"
    }
}

