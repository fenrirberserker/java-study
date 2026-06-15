package algorithm.concepts.designpatterns.structural.proxy;

/**
 * ============================================================================
 *  PROXY (structural)
 * ============================================================================
 *
 *  Provide a stand-in for another object to control access to it. The proxy
 *  implements the same interface as the real object and can add behavior
 *  BEFORE/AFTER delegating: lazy creation, access control, caching, logging.
 *
 *  WHEN TO USE
 *  -----------
 *  Expensive objects you want to create on first use (virtual proxy), access
 *  checks (protection proxy), remote calls. Spring's @Transactional / AOP are
 *  proxies generated at runtime around your beans.
 * ============================================================================
 */
public class ProxyDemo {

    public static void main(String[] args) {
        System.out.println("=== Proxy (lazy loading) ===");
        Image image = new ImageProxy("photo.jpg");   // nothing loaded yet

        System.out.println("created proxy; file not loaded until first display");
        image.display();   // proxy loads the real image on first use
        image.display();   // already loaded — no second load
    }

    interface Image {
        void display();
    }

    /** The real, expensive object. */
    static class RealImage implements Image {
        private final String file;
        RealImage(String file) {
            this.file = file;
            System.out.println("loading " + file + " from disk (expensive)");
        }
        public void display() { System.out.println("displaying " + file); }
    }

    /** The proxy: same interface, but defers creation and reuses the instance. */
    static class ImageProxy implements Image {
        private final String file;
        private RealImage real;       // created only when first needed
        ImageProxy(String file) { this.file = file; }

        public void display() {
            if (real == null) real = new RealImage(file);   // lazy creation
            real.display();                                  // delegate
        }
    }
}
