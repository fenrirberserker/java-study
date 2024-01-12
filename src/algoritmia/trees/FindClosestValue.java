package algoritmia.trees;

import java.util.*;

/**
 * Write a function that takes in a Binary Search Tree (BST) and a target integer value and returns the closest value to that target value contained in the BST.
 *
 * You can assume that there will only be one closest value.
 *
 * Each BST node has an integer value, a left child node, and a right child node.
 * A node is said to be a valid BST node if and only if it satisfies the BST property:
 * its value is strictly greater than the values of every node to its left;
 * its value is less than or equal to the values of every node to its right;
 * and its children nodes are either valid BST nodes themselves or None / null.
 */

public class FindClosestValue {

    public static void main(String[] args) {

        Node root = new Node(10);
        root.insert(5);
        root.insert(15);
        root.insert(2);
        root.insert(5);
        root.insert(13);
        root.insert(22);
        root.insert(1);
        root.insert(14);

        int target = 12;

        int result = closest(root,target);

        System.out.println("Result is : "+result);


    }

    public static int closest(Node root, int target){

        Map<Integer,Integer> values = new TreeMap<>();
        List<Integer> numbers = new ArrayList<>();

        root.inOrder();
        numbers.stream().forEach( x->{
            System.out.println("i "+x);
            int diff =0;
            if(x>target){
                diff = x-target;
            } else if (x<target) {
                diff = target-x;
            }
            values.put(x,diff);
        });

        System.out.println("Values ");
        System.out.println(values);

        Integer smallest = values.entrySet().stream().sorted(Comparator.comparing(x->x.getValue())).findFirst().get().getKey();

        return smallest;
    }
}
