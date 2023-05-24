package concepts.threads.datasharing;

public class ThreadTest {


    public static void main(String[] args) {
        int num=5;
        Producer p = new Producer(num);
        Consumer c = new Consumer(num);
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);

        t1.start();
        t2.start();

    }


}
