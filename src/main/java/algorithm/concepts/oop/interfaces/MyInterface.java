package algorithm.concepts.oop.interfaces;

public interface MyInterface {

    int i =1;

    void doThing();

    abstract void maybe();

    default void another(){

        System.out.println("Heeey");
    }

}
