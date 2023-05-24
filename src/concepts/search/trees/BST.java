package concepts.search.trees;

import algoritmia.mapping.MapHashTest;

import java.util.HashSet;

public class BST {

    public static void main(String[] args) {

        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);

        Node n1 = search(root, 3);
        System.out.println(n1);


    }


    public static Node search(Node root, int val){
        System.out.println(root);

        if(root==null){return null;}
        if(root.val==val){return root;}
        if(val< root.val){
            return search(root.left,val);
        }else{
            return search(root.right,val);
        }
    }
}
