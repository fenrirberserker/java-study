package algoritmia.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Test if two Strings have the same letters*
 */

public class AnagramaTwoStrings {

    public static void main(String[] args) {
        String a = "alarma";
        String b = "armala";
//        String c = "alla";
//        String d = "lala";
//        String e = "okka";
//        String f = "ako";

        boolean contains1 = testWithMap(a,b);
//        boolean contains2 = testSameLetters(c,d);
//        boolean contains3 = testSameLetters(e,f);
        boolean isAnagram = testWithCharArray(a,b);

        System.out.println(contains1);
//        System.out.println(contains2);
//        System.out.println(contains3);
        System.out.println(isAnagram);



    }

    public static boolean testWithMap(String a, String b){
        boolean isContain = false;

        Map<Character,Integer> mapa = new HashMap<>();
        Map<Character,Integer> mapb = new HashMap<>();


        for(int i = 0; i < a.length(); i++){
            if(mapa.containsKey(a.charAt(i))){
                mapa.replace(a.charAt(i), mapa.get(a.charAt(i))+1);
            }else{
                mapa.put(a.charAt(i),1);
            }

        }

        for(int i = 0; i < b.length(); i++){
            if(mapb.containsKey(b.charAt(i))){
                mapb.replace(b.charAt(i), mapb.get(b.charAt(i))+1);
            }else {
                mapb.put(b.charAt(i),1);
            }
        }

        System.out.println("mapa");
        mapa.forEach((k,v)->{
            System.out.println("k: "+k+" v "+v);
        });

        System.out.println("mapb");
        mapb.forEach((k,v)->{
            System.out.println("k: "+k+" v "+v);
        });

//        isContain = mapa.entrySet().equals(mapb.entrySet());//compare entries
        isContain = mapa.hashCode()==mapb.hashCode();//or compare hashes
        System.out.println("Equals: "+isContain);

        return isContain;

    }

    public static boolean testWithCharArray(String a, String b){

        char[] charsa = a.toCharArray();
        char[] charsb = b.toCharArray();
        StringBuilder stra = new StringBuilder();
        StringBuilder strb = new StringBuilder();

        Arrays.sort(charsa);
        Arrays.sort(charsb);

        for (char c: charsa ) {
            stra.append(c);
        }

        for (char c: charsb ) {
            strb.append(c);
        }

        System.out.println("String a: "+stra);
        System.out.println("String b: "+strb);

        boolean isEqual = stra.toString().equals(strb.toString());
        System.out.println("equals: "+isEqual);

        return isEqual;

    }
}
