package concepts.streams;

import java.util.stream.Stream;

public class Peek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<String> stream = Stream.of("black bear", "brown bear", "grizzly");
		long count = stream.filter(s->s.startsWith("g")).peek(System.out::println).count();
		System.out.println(count);

	}

}
