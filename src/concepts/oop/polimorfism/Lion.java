package concepts.oop.polimorfism;

public class Lion extends Animal {
	
	String name = "Leo";
	
	public void play() {
		System.out.println("toss in meat");
	}

	public void call(){
		System.out.println("Come");
	}

}
