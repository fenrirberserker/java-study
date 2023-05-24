package concepts.streams;

import java.util.stream.Stream;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
		s.forEach(System.out::print);

	}

}
