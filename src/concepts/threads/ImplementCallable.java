package concepts.threads;

import java.util.concurrent.*;

public class ImplementCallable implements Callable {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service;

        try{
            service = Executors.newSingleThreadExecutor();
            //Future<Integer> result = service.submit(new ImplementCallable());
            Future<Integer> result = service.submit(()->30+11);//callable
            System.out.println(result.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object call() {
        return 30+11;
    }
}
