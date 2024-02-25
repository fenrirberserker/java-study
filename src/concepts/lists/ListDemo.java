package concepts.lists;

import java.util.LinkedList;

public class ListDemo {

    public static void main(String[] args) {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("one");
        linked.add("two");
        linked.add("three");
        System.out.println(linked);
        System.out.println(linked.getFirst());
        System.out.println(linked.getLast());
    }
}
