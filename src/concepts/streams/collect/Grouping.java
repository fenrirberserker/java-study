/**
 * Collects the stream elements
 * grouping by a mapping function
 * adding to a specific collection
 */
package concepts.streams.collect;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Grouping {

    public static void main(String[] args) {

        Stream<String> s = Stream.of("lions", "tigers", "bears");
        Map<Integer, Set<String>> map = s.collect(Collectors.groupingBy(String::length, Collectors.toSet()));
        System.out.println(map);
    }
}
