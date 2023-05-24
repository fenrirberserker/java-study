package algoritmia.mapping;

import java.util.Hashtable;
import java.util.Map;

public class MapHashTest {

    public static void main(String[] args) {
        Map<Integer, String> ht = new Hashtable<Integer, String>();

        ht.put(1,"uno");
        ht.put(2,"dos");
        ht.put(1,"uno");

        for(Map.Entry e: ht.entrySet()){
            System.out.println(e);
        }
    }
}
