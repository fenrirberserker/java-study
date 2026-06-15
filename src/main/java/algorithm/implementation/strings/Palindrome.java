package algorithm.implementation.strings;

/**
 * Palindrome — check if a string reads the same forwards and backwards.
 * Two-pointer approach: compare characters from both ends toward the center.
 */
public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));  // true
        System.out.println(isPalindrome("hello"));    // false
        System.out.println(isPalindrome("A"));        // true
        System.out.println(isPalindrome(""));         // true
    }

    public static boolean isPalindrome(String s) {
        int left  = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }
}
