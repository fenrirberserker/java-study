package algoritmia.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a function that takes in a list of unique strings and returns a list of semordnilap pairs.
 *
 * A semordnilap pair is defined as a set of different strings where the reverse of one word is the same as the forward version of the other. For example the words "diaper" and "repaid" are a semordnilap pair, as are the words "palindromes" and "semordnilap".
 *
 * The order of the returned pairs and the order of the strings within each pair does not matter.
 */

public class ListPalindromes {

    public static void main(String[] args) {

        String[] words = {"diaper", "abc", "test", "cba", "repaid"};

        ArrayList<ArrayList<String>> array = semordnilap(words);
        System.out.println(array);

    }

    public static ArrayList<ArrayList<String>> semordnilap(String[] words) {
        // Write your code here.

        List<ArrayList<String>> pairs = new ArrayList<>();

        int i =0;
        while(i< words.length-1){
            int j = i+1;
            while (j< words.length){
                String original = words[i];
                String inverse = reverse(words[j]);
                if(original.equals(inverse) ){
                    List<String> pair = new ArrayList<>();
                    pair.add(original);
                    pair.add(words[j]);
                    pairs.add((ArrayList<String>) pair);
                }
                j++;
            }
            i++;
        }

        return (ArrayList<ArrayList<String>>) pairs;
    }

    public static String reverse(String string){
        String reverse = "";
        for (int i = string.length()-1; i >=0 ; i--) {
            reverse += string.charAt(i);
        }

        return reverse;
    }

}
