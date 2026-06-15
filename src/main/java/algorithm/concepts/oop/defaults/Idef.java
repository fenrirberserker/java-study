package algorithm.concepts.oop.defaults;

public interface Idef {
	
	public void method1();
	public void method2();
	
	default public void defaultmethod() {
		System.out.println("Default algorithm.implementation");
	}
	
	default public void anotherdefaultmethod() {
		System.out.println("Another default algorithm.implementation");
	}

}
