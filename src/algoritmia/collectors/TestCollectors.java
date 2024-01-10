package algoritmia.collectors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestCollectors {

	public static void main(String[] args) {

		collectExample();
		collectSetExample();
		Stream<String> str = Stream.of("lions", "tigers", "bears");
		
//		toMapInverse(str);
//		groupByLength(str);
//		partitionByLength(str);

	}

	public static void collectExample(){
		Stream<String> stream = Stream.of("w", "o", "l", "f");
		StringBuilder word = stream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);//third param for parallel streams
		System.out.println(word);
	}

	public static void collectSetExample(){
		Stream<String> stream = Stream.of("w", "o", "l", "f");
//		TreeSet<String> set = stream.collect(TreeSet::new, TreeSet::add,TreeSet::addAll);
		TreeSet<String> set = stream.collect(Collectors.toCollection(TreeSet::new));
//		Set<String> set = stream.collect(Collectors.toSet());//not sorted since not a TreeSet
		System.out.println(set); // [f, l, o, w]
	}
	
	public static void join(Stream<String> str) {
		String result =  str.collect( Collectors.joining(","));
		System.out.println(result);
	}
	
	public static void avg(Stream<String> str) {
		Double result = str.collect( Collectors.averagingInt(String::length));
		System.out.println(result);
	}
	
	public static void toSet(Stream<String> str) {
		TreeSet<String> result = str.filter( s->s.startsWith("t")).collect(Collectors.toCollection(TreeSet::new));
		System.out.println(result);
	}
	
	public static void toMap(Stream<String> str) {
		Map<String, Integer> map = str.collect( Collectors.toMap(s->s, String::length ));
		System.out.println(map);
	}

	public static void toMapInverse(Stream<String> str) {
		//solving collisions in maps
		Map<Integer, String> map = str.collect( Collectors.toMap( String::length, k->k, (s1,s2)->s1+","+s2  ));
		System.out.println(map);
	}
	
	public static void groupByLength(Stream<String> str) {

		Map<Integer, Set<String>> map = str.collect(Collectors.groupingBy(String::length, Collectors.toSet()));
		System.out.println(map);
	}

	public static void partitionByLength(Stream<String> str) {

		Map<Boolean, List<String>> map = str.collect(Collectors.partitioningBy(s -> s.length() <= 5));
		System.out.println(map);
	}
	
}
