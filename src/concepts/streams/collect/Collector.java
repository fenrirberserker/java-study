/**
 * Colelctors transform a stream into a collection
 */
package concepts.streams.collect;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> stream = Stream.of("w","o","l","f");
		StringBuilder word = stream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
		System.out.println(word);
		
		Stream<String> stream2 = Stream.of("w","o","l","f");
		TreeSet<String> set = stream2.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
		System.out.println(set);

		Stream<String> stream3 = Stream.of("w","o","l","f");
		Set<String> set3 = stream3.collect(Collectors.toSet() );
		System.out.println(set3);

		Stream<String> stream4 = Stream.of("w","o","l","f");
		List<String> list = stream4.collect(Collectors.toList());
		System.out.println(list);
		
	}

}
