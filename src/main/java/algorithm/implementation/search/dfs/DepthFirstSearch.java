package algorithm.implementation.search.dfs;

import java.util.*;

/**
 * DFS — explores as deep as possible before backtracking, using a Stack (LIFO).
 * Used for cycle detection, topological sort, and connected components.
 */
public class DepthFirstSearch {

    public static void main(String[] args) {
        Map<Character, List<Character>> graph = new HashMap<>();
        graph.put('a', List.of('c', 'b'));
        graph.put('b', List.of('d'));
        graph.put('c', List.of('e'));
        graph.put('d', List.of('f'));
        graph.put('e', new ArrayList<>());
        graph.put('f', new ArrayList<>());
        dfsIterative(graph, 'a');
    }

    public static void dfsIterative(Map<Character, List<Character>> graph, Character source) {
        Deque<Character> stack = new ArrayDeque<>();
        stack.push(source);
        while (!stack.isEmpty()) {
            Character current = stack.pop();
            System.out.println(current);
            graph.get(current).forEach(stack::push);
        }
    }

    public static void dfsRecursive(Map<Character, List<Character>> graph, Character source) {
        System.out.println(source);
        graph.get(source).forEach(neighbor -> dfsRecursive(graph, neighbor));
    }
}
