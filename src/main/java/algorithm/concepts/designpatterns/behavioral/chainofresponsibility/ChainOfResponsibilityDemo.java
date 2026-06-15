package algorithm.concepts.designpatterns.behavioral.chainofresponsibility;

/**
 * ============================================================================
 *  CHAIN OF RESPONSIBILITY (behavioral)
 * ============================================================================
 *
 *  Pass a request along a chain of handlers. Each handler decides either to
 *  process the request or to forward it to the next one. The sender does not
 *  know which handler will ultimately handle it.
 *
 *  WHEN TO USE
 *  -----------
 *  Pipelines where each stage may handle or pass on: servlet filters, the
 *  Spring Security filter chain, logging levels, approval workflows.
 * ============================================================================
 */
public class ChainOfResponsibilityDemo {

    public static void main(String[] args) {
        System.out.println("=== Chain of Responsibility ===");

        // Build the chain: INFO -> WARNING -> ERROR
        Logger chain = new InfoLogger();
        chain.setNext(new WarningLogger())
             .setNext(new ErrorLogger());

        chain.log(Level.INFO,    "starting up");
        chain.log(Level.WARNING, "low disk space");
        chain.log(Level.ERROR,   "disk full");
    }

    enum Level { INFO, WARNING, ERROR }

    /** Base handler: holds the next link and forwards when it cannot handle. */
    abstract static class Logger {
        private Logger next;

        /** Returns the passed handler so links can be chained fluently. */
        Logger setNext(Logger next) { this.next = next; return next; }

        void log(Level level, String message) {
            if (canHandle(level)) {
                write(message);
            } else if (next != null) {
                next.log(level, message);     // forward down the chain
            }
        }
        abstract boolean canHandle(Level level);
        abstract void write(String message);
    }

    static class InfoLogger extends Logger {
        boolean canHandle(Level l) { return l == Level.INFO; }
        void write(String m) { System.out.println("[INFO] " + m); }
    }
    static class WarningLogger extends Logger {
        boolean canHandle(Level l) { return l == Level.WARNING; }
        void write(String m) { System.out.println("[WARN] " + m); }
    }
    static class ErrorLogger extends Logger {
        boolean canHandle(Level l) { return l == Level.ERROR; }
        void write(String m) { System.out.println("[ERROR] " + m); }
    }
}
