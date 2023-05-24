package algoritmia.trees;

import java.util.ArrayList;
import java.util.List;

public class Node {
	
	Node left,right;
	int data;

	
	public Node(int data) {
		this.data = data;
	}
	
	public void insert(int value) {
		
		if(value<=data) {//value is minor
			if(left==null) {
				left = new Node(value);
			}else {
				left.insert(value);
			}
		}else {//value is major
			if(right==null) {
				right = new Node(value);
			}else {
				right.insert(value);
			}
		}
	}
	
	public boolean contains(int value) {
		if(value == data) {//if current node equals value
			return true;
		}else if(value<data) {//search left
			if(left == null) {
				return false;
			}else {
				return left.contains(value);
			}
		}else {//search right
			if(right==null) {
				return false;
			}else {
				return right.contains(value);
			}
		}
	}
	
	//left, root, right
	public void inOrder(List<Integer> numbers) {
		if(left!=null) {//left
			left.inOrder(numbers);
		}
		System.out.println(data);//current
		numbers.add(data);
		if(right!=null) {//right
			right.inOrder(numbers);
		}
	}
	
	//root, left, right
	public void preOrder() {
		System.out.println(data);//root
		if(left!=null) {//left
			left.preOrder();
		}
		if(right!=null) {//right
			right.preOrder();
		}
	}
	
	//left, right, root
	public void postOrder() {
		if(left!=null) {
			left.postOrder();
		}
		if(right!=null) {
			right.postOrder();
		}
		System.out.println(data);
	}

}
