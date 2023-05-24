package concepts.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Counts sheeps synchronously
 */

public class SynchronizedExample {

    private int sheepCount=0;

    public static void main(String[] args) {
        ExecutorService service =null;
        try{
            service = Executors.newFixedThreadPool(20);//creates 20 concepts.threads to work asynchronously
            SynchronizedExample example = new SynchronizedExample();

            for(int i=0; i<10; i++){
                service.submit(()-> example.countSheep());
            }
        }finally {
            if(service!=null)
                service.shutdown();
        }

    }

    private synchronized void countSheep(){
        System.out.println("sheeps:"+(++sheepCount));
    }
}
