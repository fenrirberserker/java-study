package concepts.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceDemo {

	public static void main(String[] args) {
		
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		
		Runnable task1 = ()-> System.out.println("Hello Zoo");
		Callable<String> task2 = ()-> "Monkey";
		
		Future<?> result1 = service.schedule(task1, 5, TimeUnit.SECONDS);
		//get the value after 20s
		Future<?> result2 = service.schedule(task2, 10, TimeUnit.SECONDS);
		
		
		try {
			//print when value is ready
			System.out.println(result2.get());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
		Runnable scheduled1 = ()->System.out.println("printing first runnable");
		Runnable scheduled2 = ()->System.out.println("printing second runnable");
		
		
		Future<?> scheduledresult = service.scheduleAtFixedRate(scheduled1, 15, 3, TimeUnit.SECONDS);
		Future<?> scheduledresul2 = service.scheduleWithFixedDelay(scheduled2, 20, 3, TimeUnit.SECONDS);
		
		
	}

}
