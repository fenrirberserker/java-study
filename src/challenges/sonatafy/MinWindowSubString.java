package challenges.sonatafy;

import java.util.*;

/**
 * Given a String source
 * and a String target
 * find the minimum window of characters in source that can form the string target
 * else return ""
 */

public class MinWindowSubString {

    public static void main(String[] args) {

        List<List<String>> tests = new ArrayList<>();
        tests.add(List.of("ABC","ADOBECODEBANC"));
        tests.add(List.of("FOCAA","FDDSDIJODSOFAPCFAFFIFAVPAC"));

        tests.forEach(x->{
            String result = minWindow(x.get(1),x.get(0));
            System.out.println("result "+result);
        });


    }

    public static String minWindow(String s, String t){

        int subStart = 0;
        int subEnd = subStart+(t.length());
        String segment = s.substring(subStart,subEnd);

        //System.out.println(segment);
        Map<Character,Integer> sub = new HashMap<>();
        Map<Character,Integer> target = new HashMap<>();

        for (char c: t.toCharArray()) {
            target.merge(c,1,Integer::sum);
        }
        System.out.println(target+" "+target.hashCode());

       while(segment.length()<s.length()){

           segment = s.substring(subStart,subEnd);
           System.out.println("segment length "+segment.length());
           System.out.println("s.length "+s.length());

           int iter = s.length() - segment.length()+1;
           System.out.println("iter "+iter );

           for (int i = 0; i < iter; i++) {

               String subSegment = s.substring(i,i+segment.length());
               System.out.println("subsegment "+subSegment);
               sub = new HashMap<>();
               for (char c:subSegment.toCharArray()) {
                   sub.merge(c,1,Integer::sum);
               }
               System.out.println("subsegment map "+sub+" "+sub.hashCode());
               if(eval(sub,target)){
                   return subSegment;
               }

           }
           subEnd++;


        }

        return "";

    }

    public static boolean eval(Map<Character,Integer> origin,Map<Character,Integer> target){


        return target.entrySet().stream().allMatch(e ->{
            System.out.println(e.getKey()+" "+origin.get(e.getKey())+" "+" origin.containsKey(e.getKey()) "+origin.containsKey(e.getKey())+" "
                    +"Objects.equals(origin.get(e.getKey()), e.getValue()) "+Objects.equals(origin.get(e.getKey()), e.getValue()));
            return
                    origin.containsKey(e.getKey())
                    && origin.get(e.getKey()) >= e.getValue() ;
        });

    }
}
