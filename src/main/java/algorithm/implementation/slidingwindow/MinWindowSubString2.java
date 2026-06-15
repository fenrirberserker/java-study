package algorithm.implementation.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * Minimum Window Substring — find the smallest substring of `text` that
 * contains every character in `pattern` (with correct frequencies).
 * Sliding window + frequency maps → O(n).
 */
public class MinWindowSubString2 {

    public static void main(String[] args) {
        System.out.println(minWindow("aaabaaddae", "aed"));    // "dae"
        System.out.println(minWindow("aabdccdbcacd", "aad")); // "aabd"
    }

    public static String minWindow(String text, String pattern) {
        Map<Character, Integer> targetFreq = new HashMap<>();
        for (char c : pattern.toCharArray()) targetFreq.merge(c, 1, Integer::sum);

        Map<Character, Integer> windowFreq = new HashMap<>();
        int matched   = 0;   // chars in window satisfying pattern frequency
        int left      = 0;
        int minLen    = Integer.MAX_VALUE;
        String result = "";

        for (int right = 0; right < text.length(); right++) {
            char c = text.charAt(right);
            windowFreq.merge(c, 1, Integer::sum);
            if (targetFreq.containsKey(c) && windowFreq.get(c).intValue() <= targetFreq.get(c).intValue()) matched++;

            while (matched == pattern.length()) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    result = text.substring(left, right + 1);
                }
                char leftChar = text.charAt(left++);
                windowFreq.merge(leftChar, -1, Integer::sum);
                if (targetFreq.containsKey(leftChar) && windowFreq.get(leftChar) < targetFreq.get(leftChar)) matched--;
            }
        }
        return result;
    }
}
