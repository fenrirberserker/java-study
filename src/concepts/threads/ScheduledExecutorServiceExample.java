package concepts.threads;

import java.util.concurrent.*;

public class ScheduledExecutorServiceExample {

    public static void main(String[] args) {

        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        Runnable runnable = ()-> System.out.println("Hello World");
        Callable<String> callable = ()-> "Money";

        Future<?> result1 = service.schedule(runnable, 10, TimeUnit.SECONDS);
        Future<?> result2 = service.schedule(callable, 8, TimeUnit.SECONDS);
        try {
            System.out.println(result2.get(10,TimeUnit.SECONDS));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }
}
