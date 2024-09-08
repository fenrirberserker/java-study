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
                {"ADOBECODEBANC","ABC"},// Output: "BANC"
                {"ASUFSAFUHSAIU","SHF"}//Failed
        };
//      ADOBECODEBANC                            ABC
        // abc == current slide
        //    analyze window
        for (String[] a : s) {
            System.out.println("result is: "+ minWindowAI(a[0], a[1]));
        }


    }

    public static String minWindow1(String s, String t){//fails some cases

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

    public static String minWindowAI(String s, String t) {

        // Initialize start and end pointers
        int start = 0, end = 0;

        // Map to store target character frequencies
        Map<Character, Integer> target = new HashMap<>();
        for (char c : t.toCharArray()) {
            target.merge(c, 1, Integer::sum);
        }
        System.out.println("target " + target);

        // Map to store current window character frequencies
        Map<Character, Integer> origin = new HashMap<>();

        // Variables to track the minimum window
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;

        // Loop to expand the window
        while (end < s.length()) {
            char endChar = s.charAt(end);
            origin.merge(endChar, 1, Integer::sum);

            // Once a valid window is found, try to shrink it
            //We enter another loop (nested inside the previous one)
            // to check if the current window (represented by the origin map)
            // contains all the characters required by t (represented by the target map)
            while (compareMaps(origin, target)) {
                // Update the minimum window size and position
                //If the current window is valid,
                // we check if its size is smaller than the smallest window found so far (minLen)
                //If so, we update minLen to the size of the current window (end - start + 1)
                // and update minStart to the current start pointer
                if (end - start + 1 < minLen) {
                    minLen = end - start + 1;
                    minStart = start;
                }

                // Shrink the window by moving the start pointer
                //We retrieve the character at the start pointer using s.charAt(start) and store it in startChar.
                char startChar = s.charAt(start);
                //We decrement the frequency of startChar in the origin map
                origin.put(startChar, origin.get(startChar) - 1);
                //If the frequency of startChar becomes 0, we remove it from the origin map.
                if (origin.get(startChar) == 0) {
                    origin.remove(startChar);
                }
                //After updating the minimum window,
                // we try to shrink the window by moving the start pointer to the right
                start++;
            }

            // Expand the window by moving the end pointer
            end++;
        }

        // If no valid window was found, return an empty string
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
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

