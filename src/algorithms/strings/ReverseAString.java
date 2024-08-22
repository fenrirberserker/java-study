package algorithms.strings;

public class ReverseAString {

    public static void main(String[] args) {
        // Write your own function to reverse a string
        // Call this method to Test the method you wrote.
        //Note the signature of the expected function.

        System.out.println("Hello World");
        //TestReverse();

        String a = "Hola";
        String b = a;

        a += "Mundo";
        System.out.println(a);
        System.out.println(b);
    }



    public static void TestReverse()
    {
        System.out.println(Reverse("aabbb")); //bbbaa
        System.out.println(Reverse("a")); //a
        System.out.println(Reverse("abcdef")); // fedcba
    }

    public static String Reverse(String str){
        String reversed = "";

        for (int i = str.length()-1; i >= 0; i--) {
            reversed +=str.charAt(i);
        }


        return reversed;

    }
}
