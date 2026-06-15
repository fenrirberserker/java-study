package algorithm.implementation.search.bfs;

import java.util.*;

/**
 * BFS — visits nodes level by level using a Queue (FIFO).
 * Finds shortest path in unweighted graphs.
 */
public class BreadthFirstSearch {

    public static void main(String[] args) {
        Map<Character, List<Character>> graph = new HashMap<>();
        graph.put('a', List.of('c', 'b'));
        graph.put('b', List.of('d'));
        graph.put('c', List.of('e'));
        graph.put('d', List.of('f'));
        graph.put('e', new ArrayList<>());
        graph.put('f', new ArrayList<>());
        bfs(graph, 'a');
    }

    public static void bfs(Map<Character, List<Character>> graph, Character source) {
        Queue<Character> queue = new ArrayDeque<>();
        queue.add(source);
        while (!queue.isEmpty()) {
            Character current = queue.poll();
            System.out.println(current);
            queue.addAll(graph.get(current));
        }
    }
}
