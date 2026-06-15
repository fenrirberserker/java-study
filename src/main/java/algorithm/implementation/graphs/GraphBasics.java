package algorithm.implementation.graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.HashMap;

/**
 * ============================================================================
 *  GRAPH ALGORITHMS — BASICS
 * ============================================================================
 *
 *  A graph G = (V, E) is a set of vertices V connected by edges E.
 *  This class shows the two FOUNDATIONAL traversals every other graph
 *  algorithm is built on:
 *
 *    • BFS — Breadth-First Search  (Queue, level by level)
 *    • DFS — Depth-First Search    (Stack or recursion, deepest first)
 *
 *  Both run in O(V + E) time and O(V) space.
 *
 *  REPRESENTATION USED HERE: ADJACENCY LIST
 *  ----------------------------------------
 *     Map<Integer, List<Integer>>  where each key is a vertex and its
 *     value is the list of its neighbors. This is the most practical
 *     representation for sparse graphs (most real-world graphs).
 *
 *  EXAMPLE GRAPH (undirected):
 *
 *              1 ──── 2
 *              │      │
 *              3 ──── 4 ──── 5
 *                     │
 *                     6
 *
 *  EXAMPLES IN THIS CLASS
 *  ----------------------
 *    1) bfs(graph, start)          — iterative BFS with a queue
 *    2) dfsRecursive(graph, start) — recursive DFS
 *    3) dfsIterative(graph, start) — iterative DFS with an explicit stack
 *    4) shortestPathBFS(...)       — shortest path in an UNWEIGHTED graph
 * ============================================================================
 */
public class GraphBasics {

    public static void main(String[] args) {
        System.out.println("=== Graph Basics ===");

        // Build the example graph (adjacency list, undirected)
        Map<Integer, List<Integer>> graph = new HashMap<>();
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 2, 4);
        addEdge(graph, 3, 4);
        addEdge(graph, 4, 5);
        addEdge(graph, 4, 6);

        System.out.println("BFS from 1           : " + bfs(graph, 1));
        System.out.println("DFS (recursive) from 1: " + dfsRecursive(graph, 1));
        System.out.println("DFS (iterative) from 1: " + dfsIterative(graph, 1));
        System.out.println("Shortest path 1 → 6  : " + shortestPathBFS(graph, 1, 6));
    }

    /** Adds an undirected edge (u-v) to an adjacency-list graph. */
    private static void addEdge(Map<Integer, List<Integer>> g, int u, int v) {
        g.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        g.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    /* ----------------------------------------------------------------- */
    /* 1) BFS — Breadth-First Search                                      */
    /* ----------------------------------------------------------------- */
    /**
     * Visits nodes level by level from `start`. Uses a QUEUE (FIFO).
     *
     *   Key property: BFS finds the SHORTEST PATH (fewest edges) in an
     *                 UNWEIGHTED graph.
     *
     *   Time:  O(V + E)     Space: O(V)
     */
    public static List<Integer> bfs(Map<Integer, List<Integer>> graph, int start) {
        List<Integer> order = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();                 // dequeue
            order.add(node);
            for (int neighbor : graph.getOrDefault(node, List.of())) {
                if (visited.add(neighbor)) {         // add returns false if already present
                    queue.offer(neighbor);
                }
            }
        }
        return order;
    }

    /* ----------------------------------------------------------------- */
    /* 2) DFS — recursive                                                 */
    /* ----------------------------------------------------------------- */
    /**
     * Goes as deep as possible before backtracking. Uses the CALL STACK.
     *
     *   Time:  O(V + E)     Space: O(V)
     *
     *   Use cases: cycle detection, topological sort, connected components,
     *              solving mazes, path existence.
     */
    public static List<Integer> dfsRecursive(Map<Integer, List<Integer>> graph, int start) {
        List<Integer> order = new ArrayList<>();
        dfsHelper(graph, start, new HashSet<>(), order);
        return order;
    }

    private static void dfsHelper(Map<Integer, List<Integer>> graph, int node,
                                  Set<Integer> visited, List<Integer> order) {
        if (!visited.add(node)) return;              // already visited → stop
        order.add(node);
        for (int neighbor : graph.getOrDefault(node, List.of())) {
            dfsHelper(graph, neighbor, visited, order);
        }
    }

    /* ----------------------------------------------------------------- */
    /* 3) DFS — iterative (explicit stack)                                */
    /* ----------------------------------------------------------------- */
    /**
     * Same result as recursive DFS but without recursion — useful when V is
     * huge and the call stack would overflow.
     */
    public static List<Integer> dfsIterative(Map<Integer, List<Integer>> graph, int start) {
        List<Integer> order = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        Deque<Integer> stack = new ArrayDeque<>();   // use ArrayDeque as a stack
        stack.push(start);

        while (!stack.isEmpty()) {
            int node = stack.pop();
            if (!visited.add(node)) continue;
            order.add(node);
            // Push neighbors. (Reverse iteration mirrors recursive order; either is fine.)
            for (int neighbor : graph.getOrDefault(node, List.of())) {
                if (!visited.contains(neighbor)) stack.push(neighbor);
            }
        }
        return order;
    }

    /* ----------------------------------------------------------------- */
    /* 4) SHORTEST PATH (unweighted graph) — via BFS + parent map         */
    /* ----------------------------------------------------------------- */
    /**
     * Returns the shortest sequence of vertices from `src` to `dst`, or an
     * empty list if no path exists. Works ONLY for unweighted graphs.
     *
     * Idea: run BFS, but remember each node's predecessor. Once we find
     *       `dst`, walk the parent chain backward to reconstruct the path.
     */
    public static List<Integer> shortestPathBFS(Map<Integer, List<Integer>> graph, int src, int dst) {
        if (src == dst) return List.of(src);

        Map<Integer, Integer> parent = new HashMap<>();
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

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
        return List.of();                            // no path
    }

    private static List<Integer> reconstruct(Map<Integer, Integer> parent, int src, int dst) {
        LinkedList<Integer> path = new LinkedList<>();
        Integer cur = dst;
        while (cur != null) {
            path.addFirst(cur);
            if (cur == src) break;
            cur = parent.get(cur);
        }
        return path;
    }
}
