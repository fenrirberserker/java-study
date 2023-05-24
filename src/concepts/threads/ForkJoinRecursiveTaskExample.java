package concepts.threads;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class ForkJoinRecursiveTaskExample extends RecursiveTask<Double> {
    int start;
    int end;
    private static Double[] weigths = new Double[10];;

    public ForkJoinRecursiveTaskExample(int start, int end, Double[] weigths) {
        this.start = start;
        this.end = end;
        this.weigths = weigths;
    }

    public static void main(String[] args) {
        ForkJoinTask<Double> task = new ForkJoinRecursiveTaskExample(0, weigths.length, weigths);
        ForkJoinPool pool = new ForkJoinPool();
        Double sum = pool.invoke(task);
        System.out.println("Sum is: "+sum);
    }

    @Override
    protected Double compute() {
        if(end-start <=3){//base case
            double sum =0;
            for(int i=start; i<end; i++){
                weigths[i] = (double)new Random().nextInt(100);
                System.out.println("Animal weighed: "+i);
                sum += weigths[i];
            }
            return sum;
        }else{//recursive case
            int middle = start+((end-start)/2);
            System.out.println("[start="+start+", middle="+middle+", end="+end+"]");
            RecursiveTask<Double> othertask = new ForkJoinRecursiveTaskExample(start,middle,weigths);
            othertask.fork();
            return new ForkJoinRecursiveTaskExample(middle, end, weigths).compute()+othertask.join();
        }
    }
}
