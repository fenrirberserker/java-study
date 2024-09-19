package algorithms.numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Write a function that takes an integer and returns TRUE if it is a palindrome number and FALSE otherwise.
 * The number should not be converted to String and any higher order library functions should not be used.
 *
 *
 */
public class IsPalindromeNumber {

    public static boolean isPalindrome(int number) {
        // int digit = number % 10; // Base 10 number, this will help you to get the latest digit


        List<Integer> list = new ArrayList<>();


        while(number>0) {

            System.out.println("num = "+number%10);
            list.add(number%10);
            number = number/10;
            System.out.println("number = "+number);
        }

        System.out.println(list);

        int start = 0;
        int end = list.size()-1;
        int mid = list.size()/2;

        while(start<mid) {
            if(!Objects.equals(list.get(start), list.get(end))) {
                return false;
            }
            start++;
            end--;
        }


        return true;

    }

    public static void main(String[] args) {
        int number = 123321;
        if (isPalindrome(number)) {
            System.out.println(number + " is palindrome.");
        } else {
            System.out.println(number + " is NOT palindrome.");
        }
    }
}
