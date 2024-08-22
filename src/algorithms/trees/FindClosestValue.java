package algorithms.trees;

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

    static class Node {

        algorithms.trees.Node left,right;
        int data;


        public Node(int data) {
            this.data = data;
        }

        public void insert(int value) {

            if(value<=data) {//value is minor
                if(left==null) {
                    left = new algorithms.trees.Node(value);
                }else {
                    left.insert(value);
                }
            }else {//value is major
                if(right==null) {
                    right = new algorithms.trees.Node(value);
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
        public void inOrder() {
            if(left!=null) {//left
                left.inOrder();
            }
            System.out.println(data);//root
            if(right!=null) {//right
                right.inOrder();
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
            System.out.println(data);//root
        }

        //left, root, right
        public void inOrder(List<Integer> list) {
            if(left!=null) {//left
                left.inOrder();
            }
            System.out.println(data);//root
            list.add(data);
            if(right!=null) {//right
                right.inOrder();
            }
        }

    }



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

        root.inOrder(numbers);
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

        Integer smallest = values.entrySet().stream().min(Map.Entry.comparingByValue()).get().getKey();

        return smallest;
    }

}
