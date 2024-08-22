package algorithms.search;

import java.util.Arrays;

public class BinarySearch2 {

	public static void main(String[] args) {
		
		
		int[] array = {2,3,8,9,4,6,5,7};
		
		System.out.println("Before");
		for (int e : array) {
			System.out.print(e+" ");
		}
		Arrays.sort(array);
		System.out.println("\nAfter");
		for (int e : array) {
			System.out.print(e+" ");
		}
		System.out.println();
		binary(array);
		
	}
	
	public static void binary(int[] array) {
		
		
		int element = Arrays.binarySearch(array, 5);
		
		System.out.println("Elem found at index "+element);
		
	}

}
