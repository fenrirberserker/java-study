/**
 * Reduces the stream into a single object
 */
package concepts.streams.collect;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Reductor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<String> stream = Stream.of("w","o","l","f");
		String word = stream.reduce("", (s,c)->s+c);
		System.out.println(word);
		
		Stream<String> stream2 = Stream.of("w","o","l","f");
		String word2 = stream2.reduce("", String::concat);
//		stream2.forEach(System.out::println);//will fail, stream terminated
		System.out.println(word2);
		
		Stream<Integer> streamn = Stream.of(3,5,6);
		System.out.println(streamn.reduce(1, (a,b)->a*b));
		
		BinaryOperator<Integer> op = (a,b)->a*b;
		Stream<Integer> empty = Stream.empty();
		Stream<Integer> onelement = Stream.of(3);
		Stream<Integer> threeelements = Stream.of(3,5,6);
		
		empty.reduce(op).ifPresent(System.out::println);//no output
		onelement.reduce(op).ifPresent(System.out::println);//3
		threeelements.reduce(op).ifPresent(System.out::println);//90
		
		

	}

}
