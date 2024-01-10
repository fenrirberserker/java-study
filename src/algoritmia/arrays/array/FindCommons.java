package algoritmia.arrays.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * 
 * @author FENRIR
 *
 *Find the common elements between two arrays
 *
 */
public class FindCommons {

	public static void main(String[] args) {
		
		int[] a = {1,3,4,6,7,9};
		int[] b = {1,2,4,5,9,10};
		//findCommons(a, b);
//		findCommonsBruteForce(a,b);
		findOptimizedCommons(a,b);
		
	}


	public static List<Integer> findCommonsBruteForce(int[] a, int[] b){

		List<Integer> commons = new ArrayList<>();

		for (int i = 0; i < a.length ; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a[i]==b[j]){
					commons.add(a[i]);
				}
			}

		}

		commons.forEach(System.out::println);

		return commons;
	}

	//assuming a and b are equal length
	public static List<Integer> findOptimizedCommons(int[] a, int[] b){

		List<Integer> commons = new ArrayList<>();

		int ia = 0;
		int ib = 0;

		while (ia<a.length && ib<b.length) {

			if(a[ia]==b[ib]){
				commons.add(a[ia]);
				ia++;
				ib++;
			} else if (a[ia]>b[ib]) {
				ib++;
			} else /*if (a[ia]<b[ib])*/ {
				ia++;
			}

		}
		commons.forEach(System.out::println);
		return commons;

	}
	
	public static List<Integer> findCommons(int[] a, int[] b) {
		
		Integer[] inta = IntStream.of(a).boxed().toArray(Integer[]::new);
		Integer[] intb = IntStream.of(b).boxed().toArray(Integer[]::new);
		
		
		
		List<Integer> list = new ArrayList<>();
		
		for (Integer integer : inta) {
			if(Arrays.asList(intb).contains(integer)  ) {
				System.out.println(integer+" found in b");
				list.add(integer);
			}
		}
		
		list.forEach(System.out::println);

		return list;
		
	}

}
