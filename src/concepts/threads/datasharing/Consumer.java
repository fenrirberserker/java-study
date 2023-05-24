package concepts.threads.datasharing;

public class Consumer implements Runnable{

    private int value =0;

    Consumer(int value){
        this.value=value;
    }
    @Override
    public void run() {
        value--;

        System.out.println("Consumer shared var "+value);

    }
}
