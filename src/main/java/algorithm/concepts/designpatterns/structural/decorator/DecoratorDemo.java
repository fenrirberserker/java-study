package algorithm.concepts.designpatterns.structural.decorator;

/**
 * ============================================================================
 *  DECORATOR (structural)
 * ============================================================================
 *
 *  Attach extra behavior to an object by WRAPPING it in another object that
 *  implements the same interface. Decorators can be stacked, each adding one
 *  responsibility — an alternative to a subclass explosion.
 *
 *  WHEN TO USE
 *  -----------
 *  Add features dynamically without changing the original class: Java I/O
 *  (new BufferedReader(new FileReader(...))), add-ons, wrappers around clients.
 * ============================================================================
 */
public class DecoratorDemo {

    public static void main(String[] args) {
        System.out.println("=== Decorator ===");

        // Plain coffee, then wrapped with milk and sugar — decorators stack.
        Coffee order = new Sugar(new Milk(new SimpleCoffee()));
        System.out.println(order.description() + " = " + order.cost());
    }

    /** The component interface shared by the core object and all decorators. */
    interface Coffee {
        String description();
        double cost();
    }

    /** The concrete component being decorated. */
    static class SimpleCoffee implements Coffee {
        public String description() { return "coffee"; }
        public double cost() { return 2.0; }
    }

    /** Base decorator: holds a wrapped Coffee and delegates to it. */
    abstract static class CoffeeDecorator implements Coffee {
        protected final Coffee inner;
        CoffeeDecorator(Coffee inner) { this.inner = inner; }
    }

    static class Milk extends CoffeeDecorator {
        Milk(Coffee inner) { super(inner); }
        public String description() { return inner.description() + " + milk"; }
        public double cost() { return inner.cost() + 0.5; }
    }

    static class Sugar extends CoffeeDecorator {
        Sugar(Coffee inner) { super(inner); }
        public String description() { return inner.description() + " + sugar"; }
        public double cost() { return inner.cost() + 0.2; }
    }
}
