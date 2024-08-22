package algorithms.trees;

/**
 * Test if a binary tree is symmetric
 */
public class Symmetric {

    public static void main(String[] args) {

        Node left = new Node(5);
        left.left = new Node(2);
        left.right = new Node(8);
        left.left.left = new Node(9);
        left.left.right = new Node(7);
        left.right.left = new Node(1);
        left.left.left.left = new Node(3);
        left.left.left.right = new Node(0);
        left.left.right.right = new Node(6);

        Node right = new Node(5);
        right.left = new Node(8);
        right.right = new Node(2);
        right.left.right = new Node(1);
        right.right.left = new Node(7);
        right.right.right = new Node(9);
        right.right.left.left = new Node(6);
        right.right.right.left = new Node(0);
        right.right.right.right = new Node(3);


        Node node = new Node(1);
        node.left = left;
        node.right = right;

        System.out.println("Tree");
        node.inOrder();

        System.out.println("Result");
        boolean result = isSymmetric(node);
        System.out.println("Result "+result);
    }

    public static boolean isSymmetric(Node node){
        if(node == null){
            return true;
        }

        return areSymmetric(node.left, node.right);
    }

    public static boolean areSymmetric(Node node1, Node node2){

        if(node1 == null && node2 == null){//exit condition/ if end reached
            return true;
        }else if ( (node1==null) != (node2==null) || node1.data != node2.data){
            return false;
        }else {
            return areSymmetric(node1.left, node2.right) && areSymmetric(node1.right, node2.left);
        }

    }
}
