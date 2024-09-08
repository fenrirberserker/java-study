package algorithms.strings;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Given a non-empty string of lowercase letters and a non-negative integer representing a key,
 * write a function that returns a new string obtained by shifting every letter in the input string by k positions in the alphabet, where k is the key.
 *
 * Note that letters should "wrap" around the alphabet; in other words, the letter z shifted by one returns the letter a.
 */

public class CesarCipherEncryptor {

    public static void main(String[] args) {

        String string = "xyz";
        int key = 2;

        Object[][] samples = {{"xyz",2},{"agz",3}};

        for (int i = 0; i < samples.length; i++) {
            String s = (String) samples[i][0];
            int k = (int) samples[i][1];
            System.out.println("original String: " + s);
            String result = caesarCypherEncryptor(s,k);
            System.out.println("new String: " + result);
            System.out.println();

        }

    }



    public static String caesarCypherEncryptor(String str, int key){
        List<Character> chars = Stream.iterate('a', n-> (char) (n+1)).limit(26).collect(Collectors.toList());
        int size = chars.size();
        System.out.println(chars);
        System.out.println("size "+size);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {

            int currentindex = chars.indexOf(str.charAt(i));
            int newindex = (currentindex+key)%(size);
            char currentchar = chars.get(currentindex);
            char newchar = chars.get(newindex);

            System.out.println("current i "+currentindex);
            System.out.println("new i "+newindex);
            System.out.println("current char "+currentchar);
            System.out.println("new char "+newchar);
            sb.append(newchar);
        }

        return sb.toString();
    }
}
