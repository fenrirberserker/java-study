package test;

import java.util.Arrays;

public class TestArrays {

	public static void main(String[] args) {
		 
		Integer[] arr = {1,2,3,4,5,6};
//		arr = new Integer[3];

		Arrays.asList(arr).forEach((i)->{System.out.println(i);});
		System.out.println();
		arr[2] = 7;
		Arrays.asList(arr).forEach( (i) ->{System.out.println(i);});
		

	}

}
