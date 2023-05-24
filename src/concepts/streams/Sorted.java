package concepts.streams;

import java.util.*;
import java.util.stream.Stream;

public class Sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<String> s = Stream.of("brown", "bear");
		s.sorted().forEach(System.out::print);
		
		System.out.println();
		
		Stream<String> s2 = Stream.of("brown", "bear");
		s2.sorted(Comparator.reverseOrder()).forEach(System.out::print);

	}

}
