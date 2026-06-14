package concepts.oop.interfaces;

public interface My2Interface extends MyInterface{

    default void another(){

        System.out.println("Yoooo");
    }
}
