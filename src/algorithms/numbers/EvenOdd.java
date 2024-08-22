package algorithms.numbers;

import java.util.function.Predicate;

/**
 * 
 * 
 * Task 
Given an integer, , perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.
 */

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(testNumber(2));
		System.out.println(testNumber(3));
		System.out.println(testNumber(7));
		System.out.println(testNumber(21));
		

	}
	
	public static String testNumber(int n) {
		String value = "";
		
		
		Predicate<Integer> isodd = x-> x%2==0;
		Predicate<Integer> even2to5 = x-> (x%2>0 && x>2 && x<=5) ;
		Predicate<Integer> even6to20 = x-> (x%2>0 && x>6 && x<=20);
		Predicate<Integer> morethan20 = x-> (x%2>0 && x>20);
		
		if (isodd.test(n)) {
			value="Wierd";
		} else if(even2to5.test(n)) {
			value="Not Wierd";
		} else if(even6to20.test(n)) {
			value="Wierd";
		} else if(morethan20.test(n)) {
			value="Not Wierd";
		}
		
		
		return value;
	}

}
