package concepts.search.bfs;

import concepts.search.Node;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch<T> {





    public static void main(String[] args) {


        Node n0 = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        n0.setNeighbours(Arrays.asList(n1,n2,n6));
        n1.setNeighbours(Arrays.asList(n3,n4,n5));
        n4.setNeighbours(Arrays.asList(n2,n6));
        n6.setNeighbours(Arrays.asList(n0));

        traverse(n0);
    }

    public static void traverse(Node node){

        Queue<Node> queue = new LinkedList<>();//uses fifo
        queue.add(node);
        while(!queue.isEmpty()){
            Node current = queue.poll();
            if(!current.isVisited()){
                current.setVisited(true);
                System.out.println(current);
                queue.addAll(current.getNeighbours());
            }

        }

    }

}
