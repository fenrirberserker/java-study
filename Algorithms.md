# 📘 Algorithms — A Java Book

A precise, practical reference for the core algorithmic paradigms used in interviews,
competitive programming, and real-world software engineering:

1. **Recursion**
2. **Greedy**
3. **Backtracking**
4. **Graph Algorithms**
5. **Dynamic Programming**

Each chapter explains: what it is, when to use it, how it works mechanically,
its time/space complexity, common pitfalls, and a runnable Java reference class
located in `src/algorithms/<topic>/<Topic>Basics.java`.

---

## 📑 Table of Contents

- [1. Recursion](#1-recursion)
- [2. Greedy](#2-greedy)
- [3. Backtracking](#3-backtracking)
- [4. Graph Algorithms](#4-graph-algorithms)
- [5. Dynamic Programming](#5-dynamic-programming)
- [Quick Comparison Table](#-quick-comparison-table)

---

## 1. Recursion

> **Definition:** A function that solves a problem by calling itself with a smaller
> input until it reaches a *base case*.

### Core ingredients
Every recursive function MUST have:
1. **Base case** — the condition that stops recursion (otherwise: `StackOverflowError`).
2. **Recursive case** — calls itself with input progressing toward the base case.
3. **Progress guarantee** — each call must move closer to the base case.

### Mental model — the call stack
Each recursive call pushes a new *stack frame* onto the JVM call stack.
When the base case returns, frames *unwind* (pop) one by one and combine results.

```
factorial(3)
 └─ 3 * factorial(2)
        └─ 2 * factorial(1)
               └─ 1   ← base case, unwind starts
```

### Two flavors
- **Head recursion**: recursive call happens *before* the work.
- **Tail recursion**: recursive call is the *last* operation. Java does **not**
  optimize tail calls (no TCO), so deep tail recursion still overflows.

### Complexity
- **Time:** depends on the recurrence. `T(n) = T(n-1) + O(1)` → O(n).
  `T(n) = 2·T(n-1) + O(1)` → O(2ⁿ) (naïve Fibonacci).
- **Space:** O(depth of recursion) for the stack.

### When to use
✅ Tree/graph traversal, divide & conquer, problems with naturally recursive structure.
❌ Avoid when iterative solution is trivial OR depth can exceed ~10 000 (stack risk).

### Common pitfalls
- Forgetting the base case → `StackOverflowError`.
- Wrong base case (off-by-one).
- Recomputing the same subproblems → fix with **memoization** (see Chapter 5).

📁 **See:** [src/algorithms/recursion/RecursionBasics.java](src/algorithms/recursion/RecursionBasics.java)

---

## 2. Greedy

> **Definition:** Build a solution piece-by-piece, always choosing the option that
> looks **best at the current step**, never reconsidering past choices.

### Core idea
At each step, pick the *locally optimal* choice and hope it leads to the
*globally optimal* solution.

### When greedy works (formal properties)
A greedy approach is correct ONLY if the problem has BOTH:
1. **Greedy choice property** — a global optimum can be reached by local optimal choices.
2. **Optimal substructure** — the optimal solution to the problem contains the optimal
   solutions to its subproblems.

If you can't prove these, greedy may give a wrong answer (use Dynamic Programing/Backtracking instead).

### Classic correct greedy problems
- **Activity selection** — pick non-overlapping intervals → sort by end time.
- **Huffman coding** — always merge the two least-frequent nodes.
- **Dijkstra's shortest path** (non-negative weights) — always expand the closest node.
- **Coin change with canonical coin systems** (e.g., USD, EUR).

### Classic greedy *failures*
- **Coin change with arbitrary denominations** (e.g., coins = `{1, 3, 4}`, amount = 6).
  Greedy picks `4 + 1 + 1` (3 coins). Optimal is `3 + 3` (2 coins). → Use Dynamic Programming.
- **0/1 Knapsack** — greedy by value/weight ratio fails. → Use Dynamic Programming.

### Algorithm template
```
sort or prioritize the input
for each element in order:
    if it can be added without violating constraints:
        add it to the solution
return solution
```

### Complexity
Usually dominated by the sort: **O(n log n)**.

📁 **See:** [src/algorithms/greedy/GreedyBasics.java](src/algorithms/greedy/GreedyBasics.java)

---

## 3. Backtracking

> **Definition:** A refined brute-force search that incrementally builds candidates
> and **abandons** ("backtracks") a candidate as soon as it determines the candidate
> cannot lead to a valid solution.

### Mental model — DFS through a decision tree
Backtracking explores a **state-space tree** depth-first. At each node:
1. **Choose** — pick an option.
2. **Explore** — recurse with this choice applied.
3. **Un-choose** — undo the choice (backtrack) and try the next option.

```
              [ ]
           /   |   \
         [1]  [2]  [3]
         / \   |    |
      [1,2][1,3][2,3] ...
```

### Algorithm template
```java
void backtrack(state, choices) {
    if (isSolution(state)) {
        record(state);
        return;
    }
    for (choice in choices) {
        if (isValid(state, choice)) {
            apply(state, choice);          // choose
            backtrack(state, choices);     // explore
            undo(state, choice);           // un-choose
        }
    }
}
```

### The key optimization — pruning
A naïve search visits all `O(branching^depth)` nodes. Backtracking cuts entire
subtrees by checking constraints **before** recursing → massive speedup in practice
(though worst-case complexity is still exponential).

### Classic problems
- **N-Queens** — place N queens on an N×N board.
- **Sudoku solver**.
- **Permutations / combinations / subsets**.
- **Word search in a grid**.
- **Hamiltonian path**.

### Recursion vs. Backtracking
- All backtracking is recursion.
- Not all recursion is backtracking — backtracking specifically *undoes* state to
  explore alternatives.

### Complexity
Worst case **O(b^d)** where `b` = branching factor, `d` = depth. Pruning makes the
*average* case far better but is hard to bound formally.

📁 **See:** [src/algorithms/backtracking/BacktrackingBasics.java](src/algorithms/backtracking/BacktrackingBasics.java)

---

## 4. Graph Algorithms

> **Definition:** Algorithms operating on graphs `G = (V, E)` — sets of vertices `V`
> connected by edges `E`. Graphs model networks, dependencies, maps, social
> connections, etc.

### Graph representations

| Representation        | Space      | Edge lookup | Best for                    |
|-----------------------|------------|-------------|-----------------------------|
| **Adjacency Matrix**  | O(V²)      | O(1)        | Dense graphs, small V       |
| **Adjacency List**    | O(V + E)   | O(degree)   | Sparse graphs (most cases)  |
| **Edge List**         | O(E)       | O(E)        | Algorithms iterating edges  |

### Graph types
- **Directed** vs **Undirected**
- **Weighted** vs **Unweighted**
- **Cyclic** vs **Acyclic** (DAG = Directed Acyclic Graph)
- **Connected** vs **Disconnected**

### The two foundational traversals

#### BFS — Breadth-First Search
- Uses a **Queue** (FIFO).
- Explores **level by level**.
- Finds **shortest path in unweighted graphs**.
- Time: O(V + E), Space: O(V).

```
visited = {start}
queue = [start]
while queue not empty:
    node = queue.poll()
    for neighbor in node.neighbors:
        if neighbor not visited:
            mark visited
            queue.add(neighbor)
```

#### DFS — Depth-First Search
- Uses a **Stack** (or recursion).
- Explores as **deep as possible** before backtracking.
- Used for **cycle detection**, **topological sort**, **connected components**.
- Time: O(V + E), Space: O(V).

```
dfs(node):
    mark node visited
    for neighbor in node.neighbors:
        if neighbor not visited:
            dfs(neighbor)
```

### Other essential algorithms (named, not all implemented in basics file)
| Algorithm                  | Purpose                              | Complexity      |
|----------------------------|--------------------------------------|-----------------|
| **Dijkstra**               | Shortest path, non-negative weights  | O((V+E) log V)  |
| **Bellman-Ford**           | Shortest path, allows negative edges | O(V·E)          |
| **Floyd-Warshall**         | All-pairs shortest paths             | O(V³)           |
| **Kruskal / Prim**         | Minimum Spanning Tree                | O(E log E)      |
| **Topological Sort**       | Order DAG vertices                   | O(V + E)        |
| **Union-Find**             | Disjoint sets / cycle detection      | ~O(α(n))        |

📁 **See:** [src/algorithms/graphs/GraphBasics.java](src/algorithms/graphs/GraphBasics.java)

---

## 5. Dynamic Programming

> **Definition:** Solve complex problems by breaking them into **overlapping
> subproblems**, solving each subproblem **once**, and **storing** the results
> for reuse.

### When to use Dynamic Programming — the two required properties
1. **Optimal substructure** — optimal solution can be built from optimal solutions
   of subproblems.
2. **Overlapping subproblems** — the same subproblems are solved multiple times by
   plain recursion.

If a problem only has #1 (no overlap), use **divide-and-conquer** (e.g., merge sort).

### The two Dynamic Programming styles

#### Top-Down (Memoization)
- Write the **natural recursive** solution.
- **Cache** each result in a Map/array keyed by the subproblem inputs.
- Pros: intuitive, only computes needed states.
- Cons: recursion overhead, possible stack overflow.

```java
int solve(int n, Map<Integer,Integer> memo) {
    if (base case) return baseValue;
    if (memo.containsKey(n)) return memo.get(n);
    int result = combine(solve(n-1, memo), solve(n-2, memo));
    memo.put(n, result);
    return result;
}
```

#### Bottom-Up (Tabulation)
- Define a **table** `Dynamic Programming[]` indexed by subproblem.
- Fill it iteratively from the smallest subproblem upward.
- Pros: no recursion, often more memory-efficient (rolling arrays possible).
- Cons: must figure out fill order; computes states even if unused.

```java
Dynamic Programming[0] = base0; Dynamic Programming[1] = base1;
for (int i = 2; i <= n; i++) {
    Dynamic Programming[i] = Dynamic Programming[i-1] + Dynamic Programming[i-2];
}
return Dynamic Programming[n];
```

### How to design a Dynamic Programming solution (5-step recipe)
1. **Define the state** — what does `Dynamic Programming[i]` (or `Dynamic Programming[i][j]`) mean? Be precise.
2. **Write the recurrence** — express `Dynamic Programming[i]` in terms of smaller states.
3. **Identify the base cases**.
4. **Decide the iteration order** (topological order of state dependencies).
5. **Read the answer** from the table (often `Dynamic Programming[n]`).

### Classic problems
| Problem                       | State                              |
|-------------------------------|------------------------------------|
| Fibonacci                     | `Dynamic Programming[i]` = i-th fibonacci number    |
| Climbing stairs               | `Dynamic Programming[i]` = ways to reach step i     |
| Coin change (min coins)       | `Dynamic Programming[a]` = min coins for amount a   |
| 0/1 Knapsack                  | `Dynamic Programming[i][w]` = max value using first i items, capacity w |
| Longest Common Subsequence    | `Dynamic Programming[i][j]` = LCS of A[..i], B[..j] |
| Edit distance                 | `Dynamic Programming[i][j]` = ops to convert A[..i] → B[..j] |

### Complexity
Usually **O(states × transitions per state)**. E.g., 1D problem with constant
transition → O(n).

### Recursion vs. Memoization vs. Tabulation
| Approach          | Time     | Space     | Style    |
|-------------------|----------|-----------|----------|
| Naive recursion   | O(2ⁿ)    | O(n) stack| Top-down |
| Memoization       | O(n)     | O(n)      | Top-down |
| Tabulation        | O(n)     | O(n)      | Bottom-up|
| Tabulation rolling| O(n)     | **O(1)**  | Bottom-up|

📁 **See:** [src/algorithms/dynamic/DynamicBasics.java](src/algorithms/dynamic/DynamicBasics.java)

---

## 🆚 Quick Comparison Table

| Paradigm     | Strategy                                | Typical Complexity      | Use when…                                   |
|--------------|-----------------------------------------|-------------------------|---------------------------------------------|
| Recursion    | Self-call until base case               | varies                  | Problem is naturally self-similar           |
| Greedy       | Always take local-best choice           | O(n log n)              | Problem has greedy-choice + opt. substruct. |
| Backtracking | DFS with prune & undo                   | O(b^d)                  | Need to enumerate / find valid configs      |
| Graph algos  | Traverse vertices/edges (BFS/DFS/etc.)  | O(V + E) typical        | Data has nodes & relationships              |
| Dynamic Prog.| Memoize / tabulate overlapping subprobs | O(states × transitions) | Optimal substruct. + overlapping subprobs   |

---

### How to run any example

From the project root (with the project compiled into `bin/`):
```bash
java -cp bin algorithms.recursion.RecursionBasics
java -cp bin algorithms.greedy.GreedyBasics
java -cp bin algorithms.backtracking.BacktrackingBasics
java -cp bin algorithms.graphs.GraphBasics
java -cp bin algorithms.dynamic.DynamicBasics
```

Or simply run each class in your IDE — they all have a `main` method that
prints the demo output.
