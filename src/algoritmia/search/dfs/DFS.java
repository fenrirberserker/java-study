package algoritmia.search.dfs;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Uses a recursive algorithm to search deep in a path until it finds the element
 */

public class DFS {
    private HashMap<Integer, Node> nodeLookup = new HashMap<Integer, Node>();

    public class Node{
        private int id;
        LinkedList<Node> adjacent = new LinkedList<Node>();
        private Node(int id){
            this.id = id;
        }
    }

    private Node getNode(int id){
        return nodeLookup.get(id);
    }


}
