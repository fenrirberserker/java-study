package algorithms.strings;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * Write a function that, given a string, returns its longest palindromic substring.
 *
 * A palindrome is defined as a string that's written the same forward and backward. Note that single-character strings are palindromes.
 *
 * You can assume that there will only be one longest palindromic substring.
 */

public class LongestPalindromicSubstring {

    public static void main(String[] args) {

        String s1 = "abaxyzzyxf";
        longestPalindromicSubstring(s1);
        String s2 = "it's highnoon";
        longestPalindromicSubstring(s2);


    }

    public static String longestPalindromicSubstring(String str) {
        // Write your code here.

        int l = 0;
        int r = 1;

        List<String> palindromes = new ArrayList<>();

        while(l<str.length()-2){
            String s = find(l,r,str);
//            System.out.println("palindrome "+s);
            if(s.length()>0)
            palindromes.add(s);

            l++;
            r++;

        }

//        System.out.println(palindromes);
        String longest = palindromes.stream().max(Comparator.comparing(String::length)).get();

        return longest;
    }

    public static String find(int l, int r, String s){


        String str = "";
        while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
            char lc = s.charAt(l);
            char rc = s.charAt(r);

            str= lc+str+rc;

            System.out.println("String "+str);
            lc = s.charAt(l);
            System.out.println("lc "+l+" "+lc);
            rc = s.charAt(r);
            System.out.println("rc "+r+" "+rc);
            l--;
            r++;



        }

        return str;

    }
}
