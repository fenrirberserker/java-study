package algorithms.random;

import java.util.Random;

public class GenerateRandom {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int num = rand.nextInt(100)+1;
		
		System.out.println("num is: "+num);

	}

}
