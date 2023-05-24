package test;

public class TestRunnable {
	
	public static void main(String[] args) {
		
		Runnable r1 =()->{
			System.out.println("Running thread 1");
		};
		
		Runnable r2 =()->{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Running thread 2");
		};
		
		new Thread(r1).start();
		new Thread(r2).start();
	}

}
