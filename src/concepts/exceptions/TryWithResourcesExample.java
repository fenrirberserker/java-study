package concepts.exceptions;

/**
 * ============================================================================
 *  TRY-WITH-RESOURCES — automatic resource management
 * ============================================================================
 *  Any object that implements AutoCloseable can be declared in the try
 *  header. Java will call close() automatically at the end of the block,
 *  even if an exception is thrown. No manual finally needed.
 *
 *  Multiple resources are closed in REVERSE order of their declaration.
 * ============================================================================
 */
public class TryWithResourcesExample {

    /** Toy resource that prints when opened and closed. */
    static class Resource implements AutoCloseable {
        private final String name;
        public Resource(String name) {
            this.name = name;
            System.out.println("open " + name);
        }
        public void use() {
            System.out.println("use " + name);
        }
        @Override
        public void close() {
            System.out.println("close " + name);
        }
    }

    public static void main(String[] args) {
        // Single resource
        try (Resource r = new Resource("file.txt")) {
            r.use();
        }   // close() runs here automatically

        // Multiple resources — closed in reverse order (b then a)
        try (Resource a = new Resource("A");
             Resource b = new Resource("B")) {
            a.use();
            b.use();
        }
    }
}
