package concepts.interfaces;

public class MyImpl implements My2Interface{

    public static void main(String[] args) {
        MyInterface i = new MyImpl();
        i.another();//excecutes overriden method
        i.doThing();//executes overriden method
    }
    @Override
    public void doThing() {
        System.out.println("hoooy");

    }

    @Override
    public void maybe() {

    }


}
