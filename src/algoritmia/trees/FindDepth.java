package algoritmia.trees;

public class FindDepth {

    public static void main(String[] args) {

        Node root = new Node(3);                    //3
        root.left = new Node(9);                //9   //20
        root.right = new Node(20);
        root.right.left = new Node(15);             //15    //7
        root.right.right = new Node(7);

        int result = findDepth(root);
        System.out.println(result);


    }


    public static int findDepth(Node node){
        if(node==null){
            return 0;
        }else{
            return 1 + Math.max(findDepth(node.left), findDepth(node.right));
        }
    }
}
