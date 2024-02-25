package concepts.oop.polimorfism;

public abstract class Animal {
	String name = "???";
	
	public void printName() {
		System.out.println(name);
	}
	
	public void careFor() {
		play();
	}

	public void play() {
		System.out.println("pet animal");
	}



}
