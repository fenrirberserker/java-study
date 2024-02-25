package concepts.exceptions;

public class ExceptionTest {

    public static void main(String[] args) {


        try{
            //do risky thing
        }
        catch (Exception e){//either catch
            e.printStackTrace();
        }
        finally{//or finally

        }

        try{
            System.out.println("asfdsafsa");
        }
        finally {
            System.out.println("SASADSAD");
        }

        //Exceptions must have at least one catch or either finally
    }
}
