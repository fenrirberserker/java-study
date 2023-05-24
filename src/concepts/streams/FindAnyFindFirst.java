package concepts.streams;

import java.util.stream.Stream;

public class FindAnyFindFirst {

    public static void main(String[] args) {
        Stream<String> finite = Stream.of("monkey", "gorilla", "bonobo");
        Stream<String> infinite = Stream.generate(()->"chango");

        finite.findFirst().ifPresent(System.out::println);
        infinite.findAny().ifPresent(System.out::println);

    }
}
