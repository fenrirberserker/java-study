package concepts.defaults;

public interface Idef {
	
	public void method1();
	public void method2();
	
	default public void defaultmethod() {
		System.out.println("Default implementation");
	}
	
	default public void anotherdefaultmethod() {
		System.out.println("Another default implementation");
	}

}
