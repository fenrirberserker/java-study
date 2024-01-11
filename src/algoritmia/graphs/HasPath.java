package algoritmia.graphs;

import java.util.*;

/**
 * Check if there's a path between source node and destination
 */
public class HasPath {

    public static void main(String[] args) {
        Map<Character, List<Character>> graph = new HashMap<>();
        graph.put('f', List.of('g', 'i'));
        graph.put('g', List.of('h'));
        graph.put('h', new ArrayList<>());
        graph.put('i', List.of('g','k'));
        graph.put('j', List.of('i'));
        graph.put('k', new ArrayList<>());

        boolean result = hasPath(graph, 'f', 'k');

        System.out.println(result);


    }

    //BFS
    public static boolean hasPath(Map<Character, List<Character>> graph, Character start, Character end){
        LinkedList<Character> queue = new LinkedList<>();
        queue.push(start);

        while(!queue.isEmpty()){
            char current = queue.removeFirst();
            if(current == end) return true;
            for (char c : graph.get(current)) {
                queue.push(c);
            }
        }
        return false;
    }

    //DFS
    /*public static boolean hasPath(Map<Character, List<Character>> graph, Character start, Character end){

        if(start == end){
            return true;
        }

        for (char c : graph.get(start)) {
            if (hasPath(graph, c, end)){
                return true;
            }
        }
        return false;

    }*/
}
