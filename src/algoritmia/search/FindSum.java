package algoritmia.search;

import java.util.Arrays;

/**
 * 
 * @author FENRIR
 *
 *Given a number
 *Find a pair of numbers in an array which sum equals that number
 */

public class FindSum {

	public static void main(String[] args) {
		
		int[] array = {2,6,4,7,9,4};
		int sum = 8;
		findNumbers(array, sum);

	}
	
	
	
	public static String findNumbers(int[] array, int sum) {
		String val ="Not found";
		
		
		Arrays.sort(array);
		System.out.println("Sorted Array: ");
		for (int i : array) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(int i=0;i<array.length;i++) {
			int current = array[i];
			int missing = sum-current;
			
			int indexfind = Arrays.binarySearch(array, missing);
			
			
			System.out.println("Current "+current+" Missing "+missing+" Binary index "+indexfind);
			
			int match = array[indexfind];
			
			if(current+(match)==sum) {
				val = "Match found: "+current+" + "+match+" = "+sum;
				System.out.println(val);
				break;
			}
			
		}
		
		
		return val;
	}
	
	

}
