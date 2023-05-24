package algoritmia.collectors;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class TestReductors {

    public static void main(String[] args) {

        reduceStrings();
        reduceIntegers();
        reduceOpyionals();
        reduceParallel();

    }

    public static void reduceStrings(){
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        String word = stream.reduce("", (s, c) -> s + c);
        System.out.println(word); // wolf
    }

    public static void reduceIntegers(){
        Stream<Integer> stream = Stream.of(5,9,7);
        Integer i = stream.reduce(1,(a,b)->a*b);
        System.out.println(i);
    }

    public static void reduceOpyionals(){
        BinaryOperator<Integer> op = (a, b) -> a * b;
        Stream<Integer> empty = Stream.empty();
        Stream<Integer> oneElement = Stream.of(3);
        Stream<Integer> threeElements = Stream.of(3, 5, 6);

        empty.reduce(op).ifPresent(System.out::println); // no output
        oneElement.reduce(op).ifPresent(System.out::println); // 3
        threeElements.reduce(op).ifPresent(System.out::println); // 90
    }

    public static void reduceParallel(){
        //allows to combine the intermediate results at the end using parallel streams
        BinaryOperator<Integer> op = (a, b) -> a * b;
        Stream<Integer> stream = Stream.of(3, 5, 6);
        System.out.println(stream.reduce(1, op, op)); // 90 one op is for combining the elems, the second for joining them at the end (parallel streams)
    }
}
