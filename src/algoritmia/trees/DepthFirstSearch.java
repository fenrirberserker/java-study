package algoritmia.trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * You're given a Node class that has a name and an array of optional children nodes.
 * When put together, nodes form an acyclic tree-like structure.
 *
 * Implement the depthFirstSearch method on the Node class, which takes in an empty array,
 * traverses the tree using the Depth-first Search approach (specifically navigating the tree from left to right),
 * stores all of the nodes' names in the input array, and returns it.
 */
public class DepthFirstSearch {

    public static void main(String[] args) {

        Node root = new Node("A");
        root.children.addAll(Arrays.asList(new Node("B"), new Node("C"), new Node("D")));
        root.children.get(0).children.addAll(Arrays.asList(new Node("E"), new Node("F")));
        root.children.get(0).children.get(1).children.addAll(Arrays.asList(new Node("I"), new Node("J")));
        //root.children.get(1).children.addAll(Arrays.asList())
        root.children.get(2).children.addAll(Arrays.asList(new Node("G"), new Node("H")));
        root.children.get(2).children.get(0).children.add(new Node("K"));

        List<String> result = root.depthFirstSearch(new ArrayList<>());
        System.out.println(result);


    }


    // Do not edit the class below except
    // for the depthFirstSearch method.
    // Feel free to add new properties
    // and methods to the class.
    static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }

        public List<String> depthFirstSearch(List<String> array) {
            // Write your code here.
            array.add(this.name);//adds current value
            for (Node n:this.children) {//iterate children
                n.depthFirstSearch(array);//recursive call
            }
            return array;
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }


    }
}
