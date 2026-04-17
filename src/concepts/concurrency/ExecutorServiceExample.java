package concepts.concurrency;

import java.util.concurrent.*;

public class ExecutorServiceExample {

    private static int  counter=0;

	public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            Future<?> result = service.submit(()->
                    {
                        for(int i=0;i<1_000_000_000;i++) {
                            counter++;
                        }
                    }
            );
            result.get(10, TimeUnit.SECONDS);//returns null for runnable
            System.out.println("Reached ");
        }catch (TimeoutException | InterruptedException | ExecutionException e){
            System.out.println("Not Reached ");
        }

        try (var serviceWithCallable = Executors.newSingleThreadExecutor()) {//try with resources autocloses the service
            Future<Integer> result = serviceWithCallable.submit(() -> 30 + 11);
            System.out.println(result.get());  // 41
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


		/*ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			System.out.println("begin");
			service.execute(()->{
				System.out.println("Printing zoo inventory");
			});
			service.execute(()->{
				for(int i=0;i<3;i++) {
					System.out.println("Printing record "+i);
				}
			});
			service.execute(()->{
				System.out.println("Printing zoo inventory");
			});
			System.out.println("end");
		}finally {
			if(service!=null)
				service.shutdown();
		}*/





	}

}
