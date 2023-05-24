package algoritmia.sorting;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
		
		Integer[] nums = {2,5,6,8,4,6,1};
		
//		Arrays.sort((Integer[])nums, Comparator.naturalOrder());
		Arrays.sort(nums);

		System.out.println("sorted");
		Arrays.asList(nums).stream().forEach(System.out::println);

	}

}
