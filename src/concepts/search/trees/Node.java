package concepts.search.trees;

public class Node {

    int val;
    Node left;
    Node right;
    Node(int val){this.val = val;}

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
