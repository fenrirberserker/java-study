package concepts.interfaces;

public class MyImpl implements MyInterface{

    public static void main(String[] args) {
        MyInterface i = new MyImpl();
        i.another();
        i.doThing();
    }
    @Override
    public void doThing() {
        System.out.println("hoooy");

    }

    @Override
    public void maybe() {

    }


}
