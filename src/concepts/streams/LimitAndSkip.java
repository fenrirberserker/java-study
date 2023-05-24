/**
 * Produces an infinite stream
 * converts to a finite stream
 * applies skip() and limit() to set boundaries
 */
package concepts.streams;

import java.util.stream.Stream;

public class LimitAndSkip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<Integer> s = Stream.iterate(1, n->n+1);
		s.skip(5).limit(3).forEach(System.out::print);

	}

}
