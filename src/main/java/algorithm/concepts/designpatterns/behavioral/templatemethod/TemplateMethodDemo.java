package algorithm.concepts.designpatterns.behavioral.templatemethod;

/**
 * ============================================================================
 *  TEMPLATE METHOD (behavioral)
 * ============================================================================
 *
 *  A base class defines the SKELETON of an algorithm in one final method (the
 *  "template method"), and defers specific steps to subclasses. The overall
 *  order is fixed; only the variable steps are overridden.
 *
 *  WHEN TO USE
 *  -----------
 *  Several flows share the same sequence but differ in a few steps (parsing a
 *  file, an HTTP request lifecycle). JdbcTemplate and the servlet lifecycle are
 *  classic examples — the framework owns the flow, you fill in the blanks.
 * ============================================================================
 */
public class TemplateMethodDemo {

    public static void main(String[] args) {
        System.out.println("=== Template Method ===");
        System.out.println("-- CSV --");
        new CsvReport().generate();
        System.out.println("-- HTML --");
        new HtmlReport().generate();
    }

    /** The base class fixes the algorithm's steps and their order. */
    abstract static class ReportGenerator {

        /** The template method — final so subclasses cannot change the flow. */
        final void generate() {
            openSource();
            String body = formatBody();      // the step that varies
            System.out.println(body);
            closeSource();
        }

        // Shared steps with a default implementation:
        void openSource()  { System.out.println("opening data source"); }
        void closeSource() { System.out.println("closing data source"); }

        // The variable step each subclass must provide:
        abstract String formatBody();
    }

    static class CsvReport extends ReportGenerator {
        String formatBody() { return "id,name\n1,Ada\n2,Linus"; }
    }

    static class HtmlReport extends ReportGenerator {
        String formatBody() { return "<table><tr><td>1</td><td>Ada</td></tr></table>"; }
    }
}
