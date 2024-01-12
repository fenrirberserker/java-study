package algoritmia.trees;

/**
 * Test if a binary tree is symmetric
 */
public class Symmetric {

    /*class Node{

        Node(int data){

        }

        Node(int data, Node left, Node right){

        }

    }*/

    public static void main(String[] args) {

        Node first = new Node(5);
        first.left = new Node(2);
        first.right = new Node(8);
        first.left.left = new Node(9);
        first.left.right = new Node(7);
        first.right.left = new Node(1);
        first.left.left.left = new Node(3);
        first.left.left.right = new Node(0);
        first.left.right.right = new Node(6);

        Node second = new Node(5);
        second.left = new Node(8);
        second.right = new Node(2);
        second.left.right = new Node(1);
        second.right.left = new Node(7);
        second.right.right = new Node(9);
        second.right.left.left = new Node(6);
        second.right.right.left = new Node(0);
        second.right.right.right = new Node(3);





    }

    public static boolean isSymmetric(Node node1, Node node2){

        if(node1 == null && node2 == null){
            return true;
        }

        return false;

    }
}
