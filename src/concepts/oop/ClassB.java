package concepts.oop;

public class ClassB extends ClassA{

    @Override
    public void doThing() {
        System.out.println("doThing ClassB method");
    }

    public void doBThing(){
        System.out.println("B specifically thing");
    }
}
