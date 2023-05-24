package algoritmia.recursion;

public class Recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Recursive().recursive(1, 5);

	}
	
	public void recursive(int number, int limit) {
		
		
		if(number<limit) {
			System.out.println("calling recursive "+number);
			number++;
			recursive(number, limit);
		}else {
			System.out.println("Finished number "+number);
		}
		
	}

}
