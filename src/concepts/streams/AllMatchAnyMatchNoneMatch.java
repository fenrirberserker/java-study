/**
 * Checks if the element matched the condition
 */
package concepts.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class AllMatchAnyMatchNoneMatch {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("monkey", "2", "chimp");
        Stream<String> infinite = Stream.generate(()->"chimp");

        Predicate<String> p = x-> Character.isLetter(x.charAt(0));
        System.out.println(list.stream().anyMatch(p));
        System.out.println(list.stream().allMatch(p));
        System.out.println(list.stream().noneMatch(p));
        System.out.println(infinite.anyMatch(p));
    }
}
