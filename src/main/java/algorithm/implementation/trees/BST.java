package algorithm.implementation.trees;

/**
 * Binary search tree demo built on {@link Node}: each value sits to the left of
 * its parent when smaller and to the right when larger. That ordering keeps
 * search, insert and contains at O(log n) on a balanced tree, and an in-order
 * traversal reads the values back in sorted order.
 */
public class BST {

    public static void main(String[] args) {
        Node root = new Node(4);
        for (int value : new int[]{2, 7, 1, 3}) {
            root.insert(value);            // each insert walks down to the correct leaf
        }

        System.out.println("contains(3) = " + root.contains(3));
        System.out.println("contains(5) = " + root.contains(5));

        System.out.println("in-order (sorted):");
        root.inOrder();
    }
}
