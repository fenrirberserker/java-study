package concepts.collections.Maps;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyMap {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("lions", "tigers", "bears", "bears", "bears", "tigers");

        Map<String, Long> freq = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("freq "+freq);

        Map<String, Integer> map = encuestaNombres(list);

        Stream.of(map).forEach(System.out::println);

        System.out.println(entriesSortedByValues(map));

        System.out.println(entriesSortedByValues(map).last().getValue() );
    }


    public static Map<String, Integer> encuestaNombres (List<String> tmpList)
    {

        Map<String, Integer> a = new TreeMap<String, Integer>();
        tmpList.stream().forEach(e->{
            System.out.println("nombre "+e);
            a.put(e, a.getOrDefault(e,0 )+1);
        });

        return a;
    }

    static SortedSet<Map.Entry<String,Integer>> entriesSortedByValues(Map<String,Integer> map) {

        SortedSet<Map.Entry<String,Integer>> sortedEntries = new TreeSet<>(Map.Entry.comparingByValue());
        sortedEntries.addAll(map.entrySet());
        return sortedEntries;
    }
}
