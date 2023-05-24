package concepts.threads.datasharing;

public class Producer implements Runnable{

    private int value=0;

    Producer(int value){
        this.value=value;
    }
    @Override
    public void run() {
        value++;

        System.out.println("Producer shared var "+value);

    }
}
