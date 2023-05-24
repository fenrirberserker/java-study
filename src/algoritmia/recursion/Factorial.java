package algoritmia.recursion;

public class Factorial {

	public static void main(String[] args) {

		int number = 5;
		System.out.println("result "+factorial(number)); 

	}
	
	public static int factorial(int n) {
		
		System.out.println("number "+n);
		
		if(n>=2) {
			return  n * factorial(n-1);
		}
		
		return 1;
	}

}
