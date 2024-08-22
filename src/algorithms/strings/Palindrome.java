package algorithms.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {

    public static void main(String[] args) {
        //System.out.println("input "+readInput());
        System.out.println("is palindrome "+palindrome(readInput()));

    }

    public static boolean palindrome(String string) {


        boolean b = false;

        String reverse = "";

        for(int i=string.length();i>0;i--){
            System.out.println("char "+i+" "+string.charAt(i-1));
            reverse+=string.charAt(i-1);
        }

        if(reverse.equals(string)){
            b=true;
        }
        return b;
    }

    public static String readInput(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s ="";
        try {
            s = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }
}
