package concepts.collections.Lists;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<Integer> linked = new LinkedList<>();


        linked.push(2);
        System.out.println(linked);
        linked.add(3);
        System.out.println(linked);
        linked.offer(4);
        System.out.println(linked);
    }

}
