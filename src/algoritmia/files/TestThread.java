package algoritmia.files;

public class TestThread {
	
	public static void main(String[] args) {
		Runnable r = new MyRunnable();
		Thread t = new Thread(r);
		
		
		//t.run();//
//		t.start();//si hace algo
		
		Thread r2 = new MyThread();
		
//		r2.run();
//		r2.start();
		
		
//		new Thread(r) {
//			@Override
//			public void run() {
//				System.out.println("Hola thread");
//			}
//		}.run();
		
		
		System.out.println(new String("{ \"hola\" : \"mundo\" }"));
		;
	}

}
