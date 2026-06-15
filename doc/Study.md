# Study — Main Entry Point

Everything lives in this single file, so every link in the index is a **same-file jump** that IntelliJ's Markdown preview resolves. The four top-level areas are **Backend · Frontend · DevOps · AI**; every other topic sits under its area in the content below.

Throughout, a 💻 line links a concept to the runnable Java file under [src/](../src/) that demonstrates it with prints.

---

## 📑 Index

- [⚙️ Backend](#-backend)
  - [📑 Data Structures](#-data-structures)
  - [📘 Algorithms](#-algorithms)
  - [💻 Programming Languages](#-programming-languages)
    - [☕ Java](#-java)
      - [🧵 Concurrency & Parallelism](#-concurrency-and-parallelism)
      - [⚠️ Exceptions](#-exceptions)
    - [🟪 Kotlin](#-kotlin)
    - [🐍 Python](#-python)
  - [🧩 Frameworks](#-frameworks)
    - [🌱 Spring](#-spring)
    - [⚡ Quarkus](#-quarkus)
    - [🚀 Micronaut](#-micronaut)
  - [🗄️ Database](#-database)
  - [🔒 Security](#-security)
  - [🏢 System Design](#-system-design)
    - [🎨 Design Patterns](#design-patterns-each-with-its-spring-incarnation)
    - [🌐 Distributed Design Patterns](#-distributed-design-patterns)
      - [📨 Messaging → Kafka](#-messaging)
  - [🧪 Testing](#-testing)
  - [🔤 Data Formats](#data-formats)
- [🌐 Frontend](#-frontend)
  - [HTML5](#html5)
  - [CSS](#css)
  - [JavaScript](#javascript)
  - [TypeScript](#typescript)
    - [Testing](#testing)
    - [Features](#features)
    - [React](#react)
- [🔧 DevOps](#-devops)
  - [Features](#features-1)
  - [SDLC](#sdlc)
  - [Docker](#docker)
  - [Kubernetes](#kubernetes)
  - [Cloud](#cloud)
  - [Infrastructure as Code](#infrastructure-as-code)
  - [Git](#git)
  - [Jenkins](#jenkins)
- [🤖 AI](#-ai)
  - [Large Language Model Fundamentals](#large-language-model-fundamentals)
  - [Prompt Engineering](#prompt-engineering)
  - [Retrieval-Augmented Generation (RAG)](#retrieval-augmented-generation-rag)
  - [Agents & Tool Use](#agents--tool-use)
  - [Java Ecosystem](#java-ecosystem)
  - [Evaluation & Safety](#evaluation--safety)

---

# ⚙️ Backend

Everything server-side in one place: the data structures and algorithm.implementation underneath, the Java language and its deep dives (threads, exceptions), the Spring ecosystem, persistence, messaging, security, system design and testing. Wherever a concept has a runnable demonstration, a 💻 line links to the Java file under [src/](../src/) that prints the idea in action.

---

## 📑 Data Structures

> 💻 Code: [LinkedListExample](../src/main/java/algorithm/concepts/datastructures/collections/Lists/LinkedListExample.java) · [SetExample](../src/main/java/algorithm/concepts/datastructures/collections/Sets/SetExample.java) · [MapExample](../src/main/java/algorithm/concepts/datastructures/collections/Maps/MapExample.java) · [Binary Search Tree](../src/main/java/algorithm/implementation/search/search/trees/BST.java) · [Trie](../src/main/java/algorithm/implementation/search/trie/Trie.java) · [Least Recently Used cache](../src/main/java/algorithm/implementation/search/lru/demo1/LRUCache.java)

#### ArrayList
- **Type**: Resizable array, implements List
- **Read/Access**: O(1) by index
- **Write/Update**: O(1) Direct index modification
- **Insert at end**: O(1) amortized - May trigger resize O(n)
- **Insert at middle**: O(n) Must shift elements
- **Delete at end**: O(1)
- **Delete at middle**: O(n) Must shift elements
- **Search**: O(n) linear
- **Best for**: Storing and accessing
- **Memory**: Less memory

##### Pros:

- **Fast random access O(1)**
- **Dynamic sizing**
- **Cache-friendly**
- **Good for read-heavy operations**

##### Cons:

- **Slow insertions/deletions in middle**
- **Resize operation is expensive**
- **Wasted capacity**

```java
List<String> list = new ArrayList<>();
list.add("a");                 // append — O(1) amortized, may trigger a resize
list.add(0, "b");              // insert at index — O(n), shifts everything right
String first = list.get(0);    // random access by index — O(1)
list.set(0, "c");              // update by index — O(1)
list.remove(0);                // delete by index — O(n), shifts everything left
```

#### LinkedList
- **Type**: Double linked list to next and prev node, implements List and Queue
- **Read/Access**: O(n) Must traverse from head/tail
- **Write/Update**: O(n) Must find node first, then O(1) to update
- **Insert at head/tai**l: O(1) Just update pointers
- **Insert at middle**: O(n) Must traverse to position, then O(1) to insert
- **Delete at head/tail**: O(1) Just update pointers
- **Delete at middle**: O(n) Must traverse to position, then O(1) to delete
- **Search**: O(n) linear
- **Best for**: Manipulating
- **Memory**: Most overhead - each node stores data + 2 pointers (next, prev)

##### Pros:

- **Fast insertions/deletions at head/tail O(1)**
- **No resize needed**
- **Good for queue/deque operations**

##### Cons:

- **Slow random access O(n)**
- **More memory per element**
- **Not cache-friendly (scattered in memory)**
- **Poor for read-heavy operations**

```java
LinkedList<String> list = new LinkedList<>();
list.add("a");                 // append at tail — O(1)
list.addFirst("b");            // insert at head — O(1), just relinks pointers
String head = list.getFirst(); // O(1) at either end…
String mid  = list.get(2);     // …but random access is O(n), must traverse
list.removeFirst();            // delete at head — O(1)
// Also implements Deque/Queue: offer() / poll() / peek() for FIFO use
```

#### Queues

> 💻 Code: [BreadthFirstSearch (Queue in action)](../src/main/java/algorithm/implementation/search/bfs/BreadthFirstSearch.java)

- **Type**: FIFO (First In, First Out) — elements enter at the **tail** and leave from the **head**
- **Enqueue**: O(1) — `offer(e)` / `add(e)` at tail
- **Dequeue**: O(1) — `poll()` / `remove()` from head (`poll` returns null on empty; `remove` throws)
- **Peek**: O(1) — `peek()` / `element()` — view head without removing
- **Search**: O(n) — no random access
- **Best for**: BFS traversal, task scheduling, producer-consumer pipelines
- **Memory**: O(n); `ArrayDeque` uses less memory per element than `LinkedList`

##### Pros
- **Enforces FIFO ordering** — first request is first served
- **O(1) enqueue and dequeue** with `ArrayDeque` (resizable circular array)
- `BlockingQueue` variants handle producer-consumer coordination without explicit synchronization

##### Cons
- **No random access** — only head visible
- `LinkedList` as a `Queue` has higher memory overhead (two pointers per node)

```java
// Prefer ArrayDeque over LinkedList for Queue — better cache locality, no null elements
Queue<String> queue = new ArrayDeque<>();
queue.offer("a");           // enqueue
String head = queue.poll(); // dequeue — returns null if empty
String peek = queue.peek(); // view head — returns null if empty

// Concurrent: BlockingQueue parks threads instead of returning null/throwing
BlockingQueue<String> bq = new LinkedBlockingQueue<>();
bq.put("task");             // blocks if full
String task = bq.take();    // blocks if empty
```
- `PriorityQueue` is **not** FIFO — it orders by natural order or `Comparator`; use only when priority ordering is the goal
- In concurrent contexts always prefer `BlockingQueue` implementations over manual `wait`/`notify`

#### Stacks

> 💻 Code: [IsBalanced (bracket matching with a stack)](../src/main/java/algorithm/implementation/collections/stacks/IsBalanced.java) · [DepthFirstSearch (iterative DFS with a stack)](../src/main/java/algorithm/implementation/search/dfs/DepthFirstSearch.java)

- **Type**: LIFO (Last In, First Out) — elements are added and removed from the **same end** (the "top")
- **Push**: O(1) — add to top
- **Pop**: O(1) — remove from top (throws if empty)
- **Peek**: O(1) — view top without removing
- **Search**: O(n) — no random access
- **Best for**: DFS traversal, call-stack simulation, expression parsing, bracket matching, undo/redo
- **Memory**: O(n)

##### Pros
- **O(1) push, pop, peek**
- **Natural model for depth-first and backtracking algorithms**
- `ArrayDeque` is fast and cache-friendly with no synchronization overhead

##### Cons
- **No random access**
- `Stack<E>` (the legacy class) synchronizes every operation, making it slow in single-threaded code — avoid it

```java
// Never use java.util.Stack — it extends Vector and is synchronized unnecessarily
// Use Deque<E> backed by ArrayDeque<E> instead (same push/pop/peek API)
Deque<Integer> stack = new ArrayDeque<>();
stack.push(1);          // addFirst — top of stack
stack.push(2);
int top = stack.pop();  // removeFirst — returns 2
int peek = stack.peek();// peekFirst — returns 1

// Iterative DFS using a stack
Deque<Node> dfsStack = new ArrayDeque<>();
dfsStack.push(root);
while (!dfsStack.isEmpty()) {
    Node current = dfsStack.pop();
    for (Node neighbor : current.neighbors) dfsStack.push(neighbor);
}
```
- `Deque` used as a stack: `push` = `addFirst`, `pop` = `removeFirst`, `peek` = `peekFirst`
- **Monotonic stack** — maintain elements in strictly increasing or decreasing order to solve "next greater element" problems in O(n); a key interview pattern

#### Deques
- **Type**: Double-ended queue — O(1) add and remove at **both** head and tail; acts as both a Stack and a Queue
- **addFirst / offerFirst**: O(1) — insert at head
- **addLast / offerLast**: O(1) — insert at tail
- **removeFirst / pollFirst**: O(1) — remove from head
- **removeLast / pollLast**: O(1) — remove from tail
- **peekFirst / peekLast**: O(1) — view either end
- **Search**: O(n)
- **Best for**: Sliding-window maximum/minimum, work-stealing, browser history, palindrome checking

##### Pros
- **O(1) at both ends** — the most flexible linear data structure
- **Replaces both Stack and Queue** in a single structure
- `ArrayDeque` beats `Stack` (no synchronization) and beats `LinkedList` (array-based, better cache locality)

##### Cons
- **No random access**
- `ArrayDeque` disallows `null` elements — use `LinkedList` only when nulls or arbitrary-position access are needed

```java
// ArrayDeque is the recommended general-purpose Deque implementation
Deque<Integer> deque = new ArrayDeque<>();

// Used as a queue (FIFO)
deque.addLast(1);           // enqueue
deque.removeFirst();        // dequeue

// Used as a stack (LIFO)
deque.addFirst(2);          // push
deque.removeFirst();        // pop

// Used as a deque
deque.addFirst(0);          // insert at front
deque.addLast(3);           // insert at back
deque.peekFirst();          // view front
deque.peekLast();           // view back
```
- **Monotonic deque** — the sliding-window maximum/minimum problem: maintain candidates in decreasing/increasing order to answer each window query in O(1); total O(n) for the whole array

#### Binary Search Tree
- **Structure**: Data structure with 1 data value and 2 pointers left and right
- **Insertion**: O(log n)
- **Traversal**: O(n)
- **Search**: O(log n)
- **Deletion rebalancing**: Take the leftmost child of the right child of the deleted node (El mas izquierdo del hijo derecho del nodo eliminado)
  - Retain rule of smaller to the left, greater to the right

```java
// A node holds one value and two child links
class Node { int value; Node left, right; }

// Insert keeps the invariant "smaller to the left, greater to the right" — O(log n) when balanced
Node insert(Node root, int value) {
    if (root == null) return new Node(value);
    if (value < root.value) root.left  = insert(root.left, value);
    else                    root.right = insert(root.right, value);
    return root;
}
```

---

## 📘 Algorithms

A precise, practical reference for the core algorithmic paradigms used in interviews,
competitive programming, and real-world software engineering:

1. **Recursion**
2. **Greedy**
3. **Backtracking**
4. **Graph Algorithms**
5. **Dynamic Programming**

Each chapter explains: what it is, when to use it, how it works mechanically,
its time/space complexity, common pitfalls, and a runnable Java reference class
located in `src/algorithm.implementation/<topic>/<Topic>Basics.java`.

### 1. Recursion

> **Definition:** A function that solves a problem by calling itself with a smaller
> input until it reaches a *base case*.

#### Core ingredients
Every recursive function MUST have:
1. **Base case** — the condition that stops recursion (otherwise: `StackOverflowError`).
2. **Recursive case** — calls itself with input progressing toward the base case.
3. **Progress guarantee** — each call must move closer to the base case.

#### Mental model — the call stack
Each recursive call pushes a new *stack frame* onto the JVM call stack.
When the base case returns, frames *unwind* (pop) one by one and combine results.

```
factorial(3)
 └─ 3 * factorial(2)
        └─ 2 * factorial(1)
               └─ 1   ← base case, unwind starts
```

#### Two flavors
- **Head recursion**: recursive call happens *before* the work.
- **Tail recursion**: recursive call is the *last* operation. Java does **not**
  optimize tail calls (no TCO), so deep tail recursion still overflows.

#### Complexity
- **Time:** depends on the recurrence. `T(n) = T(n-1) + O(1)` → O(n).
  `T(n) = 2·T(n-1) + O(1)` → O(2ⁿ) (naïve Fibonacci).
- **Space:** O(depth of recursion) for the stack.

#### When to use
✅ Tree/graph traversal, divide & conquer, problems with naturally recursive structure.
❌ Avoid when iterative solution is trivial OR depth can exceed ~10 000 (stack risk).

#### Common pitfalls
- Forgetting the base case → `StackOverflowError`.
- Wrong base case (off-by-one).
- Recomputing the same subproblems → fix with **memoization** (see Chapter 5).

📁 **See:** [src/algorithm.implementation/recursion/RecursionBasics.java](../src/main/java/algorithm/implementation/recursion/RecursionBasics.java)

### 2. Greedy

> **Definition:** Build a solution piece-by-piece, always choosing the option that
> looks **best at the current step**, never reconsidering past choices.

#### Core idea
At each step, pick the *locally optimal* choice and hope it leads to the
*globally optimal* solution.

#### When greedy works (formal properties)
A greedy approach is correct ONLY if the problem has BOTH:
1. **Greedy choice property** — a global optimum can be reached by local optimal choices.
2. **Optimal substructure** — the optimal solution to the problem contains the optimal
   solutions to its subproblems.

If you can't prove these, greedy may give a wrong answer (use Dynamic Programing/Backtracking instead).

#### Classic correct greedy problems
- **Activity selection** — pick non-overlapping intervals → sort by end time.
- **Huffman coding** — always merge the two least-frequent nodes.
- **Dijkstra's shortest path** (non-negative weights) — always expand the closest node.
- **Coin change with canonical coin systems** (e.g., USD, EUR).

#### Classic greedy *failures*
- **Coin change with arbitrary denominations** (e.g., coins = `{1, 3, 4}`, amount = 6).
  Greedy picks `4 + 1 + 1` (3 coins). Optimal is `3 + 3` (2 coins). → Use Dynamic Programming.
- **0/1 Knapsack** — greedy by value/weight ratio fails. → Use Dynamic Programming.

#### Algorithm template
```
sort or prioritize the input
for each element in order:
    if it can be added without violating constraints:
        add it to the solution
return solution
```

#### Complexity
Usually dominated by the sort: **O(n log n)**.

📁 **See:** [src/algorithm.implementation/greedy/GreedyBasics.java](../src/main/java/algorithm/implementation/greedy/GreedyBasics.java)

### 3. Backtracking

> **Definition:** A refined brute-force search that incrementally builds candidates
> and **abandons** ("backtracks") a candidate as soon as it determines the candidate
> cannot lead to a valid solution.

#### Mental model — DFS through a decision tree
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

#### Algorithm template
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

#### The key optimization — pruning
A naïve search visits all `O(branching^depth)` nodes. Backtracking cuts entire
subtrees by checking constraints **before** recursing → massive speedup in practice
(though worst-case complexity is still exponential).

#### Classic problems
- **N-Queens** — place N queens on an N×N board.
- **Sudoku solver**.
- **Permutations / combinations / subsets**.
- **Word search in a grid**.
- **Hamiltonian path**.

#### Recursion vs. Backtracking
- All backtracking is recursion.
- Not all recursion is backtracking — backtracking specifically *undoes* state to
  explore alternatives.

#### Complexity
Worst case **O(b^d)** where `b` = branching factor, `d` = depth. Pruning makes the
*average* case far better but is hard to bound formally.

📁 **See:** [src/algorithm.implementation/backtracking/BacktrackingBasics.java](../src/main/java/algorithm/implementation/backtracking/BacktrackingBasics.java)

### 4. Graph Algorithms

> **Definition:** Algorithms operating on graphs `G = (V, E)` — sets of vertices `V`
> connected by edges `E`. Graphs model networks, dependencies, maps, social
> connections, etc.

#### Graph representations

| Representation        | Space      | Edge lookup | Best for                    |
|-----------------------|------------|-------------|-----------------------------|
| **Adjacency Matrix**  | O(V²)      | O(1)        | Dense graphs, small V       |
| **Adjacency List**    | O(V + E)   | O(degree)   | Sparse graphs (most cases)  |
| **Edge List**         | O(E)       | O(E)        | Algorithms iterating edges  |

#### Graph types
- **Directed** vs **Undirected**
- **Weighted** vs **Unweighted**
- **Cyclic** vs **Acyclic** (DAG = Directed Acyclic Graph)
- **Connected** vs **Disconnected**

#### The two foundational traversals

##### BFS — Breadth-First Search
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

##### DFS — Depth-First Search
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

#### Other essential algorithm.implementation (named, not all implemented in basics file)
| Algorithm                  | Purpose                              | Complexity      |
|----------------------------|--------------------------------------|-----------------|
| **Dijkstra**               | Shortest path, non-negative weights  | O((V+E) log V)  |
| **Bellman-Ford**           | Shortest path, allows negative edges | O(V·E)          |
| **Floyd-Warshall**         | All-pairs shortest paths             | O(V³)           |
| **Kruskal / Prim**         | Minimum Spanning Tree                | O(E log E)      |
| **Topological Sort**       | Order DAG vertices                   | O(V + E)        |
| **Union-Find**             | Disjoint sets / cycle detection      | ~O(α(n))        |

📁 **See:** [src/algorithm.implementation/graphs/GraphBasics.java](../src/main/java/algorithm/implementation/graphs/GraphBasics.java)

### 5. Dynamic Programming

> **Definition:** Solve complex problems by breaking them into **overlapping
> subproblems**, solving each subproblem **once**, and **storing** the results
> for reuse.

#### When to use Dynamic Programming — the two required properties
1. **Optimal substructure** — optimal solution can be built from optimal solutions
   of subproblems.
2. **Overlapping subproblems** — the same subproblems are solved multiple times by
   plain recursion.

If a problem only has #1 (no overlap), use **divide-and-conquer** (e.g., merge sort).

#### The two Dynamic Programming styles

##### Top-Down (Memoization)
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

##### Bottom-Up (Tabulation)
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

#### How to design a Dynamic Programming solution (5-step recipe)
1. **Define the state** — what does `Dynamic Programming[i]` (or `Dynamic Programming[i][j]`) mean? Be precise.
2. **Write the recurrence** — express `Dynamic Programming[i]` in terms of smaller states.
3. **Identify the base cases**.
4. **Decide the iteration order** (topological order of state dependencies).
5. **Read the answer** from the table (often `Dynamic Programming[n]`).

#### Classic problems
| Problem                       | State                              |
|-------------------------------|------------------------------------|
| Fibonacci                     | `Dynamic Programming[i]` = i-th fibonacci number    |
| Climbing stairs               | `Dynamic Programming[i]` = ways to reach step i     |
| Coin change (min coins)       | `Dynamic Programming[a]` = min coins for amount a   |
| 0/1 Knapsack                  | `Dynamic Programming[i][w]` = max value using first i items, capacity w |
| Longest Common Subsequence    | `Dynamic Programming[i][j]` = LCS of A[..i], B[..j] |
| Edit distance                 | `Dynamic Programming[i][j]` = ops to convert A[..i] → B[..j] |

#### Complexity
Usually **O(states × transitions per state)**. E.g., 1D problem with constant
transition → O(n).

#### Recursion vs. Memoization vs. Tabulation
| Approach          | Time     | Space     | Style    |
|-------------------|----------|-----------|----------|
| Naive recursion   | O(2ⁿ)    | O(n) stack| Top-down |
| Memoization       | O(n)     | O(n)      | Top-down |
| Tabulation        | O(n)     | O(n)      | Bottom-up|
| Tabulation rolling| O(n)     | **O(1)**  | Bottom-up|

📁 **See:** [src/algorithm.implementation/dynamic/DynamicBasics.java](../src/main/java/algorithm/implementation/dynamic/DynamicBasics.java)

### 🆚 Quick Comparison Table

| Paradigm     | Strategy                                | Typical Complexity      | Use when…                                   |
|--------------|-----------------------------------------|-------------------------|---------------------------------------------|
| Recursion    | Self-call until base case               | varies                  | Problem is naturally self-similar           |
| Greedy       | Always take local-best choice           | O(n log n)              | Problem has greedy-choice + opt. substruct. |
| Backtracking | DFS with prune & undo                   | O(b^d)                  | Need to enumerate / find valid configs      |
| Graph algos  | Traverse vertices/edges (BFS/DFS/etc.)  | O(V + E) typical        | Data has nodes & relationships              |
| Dynamic Prog.| Memoize / tabulate overlapping subprobs | O(states × transitions) | Optimal substruct. + overlapping subprobs   |

#### How to run any example

From the project root (with the project compiled into `bin/`):
```bash
java -cp bin algorithm.implementation.recursion.RecursionBasics
java -cp bin algorithm.implementation.greedy.GreedyBasics
java -cp bin algorithm.implementation.backtracking.BacktrackingBasics
java -cp bin algorithm.implementation.graphs.GraphBasics
java -cp bin algorithm.implementation.dynamic.DynamicBasics
```

Or simply run each class in your IDE — they all have a `main` method that
prints the demo output.

### Appendix — Big O & Algorithm Categories (Quick Reference)

#### Big O Notation
Notation to measure algorithm.implementation efficiency in terms of time and space complexity

- **O(1) Constant**: Time regardless of input size. Example: Array access by index, hash table lookup
- **O(log n) Logarithmic**: Grows slower than input size, divides problem in half each step. Example: Binary search, balanced tree operations
- **O(n) Linear**: Grows proportionally with input size. Example: Single loop, linear search
- **O(n log n) Linearithmic**: Efficient sorting algorithm.implementation. Example: Merge sort, quick sort (average), heap sort
- **O(n²) Quadratic**: Nested loops over input. Example: Bubble sort, selection sort, naive string matching
- **O(2ⁿ) Exponential**: Doubles with each input increase. Example: Recursive fibonacci, power set generation
- **O(n!) Factorial**: Grows extremely fast. Example: Generating all permutations, traveling salesman (brute force)

#### Algorithm Categories

##### String Manipulation
- **What**: Algorithms that process, transform, or analyze strings
- **Techniques**: Character frequency counting, sliding window, two pointers
- **Examples**: Palindromes, anagrams, reverse string, longest palindrome, valid anagram, string compression

##### Multiple Pointers
- **What**: Use two or more pointers to iterate through data structure
- **Use cases**: Sorted arrays, linked lists, finding pairs/triplets
- **Complexity**: Often reduces O(n²) to O(n)
- **Examples**: Two pointers (start/end), fast/slow pointers, two sum (sorted), remove duplicates, container with most water, cycle detection

##### HashTables
- **What**: Use hash map/set for O(1) lookup to optimize solutions
- **Trade-off**: Space O(n) for time O(1) lookup
- **Examples**: Frequency counting, caching results, two sum, group anagrams, contains duplicate, longest substring without repeating chars

##### Sliding Window
- **What**: Maintain a window that slides through array/string
- **Complexity**: O(n) instead of O(n²)
- **Examples**: Fixed-size window, variable-size window, maximum sum subarray, longest substring without repeating, minimum window substring

##### Greedy
- **What**: Make locally optimal choice at each step
- **When to use**: When local optimum leads to global optimum
- **Note**: Doesn't always work, need to prove correctness
- **Examples**: Activity selection, coin change, interval scheduling, jump game, gas station, meeting rooms

##### Backtracking
- **What**: Explore all possibilities by building solution incrementally
- **Complexity**: Often exponential O(2ⁿ) or O(n!)
- **Examples**: Permutations, combinations, subsets, constraint satisfaction, N-Queens, sudoku solver, generate parentheses, word search

##### Divide and Conquer
- **What**: Break problem into smaller subproblems, solve recursively, combine results
- **Complexity**: Often O(n log n)
- **Examples**: Split in half/solve/merge, merge sort, quick sort, binary search, closest pair of points

##### Bit Manipulation
- **What**: Use bitwise operations for optimization
- **Operations**: AND (&), OR (|), XOR (^), NOT (~), shifts (<<, >>)
- **Tricks**: XOR for finding unique, AND for checking bits
- **Examples**: Set operations, single number, counting bits, power of two, reverse bits

##### Graphs
- **What**: Algorithms for traversing and analyzing graphs
- **Data structures**: Adjacency list, adjacency matrix, union-find
- **Examples**: DFS, BFS, topological sort, shortest path, number of islands, course schedule, clone graph, word ladder, cycle detection

##### Dynamic Programming
- **What**: Break problem into overlapping subproblems, store results
- **Complexity**: Trade space for time
- **Examples**: Top-down (memoization), bottom-up (tabulation), fibonacci, coin change, longest common subsequence, knapsack

#### Sorting

> 💻 Code: [BubbleSort](../src/main/java/algorithm/implementation/sorting/BubbleSort.java) · [MergeSort](../src/main/java/algorithm/implementation/sorting/MergeSort.java) · [QuickSort](../src/main/java/algorithm/implementation/sorting/QuickSort.java) · [Arrays.sort & comparators](../src/main/java/algorithm/implementation/sorting/ArraysSort.java)

| Algorithm | Idea in one sentence | Time (average) | Stable |
|---|---|---|---|
| **BubbleSort** | Repeatedly swap adjacent elements that are out of order; largest "bubbles" to the end each pass | O(n²) | Yes |
| **SelectionSort** | Repeatedly select the minimum of the unsorted part and move it to the front | O(n²) | No |
| **MergeSort** | Split in halves, sort each recursively, merge the two sorted halves | O(n log n) | Yes |
| **QuickSort** | Pick a pivot, partition smaller/larger around it, recurse on both sides | O(n log n), O(n²) worst | No |

- *Stable* = elements that compare equal keep their original relative order — it matters when sorting by several keys in sequence
- In practice call `Arrays.sort()` / `List.sort()`: primitives use a tuned quicksort, objects use TimSort (a merge-sort derivative, stable)

#### Arrays/Matrix: MxN bidimensional arrays, iteration to find patterns, values

#### Search: Iterate to find a pattern, element

> 💻 Code: [BinarySearch](../src/main/java/algorithm/implementation/search/BinarySearch.java) · [BreadthFirstSearch](../src/main/java/algorithm/implementation/search/bfs/BreadthFirstSearch.java) · [DepthFirstSearch](../src/main/java/algorithm/implementation/search/dfs/DepthFirstSearch.java) · [Tree traversals](../src/main/java/algorithm/implementation/trees/BreadthFirstSearch.java)
- **Binary search**
- **Depth First Search**: Searches a structure deep inside a node before asking his children. Uses recursion and Queues
- **Breadth First Search**: Searches a structure wide first asking neighbors before going deep. Iterates using Queues
- Graphs
- Trees
- Recursion
- Dynamic programming

#### Recursion: Functions that call itself, contain an exit condition
- fibonacci

### 🎯 Top Interview Questions

#### Graphs

0. [Clone Graph](https://lnkd.in/dV2P2TEs)
1. [Course Schedule](https://lnkd.in/de8Q3NBS)
2. [01 Matrix](https://lnkd.in/dV2P2TEs)
3. [Number of Islands](https://lnkd.in/drT2MpTz)
4. [Rotting Oranges](https://lnkd.in/dUQVwJ-d)

#### Arrays

5. [Insert Interval](https://lnkd.in/dfcEDFwB)
6. [3Sum](https://lnkd.in/duGvuCjf)
7. [Product of Array Except Self](https://lnkd.in/dkGkjQVk)
8. [Combination Sum](https://lnkd.in/d3iStbGc)
9. [Merge Intervals](https://lnkd.in/dmFZxrVQ)

#### Stacks

10. [Evaluate Reverse Polish Notation](https://lnkd.in/d-y7Zw4C)
11. [Min Stack](https://lnkd.in/dqbh7PeV)
12. [Trapping Rain Water](https://lnkd.in/dS_svBAm)

#### Binary Trees

13. [Binary Tree Level Order Traversal](https://lnkd.in/dM-VYbVB)
14. [Lowest Common Ancestor of a Binary Tree](https://lnkd.in/dUvJykgA)
15. [Serialize and Deserialize Binary Tree](https://lnkd.in/dW2cP5Wn)

#### Dynamic Programming

16. [Maximum Subarray](https://lnkd.in/dvjYye6E)
17. [Coin Change](https://lnkd.in/d7zZRg7H)

#### Binary Search

18. [Search in Rotated Sorted Array](https://lnkd.in/dEuh3gie)
19. [Time-Based Key-Value Store](https://lnkd.in/dbERGKUB)

#### Strings

20. [Longest Substring Without Repeating Characters](https://lnkd.in/d_vZrZda)
21. [Minimum Window Substring](https://lnkd.in/de8aeeQD)

#### Heap

22. [K Closest Points to Origin](https://lnkd.in/dUtCqYf4)
23. [Find Median from Data Stream](https://lnkd.in/ddDgWqUv)

#### Recursion

24. [Permutations](https://lnkd.in/dTUqmAfy)

### 🧭 Code Challenge Strategy

#### Realistic Scope for a Senior Java Role
Most Java developer challenges are NOT LeetCode-hard. Expect: string manipulation, HashMap frequency problems, collections manipulation with Streams, basic recursion; possibly two pointers, sliding window, or simple graph traversals.

#### Practice Priorities (in this order)
1. **Streams one-liners**: grouping, counting, averaging, flattening, top-N — fluency here impresses in Java-specific challenges
2. **HashMap frequency patterns**: half of the easy/medium string problems reduce to this
3. **Comparator chains**: `Comparator.comparing(X::getA).thenComparing(X::getB).reversed()`
4. Implement `equals()` and `hashCode()` by hand, at least once
5. A small create/read/update/delete REST service from an empty project in under 30 minutes (controller → service → repository, exception handler, validation) — practice it timed

#### Method During a Live Challenge
1. **Clarify the requirements before coding**: edge cases, input constraints, expected scale
2. **Think out loud** — the evaluation is about reasoning, not only the final answer
3. Start with the naive solution, state its complexity, then optimize
4. Walk through test cases verbally (or write an actual test)
5. Handle edge cases explicitly: null, empty, single element, duplicates

#### System Design Lite (for senior roles)
Be ready for: "design a URL shortener / a notification service / an order processing system".
- The method, always in the same order: clarify requirements → design the API → data model → high-level components → scale considerations (caching, queues, partitioning)
- Mention spontaneously: idempotency, asynchronous processing for slow work, cache-aside with Redis, statelessness as the precondition for horizontal scaling

---

## 💻 Programming Languages

A backend engineer is rarely single-language anymore. This section covers the three that matter most on the Java Virtual Machine and beyond, ordered from the one you know deepest to the one most different:

- **Java** — the primary language here, covered in full, with its two hardest sub-topics (concurrency and exception handling) as dedicated deep dives nested underneath it.
- **Kotlin** — the modern JVM language: same bytecode and full Java interop, but concise and null-safe.
- **Python** — the dynamically-typed counterpoint: the language of scripting, data, and machine learning.

The goal is not to relearn programming three times, but to map concept you already own onto each language's idioms and trade-offs.

### ☕ Java

> 🏷️ **Version markers** like **(Java 8)** indicate the release that introduced the feature — it remains available in every later version. They are placed next to the feature wherever it appears, not grouped into a "by version" section.

#### Core

##### Memory Management
- **Heap**: Stores objects; shared by all threads
- **Stack**: Stores method frames, local variables and references; one stack per thread

##### Garbage Collection
- **Generational hypothesis**: Most objects die young, so the heap is split into generations
  - **Young generation**: New objects; collected often and cheaply (minor collections)
  - **Old generation**: Long-lived survivors; collected rarely and expensively (major collections)
- **Garbage First Garbage Collector (G1GC)** **(Java 7; default since Java 9)**: The default collector; divides the heap into regions and targets a pause-time goal
- **Z Garbage Collector (ZGC)** **(Java 11 experimental; production-ready Java 15)**: For very low latency requirements; sub-millisecond pauses even on large heaps

##### Common Memory Leaks in Java
- Static collections that only grow and are never cleaned
- Unclosed resources (streams, connections) — prevented with try-with-resources **(Java 7)**
- `ThreadLocal` values in thread pools (pool threads never die, so their values are never released)
- Listeners or callbacks registered but never unregistered

##### Diagnosing OutOfMemoryError
- Take a heap dump and inspect it: `jmap`, VisualVM, Eclipse Memory Analyzer
- Monitor garbage collection statistics live with `jstat`

##### String Immutability

> 💻 Code: [StringPools](../src/main/java/algorithm/implementation/strings/StringPools.java) · [ImmutableTest](../src/main/java/algorithm/concepts/oop/Immutability/ImmutableTest.java)
String is immutable by design, for three reasons:
- **Security**: Values such as file paths or connection parameters cannot be altered after validation
- **Caching**: The **string pool** can safely share one instance between many references, and the hash code is computed once then reused
- **Thread safety**: An immutable object can be shared between threads without any synchronization

#### OOP

> 💻 Code: [Polymorphism](../src/main/java/algorithm/concepts/oop/Polymorphism.java) · [PlayWithAnimal](../src/main/java/algorithm/concepts/oop/polimorfism/PlayWithAnimal.java) · [AbstractClassTest](../src/main/java/algorithm/concepts/oop/abstractclasses/AbstractClassTest.java) · [Interfaces](../src/main/java/algorithm/concepts/oop/interfaces/MyImpl.java) · [Default methods](../src/main/java/algorithm/concepts/oop/defaults/DefaultImpl.java)

##### Four Pillars
- **Inheritance**: A class reuses and extends another class (`extends`); the subclass inherits fields and methods and can specialize behavior. Prefer it for true "is-a" relationships only — otherwise favor composition
- **Encapsulation**: Fields are private, access goes through methods; the class controls its own invariants and can change its internals without breaking callers
- **Polymorphism**: The same call (`animal.speak()`) executes different behavior depending on the actual object behind the reference — the mechanism that lets code depend on abstractions
- **Abstraction**: Expose *what* a type does (interface, abstract class), hide *how* it does it — callers program against the contract, not the algorithm.implementation

##### Key Concept: reference type vs object type
```java
Animal a = new Lion();   // reference type: Animal — object type: Lion
```
- The **compiler** checks calls against the REFERENCE type (left side): only methods declared in `Animal` are visible
- The **runtime** executes the OBJECT's version (right side): if `Lion` overrides `speak()`, the lion's version runs (dynamic dispatch)

##### Override vs Overload
- **Override**: same signature redefined in a subclass → resolved at RUNTIME from the object's actual type (dynamic dispatch)
- **Overload**: same method name, different parameter lists in the same class → resolved at COMPILE time from the declared types of the arguments

##### equals()/hashCode()

> 💻 Code: [HashTest](../src/main/java/algorithm/concepts/oop/hashcode/HashTest.java)
- **equals()**: Compares if two objects are meaningfully equal
- **hashCode()**: Generates a hashCode for placing the object in a collection Hashxxx
- If two objects are equal, their hashcodes must be equal as well
- Consider the same attributes for equals and hashcode
- If you override one, you must override both
- Consequence of breaking the contract in a HashMap key: the object is stored in one bucket but searched in another, so `get()` returns null even though the key is "in" the map

```java
@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof User other)) return false;   // pattern matching for instanceof (Java 16)
    return id == other.id && Objects.equals(name, other.name);
}
@Override
public int hashCode() {
    return Objects.hash(id, name);                   // SAME fields used in equals()
}
```

#### Exceptions

> 📘 Full guide: [⚠️ Exceptions](#-exceptions)

##### Checked
- Extend from Exception. Compile time
- You can recover
- IOException, SQLException, ClassNotFoundException

##### Unchecked
- Extend from RuntimeException. Run time
- You can't recover
- NullPointerException, ClassCastException, IndexOutOfBoundException, ArithmeticException

##### Best Practices
- Modern lean: **prefer unchecked exceptions for business logic** — checked exceptions pollute method signatures and compose badly with lambdas and streams
- **try-with-resources** **(Java 7)**: Any `AutoCloseable` **(Java 7)** declared in the try parentheses is closed automatically, in reverse declaration order, even when an exception is thrown
- **Custom hierarchy for an API**: One base exception, then specific subclasses (NotFound, Validation, Conflict); map each one to an HTTP status code in a global exception handler

#### Errors
- Errors represent serious problems that are typically beyond the control of the application, such as system failures or resource exhaustion
- Errors are subclasses of the java.lang.Error class, and they are not meant to be caught or handled by regular application code
- Examples of errors include OutOfMemoryError and StackOverflowError

#### Collections

> 💻 Code: [OrderList](../src/main/java/algorithm/concepts/datastructures/collections/Lists/OrderList.java) · [SetExample](../src/main/java/algorithm/concepts/datastructures/collections/Sets/SetExample.java) · [MapExample](../src/main/java/algorithm/concepts/datastructures/collections/Maps/MapExample.java) · [Conversions](../src/main/java/algorithm/concepts/convert/ArraysAndLists.java) · [Comparators](../src/main/java/algorithm/implementation/sorting/SortPlayersByScoreDecreasing.java)

##### Hierarchy
- **Collection**: Super class of all the other collections
- **Collections**: Utility class that contains methods to work with collections

##### List (Interface)
- **Properties**: Ordered, Duplicated, Indexed
- **ArrayList**: Has a backing array (init size 10 doubling as req), best performance, O(1)
- **LinkedList**: Double linked (next node, previous node), also implements Queue, lower performance, O(n), add/remove from Head and Tail

##### Set (Interface)
- Uses the equals/hashcode method to define uniqueness
- **SortedSet (Interface)**: Order insertion
- **HashSet**: Based on HashMap
- **TreeSet**: Implements SortedSet, elements are sorted, tree structure, implements SortedSet (Ordered) and NavigableSet

##### Queue (Interface)
- Orders elements as FIFO, supports ordering
- **LinkedList**: Works as a queue and list, less efficient
- **ArrayDeque**: Double ended queue, stores in a resizable array, pure, more efficient

##### Map (Interface)
- Maps key value pairs, no duplicates
- **HashMap**: Stores keys in a hash table
- **TreeMap**: Stores keys in a sorted way (red-black tree, all operations in O(log n))
- **LinkedHashMap**: Stores keys in the insertion order

###### HashMap Internals (classic interview question)
How a `put(key, value)` works, step by step:
1. The `hashCode()` of the key is computed and compressed into a **bucket index** (`index = hash & (capacity - 1)`)
2. If the bucket is empty, the entry is stored there
3. If the bucket already holds entries (a **collision**), `equals()` decides between *replace* (same key) and *append* (different key)
4. Since Java 8, when a single bucket accumulates **8 entries**, its linked list is converted into a **red-black tree** (worst-case lookup becomes O(log n) instead of O(n))
5. When size exceeds **capacity × load factor (0.75 by default)**, the table is resized: capacity doubles and every entry is redistributed

###### Thread Safety: the three map options
| Implementation | Locking strategy | Consequence |
|---|---|---|
| **HashMap** | No locking at all | Fastest, but not thread safe |
| **Collections.synchronizedMap()** | One single lock on the whole map | Thread safe, but every operation blocks all the others |
| **ConcurrentHashMap** **(Java 5)** | Fine-grained locking per bucket, lock-free reads | Thread safe and scalable under concurrent access |

##### Comparable<T>
- Natural order
- implements int objOne.compareTo(T objTwo)
- returns 0 if = arg, returns -1 if < arg, returns 1 if > arg
- Only one sort sequence can be created

##### Comparator<T>
- Multiple, defined by programmer
- implements int compare(T objOne, T objTwo);
- returns objOne.getAttribute().compareTo(objTwo.getAttribute())
- Many sort sequences can be created

```java
// Comparable: the type's single natural order, baked into the class
class Player implements Comparable<Player> {
    public int compareTo(Player other) { return Integer.compare(this.score, other.score); }
}

// Comparator: many external orders, composable without touching the class
players.sort(Comparator.comparingInt(Player::score).reversed()   // highest score first…
                       .thenComparing(Player::name));            // …ties broken by name
```

##### Conversions
- **Arrays**: collection.toArray()
- **List and Set**: List list = Arrays.asList(array)

#### Functional Interfaces **(Java 8)**

> 💻 Code: [FunctionAndBiFunction](../src/main/java/algorithm/concepts/functionalinterfaces/FunctionAndBiFunction.java) · [PredicateAndBiPredicate](../src/main/java/algorithm/concepts/functionalinterfaces/PredicateAndBiPredicate.java) · [ConsumerAndBiConsumer](../src/main/java/algorithm/concepts/functionalinterfaces/ConsumerAndBiConsumer.java) · [SupplierExample](../src/main/java/algorithm/concepts/functionalinterfaces/SupplierExample.java) · [UnaryAndBinaryOperator](../src/main/java/algorithm/concepts/functionalinterfaces/UnaryOperatorAndBinaryOperator.java) · [Lambdas](../src/main/java/algorithm/concepts/lambda/FindMatchingAnimals.java)

Contain only one abstract method, may contain any static or default methods (`default` methods are themselves **(Java 8)**). Lambdas and method references that target them are also **(Java 8)**

```java
Consumer<String> c2 = x -> System.out.println(x); c2.accept("Annie");
Function<String, Integer> f2 = x -> x.length(); f2.apply("cluck");
Predicate<String> p2 = x -> x.isEmpty(); p2.test("");
Supplier<StringBuilder> sb2 = () -> new StringBuilder(); sb2.get();
UnaryOperator<String> u2 = x -> x.toUpperCase(); u2.apply("chirp");
```

#### Streams **(Java 8)**

> 💻 Code: [MapAndFlatMap](../src/main/java/algorithm/concepts/streams/MapAndFlatMap.java) · [Filter](../src/main/java/algorithm/concepts/streams/Filter.java) · [Grouping](../src/main/java/algorithm/concepts/streams/collect/Grouping.java) · [Partitioning](../src/main/java/algorithm/concepts/streams/collect/Partitioning.java) · [Reductor](../src/main/java/algorithm/concepts/streams/collect/Reductor.java) · [PrimitiveStreams](../src/main/java/algorithm/concepts/streams/PrimitiveStreams.java) · [Short-circuit matches](../src/main/java/algorithm/concepts/streams/AllMatchAnyMatchNoneMatch.java)

It's like a wrapper for treatment and processing of big collections like a pipeline function

##### Operation Types
- **Intermediate operations**: Don't terminate the stream
- **Terminal operations**: Terminate the stream. Collectors, reductors, forEach
  - **Need all**: Require all elements to operate
    - forEach
    - count
  - **Short circuit**: Any matching element can be enough
    - allMatch
    - noneMatch

Streams should not affect external things, instead of altering a collection with foreach use collect, reduce

##### Stream Constructors
```java
collection.stream()
Stream.empty()
Stream.of("one","two")
Arrays.stream(array)
```

##### Pattern Map/Filter/Reduce
Transforms(apply functions, change type, maintain order) data → Filter(apply predicates, maintain types, remove objects) → Collect(apply bifunction, Aggregate) result

##### Mapping Stream Types
- **mapToObj**: primitives to objects
- **mapToInt,Long,Double**: object to primitives

##### Collectors
```java
Map<K,V> map = Collectors.groupingBy(Function, collection); //returns multiple values
Map<K,V> map = Collectors.partitioningBy(Predicate, collection); //returns only two values
```
##### File to Stream
```java
Stream<String> lines = Files.lines(path,encoding);
```

##### Practical Notes
- **Lazy evaluation**: Intermediate operations do nothing until a terminal operation runs
- Classic interview exercise — "group employees by department and average their salary" in one expression:
```java
Map<String, Double> averages = employees.stream()
    .collect(Collectors.groupingBy(Employee::getDepartment,
             Collectors.averagingDouble(Employee::getSalary)));
```
- **When NOT to use streams**: trivial loops, performance-critical hot paths, code that throws checked exceptions (lambdas cannot propagate them)
- **`Stream.toList()`** **(Java 16)**: shorthand for `.collect(Collectors.toList())`, returning an unmodifiable list

#### Optional **(Java 8)**

> 💻 Code: [OptionalExample](../src/main/java/algorithm/concepts/optional/OptionalExample.java) · [OptionalNull](../src/main/java/algorithm/concepts/optional/OptionalNull.java)

Wrapper that could contain a value or not

- **isPresent()**: validates if contains a value
- **get()**: if present returns value, else throws an exception
- **ifPresent(Consumer c)**: if present calls consumer with value, else does nothing
- **orElse(T other)**: if present returns value, else returns other
- **orElseGet(Supplier s)**: if present returns value, else returns the supplier result
- **orElseThrow(Supplier s)**: if present returns value, else throws exception created by calling supplier

##### Best Practices
- **orElse vs orElseGet**: `orElse(x)` always evaluates its argument (eager), `orElseGet(supplier)` calls the supplier only when the Optional is empty (lazy) — it matters when building the fallback is expensive
- Use Optional as a **return type** only — never as a field or a method parameter

#### Modern Java (9–21) — shows you keep current

> 💻 Code: [VirtualThreadsExample](../src/main/java/algorithm/concepts/threads/executors/VirtualThreadsExample.java)

- **var (Java 10)**: Local variable type inference; the type stays static, only the declaration is shorter
- **Records (Java 14+)**: Immutable data carriers with generated constructor, accessors, equals(), hashCode() and toString() — the modern answer for Data Transfer Objects (DTOs)
  ```java
  public record UserDto(Long id, String name) {}
  ```
- **Text blocks (Java 15+)**: Multi-line string literals delimited by `"""` — ideal for JSON or SQL snippets
- **Sealed classes (Java 17)**: A class or interface declares the exhaustive list of its permitted subtypes (`sealed interface Shape permits Circle, Square`), which enables exhaustive switch
- **Switch expressions** **(Java 14)**: a `switch` that returns a value with arrow (`->`) branches and no fall-through
- **Pattern matching for `instanceof`** **(Java 16)**: `if (obj instanceof User user)` binds the cast variable directly
- **Pattern matching for `switch`** **(Java 21)**: `switch` branches can match on types and deconstruct records
- **Virtual threads (Java 21, Project Loom)**: Threads managed by the Java Virtual Machine instead of the operating system
  - A platform thread is heavy (around one megabyte of stack, a few thousand maximum); a virtual thread is light (a few kilobytes, millions are possible)
  - When a virtual thread blocks on input/output, it releases its carrier platform thread instead of wasting it
  - Best fit: input/output bound work such as one-thread-per-request in a microservice — increasingly asked in microservices interviews

#### Concurrency

> 📘 Full guide: [🧵 Concurrency and Parallelism](#-concurrency-and-parallelism)
> 💻 Code: [ThreadBasics](../src/main/java/algorithm/concepts/threads/basics/ThreadBasics.java) · [ExecutorServiceExample](../src/main/java/algorithm/concepts/threads/executors/ExecutorServiceExample.java) · [CompletableFutureExample](../src/main/java/algorithm/concepts/threads/advanced/CompletableFutureExample.java) · [AtomicExample](../src/main/java/algorithm/concepts/threads/atomic/AtomicExample.java) · [SynchronizedExample](../src/main/java/algorithm/concepts/threads/synchronization/SynchronizedExample.java) · [ProducerConsumerExample](../src/main/java/algorithm/concepts/threads/communication/ProducerConsumerExample.java)

##### Creation
- Implement Runnable (void)
- Implement Callable (<T> return result) **(Java 5)**
- Extend Thread
- **ExecutorService** **(Java 5)** (the whole `java.util.concurrent` Concurrency API arrived in Java 5):
  - void execute() returns void
  - Future<?> submit() returns a Future<?> object containing the result
  - Future<T> contains the result of a thread execution
  - ScheduledFuture<T> contains the result of a scheduled thread execution
  - newSingleThreadExecutor: Single thread
  - newSingleThreadScheduledExecutor: Scheduled single thread
  - newCachedThreadPool: Dynamic thread pool
  - newFixedThreadPool(int n): Thread pool with size
  - newScheduledFixedThreadPool(int n): Scheduled Thread pool with size
- **CyclicBarrier**: Sets a limit of workers, once reached, other threads can start working, and so on
- **ForkJoinPool** **(Java 7)**: Uses recursion to finish a task
  - RecursiveAction: Like execute()
  - RecursiveTask<T>: Like submit()
- **Virtual threads** **(Java 21)**: `Executors.newVirtualThreadPerTaskExecutor()` — lightweight threads for input/output-bound work (detailed under [Modern Java](#modern-java-921--shows-you-keep-current) and the [Concurrency deep dive](#-concurrency-and-parallelism))

*Why never raw `new Thread()`: no reuse (creation is expensive), no bound on the number of threads, no lifecycle management — always go through a pool (`ExecutorService`)*

##### CompletableFuture
Composable asynchronous computations — the asynchronous equivalent of a Stream pipeline
- **thenApply(Function)**: Transforms the result (the equivalent of map)
- **thenCompose(Function)**: Chains another CompletableFuture (the equivalent of flatMap)
- **thenCombine(other, BiFunction)**: Merges the results of two independent futures
- **exceptionally(Function)**: Recovery path when the computation fails
- **allOf(futures...)**: Completes when all the given futures complete

##### Synchronization Mechanisms
| Mechanism | What it provides | What it lacks |
|---|---|---|
| **synchronized** | Simple mutual exclusion, automatic lock release | No timeout, no fairness, single wait condition |
| **ReentrantLock** | Mutual exclusion with timeout (`tryLock`), fairness, multiple conditions | Automatic release — you must unlock in a finally block |
| **ReadWriteLock** | Many concurrent readers, one exclusive writer | Automatic release — and it is harder to reason about |

##### volatile
- Guarantees **visibility**: a write by one thread is immediately seen by all the others
- Does NOT guarantee **atomicity**: `count++` on a volatile field remains a race condition (read, increment and write are three separate operations)

##### Atomics
Atomic classes (`AtomicInteger`, `AtomicLong`, `AtomicReference`) support thread safe operations without locks, using **compare-and-swap (CAS)**: the value is updated only if it still equals the expected value, otherwise the operation retries

##### Classic Concurrency Problems
- **Producer/consumer**: Implement with a `BlockingQueue` — `put()` blocks when the queue is full, `take()` blocks when it is empty; no manual wait/notify needed
- **Deadlock**: Four conditions must hold simultaneously: mutual exclusion, hold and wait, no preemption, circular wait. Prevention: always acquire locks in the same global order
- **Race condition**: Two threads read-modify-write shared state without coordination; fix with atomics, locks or immutability
- **ThreadLocal leak**: In a thread pool the threads survive the task, so ThreadLocal values must be removed explicitly (`remove()` in a finally block)

##### Java Reflection
Extract and invoke methods from a class whose code we don't have access
```java
Method[] metodos=c.getClass().getMethods()
String cadena=(String) m.invoke(c, null)
```

##### Reactive Programming
Declarative asynchronous style of programming that reacts to events
- Nonblocking
- Asynchronous
- Functional/Declarative

**Interfaces**:
- Publisher
- Subscriber
- CompletableFuture

#### 🧵 Concurrency and Parallelism

A focused, practical reference for **multithreading** and **concurrency** in
Java: how threads work, how to coordinate them safely, and which high-level
utils to reach for. Every section links to a runnable Java file under
`src/algorithm.concepts/threads/<topic>/...`.

##### 1. Concepts & Vocabulary

| Term | Meaning |
|---|---|
| **Process** | A program running on the operating system, with its own isolated memory and resources. Two processes cannot directly read each other's data. |
| **Thread** | A single line of execution living inside a process. Multiple threads of the same process share its memory, so they can collaborate — but also collide — on the same data. |
| **Concurrency** | Structuring a program so several tasks can be in progress during overlapping time windows. On a single processor core this is achieved by rapidly switching between them, giving the illusion of simultaneity. |
| **Parallelism** | Actually running multiple tasks at the same instant on different processor cores. Requires multi-core hardware; concurrency does not. |
| **Multithreading** | The technique of splitting a single program's work across several threads to achieve concurrency, parallelism, or both. |
| **Critical Section** | A region of code that touches data shared between threads and must therefore be executed by only one thread at a time to stay correct. |
| **Race Condition** | A bug whose outcome depends on the unpredictable order in which threads happen to run, so the program produces different (sometimes wrong) results across executions. |
| **Mutual Exclusion (mutex)** | A guarantee that, no matter how many threads compete, at most one of them is executing inside a given critical section at any moment. |
| **Atomic Operation** | An operation that completes as one indivisible step. Other threads can never observe it half-done — they see the state strictly before or strictly after. |
| **Visibility** | Whether the changes one thread makes to shared data are actually seen by other threads. Without proper synchronization, updates can remain trapped in a thread's local cache. |
| **Happens-Before** | A formal ordering rule from the Java Memory Model: when action A happens-before action B, A's effects are guaranteed to be visible and ordered before B across threads. |
| **Deadlock** | A frozen state in which two or more threads each hold a resource the other needs and none will release, so they wait on each other forever. |
| **Livelock** | A situation where threads stay active and keep reacting to each other, but their constant adjustments cancel out and no real progress is made. |
| **Starvation** | A condition in which a thread is repeatedly passed over for a resource or for processor time, so it never gets the chance to make progress. |
| **Daemon Thread** | A background-support thread that the Java Virtual Machine does not wait for at shutdown — once only daemon threads remain, the program exits immediately. |

##### 2. `extends Thread` vs `implements Runnable`

Java offers two foundational ways to define what a thread does. The keyword
you use comes from how Java models them: `Thread` is a **class** (so you
`extends` it), while `Runnable` is an **interface** (so you `implements` it).

| | `extends Thread` | `implements Runnable` |
|---|---|---|
| What you write | Subclass of `Thread`, override `run()` | Class (or lambda) providing `run()` |
| Inheritance cost | Consumes your single-inheritance slot | Free — your class can still extend something else |
| Reusability | Tied to a specific `Thread` subclass | Same `Runnable` works with any `Thread` or any `Executor` |
| Separation of concerns | Mixes "what to run" with "how it runs" | Keeps the task separate from the thread that runs it |
| Idiomatic style | Rarely preferred | Preferred — also expressible as a lambda |

```java
// extends Thread — couples your task to the Thread class
class Worker extends Thread {
    @Override public void run() { doWork(); }
}
new Worker().start();

// implements Runnable — task is decoupled from the runner
class Task implements Runnable {
    @Override public void run() { doWork(); }
}
new Thread(new Task()).start();

// lambda Runnable — shortest form
new Thread(() -> doWork()).start();
```

**Rule of thumb:** prefer `implements Runnable` (or a lambda). A `Runnable`
can run on any `Thread`, on any `ExecutorService`, and your class stays
free to extend something else. For thread creation, `Callable<V>` is the
related interface used when the task must return a value or throw a checked
exception.

##### 3. Lambdas as Thread Tasks **(Java 8)**

In multithreading code, a lambda is the most concise way to describe **the
work a thread should run**. Every concurrency entry point in Java accepts a
lambda directly as the task body, so you rarely need a named class just to
launch a thread.

```java
new Thread(() -> doWork()).start();                 // task for a raw thread
executor.submit(() -> compute());                   // task with a result
CompletableFuture.supplyAsync(() -> fetchData());   // task in an async pipeline
```

Each line above hands a thread (or worker pool) a small bundle of work to
execute. The lambda stands in for the thread's task; the runtime decides
which thread actually runs it.

##### 4. Creating Threads — three ways

| Approach | Pros | Cons |
|---|---|---|
| `extends Thread` | Quick to write for a throwaway demo where the class will not extend anything else. | Spends the class's single inheritance slot and welds the task tightly to a specific `Thread` subclass. |
| `implements Runnable` | Cleanly separates the task from the runner — the same `Runnable` can run on any `Thread` or any `Executor`. | A few extra lines compared to a lambda for very small tasks. |
| Lambda (`Runnable`) | The shortest and most idiomatic form for inline work, ideal for one-liners and short bodies. | Becomes hard to read once the task grows; for non-trivial logic, promote it to a named class or method. |

```java
new Thread(() -> System.out.println("hi")).start();
```

📁 [src/algorithm.concepts/threads/basics/ThreadBasics.java](../src/main/java/algorithm/concepts/threads/basics/ThreadBasics.java)

##### 5. Thread Lifecycle, Sleep, Join, Interrupt, Daemon

A thread moves through a fixed set of states during its life:
`NEW → RUNNABLE → (BLOCKED | WAITING | TIMED_WAITING) → TERMINATED`.
It starts *new*, becomes *runnable* once `start()` is called, may briefly
become *blocked* (waiting for a lock), *waiting* (parked on `wait()` or
`join()`), or *timed-waiting* (parked with a deadline like `sleep`),
and finally *terminates* when its `run()` method returns.

**Lifecycle and execution control**

| Method | What it does |
|---|---|
| `start()` | Asks the operating system to launch a fresh thread that will run `run()` concurrently. A given thread can be started exactly once. |
| `run()` | The body of work the thread performs. Calling `run()` directly just executes the code on the **current** thread — it does not start a new one. |
| `Thread.sleep(ms)` | Pauses the calling thread for the requested number of milliseconds, parking it in `TIMED_WAITING`. The thread keeps any locks it already holds. |
| `Thread.yield()` | A hint to the scheduler that the current thread is willing to give up the CPU. Implementations may ignore it; do not rely on it for correctness. |
| `Thread.onSpinWait()` | A hint (since Java 9) that the current thread is in a busy-wait loop, allowing the JVM to insert CPU-friendly pauses. |
| `t.join()` / `t.join(ms)` | Blocks the calling thread until thread `t` has finished, optionally with a timeout. |

**Cancellation and the interrupted flag**

| Method | What it does |
|---|---|
| `t.interrupt()` | Sends a polite cancellation request by raising `t`'s interrupted flag. The target thread decides how — and whether — to respond. |
| `t.isInterrupted()` | Reads `t`'s interrupted flag without changing it. |
| `Thread.interrupted()` | Static: reads **and clears** the interrupted flag of the current thread. |

**Identity, naming, and state**

| Method | What it does |
|---|---|
| `Thread.currentThread()` | Returns a reference to the thread executing the call. |
| `getName()` / `setName(String)` | Reads or sets the thread's display name; helpful for logging and debugging. |
| `getId()` / `threadId()` (Java 19+) | Returns the thread's unique numeric identifier. |
| `getState()` | Returns the current `Thread.State` (NEW, RUNNABLE, …, TERMINATED). |
| `isAlive()` | True if the thread has been started and has not yet terminated. |
| `isVirtual()` (Java 21+) | True if the thread is a virtual thread rather than a platform thread. |

**Daemon, priority, and grouping**

| Method | What it does |
|---|---|
| `setDaemon(true)` / `isDaemon()` | Marks (or queries) whether the thread is a daemon. The Java Virtual Machine does not wait for daemon threads at shutdown. Must be set before `start()`. |
| `setPriority(int)` / `getPriority()` | Suggests a scheduling priority from 1 (lowest) to 10 (highest). The operating system is free to ignore it; never rely on priority for correctness. |
| `getThreadGroup()` | Returns the `ThreadGroup` the thread belongs to (mostly historical; rarely used in modern code). |
| `setUncaughtExceptionHandler(handler)` | Installs a handler that is invoked if the thread terminates because of an uncaught exception. |

**Static utilities and factories**

| Method | What it does |
|---|---|
| `Thread.activeCount()` / `Thread.enumerate(arr)` | Estimate or list the active threads in the current thread group. Diagnostic only. |
| `Thread.holdsLock(obj)` | True if the current thread holds the monitor of `obj`; useful in assertions. |
| `Thread.dumpStack()` | Prints the current thread's stack trace to standard error — debugging aid. |
| `Thread.ofPlatform()` (Java 21+) | Builder for a traditional platform thread, exposing `name`, `daemon`, `priority`, `group`, and `start(Runnable)`. |
| `Thread.ofVirtual()` (Java 21+) | Builder for a lightweight virtual thread; the same shape as `ofPlatform()`. |

Cooperative cancellation pattern:

```java
while (!Thread.currentThread().isInterrupted()) {
    // ... do work
}
```

When you catch `InterruptedException` and don't rethrow, **re-set** the flag:

```java
try { Thread.sleep(...); }
catch (InterruptedException e) { Thread.currentThread().interrupt(); }
```

📁 [src/algorithm.concepts/threads/lifecycle/ThreadLifecycle.java](../src/main/java/algorithm/concepts/threads/lifecycle/ThreadLifecycle.java)

##### 6. Race Conditions

A race condition appears whenever the program's correctness depends on
the exact order in which threads happen to run. Because thread scheduling
is decided by the operating system, that order is unpredictable, so the
same code can produce different results on different runs.

The textbook example is `counter++`. Although it looks like a single
statement, it really expands into three steps: **read** the current
value, **add one**, and **write** the new value back. Two threads can
both read the same starting value, both add one, and both write the same
result — silently losing one of the increments.

📁 [src/algorithm.concepts/threads/synchronization/RaceConditionDemo.java](../src/main/java/algorithm/concepts/threads/synchronization/RaceConditionDemo.java)

The standard fixes (each covered in the sections that follow): wrap the
critical section in `synchronized`, use an explicit lock, swap the field
for an atomic variable, or hand data between threads through a concurrent
collection instead of sharing it directly.

##### 7. `synchronized` — intrinsic locks

Every Java object carries an invisible **lock** (also called a *monitor*).
Only one thread at a time can hold a given object's lock. The
`synchronized` keyword automatically picks up that lock when a thread
enters the protected code and releases it when the thread leaves —
including when an exception is thrown — so you cannot forget to unlock.

That single mechanism delivers two guarantees at once:

- **Mutual exclusion** — no two threads execute the protected code at the same time, so shared state stays consistent.
- **Visibility** — every change a thread makes before releasing the lock is guaranteed to be observed by the next thread that acquires it, with no stale-cache surprises.

The keyword can be applied in three forms:

```java
public synchronized void m() { ... }      // locks "this"
public static synchronized void s() {...} // locks the Class object
synchronized (lockObject) { ... }         // locks any chosen object
```

**Best practice:** lock on a `private final Object` that is owned by the
class. If you lock on `this` or on the class itself, any unrelated piece
of code that synchronizes on the same object can interfere with — or even
deadlock — your locking strategy. A private dedicated lock object keeps
that strategy under your control.

📁 [src/algorithm.concepts/threads/synchronization/SynchronizedExample.java](../src/main/java/algorithm/concepts/threads/synchronization/SynchronizedExample.java)

##### 8. Explicit Locks (`ReentrantLock`, `ReadWriteLock`) **(Java 5; `StampedLock` Java 8)**

The `java.util.concurrent.locks` package offers explicit lock objects that
do everything `synchronized` does — and more. They cost a little more
discipline (you must release the lock yourself) but give you fine control
over how a thread waits, fails, or recovers.

**Interfaces in `java.util.concurrent.locks`**

| Type | Use |
|---|---|
| `Lock` | The general contract for explicit locks: `lock()`, `lockInterruptibly()`, `tryLock()`, `tryLock(t, unit)`, `unlock()`, and `newCondition()`. |
| `Condition` | A wait set associated with a `Lock`, used like `wait`/`notify` but with `await()`, `signal()`, and `signalAll()`. A single lock can host many independent conditions. |
| `ReadWriteLock` | A pair of cooperating locks (`readLock()` and `writeLock()`) so multiple readers can share access while writers stay exclusive. |

**Implementations**

| Class | Use |
|---|---|
| `ReentrantLock` | The standard general-purpose `Lock`. Reentrant — the same thread may acquire it multiple times — and supports an optional fair mode. |
| `ReentrantReadWriteLock` | The standard `ReadWriteLock` algorithm.implementation. Both views are reentrant; supports lock downgrading (write → read) but not upgrading. |
| `StampedLock` | A high-performance lock with three modes — write, read, and **optimistic read**. Optimistic reads return a stamp that the caller validates afterward, allowing fully concurrent reads when there are no writers. Not reentrant. |
| `LockSupport` | Low-level utility for parking and unparking threads (`park`, `parkNanos`, `unpark`). Building block for custom synchronizers; rarely used directly in application code. |

**`synchronized` versus `ReentrantLock` at a glance**

| Feature | `synchronized` | `ReentrantLock` |
|---|---|---|
| Block-style | The lock is scoped automatically to the surrounding `synchronized` block. | Acquired and released manually with `lock()` / `unlock()`. |
| Try without blocking | Not supported — a thread must wait. | `tryLock()` returns immediately, succeeding or giving up so the thread can do something else. |
| Time-bounded wait | Not supported. | `tryLock(t, unit)` waits at most the given duration before giving up. |
| Interruptible while waiting | Not supported — a blocked thread cannot be interrupted. | `lockInterruptibly()` allows another thread to cancel the wait via `interrupt()`. |
| Fairness option | No guarantee about who gets the lock next. | Optional fair mode grants the lock in roughly first-come-first-served order. |
| Multiple condition queues | Only one implicit wait set per object. | `newCondition()` produces independent wait queues, so different threads can wait on different conditions on the same lock. |

**Always release the lock in `finally`.**

```java
lock.lock();
try { /* critical section */ }
finally { lock.unlock(); }
```

📁 [src/algorithm.concepts/threads/locks/ReentrantLockExample.java](../src/main/java/algorithm/concepts/threads/locks/ReentrantLockExample.java)
📁 [src/algorithm.concepts/threads/locks/ReadWriteLockExample.java](../src/main/java/algorithm/concepts/threads/locks/ReadWriteLockExample.java)
📁 [src/algorithm.concepts/threads/locks/ConditionExample.java](../src/main/java/algorithm/concepts/threads/locks/ConditionExample.java)
📁 [src/algorithm.concepts/threads/locks/StampedLockExample.java](../src/main/java/algorithm/concepts/threads/locks/StampedLockExample.java)

`ReadWriteLock` splits a lock into two cooperating views: any number of
threads can hold the **read** lock at the same time, but the **write**
lock is exclusive and blocks all readers and writers. It is ideal for
data structures that are read very often and updated only occasionally.

##### 9. Atomic Variables **(Java 5)**

The classes in `java.util.concurrent.atomic` provide thread-safe updates
**without using any lock**. Internally they rely on the processor's
**Compare-And-Swap** instruction: read the current value, attempt to
replace it only if it has not changed in the meantime, and retry on
failure. For simple counters, flags, and reference swaps this is much
faster than acquiring a lock and never blocks the thread.

**Single-value atomics**

| Class | Use |
|---|---|
| `AtomicInteger` / `AtomicLong` / `AtomicBoolean` | Thread-safe holders for a single primitive value, with atomic increment, decrement, get-and-set, and compare-and-set operations. |
| `AtomicReference<T>` | An atomic slot for an object reference. Useful for swapping in immutable snapshots of state without locking. |

**Atomic arrays**

| Class | Use |
|---|---|
| `AtomicIntegerArray` / `AtomicLongArray` | Fixed-size arrays whose elements can each be updated atomically without locking the whole array. |
| `AtomicReferenceArray<T>` | Fixed-size array of object references with per-slot atomic get, set, and compare-and-set. |

**Tagged references** — defeat the *ABA problem*, where a value changes from A to B and back to A and a naive compare-and-set cannot tell.

| Class | Use |
|---|---|
| `AtomicMarkableReference<T>` | An atomic pair of a reference and a single boolean mark; useful for marking nodes as logically deleted in lock-free data structures. |
| `AtomicStampedReference<T>` | An atomic pair of a reference and an integer stamp; the stamp increments on each update so ABA changes are detectable. |

**Field updaters** — operate atomically on a `volatile` field of an existing object, without converting it into an `AtomicX` instance.

| Class | Use |
|---|---|
| `AtomicIntegerFieldUpdater<T>` | Atomic operations on a named `volatile int` field of a class `T`. |
| `AtomicLongFieldUpdater<T>` | Same for a `volatile long` field. |
| `AtomicReferenceFieldUpdater<T,V>` | Same for a `volatile` reference field of type `V`. |

**Accumulators and adders** — optimized for high-contention aggregation by spreading writes across internal cells.

| Class | Use |
|---|---|
| `LongAdder` / `DoubleAdder` | High-throughput counters built for many threads incrementing concurrently. They beat `AtomicLong` under heavy contention by spreading updates across internal cells and summing them on read. |
| `LongAccumulator` / `DoubleAccumulator` | Generalize the adders to any associative function (max, min, multiply, …). You supply the binary operator and the identity value. |

```java
AtomicInteger counter = new AtomicInteger(0);
counter.incrementAndGet();                         // atomic ++
counter.compareAndSet(0, 1);                       // CAS
```

📁 [src/algorithm.concepts/threads/atomic/AtomicExample.java](../src/main/java/algorithm/concepts/threads/atomic/AtomicExample.java)

##### 10. Concurrent Collections **(Java 5)**

Wrapping a regular collection with `Collections.synchronizedList(...)`
makes it safe but turns every access into a serialized chokepoint. The
concurrent collections in `java.util.concurrent` are purpose-built to
scale: each one is tuned for a specific access pattern. The full
inventory is grouped below by role.

**Core interfaces**

| Interface | Use |
|---|---|
| `ConcurrentMap` | The contract for thread-safe maps. Adds atomic compound operations like `putIfAbsent`, `replace`, and `compute`. |
| `ConcurrentNavigableMap` | A `ConcurrentMap` that is also sorted, supporting range views and floor/ceiling lookups. |
| `BlockingQueue` | A queue that coordinates producers and consumers: `put` blocks when the queue is full, `take` blocks when it is empty. The backbone of producer-consumer designs. |
| `BlockingDeque` | A double-ended `BlockingQueue` — both ends support blocking inserts and removes. |
| `TransferQueue` | A `BlockingQueue` whose producers can `transfer()` an element directly to a waiting consumer, blocking until one arrives. |

**Lists and sets**

| Collection | Use |
|---|---|
| `CopyOnWriteArrayList` | Optimized for read-heavy lists. Each modification copies the underlying array, so iteration is cheap and never throws `ConcurrentModificationException`. Best when writes are rare. |
| `CopyOnWriteArraySet` | Set built on `CopyOnWriteArrayList` — same trade-offs (cheap reads, expensive writes), useful for small sets that change rarely. |

**Maps**

| Collection | Use |
|---|---|
| `ConcurrentHashMap` | A thread-safe map with bucket-level locking, so reads and many writes can happen in parallel without locking the whole structure. |
| `ConcurrentSkipListMap` | The concurrent counterpart of `TreeMap`: a sorted map backed by a skip list, supporting concurrent reads and writes with `O(log n)` operations. |
| `ConcurrentSkipListSet` | The concurrent counterpart of `TreeSet`, backed by a `ConcurrentSkipListMap`. |

**Non-blocking queues and deques**

| Collection | Use |
|---|---|
| `ConcurrentLinkedQueue` | A non-blocking, unbounded first-in-first-out queue based on lock-free algorithm.implementation — fast under high contention. |
| `ConcurrentLinkedDeque` | A non-blocking, unbounded double-ended queue, also lock-free. Useful for work-stealing patterns. |

**Blocking queues and deques**

| Collection | Use |
|---|---|
| `ArrayBlockingQueue` | Bounded blocking queue backed by a fixed-size array. Provides natural backpressure: producers slow down when the buffer fills up. |
| `LinkedBlockingQueue` | Linked-node blocking queue, optionally bounded. High throughput when producers and consumers are roughly balanced. |
| `LinkedBlockingDeque` | Optionally-bounded blocking double-ended queue, the deque flavor of `LinkedBlockingQueue`. |
| `PriorityBlockingQueue` | Unbounded blocking queue that orders elements by priority instead of arrival order. |
| `SynchronousQueue` | A zero-capacity queue: every `put` waits for a matching `take` and vice versa, forcing a direct hand-off between threads. |
| `LinkedTransferQueue` | An unbounded `TransferQueue` that combines the throughput of `ConcurrentLinkedQueue` with optional blocking and direct hand-off via `transfer()`. |
| `DelayQueue` | An unbounded blocking queue of `Delayed` elements; an element only becomes available to `take()` once its delay has elapsed. Ideal for scheduled work. |

📁 [src/algorithm.concepts/threads/concurrent/ConcurrentCollectionsExample.java](../src/main/java/algorithm/concepts/threads/concurrent/ConcurrentCollectionsExample.java)

##### 11. The Concurrent Application Programming Interface — `ExecutorService`, `Callable`, `Future` **(Java 5)**

**`ExecutorService`** is a managed pool of reusable worker threads.
Instead of creating and destroying a `Thread` for every piece of work,
you submit tasks to the pool and let it schedule them across its
workers. This is almost always the right way to run concurrent work in
Java: it caps the number of threads, queues overflow tasks, and
integrates cleanly with `Future` for results.

**Core interfaces**

| Interface | Use |
|---|---|
| `Executor` | The minimal contract: a single `execute(Runnable)` method. Decouples task submission from how the task is run. |
| `ExecutorService` | Adds task lifecycle: `submit`, `invokeAll`, `invokeAny`, `shutdown`, `shutdownNow`, and `awaitTermination`. |
| `ScheduledExecutorService` | Extends `ExecutorService` with `schedule`, `scheduleAtFixedRate`, and `scheduleWithFixedDelay`. |
| `CompletionService<V>` | Decouples production from consumption of completed `Future`s — submit tasks here, then `take()` results in completion order. |

**Implementations**

| Class | Use |
|---|---|
| `ThreadPoolExecutor` | The configurable thread-pool algorithm.implementation behind most `Executors` factories. Lets you set core/max pool sizes, keep-alive time, work queue, `ThreadFactory`, and rejection policy. |
| `ScheduledThreadPoolExecutor` | The configurable algorithm.implementation behind the scheduled factories. |
| `ForkJoinPool` | A work-stealing pool optimized for divide-and-conquer tasks. Each worker has its own deque and steals from others when idle. Used by parallel streams via `commonPool()`. |
| `ExecutorCompletionService<V>` | The standard `CompletionService` algorithm.implementation, wrapping any `Executor`. |

**Fork/Join task types**

| Class | Use |
|---|---|
| `ForkJoinTask<V>` | The base task type for `ForkJoinPool`, supporting `fork()` and `join()` for recursive decomposition. |
| `RecursiveTask<V>` | A `ForkJoinTask` that returns a value — extend it for divide-and-conquer computations. |
| `RecursiveAction` | A `ForkJoinTask` with no return value, for side-effecting recursive work. |
| `CountedCompleter<T>` | A `ForkJoinTask` that completes only after a tracked count of pending sub-tasks reaches zero. |

**Helper interfaces**

| Type | Use |
|---|---|
| `ThreadFactory` | Controls how a pool creates its worker threads (naming, daemon flag, priority, exception handler). |
| `RejectedExecutionHandler` | Decides what happens when a task is submitted to a pool that cannot accept it: `AbortPolicy` (default), `CallerRunsPolicy`, `DiscardPolicy`, `DiscardOldestPolicy`. |

**Factories in `java.util.concurrent.Executors`**

| Factory | Behavior |
|---|---|
| `newFixedThreadPool(n)` | Keeps exactly `n` worker threads alive. Extra tasks wait in an unbounded queue until a worker is free. |
| `newCachedThreadPool()` | Creates new threads on demand and reaps idle ones after 60 seconds. Ideal for bursty, short-lived tasks. |
| `newSingleThreadExecutor()` | A single worker that processes tasks strictly in submission order. Useful for serializing work off the calling thread. |
| `newWorkStealingPool(parallelism)` | Returns a `ForkJoinPool` configured for the given parallelism level. Best for recursive or fan-out workloads. |
| `newScheduledThreadPool(n)` | A pool that can run tasks after a delay or repeatedly at a fixed rate or fixed delay. |
| `newSingleThreadScheduledExecutor()` | The single-threaded version of `newScheduledThreadPool`. |
| `newThreadPerTaskExecutor(threadFactory)` | Java 21+: starts a brand-new thread per task using the given factory — pair with `Thread.ofVirtual().factory()` for cheap virtual threads. |
| `newVirtualThreadPerTaskExecutor()` | Java 21+: shorthand for the above using the default virtual-thread factory. Ideal when you have huge numbers of tasks that mostly block on I/O. |

**`Runnable` vs `Callable<V>`:** both describe a unit of work. A `Runnable`
returns nothing and cannot throw checked exceptions; a `Callable<V>`
returns a value of type `V` and may throw any exception, which is what
you submit when you actually need a result back.

```java
Runnable    r = () -> { ... };                      // void run(),       no checked throws
Callable<V> c = () -> { return v; };                // V call() throws Exception
```

**`Future<V>`** represents the eventual result of a submitted task. You
can ask whether it is done, block waiting for the value, fetch the
result, or cancel the task before it finishes:

```java
Future<Integer> f = pool.submit(() -> 2 + 2);
Integer result = f.get();                           // blocks until done
```

Lifecycle:

```java
ExecutorService pool = Executors.newFixedThreadPool(4);
pool.submit(task);
pool.shutdown();                                    // no more tasks
pool.awaitTermination(5, TimeUnit.SECONDS);
```

📁 [src/algorithm.concepts/threads/executors/ExecutorServiceExample.java](../src/main/java/algorithm/concepts/threads/executors/ExecutorServiceExample.java)
📁 [src/algorithm.concepts/threads/executors/CallableFutureExample.java](../src/main/java/algorithm/concepts/threads/executors/CallableFutureExample.java)
📁 [src/algorithm.concepts/threads/executors/ScheduledExecutorExample.java](../src/main/java/algorithm/concepts/threads/executors/ScheduledExecutorExample.java)
📁 [src/algorithm.concepts/threads/executors/ForkJoinExample.java](../src/main/java/algorithm/concepts/threads/executors/ForkJoinExample.java)
📁 [src/algorithm.concepts/threads/executors/VirtualThreadsExample.java](../src/main/java/algorithm/concepts/threads/executors/VirtualThreadsExample.java)

##### 12. Thread Communication — `wait` / `notify`, Producer-Consumer

`wait()`, `notify()`, and `notifyAll()` are the original way Java threads
talk to each other. They live on `Object` itself — every object can act
as a condition variable — and may only be invoked by a thread that
already holds that object's lock, so the calls always appear inside a
`synchronized` block.

- `wait()` releases the lock and parks the calling thread until another thread signals it.
- `notify()` wakes one of the threads waiting on the same object; `notifyAll()` wakes them all so they can re-check the condition and one will proceed.

```java
synchronized (lock) {
    while (!condition) lock.wait();    // ALWAYS while-loop, not if
    // ...
}
synchronized (lock) {
    condition = true;
    lock.notifyAll();
}
```

Always re-check the condition inside a `while` loop, not an `if`. A
thread can wake up *spuriously* (with no notification at all) or because
several waiters were notified at once and another one already consumed
the signal — looping ensures the thread only proceeds when the condition
is genuinely true.

📁 [src/algorithm.concepts/threads/communication/WaitNotifyExample.java](../src/main/java/algorithm/concepts/threads/communication/WaitNotifyExample.java)

For producer-consumer designs, prefer a `BlockingQueue` over hand-written
`wait`/`notify` code. The queue takes care of all the synchronization,
parking, and signaling for you, and it is much harder to get wrong:

📁 [src/algorithm.concepts/threads/communication/ProducerConsumerExample.java](../src/main/java/algorithm/concepts/threads/communication/ProducerConsumerExample.java)

##### 13. `CompletableFuture` **(Java 8)**

A `CompletableFuture` is a `Future` you can build pipelines on top of.
Instead of blocking with `get()` and orchestrating threads yourself, you
**describe what should happen next** once a result arrives —
transformations, side effects, error recovery, or combinations of
several futures — and the runtime stitches the stages together,
running each one when its inputs are ready.

**Creation**

| Method | Purpose |
|---|---|
| `supplyAsync(Supplier)` | Start an asynchronous computation that produces a value when it finishes. |
| `supplyAsync(Supplier, Executor)` | Same, but run the work on a specific executor instead of the common pool. |
| `runAsync(Runnable)` / `runAsync(Runnable, Executor)` | Start an asynchronous action that performs side effects but has no result. |
| `completedFuture(value)` | Create a future that is already successfully completed with the given value. |
| `failedFuture(throwable)` | Create a future that is already completed exceptionally with the given throwable. |

**Chaining a single stage** — synchronous variants run on the thread that completes the previous stage; `Async` variants hop to the common pool (or to an explicit `Executor`).

| Method | Purpose |
|---|---|
| `thenApply(Function)` / `thenApplyAsync(Function[, Executor])` | Transform the previous result into a new value. |
| `thenAccept(Consumer)` / `thenAcceptAsync(Consumer[, Executor])` | Consume the previous result for its side effect, with no further value. |
| `thenRun(Runnable)` / `thenRunAsync(Runnable[, Executor])` | Run an action after the previous stage completes, ignoring its result. |
| `thenCompose(Function)` / `thenComposeAsync(...)` | Chain another future after this one, flattening `CompletableFuture<CompletableFuture<X>>` into `CompletableFuture<X>`. |

**Combining two stages**

| Method | Purpose |
|---|---|
| `thenCombine(other, BiFn)` / `thenCombineAsync(...)` | Wait until both this future and another have completed, then merge their results. |
| `runAfterBoth(other, Runnable)` / `runAfterBothAsync(...)` | Run an action after both futures complete; the values are ignored. |
| `applyToEither(other, Fn)` / `applyToEitherAsync(...)` | Take the result of whichever of the two completes first and transform it. |
| `acceptEither(other, Consumer)` / `acceptEitherAsync(...)` | Consume the result of whichever completes first. |
| `runAfterEither(other, Runnable)` / `runAfterEitherAsync(...)` | Run an action once either of the two futures completes. |

**Combining many stages**

| Method | Purpose |
|---|---|
| `allOf(CompletableFuture...)` | Returns a `CompletableFuture<Void>` that completes when **all** of the given futures complete. |
| `anyOf(CompletableFuture...)` | Returns a `CompletableFuture<Object>` that completes with the result of the **first** future to complete. |

**Error handling**

| Method | Purpose |
|---|---|
| `exceptionally(Function)` | Recover from a failure by turning the thrown exception into a fallback value. |
| `handle(BiFunction)` / `handleAsync(...)` | Inspect the outcome — value or exception — and produce a result either way. |
| `whenComplete(BiConsumer)` / `whenCompleteAsync(...)` | Observe the outcome (value and/or exception) without changing it; useful for logging and cleanup. |

**Reading the result**

| Method | Purpose |
|---|---|
| `get()` / `get(t, unit)` | Block until the future completes, optionally with a timeout. Throws checked exceptions. |
| `join()` | Like `get()` but wraps checked exceptions in `CompletionException` — works inside lambdas and streams. |
| `getNow(default)` | Returns the result if already completed, or the supplied default otherwise. |
| `isDone()` / `isCancelled()` / `isCompletedExceptionally()` | Inspect the current state without blocking. |

**Manual completion and timeouts**

| Method | Purpose |
|---|---|
| `complete(value)` / `completeExceptionally(throwable)` | Manually transition the future to a completed state, releasing every waiting stage. |
| `cancel(mayInterruptIfRunning)` | Cancel the future, completing it exceptionally with `CancellationException`. |
| `obtrudeValue(v)` / `obtrudeException(t)` | Force a new outcome on an already-completed future. Use sparingly — breaks the usual immutability contract. |
| `orTimeout(t, unit)` (Java 9+) | Complete exceptionally with `TimeoutException` if the future has not finished within the deadline. |
| `completeOnTimeout(value, t, unit)` (Java 9+) | Complete with the given fallback value if the future has not finished within the deadline. |

📁 [src/algorithm.concepts/threads/advanced/CompletableFutureExample.java](../src/main/java/algorithm/concepts/threads/advanced/CompletableFutureExample.java)

##### 14. Coordination Primitives — `CountDownLatch`, `CyclicBarrier`, `Semaphore`, `Phaser`, `Exchanger` **(Java 5; `Phaser` Java 7)**

These primitives let groups of threads synchronize at specific moments —
when `N` events have happened, when everyone has reached the same point,
when a limited number of permits is available, when phased work needs to
advance together, or when two threads want to swap data — instead of
synchronizing on every shared field.

| Primitive | Purpose | Reusable? |
|---|---|---|
| **`CountDownLatch`** | A one-shot gate. A counter starts at `N`; each event calls `countDown()`, and any thread waiting on `await()` is released the moment the counter reaches zero. | No — once it has opened, it stays open. |
| **`CyclicBarrier`** | A meeting point for a fixed number of threads. Each calls `await()`; once all have arrived, they are released together — and the barrier resets for the next round. An optional barrier action runs once per cycle. | Yes — designed for repeated phases with a constant party count. |
| **`Semaphore`** | A bag of permits limiting concurrent access to a resource. A thread `acquire()`s a permit before using the resource and `release()`s it afterward; threads block when no permits are left. Supports an optional fair mode. | Yes — permits are reused indefinitely. |
| **`Phaser`** | A more flexible barrier: parties can register and deregister dynamically, threads call `arriveAndAwaitAdvance()` to move to the next phase, and an optional `onAdvance` hook can decide when to terminate. | Yes — supports an unlimited number of phases. |
| **`Exchanger<V>`** | A rendezvous point for **exactly two** threads. Each calls `exchange(value)`; both block until the other arrives, then they swap values and proceed. | Yes — can be used for repeated exchanges. |

```java
CountDownLatch latch = new CountDownLatch(3);
latch.countDown();
latch.await();

CyclicBarrier barrier = new CyclicBarrier(3);
barrier.await();

Semaphore permits = new Semaphore(2);
permits.acquire(); try { ... } finally { permits.release(); }
```

📁 [src/algorithm.concepts/threads/advanced/CountDownLatchExample.java](../src/main/java/algorithm/concepts/threads/advanced/CountDownLatchExample.java)
📁 [src/algorithm.concepts/threads/advanced/CyclicBarrierExample.java](../src/main/java/algorithm/concepts/threads/advanced/CyclicBarrierExample.java)
📁 [src/algorithm.concepts/threads/advanced/SemaphoreExample.java](../src/main/java/algorithm/concepts/threads/advanced/SemaphoreExample.java)
📁 [src/algorithm.concepts/threads/advanced/PhaserExample.java](../src/main/java/algorithm/concepts/threads/advanced/PhaserExample.java)
📁 [src/algorithm.concepts/threads/advanced/ExchangerExample.java](../src/main/java/algorithm/concepts/threads/advanced/ExchangerExample.java)

##### 15. Deadlock, Livelock, Starvation

**Deadlock** — a circular dependency between threads holding locks: thread
A waits for a lock held by thread B, while B waits for one held by A.
Neither can move, so both are frozen forever. The classic *Coffman
conditions* describe when deadlock becomes possible: **mutual exclusion**
(locks are exclusive), **hold-and-wait** (a thread holds one lock while
asking for another), **no preemption** (locks cannot be forcibly taken
back), and **circular wait** (a cycle exists in the wait-for graph).
Breaking any one of those four conditions prevents deadlock.

**Prevention:** acquire locks in a single, agreed-upon **global order**
across the whole program; use `tryLock(timeout)` so a thread can give up
and retry instead of waiting forever; and avoid holding more than one
lock at a time when you can.

**Livelock** — threads stay active and keep reacting to each other, but
their actions cancel out and no real progress happens. The classic
analogy: two people in a narrow hallway each step aside the same way at
the same time and end up dancing in place instead of passing.

**Starvation** — a thread is repeatedly skipped over when resources or
processor time are handed out, so it never gets to run. It often comes
from unfair locks that always hand the lock to whoever asked most
recently, or from higher-priority threads monopolizing the CPU. Counter
it with fair locks, bounded queues that throttle producers, and balanced
thread priorities.

##### 16. Code Challenges

| # | Challenge | Concepts | File |
|---|---|---|---|
| 1 | Print `ping`/`pong` strictly alternating from two threads | `synchronized`, `wait/notifyAll`, shared flag | [PingPongChallenge.java](../src/main/java/algorithm/concepts/threads/challenges/PingPongChallenge.java) |
| 2 | Thread-safe bank account with deposits and withdrawals | critical section, atomic check + update | [BankAccountChallenge.java](../src/main/java/algorithm/concepts/threads/challenges/BankAccountChallenge.java) |
| 3 | Build a deadlock, then fix it with consistent lock order | monitor locks, lock ordering | [DeadlockChallenge.java](../src/main/java/algorithm/concepts/threads/challenges/DeadlockChallenge.java) |

###### More to try yourself

- **Producer / Consumer with multiple producers and consumers** using
  `BlockingQueue` and a poison-pill protocol.
- **Parallel sum** of a large array using `ExecutorService` + `Future`,
  splitting into chunks.
- **Web crawler** that limits parallelism with a `Semaphore`.
- **Dining Philosophers** — five philosophers, five forks; avoid deadlock
  using lock ordering or a `Semaphore` of size 4.
- **Rate limiter** using a `Semaphore` and scheduled refills.
- **Print numbers 1..N in order** with N threads, each printing one number.

##### 🧠 Concurrency Cheat Sheet

```java
// 1) Create a thread
new Thread(() -> work()).start();

// 2) Wait for it
t.join();

// 3) Cancel cooperatively
t.interrupt();
while (!Thread.currentThread().isInterrupted()) { ... }

// 4) Protect shared mutable state
synchronized (lock) { ... }
// or
lock.lock(); try { ... } finally { lock.unlock(); }
// or use atomics / concurrent collections

// 5) Run many tasks
ExecutorService pool = Executors.newFixedThreadPool(4);
Future<T> f = pool.submit(callable);
pool.shutdown();

// 6) Async pipeline
CompletableFuture
    .supplyAsync(this::load)
    .thenApply(this::transform)
    .thenAccept(this::save)
    .exceptionally(this::recover);
```

###### Decision flowchart

```
need to share mutable state?
│
├─ no  → just use threads / executors. Done.
│
└─ yes → is the operation a single primitive update?
         │
         ├─ yes → use AtomicX
         │
         └─ no  → is it a known data structure (map/queue/list)?
                  │
                  ├─ yes → use a concurrent collection
                  │
                  └─ no  → use a lock (synchronized or ReentrantLock)
                           protect the smallest possible critical section
```

---

#### ⚠️ Exceptions

A focused, practical reference for Java's exception model: how throwing
and catching work, which types belong to which family, and which idioms
to reach for. Every section links to a runnable file under
`src/algorithm.concepts/oop/exceptions/...`.

##### 1. Concepts & Vocabulary (Exceptions)

| Term | Meaning |
|---|---|
| **Exception** | An object representing an event that disrupts the normal flow of a program. Throwing one transfers control to the nearest matching handler. |
| **Throw** | The act of creating an exception object and handing it to the runtime, which then searches the call stack for a handler. |
| **Catch (handler)** | A `catch` block that takes responsibility for an exception of a matching type, replacing the abrupt exit with normal execution. |
| **Propagation** | The runtime's upward search through the call stack for a handler. Each method whose body lacks a matching catch is exited abruptly. |
| **Stack frame** | One activation of a method on the call stack. The chain of frames at the moment an exception is thrown becomes its stack trace. |
| **Stack trace** | The list of stack frames captured when the exception was created — the standard tool for diagnosing where and how an error happened. |
| **Cause** | Another `Throwable` attached to an exception to explain *why* it was thrown. Used when wrapping a low-level failure in a higher-level one. |
| **Suppressed exception** | A secondary exception attached to a primary one, typically thrown by `close()` during a try-with-resources after the body already failed. |
| **Checked exception** | A subclass of `Exception` (but not `RuntimeException`) the compiler forces you to either catch or declare with `throws`. |
| **Unchecked exception** | A `RuntimeException` (or `Error`); no compile-time enforcement. Used for programming errors and broken preconditions. |
| **Error** | A `Throwable` subclass for serious VM-level problems (out of memory, stack overflow). Application code should not try to catch them. |
| **Recovery** | The process of handling an exception and restoring the program to a usable state. Not every exception is recoverable. |

Use exceptions for **exceptional** conditions — situations that are
expected to be rare and that the calling code may want to react to.
Don't use them for ordinary control flow: throwing and catching is
significantly more expensive than a regular branch.

##### 2. The `Throwable` hierarchy

Every object that can be thrown in Java is a subclass of `Throwable`.
Like every other class in Java, `Throwable` ultimately extends
`java.lang.Object` and (because exceptions need to travel through
network protocols, files, and the like) implements
`java.io.Serializable`. Below `Throwable` the hierarchy splits into
two arms — `Error` (for Java Virtual Machine-level problems your code
should not handle) and `Exception` (for application-level failures),
with `RuntimeException` carving out the unchecked subtree.

```
java.lang.Object
└── java.lang.Throwable                            implements java.io.Serializable
      ├── java.lang.Error                          — serious Java Virtual Machine problems; do NOT catch
      │     ├── java.lang.VirtualMachineError
      │     │     ├── java.lang.OutOfMemoryError
      │     │     ├── java.lang.StackOverflowError
      │     │     ├── java.lang.InternalError
      │     │     └── java.lang.UnknownError
      │     ├── java.lang.LinkageError
      │     │     ├── java.lang.NoClassDefFoundError
      │     │     ├── java.lang.ExceptionInInitializerError
      │     │     ├── java.lang.UnsatisfiedLinkError
      │     │     ├── java.lang.VerifyError
      │     │     └── java.lang.IncompatibleClassChangeError
      │     │           ├── java.lang.AbstractMethodError
      │     │           ├── java.lang.IllegalAccessError
      │     │           ├── java.lang.NoSuchFieldError
      │     │           └── java.lang.NoSuchMethodError
      │     ├── java.lang.AssertionError
      │     ├── java.lang.ThreadDeath                       (deprecated)
      │     ├── java.io.IOError
      │     └── java.lang.annotation.AnnotationFormatError
      │
      └── java.lang.Exception                      — application-level failures
            ├── (checked)                          — must be declared or caught
            │     ├── java.io.IOException
            │     │     ├── java.io.FileNotFoundException
            │     │     ├── java.io.EOFException
            │     │     ├── java.io.InterruptedIOException
            │     │     ├── java.io.UnsupportedEncodingException
            │     │     ├── java.io.NotSerializableException
            │     │     ├── java.io.ObjectStreamException
            │     │     │     ├── java.io.InvalidClassException
            │     │     │     ├── java.io.InvalidObjectException
            │     │     │     └── java.io.StreamCorruptedException
            │     │     ├── java.net.SocketException
            │     │     │     ├── java.net.BindException
            │     │     │     ├── java.net.ConnectException
            │     │     │     └── java.net.NoRouteToHostException
            │     │     ├── java.net.MalformedURLException
            │     │     ├── java.net.UnknownHostException
            │     │     └── java.nio.file.FileSystemException
            │     │           ├── java.nio.file.AccessDeniedException
            │     │           ├── java.nio.file.NoSuchFileException
            │     │           └── java.nio.file.FileAlreadyExistsException
            │     ├── java.sql.SQLException
            │     │     ├── java.sql.SQLTimeoutException
            │     │     ├── java.sql.SQLNonTransientException
            │     │     └── java.sql.SQLTransientException
            │     ├── java.lang.ClassNotFoundException
            │     ├── java.lang.InterruptedException
            │     ├── java.lang.ReflectiveOperationException
            │     │     ├── java.lang.NoSuchMethodException
            │     │     ├── java.lang.NoSuchFieldException
            │     │     ├── java.lang.IllegalAccessException
            │     │     ├── java.lang.InstantiationException
            │     │     └── java.lang.reflect.InvocationTargetException
            │     ├── java.lang.CloneNotSupportedException
            │     ├── java.text.ParseException
            │     ├── java.util.TimeoutException
            │     └── java.util.concurrent.ExecutionException
            │
            └── java.lang.RuntimeException         — unchecked
                  ├── java.lang.NullPointerException
                  ├── java.lang.IllegalArgumentException
                  │     ├── java.lang.NumberFormatException
                  │     └── java.lang.IllegalThreadStateException
                  ├── java.lang.IllegalStateException
                  ├── java.lang.IndexOutOfBoundsException
                  │     ├── java.lang.ArrayIndexOutOfBoundsException
                  │     └── java.lang.StringIndexOutOfBoundsException
                  ├── java.lang.ArithmeticException
                  ├── java.lang.ClassCastException
                  ├── java.lang.UnsupportedOperationException
                  ├── java.util.ConcurrentModificationException
                  ├── java.lang.SecurityException
                  ├── java.lang.ArrayStoreException
                  ├── java.lang.NegativeArraySizeException
                  ├── java.lang.EnumConstantNotPresentException
                  ├── java.lang.TypeNotPresentException
                  ├── java.util.NoSuchElementException
                  │     └── java.util.InputMismatchException
                  ├── java.util.MissingResourceException
                  ├── java.util.EmptyStackException
                  ├── java.util.regex.PatternSyntaxException
                  └── java.lang.reflect.UndeclaredThrowableException
```

The diagram lists fully qualified package names so you can see exactly
which library each exception ships with — for example `java.io` for
stream and file failures, `java.net` for sockets, `java.nio.file` for
the modern file-system application programming interface, `java.sql`
for database access, `java.util.concurrent` for the high-level
concurrency utilities, and `java.lang.reflect` for reflection.

`Error` represents conditions a normal program is not expected to handle.
`Exception` represents anything else, with the `RuntimeException` branch
reserved for **programming errors** the compiler does not force you to
declare.

📁 [src/algorithm.concepts/oop/exceptions/CheckedVsUncheckedExample.java](../src/main/java/algorithm/concepts/oop/exceptions/CheckedVsUncheckedExample.java)

##### 3. Core `Throwable` API

Every `Throwable` carries the metadata an exception handler needs to
diagnose, log, or wrap it. These methods are inherited by every
exception class in Java.

| Method | Purpose |
|---|---|
| `getMessage()` | Returns the human-readable message supplied at construction (`new IOException("file missing")`). May be `null`. |
| `getLocalizedMessage()` | Like `getMessage()`, but subclasses may override it to localize the text. |
| `getCause()` | Returns the underlying `Throwable` that triggered this one, or `null` if none was set. The basis of exception chaining. |
| `initCause(Throwable)` | Sets the cause once, when the cause was not passed to the constructor. Throws if the cause is already set. |
| `getStackTrace()` | Returns the captured stack frames as a `StackTraceElement[]`, suitable for programmatic inspection. |
| `setStackTrace(StackTraceElement[])` | Replaces the stack trace. Rarely used outside of frameworks that re-throw across boundaries. |
| `printStackTrace()` / `printStackTrace(PrintStream)` | Writes the exception class, message, stack trace, cause chain, and suppressed exceptions to standard error or the given stream. |
| `fillInStackTrace()` | Recaptures the stack trace at the call site. Called automatically by the constructor; can be overridden to skip capture for performance. |
| `addSuppressed(Throwable)` | Attaches a secondary exception to this one. Called automatically by try-with-resources. |
| `getSuppressed()` | Returns the array of suppressed exceptions attached during recovery. |

##### 4. `try` / `catch` / `finally`

A `try` block guards code that may throw. When an exception escapes the
`try`, the runtime walks the attached `catch` clauses top-to-bottom and
runs the first one whose declared type matches. If no handler matches,
the exception keeps propagating up the call stack.

| Block | Role | When it runs | How many allowed |
|---|---|---|---|
| `try` | Holds the code that may throw. | Always — its body is the entry point of the construct. | Exactly one per construct. |
| `catch (Type e)` | Handles an exception of the declared type (or a subtype). | Only when the `try` body throws an exception that matches the declared type. | Zero or more, ordered most-specific to most-general. |
| `finally` | Performs cleanup that must happen no matter what. | Always — after `try` and after any matching `catch`, even on thrown exceptions, unmatched exceptions, or `return`. | Zero or one per construct. |

A `try` must be followed by **at least one** `catch` or a `finally`
(or both). A `finally` block executes even on `return` — its statements
run before control actually leaves the method.

```java
try {
    risky();                       // code that may throw
} catch (IOException e) {
    log(e);                        // recover or report
} finally {
    cleanup();                     // always runs
}
```

**Caveats to remember:**

- A `return` inside `finally` overrides any `return` or thrown exception from the `try`/`catch` — almost always a bug.
- An exception thrown inside `finally` replaces (and hides) any exception thrown from the `try` block. Prefer try-with-resources, which preserves both via *suppressed* exceptions.
- If the code can avoid throwing, prefer that to catching: exceptions are not free.

📁 [src/algorithm.concepts/oop/exceptions/BasicTryCatch.java](../src/main/java/algorithm/concepts/oop/exceptions/BasicTryCatch.java)

##### 5. Multiple catches and multi-catch

Multiple `catch` clauses are tested top-down; the first one whose
declared type is a supertype of the thrown exception runs. You must
order them **most-specific to most-general** — listing a parent before
a child is a compile error (the child's catch becomes unreachable).

**Multi-catch** (Java 7+) lets you handle several unrelated types in one
clause when the recovery is identical. The variable is implicitly
`final` inside a multi-catch block — you cannot reassign `e`.

```java
try { ... }
catch (NullPointerException e)            { /* specific */ }
catch (IOException | SQLException e)      { /* multi-catch */ }
catch (RuntimeException e)                { /* general — keep last */ }
```

**More-precise rethrow** (Java 7+): if you `catch (Exception e)` but
the compiler can prove that only `IOException` and `SQLException` can
actually reach that catch, you may declare the enclosing method as
`throws IOException, SQLException` and rethrow `e` — without widening
the signature to `throws Exception`.

📁 [src/algorithm.concepts/oop/exceptions/MultipleCatchExample.java](../src/main/java/algorithm/concepts/oop/exceptions/MultipleCatchExample.java)

##### 6. `throw` vs `throws`

Two related keywords that are easy to confuse: `throw` is a *statement*
that raises an exception now; `throws` is a *clause* on a method header
that declares which checked exceptions the method might let escape.

| | `throw` | `throws` |
|---|---|---|
| Kind of construct | A *statement* that runs at execution time. | A *clause* on a method or constructor signature, evaluated by the compiler. |
| What it does | Raises an exception immediately, transferring control to the nearest matching handler. | Declares which checked exceptions the method or constructor may let escape to its caller. |
| Where it appears | Inside the method or constructor body. | In the method or constructor header, between the parameter list and the body. |
| Example | `throw new IllegalArgumentException("bad");` | `void load() throws IOException { ... }` |
| Operand / payload | A single `Throwable` instance. | A comma-separated list of one or more checked exception types. |

**Rules:**

- An **unchecked** exception (`RuntimeException` or `Error`) does NOT need to be declared with `throws`, though declaring it for documentation is allowed.
- A **checked** exception MUST be either caught or declared with `throws` — the *handle-or-declare* rule.
- When **overriding** a method, the override may throw the same checked exceptions or **narrower** ones (subclasses or fewer), never broader ones the caller did not expect.
- Constructors can also declare `throws`.

📁 [src/algorithm.concepts/oop/exceptions/ThrowsExample.java](../src/main/java/algorithm/concepts/oop/exceptions/ThrowsExample.java)

##### 7. Checked vs Unchecked

Java is one of the few mainstream languages that splits exceptions into
two categories at compile time. The distinction is purely about
compiler enforcement, not severity.

| | Checked (`Exception`, excluding `RuntimeException`) | Unchecked (`RuntimeException` and `Error`) |
|---|---|---|
| Base class | Direct or indirect subclass of `Exception` that is NOT a subclass of `RuntimeException`. | Subclass of `RuntimeException` (programming errors) or `Error` (Java Virtual Machine problems). |
| Compiler enforces handling? | Yes — must be caught with `catch` or declared with `throws`. | No — handling is optional; the compiler stays silent. |
| Use for | External, recoverable conditions the caller may reasonably react to (network failure, missing file, malformed parse input). | Programming errors and broken preconditions (null where forbidden, negative size, wrong state). |
| Examples | `IOException`, `SQLException`, `InterruptedException`. | `NullPointerException`, `IllegalArgumentException`, `IllegalStateException`. |
| Must appear in `throws` clause? | Yes, unless caught locally. | No, though declaring it is allowed for documentation. |
| If unhandled at compile time | Compile error — the file does not build. | Compiles cleanly — the failure surfaces only at run time. |
| If unhandled at run time | Propagates up the call stack and may terminate the thread. | Propagates up the call stack and may terminate the thread. |

**Special case — `InterruptedException`:** it is checked, and catching
it without re-asserting the interrupt clears the thread's interrupted
flag. Always either re-throw or call `Thread.currentThread().interrupt()`
in the handler so cancellation is not silently lost.

📁 [src/algorithm.concepts/oop/exceptions/CheckedVsUncheckedExample.java](../src/main/java/algorithm/concepts/oop/exceptions/CheckedVsUncheckedExample.java)

##### 8. Try-with-resources

Try-with-resources and the `AutoCloseable` interface were both introduced in **(Java 7)**. Any object implementing `AutoCloseable` (or its subinterface `Closeable`)
can be declared in the header of a `try` statement. Java guarantees
`close()` is called automatically at the end of the block — even when an
exception is thrown — so you cannot forget to release resources. *(Effectively-final resource variables in the header — `try (resource) {}` without re-declaring — are **(Java 9)**.)*

```java
try (BufferedReader r = new BufferedReader(new FileReader("f.txt"))) {
    return r.readLine();
}   // r.close() runs here automatically
```

**Key facts:**

- Multiple resources may be declared, separated by `;`. They are closed in **reverse** order of declaration — last opened, first closed.
- If the body throws **and** `close()` also throws, the body's exception is the primary one; the `close()` exception is attached as a **suppressed** exception, retrievable via `getSuppressed()`. With a manual `finally`, you would lose one of the two.
- (Java 9+) A variable that is already `final` or *effectively final* may be referenced directly in the resource header — you do not have to re-declare it inside the parentheses.
- `AutoCloseable.close()` may throw any `Exception`; `Closeable.close()` is restricted to `IOException`. Streams, channels, readers, writers, JDBC connections, locks, and most I/O types implement one of them.

📁 [src/algorithm.concepts/oop/exceptions/TryWithResourcesExample.java](../src/main/java/algorithm/concepts/oop/exceptions/TryWithResourcesExample.java)

##### 9. Exception chaining (causes)

When you catch a low-level exception and throw a higher-level one,
**preserve the original** as the cause. The chain travels with the
exception so the eventual handler can diagnose the root.

```java
try {
    parseConfig(file);
} catch (IOException e) {
    throw new ConfigException("could not load config", e);   // e is the cause
}
```

Internally the chain is just a linked list of `Throwable` references
reachable through `getCause()`. The default `printStackTrace()` walks
the chain and prints each one with a `Caused by:` header. Use chaining
whenever you wrap an exception so a stack trace tells the full story.

If a constructor of an exception class does not accept a cause, set it
afterwards with `initCause(Throwable)` — but only once.

##### 10. Stack traces

A stack trace is a snapshot of the call stack taken when the exception
was constructed (specifically, by `fillInStackTrace()`, which the
constructor calls). Each entry is a `StackTraceElement` with the class
name, method name, file name, and line number of one frame.

| Method | Purpose |
|---|---|
| `printStackTrace()` | Writes the exception's class, message, stack trace, cause chain, and suppressed exceptions to standard error. |
| `printStackTrace(PrintStream)` / `printStackTrace(PrintWriter)` | Same, but written to a chosen stream — usually a logger. |
| `getStackTrace()` | Returns the frames as a `StackTraceElement[]` for programmatic inspection. |
| `setStackTrace(StackTraceElement[])` | Replaces the captured frames, used when re-throwing across boundaries. |
| `fillInStackTrace()` | Recaptures the trace at the call site. Override to return `this` if you want a "lightweight" exception that does not pay the capture cost (rare). |

**Reading a stack trace top-down:** the first line is the failing call
site; each `at` line below is one frame further up the call stack. A
`Caused by:` block beneath shows the chained cause's own stack trace.

##### 11. Custom Exceptions

Define your own exception class when no standard type fits, when you
want callers to be able to catch your domain failures specifically, or
when the failure carries extra structured data. Extend `Exception`
for **checked**, or `RuntimeException` for **unchecked**.

A well-behaved custom exception offers four standard constructors so
callers can supply a message, a cause, both, or neither — matching the
constructors of the supertypes:

```java
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException()                                { super(); }
    public InsufficientFundsException(String message)                  { super(message); }
    public InsufficientFundsException(Throwable cause)                 { super(cause); }
    public InsufficientFundsException(String message, Throwable cause) { super(message, cause); }
}
```

For richer reporting you can also add fields (account id, requested
amount, …) with their own getters; expose them through `getMessage()`
or dedicated accessors.

📁 [src/algorithm.concepts/oop/exceptions/InsufficientFundsException.java](../src/main/java/algorithm/concepts/oop/exceptions/InsufficientFundsException.java)
📁 [src/algorithm.concepts/oop/exceptions/CustomExceptionDemo.java](../src/main/java/algorithm/concepts/oop/exceptions/CustomExceptionDemo.java)

##### 12. Common standard exceptions

A reference of the exceptions you will encounter most often in everyday
Java code, with the situation that produces each one.

**Unchecked — programming errors and broken preconditions**

| Type | Parent | Typical cause |
|---|---|---|
| `NullPointerException` | `RuntimeException` | Dereferencing a `null` reference (method call, field access, array access). |
| `IllegalArgumentException` | `RuntimeException` | A method received an argument that does not satisfy its contract. |
| `NumberFormatException` | `IllegalArgumentException` | `Integer.parseInt`, `Double.parseDouble`, … given a string that is not a number. |
| `IllegalStateException` | `RuntimeException` | The object is not in a state where the call is valid (e.g. iterator after `remove`). |
| `IndexOutOfBoundsException` | `RuntimeException` | Index is negative or out of range. |
| `ArrayIndexOutOfBoundsException` | `IndexOutOfBoundsException` | Array index outside `0 .. length - 1`. |
| `StringIndexOutOfBoundsException` | `IndexOutOfBoundsException` | String index outside `0 .. length() - 1`. |
| `ArithmeticException` | `RuntimeException` | Integer division by zero, decimal overflow, and similar arithmetic faults. |
| `ClassCastException` | `RuntimeException` | A cast that does not match the actual runtime type of the object. |
| `UnsupportedOperationException` | `RuntimeException` | An interface method that is required to exist but is not supported by this algorithm.implementation (e.g. `List.of(...).add(x)`). |
| `ConcurrentModificationException` | `RuntimeException` | A collection was modified during iteration through a non-concurrent iterator. |
| `ArrayStoreException` | `RuntimeException` | Storing a reference of the wrong type into a covariant array. |
| `SecurityException` | `RuntimeException` | A security check (such as one performed by a `SecurityManager`) refused an operation. |

**Checked — recoverable conditions the caller should be aware of**

| Type | Parent | Typical cause |
|---|---|---|
| `IOException` | `Exception` | Any input/output failure: file missing, network reset, stream closed. |
| `FileNotFoundException` | `IOException` | Open call could not locate the file. |
| `EOFException` | `IOException` | End of stream reached unexpectedly during a read. |
| `SQLException` | `Exception` | A database call failed or returned an error. |
| `ClassNotFoundException` | `ReflectiveOperationException` | `Class.forName(name)` could not load the requested class. |
| `InterruptedException` | `Exception` | A blocking call was interrupted via `Thread.interrupt()`. Always re-assert the flag if you do not rethrow. |
| `CloneNotSupportedException` | `Exception` | `Object.clone()` called on a class that does not implement `Cloneable`. |
| `NoSuchMethodException` | `ReflectiveOperationException` | Reflective method lookup failed. |
| `NoSuchFieldException` | `ReflectiveOperationException` | Reflective field lookup failed. |
| `InvocationTargetException` | `ReflectiveOperationException` | A reflectively invoked method itself threw — the underlying exception is the cause. |

**Errors — do not catch in application code**

| Type | Parent | Typical cause |
|---|---|---|
| `OutOfMemoryError` | `VirtualMachineError` | The heap (or another memory pool) is exhausted. |
| `StackOverflowError` | `VirtualMachineError` | Recursion depth exceeded the thread stack size. |
| `NoClassDefFoundError` | `LinkageError` | The class loader saw the class at compile time but cannot find it now. |
| `ExceptionInInitializerError` | `LinkageError` | A static initializer threw an exception. |
| `AssertionError` | `Error` | A failed `assert` (with `-ea`) or a deliberate invariant failure. |

##### 13. Best Practices

- **Catch the most specific type** you can handle. Catching `Exception`
  or `Throwable` hides bugs.
- **Never swallow** an exception with an empty catch. At minimum, log
  it with its message and stack trace.
- **Don't use exceptions for control flow.** They are significantly
  slower than ordinary branches and they obscure intent.
- **Preserve the cause** when wrapping: `throw new MyException("...", e);`
  so the root failure survives in the chain.
- **Re-set the interrupt flag** when catching `InterruptedException`
  without re-throwing: `Thread.currentThread().interrupt();`
- **Prefer try-with-resources** over manual `finally` for any
  `AutoCloseable` — it is shorter and preserves suppressed exceptions.
- **Validate inputs early** with `IllegalArgumentException` /
  `IllegalStateException` instead of letting `NullPointerException`
  surface deeper in the call stack with no useful message.
- **Don't catch `Error`.** You usually cannot recover from
  `OutOfMemoryError` or `StackOverflowError`; let the JVM tear down
  cleanly.
- **Throw early, catch late.** Detect failures as close to their cause
  as possible; handle them at the layer that has enough context to react.
- **Document each `throws`** in Javadoc with `@throws` and a description
  of the precondition that produces it.

##### 🧠 Exceptions Cheat Sheet

```java
// Basic
try { risky(); }
catch (IOException e) { log(e); }
finally { cleanup(); }

// Multi-catch (same handling)
try { ... }
catch (IOException | SQLException e) { handle(e); }

// Try-with-resources (multiple resources, closed in reverse order)
try (var in  = Files.newInputStream(src);
     var out = Files.newOutputStream(dst)) {
    in.transferTo(out);
}

// Throw
if (x < 0) throw new IllegalArgumentException("x < 0");

// Throws (declare in signature)
void load() throws IOException { ... }

// Wrap & re-throw, preserving cause
try { parse(); }
catch (IOException e) { throw new ConfigException("bad config", e); }

// Re-assert interrupt when catching InterruptedException
try { Thread.sleep(100); }
catch (InterruptedException e) { Thread.currentThread().interrupt(); }

// Inspect chain and suppressed
for (Throwable c = ex; c != null; c = c.getCause()) log(c);
for (Throwable s : ex.getSuppressed()) log(s);
```

---

### 🟪 Kotlin

A modern statically-typed language for the Java Virtual Machine, created by JetBrains. It compiles to the same bytecode as Java, interoperates with Java in both directions, and is Google's preferred language for Android. Its design goals: **conciseness**, **null safety**, and **pragmatism** — keep what works in Java, fix the recurring pain points.

#### Why it matters for a Java developer
- **100% interop**: Call Java from Kotlin and Kotlin from Java in the same project; migrate file by file
- **Less ceremony**: No semicolons, type inference, no getters/setters/`equals`/`hashCode` boilerplate
- **Null safety in the type system**: The "billion-dollar mistake" (`NullPointerException`) becomes a compile-time concern

#### Variables and Types
```kotlin
val name = "Ada"        // immutable reference (like Java final) — prefer this
var age = 30            // mutable reference
val total: Long = 5     // explicit type when inference is not enough
```
- `val` = read-only (the reference cannot be reassigned), `var` = mutable
- Types are inferred; everything is an object (no primitives at the language level, the compiler optimizes to primitives underneath)

#### Null Safety
Nullability is part of the type. A normal type cannot hold `null`; a nullable type is marked with `?`.
```kotlin
var a: String = "x"     // cannot be null
var b: String? = null   // explicitly nullable
val len = b?.length     // safe call -> returns null instead of throwing
val safe = b ?: "empty" // Elvis operator -> default when null
val forced = b!!.length // asserts non-null -> throws if it is (avoid)
```

#### Functions
```kotlin
fun add(a: Int, b: Int = 0) = a + b        // default argument, expression body
add(b = 5, a = 1)                          // named arguments

// Extension function: add behavior to a type you do not own
fun String.shout() = this.uppercase() + "!"
"hi".shout()                               // -> "HI!"
```

#### Classes and Objects
```kotlin
data class User(val id: Long, val name: String)   // auto equals/hashCode/toString/copy
sealed interface Shape                              // restricted hierarchy (exhaustive when)
object Config                                       // a true singleton (no static keyword)
class Service { companion object { const val VERSION = "1.0" } }  // static-like members
```
- **data class**: the idiomatic Data Transfer Object — generates `equals`, `hashCode`, `toString`, `copy`
- **object**: a language-level singleton; **companion object**: holds members shared by all instances (Kotlin has no `static`)
- **sealed**: the compiler knows every subtype, enabling exhaustive `when` expressions

#### Functional Style and Scope Functions
```kotlin
val names = users.filter { it.age > 18 }.map { it.name }   // collection pipeline
val user = User(1, "Ada").apply { /* configure */ }        // apply: returns the receiver
val length = name?.let { it.length } ?: 0                   // let: run a block on non-null
```
- Lambdas use `{ }`; the single parameter is implicitly `it`
- **Scope functions** (`let`, `run`, `with`, `apply`, `also`) reduce temporary variables; `apply`/`also` return the object, `let`/`run`/`with` return the lambda result

#### Coroutines (concurrency)
Lightweight, cooperative units of work for asynchronous code — conceptually similar to Java virtual threads, but a library feature with structured concurrency.
```kotlin
suspend fun fetch(): Data { ... }          // a function that can suspend without blocking a thread
coroutineScope {
    val a = async { fetch() }              // run concurrently
    val b = async { fetch() }
    combine(a.await(), b.await())          // join results
}
```
- `suspend` functions release the thread while waiting instead of blocking it
- **Structured concurrency**: child coroutines are bound to a scope and cancelled together — no leaked work

#### Kotlin vs Java
| Aspect | Java | Kotlin |
|---|---|---|
| Null handling | Runtime `NullPointerException` | Nullability checked at compile time |
| Data carriers | `record` (Java 14+) or verbose class | `data class` |
| Singleton | `enum`/static holder idiom | `object` keyword |
| Static members | `static` | `companion object` |
| Extending types | Utility classes | Extension functions |
| Async | Threads / virtual threads / `CompletableFuture` | Coroutines (`suspend`) |
| Semicolons | Required | Optional |

---

### 🐍 Python

A high-level, interpreted, dynamically-typed language built for readability and developer speed. It is multi-paradigm (procedural, object-oriented, functional) and dominates scripting, automation, data science, machine learning, and increasingly backend web services. Where Java optimizes for large-team safety and performance, Python optimizes for expressiveness and time-to-result.

#### Why it matters for a Java developer
- **Dynamic typing**: Types are checked at runtime, not declared — far less code, but errors surface later
- **Batteries included**: A vast standard library and the largest third-party ecosystem (`pip`)
- **The default language of data and AI**: pandas, NumPy, PyTorch, and most machine-learning tooling are Python-first

#### Variables and Typing
```python
name = "Ada"            # no type declaration; the variable just binds a value
age = 30                # re-binding to another type is legal: age = "thirty"
total: int = 5          # optional type hint — documentation, checked by utils, not enforced at runtime
```
- **Dynamic typing**: a name is just a label pointing at an object
- **Duck typing**: "if it walks like a duck" — code depends on behavior (methods present), not on declared types
- **Type hints** (`def f(x: int) -> str:`) are optional and verified by external utils such as mypy, never by the interpreter

#### Core Data Structures
```python
nums   = [1, 2, 3]            # list   — ordered, mutable
point  = (10, 20)            # tuple  — ordered, immutable
user   = {"id": 1, "name": "Ada"}   # dict — key/value (like a HashMap)
unique = {1, 2, 3}           # set    — unique, unordered
squares = [n * n for n in nums if n > 1]   # list comprehension
```
- **Comprehensions** are the idiomatic replacement for map/filter loops — concise and fast

#### Functions
```python
def greet(name, greeting="Hello", *args, **kwargs):
    return f"{greeting}, {name}"          # f-string interpolation

greet("Ada", greeting="Hi")               # keyword arguments

square = lambda x: x * x                   # small anonymous function

@staticmethod                              # decorator: wraps/augments a function
def helper(): ...
```
- `*args` collects extra positional arguments, `**kwargs` collects extra keyword arguments
- **Decorators** (`@name`) wrap a function to add behavior — the mechanism behind framework routing, caching, authentication

#### Object-Oriented Python
```python
class User:
    def __init__(self, id, name):   # constructor (a "dunder" — double-underscore method)
        self.id = id
        self._name = name           # leading underscore = "private by convention" only

    def __repr__(self):             # like Java toString()
        return f"User({self.id})"
```
- **Dunder methods** (`__init__`, `__repr__`, `__eq__`, `__len__`) hook into language operators and built-ins
- Encapsulation is by convention (`_name`), not enforced — Python trusts the developer
- Supports multiple inheritance (resolved by a defined method-resolution order)

#### Functional Features and Generators
```python
total = sum(map(lambda x: x * 2, nums))    # map/filter exist, comprehensions usually preferred

def countdown(n):                          # generator: produces values lazily, one at a time
    while n > 0:
        yield n
        n -= 1
```
- **Generators** (`yield`) stream values without building the whole collection in memory — the basis of Python's lazy iteration

#### Concurrency — and the Global Interpreter Lock
| Tool | Use it for | Note |
|---|---|---|
| `threading` | Input/output-bound work (network, disk) | The **Global Interpreter Lock (GIL)** lets only one thread run Python bytecode at a time — no true parallel CPU |
| `multiprocessing` | CPU-bound work | Separate processes, each with its own interpreter — real parallelism, higher overhead |
| `asyncio` | Massive input/output concurrency | Single-threaded cooperative `async`/`await`, similar to JavaScript's event loop |

#### Ecosystem
- **pip** — package installer; **venv** — isolated per-project environments (the standard practice)
- **Web**: Django (batteries-included), Flask (minimal), FastAPI (modern, async, type-hint driven)
- **Data and AI**: pandas, NumPy, scikit-learn, PyTorch, TensorFlow

#### Python vs Java
| Aspect | Java | Python |
|---|---|---|
| Typing | Static, checked at compile time | Dynamic, checked at runtime (optional hints) |
| Execution | Compiled to bytecode, runs on the JVM | Interpreted (CPython bytecode at runtime) |
| Verbosity | More structure and boilerplate | Concise, indentation-based blocks |
| Performance | Faster (JIT-compiled, real threads) | Slower; CPU parallelism limited by the GIL |
| Sweet spot | Large systems, high throughput services | Scripting, data, machine learning, rapid prototypes |

---

## 🧩 Frameworks

Java backend frameworks provide the scaffolding every service needs — dependency injection, configuration, web endpoints, data access — so you write business logic instead of plumbing. **Spring** is the mature default; **Quarkus** and **Micronaut** are the newer cloud-native challengers built around one decisive idea: do at **build time** what Spring historically does at **runtime** (reflection, classpath scanning, proxy generation). That shift slashes startup time and memory, which matters when you run many small containers that scale to zero.

### 🆚 Framework Comparison
| Aspect | Spring (Boot) | Quarkus | Micronaut |
|---|---|---|---|
| Dependency injection | Runtime (reflection + proxies) | Build time (annotation processing) | Build time (annotation processing) |
| Startup time | Hundreds of milliseconds to seconds | Tens of milliseconds | Tens of milliseconds |
| Memory footprint | Higher | Low | Low |
| GraalVM native image | Supported (Spring AOT) | First-class, built around it | First-class, built around it |
| Reflection at runtime | Heavy | Minimal | Almost none |
| Ecosystem and maturity | Largest by far | Growing, Jakarta/MicroProfile based | Growing |
| Backer | VMware/Broadcom community | Red Hat | Object Computing |

*Takeaway for an interview: all three share the same mental model (inject beans, annotate endpoints). The differentiator is **when** the wiring happens. Spring resolves it as the application boots; Quarkus and Micronaut resolve it during compilation, trading a slightly longer build for dramatically faster, leaner runtime — ideal for Kubernetes and serverless.*

---

### 🌱 Spring

#### Spring Core

##### Core Concepts
- **Dependency Injection**: Allow to inject dependencies dynamically
- **Inversion of Control**: Passing the control of how to create object from the programmer to the framework

##### Core Container
- **Factory for managing beans**: Spring container manages object lifecycle
- **Application Context**: Main interface for Spring IoC container

##### Infrastructure
- **Aspect Oriented Programming**: Add functionality to objects declaratively. Logging, Security, Transactions
- **AOP**: Aspects
- **Instrumentation**: JMX (Java Management Extension) Remotely monitoring apps
- **Messaging**

##### Data Access Layer
Handles JDBC
- **JDBC**: Helper classes for managing DB
- **ORM**
- **Transactions**
- **OXM**
- **JMS**: Messaging service

##### Web Layer
MVC Framework
- **Servlet**
- **Web Socket**
- **Web**
- **Portlet**

##### Test Layer
Support for TDD. Mocking objects and out of container testing
- **Unit**
- **Integration**
- **Mock**

##### Beans
- A "Spring Bean" is simply a Java object
- When Java objects are created by the Spring Container, then Spring refers to them as "Spring Beans"
- Spring Beans are created from normal Java classes .... just like Java objects

##### Scopes
- **Singleton**: Only one instance per container (default scope)
- **Prototype**: A bean instance for each container request
- **Request**: Scoped to an http request
- **Session**: Scoped to an http session
- **Global session**: Scoped to a global session

##### Bean Lifecycle
Instantiation > Populate properties(injected, fileconfig) > BeanNameAware Context(aware to other resources) > BeanFactoryAware (aware to context) > ApplicationContextAware > PreInitialization > Init() > PostInitialization() > Ready > Container Shutdown > Destroy() > Terminated

##### Application Context Implementations
The Spring framework provides several implementations of the ApplicationContext interface: ClassPathXmlApplicationContext and FileSystemXmlApplicationContext for standalone applications, and WebApplicationContext for web applications

**WebApplicationContext**: Creates objects and handles the lifecycle. Extends the ApplicationContext

##### Injection Types
- **Constructor injection**: Through constructor. When the class cannot function without the dependent class. Immutability
- **Setter Injection**: Through setters. When the class can function without the dependent class. Changeable dependencies
- **Field Injection**: Through fields. Avoid: tight coupling, breaks immutability and testability

##### Why Constructor Injection Wins (be ready to justify it)
- **Immutability**: Dependencies can be declared final
- **Testability**: The class can be instantiated with plain `new` in a unit test, no reflection or container needed
- **Fail fast**: A missing dependency breaks at startup, not at first use
- Since Spring 4.3, `@Autowired` is optional when the class has a single constructor

##### Circular Dependencies
- The situation: bean A needs B, and bean B needs A
- Field/setter injection hides the cycle (Spring resolves it with early references); constructor injection surfaces it immediately at startup — which is a feature, not a bug
- The right fix: redesign — extract the shared logic into a third bean — rather than patching with `@Lazy`

#### 🚀 Spring Boot

##### Annotations

###### Component Annotations
- **@Component**: Generic stereotype for any Spring managed component, indicates a bean is created
- **@Repository**: Stereotype for persistence layer, Provides the data, database interaction, mapping. Additionally translates persistence exceptions into Spring's unified DataAccessException hierarchy
- **@Service**: Stereotype for service layer, Business logic, data manipulation, starts transactions
- **@Controller**: Stereotype for presentation layer (spring mvc), Process requests, builds response
- **@RestController** (@Controller & @ResponseBody): Stereotype for REST controller

*Annotations should be placed on the algorithm.implementation, not the interface maintain decoupling*

###### Configuration Annotations
- **@Configuration**: Declares that the class contains @Bean methods to be processed by the Spring container
- **@ComponentScan**: Configures which packages to scan for classes
- **@EnableAutoConfiguration**: Autoconfigures beans based on the classpath
- **@SpringBootApplication** (@SpringBootConfiguration, @EnableAutoConfiguration, @ComponentScan): Stereotype marking a class for bootstrapping and setting the @ComponentScan from that class level down

###### Web Annotations
- **@RequestMapping**: Indicates the mapping of the request to a path
- **@GetMapping, @PostMapping**, etc: Mark controller to respond to the http method
- **@RestController**(@Controller && @ResponseBody): Marks as a controller that returns data
- **@PathVariable**: Maps a path var to a param in spring
- **@RequestParam**: Maps a query param to a java param
- **@PathParam**: Maps a path param to a param in jaxrs
- **@RequestBody**: Deserializes HttpRequest (JSON) to an object
- **@ResponseBody**: Serializes the object and sends it as a response (JSON)
- **@Value**: For injecting values from the properties/yml file

###### Injection & Disambiguation Annotations
- **@Autowired**: Injects by type, then narrows by name; optional on a single constructor since Spring 4.3
- **@Qualifier("name")**: Selects one bean among several candidates of the same type, by name
- **@Primary**: Marks the default candidate among several beans of the same type
- **@Bean vs @Component**: `@Component` annotates a class you own (detected by component scanning); `@Bean` annotates a method inside a `@Configuration` class, for objects you do not own (third-party classes)

###### Configuration Binding
- **@Value("${property}")**: Injects a single property value
- **@ConfigurationProperties(prefix = "app")**: Binds a whole property prefix to a typed class — preferred over many @Value (validation, completion metadata, refactorable)
- **@Profile("dev")**: The bean is only created when that profile is active

###### Exception Handling Annotations
- **@ControllerAdvice / @RestControllerAdvice**: Global, cross-controller exception handling component
- **@ExceptionHandler(MyException.class)**: Method that converts one exception type into a clean HTTP error response — know how to build a consistent error envelope with these two

###### Transactional
- **@EnableTransactionManagement**: Use in a @Configuration class to enable transactional support
- **@Transactional is proxy based**: Spring wraps the bean in a proxy that opens, commits or rolls back the transaction around the method call
  - **Self-invocation gotcha (classic question)**: A call from one method to another @Transactional method of the *same class* bypasses the proxy — no transaction is started
  - **Rollback rules**: Rolls back on unchecked exceptions by default; checked exceptions commit unless `rollbackFor` says otherwise
  - **Propagation levels**: REQUIRED (default: join the current transaction or create one), REQUIRES_NEW (suspend the current one, open a fresh one), NESTED (savepoint inside the current one)
  - **readOnly = true**: Optimization hint for read paths (no dirty checking, possible routing to read replicas)

###### Request/Response Entities
- **RequestEntity**
- **ResponseEntity**

###### Run on Start
- **CommandLineRunner**: Receives argument
- **ApplicationRunner**

##### How Auto-Configuration Actually Works (senior question)
1. `@EnableAutoConfiguration` loads the candidate configuration classes listed in `META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports` (formerly `spring.factories`)
2. Each candidate is guarded by conditions: **@ConditionalOnClass** (a library is on the classpath), **@ConditionalOnMissingBean** (you did not define your own bean), **@ConditionalOnProperty**, and the rest of the @Conditional family
3. **Starters** are simply curated dependency sets: they put the right classes on the classpath so the matching auto-configurations activate
4. To override: declare your own bean (it wins, thanks to @ConditionalOnMissingBean) or exclude the auto-configuration (`@SpringBootApplication(exclude = ...)`)

##### Testing Spring Applications
- **@SpringBootTest**: Loads the full application context — slow, reserve it for integration tests
- **@WebMvcTest(MyController.class)**: Controller slice only, using **MockMvc** to perform simulated HTTP requests
- **@DataJpaTest**: Repository slice only, with an embedded database and transactions rolled back after each test
- **@MockBean vs @Mock**: `@MockBean` replaces a bean inside the Spring context with a Mockito mock; plain `@Mock` knows nothing about Spring
- **Testcontainers**: Real PostgreSQL/Kafka running in Docker during integration tests — closer to production than embedded fakes, and a strong senior signal
- **Test pyramid**: Many unit tests, fewer integration tests, few end-to-end tests

#### 🌐 Spring MVC

##### Architecture
Spring MVC follows the **Front Controller** pattern: a single servlet receives every request and dispatches it. The request flow:
1. **Browser → DispatcherServlet**: All requests hit one entry point (the front controller)
2. **DispatcherServlet → Controller**: It consults handler mappings to find the controller method for the URL, then invokes it
3. **Controller → Model**: The method runs the business logic and returns data (the model) plus a logical view name
4. **ViewResolver → View**: The resolver turns the logical name into a concrete template, which renders the model
5. **View → Browser**: The rendered response (HTML, or JSON when using `@RestController`) is returned

*For REST APIs the View step is skipped: `@ResponseBody` / `@RestController` serializes the returned object straight to JSON via an HttpMessageConverter.*

##### Spring MVC Configuration
- Configure DispatcherServlet
- Setup URL mappings to the DispatcherServlet
- Setup ComponentScanning
- Configure conversion, formatting, validation
- Configure ViewResolver

##### Mapping Concepts
- **Servlet Mapping**: Which web container of the Java servlet should be invoked for a given URL. The Servlet container decides which Servlet it should forward the request to
- **Request Mapping**: Maps a Request to a controller method to invoke as a response to the request
- **View Resolver**: Locates the view to rendered as a response to a request (application.properties prefix + suffix)

##### Template Engine
- **Thymeleaf**: Replace JSP

#### ⚡ Spring WebFlux

##### Characteristics
- **Nonblocking API** (Servlet v3.1)
- **Asynchronous nature** (like callbacks) though messages
- **Publisher/Subscriber model** through a Subscription
- **Functional/Declarative style**
- **Functional programming**: Pure functions, Lambdas, Immutability
- **Concurrent connections** handles by few threads
- **Continuous stream of data** live connection(MediaType.TEXT_EVENT_STREAM_VALUE)

##### Reactive Streams
1. Subscriber > subscribe() > Publisher
2. Subscription is created
3. Publisher > onSubscribe(Subscription) > Subscriber
4. Subscriber > request() > Subscription
5. Publisher > onNext() > Subscriber
   - If no more elems: Publisher > onComplete() > Subscriber > Subscription cancelled
   - If error: Publisher > onError() > Subscriber > Subscription cancelled

**Properties**: ASYNC, NONBLOCKING, BACKPRESSURE

###### Interfaces
```java
// PUBLISHER
public interface Publisher<T> {
    public void subscribe(Subscriber<? super T> s);
}

// SUBSCRIBER
public interface Subscriber<T> {
    public void OnSubscribe(Subscription s);
    public void onNext(T t);
    public void onError(Throwable t);
    public void onComplete();
}

// SUBSCRIPTION
public interface Subscription<T> {
    public void request(long n); // backpressure
    public void cancel();
}

// PROCESSOR
```

#### Project Reactor (Reactive Library)
- **FLUX**: Publish [0... n] for Object or void
- **MONO**: Publish [0,1] for Lists
- Flux and Mono are implementations of the Publisher interface

#### ServerWebExchange
Reactive container
- **ServerHttpRequest**: Reactive request
- **ServerHttpResponse**: Reactive response

#### Functional Endpoints
@Controllers become Router and Handler Function
- **Handler function**: Take a ServerRequest, return a ServerResponse
- **Router Function**: Routes the request to the appropriate handler function

```java
// Router function
public Mono<HandlerFunction> myRouterFunction(ServerRequest request){}
RouterFunctions.route(RequestPredicate, HandlerFunction)

// Handler Function Interface
interface HandlerFunction<T extends ServerResponse>{
    Mono<T> handle(ServerRequest request)
}

// Handler Class
class <T>Handler{
    public Mono<ServerResponse> myHandlerFunction(ServerRequest request){
        Mono<T> t = request.bodyToMono(T.class); //or
        Flux<T> t = request.bodyToFlux(T.class);
        
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(t);
    }
}
```

##### RequestPredicate Class
```java
public abstract class RequestPredicate{
    static RequestPredicate accept(MediaType... mediaTypes) // tests if the request contains a particular accept header
    static RequestPredicate GET(String pattern) // checks if the request pattern matches against the request path
    static RequestPredicate method(HttpMethod method) // to test any request http method
    static RequestPredicate path(String pattern) // test against the given path pattern
}
```

##### Functional Endpoint Example
```java
RouterFunctions<ServerResponse> myRoute =
    RouterFunctions.route(
        RequestPredicates.path(/products), // test if the request was made against the path
        request->Response.ok().body(productFlux) // pass an algorithm.implementation of the handler function interface
    );

// or

RouterFunctions<ServerResponse> myRoute =
    RouterFunctions.route()
    .RequestPredicates.GET("/product",handler::getProduct)
    .RequestPredicates.POST("/product",handler::saveProduct)
    .build();
```

#### 💻 Runnable Code Examples

Every core concept above is implemented as a self-contained, executable class (each with a `main` and prints) under [src/algorithm.concepts/spring/](../src/main/java/algorithm/concepts/spring/), following the same style as the algorithm.implementation `*Basics.java` guides. Dependencies are declared in [build.gradle](../build.gradle) (`spring-context`, `aspectjweaver`, `jakarta.annotation-api`). Run any class directly from the IDE, or from the command line with the Gradle wrapper:

```bash
# Run any example's main() by its fully-qualified name
./gradlew runClass -PmainClass=concept.spring.ioc.IocContainerExample

# Or just compile everything
./gradlew compileJava
```

##### 1. Inversion of Control & the container — [IocContainerExample.java](../src/main/java/algorithm/concepts/spring/ioc/IocContainerExample.java)
The container creates and wires the beans; `@Component` for classes you own, `@Bean` for classes you do not:
```java
@Component
static class OrderService {
    private final InventoryRepository inventory;            // never 'new'-ed by us
    OrderService(InventoryRepository inventory) {           // injected by the container
        this.inventory = inventory;
    }
}

@Bean   // "container, call this once and manage the result" — for third-party classes
ThirdPartyClient thirdPartyClient() { return new ThirdPartyClient(); }

try (var context = new AnnotationConfigApplicationContext(IocContainerExample.class)) {
    context.getBean(OrderService.class).placeOrder("book-123");   // already constructed AND wired
}
```

##### 2. The three injection types + disambiguation — [InjectionTypesExample.java](../src/main/java/algorithm/concepts/spring/di/InjectionTypesExample.java)
```java
@Component @Primary  static class EmailChannel implements MessageChannel { ... }  // default pick
@Component("sms")    static class SmsChannel   implements MessageChannel { ... }  // pick by name

// 1) CONSTRUCTOR (preferred): final field, testable, fail fast — @Autowired implicit since 4.3
NotificationService(MessageChannel defaultChannel) { this.defaultChannel = defaultChannel; }

// 2) SETTER: optional/changeable dependencies      3) FIELD: avoid (reflection-only, hidden)
@Autowired @Qualifier("sms") private MessageChannel fieldInjectedChannel;
```

##### 3. Bean lifecycle & scopes — [BeanLifecycleAndScopesExample.java](../src/main/java/algorithm/concepts/spring/lifecycle/BeanLifecycleAndScopesExample.java)
```java
@Component
static class SingletonBean {
    SingletonBean()             { ... }   // 1. instantiation
    @PostConstruct void init()  { ... }   // 2. after dependencies are injected
    @PreDestroy void cleanup()  { ... }   // 3. at container shutdown
}

@Component @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
static class PrototypeBean { ... }        // NEW instance per getBean(); @PreDestroy NEVER called
```
The print order at runtime proves the story: constructor → `@PostConstruct` → container ready → `@PreDestroy` on close — and the prototype's `@PreDestroy` never fires because the container forgets prototypes after handing them out.

##### 4. Proxies & the self-invocation gotcha — [AopProxyExample.java](../src/main/java/algorithm/concepts/spring/aop/AopProxyExample.java)
A custom `@Logged` annotation plays the role of `@Transactional`; a logging aspect plays the transaction interceptor:
```java
@Aspect @Component
static class LoggingAspect {
    @Around("@annotation(logged)")
    Object around(ProceedingJoinPoint joinPoint, Logged logged) throws Throwable {
        System.out.println("BEFORE");            // @Transactional would OPEN the transaction here
        Object result = joinPoint.proceed();     // the real method
        System.out.println("AFTER");             // COMMIT (or ROLLBACK on exception) here
        return result;
    }
}

bank.transfer("alice", "bob");       // EXTERNAL call  → enters the proxy → aspect RUNS
bank.transferTwice("alice", "bob");  // SELF-INVOCATION → 'this' is the raw object → aspect SILENT
```
Running it prints the injected type — `BankService$$SpringCGLIB$$0` — visible proof that the bean you receive is a generated proxy subclass, not your class.

##### 5. Application events (Observer pattern) — [ApplicationEventsExample.java](../src/main/java/algorithm/concepts/spring/events/ApplicationEventsExample.java)
```java
record OrderPlaced(String orderId) {}                  // since Spring 4.2: any plain object

publisher.publishEvent(new OrderPlaced(orderId));      // publisher knows NOTHING about listeners

@EventListener
void on(OrderPlaced event) { ... }                     // each new reaction = one new listener bean
```
Listeners run synchronously on the caller thread by default (`@Async` + `@EnableAsync` to detach). Same thinking as Kafka events between services — here inside one Java Virtual Machine.

##### 6. Strategy pattern via Map injection — [StrategyPatternExample.java](../src/main/java/algorithm/concepts/spring/strategy/StrategyPatternExample.java)
The interview favorite — Spring injects every algorithm.implementation keyed by bean name, eliminating switch statements:
```java
@Component("card")   static class CardPayment   implements PaymentStrategy { ... }
@Component("paypal") static class PaypalPayment implements PaymentStrategy { ... }

PaymentProcessor(Map<String, PaymentStrategy> strategies) {   // beanName -> bean, filled by Spring
    this.strategies = strategies;
}
// Adding "crypto" = ONE new @Component — zero existing code modified (Open/Closed principle)
```

##### 7. @Value & @Profile — [ValueAndProfilesExample.java](../src/main/java/algorithm/concepts/spring/config/ValueAndProfilesExample.java)
```java
@Value("${app.name}")       private String name;             // resolved from the Environment
@Value("${app.timeout:30}") private int timeoutSeconds;      // ':' introduces the default value

@Bean @Profile("dev")  DataSourceStub devDatabase()  { ... } // bean exists only when profile active
@Bean @Profile("prod") DataSourceStub prodDatabase() { ... }
```
In Spring Boot the `${...}` resolver is registered automatically; the example registers `PropertySourcesPlaceholderConfigurer` by hand so the mechanics stay visible.

---

### ⚡ Quarkus

A Kubernetes-native Java framework by Red Hat, marketed as "Supersonic Subatomic Java". It is built on proven standards (Jakarta EE and Eclipse MicroProfile) but re-engineered so that as much work as possible happens at **build time**, producing fast-starting, low-memory applications that compile cleanly to GraalVM native executables.

#### Core Idea: build-time processing
Spring discovers and wires beans while the application boots, using reflection and classpath scanning. Quarkus moves that work into the build: its extensions process annotations during compilation, pre-compute the wiring, and emit minimal runtime code. The result is faster startup, lower memory, and native-image friendliness (reflection is the enemy of GraalVM).

#### Dependency Injection (Jakarta CDI / ArC)
Quarkus uses Contexts and Dependency Injection (the Jakarta standard), implemented by its build-time engine **ArC**.
```java
@ApplicationScoped                 // one instance for the app (like a Spring singleton)
public class OrderService {

    @Inject                        // Jakarta @Inject, the CDI equivalent of @Autowired
    InventoryRepository inventory;

    public void place(String id) { inventory.reserve(id); }
}
```
| Concept | Spring | Quarkus (CDI) |
|---|---|---|
| Inject a dependency | `@Autowired` | `@Inject` |
| Singleton scope | `@Service` / `@Component` | `@ApplicationScoped` |
| Per-request scope | `@Scope("request")` | `@RequestScoped` |
| Provide a bean | `@Bean` | `@Produces` |
| REST endpoint | `@RestController` + `@GetMapping` | `@Path` + `@GET` (Jakarta REST) |
| Configuration value | `@Value` | `@ConfigProperty` (MicroProfile Config) |

#### Web endpoint example
```java
@Path("/orders")                   // Jakarta REST (formerly JAX-RS)
public class OrderResource {
    @GET
    @Path("/{id}")
    public Order get(@PathParam("id") String id) { ... }
}
```

#### Key Features
- **Live coding (dev mode)**: `quarkus dev` hot-reloads code on each request — no manual restart
- **Native compilation**: builds a standalone GraalVM executable that starts in tens of milliseconds and uses a fraction of the memory — ideal for serverless and scale-to-zero
- **Extensions**: curated integrations (Hibernate, Kafka, REST clients) designed for build-time processing and native images
- **MicroProfile**: standardized config, health checks, metrics, and fault tolerance out of the box

#### When to reach for it
Greenfield microservices on Kubernetes, functions that must start instantly, and teams comfortable with the Jakarta/MicroProfile standards rather than the Spring ecosystem.

---

### 🚀 Micronaut

A modern Java framework by Object Computing, designed from the start for microservices and serverless. Like Quarkus, it resolves dependency injection and aspect-oriented behavior at **compile time** through annotation processing — but its defining trait is the near-total elimination of runtime reflection, which keeps startup, memory, and native-image builds extremely efficient regardless of how large the application grows.

#### Core Idea: ahead-of-time, reflection-free
Spring's dependency injection cost scales with the number of beans, because wiring is computed at startup via reflection. Micronaut generates the injection logic as ordinary code during compilation, so startup time and memory stay roughly **constant** as the codebase grows, and no reflection metadata is needed at runtime.

#### Dependency Injection (Jakarta annotations)
```java
@Singleton                         // application-wide instance
public class OrderService {

    private final InventoryRepository inventory;

    public OrderService(InventoryRepository inventory) {   // constructor injection, like Spring
        this.inventory = inventory;
    }
}
```
| Concept | Spring | Micronaut |
|---|---|---|
| Inject a dependency | `@Autowired` | `@Inject` (or constructor) |
| Singleton scope | `@Service` / `@Component` | `@Singleton` |
| Provide a bean | `@Bean` in `@Configuration` | `@Factory` + `@Bean` |
| REST controller | `@RestController` | `@Controller` |
| Route mapping | `@GetMapping("/x")` | `@Get("/x")` |
| Configuration value | `@Value` | `@Value` / `@ConfigurationProperties` |

#### Web endpoint example
```java
@Controller("/orders")
public class OrderController {
    @Get("/{id}")
    public Order get(String id) { ... }
}
```

#### Key Features
- **Compile-time everything**: dependency injection, aspect-oriented proxies, and configuration are generated by the annotation processor — no runtime reflection
- **Fast and flat**: startup and memory do not degrade as the number of beans increases
- **Reactive and cloud-native**: a non-blocking HTTP stack and built-in support for service discovery, distributed configuration, and cloud providers
- **GraalVM native** support as a first-class target
- **Polyglot**: first-class Java, Kotlin, and Groovy support

#### Micronaut vs Quarkus
Both do build-time dependency injection and target fast, lean, native-ready services. Quarkus is anchored in the Jakarta EE / MicroProfile standards and the Red Hat ecosystem; Micronaut defines its own (Spring-like) application programming interface and pushes reflection-free compile-time processing the furthest. Choose by ecosystem fit and team familiarity rather than raw capability.

---

## 🗄️ Database

### CAP Theorem
- **Consistency**: Data is consistent across all the nodes
- **Availability**: Data is available at any time
- **Partition Tolerance**: System does not fail regardless any data drop or updated in any node

*Only two of these requirements can be achieved at a time. Not all three may be possible*

### 🗃️ SQL

#### Database Operations
```sql
CREATE DATABASE name -- creates database
CREATE TABLE name (id int, field1 varchar, field2 varchar) -- creates table
ALTER TABLE name ADD column_name -- adds a new column
ALTER TABLE name DROP column_name -- deletes a column
DROP TABLE name -- deletes a table
DROP DATABASE name -- drops a database
```

#### Query Operations
```sql
SELECT columns -- selects columns
FROM tables -- specifies table
WHERE conditions -- sets row conditions
INSERT INTO table (id, field1.. fieldn) VALUES (1 , val1...valn) -- insert values
UPDATE table SET fields = values WHERE column=value -- updates a row
DELETE FROM table WHERE field=value -- deletes rows from table
SELECT COUNT (*) FROM table -- counts the number of rows in a table
ORDER BY -- orders results
LIMIT -- limits number of results
```

#### Joins
- **INNER JOIN**: A inner join B on A.fk_b_id = B.id
    - join only in matching rows, all null matches are excluded
- **LEFT OUTER JOIN**: A left join B on A.fk_b_id = B.id
    - join containing all the elems from the left table, filling no matches from the right table with null values
- **RIGHT OUTER JOIN**: B right join A on A.fk_b_id = B.id
    - join containing all the elems from the right table, filling no matches from the left table with null values
- **FULL OUTER JOIN**: B full outer join A on A.fk_b_id = B.id
    - join all elems from both tables, filling no matches with nulls
- **SELF JOIN**: joins a table with itself
- **CROSS JOIN**: product between two tables, each row in the first table with each row in the second table
- **COALESCE**((query),0) AS name: replaces null values with 0

```sql
SELECT * FROM a INNER JOIN      b ON a.b_id = b.id; -- only rows that match on both sides
SELECT * FROM a LEFT  JOIN      b ON a.b_id = b.id; -- all of a, nulls where b has no match
SELECT * FROM a RIGHT JOIN      b ON a.b_id = b.id; -- all of b, nulls where a has no match
SELECT * FROM a FULL  OUTER JOIN b ON a.b_id = b.id; -- all rows from both, nulls where either is missing
```

#### Advanced Operations
- **UNIONS**: combines queries in the same resultset if the columns match the number and types
- **CREATE VIEW** name AS query: virtual table from query
- **CREATE INDEX** name ON table (fields): creates an index to accelerate search on those fields

#### Aggregation
- **GROUP BY**: Groups rows so aggregate functions apply per group (COUNT, SUM, AVG, MIN, MAX)
- **WHERE vs HAVING**: WHERE filters rows *before* aggregation; HAVING filters groups *after* aggregation

```sql
SELECT department, COUNT(*) AS headcount, AVG(salary) AS avg_salary
FROM employees
WHERE active = true        -- filters individual rows BEFORE grouping
GROUP BY department
HAVING COUNT(*) > 5;       -- filters whole groups AFTER aggregation
```

#### Window Functions (increasingly asked)
Aggregate-like computations that keep every row, instead of collapsing them like GROUP BY
```sql
SELECT name, department, salary,
       ROW_NUMBER() OVER (PARTITION BY department ORDER BY salary DESC) AS rn
FROM employees;
```
- **ROW_NUMBER()**: Unique sequence, no ties (1, 2, 3, 4)
- **RANK()**: Ties share the rank, the next rank is skipped (1, 2, 2, 4)
- **DENSE_RANK()**: Ties share the rank, no gap afterwards (1, 2, 2, 3)
- **LAG(col) / LEAD(col)**: Value taken from the previous / next row
- **Classic exercises**: second highest salary; top 3 salaries per department (rank inside a Common Table Expression, then filter on the rank)

#### Common Table Expressions (the WITH clause)
A named subquery that improves readability and allows reuse and recursion
```sql
WITH ranked AS (
    SELECT *, DENSE_RANK() OVER (PARTITION BY department ORDER BY salary DESC) AS rk
    FROM employees
)
SELECT * FROM ranked WHERE rk <= 3;
```

#### Relations
- **1 TO MANY**: By FK
- **MANY TO MANY**: Should be avoided and modeled as a joining table

#### Normalization (in plain words)
- **First Normal Form (1NF)**: Atomic values only — no lists or repeating groups inside a column
- **Second Normal Form (2NF)**: 1NF + every non-key column depends on the *whole* primary key (no partial dependency on part of a composite key)
- **Third Normal Form (3NF)**: 2NF + no non-key column depends on another non-key column (no transitive dependency)
- **Deliberate denormalization**: Accepting duplication to avoid joins on read-heavy paths — a conscious trade-off, never an accident

#### Indexes In Depth
- **Structure**: B-tree — a balanced tree kept sorted; lookups and range scans in O(log n)
- **When they help**: Columns used in WHERE, in JOIN conditions and in ORDER BY
- **When they hurt**: Every INSERT, UPDATE or DELETE must also maintain each index — costly on write-heavy tables
- **Composite index — column order matters**: An index on (a, b) serves queries filtering on `a` or on `a AND b`, but not on `b` alone (leftmost prefix rule)
- **Covering index**: Contains every column the query needs, so the table itself is never touched
- **EXPLAIN / execution plan**: Shows whether the database uses an index or scans the whole table — be ready to tell the story of a slow query you actually diagnosed and fixed

#### Database Tuning Techniques
- **Indexing**: CREATE INDEX index_name ON table (column);
- **Views**
- **Partitioning**
- **Caching**
- **Denormalization**, duplication with load balancers
- **Separate write/read master/slave**

#### Concurrency
##### Locks
- **Exclusive locking (write lock)**: while one transaction is running with update/insert/delete statements, this lock prevents other transactions from accessing the same data until the first transaction finishes
- **Shared locking (read lock)**: While one transaction is running select, other transactions are prevented from update/insert/delete the same data until the read finishes. Other transactions can read the data.

#### ACID Properties
- **Atomicity**: A transaction should be executed as a single unit
- **Consistency**: Data should be consistent with the restrictions/rules
- **Isolation**: One operation should not affect the result of other transactions
- **Durability**: There's no data loss in case of failure

#### Isolation Levels and Their Anomalies
From most permissive to strictest — each level eliminates one more anomaly:

| Isolation level | Anomaly still possible | What the anomaly means |
|---|---|---|
| READ UNCOMMITTED | Dirty read | Reading data from a transaction that may still roll back |
| READ COMMITTED | Non-repeatable read | The same row read twice returns different values |
| REPEATABLE READ | Phantom read | The same query run twice returns newly inserted rows |
| SERIALIZABLE | None | Transactions behave as if executed one after the other |

#### Optimistic vs Pessimistic Locking
- **Optimistic** (a `@Version` column in Java Persistence API): No lock is taken; the update checks the version and fails if someone modified the row meanwhile. Best when conflicts are rare
- **Pessimistic** (`SELECT ... FOR UPDATE`): The row is locked while being worked on; other transactions wait. Best when conflicts are frequent

#### Deadlocks
- **How they happen**: Transaction A locks row 1 then wants row 2; transaction B locks row 2 then wants row 1 — a circular wait
- **How the database reacts**: It detects the cycle and kills one transaction (the victim) so the other can proceed
- **How to prevent them**: Always acquire locks in the same global order; keep transactions short

### 🔗 ORM

#### Definitions
- **ORM**: Object Relational Mapping
- **JPA**: Java Persistence API
- **JDBC**: Java Database Connectivity and provides a set of Java API for accessing the relational databases from Java

#### JPA vs Hibernate
- **JPA**: Specification
    - EntityManagerFactory
- **Hibernate**: Implementation
    - SessionFactory

### 📊 Spring Data JPA

#### Annotations
```java
@Entity
@Table(name="table_name")
@Id
@Column(name="column_name")
@GeneratedValue
@OneToOne
@OneToMany
@ManyToOne
@ManyToMany // (requires a join table)
@JoinColumn(name="id") // (mappedBy="id")
@Enumerated
```

#### Constants
- **GenerationType**(strategy = TABLE,AUTO,IDENTITY,SEQUENCE)
- **FetchType**(fetch = EAGER,LAZY)
- **CascadeType**(ALL,PERSIST,MERGE,REMOVE,DETACH,LOCK,REFRESH,REPLICATE,SAVE_UPDATE)
- **EnumType**(ORDINAL,STRING)

#### Repository
- **CrudRepository<T,ID>**: Basic create/read/update/delete operations
- **JpaRepository<T,ID>**: Adds Java Persistence API specifics (flush, batch deletes, pagination)
- **Derived query methods**: `findByStatusAndCreatedAfter(...)` — Spring generates the query from the method name
- **@Query**: Explicit Java Persistence Query Language (JPQL) or native SQL, when the method name is not expressive enough

#### The N+1 Problem (guaranteed question)
- **What**: Loading N parent entities, then issuing one extra query per parent to fetch a lazy association — 1 + N queries instead of 1
- **How to detect it**: Enable SQL logging and count the queries actually executed
- **How to fix it**:
  - `JOIN FETCH` in a Java Persistence Query Language query
  - `@EntityGraph` on the repository method
  - `@BatchSize` / `default_batch_fetch_size` to load associations in chunks

#### Fetching Pitfalls
- **LazyInitializationException**: A lazy association is touched after the persistence session is closed — typically outside the transaction, in the controller or during JSON serialization. Fix: fetch what you need inside the transaction, and map entities to Data Transfer Objects before leaving the service layer
- Default fetch types: `@ManyToOne` and `@OneToOne` are eager; `@OneToMany` and `@ManyToMany` are lazy — prefer lazy everywhere and fetch explicitly where needed

#### Pagination
- Pass a **Pageable** (page number, size, sort) to the repository method
- **Page** runs an extra count query (total number of elements known); **Slice** only knows whether a next page exists (cheaper)

### 🐻 Hibernate

#### Hibernate Objects
- **Configuration**: Represents a configuration or properties file required by the Hibernate
- **SessionFactory**: Configures Hibernate for the application using the supplied configuration file and allows for a Session object to be instantiated
- **Session**: Used to get a physical connection with a database
- **Transaction**: Represents a unit of work with the database and most of the RDBMS supports transaction functionality
- **Query**: Uses SQL or Hibernate Query Language (HQL) string to retrieve data from the database and create objects
- **Criteria**: Used to create and execute object oriented criteria queries to retrieve objects

#### Configuration Steps
1. **Add Hibernate config files** (Define DB connection):
    - hibernate.cfg.xml for hibernate
    - persistence.xml: for jpa
    - Configure dialect:
        - org.hibernate.dialect.SQLServerDialect
        - org.hibernate.dialect.MySQLDialect
        - org.hibernate.dialect.OracleDialect
2. **Annotate java class**
3. **Develop code for db operations**:
   ```java
   EntityManagerFactory emf = Persistence.createEntityManagerFactory("unitname");
   EntityManager em = emf.createEntityManager();
   em.getTransaction().begin();
   em.persist(object);
   em.persist(object);
   emf.close();
   ```

#### persistence.xml Example
```xml
<persistenceunit name="hibernatecourse">
    <provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>
    <properties>
        <property name="javax.persistence.jdbc.driver" value="com.mysql.cj.jdbc.Driver"/>
        <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/airport"/>
        <property name="javax.persistence.jdbc.user" value="root"/>
        <property name="javax.persistence.jdbc.password" value="admin"/>
        <property name="hibernate.dialect" value="org.hibernate.dialect.MySQL57Dialect"/>
        <property name="hibernate.show_sql" value="true"/>
        <property name="hibernate.format_sql" value="true"/>
        <property name="hibernate.hbm2ddl.auto" value="create"/>
    </properties>
</persistenceunit>
```

#### Mapping Annotations
1. Map class to table
2. Map fields to columns

##### Core Annotations
- **@Entity**: Marks the class as a DB entity
- **@Table**(name="table_name"): Indicates the mapping table
- **@SecondaryTables** and **@SecondaryTables**: defines secondary tables and the logic for populating those tables
- **@Id**: Indicates the field is an id
- **@GeneratedValue**(strategy=GenerationType.IDENTITY): Defines strategy for the autogeneration id
- **@Column**(name="column_name"): Indicates the mapping column
- **@Access**(AccessType.Type): Method to access the persistent state of the entity:
    - AccessType.FIELD: Based Annotations on fields
    - AccessType.PROPERTY: Based Annotations on methods

##### Composite Keys
- **@Embeddable**: Marks a class as being embedded inside another class
- **@EmbeddedId**: Marks a field to be used for an @Embeddable class
- **@Transactional**: marks the methods as transactional and removes the need to call the methods beginTransaction, commit

*Hibernate needs empty constructors*

#### Relationships
- **Unidirectional**
- **Bidirectional**
- **@ManyToMany**
- **@ManyToOne**
- **@OneToMany**
- **@OneToOne**
- **Owner Side**: are mappedBy="owner" by the owning side
- **Owned Side**: The @JoinColumn(name="OWNER_ID") references the owner
- **@JoinTable**: Specifies the cross reference table for the mapping of the relationship
- **@JoinColumn**: Specifies the column for entity association with the referenced columnName as a param
- **@JoinColumns**: Defines the mapping for composite fk

#### SessionFactory
Reads the config, creates session objects, create only once in your app

#### Session
Wraps JDBC connection, used for saving retrieving objects from db, Retrieved from SessionFactory

#### Entity Lifecycle
- **Detach**: Not associated with a hibernate session
- **Merge**: Merging will reattach to the session
- **Persist**: Managed state. Next commit will save to db
- **Remove**: Managed entities will be removed. Next commit will delete them from db
- **Refresh**: sync to db

#### Cascade Types
Persist, Remove, Refresh, Detach, Merge, All

### 📄 NoSQL

#### Database Types
- **Key-Value** (Redis, DynamoDB): A giant hash map — store and fetch a value by its key, nothing more. Fastest model; ideal for caching, sessions, feature flags
- **Wide Column** (Cassandra, HBase): Rows keyed by a partition key, each holding a flexible set of columns; built for massive write throughput across a cluster
- **Graph** (Neo4j): Nodes and edges as first-class citizens; excels when the relationships *are* the query (social networks, recommendations, fraud rings)
- **Document** (MongoDB): Self-contained JSON-like documents; flexible schema, natural fit for aggregates loaded and saved as a whole

*Rule of thumb: choose the model by access pattern, not by hype — key-value for lookups, document for aggregates, graph for relationship traversal, wide-column for write-heavy scale.*

#### Database Mapping
- **DB** → DB
- **TABLES** → COLLECTIONS
- **ROW** → DOCUMENTS
- **COLUMN** → FIELD
- **INDEX** → INDEX
- **JOIN** → EMBEDDING & LINKING

#### 🍃 MongoDB

##### Characteristics
- Has C&P from CAP theorem
- Uses documents (JSON - BSON: EXTENDED JSON)

##### Features

###### Indexes
Support efficient execution of queries
**Types**:
- Single Field
- Multikey
- Text
- Geospatial
- Hashed
- Compound

###### Aggregation Pipeline
A framework for data aggregation modeled on the concept of data processing pipelines

###### Replica Sets
A group of mongodb processes that maintain the same data sets to provide redundancy and high availability

###### Sharding
A method to distribute data across multiple machines

#### Commands

##### Database Operations
- **use database**: select database
- **show databases**: shows available databases
- **show collections**: show collections
- **create collection**: db.createCollection("collection")

##### CRUD Operations

###### CREATE
```javascript
db.collection.insertOne({object})
insertMany([array])
```

###### READ
```javascript
db.collection.find({object})/findMany():
// filter: query: {attribute: {$operator: value}}, {"attribute.sub":value} , {$and: [{amount: {$lte: 11}},{"awards.wins":3}]}
// projection: select fields: db.collection.find({attribute: value}, {attr1: 1, attr2: 1, attr3: 0}) (true/1: include, false/0: exclude)
// sort({attr: value}): 1/-1: ASC/DESC
// limit(n): limits results
// readConcern("type"): specifies read Concern
```

###### UPDATE
```javascript
db.collection.updateOne(): // updates only the fields. Atomic on a single document
db.collection.updateOne(
    {field: {$op: "old value"}},{$set: {"field":"new value"},{upsert:true/false}}
)
db.collection.updateMany()
db.collection.replaceOne(): // replaces the object completely
db.collection.replaceOne({attr:{$op: value}},{new object definition})
// $set: updates/creates a field in a document
// upsert: true : a document is created if it doesn't exists, else, regular update (update on match, insert on no match)
```

###### DELETE
```javascript
db.collection.deleteOne(): db.collection.deleteOne({attr:value})
db.collection.deleteMany(): db.collection.deleteMany({attr:value})
db.collection.remove(): db.collection.remove({attr: value}, true) // (true for only one, no param, remove all). db.collection.remove({}) erases all the data from collection
```

#### Query Operators
- Comparison
- Logical
- Element
- Evaluation
- Geospatial
- Array
- Bitwise

#### Query Projection
Specifies the fields to return in the document that match the query (true/1: include, false/0: exclude)

#### Concern

##### Read Concern
Allows to control the consistency and isolation properties of the data read from replica sets and shards
- **Local**: reading from primary replica, may not exists in other replicas
- **Available**: reading from secondary replica, data may not be replicated to the majority of replicas
- **Majority**: default for all the fixed operators, data acknowledged by majority of replicas
- **Linearizable**: returns data that has the majority of successful writes previous to the read operation
- **Snapshot**: Multidocument transaction, reads from majority of committed data

##### Write Concern
Level of acknowledgement requested from mongodb for write operations. Level of consistency across replicas
- **w1**: Ack only from primary
- **w0**: No ack
- **w(n)**: Ack primary + (n-1) secondary: (All nodes-1 always including primary)
- **w: majority**
- **wtimeout**: the limit to prevent write operations from blocking indefinitely

#### ⚡ DynamoDB

- **DynamoDB**: Key-value database

---

## 🔒 Security

### Authentication vs Authorization
- **Authentication**: Verifying WHO you are (identity)
- **Authorization**: Verifying WHAT you can access (permissions)

### Authentication Methods

#### Session-Based Authentication
- **How**: Server creates session, stores session ID in cookie
- **Flow**: Login → Server creates session → Session ID in cookie → Client sends cookie → Server validates
- **Stateful**: Server must remember sessions
- **Pros**: Simple, server control, instant revocation
- **Cons**: Not scalable, CSRF vulnerable, poor multi-server support

#### Token-Based Authentication (JWT)
- **How**: Server creates signed token, client stores and sends it
- **Flow**: Login → Server creates JWT → Client stores token → Client sends in Authorization header → Server validates signature
- **JWT Structure**: `header.payload.signature`
  - Header: Algorithm and token type
  - Payload: Claims (user data, expiration)
  - Signature: Ensures token integrity
- **Stateless**: Server doesn't store tokens
- **Pros**: Scalable, cross-domain, mobile-friendly
- **Cons**: Can't revoke before expiration, larger size, XSS vulnerable

#### OAuth 2.0
- **What**: Authorization framework for delegated access
- **Use case**: "Login with Google/Facebook/GitHub"
- **Roles**:
  - Resource Owner: User
  - Client: Your application
  - Authorization Server: Google/Facebook
  - Resource Server: API with user data
- **Grant Types**:
  - Authorization Code (most secure, web apps)
  - Client Credentials (machine-to-machine)
  - Password (legacy, not recommended)
- **Tokens**:
  - Access Token: Short-lived, access resources
  - Refresh Token: Long-lived, get new access tokens

#### Single Sign-On (SSO)
- **What**: One login for multiple applications
- **Protocols**:
  - SAML 2.0: XML-based, enterprise standard
  - OpenID Connect (OIDC): Built on OAuth 2.0, modern
- **Flow**: Access App A → Redirect to IdP → Login once → IdP sends token → Access App B (no login)
- **Benefits**: Better UX, centralized management, reduced password fatigue

#### Multi-Factor Authentication (MFA/2FA)
- **Factors**:
  - Something you know: Password, PIN
  - Something you have: Phone, hardware token
  - Something you are: Fingerprint, face
- **Types**: SMS codes, TOTP (Authenticator apps), Hardware tokens (YubiKey), Biometrics

#### API Keys
- **What**: Simple token for API access
- **Use case**: Third-party API, service-to-service
- **Pros**: Simple, easy to implement
- **Cons**: No expiration, no user context, hard to rotate

#### Basic Authentication
- **What**: Username:password encoded in Base64
- **Header**: `Authorization: Basic dXNlcjpwYXNz`
- **Pros**: Simple, built into HTTP
- **Cons**: Not secure (easily decoded), must use HTTPS

#### Certificate-Based Authentication
- **What**: Uses digital certificates (X.509)
- **Use case**: Enterprise, high-security environments

### Authorization Methods

#### Role-Based Access Control (RBAC)
- **What**: Permissions based on roles
- **Structure**: User → Role → Permissions
- **Example**: Admin, User, Guest

```java
@PreAuthorize("hasRole('ADMIN')")
public void deleteUser() { }
```

#### Attribute-Based Access Control (ABAC)
- **What**: Permissions based on attributes
- **Attributes**: User attributes, resource attributes, environment
- **Example**: Allow if user.department == resource.department AND time < 5pm

#### Access Control Lists (ACL)
- **What**: Permissions per resource
- **Example**: File permissions (read, write, execute)

### Security Best Practices

#### Token Storage
- **Best**: HttpOnly cookies (prevents XSS)
- **Better**: sessionStorage
- **Never**: localStorage (XSS risk)

#### Token Refresh Strategy
- **Access Token**: Short-lived (15 min)
- **Refresh Token**: Long-lived (7 days), HttpOnly cookie
- **Flow**: Access token expires → Use refresh token → Get new access token

#### Password Security
- **Hash**: bcrypt, Argon2, PBKDF2 (never plain text)
- **Salt**: Random value added before hashing
- **Pepper**: Secret value added (stored separately)

#### Common Attacks & Prevention
- **CSRF**: Use CSRF tokens, SameSite cookies
- **XSS**: Sanitize input, Content Security Policy
- **SQL Injection**: Use prepared statements
- **Brute Force**: Rate limiting, account lockout
- **OWASP API Top 10 (Open Worldwide Application Security Project)**: the reference list of API vulnerabilities — injection, broken authentication, excessive data exposure, lack of rate limiting

### Spring Security
- Built as a **filter chain**: each request crosses an ordered list of servlet filters (authentication, authorization, Cross-Site Request Forgery protection...) before reaching the controller — a real-world Chain of Responsibility
- Configured by declaring a **`SecurityFilterChain` bean** (lambda style; the old `WebSecurityConfigurerAdapter` is deprecated)
- **Proof Key for Code Exchange (PKCE)**: Extension of the OAuth 2.0 authorization code flow for public clients (single-page and mobile applications) that cannot keep a client secret
- For service-to-service calls, use the **client credentials** flow

### Recommended Stack

#### Modern Web App
- **Authentication**: JWT (access) + Refresh tokens (HttpOnly cookie)
- **Authorization**: RBAC
- **Social login**: OAuth 2.0 / OIDC
- **MFA**: TOTP (Google Authenticator)

#### Enterprise
- **SSO**: SAML 2.0 or OIDC
- **Authorization**: RBAC or ABAC
- **MFA**: Required

### Legacy Security Concepts
- **Transport Layer Security(TLS)**: Encryption protocol for secure communication
- **SSL Certificates**: Digital certificates for HTTPS
- **Client Certificate**: Public key authentication
- **On behalf**: Microservice passes user credentials to other services
- **Encryption**: Use standard algorithm.implementation (AES, RSA)
- **Firewalls**: Network security
- **Pentesting**: Security testing
- **Automated Security Tests**: Verify API rejects unauthorized callers

---

## 🏢 System Design

### System Design Principles

#### High Availability
- **Redundancy**: Availability zones, Fallback, Data replication
- **Switching between servers**: DNS, Load balancers, Reverse proxy, API gateway, Service discovery
- **Protecting against client behavior**: Load shedding, Rate limiter, Shuffle sharding, Cell based architecture
- **Protecting against failures**: Timeouts, Circuit breaker, Bulkhead, Retries
- **Detecting failures**: Monitoring, Logging

#### Scalability
- **Vertical**: Adding compute power (Scale up)
- **Horizontal**: Adding servers/replicas (Scale out)
- **Elasticity**: Ability to acquire resources as needed and release them when not needed

#### Performance
- **Latency**: Time to get a response
- **Bandwidth**: Rate of data transfer across a given path
- **Throughput**: Rate at which something is processed

#### Durability
- **Backup**: Copy data periodically and store it elsewhere
- **RAID**: Redundant storing of information
- **Replication**: Copying the data to another machines
- **Checksum**: For preventing data corruption

#### Consistency
- **ACID**: Database constraints are not violated when transactions are executed
- **BASE**: NoSQL consistency model
- **CAP Theorem**: Consistency, Availability, Partition Tolerance

### Hardware

#### Compute Environment
- **Physical Server**: Complete control, expensive, hard to manage
- **Virtual Machines**: Cheaper, easier to maintain, hypervisor-based
- **Containers**: Lightweight, portable, container engine-based
- **Serverless**: Cloud provides all resources, event-driven

### Communication

#### Request/Response
- **Sync**: RequestResponse
- **Async**: Messaging

#### Async Messaging
- **Message Queues**: Only a single consumer gets the message
- **Publisher/Subscriber**: All subscribers get the message

#### Network Protocols
- **TCP**: Reliability over time, connection-oriented
- **UDP**: Time over reliability, connectionless
- **HTTP**: Request/Response protocol

### 🌍 API Design

#### API Styles — the main options in the industry
| Style | Contract & transport | Best fit |
|---|---|---|
| **REST** | Resources over HTTP with JSON; no enforced contract (OpenAPI optional) | Public APIs and general-purpose web services |
| **GraphQL** | Typed schema over HTTP with JSON; the client defines the query shape | Multiple frontends needing different views of the same data |
| **gRPC** | Protocol Buffers contract; binary over HTTP/2 | Internal service-to-service calls where latency and throughput matter |
| **WebSockets** | Persistent full-duplex connection; no imposed message format | Real-time bidirectional flows (chat, trading, collaborative editing) |
| **Webhooks** | The provider calls a URL registered by the consumer; HTTP with JSON | Event notifications pushed to third parties (payment confirmed) |
| **SOAP** | XML envelope with a Web Services Description Language (WSDL) contract; over HTTP | Legacy enterprise integrations (banking, insurance) |

*Choosing in one sentence: default to REST for public-facing APIs; GraphQL when many clients need different shapes of the same data; gRPC for internal latency-sensitive calls; WebSockets or Server-Sent Events when the server must push continuously; webhooks to notify external systems of events.*

#### REST — the default style

##### Fundamentals
- **Richardson Maturity Model**: Level 1 resources → Level 2 HTTP verbs and status codes → Level 3 hypermedia links in responses (Hypermedia As The Engine Of Application State, HATEOAS — know what it is, and admit almost nobody fully uses it)
- **Resource naming**: Nouns, plural, hierarchical (`/orders/{id}/items`), never verbs in the Uniform Resource Identifier (URI)
- **OpenAPI (formerly Swagger)**: Machine-readable description of the API — enables generated documentation, generated clients and contract tests; produced contract-first (write the specification, generate the code) or code-first (annotate the code, generate the specification)

##### HTTP Methods and Idempotency
*Idempotent = repeating the call produces the same final state as calling it once*

| Method | Purpose | Idempotent |
|---|---|---|
| GET | Read a resource | Yes |
| PUT | Replace a resource entirely | Yes |
| DELETE | Remove a resource | Yes |
| POST | Create a resource or trigger an action | No |
| PATCH | Modify a resource partially | Usually not |

##### Status Codes To Use Correctly
- **200 OK** (read or update succeeded), **201 Created** (plus a Location header), **204 No Content** (delete succeeded)
- **400 Bad Request** (malformed request) vs **422 Unprocessable Entity** (well formed but semantically invalid)
- **401 Unauthorized** = NOT authenticated; **403 Forbidden** = authenticated but NOT allowed — classic interview question
- **404 Not Found**, **409 Conflict** (state conflict, duplicate creation)
- **500 Internal Server Error**, **502 Bad Gateway**, **503 Service Unavailable**

##### Design Topics
- **Versioning strategies**: in the path (`/v1/orders` — simple and visible) vs in a header (clean paths — less discoverable) vs content negotiation (most "pure" — least used); know the trade-offs
- **Pagination**: offset-based (simple to implement — degrades on deep pages because the database still scans every skipped row) vs cursor-based (opaque pointer to the last seen element — scales regardless of depth)
- **Error responses**: One consistent envelope for the whole API; the standard is RFC 7807 "Problem Details" (fields: type, title, status, detail, instance)
- **Idempotency keys**: The client sends a unique key with a POST; the server stores the outcome and replays it on retry instead of executing twice — mandatory thinking for payments
- **Cross-Origin Resource Sharing (CORS)**: Browser mechanism that blocks calls from a different origin unless the server explicitly allows it (allowed origins, methods, headers) — configure it server-side, deliberately

#### GraphQL
- **One endpoint, client-shaped responses**: The client sends a typed query describing exactly the fields it wants; the server returns exactly that
- **Solves two REST pains**: **over-fetching** (receiving fields you do not need) and **under-fetching** (needing several round trips to assemble one screen)
- **The schema is the contract**: Strongly typed; three operation types — **queries** (read), **mutations** (write), **subscriptions** (server push)
- **The costs**: HTTP caching is harder (everything is a POST on a single endpoint), and naive resolvers reproduce the N+1 problem — batch the lookups with a DataLoader
- **Versioning**: Usually none — the schema evolves by adding fields and deprecating old ones
- In the Java ecosystem: Spring for GraphQL (built on graphql-java)

#### gRPC
- **Contract-first**: Messages and services are defined in Protocol Buffers (`.proto` files); client and server code is generated for each language
- **Binary over HTTP/2**: Compact payloads and multiplexed streams — significantly faster than JSON over HTTP/1.1
- **Four call types**: Unary (one request, one response), server streaming, client streaming, bidirectional streaming
- **The limits**: Not browser-friendly (requires a grpc-web proxy), payloads not human-readable — keep it for internal east-west traffic and expose REST at the edge
- Interview sound bite: "gRPC inside the platform, REST at the boundary"

#### Real-Time Push: WebSockets and Server-Sent Events
- **WebSockets**: Persistent connection, full duplex (both directions) — chat, collaborative editing, market data with client interaction
- **Server-Sent Events (SSE)**: Plain HTTP connection, one direction only (server → client), automatic reconnection built in — notifications, live feeds; simpler than WebSockets whenever the client never needs to push

#### Webhooks
- **The call is inverted**: The consumer registers a URL; the provider calls it when the event occurs ("don't call us, we'll call you")
- **Provider obligations**: Retry with backoff (the consumer may be down) and sign the payload (so the consumer can verify authenticity)
- **Consumer obligations**: Respond fast (acknowledge, then process asynchronously) and stay idempotent (deliveries can arrive duplicated)

### SOLID Principles (explain with examples, not definitions)
- **Single Responsibility**: A class should have only one responsibility — one reason to change
- **Open Closed**: Open for extension, closed for modifications — add a new Strategy bean instead of modifying a switch statement
- **Liskov Substitution**: You should be able to substitute classes when using inheritance — the classic violation is Square extending Rectangle (setting the width silently breaks the height invariant)
- **Interface Segregation**: Do not implement things that you don't need in your interfaces. Small granularity
- **Dependency Inversion**: Your code should depend on abstractions, not implementations

### Clean Code Habits (verbalize them during a code challenge)
- Meaningful names; small functions that do one thing
- No magic numbers — extract named constants
- Early returns instead of nested if blocks
- Fail fast: validate inputs at the top of the method
- Immutability by default

### Design Principles
- **DRY**: Don't repeat yourself (code)
- **Encapsulate what changes**
- **Favor composition over inheritance**
- **Program against an interface, not implementations**

### Design Patterns (each with its Spring incarnation)

> 💻 Code — Creational: [FactoryTest](../src/main/java/algorithm/concepts/designpatterns/creational/factory/FactoryTest.java) · [SingletonTest](../src/main/java/algorithm/concepts/designpatterns/creational/singleton/SingletonTest.java) · [BuilderTest](../src/main/java/algorithm/concepts/designpatterns/creational/builder/BuilderTest.java)
> 💻 Code — Behavioral: [StrategyDemo](../src/main/java/algorithm/concepts/designpatterns/behavioral/strategy/StrategyDemo.java) · [ObserverDemo](../src/main/java/algorithm/concepts/designpatterns/behavioral/observer/ObserverDemo.java) · [TemplateMethodDemo](../src/main/java/algorithm/concepts/designpatterns/behavioral/templatemethod/TemplateMethodDemo.java) · [ChainOfResponsibilityDemo](../src/main/java/algorithm/concepts/designpatterns/behavioral/chainofresponsibility/ChainOfResponsibilityDemo.java)
> 💻 Code — Structural: [AdapterTest](../src/main/java/algorithm/concepts/designpatterns/structural/adapter/AdapterTest.java) · [DecoratorDemo](../src/main/java/algorithm/concepts/designpatterns/structural/decorator/DecoratorDemo.java) · [ProxyDemo](../src/main/java/algorithm/concepts/designpatterns/structural/proxy/ProxyDemo.java)
> 💻 Code — Spring incarnations: [Strategy via Spring](../src/main/java/algorithm/concepts/spring/strategy/StrategyPatternExample.java) · [Observer via Spring events](../src/main/java/algorithm/concepts/spring/events/ApplicationEventsExample.java) · [Proxy via Spring aspects](../src/main/java/algorithm/concepts/spring/aop/AopProxyExample.java)

#### Creational
- **Factory**: Delegates the creation to another class, hides creation logic — Spring's `BeanFactory` is the canonical example
- **Singleton**: Returns a single instance of an object — Spring beans are singletons *per container*, not static Java Virtual Machine-wide singletons
- **Builder**: Makes a complex object immutable upon construction, avoids the telescoping constructor problem (constructors with ever-growing parameter lists) — Lombok `@Builder`

#### Behavioral
- **Strategy**: Use composition to delegate behaviors — in Spring, inject a `Map<String, PaymentStrategy>` of beans and pick by key; eliminates switch statements. **The most useful pattern to demonstrate in a code challenge**
- **Template Method**: A base class fixes the skeleton of an algorithm.implementation, subclasses fill in the steps — `JdbcTemplate` and `RestTemplate` (the naming is literal)
- **Observer**: Subscribers react to events published by a subject — Spring `ApplicationEvent` and `@EventListener`; the foundation of event-driven thinking
- **Chain of Responsibility**: A request crosses a chain of handlers, each deciding to process and/or pass it along — servlet filters, the Spring Security filter chain

#### Structural
- **Adapter**: Create new interfaces that act as a bridge between incompatible interfaces — wrap third-party clients behind your own interfaces
- **Proxy**: An object stands in front of another to add behavior transparently — exactly how `@Transactional` and Spring Aspect Oriented Programming work (Java Development Kit dynamic proxy for interfaces, CGLIB subclassing otherwise)
- **Decorator**: Adds behavior by wrapping, without inheritance — the Java input/output streams: `new BufferedInputStream(new FileInputStream(...))`

#### Architectural Patterns
- **Repository / Service Layer / Data Transfer Object (DTO)**: The entity is NOT the API contract — map entities to Data Transfer Objects at the service boundary, with a dedicated mapper
- **Hexagonal Architecture (Ports & Adapters)**: The business domain at the center, isolated from infrastructure behind interfaces (ports) implemented by adapters — high senior signal
- **Dependency Inversion in practice**: Depend on interfaces at module boundaries, wire the implementations at the edges

### 🌐 Distributed Design Patterns

Patterns for systems split across processes and networks. The monolith-versus-microservices framing, resilience patterns (circuit breaker, bulkhead, retry), and data-consistency patterns (saga, outbox, CQRS) below are all distributed design patterns; **Messaging** — and Kafka in particular — is the transport that makes the event-driven ones work.

#### Monolith vs Microservices — the honest trade-off
- **What microservices give**: Independent deployment, fault isolation, technology freedom per service, team autonomy
- **What microservices cost**: Distributed complexity, network latency, eventual consistency, heavy operational overhead
- **When NOT to use microservices** (saying this earns senior points): Small team, unclear domain boundaries, early-stage product — start with a well-modularized monolith and split once the boundaries stabilize

#### How to Split Services
- **Bounded contexts** (from Domain Driven Design): Split by business capability (orders, payments, inventory), never by technical layer
- **Database per service**: Each service owns its data; a shared database silently re-couples everything you tried to decouple

#### Communication Patterns
- **Synchronous**: REST for general use; gRPC (Remote Procedure Calls over HTTP/2 with Protocol Buffers) when low latency and high throughput matter
- **Asynchronous**: Events through Kafka — decouples services in time and in availability
- **Rule of thumb**: Queries → synchronous; state-change notifications → asynchronous events
- **API Gateway**: Single entry point handling routing, authentication and rate limiting (Spring Cloud Gateway)
- **Service discovery**: A directory of service instances, with client-side or server-side load balancing; in Kubernetes, native Domain Name System (DNS) discovery makes a Eureka-style registry unnecessary

#### 📨 Messaging

Messaging is the asynchronous backbone of distributed systems: instead of one service calling another and waiting, the producer hands a message to a **broker** and moves on, and the consumer processes it whenever it is ready. This decouples services in **time** (the consumer can be down when the message is sent), in **availability** (a slow consumer cannot slow the producer), and in **load** (the broker absorbs spikes).

##### Two delivery models
- **Message Queue (point-to-point)**: each message is delivered to exactly **one** consumer among those competing on the queue — used to distribute work
- **Publish/Subscribe (topic)**: each message is delivered to **every** subscriber — used to broadcast events

##### Choosing a broker
- **Apache Kafka**: a distributed, replayable commit log — enormous throughput, event streaming, and the ability to re-read history (covered in depth below)
- **RabbitMQ / ActiveMQ**: traditional smart brokers with flexible routing and per-message acknowledgement — simpler when you need work queues without replay
- **Cloud-managed**: AWS Simple Queue Service / Simple Notification Service, Azure Service Bus, Google Pub/Sub — the same models without operating the broker yourself

##### Why messaging belongs to distributed design patterns
Asynchronous messaging is what makes patterns like **Saga** (choreography through events), **Outbox** (reliable event publishing), and **event-driven architecture** possible. The patterns above describe *what* to coordinate; messaging is *how* the coordination travels.

##### Apache Kafka

###### Architecture (be able to draw it)
- **Broker**: One Kafka server; a cluster is a group of brokers
- **Topic**: Named stream of messages, split into partitions
- **Partition**: Append-only ordered log — THE unit of parallelism
- **Offset**: Position of a message inside a partition; each consumer tracks its own offsets
- **Consumer group**: Set of consumers sharing the work — each partition is assigned to exactly one consumer within the group
  - More consumers than partitions → the extra consumers sit idle
- **Replication**: Each partition has one leader (serves all reads and writes) and followers; the In-Sync Replicas (ISR) are the followers that are fully up to date

###### The Ordering Guarantee
- **Order is guaranteed only within one partition, never across the whole topic**
- The message **key** determines the partition (hash of the key): same key → same partition → strict order for that key (for example, all the events of one given order or account)

###### Delivery Semantics (guaranteed question)
| Semantic | How it is obtained | Trade-off |
|---|---|---|
| At-most-once | Commit offsets *before* processing | Messages can be lost, none duplicated |
| At-least-once | Commit offsets *after* processing (the default reality) | Messages can be duplicated, none lost |
| Exactly-once | Idempotent producer + Kafka transactions | Strongest guarantee, costs throughput and complexity |

- **The practical answer to duplicates: design idempotent consumers** — deduplicate by business key, upsert instead of insert

###### Producer Acknowledgements (the acks setting)
- **acks=0**: Fire and forget — fastest, messages can be lost silently
- **acks=1**: The partition leader confirms — middle ground, lost if the leader dies before replicating
- **acks=all**: All in-sync replicas confirm — slowest, no loss as long as one replica survives

###### Operational Knowledge
- **Consumer lag**: Distance between the last produced offset and the last consumed offset — THE health metric of a consumer; a growing lag means the consumer cannot keep up
- **Rebalancing**: Redistribution of partitions when a consumer joins, leaves or crashes; disruptive because consumption pauses — cooperative (incremental) rebalancing reduces the pause
- **Retention**: Messages are kept by time or by size, regardless of consumption — the log is replayable; **compacted topics** keep only the latest value per key (changelog semantics)
- **Dead letter topic**: Where a consumer parks poison messages (messages that always fail) instead of blocking the whole partition

###### Spring Kafka
- **@KafkaListener(topics = "...", groupId = "...")**: Declares a consumer method
- **ConcurrentKafkaListenerContainerFactory**: Configures concurrency, deserialization and error handling
- **Error handling**: `DefaultErrorHandler` with backoff, plus `DeadLetterPublishingRecoverer`; retry topics for non-blocking retries

###### Kafka vs Traditional Message Brokers (RabbitMQ)
| Aspect | Kafka | RabbitMQ |
|---|---|---|
| Model | Distributed replayable log (dumb broker, smart consumer) | Routing-centric queues (smart broker, dumb consumer) |
| Messages after consumption | Kept until retention expires (replay possible) | Deleted once acknowledged (no replay) |
| Strength | Massive throughput, event streaming and replay | Flexible routing, work queues and per-message guarantees |

- **When a simple queue beats Kafka**: low-volume task distribution with no replay requirement — a plain queue is operationally much simpler

#### Resilience Patterns (know the names AND the why)
- **Circuit Breaker** (Resilience4j): Three states — **closed** (calls pass, failures are counted) → **open** (threshold exceeded: calls fail fast without hitting the sick dependency) → **half-open** (a few trial calls; success closes the circuit again)
- **Retry**: With **exponential backoff plus jitter**; only safe if the retried operation is idempotent
- **Bulkhead**: Isolate thread pools and connection pools per dependency, so one slow dependency cannot drown the whole service
- **Timeout**: Always set explicit timeouts; library defaults (often infinite) are dangerous
- **Rate limiting**: Protect yourself from abusive or runaway clients
- **Fallback**: Return a degraded response (cached data, default value) rather than an error
- **Libraries**: Resilience4j (Java), Polly (.NET)

#### Data Management Across Services (where interviews get hard)
- **Why not distributed transactions**: Two-Phase Commit (2PC) blocks every participant on a central coordinator — it kills availability and autonomy, so microservices avoid it
- **Saga pattern**: A distributed business transaction expressed as a sequence of local transactions, each paired with a **compensating transaction** to undo it on failure
  - **Choreography**: Services react to each other's events — no central brain, but the flow is harder to follow
  - **Orchestration**: A central coordinator drives the steps — easier to follow, but one more component to run
- **Outbox pattern**: Solves the dual-write problem (a database and a message broker cannot be updated atomically): write the event into an `outbox` table *inside* the business transaction, then a relay publishes it — typically Change Data Capture (CDC) with Debezium
- **Command Query Responsibility Segregation (CQRS)**: Separate write model and read model — justified when reads and writes have very different shapes or loads; otherwise overkill
- **Eventual consistency**, explained to a stakeholder: "The order is confirmed immediately; the loyalty points appear a few seconds later — and the business is fine with that"

#### Observability — the three pillars
- **Logs**: Structured (JSON) and centralized
- **Metrics**: Micrometer → Prometheus → dashboards and alerting
- **Traces**: Micrometer Tracing / OpenTelemetry — the trace identifier is propagated across every service hop
- **Correlation identifier**: One identifier per request, present in every log line of every service the request crossed
- **Health checks**: Spring Boot Actuator exposes **liveness** (is the process alive — restart it if not) and **readiness** (can it serve traffic — remove it from load balancing if not)

#### Entry & Deployment Patterns
- **API Gateway / Backend For Frontend**: acts as a single entry point for the frontend calls
- **Shared Event Bus / Message Queues**: asynchronous communication between microservices through messages
- **Service Registry**: Keeps a directory of the services with addresses for discovery
- **Blue/Green deployment**: Swap the passive environment (running the new code) with the active one; instant rollback by swapping back

### Architecture Types

#### DB Centric Architecture
Has a database at the center of the application and its divided in the layers:
- **UI**
- **Business Logic**
- **Data Access**: DB

#### Domain Centric Architecture
The domain is at the center of the application and the layers are divided in:
- **Presentation**: UI
- **Application**: Abstractions for the use cases for of the app
- **Domain**: Abstractions for the problem/business domain
- **Persistence**: Interface with the storage/DB
- **Infrastructure**: Interface with the operative system and 3rd party dependencies
- **Crosscutting**: Aspects common to all projects of the app
- **Specification**: Acceptance tests verifying the functionality of the application

#### Functional Organization
Separate the layers by functionality

### Design Tips
- Understand the problem
- Ask questions about:
    - Features
    - Users
    - Scaling
    - Stack
- Design the most critical components first

### Requirements

#### Functional Requirements
Describe behavior: APIs, Operations supported

#### Non-Functional Requirements
Describe qualities: Scalable, Fast, Secure

---

## 🧪 Testing

> 💻 Code: [ExceptionTest (assertions & expected exceptions)](../src/main/java/algorithm/concepts/oop/exceptions/ExceptionTest.java)

The **test pyramid** sets the proportions: many fast unit tests at the base, fewer integration tests in the middle, a handful of slow end-to-end tests at the top.

#### ⚙️ Unit Testing
Tests one class in isolation; collaborators are replaced by mocks. Fast and deterministic.
- **JUnit**: The Java testing framework — runs tests, provides assertions and the lifecycle
- **Mockito**: Creates mock objects so you control what dependencies return and verify how they were called

##### JUnit 5 Annotations
```java
@BeforeEach // run before EACH test — fresh fixtures (JUnit 4 name was @Before)
@AfterEach  // run after EACH test — release resources (JUnit 4 name was @After)
@BeforeAll  // run ONCE before all tests in the class (static)
@Test       // marks a runnable test method
@Disabled   // temporarily skip a test
```

##### Mockito vs Spring test annotations
- **`@Mock`** (Mockito): a bare mock, no Spring context involved — for pure unit tests
- **`@MockBean`** (Spring Boot): replaces a bean inside the loaded Spring context with a mock — for slice/integration tests
- **`when(...).thenReturn(...)`** stubs behavior; **`verify(...)`** asserts an interaction happened

##### Common assertions
```java
assertEquals(expected, actual);
assertTrue(condition);
assertThrows(IllegalArgumentException.class, () -> service.call(badInput));
```

#### 🔗 Integration Testing
Tests several components together, often with real infrastructure.
- **`@SpringBootTest`**: boots the full context — heaviest, most realistic
- **Slices**: `@WebMvcTest` (controller layer + MockMvc), `@DataJpaTest` (repository layer + embedded database)
- **Testcontainers**: spins up a real database/Kafka in Docker for tests — production-like, a strong senior signal
- **Selenium**: drives a real browser for end-to-end web testing

#### 🚀 Performance Testing
- **JMeter**: load and stress testing — simulate many concurrent users, measure throughput and latency
- **curl / scripts**: quick command-line smoke checks of an endpoint

---

## Data Formats

> 💻 Code: [TestSerialization — Java binary serialization](../src/main/java/algorithm/implementation/files/TestSerialization.java)

How services serialize the data they exchange — the choice drives payload size, speed and schema safety:

- **JSON (JavaScript Object Notation)**: Human-readable text; the default for REST APIs. Verbose, and carries no schema by default (JSON Schema is optional)
- **Binary (raw)**: Compact and fast, but opaque; both sides must agree on the exact byte layout out of band
- **Avro**: Binary format whose schema travels with the data or lives in a schema registry; supports schema evolution — the standard pairing with Kafka
- **Protocol Buffers**: Binary format with a compiled `.proto` contract and generated classes; the serialization behind gRPC

---

# 🌐 Frontend

<a id="html5"></a>
## HTML5
- Audio/Video
- Web Workers/Service Workers (Threads js)
- Local Storage (global)
- Session Storage (tab)

---

<a id="css"></a>
## CSS
- Box model: margin (external), padding (internal)
- CSS selectors and combiners
- Specificity

---

<a id="javascript"></a>
## JavaScript
- **Scopes**
- **Callbacks**: A function that be passed as argument to be called later
- **Hoisting**: JS automatically moves all variable declarations at the top when compiling
- **Closures**
- **Promises**
- **Async functions**
- **Await operations/methods**

---

<a id="typescript"></a>
## TypeScript
- **Superset of JS**: All JS code is valid TS code
- **Transpiled to JS**: TS code is converted to JS code
- **Static typing**: Types are checked at compile time
- **Optional typing**: Types can be omitted and inferred
- **Modern JS features**: ES6+ features like classes, modules, arrow functions, destructuring, etc

```bash
npm install -g typescript
```

<a id="testing"></a>
### Testing
```javascript
// Jasmine
it("should be called", function() {})
beforeEach/beforeAll/afterEach/afterAll
expect().equals()
spyOn() // listener
toHaveBeenCalled()/toHaveBeenCalledWith(x,y)
```

<a id="features"></a>
#### Features
- **Type Annotations**: `let x: string = 'My string';`
- **Type Inference**
- **Union types**: `let somevalue: number | string`
- **Type assertions**: `let fixedstring: string = (value as number).toFixed(4)`
- **Optional parameters**: `message?: string`
- **Typed functions**: `function(): string{}`

<a id="react"></a>
### React
- **Component**: Building blocks of React applications
- **Props**: Properties to pass data from parent to child (unidirectional)
- **State**: Data that belongs to the component
- **Hooks**: functions that allow access to low-level react features
    - **useState**: used to manage the state
    - **useEffect**: used when component is mounted and when state changes
    - **useContext**: used to share data across all the component tree
    - **useRef**: creates a mutable object that keeps the reference between renders

---

# 🔧 DevOps

## Features
- **Automationm**
- **CI/CD**
- **Monitoring**
- **Collaboration**
- **Infrastructure as Code**

---

## SDLC
- **Requirement gathering**: Interact with the user to understand wht the software should do, features
- **Analysis**: Analyse the requirements and understand how to build the software, roadmap for development
- **Design**: Design the architecture of the software, components, interactions, technologies, ui
- **Coding**: Write the code
- **Testing**: Test the software functionality to ensure it meets the requirements and is free of bugs
- **Deployment**: Deploy the software to a production environment
- **Maintenance**: Ongoing support and maintenance of the software, improvements, bug fixes

---

## Docker

### Images
- **build**: docker image build
- **show**: docker image ls
- **pull**: docker image pull name:version
- **inspect**: docker image inspect name
- **delete**: docker image rm

### Containers
- **start**: docker container run
- **stop**: docker container stop id
- **delete**: docker container rm

### Dockerfile

```dockerfile
FROM alpine
RUN apk add update nodejs npm
COPY resources /src
WORKDIR /src
RUN npm install
EXPOSE 8080
ENTRYPOINT ["node","./app.js"]
```

### Docker for Java Applications
- **Image vs container**: The image is the immutable template; the container is a running instance of it
- **Layers and caching**: Each Dockerfile instruction creates a layer; order them from least to most frequently changing so rebuilds reuse the cache
- **Multi-stage builds**: Build with the full Java Development Kit in a first stage, ship only the Java Runtime Environment plus the application in the final stage — much smaller images
- **Spring Boot specifics**: Layered jars (dependencies cached in their own layer, separate from your code), and run as a non-root user

---

## Kubernetes

### Structure
Deployment contains > Pods contains > Containers

### Core Objects (from the smallest unit to the entry point)
- **Pod**: Smallest deployable unit; one or more containers sharing network and storage
- **Deployment**: Manages the replicas of a pod; handles rolling updates and rollbacks
- **Service**: Stable network identity in front of ephemeral pods — **ClusterIP** (internal only), **NodePort** (a port opened on every node), **LoadBalancer** (external, cloud-provisioned)
- **Ingress**: HTTP routing rules (host and path based) toward services

### Nodes
- **Master node (control plane)**: Takes decisions about the cluster
- **Worker node**: Carries on work

### Components
- **apiserver**: exposes the interface to communicate with the control plane
- **kubelet**: Main kubernetes agent on each node
- **kube-proxy**: Networking component

### Configuration & Spring Boot Integration
- **ConfigMap** (non-sensitive configuration) and **Secret** (sensitive values) are exposed to pods as environment variables or mounted files — Spring Boot reads them like any other property source
- **Probes wired to Actuator**:
  - **Liveness probe** ("is the process alive?" — Kubernetes restarts the pod on failure) → `/actuator/health/liveness`
  - **Readiness probe** ("can it serve traffic?" — Kubernetes stops routing to the pod on failure) → `/actuator/health/readiness`
- **Service discovery is native**: Each service gets a Domain Name System (DNS) name (`http://order-service`) — this is why a Eureka-style registry becomes unnecessary in Kubernetes

### Resources & the Java Virtual Machine
- **Requests** (what the scheduler guarantees) vs **limits** (the hard ceiling) for processor and memory
- Exceeding the memory limit → the container is **OOMKilled** (Out Of Memory)
- Size the Java heap relative to the container, not with a fixed value: `-XX:MaxRAMPercentage=75.0` instead of a hard-coded `-Xmx`
- **Horizontal Pod Autoscaler**: Adds or removes pod replicas based on observed load (processor, memory, custom metrics)

### Commands
```bash
kubectl get nodes / pods / services
kubectl describe pod mypod    # events and state — first reflex when debugging
kubectl logs mypod
kubectl exec -it mypod -- sh
kubectl apply -f pod.yml
kubectl get pods --watch
kubectl delete -f pod.yml
```

---

## Cloud

### AWS

#### Computing
- **EC2**: Elastic Compute Cloud with autoscaling
- **Lambda**: Serverless functions, virtual functions, autoscalable, reactive
- **Batch**: Timed jobs
- **Lightsail**: Easy user friendly computing + services for quick startup

#### Storage
- **S3**: Simple Storage Service for objects
- **EBS**: Elastic Block Store for EC2
- **EFS**: Elastic File System
- **DynamoDB**: NoDB key/value based
- **DocumentDB**: NoDB MongoDB document based
- **RDS**: Relational DB service for MySQL, SQLServer, Oracle, Postgress, etc.
- **Aurora**: AWS Proprietary SQL DB engine

#### Networking
- **VPC**: Virtual Private Cloud
- **CloudFront**: Content Delivery Network
- **API Gateway**: API management service
- **Route 53**: DNS service
- **ELB**: Elastic Load Balancer

#### Monitoring
- **CloudWatch**: Metrics and monitoring
- **Quicksight**: Dashboard for analytics

#### Events
- **EventBridge**:  Event/cron based event trigger service

#### Containers
- **ECR**: Container repository
- **ECS**: Provisioned ec2 instances
- **Fargate**: Serverless container service
- **EKS**: Elastic Kubernetes service, orchestrator, management

#### CI/CD
- **CodeCommit**: Source control service
- **CodeBuild**: Build service
- **CodeDeploy**: Deployment service
- **CodePipeline**: CI/CD service

### Azure

#### Mapping AWS Knowledge to Azure Equivalents
| Concept | AWS (what you know) | Azure (what they use) |
|---|---|---|
| Kubernetes | Elastic Kubernetes Service (EKS) | Azure Kubernetes Service (AKS) |
| Serverless containers | Elastic Container Service (ECS) / Fargate | Azure Container Apps |
| Functions | Lambda | Azure Functions |
| Object storage | Simple Storage Service (S3) | Blob Storage |
| Relational database | Relational Database Service (RDS) | Azure SQL Database / Database for PostgreSQL |
| Messaging | Simple Queue Service (SQS) / Simple Notification Service (SNS) | Service Bus (queues and topics) / Event Hubs (Kafka-like) |
| Secrets | Secrets Manager | Key Vault |
| Identity | Identity and Access Management (IAM) | Entra ID (formerly Azure Active Directory) + Managed Identities |
| Monitoring | CloudWatch | Azure Monitor + Application Insights |
| Continuous integration/delivery | CodePipeline / GitHub Actions | Azure DevOps Pipelines / GitHub Actions |

#### Talking Points for the Interview
- **Event Hubs exposes a Kafka-compatible endpoint**: existing Kafka producer and consumer code can often point at it with configuration changes only
- **Managed Identity**: No credentials in configuration files — Azure's answer to Identity and Access Management roles
- **Spring Cloud Azure**: Ready-made starters for Key Vault, Service Bus, Event Hubs, and the rest
- Honest positioning: "Deep AWS experience; cloud concept transfer — here is the mapping I have already studied"

---

## Infrastructure as Code

### Terraform
```hcl
provider "aws" {
  region = "us-east-1"
}

resource "aws_instance" "example" {
  ami           = "ami-0c55b159cbfafe1d0"
  instance_type = "t2.micro"
}
```

### Commands
```bash
terraform init
terraform validate
terraform plan
terraform apply
terraform destroy
```

---

## Git

### Concepts
- **Merging strategies**
- **Rebase vs Merge**
- **Cherry pick**

---

## Jenkins
- **Jenkinsfile**: Descriptor file for configuring the pipeline
- **Pipeline block**: the complete script
- **Agent**: the agent that's going to run the pipeline
- **Stages**: Stages of the pipeline
- **Steps**: Steps in the stage

---

# 🤖 AI

*Outline to be filled as the study progresses — the structure below marks the topics that matter for a backend developer integrating artificial intelligence into services.*

<a id="large-language-model-fundamentals"></a>
## Large Language Model Fundamentals
- **Tokens**: The unit models read and produce; pricing and limits are counted in tokens
- **Context window**: The maximum amount of tokens a model can consider at once
- **Temperature and sampling**: Controls randomness — low for deterministic answers, higher for creative output
- Pre-training vs fine-tuning vs in-context learning (examples inside the prompt)

<a id="prompt-engineering"></a>
## Prompt Engineering
- System prompt vs user prompt; role separation
- Few-shot examples; structured (JSON) outputs
- Why clear, explicit instructions beat clever tricks

<a id="retrieval-augmented-generation-rag"></a>
## Retrieval-Augmented Generation (RAG)
- **Embeddings**: Text converted to vectors capturing meaning
- **Vector databases**: Similarity search over embeddings (pgvector, Pinecone, and similar)
- Chunking strategies and their effect on retrieval quality
- The pipeline: ingest → embed → store → retrieve → inject into the prompt

<a id="agents--tool-use"></a>
## Agents & Tool Use
- The tool-use loop: the model requests a tool call, the application executes it, the result feeds back into the model
- **Model Context Protocol (MCP)**: Open standard for exposing utils and data sources to models
- Orchestration patterns: single agent vs planner plus workers

<a id="java-ecosystem"></a>
## Java Ecosystem
- **Spring AI**: Spring Boot starters for calling model providers, embeddings and vector stores
- **LangChain4j**: Java library for chains, memory, tool use and Retrieval-Augmented Generation

<a id="evaluation--safety"></a>
## Evaluation & Safety
- Hallucinations and grounding; when to force the model to cite retrieved sources
- Evaluation sets and regression testing for prompts
- Guardrails: input validation, output filtering, human approval for sensitive actions
