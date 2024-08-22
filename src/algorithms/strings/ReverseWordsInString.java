package algorithms.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a function that takes in a string of words separated by one or more whitespaces and returns a string that has these words in reverse order.
 * For example, given the string "tim is great", your function should return "great is tim".
 *
 * For this problem, a word can contain special characters, punctuation, and numbers.
 * The words in the string will be separated by one or more whitespaces, and the reversed string must contain the same whitespaces as the original string. For example, given the string "whitespaces    4" you would be expected to return "4    whitespaces".
 *
 * Note that you're not allowed to to use any built-in split or reverse methods/functions.
 * However, you are allowed to use a built-in join method/function.
 *
 * Also note that the input string isn't guaranteed to always contain words.
 */

public class ReverseWordsInString {

    public static void main(String[] args) {

        String string = "AlgoExpert is the best!";
        String result = reverseWordsInString(string);

        System.out.println(result);


    }

    public static String reverseWordsInString(String string) {
        // Write your code here.

        List<String> list = new ArrayList<>();
        String s = "";
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            System.out.println(c);
            if(c == ' ' || i==string.length()-1){
                list.add(s);
                s="";

            }else {
                s+=c;

            }
        }

        System.out.println(list);

        StringBuilder sb = new StringBuilder();

        for (int i = list.size()-1; i >= 0 ; i--) {
            sb.append(list.get(i));
            sb.append(" ");
        }

        System.out.println(sb);



        return sb.toString();
    }
}
