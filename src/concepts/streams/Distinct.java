/**
 * Removes duplicates
 */
package concepts.streams;

import java.util.stream.Stream;

public class Distinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<String> s = Stream.of("duck", "duck", "duck", "goose");
		s.distinct().forEach(System.out::print);

	}

}
