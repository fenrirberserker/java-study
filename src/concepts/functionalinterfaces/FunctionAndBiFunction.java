package concepts.functionalinterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionAndBiFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String, Integer> f1 = String::length;
		Function<String, Integer> f2 = x -> x.length();
		
		System.out.println(f1.apply("cluck"));
		System.out.println(f2.apply("cluck"));
		
		BiFunction<String, String, String> b1 = String::concat;
		BiFunction<String, String, String> b2 = (string, toAdd) -> string.concat(toAdd);
		
		System.out.println(b1.apply("baby ", "chick"));
		System.out.println(b2.apply("baby ", "chick"));

		Predicate<String> egg = s-> s.contains("egg");
		Predicate<String> brown = s-> s.contains("brown");

		Predicate<String> brownEggs = egg.and(brown);
		System.out.println(brownEggs.test("brown eggs"));
		

	}

}
