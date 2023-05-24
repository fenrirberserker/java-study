package algoritmia.collectors;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Exemple : compter le nombre d'éléments identiques dans un Stream avec groupingBy()
 */
public class CountIncidenceElements {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1,2,2,1,3,2,1,1,3,3,1,4);

        Map<Integer, Long> map = stream.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
        Map.Entry<Integer, Long> entry = map.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(entry);
    }
}
