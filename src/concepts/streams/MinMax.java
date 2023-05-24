/**
 * Finds the animal with least number of letters
 */
package concepts.streams;

import java.util.Optional;
import java.util.stream.Stream;

public class MinMax {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("Chango", "Perro", "Gato");
        Optional<String> min = s.min((s1, s2)-> s1.length() - s2.length());
        min.ifPresent(System.out::println);
    }
}
