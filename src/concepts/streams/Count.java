/**
 * Count number of animals
 */
package concepts.streams;

import java.util.stream.Stream;

public class Count {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("Perro", "Gato", "Leon");
        long l = s.count();
        System.out.println(l);
    }
}
