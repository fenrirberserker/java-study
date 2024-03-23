package challenges.orgoa;

import java.util.Map;
import java.util.TreeMap;

public class MagazineTest {

    public static void main(String[] args) {

        String n ="eo";
        String m = "perro";

        boolean result = canBeBuilt(n,m);
        System.out.println("Result is "+result);
    }


    /*
    BigO(n):
    Iterating for Strings: O(n) since we iterate over all the chars in the String for filling in the maps.
    Iterating the maps: O(n). We must iterate for every element in n in order to compare against the value for that key in m.
    Even if the key comparison in maps is O(1) the iteration over all the keys in nMap is giving us O(n).
     */
    public static boolean canBeBuilt(String n, String m){


        Map<Character, Integer> nMap = new TreeMap<>();
        Map<Character, Integer> mMap = new TreeMap<>();


        //mapping for the note
        for (Character c : n.toCharArray() ) {
            nMap.merge(c, 1, Integer::sum);
        }

        //mapping for the magazine
        for (Character c : m.toCharArray() ) {
            mMap.merge(c, 1, Integer::sum);
        }

        System.out.println("Map note "+nMap);
        System.out.println("Map magazine "+mMap);

        //lambda for comparison
        boolean result  = nMap.entrySet().stream()
                .allMatch(e-> mMap.containsKey(e.getKey()) && mMap.get(e.getKey())>=nMap.get(e.getKey()));
        return result;


    }
}
