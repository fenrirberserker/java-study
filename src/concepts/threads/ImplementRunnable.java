package concepts.threads;

public class ImplementRunnable implements Runnable{

	public static void main(String[] args) {

		//(new Thread(new ImplementRunnable())).start();
		(new Thread(()->{
			for(int i=0;i<3;i++) {
				System.out.println("Print record "+i);
			}
		} )).start();

	}

	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("Print record "+i);
		}
	}

}
