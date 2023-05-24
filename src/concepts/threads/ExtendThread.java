package concepts.threads;

public class ExtendThread extends Thread{

	public static void main(String[] args) {
		(new ExtendThread()).start();
	}
	
	@Override
	public void run() {
		System.out.println("Printing zoo inventory");
	}

}
