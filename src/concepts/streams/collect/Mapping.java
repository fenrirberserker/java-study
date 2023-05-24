package concepts.streams.collect;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mapping {

    public static void main(String[] args) {
        Stream<String> s1 = Stream.of("lions", "tigers", "bears");
        Map<String, Integer> map = s1.collect(Collectors.toMap(k->k, v->v.length()));
        System.out.println(map);

        Stream<String> s2 = Stream.of("lions", "tigers", "bears");
        //Creates a Treemap
        //key=length
        //merging function Binary Operator for handling collisions
        //Supplier as TreeMap::new
        TreeMap<Integer, String> map2 = s2.collect(Collectors.toMap(k->k.length(),v->v,(o1,o2)->o1+","+o2,TreeMap::new));
        System.out.println(map2);

        Stream<String> s3 = Stream.of("lions", "tigers", "bears");
        Map<Integer, Long> map3 = s3.collect(Collectors.groupingBy(k->k.length(), Collectors.counting()));
        System.out.println(map3);

    }
}
