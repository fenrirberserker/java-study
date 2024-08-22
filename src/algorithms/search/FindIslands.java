package algorithms.search;

import java.util.*;

public class FindIslands {

   class Node{
       Integer x;
       Integer y;

       List<Node> children = new ArrayList<>();

       Node(Integer x, Integer y){
           this.x = x;
           this.y = y;
       }
   }

    public static void main(String[] args) {
       FindIslands fi = new FindIslands();
       FindIslands.Node root = fi.new Node(0,0);
       root.children.add(fi.new Node(0,1));
       fi.new Node(1,1);


    }
}
