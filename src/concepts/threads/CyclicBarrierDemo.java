package concepts.threads;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierDemo {public static void main(String[] args) {
    ExecutorService service = null;
    try{
        service = Executors.newFixedThreadPool(4);
        CyclicBarrierDemo example = new CyclicBarrierDemo();
        //define num of workers
        CyclicBarrier c1 = new CyclicBarrier(4);
        //action triggered when completede
//        CyclicBarrier c2 = new CyclicBarrier(4);

        for(int i=0; i<4; i++){
            service.submit( ()-> example.performTask(c1));
        }
    }finally {
        if(service!=null){
            service.shutdown();
        }
    }
}

    public void read(){
    System.out.println("Process");
    for(int i=0; i<4; i++){
        System.out.println("processing "+i);
    }

    }


    public void performTask(CyclicBarrier c1){
        try{
            read();
            c1.await();

        }catch (InterruptedException | BrokenBarrierException e){
            e.printStackTrace();
        }
    }
}
