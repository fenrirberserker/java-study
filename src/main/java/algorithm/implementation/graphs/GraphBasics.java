package algorithm.implementation.graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * Graph basics built on the two traversals every other graph algorithm reuses:
 * breadth-first search (a queue, visiting level by level) and depth-first search
 * (a stack or recursion, going as deep as possible first). Both run in O(V + E)
 * time and O(V) space.
 *
 * The graph is held as an adjacency list, Map&lt;vertex, neighbors&gt;, which is the
 * practical choice for the sparse graphs found in most real problems. The sample
 * graph is undirected:
 *
 *     1 ── 2
 *     │    │
 *     3 ── 4 ── 5
 *          │
 *          6
 *
 * Examples: breadth-first search, depth-first search (recursive and iterative),
 * and shortest path in an unweighted graph.
 */
public class GraphBasics {

    public static void main(String[] args) {
        System.out.println("=== Graph Basics ===");

        Map<Integer, List<Integer>> graph = new HashMap<>();
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 2, 4);
        addEdge(graph, 3, 4);
        addEdge(graph, 4, 5);
        addEdge(graph, 4, 6);

        System.out.println("BFS from 1            : " + bfs(graph, 1));
        System.out.println("DFS (recursive) from 1: " + dfsRecursive(graph, 1));
        System.out.println("DFS (iterative) from 1: " + dfsIterative(graph, 1));
        System.out.println("Shortest path 1 -> 6  : " + shortestPathBFS(graph, 1, 6));
    }

    /** Adds an undirected edge by recording each vertex in the other's neighbor list. */
    private static void addEdge(Map<Integer, List<Integer>> graph, int u, int v) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    /**
     * Visits vertices level by level from start using a queue. Because it expands
     * the nearest vertices first, it also gives the fewest-edges path in an
     * unweighted graph (see shortestPathBFS).
     */
    public static List<Integer> bfs(Map<Integer, List<Integer>> graph, int start) {
        List<Integer> order = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(start);
        visited.add(start);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            order.add(node);
            for (int neighbor : graph.getOrDefault(node, List.of())) {
                if (visited.add(neighbor)) {             // add returns false if seen before
                    queue.offer(neighbor);
                }
            }
        }
        return order;
    }

    /**
     * Depth-first search using the call stack. Going as deep as possible before
     * backing up is the basis of cycle detection, topological sort, connected
     * components and path-existence checks.
     */
    public static List<Integer> dfsRecursive(Map<Integer, List<Integer>> graph, int start) {
        List<Integer> order = new ArrayList<>();
        dfs(graph, start, new HashSet<>(), order);
        return order;
    }

    private static void dfs(Map<Integer, List<Integer>> graph, int node, Set<Integer> visited, List<Integer> order) {
        if (!visited.add(node)) return;                  // stop if this node was already visited
        order.add(node);
        for (int neighbor : graph.getOrDefault(node, List.of())) {
            dfs(graph, neighbor, visited, order);
        }
    }

    /**
     * The same traversal as dfsRecursive but with an explicit stack, which avoids
     * a deep call stack when the graph is large.
     */
    public static List<Integer> dfsIterative(Map<Integer, List<Integer>> graph, int start) {
        List<Integer> order = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(start);

        while (!stack.isEmpty()) {
            int node = stack.pop();
            if (!visited.add(node)) continue;            // a node can be stacked more than once
            order.add(node);
            for (int neighbor : graph.getOrDefault(node, List.of())) {
                if (!visited.contains(neighbor)) stack.push(neighbor);
            }
        }
        return order;
    }

    /**
     * Shortest vertex sequence from src to dst in an unweighted graph, or an empty
     * list if there is none. It runs breadth-first search while recording each
     * node's predecessor, then walks that chain back from dst to rebuild the path.
     */
    public static List<Integer> shortestPathBFS(Map<Integer, List<Integer>> graph, int src, int dst) {
        if (src == dst) return List.of(src);

        Map<Integer, Integer> parent = new HashMap<>();
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(src);
        visited.add(src);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int neighbor : graph.getOrDefault(node, List.of())) {
                if (visited.add(neighbor)) {
                    parent.put(neighbor, node);
                    if (neighbor == dst) return reconstruct(parent, src, dst);
                    queue.offer(neighbor);
                }
            }
        }
        return List.of();                                // dst was never reached
    }

    private static List<Integer> reconstruct(Map<Integer, Integer> parent, int src, int dst) {
        Deque<Integer> path = new ArrayDeque<>();
        Integer current = dst;
        while (current != null) {
            path.addFirst(current);                      // build the path front-to-back
            if (current == src) break;
            current = parent.get(current);
        }
        return new ArrayList<>(path);
    }
}
