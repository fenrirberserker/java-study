package challenges.developersnet;

import java.util.ArrayList;
import java.util.List;

public class Developersnet {


    public static void main(String[] args) {



        String s1 = "Eva, Can I Stab Bats In A Cave?";
        String s2 = "Mr. Owl Ate My Metal Worm";
        String s3 = "A Santa Lived As a Devil At NASA";
        String s4 = "luzazul";
        String s5 = "racecar";
        String s6 = "thisoneshouldfail";

        boolean result = isPalindrome(s5);
        //System.out.println("result "+result);

        String converted = clean(s1);
        //System.out.println("converted "+converted);

        List<String> tests = new ArrayList<>();
        tests.add(s1);
        tests.add(s2);
        tests.add(s3);
        tests.add(s4);
        tests.add(s5);
        tests.add(s6);

        for(String s : tests){
            String ans = clean(s);
            boolean isP = isPalindrome(ans);
            System.out.println("isPalindrome "+ans+" "+isP);
        }

    }

    public static boolean isPalindrome(String s){

        int middle = s.length()/2;
        int end = s.length()-1;

        for (int i = 0; i < middle; i++) {
            Character c = s.charAt(i);
            Character e = s.charAt(end);
            if(!c.equals(e)){
                return false;
            }
            end--;

        }
        return true;

    }

    public static String clean(String s){

        String pattern = "[a-zA-z]";
        //Pattern p = Pattern.compile(pattern);
        return s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
    }
}
