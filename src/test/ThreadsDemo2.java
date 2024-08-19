package test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadsDemo2 {

    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<?> future = service.submit(() ->  {
            Thread.sleep(5000);
            return "Hello thread";
        });
        try {
            System.out.println(future.get() );
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }finally {
			service.shutdown();
		}
    }
}
