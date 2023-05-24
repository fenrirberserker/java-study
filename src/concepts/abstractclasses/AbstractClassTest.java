package concepts.abstractclasses;

public class AbstractClassTest {

    public static void main(String[] args) {
        AbstractClass abs = new ConcreteClass() {

        };

        abs.abstractMethod();
    }
}
