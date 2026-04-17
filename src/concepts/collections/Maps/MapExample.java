package concepts.collections.Maps;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapExample {

    public static void main(String[] args) {

        Map<Character, Integer> map = new HashMap<>();
        String s = "sagfdsgdsgds";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }

        System.out.println(map);

        List<String> list = Arrays.asList("lions", "tigers", "bears", "bears", "bears", "tigers");

        Map<String, Long> freq = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("freq "+freq);

        Map<String, Integer> map2 = encuestaNombres(list);

        Stream.of(map2).forEach(System.out::println);

        System.out.println(entriesSortedByValues(map2));

        System.out.println(entriesSortedByValues(map2).last().getValue() );
    }



    public static Map<String, Integer> encuestaNombres (List<String> tmpList)
    {

        Map<String, Integer> map = new TreeMap<String, Integer>();
        tmpList.stream().forEach(e->{
            System.out.println("nombre "+e);
            map.put(e, map.getOrDefault(e,0 )+1);
        });

        return map;
    }

    static SortedSet<Map.Entry<String,Integer>> entriesSortedByValues(Map<String,Integer> map) {

        SortedSet<Map.Entry<String,Integer>> sortedEntries = new TreeSet<>(Map.Entry.comparingByValue());
        sortedEntries.addAll(map.entrySet());
        return sortedEntries;
    }
}
