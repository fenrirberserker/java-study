package algorithms.mapping;

import java.util.HashMap;
import java.util.Map;

public class GetKeyFromValue {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Rambo", 7);
        map.put("Terminator", 8);
        map.put("Avengers", 6);

        String string = "Avengers";
        int result = getValue(map,string);
        System.out.println(result);

    }

    public static int getValue(Map<String, Integer> map, String name){

         Integer value = map
                .entrySet()
                .stream()
                .filter(entry->entry.getKey().equals(name))
                .findFirst()
                 .get()
                 .getValue();



        return value;
        //easier to map.get(object)

    }
}
