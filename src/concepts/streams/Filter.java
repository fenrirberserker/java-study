package concepts.streams;

import java.util.stream.Stream;

public class Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<String> stream = Stream.of("monkey", "gorilla", "bonobo");
		stream.filter(x -> x.startsWith("m")).forEach(System.out::print);

	}

}
