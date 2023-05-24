package algoritmia.search;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 
 * 
 * @author FENRIR
 *
 *
 *Find the numbers in an array whose sum equals n given number
 */

public class FindMultiples {

	public static void main(String[] args) {
		
		int n = 24;
		int[] array = {5,3,7,9,4,6,1,8};
		new FindMultiples().getNumbers(array, n);
		
		
	}
	
	
	public int getNumbers(int[] arr, int n) {
		
		Integer[] ints = IntStream.of(arr).boxed().toArray(Integer[]::new);
		Arrays.sort(ints);
		System.out.println("Ints");
		Stream.of(ints).forEach( x -> {System.out.print(x+" ");});
		
		int left,right;
		left=ints[0];
		right=ints[ints.length-1];
		int first,second;
		
		//true left/false right
		boolean start=false;
		System.out.println("\nsub left "+(n-left));
		System.out.println("\nsub right "+(n-right));
		if(n-left<n-right) {
			start=true;
			System.out.println("\nstart from the start");
		}else {
			System.out.println("\nstart from the end");
			start=false;
		}
		
		first = start? arr[left+findMult(n, ints, start)]:arr[right-findMult(n, ints, start)] ;
//		second = 
		
		
		return 0;
	}
	
	//true left/false right
	public int findMult(int n, Integer[] ints, boolean mode) {
		int indexmul = 0;
		
		if(mode) {
			for(int i=0;i<ints.length;i++) {
				if(n%ints[i]==0) {
					indexmul=ints[i];
					System.out.println("multiple "+indexmul);
				}
			}
		}else {
			for(int i=ints.length-1;i>=0;i--) {
				if(n%ints[i]==0) {
					indexmul=ints[i];
					System.out.println("multiple "+indexmul);
				}
			}
		}
		
		return indexmul;
		
		
	}
	
	

}
