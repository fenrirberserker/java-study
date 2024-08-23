package algorithms.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * Have the function MinWindowSubstring(strArr) take the array of strings stored in strArr,
 * which will contain only two strings, the first parameter being the string N and the second parameter being a string K of some characters,
 * and your goal is to determine the smallest substring of N that contains all the characters in K.
 * For example: if strArr is ["aaabaaddae", "aed"]
 * then the smallest substring of N that contains the characters a, e, and d is "dae" located at the end of the string.
 * So for this example your program should return the string dae.
 *
 * Another example: if strArr is ["aabdccdbcacd", "aad"]
 * then the smallest substring of N that contains all of the characters in K is "aabd" which is located at the beginning of the string.
 * Both parameters will be strings ranging in length from 1 to 50 characters and all of K's characters will exist somewhere in the string N.
 * Both strings will only contains lowercase alphabetic characters.
 */

    public class MinWindowSubString {
        public static String MinWindowSubstring(String[] strArr) {
            String N = strArr[0];
            String K = strArr[1];
            int left = 0; // left pointer of the sliding window
            int count = 0; // count of characters in K found in the window
            int minLength = Integer.MAX_VALUE; // length of the smallest substring
            String result = ""; // smallest substring

            // Create character frequency maps for N and K
            Map<Character, Integer> kMap = new HashMap<>();
            for (char c : K.toCharArray()) {
                kMap.put(c, kMap.getOrDefault(c, 0) + 1);
            }

            Map<Character, Integer> nMap = new HashMap<>();
            // Iterate over the string N using the right pointer of the sliding window
            for (int right = 0; right < N.length(); right++) {
                char c = N.charAt(right);
                nMap.put(c, nMap.getOrDefault(c, 0) + 1);// Update the window frequency map
                // If the character is in K and its frequency in the window is <= its frequency in K,
                // increment the count
                if (kMap.containsKey(c) && nMap.get(c) <= kMap.get(c)) {
                    count++;
                }

                // If all characters in K are found in the window, try to minimize the window size
                while (count == K.length()) {
                    // Update the result if the current window is smaller
                    if (right - left + 1 < minLength) {
                        minLength = right - left + 1;
                        result = N.substring(left, right + 1);
                    }

                    // Shrink the window from the left side
                    char leftChar = N.charAt(left);
                    nMap.put(leftChar, nMap.get(leftChar) - 1);

                    // If the removed character is in K and its frequency in the window becomes < its frequency in K,
                    // decrement the count
                    if (kMap.containsKey(leftChar) && nMap.get(leftChar) < kMap.get(leftChar)) {
                        count--;
                    }

                    left++; // Move the left pointer
                }
            }

            return result;
        }

        public static void main(String[] args) {
            String[] strArr1 = {"aaabaaddae", "aed"};
            System.out.println(MinWindowSubstring(strArr1)); // Output: "dae"

            String[] strArr2 = {"aabdccdbcacd", "aad"};
            System.out.println(MinWindowSubstring(strArr2)); // Output: "aabd"
        }
    }

/**
 * In this solution, we maintain two frequency maps:
 * targetFreq for the characters in K and windowFreq for the characters in the current window of N.
 * We use two pointers, left and right, to represent the sliding window.
 * The count variable keeps track of the number of characters in K found in the current window.
 *
 * We iterate over N using the right pointer and expand the window.
 * If a character in K is found, we increment the count.
 * Once all characters in K are found in the window, we try to minimize the window size by moving the left pointer and shrinking the window.
 * We update the result whenever a smaller window is found.
 *
 * Finally, we return the smallest substring found. The time complexity of this solution is O(N), where N is the length of
 */
