package algoritmia.search;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 
 * 
 * @author FENRIR
 *
 *
 *Generate all primes to a n given number
 */
public class Primes {

	public static void main(String[] args) {
		
		List<Integer> nums;
		
//		IntStream.
		
		IntStream ints = IntStream.rangeClosed(2, 30);
		Stream<Integer> list = (Stream<Integer>) Stream.iterate(2, n -> n+1).limit(30).collect(Collectors.toList()) ;
		new Primes().primes(ints);
		
	}
	
	public List<Integer> primes(IntStream nums) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		IntConsumer c = (x)->{
			
			int[] digs = {2,3,4,5,6,7,8,9};
			
			boolean flag = true;
			
			for (Integer integer : digs) {
//				System.out.print(" "+x+" vs "+integer+" ");
				if(x%integer==0 && x!=integer) {
					flag = false;
					break;
				}
			}
			if(flag==true) {
				System.out.println("\n"+x+" prime");
				list.add(x);
			}else {
//				System.out.println("\n"+x+" not prime");
			}
			
		};
		
		nums.forEach(c);
		
		return list;
		
	}

}
