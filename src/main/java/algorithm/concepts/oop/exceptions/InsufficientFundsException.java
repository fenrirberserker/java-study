package algorithm.concepts.oop.exceptions;

/**
 * ============================================================================
 *  CUSTOM EXCEPTION — domain-specific, checked
 * ============================================================================
 *  Extending Exception (not RuntimeException) makes it CHECKED, so callers
 *  must explicitly handle or declare it. Always provide:
 *    - a constructor with a message
 *    - a constructor with message + cause (for chaining)
 *
 *  For unchecked custom exceptions, extend RuntimeException instead.
 * ============================================================================
 */
public class InsufficientFundsException extends Exception {

    private final double shortfall;

    public InsufficientFundsException(String message, double shortfall) {
        super(message);
        this.shortfall = shortfall;
    }

    public InsufficientFundsException(String message, double shortfall, Throwable cause) {
        super(message, cause);
        this.shortfall = shortfall;
    }

    public double getShortfall() { return shortfall; }
}
