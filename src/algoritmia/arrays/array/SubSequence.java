package algoritmia.arrays.array;

import java.util.*;

/**
 * 
 * 
 * @author FENRIR
 *
 *
 *Create all subsequences of progressive numbers in an array
 */

public class SubSequence {
	
	

	public static void main(String[] args) {
		
		//should give {2,3,6} {1,1,6}
		int[] arr = {2,1,3,1,6};
		
		new SubSequence().calc(arr);
		
	}
	
	public void calc(int[] array) {
		
		
		//define lengths
		int length = array.length;
		int last = array[length-1];
		List<Integer> seq = new ArrayList<Integer>();
		
		// iterate array
		for (int i = 0; i < length; i++) {
			System.out.println("iter " + i + " value " + array[i] + " vs ");
			// for each element look for it's natural progression
			
			
			//validate that the elem at index hasn't been previously added/ maybe use a map for index, number?
			if(array[i]<=last) {
				System.out.println("add " + array[i]);
				seq.add(array[i]);
			}

			for (int j = i+1; j < length; j++) {
				System.out.print(array[j] + " ");
				if (seq.get(seq.size()-1)<=array[j] && array[j]<= last ) {
					System.out.println("add " + array[j]);
					seq.add(array[j]);
				}

			}
			System.out.println("Elements in the array: \n");
			for (Integer integer : seq) {
				System.out.print(integer + " ");
			}
			System.out.println("\n");
			
						
		}
		
//		Integer[] inta = IntStream.of(seq ).boxed().toArray(Integer[]::new);
		String[]s = seq.stream().map(i->String.valueOf(i)).toArray(String[]::new);
//		String s = seq.stream().collect(Collectors.joining("6"));
		

		for (String integer : s) {
			System.out.print(integer+" ");
		}
		System.out.println(Arrays.toString(s));
		String[] arrays = Arrays.toString(s).split("6");
		for (String string : arrays) {
			System.out.print(string+" ");
		}
		
		
	}

}
