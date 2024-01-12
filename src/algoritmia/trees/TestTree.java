package algoritmia.trees;

public class TestTree {

	public static void main(String[] args) {
		
		Node n = new Node(10);
		n.insert(7);
		n.insert(12);
		n.insert(15);
		n.insert(11);
		n.insert(9);
		n.insert(5);
		
		System.out.println("Inorder");//left, root, right
		n.inOrder();
		System.out.println("\nPreorder");//root, left, right
		n.preOrder();
		System.out.println("\nPostorder");//left, right, root
		n.postOrder();
		
	}

}
