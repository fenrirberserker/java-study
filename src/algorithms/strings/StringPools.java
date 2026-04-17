package algorithms.strings;

public class StringPools {

    public static void main(String[] args) {

        String a = "hello";
        String b = "hello";

        System.out.println(a == b);
        b = new String("hello");
        System.out.println(a == b);

        String c = "hello";
        String d = c;
        System.out.println(c);
        System.out.println(d);
        c = "world";
        System.out.println(c);
        System.out.println(d);

        int n = 1;
        int m = n;
        System.out.println(n);
        System.out.println(m);
        n = 3;
        System.out.println(n);
        System.out.println(m);
    }
}
