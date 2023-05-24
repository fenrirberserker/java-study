package concepts.collections.Maps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapExample {

    public static void main(String[] args) {

        List<String> zero = Arrays.asList();
        List<String> one = Arrays.asList("Bonobo");
        List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two);

        animals.flatMap(l -> l.stream()).forEach(System.out::println);
    }
}
