package algorithms.trees;

import java.util.*;

/**
 * You're given a Node class that has a name and an array of optional children nodes.
 * When put together, nodes form an acyclic tree-like structure.
 *
 * Implement the breadthFirstSearch method on the Node class,
 * which takes in an empty array,
 * traverses the tree using the Breadth-first Search approach (specifically navigating the tree from left to right),
 * stores all of the nodes' names in the input array, and returns it.
 */

public class BreadthFirstSearch {



    public static void main(String[] args) {

        Node root = new Node("A");
        root.children.addAll(Arrays.asList(new BreadthFirstSearch.Node("B"), new Node("C"), new Node("D")));
        root.children.get(0).children.addAll(Arrays.asList(new Node("E"), new Node("F")));
        root.children.get(0).children.get(1).children.addAll(Arrays.asList(new Node("I"), new Node("J")));
        root.children.get(2).children.addAll(Arrays.asList(new Node("G"), new Node("H")));
        root.children.get(2).children.get(0).children.add(new Node("K"));

        List<String> result = root.breadthFirstSearch(new ArrayList<>());
        System.out.println(result);


    }

    static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }

        public List<String> breadthFirstSearch(List<String> array) {
            // Write your code here.
            Queue<Node> queue = new ArrayDeque<>();
            Node current = this;//references the node on which breadthFirstSearch is called
            queue.add(current);//add root/current to queue

            while(!queue.isEmpty()){//while nodes in queue
                current = queue.remove();//current is next on the queue
                array.add(current.name);//add extracted to the array
                queue.addAll(current.children); //all children of current are added to the queue
            }

            return array;
        }

    }
}
