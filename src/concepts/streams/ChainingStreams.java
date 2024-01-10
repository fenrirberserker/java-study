package concepts.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ChainingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		List<String> list = Arrays.asList("Toby", "Ana", "Leroy", "Alex");
		list.stream()
		.filter( n-> n.length() == 4)//filters the first 4
		.sorted()//sorts it alphabetically
		.limit(2)//selects only 2
		.forEach(System.out::println);
		
		Stream.generate(()->"Hola")
		.filter(n -> n.length() == 4)//>4 hangs
		.limit(2)
		.sorted()
		.forEach(System.out::println);
		
		Stream<Integer> infinite = Stream.iterate(1, x->x+1);
		infinite.limit(5)
		.filter(x->x%2==1)
		.forEach(System.out::println);
		

	}

}
