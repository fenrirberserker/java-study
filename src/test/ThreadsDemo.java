package test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadsDemo {

	public void m1(){
		throw new IllegalArgumentException();
	}



	public static void main(String[] args) {

		ExecutorService service = Executors.newSingleThreadExecutor();



		Future<?> result = service.submit(() -> {
			try {
				Thread.sleep(5000);//sleeps
				System.out.println("Done");//continue execution prints 2
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}finally {
				service.shutdown();
			}
		});
		System.out.println(result.isDone());//checks if done (false) 1

        try {
            Thread.sleep(5500);
			System.out.println(result.isDone());//checks if done (true) 3
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }




    }
	
	

}
