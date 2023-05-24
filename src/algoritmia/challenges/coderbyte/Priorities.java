package algoritmia.challenges.coderbyte;

import java.util.PriorityQueue;

public class Priorities {

    public static void main(String[] args) {
        PriorityQueue todo = new PriorityQueue<>();
        todo.add("dishes");
        todo.add("laundry");
        todo.add("bills");
        todo.add("bills");
        System.out.println(todo.size() + " " + todo.poll());
        System.out.println(" " +todo.peek()+" "+todo.poll());
        System.out.println(" "+todo.poll()+" "+todo.poll());
    }
}
