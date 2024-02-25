package concepts.oop.polimorfism;

public class PlayWithAnimal {

	public static void main(String[] args) {
		
		Animal animal = new Lion();

		animal.printName();
		animal.careFor();
		//animal.call();//doesn't exist in animal, no visibility
	}

}
