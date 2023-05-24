/**
 * Partitions a stream
 * using a predicate function
 * produces only 2 groups
 * the ones that match and the ones that do not match the predicate condition
 */
package concepts.streams.collect;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Partitioning {

    public static void main(String[] args) {
        Stream<String> s = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> map = s.collect(Collectors.partitioningBy(e->e.length() < 5));
        System.out.println(map);
    }
}
