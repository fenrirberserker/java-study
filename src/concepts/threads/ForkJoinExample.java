/**
 * Simulates multiple workers weighting animals
 * Uses recursion
 */
package concepts.threads;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

public class ForkJoinExample extends RecursiveAction {
    int start;
    int end;
    private Double[] weights;

    public ForkJoinExample(int start, int end, Double[] weights) {
        this.start = start;
        this.end = end;
        this.weights = weights;
    }

    public static void main(String[] args) {
        Double[] weights = new Double[10];

        ForkJoinTask<?> task = new ForkJoinExample(0,weights.length,weights);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(task);

        System.out.println();
        System.out.println("Weights");
        Arrays.asList(weights).stream().forEach(d-> System.out.println(d.intValue()+" "));
    }

    @Override
    protected void compute() {
        if(end-start <=3){//base case
            for(int i=start; i<end; i++){
                weights[i] = (double)new Random().nextInt(100);
                System.out.println("Animal index "+i);
            }
        }else{//recursive case
            int middle = start+((end-start)/2);
            System.out.println("[start="+start+", middle="+middle+", end="+end+"]");
            invokeAll(new ForkJoinExample(start,middle,weights),
                    new ForkJoinExample(middle,end,weights));
        }
    }
}
