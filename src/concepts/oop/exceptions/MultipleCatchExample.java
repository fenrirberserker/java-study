package concepts.oop.exceptions;

/**
 * ============================================================================
 *  MULTIPLE CATCH and MULTI-CATCH
 * ============================================================================
 *  - Multiple catch blocks: handle different exception types differently.
 *    They are checked top-down; the first matching one runs. Order them from
 *    MOST SPECIFIC to MOST GENERAL — listing a parent type before a child
 *    type is a compile error (unreachable catch).
 *
 *  - Multi-catch (Java 7+): combine unrelated types with "|" when the
 *    handling logic is identical.
 * ============================================================================
 */
public class MultipleCatchExample {

    static void handle(int choice) {
        try {
            switch (choice) {
                case 1: throw new NullPointerException("null!");
                case 2: throw new ArrayIndexOutOfBoundsException("out of bounds!");
                case 3: throw new NumberFormatException("bad number!");
                default: throw new RuntimeException("generic!");
            }
        } catch (NullPointerException e) {
            System.out.println("specific: NullPointerException → " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            // multi-catch: same handling for two unrelated types
            System.out.println("multi: " + e.getClass().getSimpleName() + " → " + e.getMessage());
        } catch (RuntimeException e) {
            // catches anything else of type RuntimeException — keep last
            System.out.println("generic: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) handle(i);
    }
}
