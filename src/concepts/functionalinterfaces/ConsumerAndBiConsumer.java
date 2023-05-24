package concepts.functionalinterfaces;

import java.util.*;
import java.util.function.*;


public class ConsumerAndBiConsumer {
	
	public static void main(String[] args) {
		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = x-> System.out.println(x);
		Consumer<String> c3 = (s) -> System.out.println(s);
		
		c1.accept("Annie");
		c2.accept("Annie");
		c3.accept("Hola");

		Map<String,Integer> map = new HashMap();
		BiConsumer<String,Integer> b1 = map::put;
		BiConsumer<String,Integer> b2 = (k,v) -> map.put(k, v);
		
		b1.accept("chicken", 7);
		b2.accept("chick", 1);
		
		System.out.println(map);
		
	}

}
