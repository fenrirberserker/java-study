/**
 * Coordinates multiple concepts.threads
 * Sets a limit, when reached, then other tasks can start
 */

package concepts.threads;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierExample {
    public static void main(String[] args) {
        ExecutorService service = null;
        try{
            service = Executors.newFixedThreadPool(4);
            CyclicBarrierExample example = new CyclicBarrierExample();
            //define num of workers
            CyclicBarrier c1 = new CyclicBarrier(4);
            //action triggered when completede
            CyclicBarrier c2 = new CyclicBarrier(4, ()-> System.out.println("Pean cleaned"));

            for(int i=0; i<4; i++){
                service.submit( ()-> example.performTask(c1,c2));
            }
        }finally {
            if(service!=null){
                service.shutdown();
            }
        }
    }

    public void removeAnimals(){
        System.out.println("Removing animals");
    }
    public void cleanPen(){
        System.out.println("Cleaning pen");
    }

    public void addAnimals(){
        System.out.println("Adding animals");
    }

    public void performTask(CyclicBarrier c1, CyclicBarrier c2){
        try{
            removeAnimals();
            c1.await();
            cleanPen();
            c2.await();
            addAnimals();
        }catch (InterruptedException | BrokenBarrierException e){
            e.printStackTrace();
        }
    }
}
