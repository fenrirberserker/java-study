package concepts.collections.Sets;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {

        List<String> set1 = new ArrayList<>();
        set1.add("c");
        set1.add("b");
        set1.add("a");
        set1.add("d");


        Set<String> set2 = new TreeSet<>();
        set2.add("c");
        set2.add("b");
        set2.add("a");
        set2.add("d");


        System.out.println(set1);
        System.out.println(set2);

    }
}
