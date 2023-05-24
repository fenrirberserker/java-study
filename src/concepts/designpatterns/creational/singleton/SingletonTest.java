package concepts.designpatterns.creational.singleton;

public class SingletonTest {

    public static void main(String[] args) {

        Singleton instance = Singleton.getInstance();
//        Singleton instance2 = new Singleton();//should not work
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance);
        System.out.println(instance2);
    }
}
