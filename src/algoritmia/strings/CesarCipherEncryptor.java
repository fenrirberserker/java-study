package algoritmia.strings;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Given a non-empty string of lowercase letters and a non-negative integer representing a key, write a function that returns a new string obtained by shifting every letter in the input string by k positions in the alphabet, where k is the key.
 *
 * Note that letters should "wrap" around the alphabet; in other words, the letter z shifted by one returns the letter a.
 */

public class CesarCipherEncryptor {

    public static void main(String[] args) {

        String string = "xyz";
        int key = 2;

        String newstring = caesarCypherEncryptor(string,key);
        System.out.println("newstring "+newstring);

    }

    public static String caesarCypherEncryptor(String str, int key) {
        // Write your code here.

        List<Character> chars = Stream.iterate('a', n-> (char) (n+1)).limit(26).collect(Collectors.toList());
        System.out.println(chars);
        String newstring = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println("index "+i+" char "+c);
            int newindex =0;
            if((chars.indexOf(c)+key)>(25)){
                newindex = -1+( key-( 25-( chars.indexOf(c) ) ) );//calc
                System.out.println("extra");
            }else {
                newindex = chars.indexOf(c)+key;
                System.out.println("regular");
            }
            System.out.println("new index "+newindex);
            char newchar = chars.get(newindex);
            System.out.println("newchar "+newchar);
            newstring+=newchar;

        }
        
        return newstring;
    }
}
