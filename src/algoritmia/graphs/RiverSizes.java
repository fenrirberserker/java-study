package algoritmia.graphs;

import java.util.*;
import java.util.function.BiPredicate;

/**
 * You're given a two-dimensional array (a matrix) of potentially unequal height and width containing only 0s and 1s.
 * Each 0 represents land, and each 1 represents part of a river.
 * A river consists of any number of 1s that are either horizontally or vertically adjacent (but not diagonally adjacent).
 * The number of adjacent 1s forming a river determine its size.
 *
 * Note that a river can twist. In other words, it doesn't have to be a straight vertical line or a straight horizontal line;
 * it can be L-shaped, for example.
 *
 * Write a function that returns an array of the sizes of all rivers represented in the input matrix.
 * The sizes don't need to be in any particular order.
 */

public class RiverSizes {

    static int globalcount = 0;
    static Map<Node,Boolean> nodes = new HashMap<>();
    static BiPredicate<Integer, int[][]> bounds = (x, matrix)->{
        return x>=0 && x<= matrix.length-1;
    };


    public static void main(String[] args) {

        int[][] matrix = {
                {1, 1, 0, 1, 0},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 0, 0},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1}
            };

        List<Integer> sizes = riverSizes(matrix);
        System.out.println("Sizes "+sizes);
        //int size = checkNode(matrix,0,0);
        //System.out.println("size "+size);
    }

    public static List<Integer> riverSizes(int[][] matrix) {
        // Write your code here.
        List<Integer> sizes = new ArrayList<>();

        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[x].length; y++) {
                //System.out.print(matrix[i][j]+ " ");
                Node n = new Node(x,y);
                n.value = matrix[x][y];
                System.out.println("Iterate "+n);
                if(!nodes.containsKey(n) && n.value == 1){
                    int size = checkNode(matrix,x,y);
                    if(size>0){
                        sizes.add(size);
                    }
                    System.out.println("size "+size);
                }else{
                    continue;
                }

            }
            System.out.println();
        }
        return sizes;
    }

    public static int checkNode(int[][] matrix, int x, int y){

        int size =0;
        Node n = new Node(x,y);
        n.value = matrix[x][y];
        if(n.value==1)
            size++;
        n.isVisited=true;
        nodes.put(n,true);
        System.out.println(n);


        if (x-1 >= 0 && matrix[x-1][y] == 1) {//up
            n.up= new Node(x-1,y);
            if(!nodes.containsKey(n.up))
                size += checkNode(matrix,x-1,y);
        }
        if (x+1 < matrix.length && matrix[x+1][y] == 1) {//down
            n.down= new Node(x+1,y);
            if(!nodes.containsKey(n.down))
                size += checkNode(matrix,x+1,y);
        }
        if (y-1 >= 0 && matrix[x][y-1] == 1) {//left
            n.left= new Node(x,y-1);
            if(!nodes.containsKey(n.left))
                size += checkNode(matrix,x,y-1);
        }
        if (y+1 < matrix.length && matrix[x][y+1] == 1){//right
            n.right= new Node(x,y+1);
            if(!nodes.containsKey(n.right))
                size += checkNode(matrix,x,y+1);
        }

        return size;
    }

    static class Node{
        Integer value;
        int x=0;
        int y=0;
        Boolean isVisited = false;
        Node left;
        Node right;
        Node up;
        Node down;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return x == node.x && y == node.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        @Override
        public String toString() {
            return "Node{" +
                    " position= " + x+" "+y+
                    ", value=" + value +
                    ", isVisited=" + isVisited +
                    '}';
        }


    }


}
