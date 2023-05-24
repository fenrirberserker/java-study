package test;

public class TestInterface {
	
	public static void main(String[] args) {
		
		IInterface obj = (i,j)->{
			
			return i+j;
			
			};
			
			System.out.println("The result is "+obj.add(5,2));
			
		
	}

}
