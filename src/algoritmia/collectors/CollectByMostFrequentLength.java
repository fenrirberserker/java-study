package algoritmia.collectors;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Find the group of strings that is repeated the most
 * return the number of times
 */

public class CollectByMostFrequentLength {

    public static void main(String[] args) {

        Stream<String> strings = Stream.of("one","two","three","four","five","six","seven","eight");

        /*Map<Integer, List<String>> map = strings.collect(Collectors.groupingBy(s->s.length()));
        Integer i = map.entrySet().stream().max((x,y)->x.getKey()).get().getKey();
        System.out.println(map);
        System.out.println(i);*/

        Map<Integer, Long> map = strings.collect(Collectors.groupingBy(s->s.length(),Collectors.counting()));

        Integer i = map.entrySet().stream().max(Comparator.comparing(e->e.getValue())).get().getKey();
        System.out.println(map);
        System.out.println(i);

        Map<Long,List<Integer>> map2 = map.entrySet().stream()
                .collect(Collectors
                        .groupingBy(e->e.getValue(), Collectors.mapping(e->e.getKey(),Collectors.toList())));

        System.out.println(map2);

    }
}
