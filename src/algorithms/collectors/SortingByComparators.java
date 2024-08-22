package algorithms.collectors;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortingByComparators {

    public static void main(String[] args) {

        Stream<String> strings = Stream.of("one","two","three","four","five") ;

    sort(strings);

    }

    public static void sort(Stream<String> stream){

//        stream.sorted().forEach(System.out::println);
        stream.sorted(Comparator.comparing(String::length) ).forEach(System.out::println);


    }


}
