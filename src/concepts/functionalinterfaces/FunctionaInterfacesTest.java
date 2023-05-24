package concepts.functionalinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.*;

public class FunctionaInterfacesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<String> stream = Stream.of("uno","dos","tres");
		Consumer<String> c = (x)->{System.out.println(x);};
		Predicate<String> p = x->x.startsWith("u");
		BinaryOperator<String> b2 = (string, toAdd)->string.concat(toAdd);
		Collector<String, ?, String> col = Collectors.reducing("", b2);
		Function<String,String> f = (x)->x.toUpperCase();
		
//		stream.filter(p).forEach(c);
//		String str = stream.collect(col);
//		String str = stream.reduce("", (string, toAdd)->string.concat(toAdd));
//		System.out.println(str);
		stream.map(f).forEach(c);



		
	}

	//TODO: create methods to test scope of lambda functions
	public void testScopes(){

		List<Integer> arr = new ArrayList();

		arr.add(5);
		arr.add(9);
		arr.add(7);
		arr.add(3);
		Integer test = 3;

		arr.stream().forEach(
				(x)->{
					System.out.println("elem "+x+test);

				}

		);




	}

}
