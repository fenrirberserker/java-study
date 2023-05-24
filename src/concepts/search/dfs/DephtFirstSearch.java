package concepts.search.dfs;

import concepts.search.Node;

import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

public class DephtFirstSearch {

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

        //traverse(n0);
        traverseRecursive(n0);

    }

    public static void traverse(Node node){
        Deque<Node> stack = new LinkedList<>();//uses lifo
        stack.push(node);

        while (!stack.isEmpty()){
            Node current = stack.pop();//get top elem
            if (!current.isVisited()){//apply logic only to not visited
                current.setVisited(true);//then mark it as visited
                System.out.println(current);
                Collections.reverse(current.getNeighbours());
                current.getNeighbours().forEach(stack::push);//push al neighboors to repeat the logic on all nodes
            }
        }

    }

    public static void traverseRecursive(Node node){//recursive
        node.setVisited(true);
        System.out.println(node);
        node.getNeighbours()
                .stream()
                .filter(n->!n.isVisited())
                .forEach(n->traverseRecursive(n));

    }
}
