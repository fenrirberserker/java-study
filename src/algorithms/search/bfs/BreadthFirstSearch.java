package algorithms.search.bfs;

import java.util.*;

/**
 * BFS uses a queue to iterate
 */

public class BreadthFirstSearch {

    public static void main(String[] args) {
        Map<Character, List<Character>> graph = new HashMap<>();
        graph.put('a',List.of('c','b'));
        graph.put('b',List.of('d'));
        graph.put('c',List.of('e'));
        graph.put('d',List.of('f'));
        graph.put('e',new ArrayList<>());//basic case is null
        graph.put('f',new ArrayList<>());
        BFS(graph,'a');
    }

    public static void BFS(Map<Character,List<Character>> graph, Character source){

        LinkedList<Character> queue = new LinkedList<>();
        queue.add(source);//put first element
        while(!queue.isEmpty()){
            Character current = queue.removeFirst();//remove from the front
            System.out.println(current);
            //check neighbors
            for (char c: graph.get(current)){
                queue.addLast(c);//add to the back
            }
        }
    }
}
