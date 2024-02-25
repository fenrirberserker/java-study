package concepts.interfaces;

public interface My2Interface extends MyInterface{

    default void another(){

        System.out.println("Yoooo");
    }
}
