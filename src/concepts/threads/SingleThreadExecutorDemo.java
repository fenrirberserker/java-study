package concepts.threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SingleThreadExecutorDemo {

    public static void main(String[] args) {

        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

        Runnable runnable = ()-> { System.out.println("Hola");};

        //Future<String> result = service.submit(callable);
        //service.scheduleAtFixedRate(callable,0,60,TimeUnit.SECONDS);
        service.scheduleAtFixedRate(runnable,0,60,TimeUnit.SECONDS);



    }
}
