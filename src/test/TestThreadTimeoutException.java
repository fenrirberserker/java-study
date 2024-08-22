package test;

import java.util.concurrent.*;

public class TestThreadTimeoutException {

    public static void main(String[] args) {

        ExecutorService service = Executors.newSingleThreadExecutor();


        try{
            CompletableFuture<Void> r = CompletableFuture.runAsync(()->{
                try {

                    for(int i=0; i<1000; i++){
                        new Thread(()->{
                            System.out.println(Thread.currentThread().getName());
                        }).start();
                    }
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            r.get(1, TimeUnit.SECONDS);

        }catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (TimeoutException e) {
            System.err.println("Here we capture the exception");
            throw new RuntimeException(e);
        }

    }
}
