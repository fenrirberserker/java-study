package concepts.strings;

public class StringTest {

    public static void main(String[] args) {


        String s = String.join("\n","hola","mundo","mundano");

        System.out.println(s);

        String s2 = "Convert \nlines \nto \nstreams";
        s2.lines().forEach(System.out::println);

        String s3 = "ABC";
        System.out.println(s3.matches("\\w+"));

        System.out.println(s3.repeat(5));

        String s4 = "a1b2c3";

        String[] arr = s4.split("\\d");
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
