package concepts.streams;


import java.util.*;
import java.util.stream.Stream;

public class MapAndFlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
		s.map(String::length).forEach(System.out::println);
		
		
		//flatmap combines lists, removes empty
		List<String> zero = Arrays.asList();
		List<String> one = Arrays.asList("bonobo");
		List<String> two = Arrays.asList("gorilla", "donkey");
		
		Stream<List<String>> animals = Stream.of(zero, one, two);
		animals.flatMap(l->l.stream()).forEach(System.out::println);

	}

}
