package algorithms.collectors;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 
 * 
 * @author FENRIR
 *
 *Find the most frequent number that appears in an array
 */
public class MostFrequent {

	public static void main(String[] args) {
		int[] arr = {1,3,1,3,2,1};
		new MostFrequent().count(arr);
	}
	
	public void count(int[] arr) {
		
		Integer[] ints = IntStream.of(arr).boxed().toArray(Integer[]::new);
		Map<Integer, Long> map = new HashMap<>();
		
		map = Stream.of(ints).collect(Collectors.groupingBy(x -> x,Collectors.counting()));
//		map = Stream.of(arr).collect( Collectors.toMap(k->k, v->1, Integer::sum) );
//		map = Stream.of(1,3,1,3,2,1).collect( Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		map = Stream.of(ints).collect( Collectors.groupingBy(Function.identity(), Collectors.counting() ));
		System.out.println(map);
		
		map.forEach( (k,v)->{System.out.println( k+" : "+v ); } );
//		for (Entry<Object, Integer> entry : map.entrySet()) {
//			System.out.println(entry.getKey()+" : "+entry.getValue());
//		}
		
//		return map;
		
	}

}
