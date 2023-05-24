package concepts.threads;

public class TestThreads {

	public static void main(String[] args) {
		
		//execute in a separate thread
		System.out.println("Begin");
		(new ExtendThread()).start();
		(new Thread(new ImplementRunnable())).start();
		(new ExtendThread()).start();
		System.out.println("End");
		
		
		
		//execute within the main thread
		new ImplementRunnable().run();
		(new Thread(new ImplementRunnable())).run();
		(new ExtendThread()).run();
	}

}
