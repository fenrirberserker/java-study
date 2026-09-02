<style>
body { background:#1e1e1e; color:#ffffff; }
h1,h2,h3,h4,h5,h6,p,li,td,th,blockquote { color:#ffffff; }
p code, li code, td code, th code, h1 code, h2 code, h3 code, h4 code, h5 code, h6 code, blockquote code { color:#d8a35c; background:rgba(255,255,255,.08); padding:1px 5px; border-radius:4px; }
a { color:#6cb6ff; }
table, th, td { border-color:rgba(255,255,255,.25); }
</style>

<h1 id="study" style="font-size:42px;font-weight:800;margin:34px 0 14px;">📖 Study</h1>

> **Heading hierarchy:** Markdown renders the deeper heading levels at nearly the same size, so each heading is written as an `<h1>`…`<h6>` tag carrying an inline `font-size`. The level-by-level size step makes titles, subtitles and details unmistakable in IntelliJ's preview, with no setup — the size for each level lives right in its tag if you ever want to tune it.

---

<h2 id="-index" style="font-size:33px;font-weight:800;margin:30px 0 12px;">📑 Index</h2>

<div style="margin:2px 0;margin-left:0px">⚙️ <a href="#-backend">Backend</a></div>
<div style="margin:2px 0;margin-left:24px">📑 <a href="#-data-structures">Data Structures</a></div>
<div style="margin:2px 0;margin-left:48px">📇 <a href="#arraylist">ArrayList</a></div>
<div style="margin:2px 0;margin-left:48px">⛓️ <a href="#linkedlist">LinkedList</a></div>
<div style="margin:2px 0;margin-left:48px">🎟️ <a href="#queues">Queues</a></div>
<div style="margin:2px 0;margin-left:48px">🥞 <a href="#stacks">Stacks</a></div>
<div style="margin:2px 0;margin-left:48px">↕️ <a href="#deques">Deques</a></div>
<div style="margin:2px 0;margin-left:48px">🔺 <a href="#heap--priority-queue">Heap / Priority Queue</a></div>
<div style="margin:2px 0;margin-left:48px">#️⃣ <a href="#hash-table">Hash Table</a></div>
<div style="margin:2px 0;margin-left:48px">🌲 <a href="#binary-search-tree">Binary Search Tree</a></div>
<div style="margin:2px 0;margin-left:48px">🌳 <a href="#balanced-binary-search-trees-avl-and-red-black">Balanced Binary Search Trees (AVL and Red-Black)</a></div>
<div style="margin:2px 0;margin-left:48px">🌴 <a href="#trie-prefix-tree">Trie (Prefix Tree)</a></div>
<div style="margin:2px 0;margin-left:48px">🪢 <a href="#union-find-disjoint-set-union">Union-Find (Disjoint Set Union)</a></div>
<div style="margin:2px 0;margin-left:48px">📚 <a href="#java-collections-framework">Java Collections Framework</a></div>
<div style="margin:2px 0;margin-left:24px">📘 <a href="#-algorithms">Algorithms</a></div>
<div style="margin:2px 0;margin-left:48px">🔁 <a href="#recursion">Recursion</a></div>
<div style="margin:2px 0;margin-left:72px">🔁 <a href="#core-ingredients">Core ingredients</a></div>
<div style="margin:2px 0;margin-left:72px">🔁 <a href="#mental-model--the-call-stack">Mental model — the call stack</a></div>
<div style="margin:2px 0;margin-left:72px">🔁 <a href="#two-flavors">Two flavors</a></div>
<div style="margin:2px 0;margin-left:72px">🔁 <a href="#complexity">Complexity</a></div>
<div style="margin:2px 0;margin-left:72px">🔁 <a href="#recurrence-analysis--the-master-theorem-divide-and-conquer-shortcut">Recurrence analysis — the Master Theorem (divide-and-conquer shortcut)</a></div>
<div style="margin:2px 0;margin-left:72px">🔁 <a href="#when-to-use">When to use</a></div>
<div style="margin:2px 0;margin-left:72px">🔁 <a href="#common-pitfalls">Common pitfalls</a></div>
<div style="margin:2px 0;margin-left:48px">💰 <a href="#greedy">Greedy</a></div>
<div style="margin:2px 0;margin-left:72px">💰 <a href="#classic-correct-greedy-problems">Classic correct greedy problems</a></div>
<div style="margin:2px 0;margin-left:72px">💰 <a href="#classic-greedy-failures">Classic greedy <em>failures</em></a></div>
<div style="margin:2px 0;margin-left:72px">💰 <a href="#algorithm-template">Algorithm template</a></div>
<div style="margin:2px 0;margin-left:72px">💰 <a href="#how-to-prove-a-greedy-algorithm-correct--the-exchange-argument">How to prove a greedy algorithm correct — the exchange argument</a></div>
<div style="margin:2px 0;margin-left:48px">🔙 <a href="#backtracking">Backtracking</a></div>
<div style="margin:2px 0;margin-left:72px">🔙 <a href="#mental-model--dfs-through-a-decision-tree">Mental model — DFS through a decision tree</a></div>
<div style="margin:2px 0;margin-left:72px">🔙 <a href="#pruning-techniques-in-practice">Pruning techniques in practice</a></div>
<div style="margin:2px 0;margin-left:72px">🔙 <a href="#classic-problems">Classic problems</a></div>
<div style="margin:2px 0;margin-left:72px">🔙 <a href="#recursion-vs-backtracking">Recursion vs. Backtracking</a></div>
<div style="margin:2px 0;margin-left:48px">🕸️ <a href="#graph-algorithms">Graph Algorithms</a></div>
<div style="margin:2px 0;margin-left:72px">🕸️ <a href="#graph-representations">Graph representations</a></div>
<div style="margin:2px 0;margin-left:72px">🕸️ <a href="#graph-types">Graph types</a></div>
<div style="margin:2px 0;margin-left:72px">🕸️ <a href="#the-two-foundational-traversals">The two foundational traversals</a></div>
<div style="margin:2px 0;margin-left:72px">🕸️ <a href="#other-essential-algorithms-named-not-all-implemented-in-the-basics-file">Other essential algorithms (named, not all implemented in the basics file)</a></div>
<div style="margin:2px 0;margin-left:72px">🕸️ <a href="#named-graph-algorithms--mechanics">Named graph algorithms — mechanics</a></div>
<div style="margin:2px 0;margin-left:48px">🧩 <a href="#dynamic-programming">Dynamic Programming</a></div>
<div style="margin:2px 0;margin-left:72px">🧩 <a href="#when-to-use-dynamic-programming--the-two-required-properties">When to use Dynamic Programming — the two required properties</a></div>
<div style="margin:2px 0;margin-left:72px">🧩 <a href="#the-two-dynamic-programming-styles">The two Dynamic Programming styles</a></div>
<div style="margin:2px 0;margin-left:72px">🧩 <a href="#how-to-design-a-dynamic-programming-solution-5-step-recipe">How to design a Dynamic Programming solution (5-step recipe)</a></div>
<div style="margin:2px 0;margin-left:72px">🧩 <a href="#classic-problems-1">Classic problems</a></div>
<div style="margin:2px 0;margin-left:72px">🧩 <a href="#classic-recurrences-what-you-write-on-the-whiteboard">Classic recurrences (what you write on the whiteboard)</a></div>
<div style="margin:2px 0;margin-left:72px">🧩 <a href="#complexity-3">Complexity</a></div>
<div style="margin:2px 0;margin-left:72px">🧩 <a href="#recursion-vs-memoization-vs-tabulation">Recursion vs. Memoization vs. Tabulation</a></div>
<div style="margin:2px 0;margin-left:48px">🆚 <a href="#quick-comparison-table">Quick Comparison Table</a></div>
<div style="margin:2px 0;margin-left:72px">🆚 <a href="#how-to-run-any-example">How to run any example</a></div>
<div style="margin:2px 0;margin-left:48px">📎 <a href="#appendix--big-o--algorithm-categories-quick-reference">Appendix — Big O &amp; Algorithm Categories (Quick Reference)</a></div>
<div style="margin:2px 0;margin-left:72px">📎 <a href="#big-o-notation">Big O Notation</a></div>
<div style="margin:2px 0;margin-left:72px">📎 <a href="#algorithm-categories">Algorithm Categories</a></div>
<div style="margin:2px 0;margin-left:72px">📎 <a href="#sorting">Sorting</a></div>
<div style="margin:2px 0;margin-left:72px">📎 <a href="#search-iterate-to-find-a-pattern-element">Search: Iterate to find a pattern, element</a></div>
<div style="margin:2px 0;margin-left:24px">💻 <a href="#-programming-languages">Programming Languages</a></div>
<div style="margin:2px 0;margin-left:48px">☕ <a href="#java">Java</a></div>
<div style="margin:2px 0;margin-left:72px">🧠 <a href="#core">Core</a></div>
<div style="margin:2px 0;margin-left:72px">🧬 <a href="#oop">OOP</a></div>
<div style="margin:2px 0;margin-left:72px">💥 <a href="#errors">Errors</a></div>
<div style="margin:2px 0;margin-left:72px">📚 <a href="#collections">Collections</a></div>
<div style="margin:2px 0;margin-left:72px">🔌 <a href="#functional-interfaces-java-8">Functional Interfaces <strong>(Java 8)</strong></a></div>
<div style="margin:2px 0;margin-left:72px">🌊 <a href="#streams-java-8">Streams <strong>(Java 8)</strong></a></div>
<div style="margin:2px 0;margin-left:72px">❓ <a href="#optional-java-8">Optional <strong>(Java 8)</strong></a></div>
<div style="margin:2px 0;margin-left:72px">✨ <a href="#modern-java-921--shows-you-keep-current">Modern Java (9–21) — shows you keep current</a></div>
<div style="margin:2px 0;margin-left:72px">🔤 <a href="#generics-java-5">Generics <strong>(Java 5)</strong></a></div>
<div style="margin:2px 0;margin-left:72px">🔢 <a href="#enums-java-5">Enums <strong>(Java 5)</strong></a></div>
<div style="margin:2px 0;margin-left:72px">🏷️ <a href="#annotations-java-5">Annotations <strong>(Java 5)</strong></a></div>
<div style="margin:2px 0;margin-left:72px">🪞 <a href="#reflection">Reflection</a></div>
<div style="margin:2px 0;margin-left:72px">☕ <a href="#java-inputoutput-io-and-new-inputoutput-2-nio2">Java Input/Output (IO) and New Input/Output 2 (NIO.2)</a></div>
<div style="margin:2px 0;margin-left:72px">☕ <a href="#datetime-application-programming-interface-java-8">Date/Time Application Programming Interface <strong>(Java 8)</strong></a></div>
<div style="margin:2px 0;margin-left:72px">🧵 <a href="#concurrency">Concurrency</a></div>
<div style="margin:2px 0;margin-left:72px">⚠️ <a href="#exceptions">Exceptions</a></div>
<div style="margin:2px 0;margin-left:48px">🟪 <a href="#kotlin">Kotlin</a></div>
<div style="margin:2px 0;margin-left:72px">🟪 <a href="#why-it-matters-for-a-java-developer">Why it matters for a Java developer</a></div>
<div style="margin:2px 0;margin-left:72px">🟪 <a href="#variables-and-types">Variables and Types</a></div>
<div style="margin:2px 0;margin-left:72px">🟪 <a href="#null-safety">Null Safety</a></div>
<div style="margin:2px 0;margin-left:72px">🟪 <a href="#functions">Functions</a></div>
<div style="margin:2px 0;margin-left:72px">🟪 <a href="#classes-and-objects">Classes and Objects</a></div>
<div style="margin:2px 0;margin-left:72px">🟪 <a href="#functional-style-and-scope-functions">Functional Style and Scope Functions</a></div>
<div style="margin:2px 0;margin-left:72px">🟪 <a href="#coroutines-concurrency">Coroutines (concurrency)</a></div>
<div style="margin:2px 0;margin-left:72px">🟪 <a href="#kotlin-vs-java">Kotlin vs Java</a></div>
<div style="margin:2px 0;margin-left:48px">🐍 <a href="#python">Python</a></div>
<div style="margin:2px 0;margin-left:72px">🐍 <a href="#why-it-matters-for-a-java-developer-1">Why it matters for a Java developer</a></div>
<div style="margin:2px 0;margin-left:72px">🐍 <a href="#variables-and-typing">Variables and Typing</a></div>
<div style="margin:2px 0;margin-left:72px">🐍 <a href="#core-data-structures">Core Data Structures</a></div>
<div style="margin:2px 0;margin-left:72px">🐍 <a href="#functions-1">Functions</a></div>
<div style="margin:2px 0;margin-left:72px">🐍 <a href="#object-oriented-python">Object-Oriented Python</a></div>
<div style="margin:2px 0;margin-left:72px">🐍 <a href="#functional-features-and-generators">Functional Features and Generators</a></div>
<div style="margin:2px 0;margin-left:72px">🧵 <a href="#concurrency--and-the-global-interpreter-lock">Concurrency — and the Global Interpreter Lock</a></div>
<div style="margin:2px 0;margin-left:72px">🐍 <a href="#ecosystem">Ecosystem</a></div>
<div style="margin:2px 0;margin-left:72px">🐍 <a href="#python-vs-java">Python vs Java</a></div>
<div style="margin:2px 0;margin-left:24px">🧩 <a href="#-frameworks">Frameworks</a></div>
<div style="margin:2px 0;margin-left:48px">🆚 <a href="#framework-comparison">Framework Comparison</a></div>
<div style="margin:2px 0;margin-left:48px">🌱 <a href="#spring">Spring</a></div>
<div style="margin:2px 0;margin-left:72px">🧩 <a href="#spring-core">Spring Core</a></div>
<div style="margin:2px 0;margin-left:72px">🚀 <a href="#spring-boot">Spring Boot</a></div>
<div style="margin:2px 0;margin-left:72px">🌐 <a href="#spring-mvc">Spring MVC</a></div>
<div style="margin:2px 0;margin-left:72px">🌊 <a href="#spring-webflux">Spring WebFlux</a></div>
<div style="margin:2px 0;margin-left:72px">💻 <a href="#runnable-code-examples">Runnable Code Examples</a></div>
<div style="margin:2px 0;margin-left:48px">⚡ <a href="#quarkus">Quarkus</a></div>
<div style="margin:2px 0;margin-left:72px">⚡ <a href="#core-idea-build-time-processing">Core Idea: build-time processing</a></div>
<div style="margin:2px 0;margin-left:72px">⚡ <a href="#dependency-injection-jakarta-cdi--arc">Dependency Injection (Jakarta CDI / ArC)</a></div>
<div style="margin:2px 0;margin-left:72px">⚡ <a href="#web-endpoint-example">Web endpoint example</a></div>
<div style="margin:2px 0;margin-left:72px">⚡ <a href="#key-features">Key Features</a></div>
<div style="margin:2px 0;margin-left:72px">⚡ <a href="#when-to-reach-for-it">When to reach for it</a></div>
<div style="margin:2px 0;margin-left:48px">🚀 <a href="#micronaut">Micronaut</a></div>
<div style="margin:2px 0;margin-left:72px">🚀 <a href="#core-idea-ahead-of-time-reflection-free">Core Idea: ahead-of-time, reflection-free</a></div>
<div style="margin:2px 0;margin-left:72px">🚀 <a href="#dependency-injection-jakarta-annotations">Dependency Injection (Jakarta annotations)</a></div>
<div style="margin:2px 0;margin-left:72px">🚀 <a href="#web-endpoint-example-1">Web endpoint example</a></div>
<div style="margin:2px 0;margin-left:72px">🚀 <a href="#key-features-1">Key Features</a></div>
<div style="margin:2px 0;margin-left:72px">🚀 <a href="#micronaut-vs-quarkus">Micronaut vs Quarkus</a></div>
<div style="margin:2px 0;margin-left:48px">🛡️ <a href="#resilience4j">Resilience4j</a></div>
<div style="margin:2px 0;margin-left:72px">🛡️ <a href="#core-idea-functional-decorators-not-a-thread-pool-framework">Core Idea: functional decorators, not a thread-pool framework</a></div>
<div style="margin:2px 0;margin-left:72px">🛡️ <a href="#the-problem-it-solves">The problem it solves</a></div>
<div style="margin:2px 0;margin-left:72px">🛡️ <a href="#architecture--modules-and-composition">Architecture — modules and composition</a></div>
<div style="margin:2px 0;margin-left:72px">🛡️ <a href="#design-patterns-it-embodies">Design patterns it embodies</a></div>
<div style="margin:2px 0;margin-left:72px">🛡️ <a href="#code-examples">Code examples</a></div>
<div style="margin:2px 0;margin-left:72px">🛡️ <a href="#similar--pertinent-frameworks">Similar &amp; Pertinent Frameworks</a></div>
<div style="margin:2px 0;margin-left:24px">🗄️ <a href="#-database">Database</a></div>
<div style="margin:2px 0;margin-left:48px">⚖️ <a href="#cap-theorem">CAP Theorem</a></div>
<div style="margin:2px 0;margin-left:72px">⚖️ <a href="#partition-or-else-latency-or-consistency-pacelc">Partition-or-Else, Latency-or-Consistency (PACELC)</a></div>
<div style="margin:2px 0;margin-left:48px">🗃️ <a href="#sql">SQL</a></div>
<div style="margin:2px 0;margin-left:72px">🗃️ <a href="#database-operations">Database Operations</a></div>
<div style="margin:2px 0;margin-left:72px">🗃️ <a href="#query-operations">Query Operations</a></div>
<div style="margin:2px 0;margin-left:72px">🗃️ <a href="#joins">Joins</a></div>
<div style="margin:2px 0;margin-left:72px">🗃️ <a href="#advanced-operations">Advanced Operations</a></div>
<div style="margin:2px 0;margin-left:72px">🗃️ <a href="#aggregation">Aggregation</a></div>
<div style="margin:2px 0;margin-left:72px">🗃️ <a href="#window-functions-increasingly-asked">Window Functions (increasingly asked)</a></div>
<div style="margin:2px 0;margin-left:72px">🗃️ <a href="#common-table-expressions-the-with-clause">Common Table Expressions (the WITH clause)</a></div>
<div style="margin:2px 0;margin-left:72px">🗃️ <a href="#relations">Relations</a></div>
<div style="margin:2px 0;margin-left:72px">🗃️ <a href="#normalization-in-plain-words">Normalization (in plain words)</a></div>
<div style="margin:2px 0;margin-left:72px">🗃️ <a href="#indexes-in-depth">Indexes In Depth</a></div>
<div style="margin:2px 0;margin-left:72px">🗃️ <a href="#database-engine-types--online-transaction-processing-vs-online-analytical-processing">Database Engine Types — Online Transaction Processing vs Online Analytical Processing</a></div>
<div style="margin:2px 0;margin-left:72px">🗃️ <a href="#database-tuning-techniques">Database Tuning Techniques</a></div>
<div style="margin:2px 0;margin-left:72px">🧵 <a href="#concurrency-1">Concurrency</a></div>
<div style="margin:2px 0;margin-left:72px">🗃️ <a href="#acid-properties">ACID Properties</a></div>
<div style="margin:2px 0;margin-left:72px">🗃️ <a href="#isolation-levels-and-their-anomalies">Isolation Levels and Their Anomalies</a></div>
<div style="margin:2px 0;margin-left:72px">🗃️ <a href="#optimistic-vs-pessimistic-locking">Optimistic vs Pessimistic Locking</a></div>
<div style="margin:2px 0;margin-left:72px">🗃️ <a href="#deadlocks">Deadlocks</a></div>
<div style="margin:2px 0;margin-left:48px">🔄 <a href="#replication">Replication</a></div>
<div style="margin:2px 0;margin-left:72px">🔄 <a href="#topologies">Topologies</a></div>
<div style="margin:2px 0;margin-left:72px">🔄 <a href="#synchronous-vs-asynchronous">Synchronous vs asynchronous</a></div>
<div style="margin:2px 0;margin-left:72px">🔄 <a href="#replication-lag-and-its-read-anomalies">Replication lag and its read anomalies</a></div>
<div style="margin:2px 0;margin-left:48px">📦 <a href="#partitioning--sharding">Partitioning / Sharding</a></div>
<div style="margin:2px 0;margin-left:48px">🔗 <a href="#orm">ORM</a></div>
<div style="margin:2px 0;margin-left:72px">🔗 <a href="#definitions">Definitions</a></div>
<div style="margin:2px 0;margin-left:72px">🔗 <a href="#jpa-vs-hibernate">JPA vs Hibernate</a></div>
<div style="margin:2px 0;margin-left:48px">📊 <a href="#spring-data-jpa">Spring Data JPA</a></div>
<div style="margin:2px 0;margin-left:72px">🏷️ <a href="#annotations-1">Annotations</a></div>
<div style="margin:2px 0;margin-left:72px">📊 <a href="#constants">Constants</a></div>
<div style="margin:2px 0;margin-left:72px">📊 <a href="#repository">Repository</a></div>
<div style="margin:2px 0;margin-left:72px">📊 <a href="#the-n1-problem-guaranteed-question">The N+1 Problem (guaranteed question)</a></div>
<div style="margin:2px 0;margin-left:72px">📊 <a href="#fetching-pitfalls">Fetching Pitfalls</a></div>
<div style="margin:2px 0;margin-left:72px">📊 <a href="#pagination">Pagination</a></div>
<div style="margin:2px 0;margin-left:48px">🐻 <a href="#hibernate">Hibernate</a></div>
<div style="margin:2px 0;margin-left:72px">🐻 <a href="#hibernate-objects">Hibernate Objects</a></div>
<div style="margin:2px 0;margin-left:72px">🐻 <a href="#configuration-steps">Configuration Steps</a></div>
<div style="margin:2px 0;margin-left:72px">🐻 <a href="#persistencexml-example">persistence.xml Example</a></div>
<div style="margin:2px 0;margin-left:72px">🐻 <a href="#mapping-annotations">Mapping Annotations</a></div>
<div style="margin:2px 0;margin-left:72px">🐻 <a href="#relationships">Relationships</a></div>
<div style="margin:2px 0;margin-left:72px">🐻 <a href="#sessionfactory">SessionFactory</a></div>
<div style="margin:2px 0;margin-left:72px">🐻 <a href="#session">Session</a></div>
<div style="margin:2px 0;margin-left:72px">🐻 <a href="#entity-lifecycle">Entity Lifecycle</a></div>
<div style="margin:2px 0;margin-left:72px">🐻 <a href="#cascade-types">Cascade Types</a></div>
<div style="margin:2px 0;margin-left:48px">📄 <a href="#nosql">NoSQL</a></div>
<div style="margin:2px 0;margin-left:72px">📄 <a href="#database-types">Database Types</a></div>
<div style="margin:2px 0;margin-left:72px">📄 <a href="#database-mapping">Database Mapping</a></div>
<div style="margin:2px 0;margin-left:72px">📄 <a href="#mongodb">MongoDB</a></div>
<div style="margin:2px 0;margin-left:72px">📄 <a href="#commands">Commands</a></div>
<div style="margin:2px 0;margin-left:72px">📄 <a href="#query-operators">Query Operators</a></div>
<div style="margin:2px 0;margin-left:72px">📄 <a href="#query-projection">Query Projection</a></div>
<div style="margin:2px 0;margin-left:72px">📄 <a href="#concern">Concern</a></div>
<div style="margin:2px 0;margin-left:72px">📄 <a href="#dynamodb">DynamoDB</a></div>
<div style="margin:2px 0;margin-left:24px">🔒 <a href="#-security">Security</a></div>
<div style="margin:2px 0;margin-left:48px">🪪 <a href="#authentication-vs-authorization">Authentication vs Authorization</a></div>
<div style="margin:2px 0;margin-left:48px">🔑 <a href="#authentication-methods">Authentication Methods</a></div>
<div style="margin:2px 0;margin-left:72px">🔑 <a href="#session-based-authentication">Session-Based Authentication</a></div>
<div style="margin:2px 0;margin-left:72px">🔑 <a href="#token-based-authentication-jwt">Token-Based Authentication (JWT)</a></div>
<div style="margin:2px 0;margin-left:72px">🔑 <a href="#oauth-20">OAuth 2.0</a></div>
<div style="margin:2px 0;margin-left:72px">🔑 <a href="#single-sign-on-sso">Single Sign-On (SSO)</a></div>
<div style="margin:2px 0;margin-left:72px">🔑 <a href="#multi-factor-authentication-mfa2fa">Multi-Factor Authentication (MFA/2FA)</a></div>
<div style="margin:2px 0;margin-left:72px">🔑 <a href="#api-keys">API Keys</a></div>
<div style="margin:2px 0;margin-left:72px">🔑 <a href="#basic-authentication">Basic Authentication</a></div>
<div style="margin:2px 0;margin-left:72px">🔑 <a href="#certificate-based-authentication">Certificate-Based Authentication</a></div>
<div style="margin:2px 0;margin-left:48px">🛂 <a href="#authorization-methods">Authorization Methods</a></div>
<div style="margin:2px 0;margin-left:72px">🛂 <a href="#role-based-access-control-rbac">Role-Based Access Control (RBAC)</a></div>
<div style="margin:2px 0;margin-left:72px">🛂 <a href="#attribute-based-access-control-abac">Attribute-Based Access Control (ABAC)</a></div>
<div style="margin:2px 0;margin-left:72px">🛂 <a href="#access-control-lists-acl">Access Control Lists (ACL)</a></div>
<div style="margin:2px 0;margin-left:48px">🛡️ <a href="#security-best-practices">Security Best Practices</a></div>
<div style="margin:2px 0;margin-left:72px">🛡️ <a href="#token-storage">Token Storage</a></div>
<div style="margin:2px 0;margin-left:72px">🛡️ <a href="#token-refresh-strategy">Token Refresh Strategy</a></div>
<div style="margin:2px 0;margin-left:72px">🛡️ <a href="#password-security">Password Security</a></div>
<div style="margin:2px 0;margin-left:72px">🛡️ <a href="#common-attacks--prevention">Common Attacks &amp; Prevention</a></div>
<div style="margin:2px 0;margin-left:48px">🔐 <a href="#spring-security">Spring Security</a></div>
<div style="margin:2px 0;margin-left:48px">🧱 <a href="#recommended-stack">Recommended Stack</a></div>
<div style="margin:2px 0;margin-left:72px">🧱 <a href="#modern-web-app">Modern Web App</a></div>
<div style="margin:2px 0;margin-left:72px">🧱 <a href="#enterprise">Enterprise</a></div>
<div style="margin:2px 0;margin-left:48px">🗝️ <a href="#legacy-security-concepts">Foundational Network Security Concepts</a></div>
<div style="margin:2px 0;margin-left:24px">🏢 <a href="#-system-design">System Design</a></div>
<div style="margin:2px 0;margin-left:48px">🏗️ <a href="#system-design-principles">System Design Principles</a></div>
<div style="margin:2px 0;margin-left:72px">🏗️ <a href="#high-availability">High Availability</a></div>
<div style="margin:2px 0;margin-left:72px">🏗️ <a href="#scalability">Scalability</a></div>
<div style="margin:2px 0;margin-left:72px">🏗️ <a href="#scaling-building-blocks">Scaling Building Blocks</a></div>
<div style="margin:2px 0;margin-left:72px">🏗️ <a href="#performance">Performance</a></div>
<div style="margin:2px 0;margin-left:72px">🏗️ <a href="#durability">Durability</a></div>
<div style="margin:2px 0;margin-left:72px">🏗️ <a href="#consistency">Consistency</a></div>
<div style="margin:2px 0;margin-left:48px">🖥️ <a href="#hardware">Hardware</a></div>
<div style="margin:2px 0;margin-left:72px">🖥️ <a href="#compute-environment">Compute Environment</a></div>
<div style="margin:2px 0;margin-left:48px">📡 <a href="#communication">Communication</a></div>
<div style="margin:2px 0;margin-left:72px">📡 <a href="#requestresponse">Request/Response</a></div>
<div style="margin:2px 0;margin-left:72px">📡 <a href="#async-messaging">Async Messaging</a></div>
<div style="margin:2px 0;margin-left:72px">📡 <a href="#network-protocols">Network Protocols</a></div>
<div style="margin:2px 0;margin-left:48px">🌍 <a href="#api-design">API Design</a></div>
<div style="margin:2px 0;margin-left:72px">🌍 <a href="#api-styles--the-main-options-in-the-industry">API Styles — the main options in the industry</a></div>
<div style="margin:2px 0;margin-left:72px">🌍 <a href="#rest--the-default-style">REST — the default style</a></div>
<div style="margin:2px 0;margin-left:72px">🌍 <a href="#graphql">GraphQL</a></div>
<div style="margin:2px 0;margin-left:72px">🌍 <a href="#grpc">gRPC</a></div>
<div style="margin:2px 0;margin-left:72px">🌍 <a href="#real-time-push-websockets-and-server-sent-events">Real-Time Push: WebSockets and Server-Sent Events</a></div>
<div style="margin:2px 0;margin-left:72px">🌍 <a href="#webhooks">Webhooks</a></div>
<div style="margin:2px 0;margin-left:48px">🧱 <a href="#solid-principles-explain-with-examples-not-definitions">SOLID Principles (explain with examples, not definitions)</a></div>
<div style="margin:2px 0;margin-left:48px">🧭 <a href="#clean-code-habits-verbalize-them-during-a-code-challenge">Clean Code Habits (verbalize them during a code challenge)</a></div>
<div style="margin:2px 0;margin-left:48px">📐 <a href="#design-principles">Design Principles</a></div>
<div style="margin:2px 0;margin-left:48px">🧩 <a href="#design-patterns-each-with-its-spring-incarnation">Design Patterns (each with its Spring incarnation)</a></div>
<div style="margin:2px 0;margin-left:72px">🏭 <a href="#creational">Creational</a></div>
<div style="margin:2px 0;margin-left:72px">🎭 <a href="#behavioral">Behavioral</a></div>
<div style="margin:2px 0;margin-left:72px">🏗️ <a href="#structural">Structural</a></div>
<div style="margin:2px 0;margin-left:72px">🏛️ <a href="#architectural-patterns">Architectural Patterns</a></div>
<div style="margin:2px 0;margin-left:48px">🕸️ <a href="#distributed-design-patterns">Distributed Design Patterns</a></div>
<div style="margin:2px 0;margin-left:72px">🕸️ <a href="#monolith-vs-microservices--the-honest-trade-off">Monolith vs Microservices — the honest trade-off</a></div>
<div style="margin:2px 0;margin-left:72px">🕸️ <a href="#service-oriented-architecture-soa--the-historical-predecessor">Service-Oriented Architecture (SOA) — the historical predecessor</a></div>
<div style="margin:2px 0;margin-left:72px">🕸️ <a href="#how-to-split-services">How to Split Services</a></div>
<div style="margin:2px 0;margin-left:72px">🕸️ <a href="#communication-patterns">Communication Patterns</a></div>
<div style="margin:2px 0;margin-left:72px">🕸️ <a href="#messaging">Messaging</a></div>
<div style="margin:2px 0;margin-left:72px">🕸️ <a href="#resilience-patterns-know-the-names-and-the-why">Resilience Patterns (know the names AND the why)</a></div>
<div style="margin:2px 0;margin-left:72px">🕸️ <a href="#data-management-across-services-where-interviews-get-hard">Data Management Across Services (where interviews get hard)</a></div>
<div style="margin:2px 0;margin-left:72px">🕸️ <a href="#observability--the-three-pillars">Observability — the three pillars</a></div>
<div style="margin:2px 0;margin-left:72px">🕸️ <a href="#entry--deployment-patterns">Entry &amp; Deployment Patterns</a></div>
<div style="margin:2px 0;margin-left:48px">🏛️ <a href="#architecture-types">Architecture Types</a></div>
<div style="margin:2px 0;margin-left:72px">🏛️ <a href="#layered-architecture-n-tier">Layered Architecture (N-Tier)</a></div>
<div style="margin:2px 0;margin-left:72px">🏛️ <a href="#event-driven-architecture">Event-Driven Architecture</a></div>
<div style="margin:2px 0;margin-left:72px">🏛️ <a href="#microkernel-architecture-plugin">Microkernel Architecture (Plugin)</a></div>
<div style="margin:2px 0;margin-left:72px">🏛️ <a href="#space-based-architecture">Space-Based Architecture</a></div>
<div style="margin:2px 0;margin-left:72px">🏛️ <a href="#db-centric-architecture">DB Centric Architecture</a></div>
<div style="margin:2px 0;margin-left:72px">🏛️ <a href="#domain-centric-architecture">Domain Centric Architecture</a></div>
<div style="margin:2px 0;margin-left:72px">🏛️ <a href="#functional-organization">Functional Organization</a></div>
<div style="margin:2px 0;margin-left:48px">💡 <a href="#design-tips">Design Tips</a></div>
<div style="margin:2px 0;margin-left:48px">📋 <a href="#requirements">Requirements</a></div>
<div style="margin:2px 0;margin-left:72px">📋 <a href="#functional-requirements">Functional Requirements</a></div>
<div style="margin:2px 0;margin-left:72px">📋 <a href="#non-functional-requirements">Non-Functional Requirements</a></div>
<div style="margin:2px 0;margin-left:24px">🧪 <a href="#-testing">Testing</a></div>
<div style="margin:2px 0;margin-left:48px">🧪 <a href="#testing-methodologies-tdd-vs-bdd">Testing Methodologies: TDD vs BDD</a></div>
<div style="margin:2px 0;margin-left:48px">🧪 <a href="#unit-testing">Unit Testing</a></div>
<div style="margin:2px 0;margin-left:48px">🧪 <a href="#integration-testing">Integration Testing</a></div>
<div style="margin:2px 0;margin-left:48px">🧪 <a href="#performance-testing">Performance Testing</a></div>
<div style="margin:2px 0;margin-left:24px">📄 <a href="#data-formats">Data Formats</a></div>
<div style="margin:2px 0;margin-left:0px">🔧 <a href="#-devops">DevOps</a></div>
<div style="margin:2px 0;margin-left:24px">✨ <a href="#features-2">Features</a></div>
<div style="margin:2px 0;margin-left:24px">🔄 <a href="#sdlc">SDLC</a></div>
<div style="margin:2px 0;margin-left:48px">🔒 <a href="#secure-sdlc">Secure Software Development Life Cycle</a></div>
<div style="margin:2px 0;margin-left:24px">🔄 <a href="#cicd-pipeline">Continuous Integration / Continuous Delivery Pipeline</a></div>
<div style="margin:2px 0;margin-left:24px">🐳 <a href="#docker">Docker</a></div>
<div style="margin:2px 0;margin-left:48px">🖼️ <a href="#images">Images</a></div>
<div style="margin:2px 0;margin-left:48px">📦 <a href="#containers">Containers</a></div>
<div style="margin:2px 0;margin-left:48px">📋 <a href="#dockerfile">Dockerfile</a></div>
<div style="margin:2px 0;margin-left:48px">☕ <a href="#docker-for-java-applications">Docker for Java Applications</a></div>
<div style="margin:2px 0;margin-left:48px">🌐 <a href="#docker-networking">Networking</a></div>
<div style="margin:2px 0;margin-left:48px">💾 <a href="#volumes--bind-mounts">Volumes vs Bind Mounts</a></div>
<div style="margin:2px 0;margin-left:48px">🎼 <a href="#docker-compose">Docker Compose</a></div>
<div style="margin:2px 0;margin-left:48px">🔒 <a href="#build-optimization--image-security">Build Optimization &amp; Image Security</a></div>
<div style="margin:2px 0;margin-left:48px">⚙️ <a href="#docker-engine-architecture">Engine Architecture</a></div>
<div style="margin:2px 0;margin-left:48px">🧬 <a href="#image-internals">Image Internals</a></div>
<div style="margin:2px 0;margin-left:48px">🐧 <a href="#containers-at-the-kernel-level">Containers at the Kernel Level</a></div>
<div style="margin:2px 0;margin-left:48px">🗂️ <a href="#union-overlay-filesystem">Union / Overlay Filesystem</a></div>
<div style="margin:2px 0;margin-left:48px">🛡️ <a href="#container-security-internals">Container Security Internals</a></div>
<div style="margin:2px 0;margin-left:48px">🔌 <a href="#bridge-networking-internals">Bridge Networking Internals</a></div>
<div style="margin:2px 0;margin-left:24px">☸️ <a href="#kubernetes">Kubernetes</a></div>
<div style="margin:2px 0;margin-left:48px">🏗️ <a href="#structure">Structure</a></div>
<div style="margin:2px 0;margin-left:48px">🔵 <a href="#core-objects-from-the-smallest-unit-to-the-entry-point">Core Objects (from the smallest unit to the entry point)</a></div>
<div style="margin:2px 0;margin-left:48px">🔵 <a href="#nodes">Nodes</a></div>
<div style="margin:2px 0;margin-left:48px">🧩 <a href="#components">Components</a></div>
<div style="margin:2px 0;margin-left:48px">🌱 <a href="#configuration--spring-boot-integration">Configuration &amp; Spring Boot Integration</a></div>
<div style="margin:2px 0;margin-left:48px">☕ <a href="#resources--the-java-virtual-machine">Resources &amp; the Java Virtual Machine</a></div>
<div style="margin:2px 0;margin-left:48px">⌨️ <a href="#commands-1">Commands</a></div>
<div style="margin:2px 0;margin-left:48px">🧱 <a href="#workload-types">Workload Types</a></div>
<div style="margin:2px 0;margin-left:48px">🗂️ <a href="#namespaces--rbac">Namespaces &amp; Role-Based Access Control (RBAC)</a></div>
<div style="margin:2px 0;margin-left:48px">🗄️ <a href="#storage-1">Storage</a></div>
<div style="margin:2px 0;margin-left:48px">📍 <a href="#scheduling">Scheduling</a></div>
<div style="margin:2px 0;margin-left:48px">⎈ <a href="#helm">Helm</a></div>
<div style="margin:2px 0;margin-left:48px">🧠 <a href="#control-plane-internals">Control Plane Internals</a></div>
<div style="margin:2px 0;margin-left:48px">🔐 <a href="#api-request-path">The API Request Path</a></div>
<div style="margin:2px 0;margin-left:48px">📐 <a href="#scheduler-internals">Scheduler Internals</a></div>
<div style="margin:2px 0;margin-left:48px">🔗 <a href="#kubelet-cri-kube-proxy">kubelet, the Container Runtime Interface &amp; kube-proxy</a></div>
<div style="margin:2px 0;margin-left:48px">🕸️ <a href="#cni-networkpolicy">Container Network Interface &amp; NetworkPolicy</a></div>
<div style="margin:2px 0;margin-left:48px">🔁 <a href="#crd-operators">Custom Resource Definitions &amp; the Operator Pattern</a></div>
<div style="margin:2px 0;margin-left:48px">🧩 <a href="#init-containers-multi-container-patterns">Init Containers &amp; Multi-Container Pod Patterns</a></div>
<div style="margin:2px 0;margin-left:24px">☁️ <a href="#cloud">Cloud</a></div>
<div style="margin:2px 0;margin-left:48px">☁️ <a href="#aws">AWS</a></div>
<div style="margin:2px 0;margin-left:72px">☁️ <a href="#computing">Computing</a></div>
<div style="margin:2px 0;margin-left:72px">☁️ <a href="#storage">Storage</a></div>
<div style="margin:2px 0;margin-left:72px">☁️ <a href="#networking">Networking</a></div>
<div style="margin:2px 0;margin-left:72px">☁️ <a href="#monitoring">Monitoring</a></div>
<div style="margin:2px 0;margin-left:72px">☁️ <a href="#events">Events</a></div>
<div style="margin:2px 0;margin-left:72px">☁️ <a href="#containers-1">Containers</a></div>
<div style="margin:2px 0;margin-left:72px">☁️ <a href="#cicd">CI/CD</a></div>
<div style="margin:2px 0;margin-left:72px">🔑 <a href="#identity-and-access-management-iam--governance">Identity and Access Management (IAM) &amp; Governance</a></div>
<div style="margin:2px 0;margin-left:72px">🏗️ <a href="#high-availability--disaster-recovery">High Availability &amp; Disaster Recovery</a></div>
<div style="margin:2px 0;margin-left:48px">🔷 <a href="#azure">Azure</a></div>
<div style="margin:2px 0;margin-left:72px">🔷 <a href="#mapping-aws-knowledge-to-azure-equivalents">Mapping AWS Knowledge to Azure Equivalents</a></div>
<div style="margin:2px 0;margin-left:72px">🔷 <a href="#talking-points-for-the-interview">Talking Points for the Interview</a></div>
<div style="margin:2px 0;margin-left:24px">🏗️ <a href="#infrastructure-as-code">Infrastructure as Code</a></div>
<div style="margin:2px 0;margin-left:48px">🏗️ <a href="#terraform">Terraform</a></div>
<div style="margin:2px 0;margin-left:48px">⌨️ <a href="#commands-2">Commands</a></div>
<div style="margin:2px 0;margin-left:24px">🌿 <a href="#git">Git</a></div>
<div style="margin:2px 0;margin-left:48px">💡 <a href="#concepts">Concepts</a></div>
<div style="margin:2px 0;margin-left:24px">🤵 <a href="#jenkins">Jenkins</a></div>
<div style="margin:2px 0;margin-left:0px">🌐 <a href="#-frontend">Frontend</a></div>
<div style="margin:2px 0;margin-left:24px">📄 <a href="#html5">HTML5</a></div>
<div style="margin:2px 0;margin-left:24px">🎨 <a href="#css">CSS</a></div>
<div style="margin:2px 0;margin-left:24px">🟨 <a href="#javascript">JavaScript</a></div>
<div style="margin:2px 0;margin-left:24px">🔷 <a href="#typescript">TypeScript</a></div>
<div style="margin:2px 0;margin-left:48px">🧪 <a href="#testing">Testing</a></div>
<div style="margin:2px 0;margin-left:72px">🧪 <a href="#features-1">Features</a></div>
<div style="margin:2px 0;margin-left:48px">⚛️ <a href="#react">React</a></div>
<div style="margin:2px 0;margin-left:0px">🤖 <a href="#-ai">AI</a></div>
<div style="margin:2px 0;margin-left:24px">🧠 <a href="#large-language-model-fundamentals">Large Language Model Fundamentals</a></div>
<div style="margin:2px 0;margin-left:24px">💬 <a href="#prompt-engineering">Prompt Engineering</a></div>
<div style="margin:2px 0;margin-left:24px">🔎 <a href="#retrieval-augmented-generation-rag">Retrieval-Augmented Generation (RAG)</a></div>
<div style="margin:2px 0;margin-left:24px">🤖 <a href="#agents--tool-use">Agents &amp; Tool Use</a></div>
<div style="margin:2px 0;margin-left:24px">☕ <a href="#java-ecosystem">Java Ecosystem</a></div>
<div style="margin:2px 0;margin-left:24px">🛡️ <a href="#evaluation--safety">Evaluation &amp; Safety</a></div>

---

<h1 id="-backend" style="font-size:42px;font-weight:800;margin:34px 0 14px;">⚙️ Backend</h1>

Everything server-side in one place: the data structures and algorithms underneath, the Java language and its deep dives (threads, exceptions), the Spring ecosystem, persistence, messaging, security, system design and testing. Wherever a concept has a runnable demonstration, a 💻 line links to the Java file under [src/](../src/) that prints the idea in action.

---

<h2 id="-data-structures" style="font-size:33px;font-weight:800;margin:30px 0 12px;">📑 Data Structures</h2>

> 💻 Code: [LinkedListExample](../src/main/java/algorithm/concepts/datastructures/collections/lists/LinkedListExample.java) · [OrderList](../src/main/java/algorithm/concepts/datastructures/collections/lists/OrderList.java) · [SetExample](../src/main/java/algorithm/concepts/datastructures/collections/sets/SetExample.java) · [MapExample](../src/main/java/algorithm/concepts/datastructures/collections/maps/MapExample.java) · [Binary Search Tree](../src/main/java/algorithm/implementation/trees/BST.java) · [Trie](../src/main/java/algorithm/implementation/search/trie/Trie.java) · [Least Recently Used cache](../src/main/java/algorithm/implementation/search/lru/LRUCache.java) · [Conversions](../src/main/java/algorithm/concepts/convert/ArraysAndLists.java) · [Comparators](../src/main/java/algorithm/implementation/sorting/SortPlayersByScoreDecreasing.java)

<h4 id="arraylist" style="font-size:20px;font-weight:700;margin:22px 0 8px;">📇 ArrayList</h4>
The most basic way to store a sequence of elements is a plain array, but a plain array has a fixed size decided at creation — awkward for the common case of not knowing in advance how many elements will actually be added.

**ArrayList:** a resizable array implementing the `List` interface, growing its backing array automatically as elements are added rather than requiring a size to be fixed upfront. Because it's still backed by a contiguous array underneath, it inherits an array's core trade-off: reading or writing by index is O(1) — direct offset arithmetic — but inserting or deleting anywhere except the very end is O(n), since every following element has to shift over by one to keep the array contiguous. Its operations, summarized:

- **Read/Access**: O(1) by index
- **Write/Update**: O(1) direct index modification
- **Insert at end**: O(1) amortized — may trigger a resize, O(n)
- **Insert at middle**: O(n) — must shift elements
- **Delete at end**: O(1)
- **Delete at middle**: O(n) — must shift elements
- **Search**: O(n) linear
- **Best for**: storing and accessing by index
- **Memory**: comparatively little overhead per element

<h5 id="pros" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Pros</h5>

- **Fast random access O(1)**
- **Dynamic sizing**
- **Cache-friendly**
- **Good for read-heavy operations**

<h5 id="cons" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Cons</h5>

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
- **Resize mechanics**: the backing array starts at capacity 10; when full it is replaced by a larger array (Java's `ArrayList` grows by about 50%, `oldCapacity + oldCapacity/2`) and all elements are copied. Because the cost of growing is spread across many cheap appends, a run of n appends is O(n) total — **O(1) amortised** per append — even though an individual resize copy is O(n)

<h4 id="linkedlist" style="font-size:20px;font-weight:700;margin:22px 0 8px;">⛓️ LinkedList</h4>
ArrayList's weakness is inserting or deleting anywhere but the end, since the whole array has to shift. A different data layout avoids shifting entirely, at the cost of giving up cheap indexed access.

**LinkedList:** a doubly linked list — each element ("node") holds its data plus a pointer to the next node and a pointer to the previous one — implementing both `List` and `Queue`. Because nodes aren't contiguous in memory, inserting or removing a node once you're already there is just a pointer update, O(1), with no shifting required. The trade-off is that reaching any position at all — including by index — means walking the chain of pointers from one end, O(n); there is no direct offset arithmetic the way an array has.

- **Read/Access**: O(n) — must traverse from head/tail
- **Write/Update**: O(n) to find the node, then O(1) to update it
- **Insert at head/tail**: O(1) — just update pointers
- **Insert at middle**: O(n) to traverse to position, then O(1) to insert
- **Delete at head/tail**: O(1) — just update pointers
- **Delete at middle**: O(n) to traverse to position, then O(1) to delete
- **Search**: O(n) linear
- **Best for**: frequent insertion/removal at the ends, without needing indexed access
- **Memory**: the most overhead of the linear structures — each node stores data plus two pointers (next, prev)

<h5 id="pros-1" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Pros</h5>

- **Fast insertions/deletions at head/tail O(1)**
- **No resize needed**
- **Good for queue/deque operations**

<h5 id="cons-1" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Cons</h5>

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

<h4 id="queues" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🎟️ Queues</h4>

> 💻 Code: [BreadthFirstSearch (Queue in action)](../src/main/java/algorithm/implementation/search/bfs/BreadthFirstSearch.java)

Some processing order needs to be "whoever arrived first gets handled first" — a print job queue, a request waiting to be served — rather than the freedom to insert or access anywhere.

**Queue:** a First In, First Out (FIFO) structure — elements enter at the **tail** and leave from the **head**, always in the order they arrived. That constrained access pattern is exactly what lets every core operation run in O(1): there's never a need to shift or search, only ever to touch one end.

- **Enqueue**: O(1) — `offer(e)` / `add(e)` at tail
- **Dequeue**: O(1) — `poll()` / `remove()` from head (`poll` returns null on empty; `remove` throws)
- **Peek**: O(1) — `peek()` / `element()` — view head without removing
- **Search**: O(n) — no random access
- **Best for**: BFS traversal, task scheduling, producer-consumer pipelines
- **Memory**: O(n); `ArrayDeque` uses less memory per element than `LinkedList`

<h5 id="pros-2" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Pros</h5>
- **Enforces FIFO ordering** — first request is first served
- **O(1) enqueue and dequeue** with `ArrayDeque` (resizable circular array)
- `BlockingQueue` variants handle producer-consumer coordination without explicit synchronization

<h5 id="cons-2" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Cons</h5>
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

<h4 id="stacks" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🥞 Stacks</h4>

> 💻 Code: [IsBalanced (bracket matching with a stack)](../src/main/java/algorithm/implementation/collections/stacks/IsBalanced.java) · [DepthFirstSearch (iterative DFS with a stack)](../src/main/java/algorithm/implementation/search/dfs/DepthFirstSearch.java)

Where a queue models "first arrived, first served," some problems need the opposite: undoing the most recent action first, or backtracking out of whichever path was most recently explored.

**Stack:** a Last In, First Out (LIFO) structure — elements are both added and removed from the same end, the "top." Every core operation touches only that one end, so like a queue, every operation is O(1); the difference from a queue is purely which end serves as both entry and exit point.

- **Push**: O(1) — add to top
- **Pop**: O(1) — remove from top (throws if empty)
- **Peek**: O(1) — view top without removing
- **Search**: O(n) — no random access
- **Best for**: DFS traversal, call-stack simulation, expression parsing, bracket matching, undo/redo
- **Memory**: O(n)

<h5 id="pros-3" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Pros</h5>
- **O(1) push, pop, peek**
- **Natural model for depth-first and backtracking algorithms**
- `ArrayDeque` is fast and cache-friendly with no synchronization overhead

<h5 id="cons-3" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Cons</h5>
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

<h4 id="deques" style="font-size:20px;font-weight:700;margin:22px 0 8px;">↕️ Deques</h4>
A queue only ever touches its head and tail from opposite ends; a stack only ever touches one end. Some problems — sliding-window algorithms, browser back/forward history — need O(1) access at *both* ends simultaneously, which neither structure alone provides.

**Deque** (double-ended queue): a structure allowing O(1) add and remove at **both** head and tail, which means it can act as either a Stack or a Queue depending on which operations are used — a strict generalization of both.

- **addFirst / offerFirst**: O(1) — insert at head
- **addLast / offerLast**: O(1) — insert at tail
- **removeFirst / pollFirst**: O(1) — remove from head
- **removeLast / pollLast**: O(1) — remove from tail
- **peekFirst / peekLast**: O(1) — view either end
- **Search**: O(n)
- **Best for**: sliding-window maximum/minimum, work-stealing, browser history, palindrome checking

<h5 id="pros-4" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Pros</h5>
- **O(1) at both ends** — the most flexible linear data structure
- **Replaces both Stack and Queue** in a single structure
- `ArrayDeque` beats `Stack` (no synchronization) and beats `LinkedList` (array-based, better cache locality)

<h5 id="cons-4" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Cons</h5>
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

<h4 id="heap--priority-queue" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🔺 Heap / Priority Queue</h4>
None of the structures above can efficiently answer "give me the smallest (or largest) element right now" while elements keep being added and removed — a sorted structure could, but keeping every element fully sorted after each insert is expensive. A heap targets exactly this narrower, cheaper guarantee: instant access to just the one extreme value, not a full ordering.

**Heap:** a complete binary tree satisfying the heap-order property — every node's key is ≤ its children's keys (a min-heap) or ≥ its children's keys (a max-heap). "Complete" is what makes the array trick below possible: every level is fully filled except possibly the last, which fills left to right with no gaps, so the tree can be stored implicitly in a plain array with no node pointers needed at all — a node's children are always at predictable array indices:

```
Array: [1, 3, 5, 7, 9, 8]           Tree view (min-heap):
Index:  0  1  2  3  4  5                    1
                                           /   \
parent(i)   = (i-1)/2                    3      5
leftChild(i)  = 2i+1                    / \    /
rightChild(i) = 2i+2                   7   9  8
```

Inserting or removing has to restore the heap-order property afterward, which is why both are O(log n) rather than O(1): **insert** appends the new element at the next open array slot, then "bubbles up," swapping with its parent while smaller than it. **Remove** takes the root (always the minimum, in a min-heap), replaces it with the last element in the array, then "bubbles down," swapping with the smaller child until the property holds again.

- **Insert (offer)**: O(log n)
- **Remove min/max (poll)**: O(log n)
- **Peek**: O(1) — the root is always the minimum (min-heap) or maximum (max-heap)
- **Build from n elements**: O(n) — bottom-up heapify, cheaper than n separate inserts (O(n log n))
- **Remove an arbitrary element**: O(n) — linear scan to find it, then O(log n) to restore the heap
- **Best for**: priority scheduling, Dijkstra's shortest path, Prim's minimum spanning tree, heap-sort, Top-K and streaming-median problems
- **Memory**: O(n) — a compact array, no per-node pointer overhead

<h5 id="pros-5" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Pros</h5>
- **O(1) access to the minimum (or maximum)**
- **Array-backed** — excellent cache locality, no per-node pointer overhead
- **O(n) bulk construction** via bottom-up heapify
- `java.util.PriorityQueue` is a min-heap by default; pass `Comparator.reverseOrder()` for a max-heap

<h5 id="cons-5" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Cons</h5>
- **Only the root is ordered** — there is no efficient sorted traversal of the whole structure
- **Arbitrary removal is O(n)** unless you maintain a separate index map
- **Not stable** — elements of equal priority may leave in any order

```java
// Min-heap (default): smallest element is polled first
PriorityQueue<Integer> minHeap = new PriorityQueue<>();
minHeap.offer(5); minHeap.offer(1); minHeap.offer(3);
int min    = minHeap.peek();   // 1 — O(1), does not remove
int polled = minHeap.poll();   // 1 — O(log n), removes the minimum

// Max-heap: reverse the comparator
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

// Top-K smallest: keep a max-heap of size k, evicting the largest when over capacity
PriorityQueue<Integer> topK = new PriorityQueue<>(Comparator.reverseOrder());
for (int x : data) { topK.offer(x); if (topK.size() > k) topK.poll(); }
```

<h4 id="hash-table" style="font-size:20px;font-weight:700;margin:22px 0 8px;">#️⃣ Hash Table</h4>
Every structure so far either scans linearly to find something (O(n)) or narrows the search by comparison (O(log n) for a balanced tree). A hash table sidesteps searching almost entirely, by computing directly where a key *should* be.

**Hash table:** a structure that maps keys to array slots ("buckets") through a hash function, so a lookup can jump straight to the right bucket instead of comparing against other keys one by one. Two keys can still hash to the same bucket — a **collision** — and hash tables resolve this one of two ways: separate chaining (each bucket holds a small list or tree of the colliding entries) or open addressing (linear probing, quadratic probing, double hashing — the colliding entry is placed in a different, nearby slot instead). As long as collisions stay rare, insert/lookup/delete all stay close to O(1); a pathological case where every key collides into one bucket degrades to O(n), since that bucket is then searched linearly (or, in Java's `HashMap`, via a tree once one bucket gets crowded — covered below).

- **Insert / lookup / delete**: O(1) expected, O(n) worst case (all keys collide into one bucket)
- **Search**: O(1) expected
- **Iteration**: O(n + capacity) — visits every bucket, including empty ones
- **Best for**: frequency counting, deduplication, caching (for example a Least Recently Used cache), grouping by key
- **Memory**: O(n + capacity); Java's `HashMap` starts at capacity 16 with a 0.75 load-factor threshold, doubling capacity and rehashing when exceeded

<h5 id="pros-6" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Pros</h5>
- **O(1) expected insert, lookup and delete** — the fastest general-purpose key lookup
- **Any key type** that implements `hashCode()` and `equals()` correctly
- **Amortised O(1) inserts** — occasional rehashing is spread across many cheap inserts

<h5 id="cons-6" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Cons</h5>
- **No ordering** — iteration order is undefined (`LinkedHashMap` preserves insertion order; `TreeMap` keeps keys sorted at O(log n) cost)
- **Degrades to O(n)** under heavy collisions or a poor `hashCode()`
- **Mutable keys are dangerous** — a key whose hash changes after insertion can never be found again
- `HashMap` permits one `null` key and many `null` values; `Hashtable` and `ConcurrentHashMap` forbid `null` keys

```java
Map<String, Integer> freq = new HashMap<>();
freq.merge("apple", 1, Integer::sum);          // idiomatic frequency counting
int count = freq.getOrDefault("banana", 0);    // O(1) expected, null-safe read
// Since Java 8, a bucket that exceeds 8 entries is converted from a linked list
// to a red-black tree, capping worst-case lookup at O(log n) instead of O(n)
```
- **Load factor** λ = entries ÷ capacity; for separate chaining keep λ below ~0.75 (Java's default), for open addressing keep λ below ~0.5 to avoid clustering

<h5 id="hashmap-internals-classic-interview-question" style="font-size:16px;font-weight:600;margin:18px 0 7px;">HashMap Internals (classic interview question)</h5>
How a `put(key, value)` works, step by step:
1. The `hashCode()` of the key is computed and compressed into a **bucket index** (`index = hash & (capacity - 1)`)
2. If the bucket is empty, the entry is stored there
3. If the bucket already holds entries (a **collision**), `equals()` decides between *replace* (same key) and *append* (different key)
4. Since Java 8, when a single bucket accumulates **8 entries**, its linked list is converted into a **red-black tree** (worst-case lookup becomes O(log n) instead of O(n))
5. When size exceeds **capacity × load factor (0.75 by default)**, the table is resized: capacity doubles and every entry is redistributed

<h5 id="thread-safety-the-three-map-options" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Thread Safety: the three map options</h5>
| Implementation | Locking strategy | Consequence |
|---|---|---|
| **HashMap** | No locking at all | Fastest, but not thread safe |
| **Collections.synchronizedMap()** | One single lock on the whole map | Thread safe, but every operation blocks all the others |
| **ConcurrentHashMap** **(Java 5)** | Fine-grained locking per bucket, lock-free reads | Thread safe and scalable under concurrent access |

<h4 id="binary-search-tree" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🌲 Binary Search Tree</h4>
A hash table answers "does this key exist" fast, but its whole design deliberately throws away order — iterating a hash table yields keys in no meaningful sequence. Anything needing sorted iteration, or range queries ("everything between X and Y"), needs a structure that preserves order intrinsically.

**Binary search tree:** a tree where every node holds one data value plus two pointers, left and right, maintaining the invariant that everything in a node's left subtree is smaller than the node and everything in its right subtree is larger. That invariant is what makes search behave like binary search over a sorted array — at each node, compare and go left or right, halving the remaining search space each step, O(log n) — while still allowing O(log n) insertion, unlike a real sorted array which would need an O(n) shift. Deletion is the one intricate operation: removing a node with two children replaces it with its in-order successor (the leftmost node of its right subtree), which preserves the ordering invariant without having to restructure the whole subtree.

- **Insertion**: O(log n)
- **Traversal**: O(n)
- **Search**: O(log n)
- **Best for**: sorted maps and sets, range queries, in-order iteration
- **Memory**: O(n) — one node per element, each holding two child pointers
- **Worst-case height**: O(n) — inserting already-sorted keys degenerates the tree into a linked list and every operation degrades to O(n); the self-balancing variants below (AVL, Red-Black) restore the O(log n) guarantee

<h5 id="pros-7" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Pros</h5>
- **In-order traversal yields the keys in sorted order** in O(n)
- **Floor, ceiling and range queries** in O(log n) when balanced

<h5 id="cons-7" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Cons</h5>
- **Unbalanced after sorted or reverse-sorted inserts** — height degrades to O(n)
- **Deletion is the most intricate operation** (the rebalancing rule above)
- In production you rarely hand-roll one — Java's `TreeMap` and `TreeSet` use a Red-Black tree internally

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

<h4 id="balanced-binary-search-trees-avl-and-red-black" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🌳 Balanced Binary Search Trees (AVL and Red-Black)</h4>
The plain binary search tree above has a real weakness: nothing stops it from becoming lopsided, and inserting already-sorted data degenerates it into what's effectively a linked list, losing the O(log n) guarantee entirely. A self-balancing variant closes that gap by actively restructuring itself.

**Self-balancing binary search tree:** a binary search tree that keeps its height at O(log n) by restructuring — via rotations — on every insert and delete, guaranteeing search, insert, and delete all stay O(log n) even in the worst case. Two implementations dominate in practice, trading off differently: an **AVL tree** enforces the stricter invariant (left and right subtree heights differ by at most 1), giving shorter trees and faster lookups but more rotation work on delete; a **Red-Black tree** enforces a looser invariant (a set of coloring rules on nodes), giving a taller tree but cheaper O(1) restructuring per insert/delete — which is why Java's `TreeMap` and `TreeSet` use a Red-Black tree internally, favoring balanced update cost over the absolute shortest tree.

- **Search**: O(log n) worst case
- **Insert**: O(log n) — an AVL tree needs at most one rotation; a Red-Black tree needs O(1) structural changes
- **Delete**: O(log n) — an AVL tree may rotate at O(log n) levels up to the root; a Red-Black tree needs O(1) structural changes
- **Best for**: sorted maps and sets needing a *guaranteed* O(log n) with sorted iteration
- **Memory**: O(n) — each node stores its key, value and child pointers plus one extra field: an AVL tree stores a height (an integer), a Red-Black tree stores a colour (a single bit)

| Property | AVL tree | Red-Black tree |
|---|---|---|
| Balance invariant | Left and right subtree heights differ by at most 1 (strict height balance) | Colouring rules: root is black, a red node's children are black, every root-to-leaf path has the same number of black nodes (looser balance) |
| Height bound | ≤ 1.44 · log₂(n) (shorter, so faster lookups) | ≤ 2 · log₂(n) (taller, so slightly slower lookups) |
| Structural work per insert | At most 1 rotation (cheap) | O(1) rotations/recolourings (cheap) |
| Structural work per delete | Up to O(log n) rotations (more expensive) | O(1) rotations/recolourings (cheaper) |
| Best fit | Read-heavy workloads (stricter balance wins) | Write-heavy workloads (fewer restructurings per update) |
| In the Java standard library | Not provided (use `TreeMap`) | `java.util.TreeMap` and `java.util.TreeSet` |

<h5 id="pros-8" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Pros</h5>
- **Guaranteed O(log n)** for search, insert and delete — removes the O(n) worst case of a plain binary search tree
- **Sorted iteration** in O(n) via in-order traversal
- **Order queries** (`firstKey`, `floorKey`, `ceilingKey`, `subMap`) in O(log n)

<h5 id="cons-8" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Cons</h5>
- **More complex** than a plain binary search tree — rotations and recolouring are easy to get wrong
- **No access by position** — reaching the k-th element needs an order-statistics augmentation
- **Pointer-heavy** — worse cache locality than an array-backed structure

```java
// TreeMap and TreeSet are backed by a Red-Black tree — all operations O(log n)
NavigableMap<String, Integer> map = new TreeMap<>();
map.put("banana", 2); map.put("apple", 1); map.put("cherry", 3);
String first = map.firstKey();         // "apple"
String ceil  = map.ceilingKey("b");    // "banana" — smallest key ≥ "b"
var range    = map.subMap("apple", "cherry");   // sorted range view

NavigableSet<Integer> set = new TreeSet<>(List.of(5, 1, 3));
int floor  = set.floor(4);   // 3 — largest element ≤ 4
int higher = set.higher(3);  // 5 — smallest element > 3
```

<h4 id="trie-prefix-tree" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🌴 Trie (Prefix Tree)</h4>
A hash table can answer "is this exact string stored?" in O(1) expected, but it's useless for "what strings start with this prefix?" — that question needs every stored string scanned, since a hash spreads related strings to unrelated buckets. A trie is built specifically to make prefix queries cheap.

**Trie** (prefix tree): an ordered tree where each edge is labelled with one character, and the string represented by any node is the concatenation of edge labels from the root down to it — so every string sharing a common prefix shares the same path through the tree for that prefix, only diverging where the strings actually differ:

```
Words inserted: "cat", "car", "card", "dog"

           (root)
          /      \
         c        d
         |        |
         a        o
        / \       |
       t   r      g
           |
           d
```

Because a lookup follows one child edge per character, exact search and insert both cost O(m) — m being the length of the query string — completely independent of how many other strings are stored, unlike a hash table which can degrade under collisions. Prefix search is O(m + k): O(m) to walk down to the prefix's node, then O(k) to enumerate the k matches hanging beneath it — exactly the operation autocomplete needs.

- **Delete**: O(m)
- **Best for**: autocomplete, spell-checking, dictionaries, longest-prefix matching (for example network routing tables)
- **Memory**: O(total characters × alphabet size) — large for wide alphabets; a compressed trie (Patricia/radix trie) collapses single-child chains to save space

<h5 id="pros-9" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Pros</h5>
- **Lookup is O(m), independent of the number of stored strings** — unlike a hash table, it never degrades under collisions
- **Shared prefixes share nodes** — saves memory versus storing each string in full
- **Natural prefix enumeration** in O(m + k) — ideal for autocomplete

<h5 id="cons-9" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Cons</h5>
- **Memory-hungry for wide alphabets** — an array of child links per node costs O(alphabet size) per node (a map per node trades memory for overhead)
- **Poor cache locality** — nodes are individually allocated and scattered in memory
- **Needs compression in practice** — plain tries waste many single-child nodes

```java
class TrieNode { TrieNode[] child = new TrieNode[26]; boolean end; }

class Trie {
    private final TrieNode root = new TrieNode();
    public void insert(String w) {                 // O(m)
        TrieNode n = root;
        for (char c : w.toCharArray()) {
            int i = c - 'a';
            if (n.child[i] == null) n.child[i] = new TrieNode();
            n = n.child[i];
        }
        n.end = true;
    }
    public boolean startsWith(String prefix) {      // O(m) — basis for autocomplete
        TrieNode n = root;
        for (char c : prefix.toCharArray()) {
            int i = c - 'a';
            if (n.child[i] == null) return false;
            n = n.child[i];
        }
        return true;
    }
}
```

<h4 id="union-find-disjoint-set-union" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🪢 Union-Find (Disjoint Set Union)</h4>
A recurring question in graph-shaped problems is simply "are these two things connected, directly or transitively, through any chain of links?" — repeatedly re-traversing the whole graph to answer it every time is wasteful when the underlying connectivity rarely changes.

**Union-Find** (Disjoint Set Union): a forest of trees, one tree per disjoint set, where each node points to its parent and each tree's root serves as that set's representative — so asking "are x and y in the same set?" reduces to "do x and y have the same root?" `makeSet(x)` creates a new singleton set in O(1); `find(x)` walks up to the representative; `union(x, y)` merges two sets by attaching one tree's root under the other's.

Two heuristics, both required together to reach near-linear performance rather than a naive O(n) per operation: **union by size/rank** always attaches the smaller tree under the larger tree's root, keeping trees shallow instead of letting them grow into long chains; **path compression** repoints every node visited during a `find` directly to the root, flattening the tree for every subsequent query. Combined, k operations on n elements cost O(k · α(n)) total, where α is the inverse Ackermann function — a value that grows so slowly it's effectively a small constant for every realistic input size, making Union-Find about as close to O(1) per operation as a non-trivial data structure gets.

- **k operations on n elements**: O(k · α(n)) total
- **Best for**: Kruskal's minimum spanning tree, connected components, cycle detection in undirected graphs, network/percolation connectivity
- **Memory**: O(n) — a parent array plus a size/rank array

<h5 id="pros-10" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Pros</h5>
- **Near O(1) per operation** with both heuristics — total cost O(k · α(n))
- **Tiny implementation** — just a parent array and a size/rank array
- **Answers "same group?" directly** without listing group members

<h5 id="cons-10" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Cons</h5>
- **No enumeration of a set's members** without a full scan
- **No split** — a union cannot be undone
- **`find` mutates the structure** (path compression), so the tree shape is not preserved across queries

```java
class UnionFind {
    private final int[] parent, size;
    UnionFind(int n) {
        parent = new int[n]; size = new int[n];
        for (int i = 0; i < n; i++) { parent[i] = i; size[i] = 1; }
    }
    int find(int x) {                                   // path compression
        if (parent[x] != x) parent[x] = find(parent[x]);
        return parent[x];
    }
    void union(int a, int b) {                          // union by size
        int ra = find(a), rb = find(b);
        if (ra == rb) return;
        if (size[ra] < size[rb]) { parent[ra] = rb; size[rb] += size[ra]; }
        else                     { parent[rb] = ra; size[ra] += size[rb]; }
    }
    boolean connected(int a, int b) { return find(a) == find(b); }
}
```

<h4 id="java-collections-framework" style="font-size:20px;font-weight:700;margin:22px 0 8px;">📚 Java Collections Framework</h4>

> The detailed structures above are the building blocks; this is how the `java.util` framework exposes them through interfaces and utilities.

<h5 id="hierarchy" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Hierarchy</h5>
- **Collection**: Super interface of all the other collections
- **Collections**: Utility class that contains methods to work with collections

<h5 id="interfaces-and-their-implementations" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Interfaces and their implementations</h5>
- **List** — ordered, allows duplicates, indexed: `ArrayList` (backing array, best general performance), `LinkedList` (doubly linked, also a `Queue`)
- **Set** — enforces uniqueness via `equals`/`hashCode`: `HashSet` (backed by a `HashMap`), `TreeSet` (implements `SortedSet`/`NavigableSet`, keeps elements sorted, O(log n)), `LinkedHashSet` (preserves insertion order)
- **Queue** — first-in, first-out (FIFO) ordering: `LinkedList` (also a list, less efficient), `ArrayDeque` (resizable array, pure queue/double-ended queue, more efficient)
- **Map** — key→value, no duplicate keys: `HashMap` (hash table), `TreeMap` (red-black tree, sorted keys, O(log n)), `LinkedHashMap` (preserves insertion order)

<h5 id="comparable" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Comparable&lt;T&gt;</h5>
The sorted structures above — `TreeMap`, `TreeSet`, `Collections.sort()` — all need some way to know which of two elements comes first, and Java offers two distinct mechanisms for supplying that ordering, worth understanding separately since they solve different problems.

**Comparable&lt;T&gt;:** an interface a type implements itself, defining that type's single **natural order**, baked permanently into the class. It requires implementing `int compareTo(T other)`, returning negative if `this < other`, zero if equal, and positive if `this > other` — use `Integer.compare(a, b)` rather than `a - b`, which silently overflows for large values. Only one natural order can exist per class this way, and it's used automatically by `TreeSet`, `TreeMap`, and `Collections.sort()` whenever no comparator is explicitly supplied. Its contract matters for correctness: it must be antisymmetric (`sgn(x.compareTo(y)) == -sgn(y.compareTo(x))`) and transitive, and should ideally be *consistent with equals* (`compareTo == 0` if and only if `equals` returns `true`) — sorted collections judge equality by `compareTo`, not `equals`, so violating consistency produces surprising behavior like a `TreeSet` silently treating two unequal objects as duplicates.

**Comparator&lt;T&gt;:** an interface defining an **external** order, entirely separate from the class itself — any number of different Comparators can exist for one type, without ever touching that type's own code. It requires implementing `int compare(T a, T b)`, following the same sign convention as `compareTo`. Since Java 8, Comparators compose fluently: `Comparator.comparing()`, `thenComparing()`, `reversed()`, `naturalOrder()`, `nullsFirst()`/`nullsLast()` — letting a multi-field sort order be expressed declaratively instead of hand-written.

```java
// Comparable: the type's single natural order, baked into the class
class Player implements Comparable<Player> {
    public int compareTo(Player other) { return Integer.compare(this.score, other.score); }
}

// Comparator: many external orders, composable without touching the class
players.sort(Comparator.comparingInt(Player::score).reversed()   // highest score first…
                       .thenComparing(Player::name));            // …ties broken by name
```

<h5 id="conversions" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Conversions</h5>
- **Arrays**: collection.toArray()
- **List and Set**: List list = Arrays.asList(array)

<h5 id="autoboxing-unboxing-and-the-integer-cache-java-5" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Autoboxing, Unboxing, and the Integer Cache <strong>(Java 5)</strong></h5>
**Autoboxing** converts a primitive to its wrapper automatically (`list.add(42)` → `Integer`); **unboxing** is the reverse. Two traps:
- **Integer cache**: the Java Virtual Machine caches `Integer` instances for **-128 to 127**, so `==` returns `true` for boxed values in that range and `false` outside it — always compare wrappers with `equals()`. The same caching applies to `Boolean`, `Byte`, `Short`, and `Character`.
- **NullPointerException on unboxing**: unboxing a `null` wrapper into a primitive throws — a frequent trap with auto-unboxed ternaries and return types.

```java
Integer a = 100, b = 100;  System.out.println(a == b);   // true  — cached
Integer x = 200, y = 200;  System.out.println(x == y);   // false — distinct objects
System.out.println(x.equals(y));                          // true  — same value
```

<h5 id="varargs-java-5" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Varargs <strong>(Java 5)</strong></h5>
A variable-length argument list (`Type... name`) accepts zero or more values as an array. It must be the **last** parameter, and there can be only one. Inside the method it is a normal array; the caller may pass individual values, an array, or nothing (yielding an empty array, never `null`).

```java
void log(String prefix, Object... args) { /* args is Object[] */ }
log("info", "msg", 42, true);   // three args
log("info");                    // zero args — empty array
```

---

<h2 id="-algorithms" style="font-size:33px;font-weight:800;margin:30px 0 12px;">📘 Algorithms</h2>

A precise, practical reference for the core algorithmic paradigms used in interviews,
competitive programming, and real-world software engineering:

1. **Recursion**
2. **Greedy**
3. **Backtracking**
4. **Graph Algorithms**
5. **Dynamic Programming**

**Interview-process technique, not trivia**: a five-step framework for approaching any unfamiliar coding question — listen for constraints hidden in the prompt, work a concrete example by hand before coding, state the brute-force solution out loud first, optimize deliberately (time first, then space), then implement and verify against edge cases — pairs with five general algorithm-design approaches worth having ready: examplify (work small examples until a pattern emerges), pattern-match (recognize the problem as a known shape), simplify-and-generalize (solve an easier version first, then generalize back), base-case-and-build (solve for n=1, then n=2, and look for the recursive step), and data-structure-brainstorm (ask which structure's strengths match the problem's access pattern).

Each chapter explains: what it is, when to use it, how it works mechanically,
its time/space complexity, common pitfalls, and a runnable Java reference class
located in `src/main/java/algorithm/implementation/<topic>/<Topic>Basics.java`.

<h3 id="recursion" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🔁 Recursion</h3>

Some problems break down naturally into smaller copies of themselves — computing `factorial(5)` is really just `5 * factorial(4)`, and `factorial(4)` is `4 * factorial(3)`, and so on. **Recursion** is a function solving a problem by calling itself on a smaller input, until it reaches a case simple enough to answer directly.

<h4 id="core-ingredients" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🔁 Core ingredients</h4>
Every recursive function needs three things, and skipping any one of them breaks it. The **base case** is the condition that stops recursion — without one, the function calls itself forever until the stack overflows (`StackOverflowError`). The **recursive case** is the call to itself with a smaller input. And a **progress guarantee** ensures each call actually moves closer to the base case — a recursive call that doesn't shrink the problem never terminates, base case or not.

<h4 id="mental-model--the-call-stack" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🔁 Mental model — the call stack</h4>
Each recursive call pushes a new stack frame onto the Java Virtual Machine's call stack, holding that call's own local variables and where to resume once it returns. When the base case finally returns, frames unwind one by one, each combining its own partial result with the one just returned from below:

```
factorial(3)
 └─ 3 * factorial(2)
        └─ 2 * factorial(1)
               └─ 1   ← base case, unwind starts
```

<h4 id="two-flavors" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🔁 Two flavors</h4>
Where the recursive call sits relative to the rest of the function's work matters. **Head recursion** makes the recursive call *before* doing its own work — the factorial example above, where the multiplication happens only after the recursive call returns. **Tail recursion** makes the recursive call the *last* operation, with nothing left to do afterward. Some languages optimize tail recursion into a loop internally, reusing one stack frame instead of growing the stack — Java does not, so even a tail-recursive function still risks a stack overflow on deep input.

<h4 id="complexity" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🔁 Complexity</h4>
A recursive function's time complexity comes from its recurrence relation — how the cost of solving a problem of size n relates to the cost of the smaller subproblems it calls. `T(n) = T(n-1) + O(1)` — one recursive call, constant extra work — resolves to O(n). `T(n) = 2·T(n-1) + O(1)` — two recursive calls per level, as in naive Fibonacci — resolves to O(2ⁿ), since the number of calls doubles at every level. Space complexity is O(depth of recursion), since every unreturned call still holds its own stack frame.

<h4 id="recurrence-analysis--the-master-theorem-divide-and-conquer-shortcut" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🔁 Recurrence analysis — the Master Theorem (divide-and-conquer shortcut)</h4>
Most divide-and-conquer recurrences have the form `T(n) = a·T(n/b) + f(n)`, where `a` = number of subproblems, `b` = factor the input shrinks by, and `f(n)` = work done outside the recursive calls. Compare `f(n)` against `n^(log_b a)`:

| Case | Condition | Result |
|---|---|---|
| **1** | `f(n)` grows *slower* than `n^(log_b a)` | `T(n) = Θ(n^(log_b a))` |
| **2** | `f(n)` grows at the *same rate* as `n^(log_b a)` | `T(n) = Θ(n^(log_b a) · log n)` |
| **3** | `f(n)` grows *faster* than `n^(log_b a)` | `T(n) = Θ(f(n))` |

- Merge sort: `T(n) = 2·T(n/2) + Θ(n)` → Case 2 → **O(n log n)**
- Binary search: `T(n) = T(n/2) + O(1)` → Case 2 → **O(log n)**
- Naïve Fibonacci: `T(n) = 2·T(n-1) + O(1)` → does not fit the theorem (it shrinks by subtraction, not division); solve by expansion → **O(2ⁿ)**

<h4 id="when-to-use" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🔁 When to use</h4>
✅ Tree/graph traversal, divide & conquer, problems with naturally recursive structure.
❌ Avoid when iterative solution is trivial OR depth can exceed ~10 000 (stack risk).

<h4 id="common-pitfalls" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🔁 Common pitfalls</h4>
- Forgetting the base case → `StackOverflowError`.
- Wrong base case (off-by-one).
- Recomputing the same subproblems → fix with **memoization** (see the Dynamic Programming section).

📁 **See:** [src/main/java/algorithm/implementation/recursion/RecursionBasics.java](../src/main/java/algorithm/implementation/recursion/RecursionBasics.java)

<h3 id="greedy" style="font-size:26px;font-weight:700;margin:26px 0 10px;">💰 Greedy</h3>

Recursion above breaks a problem into subproblems and solves them all; a **greedy** algorithm instead builds a solution piece by piece, at each step picking whatever option looks best *right now*, and never revisiting that choice afterward. This is far cheaper than exploring every possibility, but it only works when getting the best answer locally at each step provably leads to the best answer overall — which isn't true for every problem.

A greedy approach is only correct when a problem has both of two properties. The **greedy choice property** means a globally optimal solution can always be reached by making the locally optimal choice at each step, without ever needing to reconsider it. **Optimal substructure** means the optimal solution to the whole problem is built from optimal solutions to its subproblems. If a problem can't be shown to have both, greedy may silently give a wrong answer — Dynamic Programming or Backtracking, covered further below, are the fallback when it can't be proven.

<h4 id="classic-correct-greedy-problems" style="font-size:20px;font-weight:700;margin:22px 0 8px;">💰 Classic correct greedy problems</h4>
Some well-known problems genuinely have the greedy-choice and optimal-substructure properties, which is why greedy is the standard solution for them:
- **Activity selection** — pick non-overlapping intervals by sorting by end time.
- **Huffman coding** — always merge the two least-frequent nodes.
- **Dijkstra's shortest path** (non-negative weights) — always expand the closest unvisited node.
- **Coin change with canonical coin systems** (US dollar, euro) — always take the largest coin that fits.

<h4 id="classic-greedy-failures" style="font-size:20px;font-weight:700;margin:22px 0 8px;">💰 Classic greedy <em>failures</em></h4>
Other problems look superficially similar but lack one of the two required properties, and greedy silently gives a wrong answer on them:
- **Coin change with arbitrary denominations** (coins `{1, 3, 4}`, amount 6) — greedy picks `4 + 1 + 1` (3 coins), but the optimal answer is `3 + 3` (2 coins). Dynamic Programming is needed here instead.
- **0/1 Knapsack** — greedy by value/weight ratio fails to find the optimal selection; Dynamic Programming is needed here too.

<h4 id="algorithm-template" style="font-size:20px;font-weight:700;margin:22px 0 8px;">💰 Algorithm template</h4>
```
sort or prioritize the input
for each element in order:
    if it can be added without violating constraints:
        add it to the solution
return solution
```
Complexity is usually dominated by the sort: O(n log n).

<h4 id="how-to-prove-a-greedy-algorithm-correct--the-exchange-argument" style="font-size:20px;font-weight:700;margin:22px 0 8px;">💰 How to prove a greedy algorithm correct — the exchange argument</h4>
Knowing a problem has the two required properties in principle isn't the same as proving it for a specific problem. **The exchange argument** is the standard technique: assume an optimal solution `OPT` that differs from the greedy solution `G`, find the first position where they differ, and show that swapping `OPT`'s choice at that position for `G`'s choice never makes `OPT` worse. Repeating this swap step by step eventually turns `OPT` into `G` without ever losing optimality along the way — which proves `G` was optimal all along.

Worked for activity selection: sort by finish time. If `OPT` picks activity `x` where greedy picks `y` with an earlier-or-equal finish time, swapping `x` for `y` in `OPT` still leaves room for every later activity `OPT` had already chosen, so the swap makes `OPT` no worse. Repeating this swap across every point of divergence shows the greedy order is optimal.

📁 **See:** [src/main/java/algorithm/implementation/greedy/GreedyBasics.java](../src/main/java/algorithm/implementation/greedy/GreedyBasics.java)

<h3 id="backtracking" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🔙 Backtracking</h3>

Some problems have no greedy shortcut and no obvious way to skip trying possibilities — placing N queens on a board so none attack each other, for instance, genuinely requires exploring combinations. Trying every combination outright is often too slow, though, since the number of combinations grows exponentially with the problem's size.

**Backtracking** is a refined brute-force search: it builds a candidate solution incrementally, and the moment it determines a partial candidate cannot possibly lead to a valid solution, it abandons ("backtracks" from) that candidate immediately, rather than continuing to build on top of a doomed choice.

<h4 id="mental-model--dfs-through-a-decision-tree" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🔙 Mental model — DFS through a decision tree</h4>
Backtracking explores a state-space tree depth-first, where each node represents a partial solution and each edge represents one possible next choice:

```
              [ ]
           /   |   \
         [1]  [2]  [3]
         / \   |    |
      [1,2][1,3][2,3] ...
```

At each node, three steps repeat: **choose** an option, **explore** by recursing with that choice applied, then **un-choose** by undoing it before trying the next option — that undo step is exactly what "backtracking" refers to, and it's what lets the same recursive call try every sibling option in turn without them interfering with each other:

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

A naive search visits every node of this tree, O(branching^depth) of them. **Pruning** is what makes backtracking faster than that in practice: checking a constraint *before* recursing into a subtree, and skipping that entire subtree outright if the constraint is already violated — cutting off a whole branch of possibilities in one check, rather than discovering the violation deep inside it. Worst-case complexity is still exponential, but pruning shrinks the average case dramatically.

<h4 id="pruning-techniques-in-practice" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🔙 Pruning techniques in practice</h4>
- **Feasibility pruning** (check before recursing): reject a choice that already violates a hard constraint — for example, in N-Queens verify the column and both diagonals are free before placing the next queen. The most common and most effective form, and it is free because you must validate anyway.
- **Bound pruning (branch-and-bound)**: compute an optimistic best-possible value reachable from the current partial state; if it cannot beat the best complete solution found so far, discard the whole subtree. Used in optimization problems (e.g. 0/1 knapsack by backtracking).
- **Symmetry pruning**: skip states that are rotations or reflections of ones already explored (e.g. the symmetric N-Queens first-row placements).
- **Duplicate elimination**: when choices may repeat (permutations of a multiset), skip a value already tried at the same recursion depth.

<h4 id="classic-problems" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🔙 Classic problems</h4>
- **N-Queens** — place N queens on an N×N board.
- **Sudoku solver**.
- **Permutations / combinations / subsets**.
- **Word search in a grid**.
- **Hamiltonian path**.

<h4 id="recursion-vs-backtracking" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🔙 Recursion vs. Backtracking</h4>
All backtracking is recursion, but not all recursion is backtracking — the distinguishing feature is that backtracking specifically undoes state to explore alternative choices, rather than just computing and returning a value the way ordinary recursion does.

Worst-case complexity is O(b^d), where b is the branching factor and d is the depth of the decision tree — the same exponential bound a naive brute-force search would have. Pruning makes the *average* case far better in practice, but that improvement is hard to bound formally, since it depends entirely on how early and how often constraints eliminate a subtree.

📁 **See:** [src/main/java/algorithm/implementation/backtracking/BacktrackingBasics.java](../src/main/java/algorithm/implementation/backtracking/BacktrackingBasics.java)

<h3 id="graph-algorithms" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🕸️ Graph Algorithms</h3>

> **Definition:** Algorithms operating on graphs `G = (V, E)` — sets of vertices `V`
> connected by edges `E`. Graphs model networks, dependencies, maps, social
> connections, etc.

<h4 id="graph-representations" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🕸️ Graph representations</h4>

| Representation        | Space      | Edge lookup | Best for                    |
|-----------------------|------------|-------------|-----------------------------|
| **Adjacency Matrix**  | O(V²)      | O(1)        | Dense graphs, small V       |
| **Adjacency List**    | O(V + E)   | O(degree)   | Sparse graphs (most cases)  |
| **Edge List**         | O(E)       | O(E)        | Algorithms iterating edges  |

<h4 id="graph-types" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🕸️ Graph types</h4>
- **Directed** vs **Undirected**
- **Weighted** vs **Unweighted**
- **Cyclic** vs **Acyclic** (DAG = Directed Acyclic Graph)
- **Connected** vs **Disconnected**

<h4 id="the-two-foundational-traversals" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🕸️ The two foundational traversals</h4>

<h5 id="bfs--breadth-first-search" style="font-size:16px;font-weight:600;margin:18px 0 7px;">BFS — Breadth-First Search</h5>
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

<h5 id="dfs--depth-first-search" style="font-size:16px;font-weight:600;margin:18px 0 7px;">DFS — Depth-First Search</h5>
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

<h4 id="other-essential-algorithms-named-not-all-implemented-in-the-basics-file" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🕸️ Other essential algorithms (named, not all implemented in the basics file)</h4>
| Algorithm                  | Purpose                              | Complexity      |
|----------------------------|--------------------------------------|-----------------|
| **Dijkstra**               | Shortest path, non-negative weights  | O((V+E) log V)  |
| **Bellman-Ford**           | Shortest path, allows negative edges | O(V·E)          |
| **Floyd-Warshall**         | All-pairs shortest paths             | O(V³)           |
| **Kruskal / Prim**         | Minimum Spanning Tree                | O(E log E)      |
| **Topological Sort**       | Order DAG vertices                   | O(V + E)        |
| **Union-Find**             | Disjoint sets / cycle detection      | ~O(α(n))        |

<h4 id="named-graph-algorithms--mechanics" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🕸️ Named graph algorithms — mechanics</h4>

<h5 id="dijkstra--single-source-shortest-path-non-negative-weights" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Dijkstra — single-source shortest path (non-negative weights)</h5>
Breadth First Search generalized with a min-priority queue: always expand the *closest* unsettled vertex (the greedy step), and for each neighbour apply **edge relaxation** — if `dist[u] + w(u,v) < dist[v]`, lower `dist[v]` and re-enqueue `v`.

```
dist[] = ∞;  dist[source] = 0;  pq = {(0, source)}
while pq not empty:
    (d, u) = pq.poll()                 // closest vertex
    for each edge u → v of weight w:
        if dist[u] + w < dist[v]:
            dist[v] = dist[u] + w
            pq.offer((dist[v], v))
```
- **Fails on negative edges**: a vertex already settled might later be reachable more cheaply, and Dijkstra never revisits it.
- **Complexity**: O((V + E) log V) with a binary-heap priority queue.

<h5 id="bellman-ford--single-source-shortest-path-negative-weights-allowed" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Bellman-Ford — single-source shortest path (negative weights allowed)</h5>
Relax *every* edge `V − 1` times; after `k` rounds, `dist[v]` is the shortest path using at most `k` edges (a shortest simple path uses at most `V − 1` edges). One extra round that still improves a distance proves a **negative-weight cycle**.
```
dist[] = ∞;  dist[source] = 0
repeat (V-1) times:
    for each edge (u, v, w):  if dist[u] + w < dist[v]: dist[v] = dist[u] + w
for each edge (u, v, w):      if dist[u] + w < dist[v]: → negative cycle
```
- **Complexity**: O(V · E).

<h5 id="topological-sort--ordering-a-directed-acyclic-graph" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Topological sort — ordering a Directed Acyclic Graph</h5>
Two equivalent O(V + E) approaches:
- **Depth First Search-based**: run a Depth First Search; when a vertex finishes (all descendants visited), prepend it to the result list.
- **Kahn's algorithm (in-degree, Breadth First Search-based)**: enqueue all in-degree-0 vertices; repeatedly dequeue one into the result and decrement its neighbours' in-degrees, enqueuing any that reach 0. If fewer than `V` vertices come out, the graph has a cycle.
- **Uses**: dependency resolution, course prerequisites, build ordering, compiler scheduling.

<h5 id="union-find-for-graphs" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Union-Find for graphs</h5>
The disjoint-set structure (full detail under [Data Structures → Union-Find](#union-find-disjoint-set-union)) drives **Kruskal's minimum spanning tree** (add the next-cheapest edge unless its endpoints are already connected — which would form a cycle), **connected-components** counting, and **cycle detection in undirected graphs**, each at effectively O(α(n)) per operation. **Prim's algorithm** solves the same minimum-spanning-tree problem by growing a single tree from an arbitrary start vertex instead of sorting all edges up front — same greedy-is-provably-optimal property as Kruskal's, generally preferred on dense graphs where Kruskal's edge sort dominates.

**Shortest-path decision tree** (a strong one-line answer for "which algorithm would you use"): unweighted graph → Breadth First Search; non-negative weights → Dijkstra; possible negative weights, no negative cycle → Bellman-Ford; need all-pairs distances → Floyd-Warshall; single target and a good admissible heuristic available → A* (Dijkstra plus a `cost-so-far + estimated-cost-to-go` priority, provably optimal as long as the heuristic never overestimates).

📁 **See:** [src/main/java/algorithm/implementation/graphs/GraphBasics.java](../src/main/java/algorithm/implementation/graphs/GraphBasics.java)

<h3 id="dynamic-programming" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🧩 Dynamic Programming</h3>

> **Definition:** Solve complex problems by breaking them into **overlapping
> subproblems**, solving each subproblem **once**, and **storing** the results
> for reuse.

<h4 id="when-to-use-dynamic-programming--the-two-required-properties" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🧩 When to use Dynamic Programming — the two required properties</h4>
1. **Optimal substructure** — optimal solution can be built from optimal solutions
   of subproblems.
2. **Overlapping subproblems** — the same subproblems are solved multiple times by
   plain recursion.

If a problem only has #1 (no overlap), use **divide-and-conquer** (e.g., merge sort).

<h4 id="the-two-dynamic-programming-styles" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🧩 The two Dynamic Programming styles</h4>

<h5 id="top-down-memoization" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Top-Down (Memoization)</h5>
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

<h5 id="bottom-up-tabulation" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Bottom-Up (Tabulation)</h5>
- Define a **table** `dp[]` indexed by subproblem.
- Fill it iteratively from the smallest subproblem upward.
- Pros: no recursion, often more memory-efficient (rolling arrays possible).
- Cons: must figure out fill order; computes states even if unused.

```java
dp[0] = base0; dp[1] = base1;
for (int i = 2; i <= n; i++) {
    dp[i] = dp[i-1] + dp[i-2];
}
return dp[n];
```

<h4 id="how-to-design-a-dynamic-programming-solution-5-step-recipe" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🧩 How to design a Dynamic Programming solution (5-step recipe)</h4>
1. **Define the state** — what does `dp[i]` (or `dp[i][j]`) mean? Be precise.
2. **Write the recurrence** — express `dp[i]` in terms of smaller states.
3. **Identify the base cases**.
4. **Decide the iteration order** (topological order of state dependencies).
5. **Read the answer** from the table (often `dp[n]`).

<h4 id="classic-problems-1" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🧩 Classic problems</h4>
| Problem                       | State                              |
|-------------------------------|------------------------------------|
| Fibonacci                     | `dp[i]` = i-th Fibonacci number    |
| Climbing stairs               | `dp[i]` = ways to reach step i     |
| Coin change (min coins)       | `dp[a]` = min coins for amount a   |
| 0/1 Knapsack                  | `dp[i][w]` = max value using first i items, capacity w |
| Longest Common Subsequence    | `dp[i][j]` = LCS of A[..i], B[..j] |
| Edit distance                 | `dp[i][j]` = ops to convert A[..i] → B[..j] |

<h4 id="classic-recurrences-what-you-write-on-the-whiteboard" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🧩 Classic recurrences (what you write on the whiteboard)</h4>
| Problem | Recurrence |
|---|---|
| Fibonacci | `dp[i] = dp[i-1] + dp[i-2]` |
| Climbing stairs | `dp[i] = dp[i-1] + dp[i-2]` (ways to reach step i) |
| 0/1 Knapsack | `dp[i][w] = max(dp[i-1][w], dp[i-1][w-wt[i]] + val[i])` if `wt[i] ≤ w`, else `dp[i-1][w]` |
| Coin change (min coins) | `dp[a] = min(dp[a-coin] + 1)` over each `coin ≤ a`; base `dp[0] = 0` |
| Longest Common Subsequence | `dp[i][j] = dp[i-1][j-1] + 1` if chars match, else `max(dp[i-1][j], dp[i][j-1])` |
| Edit distance | `dp[i][j] = dp[i-1][j-1]` if chars match, else `1 + min(dp[i-1][j], dp[i][j-1], dp[i-1][j-1])` |
| Longest Increasing Subsequence | `dp[i] = 1 + max(dp[j])` over all `j < i` with `arr[j] < arr[i]`; base `dp[i] = 1` |

<h4 id="complexity-3" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🧩 Complexity</h4>
Usually **O(states × transitions per state)**. E.g., 1D problem with constant
transition → O(n).

<h4 id="recursion-vs-memoization-vs-tabulation" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🧩 Recursion vs. Memoization vs. Tabulation</h4>
| Approach          | Time     | Space     | Style    |
|-------------------|----------|-----------|----------|
| Naive recursion   | O(2ⁿ)    | O(n) stack| Top-down |
| Memoization       | O(n)     | O(n)      | Top-down |
| Tabulation        | O(n)     | O(n)      | Bottom-up|
| Tabulation rolling| O(n)     | **O(1)**  | Bottom-up|

📁 **See:** [src/main/java/algorithm/implementation/dynamic/DynamicBasics.java](../src/main/java/algorithm/implementation/dynamic/DynamicBasics.java)

<h3 id="quick-comparison-table" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🆚 Quick Comparison Table</h3>

| Paradigm     | Strategy                                | Typical Complexity      | Use when…                                   |
|--------------|-----------------------------------------|-------------------------|---------------------------------------------|
| Recursion    | Self-call until base case               | varies                  | Problem is naturally self-similar           |
| Greedy       | Always take local-best choice           | O(n log n)              | Problem has greedy-choice + opt. substruct. |
| Backtracking | DFS with prune & undo                   | O(b^d)                  | Need to enumerate / find valid configs      |
| Graph algos  | Traverse vertices/edges (BFS/DFS/etc.)  | O(V + E) typical        | Data has nodes & relationships              |
| Dynamic Prog.| Memoize / tabulate overlapping subprobs | O(states × transitions) | Optimal substruct. + overlapping subprobs   |

<h4 id="how-to-run-any-example" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🆚 How to run any example</h4>

From the project root (with the project compiled into `bin/`):
```bash
java -cp bin algorithm.implementation.recursion.RecursionBasics
java -cp bin algorithm.implementation.greedy.GreedyBasics
java -cp bin algorithm.implementation.backtracking.BacktrackingBasics
java -cp bin algorithm.implementation.graphs.GraphBasics
java -cp bin algorithm.implementation.dynamic.DynamicBasics
```

Or simply run each class in your IDE — they all have a `claude.py` method that
prints the demo output.

<h3 id="appendix--big-o--algorithm-categories-quick-reference" style="font-size:26px;font-weight:700;margin:26px 0 10px;">📎 Appendix — Big O &amp; Algorithm Categories (Quick Reference)</h3>

<h4 id="big-o-notation" style="font-size:20px;font-weight:700;margin:22px 0 8px;">📎 Big O Notation</h4>
Notation to measure algorithm efficiency in terms of time and space complexity

- **O(1) Constant**: Time regardless of input size. Example: Array access by index, hash table lookup
- **O(log n) Logarithmic**: Grows slower than input size, divides problem in half each step. Example: Binary search, balanced tree operations
- **O(n) Linear**: Grows proportionally with input size. Example: Single loop, linear search
- **O(n log n) Linearithmic**: Efficient sorting algorithms. Example: Merge sort, quick sort (average), heap sort
- **O(n²) Quadratic**: Nested loops over input. Example: Bubble sort, selection sort, naive string matching
- **O(2ⁿ) Exponential**: Doubles with each input increase. Example: Recursive fibonacci, power set generation
- **O(n!) Factorial**: Grows extremely fast. Example: Generating all permutations, traveling salesman (brute force)

<h5 id="companion-notations-the-full-picture" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Companion notations (the full picture)</h5>
Big-O alone is only an *upper* bound. The full family:

| Notation | Meaning | When it is used |
|---|---|---|
| **O(f(n))** (Big-O) | Upper bound — runs *at most* this fast | The everyday meaning of "time complexity" |
| **Ω(f(n))** (Big-Omega) | Lower bound — runs *at least* this fast | Proving optimality (e.g. comparison sorting is Ω(n log n)) |
| **Θ(f(n))** (Big-Theta) | Tight bound — upper *and* lower bound coincide | The most precise claim (e.g. merge sort is Θ(n log n) in every case) |

<h5 id="amortized-and-space-complexity" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Amortized and space complexity</h5>
- **Amortized complexity** — the average cost per operation across a long sequence, even if individual operations occasionally spike. `ArrayList.add` is O(n) on the resize step but **O(1) amortised**, because the doubling cost is spread over the preceding cheap adds; `HashMap.put` is O(1) amortised including occasional rehashing.
- **Space complexity** — auxiliary memory beyond the input: in-place sorts (heap sort, quicksort) use O(1); merge sort uses O(n) for the merge buffer; recursive Depth First Search uses O(V) stack depth; a Dynamic Programming table uses O(states), often reducible with rolling arrays (Fibonacci in O(1)).

<h4 id="algorithm-categories" style="font-size:20px;font-weight:700;margin:22px 0 8px;">📎 Algorithm Categories</h4>

<h5 id="string-manipulation" style="font-size:16px;font-weight:600;margin:18px 0 7px;">String Manipulation</h5>
- **What**: Algorithms that process, transform, or analyze strings
- **Techniques**: Character frequency counting, sliding window, two pointers
- **Examples**: Palindromes, anagrams, reverse string, longest palindrome, valid anagram, string compression

<h5 id="multiple-pointers" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Multiple Pointers</h5>
- **What**: Use two or more pointers to iterate through data structure
- **Use cases**: Sorted arrays, linked lists, finding pairs/triplets
- **Complexity**: Often reduces O(n²) to O(n)
- **Examples**: Two pointers (start/end), fast/slow pointers, two sum (sorted), remove duplicates, container with most water, cycle detection

<h5 id="hashtables" style="font-size:16px;font-weight:600;margin:18px 0 7px;">HashTables</h5>
- **What**: Use hash map/set for O(1) lookup to optimize solutions
- **Trade-off**: Space O(n) for time O(1) lookup
- **Examples**: Frequency counting, caching results, two sum, group anagrams, contains duplicate, longest substring without repeating chars

<h5 id="sliding-window" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Sliding Window</h5>
- **What**: Maintain a window that slides through array/string
- **Complexity**: O(n) instead of O(n²)
- **Examples**: Fixed-size window, variable-size window, maximum sum subarray, longest substring without repeating, minimum window substring

<h5 id="greedy-1" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Greedy</h5>
- **What**: Make locally optimal choice at each step
- **When to use**: When local optimum leads to global optimum
- **Note**: Doesn't always work, need to prove correctness
- **Examples**: Activity selection, coin change, interval scheduling, jump game, gas station, meeting rooms

<h5 id="backtracking-1" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Backtracking</h5>
- **What**: Explore all possibilities by building solution incrementally
- **Complexity**: Often exponential O(2ⁿ) or O(n!)
- **Examples**: Permutations, combinations, subsets, constraint satisfaction, N-Queens, sudoku solver, generate parentheses, word search

<h5 id="divide-and-conquer" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Divide and Conquer</h5>
- **What**: Break problem into smaller subproblems, solve recursively, combine results
- **Complexity**: Often O(n log n)
- **Examples**: Split in half/solve/merge, merge sort, quick sort, binary search, closest pair of points

<h5 id="bit-manipulation" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Bit Manipulation</h5>
- **What**: Use bitwise operations for optimization
- **Operations**: AND (&), OR (|), XOR (^), NOT (~), shifts (<<, >>)
- **Tricks**: XOR for finding unique, AND for checking bits
- **Examples**: Set operations, single number, counting bits, power of two, reverse bits
- **`x & (x - 1)`** clears the lowest set bit — loop it to count set bits in O(k) for k set bits, or test once for "is this a power of two" (`(x & (x - 1)) == 0`)
- **`x & -x`** isolates the lowest set bit (two's-complement negation) — the alternative power-of-two test (`(x & -x) == x`) and a common primitive in bitmask dynamic programming and Fenwick/Binary Indexed Trees
- `Integer.bitCount()` / `Long.bitCount()`, `highestOneBit()`, `numberOfLeadingZeros()`/`numberOfTrailingZeros()` reach for JDK-optimized (often hardware-accelerated) implementations of exactly these tricks — know the trick so the standard-library method's behavior is never a mystery

<h5 id="prefix-sums" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Prefix Sums</h5>
- **What**: Precompute a running-sum array so the sum of any subarray `[i, j]` is answered in O(1) as `prefix[j+1] - prefix[i]`
- **Complexity**: O(n) preprocessing, O(1) per range query
- **Build**: `prefix[0] = 0; prefix[i] = prefix[i-1] + arr[i-1]`
- **Examples**: range-sum queries, subarray sum equals target (with a HashMap of seen prefixes), 2D matrix prefix sums for rectangle queries

<h5 id="graphs" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Graphs</h5>
- **What**: Algorithms for traversing and analyzing graphs
- **Data structures**: Adjacency list, adjacency matrix, union-find
- **Examples**: DFS, BFS, topological sort, shortest path, number of islands, course schedule, clone graph, word ladder, cycle detection

<h5 id="dynamic-programming-1" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Dynamic Programming</h5>
- **What**: Break problem into overlapping subproblems, store results
- **Complexity**: Trade space for time
- **Examples**: Top-down (memoization), bottom-up (tabulation), fibonacci, coin change, longest common subsequence, knapsack

<h4 id="sorting" style="font-size:20px;font-weight:700;margin:22px 0 8px;">📎 Sorting</h4>

> 💻 Code: [BubbleSort](../src/main/java/algorithm/implementation/sorting/BubbleSort.java) · [MergeSort](../src/main/java/algorithm/implementation/sorting/MergeSort.java) · [QuickSort](../src/main/java/algorithm/implementation/sorting/QuickSort.java) · [Arrays.sort & comparators](../src/main/java/algorithm/implementation/sorting/ArraysSort.java)

| Algorithm | Idea in one sentence | Time (average) | Stable |
|---|---|---|---|
| **BubbleSort** | Repeatedly swap adjacent elements that are out of order; largest "bubbles" to the end each pass | O(n²) | Yes |
| **SelectionSort** | Repeatedly select the minimum of the unsorted part and move it to the front | O(n²) | No |
| **MergeSort** | Split in halves, sort each recursively, merge the two sorted halves | O(n log n) | Yes |
| **QuickSort** | Pick a pivot, partition smaller/larger around it, recurse on both sides | O(n log n), O(n²) worst | No |
| **InsertionSort** | Grow a sorted prefix; shift each new element left into place | O(n²), O(n) best (nearly sorted) | Yes |
| **HeapSort** | Build a max-heap in place, then repeatedly extract the maximum to the end | O(n log n) average and worst | No |
| **CountingSort** | Count occurrences of each integer key in range [0, k), then rebuild in order (not comparison-based) | O(n + k), O(n + k) worst | Yes |
| **RadixSort** | Stable bucket-sort digit by digit, least-significant first | O(d·(n + k)), same worst | Yes |
| **BucketSort** | Scatter into k range-buckets, sort each, concatenate | O(n + k), O(n²) worst (skewed data) | Yes (with a stable per-bucket sort) |

- *Stable* = elements that compare equal keep their original relative order — it matters when sorting by several keys in sequence
- In practice call `Arrays.sort()` / `List.sort()`: primitives use a tuned quicksort, objects use TimSort (a merge-sort derivative, stable)
- **Comparison sorts cannot beat O(n log n)** in the worst case (a proven lower bound). When keys are bounded integers, the non-comparison sorts break that barrier: CountingSort and BucketSort run in O(n + k), and RadixSort extends this to multi-digit keys in O(d·(n + k))
- **InsertionSort** is the fastest choice for very small or nearly-sorted arrays — TimSort itself falls back to it for short runs
- **HeapSort** guarantees O(n log n) worst case with O(1) extra space, but its poor cache locality usually leaves it slower than quicksort/merge sort in practice

<h4 id="search-iterate-to-find-a-pattern-element" style="font-size:20px;font-weight:700;margin:22px 0 8px;">📎 Search: Iterate to find a pattern, element</h4>

> 💻 Code: [BinarySearch](../src/main/java/algorithm/implementation/search/BinarySearch.java) · [BreadthFirstSearch](../src/main/java/algorithm/implementation/search/bfs/BreadthFirstSearch.java) · [DepthFirstSearch](../src/main/java/algorithm/implementation/search/dfs/DepthFirstSearch.java) · [Tree traversals](../src/main/java/algorithm/implementation/trees/BreadthFirstSearch.java)
- **Linear search**: scan every element; O(n) time, O(1) space; the only option on unsorted data
- **Binary search**: needs a sorted, random-access structure; halve the search space each step; O(log n) time, O(1) space iterative (`lo=0, hi=n-1; mid=(lo+hi)>>>1; compare and move lo or hi`)
- **Depth First Search**: explores as deep as possible along a branch before backtracking; uses a call stack (recursion) or an explicit Stack; O(V + E) time, O(V) space; used for cycle detection, topological sort, connected components, path finding
- **Breadth First Search**: explores all neighbours at the current depth before going deeper; uses a Queue; O(V + E) time, O(V) space; finds the shortest path in unweighted graphs and trees
- Applies across: Graphs, Trees, matrices (each cell is a node), Recursion, Dynamic Programming

---

<h2 id="-programming-languages" style="font-size:33px;font-weight:800;margin:30px 0 12px;">💻 Programming Languages</h2>

A backend engineer is rarely single-language anymore. This section covers the three that matter most on the Java Virtual Machine and beyond, ordered from the one you know deepest to the one most different:

- **Java** — the primary language here, covered in full, with its two hardest sub-topics (concurrency and exception handling) as dedicated deep dives nested underneath it.
- **Kotlin** — the modern JVM language: same bytecode and full Java interop, but concise and null-safe.
- **Python** — the dynamically-typed counterpoint: the language of scripting, data, and machine learning.

The goal is not to relearn programming three times, but to map concept you already own onto each language's idioms and trade-offs.

<h3 id="java" style="font-size:26px;font-weight:700;margin:26px 0 10px;">☕ Java</h3>

> 🏷️ **Version markers** like **(Java 8)** indicate the release that introduced the feature — it remains available in every later version. They are placed next to the feature wherever it appears, not grouped into a "by version" section.

<h4 id="core" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🧠 Core</h4>

<h5 id="class-loading" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Class Loading</h5>
Java does not execute source code directly: `javac` compiles it into **bytecode**, a platform-independent intermediate format, and the Java Virtual Machine (JVM) turns that bytecode into real instructions for the machine it runs on — which is exactly what lets the same compiled artifact run unchanged on Windows, Linux, or macOS. A class does not exist in memory until something first needs it; at that point a **class loader** locates the `.class` file, verifies the bytecode is well-formed (blocking corrupted or tampered code), and links it into a usable in-memory structure.
- **Three-level hierarchy**: the **Bootstrap** class loader (native code, has no parent, loads the core Java Runtime Environment classes), the **Platform** class loader **(Java 9+; called the Extension class loader before Java 9)** (loads Java Platform application programming interface classes), and the **Application/System** class loader (loads classes from the application's classpath) — the names changed with Java 9's modular run-time images (JEP 220), not just the mechanism it replaced
- **Delegation model**: before loading a class itself, every class loader first asks its parent to try, and only loads it locally if the parent fails — this guarantees a given class is never loaded twice in an inconsistent way, and is the mechanism that makes application-server and plugin isolation possible
- Connects directly to `NoClassDefFoundError` in the [Exceptions](#exceptions) table below: the class loader saw the class at compile time but cannot locate it at runtime

<h5 id="memory-management" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Memory Management</h5>
- **Heap**: Stores objects; shared by all threads
- **Stack**: Stores method frames, local variables and references; one stack per thread

<h5 id="garbage-collection" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Garbage Collection</h5>
- **Generational hypothesis**: Most objects die young, so the heap is split into generations
  - **Young generation**: New objects; collected often and cheaply (minor collections)
  - **Old generation**: Long-lived survivors; collected rarely and expensively (major collections)
- **Garbage First Garbage Collector (G1GC)** **(Java 7; default since Java 9)**: The default collector; divides the heap into regions and targets a pause-time goal
- **Z Garbage Collector (ZGC)** **(Java 11 experimental; production-ready Java 15)**: For very low latency requirements; sub-millisecond pauses even on large heaps
- **Choosing between them is a throughput-versus-latency trade-off, not an aesthetic choice**: a batch reporting job cares about total work done and tolerates a pause, so it favors throughput-oriented settings; a low-latency trading system cannot tolerate a multi-millisecond pause even at the cost of some raw throughput, so it favors ZGC
- **Mark-sweep, from first principles**: mark phase treats every heap object as a graph vertex and every reference as an edge, then runs a graph traversal from the **root objects** (references live on any running thread's stack) to find every reachable ("live") object; sweep phase reclaims everything unmarked. A naive *recursive* mark implementation would itself consume stack space proportional to the reference graph's depth — exactly the wrong property to have while memory is already under pressure, which is why production collectors implement the traversal iteratively rather than via language-level recursion

<h5 id="common-memory-leaks-in-java" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Common Memory Leaks in Java</h5>
- Static collections that only grow and are never cleaned
- Unclosed resources (streams, connections) — prevented with try-with-resources **(Java 7)**
- `ThreadLocal` values in thread pools (pool threads never die, so their values are never released)
- Listeners or callbacks registered but never unregistered

<h5 id="diagnosing-outofmemoryerror" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Diagnosing OutOfMemoryError</h5>
- Take a heap dump and inspect it: `jmap`, VisualVM, Eclipse Memory Analyzer
- Monitor garbage collection statistics live with `jstat`

<h5 id="string-immutability" style="font-size:16px;font-weight:600;margin:18px 0 7px;">String Immutability</h5>

> 💻 Code: [StringPools](../src/main/java/algorithm/implementation/strings/StringPools.java) · [ImmutableTest](../src/main/java/algorithm/concepts/oop/immutability/ImmutableTest.java)
String is immutable by design, for three reasons:
- **Security**: Values such as file paths or connection parameters cannot be altered after validation
- **Caching**: The **string pool** can safely share one instance between many references, and the hash code is computed once then reused
- **Thread safety**: An immutable object can be shared between threads without any synchronization

<h4 id="oop" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🧬 OOP</h4>

> 💻 Code: [Polymorphism](../src/main/java/algorithm/concepts/oop/Polymorphism.java) · [PlayWithAnimal](../src/main/java/algorithm/concepts/oop/polimorfism/PlayWithAnimal.java) · [AbstractClassTest](../src/main/java/algorithm/concepts/oop/abstractclasses/AbstractClassTest.java) · [Interfaces](../src/main/java/algorithm/concepts/oop/interfaces/MyImpl.java) · [Default methods](../src/main/java/algorithm/concepts/oop/defaults/DefaultImpl.java)

<h5 id="four-pillars" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Four Pillars</h5>
- **Inheritance**: A class reuses and extends another class (`extends`); the subclass inherits fields and methods and can specialize behavior. Prefer it for true "is-a" relationships only — otherwise favor composition
- **Encapsulation**: Fields are private, access goes through methods; the class controls its own invariants and can change its internals without breaking callers
- **Polymorphism**: The same call (`animal.speak()`) executes different behavior depending on the actual object behind the reference — the mechanism that lets code depend on abstractions
- **Abstraction**: Expose *what* a type does (interface, abstract class), hide *how* it does it — callers program against the contract, not the implementation

<h5 id="interface-vs-abstract-class" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Interface vs Abstract Class</h5>
| | Abstract class | Interface |
|---|---|---|
| **Instantiation** | Cannot be instantiated directly (must be extended) | Cannot be instantiated directly (must be implemented) |
| **State (fields)** | Can hold instance variables of any access level | Constants only (`public static final`, implicitly) |
| **Constructor** | Has a constructor, invoked by the subclass via `super()` | Has no constructor |
| **Method bodies** | Concrete methods of any access level | `default` and `static` methods **(Java 8)**; everything else is `public abstract` implicitly |
| **Inheritance** | Single — a class may `extends` only one | Multiple — a class may `implements` many |
| **When to use** | Shared state + shared implementation behind a strong "is-a" (e.g. `AbstractList`) | A contract with no implied state — the preferred tool for loose coupling |

Rule of thumb: **program to interfaces, not implementations**. When torn between the two, choose the interface — it leaves the single-inheritance slot free and allows many implementations without coupling.

<h5 id="key-concept-reference-type-vs-object-type" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Key Concept: reference type vs object type</h5>
```java
Animal a = new Lion();   // reference type: Animal — object type: Lion
```
- The **compiler** checks calls against the REFERENCE type (left side): only methods declared in `Animal` are visible
- The **runtime** executes the OBJECT's version (right side): if `Lion` overrides `speak()`, the lion's version runs (dynamic dispatch)

<h5 id="override-vs-overload" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Override vs Overload</h5>
- **Override**: same signature redefined in a subclass → resolved at RUNTIME from the object's actual type (dynamic dispatch)
- **Overload**: same method name, different parameter lists in the same class → resolved at COMPILE time from the declared types of the arguments
- **Overload resolution order** when several overloads could match a call: exact type match → widening primitive conversion → autoboxing → varargs (last resort) — a call that "looks like" it should hit the varargs overload silently binds to a boxing or widening overload instead whenever one exists
- **The four compiler checks on a valid override**: same signature (a different parameter list makes it an overload instead, and none of the following rules apply); equal or wider accessibility than the parent method; no new or broader checked exception than the parent declares; covariant return type (same type or a subtype of the parent's). Getting rule 1 wrong is the classic trap — an "override" with a typo'd parameter list silently becomes an unrelated overload, free to have any access modifier or return type, and the compiler won't complain

<h5 id="access-modifiers" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Access Modifiers</h5>
| Modifier | Same class | Same package | Subclass (other package) | Anywhere else |
|---|---|---|---|---|
| `public` | Yes | Yes | Yes | Yes |
| `protected` | Yes | Yes | Yes (through inheritance only) | No |
| *(default / package-private)* | Yes | Yes | No | No |
| `private` | Yes | No | No | No |

A subclass in another package reaches a `protected` member only *through inheritance*, never through a superclass-typed reference. Local variables take no access modifier — the only modifier they allow is `final`.

<h5 id="final-static-and-initialization-order" style="font-size:16px;font-weight:600;margin:18px 0 7px;">final, static, and Initialization Order</h5>
- **`final` variable**: assignable exactly once; a `final` instance field must be set by the end of the constructor; a `final` local is a "blank final" until first assigned
- **`final` method**: cannot be overridden; **`final` class**: cannot be extended (`String` is `final`)
- **`static` member**: belongs to the class, shared across instances, reachable without an object; a `static final` constant is named `ALL_CAPS`
- **Class initialization** (once per load): static fields and `static { }` blocks run top-to-bottom; a throwing static block is wrapped in `ExceptionInInitializerError`
- **Object creation** (every `new`): superclass constructors run first up to `Object` (so `super()` is the first statement), then instance-field initializers and `{ }` blocks top-to-bottom, then the constructor body

```java
class Parent { static { } { } Parent() { } }   // Parent static init → Parent instance init → Parent ctor
class Child extends Parent { static { } { } Child() { } }
// new Child(): Parent static, Child static (once) → Parent instance, Parent ctor → Child instance, Child ctor
```

<h5 id="equalshashcode" style="font-size:16px;font-weight:600;margin:18px 0 7px;">equals()/hashCode()</h5>

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

<h5 id="the-equalshashcode-contract-in-full" style="font-size:16px;font-weight:600;margin:18px 0 7px;">The equals()/hashCode() contract in full</h5>
**`equals()` must be:**
- **Reflexive** — `x.equals(x)` is `true`
- **Symmetric** — `x.equals(y)` implies `y.equals(x)`
- **Transitive** — `x.equals(y)` and `y.equals(z)` imply `x.equals(z)`
- **Consistent** — repeated calls return the same result while the compared fields are unchanged
- **Null-safe** — `x.equals(null)` returns `false`, never throws

**`hashCode()` must be:**
- **Consistent** — same value across calls within one Java Virtual Machine run while the `equals` fields are unchanged
- **Equal-implies-equal** — if `x.equals(y)`, then `x.hashCode() == y.hashCode()`; the converse need not hold (unequal objects may share a hash code — a *collision*)
- It is legal but pathological for every object to return the same constant — the hash collection still works correctly, just degrading to O(n)

<h5 id="immutability--the-five-rules-for-a-truly-immutable-class" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Immutability — the five rules for a truly immutable class</h5>
1. All fields `private` and `final`
2. No setters
3. The class itself `final` (so no subclass reintroduces mutability)
4. Mutable referenced objects are defensively copied in (constructor) and out (getters) — never shared by reference
5. Every field is set once, at construction

The wrapper classes, `String`, and all `java.time` types follow this pattern. Because `java.time` objects are immutable, every manipulation method returns a *new* object — you must assign the result or the change is silently lost.

<h5 id="nested-inner-anonymous-and-local-classes" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Nested, Inner, Anonymous, and Local Classes</h5>

| Kind | `static`? | Sees outer instance | When to use |
|---|---|---|---|
| **Static nested** | Yes | No (needs an explicit reference) | Logical grouping without the outer instance (e.g. a `Builder`) |
| **Member inner** | No | Yes (implicit `Outer.this`) | Helper bound to one outer instance (rare in modern code) |
| **Local** | No | Yes (inside an instance method) | An implementation needed in exactly one method |
| **Anonymous** | No | Yes | A one-off interface/abstract-class implementation — mostly replaced by lambdas **(Java 8)** |

- Through Java 15, a member/local/anonymous inner class could declare only `static final` constants; **JEP 395 (Java 16)** relaxed this, so inner classes may now declare arbitrary `static` fields, methods, and nested static types
- A local class takes no access modifier
- Local and anonymous classes capture only **effectively final** local variables (relaxed from "must be `final`" in **(Java 8)**)
- The compiler emits `Outer.class` and `Outer$Inner.class`

<h4 id="errors" style="font-size:20px;font-weight:700;margin:22px 0 8px;">💥 Errors</h4>
- Errors represent serious problems that are typically beyond the control of the application, such as system failures or resource exhaustion
- Errors are subclasses of the java.lang.Error class, and they are not meant to be caught or handled by regular application code
- Examples of errors include OutOfMemoryError and StackOverflowError

<h4 id="collections" style="font-size:20px;font-weight:700;margin:22px 0 8px;">📚 Collections</h4>

> 📘 Full guide: [📑 Data Structures](#-data-structures)
> 💻 Code: [OrderList](../src/main/java/algorithm/concepts/datastructures/collections/lists/OrderList.java) · [SetExample](../src/main/java/algorithm/concepts/datastructures/collections/sets/SetExample.java) · [MapExample](../src/main/java/algorithm/concepts/datastructures/collections/maps/MapExample.java) · [Conversions](../src/main/java/algorithm/concepts/convert/ArraysAndLists.java) · [Comparators](../src/main/java/algorithm/implementation/sorting/SortPlayersByScoreDecreasing.java)

The `java.util` Collections Framework — `List`, `Set`, `Queue`, `Map` and their implementations, plus `Comparable`/`Comparator`, conversions, autoboxing and varargs — is covered in full under [📑 Data Structures](#-data-structures). See the [Java Collections Framework](#java-collections-framework) overview for the interface hierarchy and the [Hash Table](#hash-table) entry for `HashMap` internals and the thread-safety options.

<h4 id="functional-interfaces-java-8" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🔌 Functional Interfaces <strong>(Java 8)</strong></h4>

> 💻 Code: [FunctionAndBiFunction](../src/main/java/algorithm/concepts/functionalinterfaces/FunctionAndBiFunction.java) · [PredicateAndBiPredicate](../src/main/java/algorithm/concepts/functionalinterfaces/PredicateAndBiPredicate.java) · [ConsumerAndBiConsumer](../src/main/java/algorithm/concepts/functionalinterfaces/ConsumerAndBiConsumer.java) · [SupplierExample](../src/main/java/algorithm/concepts/functionalinterfaces/SupplierExample.java) · [UnaryAndBinaryOperator](../src/main/java/algorithm/concepts/functionalinterfaces/UnaryOperatorAndBinaryOperator.java) · [Lambdas](../src/main/java/algorithm/concepts/lambda/FindMatchingAnimals.java)

Contain only one abstract method, may contain any static or default methods (`default` methods are themselves **(Java 8)**). Lambdas and method references that target them are also **(Java 8)**

```java
Consumer<String> c2 = x -> System.out.println(x); c2.accept("Annie");
Function<String, Integer> f2 = x -> x.length(); f2.apply("cluck");
Predicate<String> p2 = x -> x.isEmpty(); p2.test("");
Supplier<StringBuilder> sb2 = () -> new StringBuilder(); sb2.get();
UnaryOperator<String> u2 = x -> x.toUpperCase(); u2.apply("chirp");
```

<h4 id="streams-java-8" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🌊 Streams <strong>(Java 8)</strong></h4>

> 💻 Code: [MapAndFlatMap](../src/main/java/algorithm/concepts/streams/MapAndFlatMap.java) · [Filter](../src/main/java/algorithm/concepts/streams/Filter.java) · [Grouping](../src/main/java/algorithm/concepts/streams/collect/Grouping.java) · [Partitioning](../src/main/java/algorithm/concepts/streams/collect/Partitioning.java) · [Reductor](../src/main/java/algorithm/concepts/streams/collect/Reductor.java) · [PrimitiveStreams](../src/main/java/algorithm/concepts/streams/PrimitiveStreams.java) · [Short-circuit matches](../src/main/java/algorithm/concepts/streams/AllMatchAnyMatchNoneMatch.java)

It's like a wrapper for treatment and processing of big collections like a pipeline function

<h5 id="operation-types" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Operation Types</h5>
- **Intermediate operations**: Don't terminate the stream
- **Terminal operations**: Terminate the stream. Collectors, reductors, forEach
  - **Need all**: Require all elements to operate
    - forEach
    - count
  - **Short circuit**: Any matching element can be enough
    - allMatch
    - noneMatch

Streams should not affect external things, instead of altering a collection with foreach use collect, reduce

<h5 id="stream-constructors" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Stream Constructors</h5>
```java
collection.stream()
Stream.empty()
Stream.of("one","two")
Arrays.stream(array)
```

<h5 id="pattern-mapfilterreduce" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Pattern Map/Filter/Reduce</h5>
Transforms(apply functions, change type, maintain order) data → Filter(apply predicates, maintain types, remove objects) → Collect(apply bifunction, Aggregate) result

<h5 id="mapping-stream-types" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Mapping Stream Types</h5>
- **mapToObj**: primitives to objects
- **mapToInt,Long,Double**: object to primitives

<h5 id="collectors" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Collectors</h5>
```java
Map<K,V> map = Collectors.groupingBy(Function, collection); //returns multiple values
Map<K,V> map = Collectors.partitioningBy(Predicate, collection); //returns only two values
```
<h5 id="file-to-stream" style="font-size:16px;font-weight:600;margin:18px 0 7px;">File to Stream</h5>
```java
Stream<String> lines = Files.lines(path,encoding);
```

<h5 id="practical-notes" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Practical Notes</h5>
- **Lazy evaluation**: Intermediate operations do nothing until a terminal operation runs
- Classic interview exercise — "group employees by department and average their salary" in one expression:
```java
Map<String, Double> averages = employees.stream()
    .collect(Collectors.groupingBy(Employee::getDepartment,
             Collectors.averagingDouble(Employee::getSalary)));
```
- **When NOT to use streams**: trivial loops, performance-critical hot paths, code that throws checked exceptions (lambdas cannot propagate them)
- **`Stream.toList()`** **(Java 16)**: shorthand for `.collect(Collectors.toList())`, returning an unmodifiable list

<h4 id="optional-java-8" style="font-size:20px;font-weight:700;margin:22px 0 8px;">❓ Optional <strong>(Java 8)</strong></h4>

> 💻 Code: [OptionalExample](../src/main/java/algorithm/concepts/optional/OptionalExample.java) · [OptionalNull](../src/main/java/algorithm/concepts/optional/OptionalNull.java)

Wrapper that could contain a value or not

- **isPresent()**: validates if contains a value
- **get()**: if present returns value, else throws an exception
- **ifPresent(Consumer c)**: if present calls consumer with value, else does nothing
- **orElse(T other)**: if present returns value, else returns other
- **orElseGet(Supplier s)**: if present returns value, else returns the supplier result
- **orElseThrow(Supplier s)**: if present returns value, else throws exception created by calling supplier

<h5 id="best-practices" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Best Practices</h5>
- **orElse vs orElseGet**: `orElse(x)` always evaluates its argument (eager), `orElseGet(supplier)` calls the supplier only when the Optional is empty (lazy) — it matters when building the fallback is expensive
- Use Optional as a **return type** only — never as a field or a method parameter

<h4 id="modern-java-921--shows-you-keep-current" style="font-size:20px;font-weight:700;margin:22px 0 8px;">✨ Modern Java (9–21) — shows you keep current</h4>

> 💻 Code: [VirtualThreadsExample](../src/main/java/algorithm/concepts/threads/executors/VirtualThreadsExample.java)

- **var (Java 10)**: Local variable type inference; the type stays static, only the declaration is shorter
- **Records (Java 16)**: Immutable data carriers with generated constructor, accessors, equals(), hashCode() and toString() — the modern answer for Data Transfer Objects (DTOs). Previewed in Java 14 (JEP 359) and 15 (JEP 384), but not usable without `--enable-preview` until finalized in **Java 16** (JEP 395)
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

<h4 id="generics-java-5" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🔤 Generics <strong>(Java 5)</strong></h4>

Generics parameterize a class, interface, or method by type, giving **compile-time type safety** with no casts. Before them, collections held `Object` and a wrong type failed only at runtime (`ClassCastException`).

```java
List<String> names = new ArrayList<>();
String s = names.get(0);          // no cast — compiler enforces the element type
```

- **Naming conventions**: `E` element, `K`/`V` key/value, `T`/`S`/`U` general, `N` number
- **Type erasure**: generics exist only at compile time — the compiler checks types, erases the parameters, and inserts casts. Consequences: `instanceof List<String>` is illegal (only `List` exists at runtime), primitives cannot be type arguments (use wrappers), and a static field cannot use a class-level type parameter
- **Generic method**: declares its own parameter before the return type — `public static <T> Crate<T> ship(T item)`

<h5 id="bounded-wildcards-and-producer-extends-consumer-super-pecs" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Bounded wildcards and Producer Extends Consumer Super (PECS)</h5>
| Form | Syntax | Meaning | Use |
|---|---|---|---|
| **Unbounded** | `List<?>` | Any type — read-only view (cannot add) | Operate on a list of unknown type |
| **Upper-bounded** | `List<? extends Number>` | `Number` or a subtype — read-only (cannot add) | A source you only **read** from |
| **Lower-bounded** | `List<? super Integer>` | `Integer` or a supertype — can add `Integer` | A sink you only **write** to |

The **Producer Extends, Consumer Super (PECS)** rule: use `? extends T` for a producer you read from, `? super T` for a consumer you write to.

```java
void printAll(List<? extends Number> source) { for (Number n : source) {} } // producer → extends
void addInts(List<? super Integer> dest)      { dest.add(1); dest.add(2); }   // consumer → super
```

<h4 id="enums-java-5" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🔢 Enums <strong>(Java 5)</strong></h4>

A type-safe fixed set of named constant instances. More robust than `int` constants — the compiler rejects any value outside the set.

- Compared with `==` (they are singletons); `values()` lists them in declaration order; `ordinal()` is the position (avoid it in logic — reordering changes it); `name()`/`valueOf(String)` convert to and from text
- Cannot extend a class or be extended (it implicitly extends `java.lang.Enum`), but **can implement interfaces**
- Can carry fields, a `private` constructor, and methods — even a per-constant method body (an abstract method overridden by each constant)
- `EnumSet` and `EnumMap` are bit-vector / array-backed and far faster than `HashSet`/`HashMap` when the keys are enum constants
- In a `switch`, case labels use the **unqualified** constant name

```java
public enum Operation {
    PLUS  { public double apply(double x, double y) { return x + y; } },
    MINUS { public double apply(double x, double y) { return x - y; } };
    public abstract double apply(double x, double y);   // value-specific bodies
}
```

<h4 id="annotations-java-5" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🏷️ Annotations <strong>(Java 5)</strong></h4>

Metadata attached to a program element for the compiler, tools, or the runtime.

- **Built-in**: `@Override` (compile error if nothing is overridden), `@Deprecated` (warning at call sites), `@SuppressWarnings`, `@FunctionalInterface` **(Java 8)**, `@SafeVarargs`
- **Meta-annotations** (annotations on annotations): `@Retention` — `SOURCE` (compiler only), `CLASS` (in the `.class`, default), or `RUNTIME` (visible via reflection); `@Target` (which elements it may annotate); `@Documented`; `@Inherited`
- **Why it matters**: Spring and Hibernate are annotation-driven (`@Component`, `@Autowired`, `@Entity`). `@Retention(RUNTIME)` is exactly what lets a framework read them by reflection at startup; `@Override` is `SOURCE`-retained because only the compiler consumes it

<h4 id="reflection" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🪞 Reflection</h4>
Extract and invoke methods from a class whose code we don't have access
```java
Method[] methods = obj.getClass().getMethods();
String result = (String) method.invoke(obj);   // call it without compile-time access
```

<h4 id="java-inputoutput-io-and-new-inputoutput-2-nio2" style="font-size:20px;font-weight:700;margin:22px 0 8px;">☕ Java Input/Output (IO) and New Input/Output 2 (NIO.2)</h4>

**Legacy `java.io`** uses byte streams (`InputStream`/`OutputStream`) and character streams (`Reader`/`Writer`), often wrapped in a `BufferedReader`/`BufferedWriter` for efficiency. Every IO type is `Closeable`, so use **try-with-resources** **(Java 7)** — resources close in reverse declaration order, even on exception.

**NIO.2 (`java.nio.file`) (Java 7)** is the modern file-system Application Programming Interface, built on three types:
- **`Path`** — a file/directory location (`Path.of("dir/file.txt")`, **Java 11**); does not require the file to exist
- **`Paths`** — the factory (`Paths.get(...)`); the singular `Path` is the instance, the plural `Paths` is the factory
- **`Files`** — static operations: `exists`, `copy`, `move`, `delete`/`deleteIfExists`, `readAllLines`, `write`, plus lazy `Stream`-returning `lines()`, `walk()`, and `find()` **(Java 8)** that must be closed with try-with-resources

```java
try (BufferedReader in  = Files.newBufferedReader(source);
     BufferedWriter out = Files.newBufferedWriter(target)) {
    String line;
    while ((line = in.readLine()) != null) out.write(line);
}   // out then in — closed in reverse order
```

<h4 id="datetime-application-programming-interface-java-8" style="font-size:20px;font-weight:700;margin:22px 0 8px;">☕ Date/Time Application Programming Interface <strong>(Java 8)</strong></h4>

`java.time` replaced the mutable, non-thread-safe, zero-indexed-month legacy `Date`/`Calendar`/`SimpleDateFormat`. All `java.time` types are **immutable**; manipulation methods return new objects.

| Type | Holds | Example |
|---|---|---|
| `LocalDate` | Date only | a birthday `2025-06-15` |
| `LocalTime` | Time only | `09:30` |
| `LocalDateTime` | Date + time, no zone | `2025-12-31T23:59` |
| `ZonedDateTime` | Date + time + zone | `09:00 US/Eastern` |
| `Instant` | Machine timestamp (since the Unix epoch) | logging, elapsed time |
| `Period` | Date-based amount (`P1Y2M3D`) | "3 months later" |
| `Duration` | Time-based amount (`PT2H`) | "90 minutes" |

- Created through **static factories** (`LocalDate.now()`, `LocalDate.of(2025, Month.JUNE, 15)`) — constructors are not public
- Fluent `plus`/`minus` return a new object: `LocalDate.now().plusDays(10).minusMonths(1)` — assign it or lose it
- `DateTimeFormatter` (thread-safe, reusable as a constant) formats and parses: `LocalDate.parse("15/06/2025", DateTimeFormatter.ofPattern("dd/MM/yyyy"))`

<h4 id="concurrency" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🧵 Concurrency</h4>

> 💻 Code: [ThreadBasics](../src/main/java/algorithm/concepts/threads/basics/ThreadBasics.java) · [ExecutorServiceExample](../src/main/java/algorithm/concepts/threads/executors/ExecutorServiceExample.java) · [CompletableFutureExample](../src/main/java/algorithm/concepts/threads/advanced/CompletableFutureExample.java) · [AtomicExample](../src/main/java/algorithm/concepts/threads/atomic/AtomicExample.java) · [SynchronizedExample](../src/main/java/algorithm/concepts/threads/synchronization/SynchronizedExample.java) · [ProducerConsumerExample](../src/main/java/algorithm/concepts/threads/communication/ProducerConsumerExample.java)

A focused, practical reference for **multithreading** and **concurrency** in
Java: how threads work, how to coordinate them safely, and which high-level
tools to reach for. Every section links to a runnable Java file under
`src/main/java/algorithm/concepts/threads/<topic>/...`.

<h5 id="1-concepts--vocabulary" style="font-size:16px;font-weight:600;margin:18px 0 7px;">1. Concepts &amp; Vocabulary</h5>

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

The concrete case that makes `synchronized` and locks work as advertised: **releasing a lock happens-before any later acquisition of that same lock by another thread** — the formal guarantee that everything the first thread wrote before unlocking becomes visible to the second thread after it locks, not an implementation detail but a contract the JVM must honor. That contract does not appear out of nowhere — it is written down formally, and the next section spells out exactly what it promises, why the promise is necessary at all, and the complete set of rules it is built from.

<h5 id="2-java-memory-model--happens-before" style="font-size:16px;font-weight:600;margin:18px 0 7px;">2. Java Memory Model &amp; Happens-Before</h5>

Compilers and processors are free to reorder instructions and cache values in per-core registers or store buffers whenever doing so leaves single-threaded behavior unchanged — a compiler can move a write earlier, a processor can delay flushing a value from a core-local cache back to main memory, and neither decision is visible to a single thread running alone. The trouble starts the moment a second thread reads that same data: it can observe writes out of the order the first thread issued them, or fail to observe a write at all for an arbitrary length of time, and nothing in the source code hints at which will happen — the outcome depends on the processor architecture and the compiler's optimizations, which is exactly why this class of bug is notoriously hard to reproduce and debug.

**Java Memory Model (JMM):** the formal specification, defined in chapter 17 of the Java Language Specification (JLS), that draws the line between those two possibilities. It states precisely which reorderings and which caching behaviors the compiler and the processor are allowed to perform, and — more usefully for a working developer — precisely what a Java program can and cannot assume about visibility and ordering across threads. Without any synchronization, that guarantee is almost nothing: a plain field written by one thread might never become visible to another, or might become visible in a different order than it was written. With the correct synchronization in place, the JMM upgrades that guarantee to something concrete and checkable — the happens-before relation, covered below. In short, the JMM is the contract between the Java source code you write and the reorderings the compiler, the just-in-time compiler, and the CPU are allowed to perform while executing it.

The classic illustration is a `ready` flag guarding a `value`: thread A writes `value` and then sets `ready = true`; thread B spins on `ready` and, once it sees `true`, reads `value`. Intuitively B should always see the updated value, since A wrote it first — but with no happens-before edge connecting the two threads, nothing forbids the compiler or processor from reordering A's two writes, or from delaying the visibility of either write to B. B can observe `ready == true` while still reading a stale `value`, or it can spin forever because A's write to `ready` never becomes visible to it.

```java
class Shared {
    int value = 0;
    boolean ready = false;
}

// Thread A
shared.value = 42;
shared.ready = true;       // no synchronization — this write can be reordered ahead of value's write

// Thread B
while (!shared.ready) { }        // may spin forever — the write to ready may never become visible
System.out.println(shared.value); // may print 0, not 42, even after ready reads true
```

```
Thread A — program order           What the compiler/CPU may legally do
-------------------------          -------------------------------------
value = 42                          ready = true      <- reordered ahead
ready = true                        value = 42         (no happens-before edge forbids it)

Thread B
--------
read ready  -> true
read value  -> 0          <- stale: nothing guarantees value's write is
                              visible before ready's write is observed
```

**`volatile`:** the keyword that closes both hazards above by giving the field a fixed place in the happens-before relation — a write to a volatile field happens-before every subsequent read of that same field by any thread. That single guarantee does two things at once: it forbids the compiler and processor from reordering the volatile write past earlier writes in the same thread (so `value = 42` cannot float past `ready = true`), and it forces the write to become visible to whichever thread later reads `ready`, instead of staying trapped in a core-local cache. This is `volatile`'s actual mechanism — not a vague promise of "visibility," but a concrete happens-before edge anchored to that one field. Declaring `ready` volatile makes the example above safe; it does not, by itself, make compound operations like `counter++` atomic (see Race Conditions, below), because that guarantee only covers the single field's own reads and writes.

That single field-level edge is only one instance of a larger set of rules the Java Memory Model defines. **Happens-before** is the name of the ordering relation those rules build, and it is the one concept every visibility guarantee in Java concurrency reduces to. It is not about wall-clock time — two actions can occur at the exact same physical instant with no visibility guarantee between them at all if nothing connects them, and two actions can be strictly ordered by happens-before even though no thread ever waits on the other in any everyday sense. When action A happens-before action B, two things are guaranteed together: every write A made is visible to B, and the JVM may not reorder execution such that B observes the world as if A had not happened yet. Two threads only get a real visibility guarantee when one of the rules below — or a chain of them through transitivity — connects the specific actions in question.

| Rule | Guarantee |
|---|---|
| **Program order** | Within a single thread, every action happens-before every later action in that same thread's own program order. The foundation every other rule builds on. |
| **Monitor lock** | Releasing a lock happens-before any later acquisition of that same lock by another thread (the rule behind `synchronized`, detailed below). |
| **Volatile variable** | A write to a volatile field happens-before every subsequent read of that same field by any thread (just illustrated above). |
| **Thread start** | A call to `Thread.start()` happens-before any action inside the thread that was started. |
| **Thread termination (join)** | Every action inside a thread happens-before another thread's successful return from a `join()` on it. |
| **Interruption** | A call to `interrupt()` happens-before the interrupted thread detects the interruption, whether by observing `isInterrupted()` or by catching `InterruptedException`. |
| **Transitivity** | If A happens-before B, and B happens-before C, then A happens-before C — the rule that lets a chain of separate synchronization points add up to a single end-to-end guarantee. |

The start and join rules combine through transitivity into one of the simplest safe hand-off patterns available, with no explicit lock anywhere in it:

```java
int[] result = new int[1];
Thread worker = new Thread(() -> result[0] = compute()); // program order: write happens before start() returns
worker.start();  // thread-start rule: this happens-before any action inside worker
worker.join();    // thread-termination rule: every action inside worker happens-before this join() returns
System.out.println(result[0]); // guaranteed to see the computed value — a chained happens-before guarantee
```

The monitor lock rule above is the one `synchronized` relies on — but "monitor" and `synchronized` are not the same thing, and the distinction is worth being precise about, covered next.

<h5 id="3-extends-thread-vs-implements-runnable" style="font-size:16px;font-weight:600;margin:18px 0 7px;">3. <code>extends Thread</code> vs <code>implements Runnable</code></h5>

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

<h5 id="4-lambdas-as-thread-tasks-java-8" style="font-size:16px;font-weight:600;margin:18px 0 7px;">4. Lambdas as Thread Tasks <strong>(Java 8)</strong></h5>

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

<h5 id="5-creating-threads--three-ways" style="font-size:16px;font-weight:600;margin:18px 0 7px;">5. Creating Threads — three ways</h5>

| Approach | Pros | Cons |
|---|---|---|
| `extends Thread` | Quick to write for a throwaway demo where the class will not extend anything else. | Spends the class's single inheritance slot and welds the task tightly to a specific `Thread` subclass. |
| `implements Runnable` | Cleanly separates the task from the runner — the same `Runnable` can run on any `Thread` or any `Executor`. | A few extra lines compared to a lambda for very small tasks. |
| Lambda (`Runnable`) | The shortest and most idiomatic form for inline work, ideal for one-liners and short bodies. | Becomes hard to read once the task grows; for non-trivial logic, promote it to a named class or method. |

```java
new Thread(() -> System.out.println("hi")).start();
```

📁 [src/main/java/algorithm/concepts/threads/basics/ThreadBasics.java](../src/main/java/algorithm/concepts/threads/basics/ThreadBasics.java)

<h5 id="6-thread-lifecycle-sleep-join-interrupt-daemon" style="font-size:16px;font-weight:600;margin:18px 0 7px;">6. Thread Lifecycle, Sleep, Join, Interrupt, Daemon</h5>

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

📁 [src/main/java/algorithm/concepts/threads/lifecycle/ThreadLifecycle.java](../src/main/java/algorithm/concepts/threads/lifecycle/ThreadLifecycle.java)

<h5 id="7-race-conditions" style="font-size:16px;font-weight:600;margin:18px 0 7px;">7. Race Conditions</h5>

A race condition appears whenever the program's correctness depends on
the exact order in which threads happen to run. Because thread scheduling
is decided by the operating system, that order is unpredictable, so the
same code can produce different results on different runs.

The textbook example is `counter++`. Although it looks like a single
statement, it really expands into three steps: **read** the current
value, **add one**, and **write** the new value back. Two threads can
both read the same starting value, both add one, and both write the same
result — silently losing one of the increments.

📁 [src/main/java/algorithm/concepts/threads/synchronization/RaceConditionDemo.java](../src/main/java/algorithm/concepts/threads/synchronization/RaceConditionDemo.java)

The standard fixes (each covered in the sections that follow): wrap the
critical section in `synchronized`, use an explicit lock, swap the field
for an atomic variable, or hand data between threads through a concurrent
collection instead of sharing it directly.

<h5 id="8-synchronized--intrinsic-locks" style="font-size:16px;font-weight:600;margin:18px 0 7px;">8. <code>synchronized</code> — intrinsic locks</h5>

**Monitor:** a general, language-independent concurrency primitive, originally formalized by C. A. R. Hoare and Per Brinch Hansen, that bundles two things into one construct: mutual exclusion (only one thread executes inside the monitor at a time) and one or more condition variables (a way for a thread already inside the monitor to wait for some condition to become true, and be woken once another thread makes it so). A monitor is a concept, not a keyword — it describes what a mechanism must provide, not how any particular language implements it.

**`synchronized`:** Java's built-in implementation of the monitor concept, wired directly into every object. Every Java object carries an associated intrinsic lock, sometimes called its monitor lock, and `synchronized` is how Java code acquires and releases that specific object's monitor lock. Only one thread at a time can hold a given object's lock; `synchronized` automatically picks up that lock when a thread enters the protected code and releases it when the thread leaves — including when an exception is thrown — so you cannot forget to unlock. The condition-variable half of the monitor concept — waiting for something to become true, and being woken once it does — is provided by `Object.wait()`, `notify()`, and `notifyAll()` (section 13, below), and those methods only work on an object whose monitor the calling thread currently holds: calling `wait()` without holding the lock throws `IllegalMonitorStateException`, the concrete, checkable link between "the monitor concept" and Java's wait/notify mechanism.

That single mechanism delivers two guarantees at once:

- **Mutual exclusion** — no two threads execute the protected code at the same time, so shared state stays consistent.
- **Visibility** — every change a thread makes before releasing the lock is guaranteed to be observed by the next thread that acquires it, with no stale-cache surprises (the monitor lock happens-before rule from section 2, above).

The canonical illustration of *why* this matters is a check-then-act race: two threads each check `balance >= amount` then withdraw, and because the check and the act are two separate operations, both can pass the check before either withdraws — synchronizing the whole check-then-act sequence (not just the withdrawal) is what actually fixes it.

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

`synchronized`'s monitor is intrinsic: implicit, one per object, with a single wait set tied to `wait`/`notify`. Section 9 (Explicit Locks) covers `Lock` and `Condition`, the `java.util.concurrent.locks` reimplementation of the same monitor concept as an explicit application programming interface — mutual exclusion via `Lock`, condition variables via `Condition` — but decoupled from any particular object's intrinsic lock: a single `Lock` can hand out multiple independent `Condition`s, something no intrinsic monitor can do, since it only ever has the one implicit wait set.

📁 [src/main/java/algorithm/concepts/threads/synchronization/SynchronizedExample.java](../src/main/java/algorithm/concepts/threads/synchronization/SynchronizedExample.java)

<h5 id="9-explicit-locks-reentrantlock-readwritelock-java-5-stampedlock-java-8" style="font-size:16px;font-weight:600;margin:18px 0 7px;">9. Explicit Locks (<code>ReentrantLock</code>, <code>ReadWriteLock</code>) <strong>(Java 5; <code>StampedLock</code> Java 8)</strong></h5>

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
| `ReentrantReadWriteLock` | The standard `ReadWriteLock` implementation. Both views are reentrant; supports lock downgrading (write → read) but not upgrading. |
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

📁 [src/main/java/algorithm/concepts/threads/locks/ReentrantLockExample.java](../src/main/java/algorithm/concepts/threads/locks/ReentrantLockExample.java)
📁 [src/main/java/algorithm/concepts/threads/locks/ReadWriteLockExample.java](../src/main/java/algorithm/concepts/threads/locks/ReadWriteLockExample.java)
📁 [src/main/java/algorithm/concepts/threads/locks/ConditionExample.java](../src/main/java/algorithm/concepts/threads/locks/ConditionExample.java)
📁 [src/main/java/algorithm/concepts/threads/locks/StampedLockExample.java](../src/main/java/algorithm/concepts/threads/locks/StampedLockExample.java)

`ReadWriteLock` splits a lock into two cooperating views: any number of
threads can hold the **read** lock at the same time, but the **write**
lock is exclusive and blocks all readers and writers. It is ideal for
data structures that are read very often and updated only occasionally.

<h5 id="10-atomic-variables-java-5" style="font-size:16px;font-weight:600;margin:18px 0 7px;">10. Atomic Variables <strong>(Java 5)</strong></h5>

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

📁 [src/main/java/algorithm/concepts/threads/atomic/AtomicExample.java](../src/main/java/algorithm/concepts/threads/atomic/AtomicExample.java)

<h5 id="11-concurrent-collections-java-5" style="font-size:16px;font-weight:600;margin:18px 0 7px;">11. Concurrent Collections <strong>(Java 5)</strong></h5>

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
| `ConcurrentLinkedQueue` | A non-blocking, unbounded first-in-first-out queue based on a lock-free algorithm — fast under high contention. |
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

📁 [src/main/java/algorithm/concepts/threads/concurrent/ConcurrentCollectionsExample.java](../src/main/java/algorithm/concepts/threads/concurrent/ConcurrentCollectionsExample.java)

<h5 id="12-the-concurrent-application-programming-interface--executorservice-callable-future-java-5" style="font-size:16px;font-weight:600;margin:18px 0 7px;">12. The Concurrent Application Programming Interface — <code>ExecutorService</code>, <code>Callable</code>, <code>Future</code> <strong>(Java 5)</strong></h5>

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
| `ThreadPoolExecutor` | The configurable thread-pool implementation behind most `Executors` factories. Lets you set core/max pool sizes, keep-alive time, work queue, `ThreadFactory`, and rejection policy. |
| `ScheduledThreadPoolExecutor` | The configurable implementation behind the scheduled factories. |
| `ForkJoinPool` | A work-stealing pool optimized for divide-and-conquer tasks. Each worker has its own deque and steals from others when idle. Used by parallel streams via `commonPool()`. |
| `ExecutorCompletionService<V>` | The standard `CompletionService` implementation, wrapping any `Executor`. |

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

📁 [src/main/java/algorithm/concepts/threads/executors/ExecutorServiceExample.java](../src/main/java/algorithm/concepts/threads/executors/ExecutorServiceExample.java)
📁 [src/main/java/algorithm/concepts/threads/executors/CallableFutureExample.java](../src/main/java/algorithm/concepts/threads/executors/CallableFutureExample.java)
📁 [src/main/java/algorithm/concepts/threads/executors/ScheduledExecutorExample.java](../src/main/java/algorithm/concepts/threads/executors/ScheduledExecutorExample.java)
📁 [src/main/java/algorithm/concepts/threads/executors/ForkJoinExample.java](../src/main/java/algorithm/concepts/threads/executors/ForkJoinExample.java)
📁 [src/main/java/algorithm/concepts/threads/executors/VirtualThreadsExample.java](../src/main/java/algorithm/concepts/threads/executors/VirtualThreadsExample.java)

<h5 id="13-thread-communication--wait--notify-producer-consumer" style="font-size:16px;font-weight:600;margin:18px 0 7px;">13. Thread Communication — <code>wait</code> / <code>notify</code>, Producer-Consumer</h5>

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

📁 [src/main/java/algorithm/concepts/threads/communication/WaitNotifyExample.java](../src/main/java/algorithm/concepts/threads/communication/WaitNotifyExample.java)

For producer-consumer designs, prefer a `BlockingQueue` over hand-written
`wait`/`notify` code. The queue takes care of all the synchronization,
parking, and signaling for you, and it is much harder to get wrong:

📁 [src/main/java/algorithm/concepts/threads/communication/ProducerConsumerExample.java](../src/main/java/algorithm/concepts/threads/communication/ProducerConsumerExample.java)

<h5 id="14-completablefuture-java-8" style="font-size:16px;font-weight:600;margin:18px 0 7px;">14. <code>CompletableFuture</code> <strong>(Java 8)</strong></h5>

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

📁 [src/main/java/algorithm/concepts/threads/advanced/CompletableFutureExample.java](../src/main/java/algorithm/concepts/threads/advanced/CompletableFutureExample.java)

<h5 id="15-coordination-primitives--countdownlatch-cyclicbarrier-semaphore-phaser-exchanger-java-5-phaser-java-7" style="font-size:16px;font-weight:600;margin:18px 0 7px;">15. Coordination Primitives — <code>CountDownLatch</code>, <code>CyclicBarrier</code>, <code>Semaphore</code>, <code>Phaser</code>, <code>Exchanger</code> <strong>(Java 5; <code>Phaser</code> Java 7)</strong></h5>

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

📁 [src/main/java/algorithm/concepts/threads/advanced/CountDownLatchExample.java](../src/main/java/algorithm/concepts/threads/advanced/CountDownLatchExample.java)
📁 [src/main/java/algorithm/concepts/threads/advanced/CyclicBarrierExample.java](../src/main/java/algorithm/concepts/threads/advanced/CyclicBarrierExample.java)
📁 [src/main/java/algorithm/concepts/threads/advanced/SemaphoreExample.java](../src/main/java/algorithm/concepts/threads/advanced/SemaphoreExample.java)
📁 [src/main/java/algorithm/concepts/threads/advanced/PhaserExample.java](../src/main/java/algorithm/concepts/threads/advanced/PhaserExample.java)
📁 [src/main/java/algorithm/concepts/threads/advanced/ExchangerExample.java](../src/main/java/algorithm/concepts/threads/advanced/ExchangerExample.java)

<h5 id="16-deadlock-livelock-starvation" style="font-size:16px;font-weight:600;margin:18px 0 7px;">16. Deadlock, Livelock, Starvation</h5>

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

<h5 id="17-code-challenges" style="font-size:16px;font-weight:600;margin:18px 0 7px;">17. Code Challenges</h5>

| # | Challenge | Concepts | File |
|---|---|---|---|
| 1 | Print `ping`/`pong` strictly alternating from two threads | `synchronized`, `wait/notifyAll`, shared flag | [PingPongChallenge.java](../src/main/java/algorithm/concepts/threads/challenges/PingPongChallenge.java) |
| 2 | Thread-safe bank account with deposits and withdrawals | critical section, atomic check + update | [BankAccountChallenge.java](../src/main/java/algorithm/concepts/threads/challenges/BankAccountChallenge.java) |
| 3 | Build a deadlock, then fix it with consistent lock order | monitor locks, lock ordering | [DeadlockChallenge.java](../src/main/java/algorithm/concepts/threads/challenges/DeadlockChallenge.java) |

<h6 id="more-to-try-yourself" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">More to try yourself</h6>

- **Producer / Consumer with multiple producers and consumers** using
  `BlockingQueue` and a poison-pill protocol.
- **Parallel sum** of a large array using `ExecutorService` + `Future`,
  splitting into chunks.
- **Web crawler** that limits parallelism with a `Semaphore`.
- **Dining Philosophers** — five philosophers, five forks; avoid deadlock
  using lock ordering or a `Semaphore` of size 4.
- **Rate limiter** using a `Semaphore` and scheduled refills.
- **Print numbers 1..N in order** with N threads, each printing one number.

<h5 id="concurrency-cheat-sheet" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Concurrency Cheat Sheet</h5>

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

<h6 id="decision-flowchart" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Decision flowchart</h6>

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

<h4 id="exceptions" style="font-size:20px;font-weight:700;margin:22px 0 8px;">⚠️ Exceptions</h4>

A focused, practical reference for Java's exception model: how throwing
and catching work, which types belong to which family, and which idioms
to reach for. Every section links to a runnable file under
`src/main/java/algorithm/concepts/oop/exceptions/...`.

<h5 id="1-concepts--vocabulary-exceptions" style="font-size:16px;font-weight:600;margin:18px 0 7px;">1. Concepts &amp; Vocabulary (Exceptions)</h5>

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

Best-practice checklist worth having ready verbatim: throw specific exception types rather than a bare `Exception`; fail fast (throw as soon as an invalid state is detected); catch late (let the caller, which has more context, decide how to recover, rather than swallowing deep in a low-level method); never leave a catch block empty — at minimum log it, since a silently swallowed exception is one of the hardest bug classes to diagnose later.

<h5 id="2-the-throwable-hierarchy" style="font-size:16px;font-weight:600;margin:18px 0 7px;">2. The <code>Throwable</code> hierarchy</h5>

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
            │     │     ├── java.io.ObjectStreamException
            │     │     │     ├── java.io.InvalidClassException
            │     │     │     ├── java.io.InvalidObjectException
            │     │     │     ├── java.io.NotSerializableException
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
            │     │     ├── java.sql.SQLNonTransientException
            │     │     └── java.sql.SQLTransientException
            │     │           └── java.sql.SQLTimeoutException
            │     ├── java.lang.InterruptedException
            │     ├── java.lang.ReflectiveOperationException
            │     │     ├── java.lang.ClassNotFoundException
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

📁 [src/main/java/algorithm/concepts/oop/exceptions/CheckedVsUncheckedExample.java](../src/main/java/algorithm/concepts/oop/exceptions/CheckedVsUncheckedExample.java)

<h5 id="3-core-throwable-api" style="font-size:16px;font-weight:600;margin:18px 0 7px;">3. Core <code>Throwable</code> API</h5>

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

<h5 id="4-try--catch--finally" style="font-size:16px;font-weight:600;margin:18px 0 7px;">4. <code>try</code> / <code>catch</code> / <code>finally</code></h5>

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

📁 [src/main/java/algorithm/concepts/oop/exceptions/BasicTryCatch.java](../src/main/java/algorithm/concepts/oop/exceptions/BasicTryCatch.java)

<h5 id="5-multiple-catches-and-multi-catch" style="font-size:16px;font-weight:600;margin:18px 0 7px;">5. Multiple catches and multi-catch</h5>

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

📁 [src/main/java/algorithm/concepts/oop/exceptions/MultipleCatchExample.java](../src/main/java/algorithm/concepts/oop/exceptions/MultipleCatchExample.java)

<h5 id="6-throw-vs-throws" style="font-size:16px;font-weight:600;margin:18px 0 7px;">6. <code>throw</code> vs <code>throws</code></h5>

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

📁 [src/main/java/algorithm/concepts/oop/exceptions/ThrowsExample.java](../src/main/java/algorithm/concepts/oop/exceptions/ThrowsExample.java)

<h5 id="7-checked-vs-unchecked" style="font-size:16px;font-weight:600;margin:18px 0 7px;">7. Checked vs Unchecked</h5>

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

📁 [src/main/java/algorithm/concepts/oop/exceptions/CheckedVsUncheckedExample.java](../src/main/java/algorithm/concepts/oop/exceptions/CheckedVsUncheckedExample.java)

<h5 id="8-try-with-resources" style="font-size:16px;font-weight:600;margin:18px 0 7px;">8. Try-with-resources</h5>

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

📁 [src/main/java/algorithm/concepts/oop/exceptions/TryWithResourcesExample.java](../src/main/java/algorithm/concepts/oop/exceptions/TryWithResourcesExample.java)

<h5 id="9-exception-chaining-causes" style="font-size:16px;font-weight:600;margin:18px 0 7px;">9. Exception chaining (causes)</h5>

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

<h5 id="10-stack-traces" style="font-size:16px;font-weight:600;margin:18px 0 7px;">10. Stack traces</h5>

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

<h5 id="11-custom-exceptions" style="font-size:16px;font-weight:600;margin:18px 0 7px;">11. Custom Exceptions</h5>

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

📁 [src/main/java/algorithm/concepts/oop/exceptions/InsufficientFundsException.java](../src/main/java/algorithm/concepts/oop/exceptions/InsufficientFundsException.java)
📁 [src/main/java/algorithm/concepts/oop/exceptions/CustomExceptionDemo.java](../src/main/java/algorithm/concepts/oop/exceptions/CustomExceptionDemo.java)

<h5 id="12-common-standard-exceptions" style="font-size:16px;font-weight:600;margin:18px 0 7px;">12. Common standard exceptions</h5>

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
| `UnsupportedOperationException` | `RuntimeException` | An interface method that is required to exist but is not supported by this implementation (e.g. `List.of(...).add(x)`). |
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

<h5 id="13-best-practices" style="font-size:16px;font-weight:600;margin:18px 0 7px;">13. Best Practices</h5>

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

<h5 id="exceptions-cheat-sheet" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Exceptions Cheat Sheet</h5>

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

<h3 id="kotlin" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🟪 Kotlin</h3>

A modern statically-typed language for the Java Virtual Machine, created by JetBrains. It compiles to the same bytecode as Java, interoperates with Java in both directions, and is Google's preferred language for Android. Its design goals: **conciseness**, **null safety**, and **pragmatism** — keep what works in Java, fix the recurring pain points.

<h4 id="why-it-matters-for-a-java-developer" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🟪 Why it matters for a Java developer</h4>
- **100% interop**: Call Java from Kotlin and Kotlin from Java in the same project; migrate file by file
- **Less ceremony**: No semicolons, type inference, no getters/setters/`equals`/`hashCode` boilerplate
- **Null safety in the type system**: The "billion-dollar mistake" (`NullPointerException`) becomes a compile-time concern

<h4 id="variables-and-types" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🟪 Variables and Types</h4>
```kotlin
val name = "Ada"        // immutable reference (like Java final) — prefer this
var age = 30            // mutable reference
val total: Long = 5     // explicit type when inference is not enough
```
- `val` = read-only (the reference cannot be reassigned), `var` = mutable
- Types are inferred; everything is an object (no primitives at the language level, the compiler optimizes to primitives underneath)

<h4 id="null-safety" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🟪 Null Safety</h4>
Nullability is part of the type. A normal type cannot hold `null`; a nullable type is marked with `?`.
```kotlin
var a: String = "x"     // cannot be null
var b: String? = null   // explicitly nullable
val len = b?.length     // safe call -> returns null instead of throwing
val safe = b ?: "empty" // Elvis operator -> default when null
val forced = b!!.length // asserts non-null -> throws if it is (avoid)
```

<h4 id="functions" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🟪 Functions</h4>
```kotlin
fun add(a: Int, b: Int = 0) = a + b        // default argument, expression body
add(b = 5, a = 1)                          // named arguments

// Extension function: add behavior to a type you do not own
fun String.shout() = this.uppercase() + "!"
"hi".shout()                               // -> "HI!"
```

<h4 id="classes-and-objects" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🟪 Classes and Objects</h4>
```kotlin
data class User(val id: Long, val name: String)   // auto equals/hashCode/toString/copy
sealed interface Shape                              // restricted hierarchy (exhaustive when)
object Config                                       // a true singleton (no static keyword)
class Service { companion object { const val VERSION = "1.0" } }  // static-like members
```
- **data class**: the idiomatic Data Transfer Object — generates `equals`, `hashCode`, `toString`, `copy`
- **object**: a language-level singleton; **companion object**: holds members shared by all instances (Kotlin has no `static`)
- **sealed**: the compiler knows every subtype, enabling exhaustive `when` expressions

<h4 id="functional-style-and-scope-functions" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🟪 Functional Style and Scope Functions</h4>
```kotlin
val names = users.filter { it.age > 18 }.map { it.name }   // collection pipeline
val user = User(1, "Ada").apply { /* configure */ }        // apply: returns the receiver
val length = name?.let { it.length } ?: 0                   // let: run a block on non-null
```
- Lambdas use `{ }`; the single parameter is implicitly `it`
- **Scope functions** (`let`, `run`, `with`, `apply`, `also`) reduce temporary variables; `apply`/`also` return the object, `let`/`run`/`with` return the lambda result

<h4 id="coroutines-concurrency" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🟪 Coroutines (concurrency)</h4>
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

<h4 id="kotlin-vs-java" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🟪 Kotlin vs Java</h4>
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

<h3 id="python" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🐍 Python</h3>

A high-level, interpreted, dynamically-typed language built for readability and developer speed. It is multi-paradigm (procedural, object-oriented, functional) and dominates scripting, automation, data science, machine learning, and increasingly backend web services. Where Java optimizes for large-team safety and performance, Python optimizes for expressiveness and time-to-result.

<h4 id="why-it-matters-for-a-java-developer-1" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🐍 Why it matters for a Java developer</h4>
- **Dynamic typing**: Types are checked at runtime, not declared — far less code, but errors surface later
- **Batteries included**: A vast standard library and the largest third-party ecosystem (`pip`)
- **The default language of data and AI**: pandas, NumPy, PyTorch, and most machine-learning tooling are Python-first

<h4 id="variables-and-typing" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🐍 Variables and Typing</h4>
```python
name = "Ada"            # no type declaration; the variable just binds a value
age = 30                # re-binding to another type is legal: age = "thirty"
total: int = 5          # optional type hint — documentation, checked by tools, not enforced at runtime
```
- **Dynamic typing**: a name is just a label pointing at an object
- **Duck typing**: "if it walks like a duck" — code depends on behavior (methods present), not on declared types
- **Type hints** (`def f(x: int) -> str:`) are optional and verified by external tools such as mypy, never by the interpreter

<h4 id="core-data-structures" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🐍 Core Data Structures</h4>
```python
nums   = [1, 2, 3]            # list   — ordered, mutable
point  = (10, 20)            # tuple  — ordered, immutable
user   = {"id": 1, "name": "Ada"}   # dict — key/value (like a HashMap)
unique = {1, 2, 3}           # set    — unique, unordered
squares = [n * n for n in nums if n > 1]   # list comprehension
```
- **Comprehensions** are the idiomatic replacement for map/filter loops — concise and fast

<h4 id="functions-1" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🐍 Functions</h4>
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

<h4 id="object-oriented-python" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🐍 Object-Oriented Python</h4>
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

<h4 id="functional-features-and-generators" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🐍 Functional Features and Generators</h4>
```python
total = sum(map(lambda x: x * 2, nums))    # map/filter exist, comprehensions usually preferred

def countdown(n):                          # generator: produces values lazily, one at a time
    while n > 0:
        yield n
        n -= 1
```
- **Generators** (`yield`) stream values without building the whole collection in memory — the basis of Python's lazy iteration

<h4 id="concurrency--and-the-global-interpreter-lock" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🧵 Concurrency — and the Global Interpreter Lock</h4>
| Tool | Use it for | Note |
|---|---|---|
| `threading` | Input/output-bound work (network, disk) | The **Global Interpreter Lock (GIL)** lets only one thread run Python bytecode at a time — no true parallel CPU |
| `multiprocessing` | CPU-bound work | Separate processes, each with its own interpreter — real parallelism, higher overhead |
| `asyncio` | Massive input/output concurrency | Single-threaded cooperative `async`/`await`, similar to JavaScript's event loop |

<h4 id="ecosystem" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🐍 Ecosystem</h4>
- **pip** — package installer; **venv** — isolated per-project environments (the standard practice)
- **Web**: Django (batteries-included), Flask (minimal), FastAPI (modern, async, type-hint driven)
- **Data and AI**: pandas, NumPy, scikit-learn, PyTorch, TensorFlow

<h4 id="python-vs-java" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🐍 Python vs Java</h4>
| Aspect | Java | Python |
|---|---|---|
| Typing | Static, checked at compile time | Dynamic, checked at runtime (optional hints) |
| Execution | Compiled to bytecode, runs on the JVM | Interpreted (CPython bytecode at runtime) |
| Verbosity | More structure and boilerplate | Concise, indentation-based blocks |
| Performance | Faster (JIT-compiled, real threads) | Slower; CPU parallelism limited by the GIL |
| Sweet spot | Large systems, high throughput services | Scripting, data, machine learning, rapid prototypes |

---

<h2 id="-frameworks" style="font-size:33px;font-weight:800;margin:30px 0 12px;">🧩 Frameworks</h2>

Java backend frameworks provide the scaffolding every service needs — dependency injection, configuration, web endpoints, data access — so you write business logic instead of plumbing. **Spring** is the mature default; **Quarkus** and **Micronaut** are the newer cloud-native challengers built around one decisive idea: do at **build time** what Spring historically does at **runtime** (reflection, classpath scanning, proxy generation). That shift slashes startup time and memory, which matters when you run many small containers that scale to zero.

<h3 id="framework-comparison" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🆚 Framework Comparison</h3>
| Aspect | Spring (Boot) | Quarkus | Micronaut |
|---|---|---|---|
| Dependency injection | Runtime (reflection + proxies) | Build time (annotation processing) | Build time (annotation processing) |
| Startup time | Hundreds of milliseconds to seconds | Tens of milliseconds | Tens of milliseconds |
| Memory footprint | Higher | Low | Low |
| GraalVM native image | Supported (Spring AOT) | First-class, built around it | First-class, built around it |
| Reflection at runtime | Heavy | Minimal | Almost none |
| Ecosystem and maturity | Largest by far | Growing, Jakarta/MicroProfile based | Growing |
| Backer | VMware/Broadcom community | Red Hat | Commonhaus Foundation (moved from the Unity Foundation in 2026; originally founded by Object Computing) |

*Takeaway for an interview: all three share the same mental model (inject beans, annotate endpoints). The differentiator is **when** the wiring happens. Spring resolves it as the application boots; Quarkus and Micronaut resolve it during compilation, trading a slightly longer build for dramatically faster, leaner runtime — ideal for Kubernetes and serverless.*

---

<h3 id="spring" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🌱 Spring</h3>

<h4 id="spring-core" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🧩 Spring Core</h4>

<h5 id="core-concepts" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Core Concepts</h5>
- **Dependency Injection**: Allow to inject dependencies dynamically
- **Inversion of Control**: Passing the control of how to create object from the programmer to the framework

<h5 id="core-container" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Core Container</h5>
- **Factory for managing beans**: Spring container manages object lifecycle
- **Application Context**: Main interface for Spring IoC container

<h5 id="infrastructure" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Infrastructure</h5>
- **Aspect Oriented Programming**: Add functionality to objects declaratively. Logging, Security, Transactions
- **AOP**: Aspects
- **Instrumentation**: JMX (Java Management Extension) Remotely monitoring apps
- **Messaging**

<h5 id="data-access-layer" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Data Access Layer</h5>
Handles JDBC
- **JDBC**: Helper classes for managing DB
- **ORM**
- **Transactions**
- **OXM**
- **JMS**: Messaging service

<h5 id="web-layer" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Web Layer</h5>
MVC Framework
- **Servlet**
- **Web Socket**
- **Web**
- **Portlet**

<h5 id="test-layer" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Test Layer</h5>
Support for TDD. Mocking objects and out of container testing
- **Unit**
- **Integration**
- **Mock**

<h5 id="beans" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Beans</h5>
- A "Spring Bean" is simply a Java object
- When Java objects are created by the Spring Container, then Spring refers to them as "Spring Beans"
- Spring Beans are created from normal Java classes .... just like Java objects

<h5 id="scopes" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Scopes</h5>
- **Singleton**: Only one instance per container (default scope)
- **Prototype**: A bean instance for each container request
- **Request**: Scoped to an http request
- **Session**: Scoped to an http session
- **Application**: One instance per `ServletContext` — shared across all sessions of the web app, unlike Singleton which is scoped to the Spring container
- **WebSocket**: One instance per WebSocket session
- *("Global session" existed only for Portlet MVC, distinguishing a portlet's own session from the surrounding portal's session — Spring dropped Portlet MVC entirely in Spring Framework 5, so this scope has had no meaning in any current servlet-based application for several major versions)*

**Singleton** is the default: the container creates exactly one instance of the bean definition and hands that same object to every injection point for the lifetime of the container. It fits stateless services, repositories, and anything that holds no per-request or per-user data.

**Prototype**, by contrast, gives out a brand-new instance on every request for the bean — every injection, every `getBean()` call. Spring instantiates it, runs its initialization callbacks, and then stops managing it: it never calls the destruction callbacks, so any cleanup is the caller's responsibility. Both Singleton and Prototype apply in any Spring application, standalone or web; the remaining scopes exist specifically to solve problems tied to serving HTTP or WebSocket traffic.

**Request scope:** one bean instance is created when an HTTP request begins and discarded when it ends, so two requests arriving at the same instant each get their own instance. That matters for anything that accumulates state over the course of handling a single request — a request-tracing context (correlation identifier, timing data) or a per-request Data Transfer Object accumulator that several collaborators write into — because sharing that object the way a singleton would means concurrent requests silently corrupt each other's data.

**Session scope:** one bean instance per HTTP session, created on first access and living as long as the user's session does, which typically spans many separate HTTP requests from the same browser. A shopping cart is the canonical example: items get added across several page loads, and the cart has to persist between those requests without becoming visible to any other user's session. The distinction from Request scope is the one interviewers probe directly — Request scope is torn down after a single request finishes, while Session scope survives across every request the same user makes until the session expires or is invalidated.

**Application scope:** one bean instance per `ServletContext` — the web application as a whole, rather than the Spring container. With the common setup of one Spring container per web application, Application scope behaves identically to Singleton, so the distinction is easy to dismiss. It becomes real the moment multiple Spring contexts live inside one web application (a root context plus a child `DispatcherServlet` context, or several servlets each with their own context): a Singleton bean then exists once *per context*, while an Application-scoped bean exists once *per `ServletContext`*, so every context shares that single instance.

**WebSocket scope:** one bean instance per WebSocket session — the WebSocket analogue of Session scope, living for the duration of a single WebSocket connection rather than a single HTTP session.

Injecting a narrower-scoped bean into a wider-scoped one exposes a real trap. A singleton controller is instantiated exactly once, at container startup, long before any HTTP request exists — if it held a direct reference to a Request-scoped bean, that reference would be resolved once, against whatever happened to be active at wiring time, and every later request would see that same stale instance instead of its own. Spring's fix is a **scoped proxy**: the singleton doesn't hold the real request-scoped bean at all, it holds a proxy of the same type, and every method call on that proxy looks up the correct instance for the *currently active* request before delegating to it.

```java
@Component
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)   // no interface -> subclass proxy
public class RequestTraceContext {
    private final String correlationId = UUID.randomUUID().toString();
    public String getCorrelationId() { return correlationId; }
}

@RestController
public class OrderController {
    private final RequestTraceContext traceContext;   // actually a proxy, not the real bean

    public OrderController(RequestTraceContext traceContext) {   // wired once, at startup
        this.traceContext = traceContext;
    }

    @GetMapping("/orders/{id}")
    public Order get(@PathVariable String id) {
        traceContext.getCorrelationId();   // proxy resolves *this request's* instance on every call
        return orderService.find(id);
    }
}
```

`proxyMode = ScopedProxyMode.TARGET_CLASS` generates a CGLIB subclass proxy, used when the bean has no interface to proxy against; `ScopedProxyMode.INTERFACES` generates a Java Development Kit (JDK) dynamic proxy instead, when the bean is injected by an interface type it implements. Either way, the singleton's field never changes after wiring — it's the proxy's lookup that changes on every request, not the reference the singleton holds.

<h5 id="bean-lifecycle" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Bean Lifecycle</h5>
Instantiation > Populate properties(injected, fileconfig) > BeanNameAware Context(aware to other resources) > BeanFactoryAware (aware to context) > ApplicationContextAware > PreInitialization > Init() > PostInitialization() > Ready > Container Shutdown > Destroy() > Terminated

<h5 id="application-context-implementations" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Application Context Implementations</h5>
The Spring framework provides several implementations of the ApplicationContext interface: ClassPathXmlApplicationContext and FileSystemXmlApplicationContext for standalone applications, and WebApplicationContext for web applications

**WebApplicationContext**: Creates objects and handles the lifecycle. Extends the ApplicationContext

<h5 id="injection-types" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Injection Types</h5>
- **Constructor injection**: Through constructor. When the class cannot function without the dependent class. Immutability
- **Setter Injection**: Through setters. When the class can function without the dependent class. Changeable dependencies
- **Field Injection**: Through fields. Avoid: tight coupling, breaks immutability and testability

<h5 id="why-constructor-injection-wins-be-ready-to-justify-it" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Why Constructor Injection Wins (be ready to justify it)</h5>
- **Immutability**: Dependencies can be declared final
- **Testability**: The class can be instantiated with plain `new` in a unit test, no reflection or container needed
- **Fail fast**: A missing dependency breaks at startup, not at first use
- Since Spring 4.3, `@Autowired` is optional when the class has a single constructor

<h5 id="circular-dependencies" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Circular Dependencies</h5>

**Circular dependency:** bean A depends on bean B (needs B injected into it) while bean B simultaneously depends on bean A — a cycle the container has to resolve while it builds the application context at startup. Whether Spring can resolve it at all depends entirely on which injection type the cycle is built from.

**Constructor injection cannot resolve a cycle.** Constructing A means calling `new A(b)`, which needs a fully-built `b` in hand before the constructor runs; constructing B needs the same fully-built `a` before *its* constructor runs. There's no valid order for that — building either one first requires the other to already be finished — so Spring gives up and throws `BeanCurrentlyInCreationException` at startup instead of silently deadlocking. That's a hard failure by design, not a shortcoming to work around.

**Setter and field injection can resolve a cycle**, because unlike a constructor they don't require the dependency to be complete before the depending object exists — an object can be instantiated as an empty shell first and have its fields populated afterward. Spring exploits exactly that gap with a **three-level cache** of singleton beans under construction:

1. **Singleton objects cache** — fully initialized beans, ready to hand out
2. **Early singleton objects cache** — beans that have been instantiated (the constructor has run) but not yet populated with their dependencies
3. **Singleton factories cache** — factories that can produce an early reference to a bean on demand, used so Aspect Oriented Programming proxies get created at the right moment instead of too early

Walking through A and B with setter injection: Spring instantiates A (empty shell, no dependencies set yet) and registers an early reference to it. While populating A's setters it discovers A needs B, so it goes to create B — instantiates B, registers B's early reference, then while populating B's setters discovers B needs A. Instead of building A from scratch again, which would recurse forever, Spring finds A's early reference already sitting in the cache from the first step and injects that into B. B finishes construction fully populated, gets returned and injected into A's setter, and the cycle resolves with both beans complete.

```
create A ─┬─> instantiate A (empty shell) ──> cache early ref to A
          │
          └─> populate A.b ──> create B ─┬─> instantiate B (empty shell)
                                          │
                                          └─> populate B.a ──> cache lookup finds early ref to A
                                                                (no need to build A again)
                                                                    │
                                          B fully populated <───────┘
              A.b = B (complete) <── B returned
          A fully populated
```

This only works because setter and field injection let Spring inject an object before it's fully populated and let later field assignment catch up — a constructor offers no such window, since the object doesn't exist until the constructor call returns with every argument already resolved. That mechanical difference is the deeper reason behind the [Why Constructor Injection Wins](#why-constructor-injection-wins-be-ready-to-justify-it) recommendation above: constructor injection's inability to paper over a cycle via this cache is exactly what makes a design problem fail loudly at startup instead of working by accident through a caching mechanism most developers have never heard of. Either way, resolving a cycle by relying on the cache — or worse, patching it with `@Lazy` — treats a symptom; the real fix is to redesign, extracting the shared logic both beans need into a third bean that each depends on one-directionally.

<h5 id="controller--service--repository-layering" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Controller → Service → Repository Layering</h5>
A standard Representational State Transfer (REST) application is structured in three horizontal layers, each a constructor-injected interface depending only on the layer below:

| Layer | Annotation | Responsibility |
|---|---|---|
| Web (Controller) | `@RestController` + `@RequestMapping` | Parse the HTTP request, call the service, return the response (serialized to JSON by Jackson) |
| Service | `@Service` | Business logic and orchestration; owns the transaction boundary (`@Transactional`) |
| Repository | `@Repository` | Data access; translates persistence exceptions into Spring's `DataAccessException` hierarchy |

- Prefer **package-by-feature** (`user`, `order`) over package-by-layer, so the tree communicates the domain
- A custom exception annotated `@ResponseStatus(HttpStatus.NOT_FOUND)` is mapped to a 404 automatically when it leaves a controller

<h5 id="data-transfer-object-dto-mapping" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Data Transfer Object (DTO) Mapping</h5>
A Data Transfer Object (DTO) carries data across a layer boundary. The discipline: **never expose the persistence entity directly** — that mixes serialization with persistence and risks leaking internal fields (such as a password hash).
- **Request DTO**: holds the deserialized `@RequestBody`; validation annotations live here
- **Response DTO**: defines exactly what Jackson serializes; an API-contract change touches only this class, not the entity

```java
public record UserDto(UUID id, String email) {            // no password field
    static UserDto from(User user) { return new UserDto(user.getId(), user.getEmail()); }
}
```

<h4 id="spring-boot" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🚀 Spring Boot</h4>

<h5 id="annotations" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Annotations</h5>

<h6 id="component-annotations" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Component Annotations</h6>
- **@Component**: Generic stereotype for any Spring managed component, indicates a bean is created
- **@Repository**: Stereotype for persistence layer, Provides the data, database interaction, mapping. Additionally translates persistence exceptions into Spring's unified DataAccessException hierarchy
- **@Service**: Stereotype for service layer, Business logic, data manipulation, starts transactions
- **@Controller**: Stereotype for presentation layer (spring mvc), Process requests, builds response
- **@RestController** (@Controller & @ResponseBody): Stereotype for REST controller

*Annotations should be placed on the implementation, not the interface, to maintain decoupling*

<h6 id="configuration-annotations" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Configuration Annotations</h6>
- **@Configuration**: Declares that the class contains @Bean methods to be processed by the Spring container
- **@ComponentScan**: Configures which packages to scan for classes
- **@EnableAutoConfiguration**: Autoconfigures beans based on the classpath
- **@SpringBootApplication** (@SpringBootConfiguration, @EnableAutoConfiguration, @ComponentScan): Stereotype marking a class for bootstrapping and setting the @ComponentScan from that class level down

<h6 id="web-annotations" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Web Annotations</h6>
- **@RequestMapping**: Indicates the mapping of the request to a path
- **@GetMapping, @PostMapping**, etc: Mark controller to respond to the http method
- **@RestController**(@Controller && @ResponseBody): Marks as a controller that returns data
- **@PathVariable**: Maps a path var to a param in spring
- **@RequestParam**: Maps a query param to a java param
- *(`@PathParam` is **not** a Spring annotation — it's Jakarta REST/JAX-RS's equivalent of `@PathVariable` above; mentioned here only so the two aren't confused when reading code from a JAX-RS-based service)*
- **@RequestBody**: Deserializes HttpRequest (JSON) to an object
- **@ResponseBody**: Serializes the object and sends it as a response (JSON)
- **@Value**: For injecting values from the properties/yml file

<h6 id="injection--disambiguation-annotations" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Injection &amp; Disambiguation Annotations</h6>
- **@Autowired**: Injects by type, then narrows by name; optional on a single constructor since Spring 4.3
- **@Qualifier("name")**: Selects one bean among several candidates of the same type, by name
- **@Primary**: Marks the default candidate among several beans of the same type
- **@Bean vs @Component**: `@Component` annotates a class you own (detected by component scanning); `@Bean` annotates a method inside a `@Configuration` class, for objects you do not own (third-party classes)

<h6 id="configuration-binding-and-profiles" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Configuration Binding and Profiles</h6>
- **@Value("${property}")**: Injects a single property value; `@Value("${app.timeout:30}")` supplies a colon-delimited default
- **@ConfigurationProperties(prefix = "app")**: Binds a whole property prefix to a typed class — preferred over many `@Value` (supports Jakarta Bean Validation, completion metadata, refactoring)
- **@Profile("dev")**: The bean is only registered when that profile is active — swap implementations per environment (stub gateway in `dev`, real one in `prod`)
- **Externalized configuration**: Spring Boot reads `application.properties` / `application.yml`; a profile file `application-{profile}.properties` overrides the base when its profile is active
- **Property precedence** (highest wins): command-line args → environment variables → `application-{profile}.properties` → `application.properties`
- **Activation**: `--spring.profiles.active=prod` (argument) or `SPRING_PROFILES_ACTIVE=prod` (environment, via relaxed binding); `@ActiveProfiles("test")` activates one for a test class

<h6 id="exception-handling-annotations" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Exception Handling Annotations</h6>
- **@ControllerAdvice / @RestControllerAdvice**: Declares a global, cross-controller exception handling component applied to every controller
- **@ExceptionHandler(SomeException.class)**: Marks a method that converts one exception type into a structured HTTP response (the argument type selects the exception)
- **Consistent error envelope** — the answer interviewers want:

```java
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)   // @Valid failures
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, Object> handleValidation(MethodArgumentNotValidException ex) {
        var errors = ex.getBindingResult().getFieldErrors().stream()
            .map(fe -> Map.of("field", fe.getField(), "message", fe.getDefaultMessage()))
            .toList();
        return Map.of("errors", errors);                       // same JSON shape on every 400
    }
    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String, String> handleNotFound(ResourceNotFoundException ex) {
        return Map.of("error", ex.getMessage());
    }
}
```
- **`@ResponseStatus` on the exception class** handles simple cases; `@ControllerAdvice` gives more control (logging, custom body)
- **Spring Boot 3**: `spring.mvc.problemdetails.enabled=true` emits RFC 9457 `ProblemDetail` error bodies with no custom code

<h6 id="transactional" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Transactional</h6>
- **@EnableTransactionManagement**: Use in a @Configuration class to enable transactional support
- **@Transactional is proxy based**: Spring wraps the bean in a proxy that opens, commits or rolls back the transaction around the method call
  - **Self-invocation gotcha (classic question)**: A call from one method to another @Transactional method of the *same class* bypasses the proxy — no transaction is started
  - **Rollback rules**: Rolls back on unchecked exceptions by default; checked exceptions commit unless `rollbackFor` says otherwise
  - **Propagation levels**: REQUIRED (default: join the current transaction or create one), REQUIRES_NEW (suspend the current one, open a fresh one), NESTED (savepoint inside the current one)
  - **readOnly = true**: Optimization hint for read paths (no dirty checking, possible routing to read replicas)

<h6 id="requestresponse-entities" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Request/Response Entities</h6>
- **RequestEntity**
- **ResponseEntity**

<h6 id="run-on-start" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Run on Start</h6>
- **CommandLineRunner**: Receives argument
- **ApplicationRunner**

<h5 id="bean-validation-jakarta-bean-validation-java-specification-request-380" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Bean Validation (Jakarta Bean Validation, Java Specification Request 380)</h5>
Hibernate Validator (the reference implementation of Java Specification Request, JSR-380) integrates with Spring MVC so a single `@Valid` on a controller parameter runs all constraint checks before the method body. Flow: JSON → Jackson deserializes into the request Data Transfer Object → Spring validates → on failure throws `MethodArgumentNotValidException` *before* the service is reached → `@ControllerAdvice` turns it into a 400.

```java
public record CreateUserParameters(@NotBlank @Email String email,
                                   @NotNull @Size(min = 8, max = 100) String password) {}

@PostMapping @ResponseStatus(HttpStatus.CREATED)
public UserDto create(@Valid @RequestBody CreateUserParameters p) { ... }   // @Valid triggers checks
```

| Annotation | Validates |
|---|---|
| `@NotNull` | Not null (does not reject a blank string) |
| `@NotBlank` | Not null and at least one non-whitespace character (strings only) |
| `@Size(min, max)` | String length or collection size within bounds (inclusive) |
| `@Min` / `@Max` | Numeric value at or above / at or below a bound (inclusive) |
| `@Email` / `@Pattern(regexp)` | Email format / matches a regular expression |
| `@Past` / `@Future` | Temporal value before / after now |

Custom rule: write an annotation plus a `ConstraintValidator<A, T>`, link them with `@Constraint(validatedBy = ...)`; Spring beans can be injected into the validator.

<h5 id="how-auto-configuration-actually-works-senior-question" style="font-size:16px;font-weight:600;margin:18px 0 7px;">How Auto-Configuration Actually Works (senior question)</h5>
1. `@EnableAutoConfiguration` loads the candidate configuration classes listed in `META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports` (formerly `spring.factories`)
2. Each candidate is guarded by conditions: **@ConditionalOnClass** (a library is on the classpath), **@ConditionalOnMissingBean** (you did not define your own bean), **@ConditionalOnProperty**, and the rest of the @Conditional family
3. **Starters** are simply curated dependency sets: they put the right classes on the classpath so the matching auto-configurations activate
4. To override: declare your own bean (it wins, thanks to @ConditionalOnMissingBean) or exclude the auto-configuration (`@SpringBootApplication(exclude = ...)`)

<h5 id="starters-and-actuator" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Starters and Actuator</h5>
A **starter** is one dependency that pulls in a curated, tested set of libraries; the classes it adds to the classpath activate the matching auto-configuration.

| Starter | What it brings |
|---|---|
| `spring-boot-starter-web` | Embedded Tomcat, Spring MVC, Jackson |
| `spring-boot-starter-data-jpa` | Hibernate, Spring Data JPA, a transaction manager |
| `spring-boot-starter-security` | Spring Security filter chain and authentication scaffolding |
| `spring-boot-starter-test` | JUnit 5, Mockito, MockMvc, AssertJ |
| `spring-boot-starter-actuator` | Production endpoints (`/actuator/health`, `/info`, `/metrics`) |

**Spring Boot Actuator** exposes production-ready endpoints over HTTP (or Java Management Extensions) with no application code: `/actuator/health` (the Kubernetes liveness/readiness probe target), `/actuator/metrics` (Micrometer metrics — Java Virtual Machine memory, garbage collection, request latencies). Endpoints are restricted by default; expose them selectively with `management.endpoints.web.exposure.include=health,info,metrics`.

<h5 id="testing-spring-applications" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Testing Spring Applications</h5>
- **@SpringBootTest**: Loads the full application context — slow, reserve it for integration tests; add `@AutoConfigureMockMvc` to get a `MockMvc` wired into the full context
- **@WebMvcTest(MyController.class)**: Controller slice only; `MockMvc` is auto-wired — supply a `@MockitoBean` for each service the controller needs
- **@DataJpaTest**: Repository slice only, with an embedded database; each test runs in a transaction rolled back on completion, so data mutations need no cleanup
- **@MockitoBean vs @Mock**: `@MockitoBean` (Spring Framework's `spring-test` module) replaces a bean inside the Spring context with a Mockito mock (injected everywhere that type is used); plain `@Mock` knows nothing about Spring and suits pure unit tests. **`@MockBean`/`@MockitoBean` history**: Spring Boot's own `@MockBean` was deprecated in Boot 3.4 and removed in Boot 4.0 (Nov 2025) in favor of the equivalent `@MockitoBean`/`@MockitoSpyBean` now provided directly by Spring Framework — use those on any current project
- **Testcontainers**: Real PostgreSQL/Kafka running in Docker during integration tests — closer to production than embedded fakes, and a strong senior signal
- **Test pyramid**: Many unit tests, fewer slice/integration tests, few end-to-end tests

```java
@WebMvcTest(UserRestController.class)
class UserRestControllerTest {
    @Autowired MockMvc mvc;
    @MockitoBean UserService service;

    @Test void createUser_returnsCreated() throws Exception {
        given(service.create(any(), any())).willReturn(new UserDto(UUID.randomUUID(), "a@b.com"));
        mvc.perform(post("/api/users").contentType(MediaType.APPLICATION_JSON)
                .content("{\"email\":\"a@b.com\",\"password\":\"secret99\"}"))
           .andExpect(status().isCreated())                 // HTTP 201
           .andExpect(jsonPath("$.email").value("a@b.com")); // body assertion
    }
}
// status(), jsonPath(), content() are static imports from MockMvcResultMatchers / RequestBuilders
```

<h5 id="building-a-rest-api-end-to-end-worked-example-patterns" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Building a REST API End-to-End (worked example patterns)</h5>
Patterns worth following when building a real Spring Boot REST API from scratch:
- **Package by feature, not by layer**: `com.example.user/` (containing its entity, repository, service, and a `web` sub-package for the controller/Data Transfer Object) beats scattering one feature's classes across `controller/`, `service/`, `repository/` — keeps the project's core abstractions visible in the package tree
- **Dedicated ID value classes** (`UserId` wrapping a `UUID`) instead of a raw `UUID`/`Long` field: the type signature documents intent, the compiler prevents assigning a `UserId` where an `OrderId` is expected, and swapping the underlying primitive later touches one class instead of every call site
- **Never return an entity directly from a controller** — always map to a Data Transfer Object at the boundary; the wire format and the persistence shape usually need to diverge, and annotating an entity with serialization annotations accumulates noise over time
- **Flyway migrations + Testcontainers**: never let a migration script change after it ships (Flyway checksums each one and refuses to start if it changed — add a new migration instead); run integration tests against the actual database engine via Testcontainers rather than an in-memory substitute, since the substitute is rarely a perfect behavioral match
- **Spring REST Docs**: generate API documentation snippets directly from passing `MockMvc` tests — the documentation cannot go stale without a test also failing, since undocumented or missing response fields fail the build

<h4 id="spring-mvc" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🌐 Spring MVC</h4>

<h5 id="architecture" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Architecture</h5>
Spring MVC follows the **Front Controller** pattern: a single servlet receives every request and dispatches it. The request flow:
1. **Browser → DispatcherServlet**: All requests hit one entry point (the front controller)
2. **DispatcherServlet → Controller**: It consults handler mappings to find the controller method for the URL, then invokes it
3. **Controller → Model**: The method runs the business logic and returns data (the model) plus a logical view name
4. **ViewResolver → View**: The resolver turns the logical name into a concrete template, which renders the model
5. **View → Browser**: The rendered response (HTML, or JSON when using `@RestController`) is returned

*For REST APIs the View step is skipped: `@ResponseBody` / `@RestController` serializes the returned object straight to JSON via an HttpMessageConverter.*

<h5 id="configuration" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Configuration</h5>
- Configure DispatcherServlet
- Setup URL mappings to the DispatcherServlet
- Setup ComponentScanning
- Configure conversion, formatting, validation
- Configure ViewResolver

<h5 id="mapping" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Mapping</h5>
- **Servlet Mapping**: Which web container of the Java servlet should be invoked for a given URL. The Servlet container decides which Servlet it should forward the request to
- **Request Mapping**: Maps a Request to a controller method to invoke as a response to the request
- **View Resolver**: Locates the view to rendered as a response to a request (application.properties prefix + suffix)

<h5 id="template-engine" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Template Engine</h5>
- **Thymeleaf**: Replace JSP

<h4 id="spring-webflux" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🌊 Spring WebFlux</h4>

Spring's reactive, non-blocking web stack (Spring 5+), a parallel alternative to the servlet-based Spring MVC. A small pool of event-loop threads serves thousands of concurrent connections, and results flow back as an asynchronous stream of events instead of a blocked return value. It is built on the Reactive Streams specification and powered by Project Reactor.

<h5 id="overview-and-purpose" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Overview and purpose</h5>
- **What it buys you**: throughput and resource efficiency under high concurrency with slow or numerous input/output calls — not lower latency for a single request
- **Use it when**: the whole chain is non-blocking (reactive web → reactive client → reactive database), or you need streaming (Server-Sent Events, WebSocket)
- **Avoid it when**: a blocking relational database over Java Database Connectivity sits in the path — the blocking call cancels the benefit and Spring MVC is simpler. Reactive is all-or-nothing along a request

<h5 id="architecture-and-logic" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Architecture and logic</h5>
- Runs on **Netty** (an event-loop server) by default, or any Servlet 3.1+ container (Tomcat, Jetty, Undertow) in non-blocking mode
- Event-loop threads **never block**: a handler returns a `Publisher` immediately, and the framework subscribes and writes each element as it is produced
- **Backpressure** is the core safety valve: the subscriber asks for only as many elements as it can handle (`request(n)`), so a fast producer never floods a slow consumer
- Publishers are **lazy**: nothing happens until something subscribes — the framework subscribes for you when it serves the response

| Dimension | Spring MVC | Spring WebFlux |
|---|---|---|
| Concurrency model | One thread per request, blocking | Event loop, non-blocking |
| Return types | `T`, `ResponseEntity<T>` | `Mono<T>`, `Flux<T>` |
| Default server | Tomcat (Servlet) | Netty |
| Data access | Java Persistence API / Java Database Connectivity (blocking) | R2DBC, reactive Mongo (non-blocking) |
| Best fit | Standard create/read/update/delete on a blocking database | High concurrency, streaming, a fully reactive chain |

<h5 id="reactive-foundations" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Reactive foundations</h5>
The building blocks every endpoint sits on — the Reactive Streams contract, the Project Reactor publishers, and the operators that drive them.

<h6 id="reactive-streams-the-specification" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Reactive Streams (the specification)</h6>
Four interfaces (mirrored by `java.util.concurrent.Flow`) that define asynchronous data flow with backpressure. The publish/subscribe handshake:
1. `publisher.subscribe(subscriber)` — the subscriber registers
2. the publisher calls `subscriber.onSubscribe(subscription)`, handing back a `Subscription`
3. the subscriber calls `subscription.request(n)` to pull up to `n` elements (backpressure)
4. the publisher pushes through `subscriber.onNext(item)`, at most `n` times
5. it ends with `subscriber.onComplete()` on success or `subscriber.onError(error)` on failure; the subscriber may call `subscription.cancel()` at any point

**Properties**: asynchronous, non-blocking, backpressured.

```java
// publisher: a source of elements
public interface Publisher<T> {
    void subscribe(Subscriber<? super T> s);
}

// subscriber: consumes the elements
public interface Subscriber<T> {
    void onSubscribe(Subscription s);   // receives the subscription handle
    void onNext(T item);                // next element
    void onError(Throwable t);          // terminal signal: failure
    void onComplete();                  // terminal signal: success
}

// subscription: the link the subscriber drives for backpressure
public interface Subscription {
    void request(long n);               // demand n more elements
    void cancel();                      // stop and release the source
}

// processor: a stage that is both subscriber and publisher — a transform step
// sitting between two others. In Project Reactor, prefer Sinks over writing one.
public interface Processor<T, R> extends Subscriber<T>, Publisher<R> {}
```

<h6 id="project-reactor--mono-and-flux" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Project Reactor — Mono and Flux</h6>
The reactive library WebFlux is built on. Both types implement `Publisher`, and both are lazy and immutable (every operator returns a new publisher).
- **`Mono<T>`** — 0 or 1 element: a single result or empty (find-by-id, a count, the saved entity)
- **`Flux<T>`** — 0..N elements: a stream (a list, a paged query, a live feed)

```java
Mono<User>    one   = Mono.just(user);                  // a known value
Mono<User>    none  = Mono.empty();                      // completes with nothing
Mono<User>    lazy  = Mono.fromCallable(() -> load());   // deferred, runs on subscribe
Flux<Integer> many  = Flux.just(1, 2, 3);
Flux<User>    from  = Flux.fromIterable(users);
Flux<Long>    ticks = Flux.interval(Duration.ofSeconds(1)); // 0,1,2,... every second
Mono<User>    fail  = Mono.error(new NotFoundException());
```

<h6 id="common-operators-the-functions-used-daily" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Common operators (the functions used daily)</h6>
| Operator | On | Purpose |
|---|---|---|
| `map(fn)` | Mono/Flux | transform each element synchronously |
| `flatMap(fn)` | Mono/Flux | map each element to a `Publisher` and flatten — async, order not preserved |
| `concatMap(fn)` | Flux | like `flatMap` but sequential and order-preserving |
| `filter(pred)` | Flux | keep only matching elements |
| `zip` / `zipWith` | Mono/Flux | combine several publishers element by element |
| `merge` / `concat` | Flux | join streams — interleaved vs one after another |
| `collectList()` | Flux → Mono | gather a `Flux<T>` into a `Mono<List<T>>` |
| `switchIfEmpty` / `defaultIfEmpty` | Mono/Flux | fallback when the source is empty |
| `take(n)` / `skip(n)` | Flux | keep or drop a prefix |
| `doOnNext` / `doOnError` / `doOnComplete` | Mono/Flux | side effects (logging) without changing the data |
| `onErrorResume` / `onErrorReturn` / `retry` | Mono/Flux | recover from an error |
| `subscribeOn` / `publishOn` | Mono/Flux | choose the scheduler (thread) up- or down-stream |
| `timeout` / `delayElements` | Mono/Flux | time bounds and pacing |

> `map` vs `flatMap`: use `map` for a plain value transform, `flatMap` when the transform itself returns a `Mono`/`Flux` (for example, calling another reactive service).

<h6 id="subscribing-and-bridging--terminal-operations" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Subscribing and bridging — terminal operations</h6>
A pipeline is only a blueprint until a **terminal** call subscribes to it. In a controller you almost never subscribe yourself — you **return** the `Mono`/`Flux` and let WebFlux subscribe when it writes the response. The terminal calls matter at the edges (tests, `claude.py`, legacy blocking code):

| Call | On | Effect |
|---|---|---|
| `subscribe(...)` | Mono/Flux | start the pipeline, react to signals through callbacks (fire-and-forget) |
| `block()` | Mono | subscribe and **wait**, returning the single value (or `null`) — blocking |
| `blockOptional()` | Mono | like `block()` but returns `Optional<T>` for the empty case |
| `blockFirst()` / `blockLast()` | Flux | subscribe and wait for the first / last element |
| `toFuture()` | Mono | bridge to a `CompletableFuture<T>` |
| `toStream()` / `toIterable()` | Flux | bridge to a blocking `Stream` / `Iterable` |

> **Never call `block()` inside a reactive chain or on an event-loop thread** — it stalls the loop and defeats WebFlux (recent Reactor versions throw `IllegalStateException` if you do). Use it only in tests, `claude.py`, or a genuinely blocking layer; inside a pipeline, compose instead.

**Sequencing terminals** keep you reactive instead of blocking:
- `then()` — ignore the result, continue when the source completes (`Mono<Void>`)
- `thenReturn(value)` — complete, then emit a fixed value
- `thenMany(flux)` — complete a `Mono`, then switch to a `Flux`
- `flatMapMany(fn)` — turn a `Mono` into a `Flux` by mapping it to a publisher

<h5 id="building-a-rest-api" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Building a REST API</h5>
The two endpoint styles, plus the request-binding, response-building, and validation calls they share.

<h6 id="annotated-controllers-the-common-style" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Annotated controllers (the common style)</h6>
Identical annotations to Spring MVC; only the return types become `Mono`/`Flux`.
```java
@RestController
@RequestMapping("/products")
class ProductController {

    private final ProductService service;          // its methods return Mono/Flux
    ProductController(ProductService service) { this.service = service; }

    @GetMapping                                     // GET /products -> stream of products
    Flux<Product> all() { return service.findAll(); }

    @GetMapping("/{id}")                            // GET /products/{id}
    Mono<ResponseEntity<Product>> byId(@PathVariable String id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @PostMapping                                    // POST /products
    @ResponseStatus(HttpStatus.CREATED)
    Mono<Product> create(@RequestBody @Valid Mono<Product> body) {
        return body.flatMap(service::save);
    }

    @DeleteMapping("/{id}")
    Mono<Void> delete(@PathVariable String id) { return service.delete(id); }

    @GetMapping(value = "/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    Flux<Product> stream() { return service.liveFeed(); }   // Server-Sent Events
}
```

<h6 id="functional-endpoints-the-alternative-style" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Functional endpoints (the alternative style)</h6>
Routes are declared as data instead of annotations: a `RouterFunction` maps a `RequestPredicate` to a `HandlerFunction`, and a handler takes a `ServerRequest` and returns a `Mono<ServerResponse>`.
```java
// a handler: ServerRequest in, Mono<ServerResponse> out
class ProductHandler {
    Mono<ServerResponse> get(ServerRequest req) {
        Mono<Product> product = service.findById(req.pathVariable("id"));
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(product, Product.class);
    }
    Mono<ServerResponse> save(ServerRequest req) {
        Flux<Product> body = req.bodyToFlux(Product.class);     // or req.bodyToMono(...)
        return ServerResponse.status(HttpStatus.CREATED).body(service.saveAll(body), Product.class);
    }
}

// the router: predicate -> handler, built fluently
RouterFunction<ServerResponse> routes = RouterFunctions.route()
        .GET("/products/{id}", handler::get)
        .POST("/products", handler::save)
        .build();
```
Common `RequestPredicates`: `GET`/`POST`/`PUT`/`DELETE(pattern)`, `path(pattern)`, `accept(mediaType)`, `contentType(mediaType)`, `method(httpMethod)` — combine them with `.and(...)` / `.or(...)`.

<h6 id="reading-the-request--binding-the-inputs" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Reading the request — binding the inputs</h6>
In annotated controllers Spring binds each part of the request to a method parameter; in functional handlers you pull the same data off `ServerRequest`.

| Annotation (controller) | `ServerRequest` (handler) | Reads |
|---|---|---|
| `@PathVariable` | `pathVariable("id")` | a templated path segment (`/products/{id}`) |
| `@RequestParam` | `queryParam("q")` | a query-string parameter (`?q=...`) |
| `@RequestHeader` | `headers().firstHeader(...)` | a request header |
| `@RequestBody Mono<T>` / `Flux<T>` | `bodyToMono(T.class)` / `bodyToFlux(T.class)` | the deserialized body |
| `@CookieValue` | `cookies()` | a cookie |
| `@RequestPart` | `multipartData()` | one part of a multipart/form-data upload |

- **`ServerWebExchange`** is the low-level container for the whole exchange (`ServerHttpRequest` + `ServerHttpResponse`); inject it only when you need raw access — headers, status, the body as a `Flux<DataBuffer>` — that the binding annotations do not expose.

<h6 id="writing-the-response--builders" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Writing the response — builders</h6>
Both styles build the response fluently; only the return type differs.
```java
// annotated controllers: wrap in ResponseEntity for explicit status and headers
ResponseEntity.ok(body);                           // 200 with a body
ResponseEntity.status(HttpStatus.CREATED).body(x); // any status + body
ResponseEntity.created(uri).build();               // 201 + Location header
ResponseEntity.noContent().build();                // 204
ResponseEntity.notFound().build();                 // 404
ResponseEntity.badRequest().body(error);           // 400

// functional handlers: build a Mono<ServerResponse>
ServerResponse.ok().bodyValue(product);                 // an already-resolved value
ServerResponse.ok().body(productMono, Product.class);   // a publisher + its element type
ServerResponse.status(HttpStatus.CREATED).build();      // no body
```
> `bodyValue(x)` takes a resolved object; `body(publisher, Class)` takes a `Mono`/`Flux` plus its element type. Passing a publisher to `bodyValue` serializes the publisher itself — a common mistake.

<h6 id="validating-the-request-body" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Validating the request body</h6>
Annotate the payload with Jakarta Bean Validation constraints and trigger them with `@Valid` (or `@Validated`).
```java
record CreateProduct(
        @NotBlank String name,            // not null, and not empty or whitespace
        @Positive BigDecimal price,       // strictly greater than zero
        @Size(max = 280) String notes) {}

@PostMapping
Mono<Product> create(@RequestBody @Valid Mono<CreateProduct> body) {
    return body.flatMap(service::create);
}
```
- Common constraints: `@NotNull`, `@NotBlank`, `@NotEmpty`, `@Size(min, max)`, `@Min` / `@Max`, `@Positive` / `@Negative`, `@Email`, `@Pattern(regexp)`
- On failure WebFlux raises `WebExchangeBindException` (a `400 Bad Request`); handle it in a `@ControllerAdvice` `@ExceptionHandler` to shape the error body (ideally RFC 9457 "Problem Details", which obsoleted the original RFC 7807 in 2023)
- For business rules inside the chain, fail the stream instead of throwing — `switchIfEmpty(Mono.error(new NotFoundException()))` or `onErrorMap(...)` — and let the advice translate the exception into a status code

<h5 id="webclient--the-reactive-http-client" style="font-size:16px;font-weight:600;margin:18px 0 7px;">WebClient — the reactive HTTP client</h5>
The non-blocking replacement for the blocking `RestTemplate`; returns `Mono`/`Flux`.
```java
WebClient client = WebClient.create("https://api.example.com");
Mono<Product> product = client.get().uri("/products/{id}", id)
        .retrieve()
        .bodyToMono(Product.class);
```

<h5 id="advanced-features" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Advanced features</h5>
- **Backpressure strategies**: when a producer outruns a consumer, control overflow with `onBackpressureBuffer`, `onBackpressureDrop`, or `limitRate(n)`
- **Threading and schedulers**: event-loop threads must never block. Offload an unavoidable blocking call with `subscribeOn(Schedulers.boundedElastic())`; use `publishOn` to switch the downstream thread. `subscribeOn` affects the source, `publishOn` affects everything after it
- **Error handling**: `onErrorResume` (fallback publisher), `onErrorReturn` (fallback value), `retry` / `retryWhen` (with backoff); globally, a `@ControllerAdvice` `@ExceptionHandler` or a custom `WebExceptionHandler`, ideally emitting RFC 9457 "Problem Details" (the 2023 revision of RFC 7807)
- **Streaming**: return a `Flux` with `produces = MediaType.TEXT_EVENT_STREAM_VALUE` for Server-Sent Events, or a `Flux<ServerSentEvent<T>>` for full control; bidirectional streaming uses a `WebSocketHandler`
- **Reactive data access**: Reactive Relational Database Connectivity (R2DBC) with `ReactiveCrudRepository`, or reactive MongoDB. Never place blocking Java Persistence API / Java Database Connectivity in a reactive chain — wrap it in `Schedulers.boundedElastic()` only if you truly must
- **Sinks**: `Sinks.many()` / `Sinks.one()` push values into a `Flux`/`Mono` programmatically (the modern replacement for `Processor`) — useful for broadcasting events
- **Testing**: `StepVerifier` asserts the sequence of emitted elements and the terminal signal; `@WebFluxTest` slices the web layer and `WebTestClient` drives endpoints without a running server

```java
StepVerifier.create(service.findById("1"))
        .expectNextMatches(product -> product.id().equals("1"))
        .verifyComplete();
```

<h4 id="runnable-code-examples" style="font-size:20px;font-weight:700;margin:22px 0 8px;">💻 Runnable Code Examples</h4>

Every core concept above is implemented as a self-contained, executable class (each with a `claude.py` and prints) under [src/main/java/algorithm/concepts/spring/](../src/main/java/algorithm/concepts/spring/), following the same style as the algorithm `*Basics.java` guides. Dependencies are declared in [build.gradle](../build.gradle) (`spring-context`, `aspectjweaver`, `jakarta.annotation-api`). Run any class directly from the IDE, or from the command line with the Gradle wrapper:

```bash
# Run any example's main() by its fully-qualified name
./gradlew runClass -PmainClass=algorithm.concepts.spring.ioc.IocContainerExample

# Or just compile everything
./gradlew compileJava
```

<h5 id="1-inversion-of-control--the-container--ioccontainerexamplejavasrcmainjavaalgorithmconceptsspringiocioccontainerexamplejava" style="font-size:16px;font-weight:600;margin:18px 0 7px;">1. Inversion of Control &amp; the container — [IocContainerExample.java](../src/main/java/algorithm/concepts/spring/ioc/IocContainerExample.java)</h5>
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

<h5 id="2-the-three-injection-types--disambiguation--injectiontypesexamplejavasrcmainjavaalgorithmconceptsspringdiinjectiontypesexamplejava" style="font-size:16px;font-weight:600;margin:18px 0 7px;">2. The three injection types + disambiguation — [InjectionTypesExample.java](../src/main/java/algorithm/concepts/spring/di/InjectionTypesExample.java)</h5>
```java
@Component @Primary  static class EmailChannel implements MessageChannel { ... }  // default pick
@Component("sms")    static class SmsChannel   implements MessageChannel { ... }  // pick by name

// 1) CONSTRUCTOR (preferred): final field, testable, fail fast — @Autowired implicit since 4.3
NotificationService(MessageChannel defaultChannel) { this.defaultChannel = defaultChannel; }

// 2) SETTER: optional/changeable dependencies      3) FIELD: avoid (reflection-only, hidden)
@Autowired @Qualifier("sms") private MessageChannel fieldInjectedChannel;
```

<h5 id="3-bean-lifecycle--scopes--beanlifecycleandscopesexamplejavasrcmainjavaalgorithmconceptsspringlifecyclebeanlifecycleandscopesexamplejava" style="font-size:16px;font-weight:600;margin:18px 0 7px;">3. Bean lifecycle &amp; scopes — [BeanLifecycleAndScopesExample.java](../src/main/java/algorithm/concepts/spring/lifecycle/BeanLifecycleAndScopesExample.java)</h5>
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

<h5 id="4-proxies--the-self-invocation-gotcha--aopproxyexamplejavasrcmainjavaalgorithmconceptsspringaopaopproxyexamplejava" style="font-size:16px;font-weight:600;margin:18px 0 7px;">4. Proxies &amp; the self-invocation gotcha — [AopProxyExample.java](../src/main/java/algorithm/concepts/spring/aop/AopProxyExample.java)</h5>
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

<h5 id="5-application-events-observer-pattern--applicationeventsexamplejavasrcmainjavaalgorithmconceptsspringeventsapplicationeventsexamplejava" style="font-size:16px;font-weight:600;margin:18px 0 7px;">5. Application events (Observer pattern) — [ApplicationEventsExample.java](../src/main/java/algorithm/concepts/spring/events/ApplicationEventsExample.java)</h5>
```java
record OrderPlaced(String orderId) {}                  // since Spring 4.2: any plain object

publisher.publishEvent(new OrderPlaced(orderId));      // publisher knows NOTHING about listeners

@EventListener
void on(OrderPlaced event) { ... }                     // each new reaction = one new listener bean
```
Listeners run synchronously on the caller thread by default (`@Async` + `@EnableAsync` to detach). Same thinking as Kafka events between services — here inside one Java Virtual Machine.

<h5 id="6-strategy-pattern-via-map-injection--strategypatternexamplejavasrcmainjavaalgorithmconceptsspringstrategystrategypatternexamplejava" style="font-size:16px;font-weight:600;margin:18px 0 7px;">6. Strategy pattern via Map injection — [StrategyPatternExample.java](../src/main/java/algorithm/concepts/spring/strategy/StrategyPatternExample.java)</h5>
The interview favorite — Spring injects every implementation keyed by bean name, eliminating switch statements:
```java
@Component("card")   static class CardPayment   implements PaymentStrategy { ... }
@Component("paypal") static class PaypalPayment implements PaymentStrategy { ... }

PaymentProcessor(Map<String, PaymentStrategy> strategies) {   // beanName -> bean, filled by Spring
    this.strategies = strategies;
}
// Adding "crypto" = ONE new @Component — zero existing code modified (Open/Closed principle)
```

<h5 id="7-value--profile--valueandprofilesexamplejavasrcmainjavaalgorithmconceptsspringconfigvalueandprofilesexamplejava" style="font-size:16px;font-weight:600;margin:18px 0 7px;">7. @Value &amp; @Profile — [ValueAndProfilesExample.java](../src/main/java/algorithm/concepts/spring/config/ValueAndProfilesExample.java)</h5>
```java
@Value("${app.name}")       private String name;             // resolved from the Environment
@Value("${app.timeout:30}") private int timeoutSeconds;      // ':' introduces the default value

@Bean @Profile("dev")  DataSourceStub devDatabase()  { ... } // bean exists only when profile active
@Bean @Profile("prod") DataSourceStub prodDatabase() { ... }
```
In Spring Boot the `${...}` resolver is registered automatically; the example registers `PropertySourcesPlaceholderConfigurer` by hand so the mechanics stay visible.

---

<h3 id="quarkus" style="font-size:26px;font-weight:700;margin:26px 0 10px;">⚡ Quarkus</h3>

A Kubernetes-native Java framework by Red Hat, marketed as "Supersonic Subatomic Java". It is built on proven standards (Jakarta EE and Eclipse MicroProfile) but re-engineered so that as much work as possible happens at **build time**, producing fast-starting, low-memory applications that compile cleanly to GraalVM native executables.

<h4 id="core-idea-build-time-processing" style="font-size:20px;font-weight:700;margin:22px 0 8px;">⚡ Core Idea: build-time processing</h4>
Spring discovers and wires beans while the application boots, using reflection and classpath scanning. Quarkus moves that work into the build: its extensions process annotations during compilation, pre-compute the wiring, and emit minimal runtime code. The result is faster startup, lower memory, and native-image friendliness (reflection is the enemy of GraalVM).

<h4 id="dependency-injection-jakarta-cdi--arc" style="font-size:20px;font-weight:700;margin:22px 0 8px;">⚡ Dependency Injection (Jakarta CDI / ArC)</h4>
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

<h4 id="web-endpoint-example" style="font-size:20px;font-weight:700;margin:22px 0 8px;">⚡ Web endpoint example</h4>
```java
@Path("/orders")                   // Jakarta REST (formerly JAX-RS)
public class OrderResource {
    @GET
    @Path("/{id}")
    public Order get(@PathParam("id") String id) { ... }
}
```

<h4 id="key-features" style="font-size:20px;font-weight:700;margin:22px 0 8px;">⚡ Key Features</h4>
- **Live coding (dev mode)**: `quarkus dev` hot-reloads code on each request — no manual restart
- **Native compilation**: builds a standalone GraalVM executable that starts in tens of milliseconds and uses a fraction of the memory — ideal for serverless and scale-to-zero
- **Extensions**: curated integrations (Hibernate, Kafka, REST clients) designed for build-time processing and native images
- **MicroProfile**: standardized config, health checks, metrics, and fault tolerance out of the box

<h4 id="when-to-reach-for-it" style="font-size:20px;font-weight:700;margin:22px 0 8px;">⚡ When to reach for it</h4>
Greenfield microservices on Kubernetes, functions that must start instantly, and teams comfortable with the Jakarta/MicroProfile standards rather than the Spring ecosystem.

---

<h3 id="micronaut" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🚀 Micronaut</h3>

A modern Java framework originally created at Object Computing and now stewarded by the Commonhaus Foundation, designed from the start for microservices and serverless. Like Quarkus, it resolves dependency injection and aspect-oriented behavior at **compile time** through annotation processing — but its defining trait is the near-total elimination of runtime reflection, which keeps startup, memory, and native-image builds extremely efficient regardless of how large the application grows.

<h4 id="core-idea-ahead-of-time-reflection-free" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🚀 Core Idea: ahead-of-time, reflection-free</h4>
Spring's dependency injection cost scales with the number of beans, because wiring is computed at startup via reflection. Micronaut generates the injection logic as ordinary code during compilation, so startup time and memory stay roughly **constant** as the codebase grows, and no reflection metadata is needed at runtime.

<h4 id="dependency-injection-jakarta-annotations" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🚀 Dependency Injection (Jakarta annotations)</h4>
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

<h4 id="web-endpoint-example-1" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🚀 Web endpoint example</h4>
```java
@Controller("/orders")
public class OrderController {
    @Get("/{id}")
    public Order get(String id) { ... }
}
```

<h4 id="key-features-1" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🚀 Key Features</h4>
- **Compile-time everything**: dependency injection, aspect-oriented proxies, and configuration are generated by the annotation processor — no runtime reflection
- **Fast and flat**: startup and memory do not degrade as the number of beans increases
- **Reactive and cloud-native**: a non-blocking HTTP stack and built-in support for service discovery, distributed configuration, and cloud providers
- **GraalVM native** support as a first-class target
- **Polyglot**: first-class Java, Kotlin, and Groovy support

<h4 id="micronaut-vs-quarkus" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🚀 Micronaut vs Quarkus</h4>
Both do build-time dependency injection and target fast, lean, native-ready services. Quarkus is anchored in the Jakarta EE / MicroProfile standards and the Red Hat ecosystem; Micronaut defines its own (Spring-like) application programming interface and pushes reflection-free compile-time processing the furthest. Choose by ecosystem fit and team familiarity rather than raw capability.

---

<h3 id="resilience4j" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🛡️ Resilience4j</h3>

Unlike Spring, Quarkus, and Micronaut above — which are full application frameworks — **Resilience4j** is a focused, lightweight library for one concern: making calls to unreliable dependencies fail safely. It targets Java 8's functional interfaces (`Supplier`, `Function`, `Runnable`, `CompletionStage`) and plugs into any of the three frameworks above through a dedicated Spring Boot, Micronaut, or Quarkus starter. It is the direct successor to **Netflix Hystrix**, which popularized the circuit breaker in Java but entered maintenance mode in 2018.

<h4 id="core-idea-functional-decorators-not-a-thread-pool-framework" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🛡️ Core Idea: functional decorators, not a thread-pool framework</h4>
Hystrix's architecture isolated every dependency call inside its own dedicated thread pool — strong isolation, but one thread pool per dependency is expensive in threads and memory, and sits awkwardly with non-blocking, reactive code. Resilience4j takes a different approach: each resilience concern is a small **decorator** that wraps a functional interface and runs, by default, on the *caller's own thread* — no dedicated pool unless you explicitly reach for the Bulkhead or TimeLimiter modules, which do manage their own thread pools when true isolation is required. The result is a library an order of magnitude lighter than Hystrix, composable one decorator at a time, and equally at home in blocking and reactive code.

<h4 id="the-problem-it-solves" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🛡️ The problem it solves</h4>
The resilience *patterns* themselves — circuit breaker, retry with backoff, bulkhead, timeout, rate limiting, fallback — are covered conceptually in [Resilience Patterns](#resilience-patterns-know-the-names-and-the-why); this section is about the concrete library that implements them correctly so you do not have to. Hand-rolling a circuit breaker means getting a state machine, a sliding window of call outcomes, and thread-safe concurrent updates right under load — easy to get subtly wrong. Resilience4j supplies battle-tested implementations of each pattern as an independent module, each exposing the same shape (a `Config`, a `Registry`, and typed events), so the patterns compose predictably instead of being reinvented per service.

<h4 id="architecture--modules-and-composition" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🛡️ Architecture — modules and composition</h4>
- **Independent modules, one per artifact**: `resilience4j-circuitbreaker`, `-retry`, `-bulkhead` (semaphore-based) / `-timelimiter` (thread-pool based, pairs with `CompletableFuture`), `-ratelimiter`, `-cache` — pull in only what a given service needs
- **`Config` → `Registry` → instance**: an immutable `Config` object holds the tuning (thresholds, window size, wait duration); a `Registry` is a factory that creates and caches named instances sharing one `Config` — the same role Spring's `BeanFactory` plays for beans
- **`Decorators` composes several modules around one call**: when a call needs more than one protection, `Decorators.ofSupplier(...)` chains them in a defined, outside-in order (rate limiter → circuit breaker → retry → time limiter → bulkhead is the conventional order) — getting the order wrong changes behavior, e.g. retrying *inside* an open circuit breaker defeats the breaker's purpose. Chaining multiple modules through `Decorators` pulls in the `resilience4j-all` artifact rather than a single module
- **Version note**: Resilience4j 1.x supports Java 8+; **Resilience4j 2.x requires Java 17+** — check the target runtime before picking a major version

<h4 id="design-patterns-it-embodies" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🛡️ Design patterns it embodies</h4>
- **Circuit Breaker pattern**: the library's namesake — a finite-state machine (**Closed** → **Open** → **Half-Open**, detailed in [Resilience Patterns](#resilience-patterns-know-the-names-and-the-why)) backed by a sliding window of recent call outcomes
- **Decorator pattern**: literally how the library composes behavior — `CircuitBreaker.decorateSupplier(...)`, `Retry.decorateSupplier(...)`, and `Decorators.ofSupplier(...)` each wrap one functional interface inside another, layering behavior without subclassing, the same [Decorator pattern](#structural) already covered under Design Patterns — Resilience4j is arguably its clearest real-world application in the Java ecosystem
- **Strategy pattern**: a `Config` is an interchangeable strategy for how a call should react to failure — a payments call can use a tight `CircuitBreakerConfig` while a low-priority background integration uses a lenient one, with the exact same call-site code
- **Observer pattern**: every module exposes an `EventPublisher` (`onStateTransition`, `onError`, `onSuccess`, `onCallNotPermitted`) so metrics, logging, and alerting subscribe to state changes without touching the core call — feeds directly into the [Observability](#observability--the-three-pillars) metrics pillar
- **Factory pattern**: `CircuitBreakerRegistry.of(config)` centralizes creation of named instances, guaranteeing the same name always resolves to the same shared instance rather than a fresh one per call site

<h4 id="code-examples" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🛡️ Code examples</h4>

Framework-agnostic, functional style:
```java
CircuitBreakerConfig cbConfig = CircuitBreakerConfig.custom()
    .failureRateThreshold(50)                          // % of failed calls that trips the breaker
    .slidingWindowSize(20)                              // last N calls considered
    .waitDurationInOpenState(Duration.ofSeconds(30))    // time before probing again
    .permittedNumberOfCallsInHalfOpenState(5)
    .build();
CircuitBreaker breaker = CircuitBreakerRegistry.of(cbConfig).circuitBreaker("inventoryService");

RetryConfig retryConfig = RetryConfig.custom()
    .maxAttempts(3)
    .waitDuration(Duration.ofMillis(500))
    .retryExceptions(IOException.class)                 // never retry non-idempotent failures blindly
    .build();
Retry retry = RetryRegistry.of(retryConfig).retry("inventoryService");

// compose circuit breaker + retry + a fallback around one call
Supplier<Inventory> resilientCall = Decorators.ofSupplier(inventoryClient::fetch)
    .withCircuitBreaker(breaker)
    .withRetry(retry)
    .withFallback(List.of(CallNotPermittedException.class, IOException.class),
                  throwable -> Inventory.empty())        // graceful degradation, not a thrown error
    .decorate();

Inventory result = resilientCall.get();
```

Spring Boot annotation style (`resilience4j-spring-boot3` for Spring Boot 3.x; a separate `resilience4j-spring-boot4` artifact targets Spring Boot 4/Spring Framework 7 — match the module to your Boot major version):
```java
@CircuitBreaker(name = "inventoryService", fallbackMethod = "fallback")
@Retry(name = "inventoryService")
public Inventory getInventory(String sku) {
    return inventoryClient.fetch(sku);
}

private Inventory fallback(String sku, Throwable t) {
    return Inventory.empty();
}
```
```yaml
resilience4j.circuitbreaker:
  instances:
    inventoryService:
      failureRateThreshold: 50
      slidingWindowSize: 20
      waitDurationInOpenState: 30s
resilience4j.retry:
  instances:
    inventoryService:
      maxAttempts: 3
      waitDuration: 500ms
```

<h4 id="similar--pertinent-frameworks" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🛡️ Similar &amp; Pertinent Frameworks</h4>
| Framework | Model | Notes |
|---|---|---|
| **Netflix Hystrix** | Thread-pool isolation — one dedicated pool per dependency | The pattern's popularizer; in maintenance mode since 2018 — Resilience4j is its lightweight, non-blocking-friendly successor |
| **Spring Retry** | Retry only, via `@Retryable` / `@Recover` | Narrower scope than Resilience4j; frequently paired with it for the patterns it does not cover |
| **Failsafe** | Functional decorators, framework-agnostic | Same philosophy as Resilience4j — smaller ecosystem and no official Spring Boot starter |
| **Alibaba Sentinel** | Flow control, circuit breaking, and adaptive system protection, with a live monitoring dashboard | Broader scope than Resilience4j (also does traffic shaping); dominant in the Alibaba Cloud / Chinese cloud-native ecosystem |
| **Istio / Envoy (service mesh)** | Sidecar-level timeout, retry, and circuit breaking — no application code changes | Enforces uniform policy across every service in the mesh, but the fallback cannot be domain-aware the way in-process library code can |

**Choosing between them**: reach for an in-process library (Resilience4j, Failsafe) when the fallback needs business/domain logic (return cached data, a default value, a degraded response shape); reach for service-mesh-level resilience (Istio/Envoy) when the goal is uniform infrastructure policy across many services without touching each one's code, accepting coarser, non-domain-aware control in exchange.

---

<h2 id="-database" style="font-size:33px;font-weight:800;margin:30px 0 12px;">🗄️ Database</h2>

<h3 id="cap-theorem" style="font-size:26px;font-weight:700;margin:26px 0 10px;">⚖️ CAP Theorem</h3>
- **Consistency**: Data is consistent across all the nodes
- **Availability**: Data is available at any time
- **Partition Tolerance**: the system keeps operating even when the network drops or delays an arbitrary number of messages **between nodes** — this is about lost/delayed communication, not about data being dropped or overwritten on a node

*Only two of these requirements can be achieved at a time: choose Consistency + Partition tolerance (CP) or Availability + Partition tolerance (AP), but not all three.*

- **CP systems** (e.g. HBase, ZooKeeper): refuse to return stale data — become unavailable during a partition
- **AP systems** (e.g. Cassandra, DynamoDB): stay available but may return stale data — eventually consistent by default. Treat this as the *default posture*, not an absolute: both support tunable consistency per request (Cassandra's `QUORUM`/`ALL` consistency levels, DynamoDB's strongly-consistent reads), which trades some availability back for consistency on the operations that need it — CAP applies per-operation more precisely than it applies to a whole system
- **CA** is only meaningful on a single node — a real distributed system cannot opt out of partitions, so it must choose C or A *when one occurs*
- The "consistency" in the Consistency-Availability-Partition (CAP) theorem specifically means **linearizability** (the system behaves as if there is a single, up-to-date copy of the data) — which is a different guarantee from the Consistency in Atomicity-Consistency-Isolation-Durability (ACID)

<h4 id="partition-or-else-latency-or-consistency-pacelc" style="font-size:20px;font-weight:700;margin:22px 0 8px;">⚖️ Partition-or-Else, Latency-or-Consistency (PACELC)</h4>
The CAP theorem only describes behaviour *during* a partition. PACELC extends it: **if a Partition occurs, trade Availability against Consistency; Else (normal operation), trade Latency against Consistency.** It makes explicit that even with no failures, stronger consistency costs latency — a trade-off distributed systems pay every day, not just under failure.

<h3 id="sql" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🗃️ SQL</h3>

<h4 id="database-operations" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🗃️ Database Operations</h4>
```sql
CREATE DATABASE name -- creates database
CREATE TABLE name (id int, field1 varchar, field2 varchar) -- creates table
ALTER TABLE name ADD column_name -- adds a new column
ALTER TABLE name DROP column_name -- deletes a column
DROP TABLE name -- deletes a table
DROP DATABASE name -- drops a database
```

<h4 id="query-operations" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🗃️ Query Operations</h4>
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

<h4 id="joins" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🗃️ Joins</h4>
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

<h4 id="advanced-operations" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🗃️ Advanced Operations</h4>
- **UNIONS**: combines queries in the same resultset if the columns match the number and types
- **CREATE VIEW** name AS query: virtual table from query
- **CREATE INDEX** name ON table (fields): creates an index to accelerate search on those fields

<h4 id="aggregation" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🗃️ Aggregation</h4>
- **GROUP BY**: Groups rows so aggregate functions apply per group (COUNT, SUM, AVG, MIN, MAX)
- **WHERE vs HAVING**: WHERE filters rows *before* aggregation; HAVING filters groups *after* aggregation

```sql
SELECT department, COUNT(*) AS headcount, AVG(salary) AS avg_salary
FROM employees
WHERE active = true        -- filters individual rows BEFORE grouping
GROUP BY department
HAVING COUNT(*) > 5;       -- filters whole groups AFTER aggregation
```

<h4 id="window-functions-increasingly-asked" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🗃️ Window Functions (increasingly asked)</h4>
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

<h4 id="common-table-expressions-the-with-clause" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🗃️ Common Table Expressions (the WITH clause)</h4>
A named subquery that improves readability and allows reuse and recursion
```sql
WITH ranked AS (
    SELECT *, DENSE_RANK() OVER (PARTITION BY department ORDER BY salary DESC) AS rk
    FROM employees
)
SELECT * FROM ranked WHERE rk <= 3;
```

<h4 id="relations" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🗃️ Relations</h4>
- **1 TO MANY**: By FK
- **MANY TO MANY**: Should be avoided and modeled as a joining table

<h4 id="normalization-in-plain-words" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🗃️ Normalization (in plain words)</h4>
- **First Normal Form (1NF)**: Atomic values only — no lists or repeating groups inside a column
- **Second Normal Form (2NF)**: 1NF + every non-key column depends on the *whole* primary key (no partial dependency on part of a composite key)
- **Third Normal Form (3NF)**: 2NF + no non-key column depends on another non-key column (no transitive dependency)
- **Deliberate denormalization**: Accepting duplication to avoid joins on read-heavy paths — a conscious trade-off, never an accident

<h4 id="indexes-in-depth" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🗃️ Indexes In Depth</h4>

<h5 id="storage-engine-b-tree-vs-log-structured-merge-tree-lsm-tree" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Storage engine: B-Tree vs Log-Structured Merge-tree (LSM-tree)</h5>
Two families of storage engine, each with a different on-disk index structure:

| Dimension | B-Tree (page-oriented) | Log-Structured Merge-tree (LSM-tree) |
|---|---|---|
| Core mechanism | Fixed-size pages (typically 4 KB), updated in place | Append-only Sorted String Table (SSTable) files, merged by compaction |
| Write path | Write-ahead log, then overwrite the page (≥ 2 disk writes) | Append to an in-memory memtable, flush to an SSTable (sequential write) |
| Reads | Generally faster — one path down the tree, O(log n) | Generally slower — must check the memtable then several SSTables |
| Writes | Slower — random writes and page splits | Faster — sequential appends, higher write throughput |
| Disk space | Fragmentation from partly-empty pages | Compact — compaction reclaims space |
| Used by | All major relational databases (PostgreSQL, MySQL/InnoDB, Oracle) | Cassandra, HBase, RocksDB, LevelDB, Lucene |

Rule of thumb: LSM-trees tend to win on writes, B-trees on reads — but benchmarks are workload-sensitive.

<h5 id="clustered-secondary-and-covering-indexes" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Clustered, secondary, and covering indexes</h5>
- **Clustered index**: the row data lives inside the index, ordered by the key. In MySQL/InnoDB the primary key is always clustered; there is at most one per table
- **Secondary (non-clustered) index**: stores a pointer to the row (in InnoDB, the primary-key value), so reads do a second lookup to fetch the full row
- **Covering index**: includes every column a query needs, so the table is never touched — fast reads at the cost of extra storage and write overhead

<h5 id="when-they-help-and-hurt" style="font-size:16px;font-weight:600;margin:18px 0 7px;">When they help and hurt</h5>
- **Help**: columns in `WHERE`, `JOIN ... ON`, and `ORDER BY`
- **Hurt**: every `INSERT`/`UPDATE`/`DELETE` must maintain each index — real cost on write-heavy tables
- **Composite index column ordering and reading a query plan**: covered in depth just below — the two skills that turn "the query is slow" into a diagnosed, fixed problem

<h5 id="composite-index-column-ordering" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Composite Index Column Ordering</h5>
A composite (multi-column) index is not several independent indexes bundled together — it is one B-tree, sorted first by its leftmost column, then by the second column within each value of the first, then by the third within each value of the second, and so on. That physical ordering is the whole story behind the **leftmost-prefix rule**: an index on `(a, b, c)` can serve a filter on `a` alone, on `a AND b`, or on `a AND b AND c`, because each of those queries can walk straight to the right position in that sorted structure — but it generally cannot efficiently serve a filter on `b` alone or `c` alone, because rows with a given `b` value are scattered across every `a` value, in no particular order relative to each other.

The standard analogy makes this concrete: a phone book sorted by last name, then first name, is exactly a composite index on `(last_name, first_name)`. Finding everyone named "Smith" is fast — they are all adjacent. Finding "Smith, John" is just as fast — narrow to the Smiths, then to the Johns among them. But finding everyone with the first name "John," regardless of last name, means scanning the entire book, because Johns are scattered across every letter of the alphabet.

```
Index on (last_name, first_name)         sorted physically as:

  Adams,  Grace
  Adams,  Paul
  Diaz,   Maria
  Diaz,   Tom
  Smith,  Anna
  Smith,  John        <- "last_name = Smith" and "last_name = Smith AND first_name = John"
  Smith,  Zoe            both land on a contiguous run: fast
  Yang,   Lee

  Query "first_name = John" alone has to check every last-name group: no shortcut
```

For example, an index defined as `CREATE INDEX idx_orders_customer_status ON orders (customer_id, status);` serves `WHERE customer_id = 42` and `WHERE customer_id = 42 AND status = 'SHIPPED'` directly from the index, but `WHERE status = 'SHIPPED'` alone falls back to a full scan unless a separate index exists with `status` as its leftmost column. This is also why the column with the highest selectivity (the one that narrows the result set the most) usually belongs first in the index, and why an index intended to serve both `(a, b)` and `(a)` queries needs no separate single-column index on `a` at all — the composite index already covers that prefix for free.

<h5 id="reading-a-query-execution-plan" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Reading a Query Execution Plan</h5>
`EXPLAIN` (and its stronger sibling `EXPLAIN ANALYZE`) asks the database to show, rather than just run, the plan it chose for a query — the sequence of operations (table scans, index scans, joins, sorts) it settled on, along with the estimated cost and row count for each step. `EXPLAIN` alone shows the planner's *estimate*; `EXPLAIN ANALYZE` actually executes the query and shows *real* elapsed time and row counts next to those estimates, which is what makes it possible to spot a planner working from stale or wrong assumptions, not just a slow query. A minimal PostgreSQL example:

```
EXPLAIN ANALYZE
SELECT * FROM orders WHERE customer_id = 42 AND status = 'SHIPPED';

-- Index Scan using idx_orders_customer_status on orders
--   (cost=0.42..8.53 rows=3 width=120) (actual time=0.03..0.04 rows=3 loops=1)
--   Index Cond: (customer_id = 42 AND status = 'SHIPPED')
```

The single most important thing to look for in any plan is a **sequential (full table) scan on a table that should be small after filtering** — `Seq Scan on orders (cost=0.00..48291.00 rows=1500000 width=120)` reading every row instead of jumping straight to the matching ones. Seeing that on a large table usually means one of three things: no index exists on the filtered column, an index exists but the planner is not using it, or the planner's statistics are stale (fixed with `ANALYZE table_name`, which refreshes the row-count and value-distribution estimates the planner relies on).

**Common reasons an existing index goes unused:**
- **A function wraps the indexed column in the `WHERE` clause.** `WHERE YEAR(created_at) = 2024` cannot use a plain index on `created_at`, because the index is sorted by the raw column value, not by the result of a function applied to it — the equivalent range condition `WHERE created_at >= '2024-01-01' AND created_at < '2025-01-01'` can, because it is a direct comparison on the indexed value.
- **A leading wildcard in `LIKE`.** `LIKE '%foo'` cannot use a standard B-tree index, since the index is sorted by the string's first characters and a leading `%` means those first characters are unknown; `LIKE 'foo%'` can, because it narrows to a contiguous range starting with `foo`.
- **Implicit type coercion.** Comparing an indexed integer column against a string literal (or vice versa) can force the database to cast every row before comparing, defeating the index — matching the literal's type to the column avoids it.
- **Low selectivity.** An index on a boolean or otherwise low-cardinality column (say, a `status` flag where 95% of rows share one value) often goes unused even when present, because the planner correctly judges that random-access index lookups touching most of the table cost more than one sequential scan — the index is not broken, it is just not worth using for that particular filter.

This is index-level optimization — verifying the database chooses the right access path for a single query. A different, application-level class of query-optimization problem, the N+1 problem (issuing one query per parent row instead of one query total), is covered separately under Spring Data JPA below.

<h4 id="database-engine-types--online-transaction-processing-vs-online-analytical-processing" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🗃️ Database Engine Types — Online Transaction Processing vs Online Analytical Processing</h4>
| Dimension | Online Transaction Processing (OLTP) | Online Analytical Processing (OLAP) |
|---|---|---|
| Workload | Many short, low-latency reads and writes (lookups by key) | Few complex queries scanning millions of rows (aggregations) |
| Primary user | End users through an application | Analysts and data scientists |
| Rows touched per query | Few (index lookup) | A large fraction of the dataset (scan) |
| Bottleneck | Disk seek time (random input/output) | Disk bandwidth (sequential input/output) |
| Storage layout | Row-oriented — a row's columns stored together | Column-oriented — a column's values stored together |
| Typical systems | PostgreSQL, MySQL, Oracle, SQL Server | Redshift, Snowflake, BigQuery, Vertica |

- **Row-oriented** storage keeps each row contiguous — fast for whole-record reads, wasteful when analytics need only a few columns from millions of rows
- **Column-oriented** storage keeps each column together — an analytic query reading 3 of 100 columns loads only those 3, compresses well (repeated values per column), and enables vectorized processing; the trade-off is write-unfriendliness (a row insert touches every column file)
- Online Analytical Processing systems are usually fed from Online Transaction Processing systems by an Extract-Transform-Load (ETL) pipeline, isolating production databases from heavy analytical scans

<h5 id="cloud-data-platforms-snowflake--snowpark" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Cloud Data Platforms (Snowflake / Snowpark)</h5>
Snowflake positions itself as a converged warehouse/lake/lakehouse/data-mesh platform (one governed engine instead of separate systems per architecture pattern). Its **Snowpark** layer lets non-SQL code (Python, Java, Scala) run as User-Defined Functions or Stored Procedures inside Snowflake's own compute, next to the data, instead of exporting data to an external processing engine such as Apache Spark — the same "bring compute to the data" principle that also motivates column-oriented OLAP storage above: minimizing data movement reduces both cost and the number of places sensitive data can leak.

<h4 id="database-tuning-techniques" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🗃️ Database Tuning Techniques</h4>
- **Indexing**: CREATE INDEX index_name ON table (column);
- **Views**
- **Partitioning**
- **Caching**
- **Denormalization**, duplication with load balancers
- **Separate write/read master/slave**

<h4 id="concurrency-1" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🧵 Concurrency</h4>
<h5 id="locks" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Locks</h5>
- **Shared lock (read lock)**: many transactions may hold a shared lock on the same data at once (concurrent readers); any transaction wanting to write must wait for all shared locks to release
- **Exclusive lock (write lock)**: while held, no other transaction may read or write the data — the holder has sole access until it commits or aborts
- **Granularity**: most databases lock at the **row** level; a **table** lock blocks all concurrent access to the whole table

<h5 id="two-phase-locking-the-classic-route-to-serializability" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Two-Phase Locking (the classic route to serializability)</h5>
- **Growing phase**: the transaction acquires locks as it reads and writes, releasing none
- **Shrinking phase**: on commit or abort, all locks are released together
- Writers block readers and readers block writers (the opposite of snapshot isolation, below) — this removes all anomalies but raises contention and tail latency

<h4 id="acid-properties" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🗃️ ACID Properties</h4>
**Transaction:** A transaction bundles several database operations — say, debiting one account and crediting another — so that, from any observer's point of view, they happen as a single, indivisible unit. That bundling immediately raises two separate questions a database has to answer, and it helps to keep them apart, because they're solved by two different mechanisms.

The first question is about failure partway through: what happens if the second write in that bundle never happens — the process crashes, the disk fills up, a constraint is violated? **Atomicity:** The answer is that either every write in the transaction lands, or none of them do; there is no state where the debit succeeded but the credit didn't. The word "atomic" undersells what's actually promised — the sharper name for this guarantee is *abortability*, because the real commitment is that the transaction can always be cleanly rolled back on error, discarding every write it had made so far. Notice this says nothing about what happens when two transactions run *at the same time* — that's a different problem, covered by isolation below.

The second question is about surviving *after* the transaction has already reported success: once the database has told the caller "committed," can that promise ever be broken by a crash a moment later? **Durability:** That's the guarantee that a committed write must survive a crash, which in practice means it was written to a non-volatile write-ahead log on disk before the commit was ever acknowledged, or replicated to enough other nodes that losing any single one of them doesn't lose the data. Durability is a guarantee with a floor, not a ceiling: disk failures, replication lag, and gaps in backup coverage all chip away at it in the real world, which is why production systems layer several of these mechanisms together rather than trusting any one of them to be perfect on its own.

Between those two questions sits a third, and it's the one most of the complexity in this section comes from: what happens when several transactions run *concurrently*, each written as if it had the database entirely to itself? Left unmanaged, one transaction's half-finished work becomes visible to another, producing results neither transaction alone would ever have produced. **Isolation:** This is the guarantee that concurrent transactions don't step on each other this way. Its strongest form, *serializability*, guarantees the outcome is identical to some scenario where the transactions ran one after another instead of overlapping — but achieving that fully costs real performance, which is why almost every production database instead offers a *menu* of weaker isolation levels, each trading away some of that safety for speed. What that menu actually looks like, and precisely what each level protects against, is the subject of the next section.

The fourth letter, **Consistency**, is the odd one out: it names the guarantee that the database's own invariants hold — balances reconcile, foreign keys resolve — but those invariants are things the *application* declares, not something the database can independently know to enforce. A database only ever enforces the specific constraints you tell it about (unique keys, foreign keys, check constraints); genuine business-level consistency, like "the sum of debits must always equal the sum of credits," is really the application's own responsibility — atomicity and isolation are simply what make maintaining that responsibility *possible* in the first place, by guaranteeing nothing is ever left half-done or visibly stepped on. This is why consistency is sometimes described as having been folded into the acronym mainly to make it pronounceable: Atomicity, Consistency, Isolation, Durability — ACID.

<h4 id="isolation-levels-and-their-anomalies" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🗃️ Isolation Levels and Their Anomalies</h4>
Since full serializability is expensive, the practical question a database engineer actually faces is narrower: exactly which ways can concurrent transactions interfere with each other, and how much of that interference is a given isolation level willing to prevent? There are five recognized anomalies, and it's worth seeing what each one actually looks like before looking at which levels block which:

- **Dirty read**: one transaction reads data that another transaction has written but not yet committed — data that might still be rolled back, meaning the reader can briefly see a value that officially never existed.
- **Non-repeatable read**: a transaction reads the same row twice within itself and gets two different answers, because a different transaction committed a change to that row in between the two reads.
- **Phantom read**: the same idea as above, but for an entire query instead of one row — re-running an identical query returns a different *set* of rows, because another transaction inserted or deleted rows matching the query's condition while the first transaction was still running.
- **Lost update**: two transactions each read a value, modify it, and write it back — a read-modify-write cycle — and the second write silently overwrites the first, so one of the two updates simply vanishes without either transaction ever seeing an error.
- **Write skew**: the subtlest of the five. Two transactions read the same set of rows, each independently decides an update is safe based on what it read, and each then writes to a *different* row — yet the combined result violates a constraint that neither transaction broke on its own (the textbook case: two on-call doctors both go off-call at the same moment, because each one checked and saw the other was still covering, and neither individual update looked unsafe in isolation).

Every isolation level, at bottom, is a promise about which of those five anomalies it rules out — and the standard levels form a ladder from most permissive to strictest, each rung closing off one more anomaly than the last:

| Isolation level | Dirty read | Non-repeatable read | Phantom read | Lost update | Write skew |
|---|---|---|---|---|---|
| READ UNCOMMITTED | ✗ possible | ✗ possible | ✗ possible | ✗ possible | ✗ possible |
| READ COMMITTED | ✓ prevented | ✗ possible | ✗ possible | ✗ possible | ✗ possible |
| REPEATABLE READ *(SQL-standard definition)* | ✓ prevented | ✓ prevented | ✗ possible | ✓ prevented (most engines) | ✗ possible |
| SNAPSHOT ISOLATION *(what PostgreSQL and MySQL actually name "Repeatable Read")* | ✓ prevented | ✓ prevented | ✓ prevented | ✓ prevented (auto-detected) | ✗ possible |
| SERIALIZABLE | ✓ prevented | ✓ prevented | ✓ prevented | ✓ prevented | ✓ prevented |

That table hides a trap worth knowing before trusting a vendor's naming: the row labeled "Repeatable Read" above is the generic SQL-standard definition, which only promises to prevent non-repeatable reads and explicitly still permits phantom reads. PostgreSQL and MySQL, however, both implement their own `REPEATABLE READ` level as snapshot isolation instead — stricter than the standard technically requires — so on those two engines the real behavior actually matches the *Snapshot Isolation* row above (phantoms prevented too), not the weaker row the name would suggest by the standard's definition. The lesson generalizes beyond this one case: always ask "prevented per the SQL standard, or per this specific engine's actual implementation?" before trusting what an isolation level's name implies.

Snapshot isolation is common enough, and clever enough mechanically, to be worth understanding rather than just trusting the table above. Each transaction reads from a consistent snapshot taken the moment it started, so any commit that happens later is simply invisible to it — there is no way for it to observe a half-finished concurrent write. **Multi-Version Concurrency Control (MVCC):** The engine makes snapshot isolation cheap through this technique: it keeps several committed versions of each row side by side, each tagged with the ID of the transaction that wrote it, so that **readers never block writers and writers never block readers** — a reader just picks the version that was current when its own snapshot began. Old versions are only cleaned up once no in-flight transaction could still need them. Oracle happens to name this exact same level "Serializable" instead of "Repeatable Read," a second, entirely independent vendor-naming inconsistency layered on top of the first one — and despite the name, it still isn't true serializability, because snapshot isolation permits write skew, the anomaly described above. PostgreSQL's *Serializable Snapshot Isolation (SSI)* closes that last gap by adding optimistic conflict detection on top of ordinary snapshot isolation, reaching genuine serializability at a modest performance cost.

<h4 id="optimistic-vs-pessimistic-locking" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🗃️ Optimistic vs Pessimistic Locking</h4>
Even inside a single isolation level, an application still has to decide *how* to handle the moment two transactions actually do want to touch the same row — and there are two fundamentally different postures to take, depending on how often that collision is expected to actually happen. **Pessimistic locking:** This approach assumes conflict is common: the moment a transaction starts working on a row, it takes a lock (`SELECT ... FOR UPDATE`), and every other transaction wanting that same row simply waits its turn. **Optimistic locking:** This approach assumes the opposite, that conflict is rare: no lock is taken at all, every transaction proceeds freely, and interference is only checked for right at the end — typically via a `@Version` column in Java Persistence API that increments on every update, so a transaction's final write fails outright if the version it originally read has since changed underneath it. Which posture wins is really a bet about collision frequency: pessimistic locking pays an upfront cost (waiting) to avoid a problem cheaply when that problem is expected to be common; optimistic locking pays nothing upfront but has to redo the work whenever its bet turns out to be wrong.

<h4 id="deadlocks" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🗃️ Deadlocks</h4>
- **How they happen**: Transaction A locks row 1 then wants row 2; transaction B locks row 2 then wants row 1 — a circular wait
- **How the database reacts**: It detects the cycle and kills one transaction (the victim) so the other can proceed
- **How to prevent them**: Always acquire locks in the same global order; keep transactions short

<h3 id="replication" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🔄 Replication</h3>
Keeping a copy of the same data on several nodes — for fault tolerance, read scalability, and lower latency (replicas closer to users).

<h4 id="topologies" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🔄 Topologies</h4>
| Topology | Where writes go | Trade-offs |
|---|---|---|
| Single-leader (primary-replica) | All writes to the leader, which streams to followers | Simple, strong reads from the leader; the leader is a write bottleneck and a single point of failure |
| Multi-leader (active-active) | Several leaders each accept writes and replicate to each other | Higher write availability, cross-datacenter friendly; **write conflicts** must be resolved (last-write-wins, merge, or app logic) |
| Leaderless (Dynamo-style) | Writes sent to many replicas (write quorum), reads from many (read quorum) | High availability, no failover; eventually consistent unless `w + r > n`; harder to reason about |

<h4 id="synchronous-vs-asynchronous" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🔄 Synchronous vs asynchronous</h4>
- **Synchronous**: the leader waits for a follower to confirm before acknowledging — durable across a leader crash, but a slow follower blocks writes (usually run "semi-synchronous": one sync follower, the rest async)
- **Asynchronous**: the leader acknowledges immediately — highest throughput, but writes not yet replicated are lost if the leader fails

<h4 id="replication-lag-and-its-read-anomalies" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🔄 Replication lag and its read anomalies</h4>
Asynchronous replicas trail the leader by the *replication lag* (milliseconds normally, seconds under load):
- **Read-your-writes**: a user who just wrote reads a lagging replica and misses their own change — fix by reading recently-written data from the leader
- **Monotonic reads**: successive reads hit replicas with different lag, so time appears to go backwards — fix by pinning a user to one replica
- **Consistent prefix**: across shards, writes can be observed out of causal order — fix by routing causally-related writes to the same shard
- **Quorum**: with `n` replicas, `w + r > n` guarantees a read overlaps the latest write (common: `n=3, w=2, r=2`); edge cases still permit staleness

<h3 id="partitioning--sharding" style="font-size:26px;font-weight:700;margin:26px 0 10px;">📦 Partitioning / Sharding</h3>
Splitting a large dataset across nodes so each holds a subset — to scale beyond one machine's storage and throughput.

| Strategy | How a partition is chosen | Pros | Cons |
|---|---|---|---|
| By key range | Sorted keys, each partition owns a contiguous range | Efficient range scans (keys stay sorted) | Hot spots when access concentrates on one range (e.g. today's date) |
| By hash of key | A hash maps each key to a partition | Even distribution, fewer hot spots | Range scans become scatter-gather across all partitions |

- **Consistent hashing (hash-ring)**: maps both nodes and keys onto a ring; a key belongs to the next node clockwise, so adding a node remaps only a fraction of keys — unlike `hash(key) mod N`, which remaps almost everything. Virtual nodes even out the load
- **Hot spots**: one very popular key can still overload a partition — add a random prefix/suffix to spread it, at the cost of scatter-gather reads
- **Secondary indexes**: *local (document-partitioned)* indexes make writes cheap but reads scatter-gather; *global (term-partitioned)* indexes make reads targeted but writes touch several partitions
- **Rebalancing**: moving partitions as nodes are added/removed; use a fixed partition count or dynamic splitting — never the modulo approach, which moves almost all data

<h3 id="orm" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🔗 ORM</h3>

<h4 id="definitions" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🔗 Definitions</h4>
- **ORM**: Object Relational Mapping
- **JPA**: Java Persistence API
- **JDBC**: Java Database Connectivity and provides a set of Java API for accessing the relational databases from Java

<h4 id="jpa-vs-hibernate" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🔗 JPA vs Hibernate</h4>
- **JPA**: Specification
    - EntityManagerFactory
- **Hibernate**: Implementation
    - SessionFactory

<h3 id="spring-data-jpa" style="font-size:26px;font-weight:700;margin:26px 0 10px;">📊 Spring Data JPA</h3>

<h4 id="annotations-1" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🏷️ Annotations</h4>
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

<h4 id="constants" style="font-size:20px;font-weight:700;margin:22px 0 8px;">📊 Constants</h4>
- **GenerationType**(strategy = TABLE,AUTO,IDENTITY,SEQUENCE)
- **FetchType**(fetch = EAGER,LAZY)
- **`jakarta.persistence.CascadeType`** (the Java Persistence API spec, portable across providers): `ALL, PERSIST, MERGE, REMOVE, REFRESH, DETACH`
- **`org.hibernate.annotations.CascadeType`** (Hibernate-native extension, not portable): adds `LOCK, REPLICATE, SAVE_UPDATE` on top of the Java Persistence API set
- **EnumType**(ORDINAL,STRING)

<h4 id="repository" style="font-size:20px;font-weight:700;margin:22px 0 8px;">📊 Repository</h4>
- **CrudRepository<T,ID>**: Basic create/read/update/delete operations
- **JpaRepository<T,ID>**: Adds Java Persistence API specifics (flush, batch deletes, pagination)
- **Derived query methods**: `findByStatusAndCreatedAfter(...)` — Spring generates the query from the method name
- **@Query**: Explicit Java Persistence Query Language (JPQL) or native SQL, when the method name is not expressive enough

<h4 id="the-n1-problem-guaranteed-question" style="font-size:20px;font-weight:700;margin:22px 0 8px;">📊 The N+1 Problem (guaranteed question)</h4>

**The N+1 problem:** loading N parent entities with a query, then triggering one additional query per parent to fetch a lazy association — 1 query becomes 1 + N queries. The mechanism behind it is lazy loading itself: a `@OneToMany` or `@ManyToMany` collection is, by default, not populated when the parent loads — Hibernate leaves a lazy-initializing proxy or persistent collection wrapper in its place. The first time code touches that collection (iterating it, calling `.size()`, anything beyond just holding the reference), Hibernate has to issue a `SELECT` for that one parent's children right then, inside whatever loop happens to be iterating the parents. Loop over N parents and touch the same lazy association on each, and that's N separate round trips to the database on top of the single query that loaded the parents in the first place.

- **Detecting it**: enable SQL logging (`hibernate.show_sql`, or better, a query-count assertion in a test) and count the queries actually executed against what the code visually appears to run — one query in the source rarely matches one query on the wire once lazy associations are involved.

Fixing it has three standard approaches, each with a different trade-off:

- **`JOIN FETCH`** in a Java Persistence Query Language query rewrites the fetch as a single `SELECT ... JOIN` that hydrates the parents and their association in one round trip, overriding the mapping's default `LAZY` fetch type for just that query. It collapses N+1 down to 1 query, at the cost of a wider result set — the parent's columns repeat once per child row — and the restriction that only one collection association can be `JOIN FETCH`ed per query without producing a Cartesian product.
- **`@EntityGraph`** on the repository method reaches the same single-JOIN outcome declaratively, without hand-writing Java Persistence Query Language: it lists which associations to eagerly include for that specific method call, leaving the entity's other mappings on their normal lazy defaults everywhere else.
- **`@BatchSize`** (Hibernate-native, placed on the association) or `hibernate.default_batch_fetch_size` (global) doesn't eliminate the extra queries, it batches them: instead of one `SELECT` per parent, Hibernate groups pending parent identifiers into chunks and issues one `SELECT ... WHERE parent_id IN (?, ?, ?, ...)` per chunk, so N queries become `ceil(N / batch_size)` queries. That's not as good as `JOIN FETCH`'s single query, but it's useful when eager-joining isn't practical — for example several lazy collections on the same entity, where stacking multiple `JOIN FETCH`es would multiply rows instead of collapsing them.

<h4 id="fetching-pitfalls" style="font-size:20px;font-weight:700;margin:22px 0 8px;">📊 Fetching Pitfalls</h4>
- **LazyInitializationException**: A lazy association is touched after the persistence session is closed — typically outside the transaction, in the controller or during JSON serialization. Fix: fetch what you need inside the transaction, and map entities to Data Transfer Objects before leaving the service layer
- Default fetch types: `@ManyToOne` and `@OneToOne` are eager; `@OneToMany` and `@ManyToMany` are lazy — prefer lazy everywhere and fetch explicitly where needed

<h4 id="pagination" style="font-size:20px;font-weight:700;margin:22px 0 8px;">📊 Pagination</h4>
- **Offset-based**: pass a **Pageable** (page number, size, sort) to the repository method
  - **Page** runs an extra `COUNT(*)` query so it knows the total (for "page 3 of 47"); **Slice** fetches `size + 1` rows to know only whether a next page exists (cheaper, ideal for infinite scroll)
  - Degrades with depth — `LIMIT n OFFSET k` makes the database scan and discard `k` rows, so deep pages are slow
- **Keyset (seek) pagination**: filter on the last row seen instead of an offset — `WHERE (created_at, id) < (:lastCreatedAt, :lastId) ORDER BY created_at DESC, id DESC LIMIT 20`
  - O(log n) regardless of page depth, because the index seeks straight to the cursor
  - Needs a composite index on the ordering columns and a unique tie-breaker (a surrogate key); the trade-off is no random "jump to page 500", only forward/backward navigation

<h3 id="hibernate" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🐻 Hibernate</h3>

<h4 id="hibernate-objects" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🐻 Hibernate Objects</h4>
- **Configuration**: Represents a configuration or properties file required by the Hibernate
- **SessionFactory**: Configures Hibernate for the application using the supplied configuration file and allows for a Session object to be instantiated
- **Session**: Used to get a physical connection with a database
- **Transaction**: Represents a unit of work with the database and most of the RDBMS supports transaction functionality
- **Query**: Uses SQL or Hibernate Query Language (HQL) string to retrieve data from the database and create objects
- **Criteria**: Used to create and execute object oriented criteria queries to retrieve objects

<h4 id="configuration-steps" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🐻 Configuration Steps</h4>
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

<h4 id="persistencexml-example" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🐻 persistence.xml Example</h4>
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

<h4 id="mapping-annotations" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🐻 Mapping Annotations</h4>
1. Map class to table
2. Map fields to columns

<h5 id="core-annotations" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Core Annotations</h5>
- **@Entity**: Marks the class as a DB entity
- **@Table**(name="table_name"): Indicates the mapping table
- **@SecondaryTables** and **@SecondaryTables**: defines secondary tables and the logic for populating those tables
- **@Id**: Indicates the field is an id
- **@GeneratedValue**(strategy=GenerationType.IDENTITY): Defines strategy for the autogeneration id
- **@Column**(name="column_name"): Indicates the mapping column
- **@Access**(AccessType.Type): Method to access the persistent state of the entity:
    - AccessType.FIELD: Based Annotations on fields
    - AccessType.PROPERTY: Based Annotations on methods

<h5 id="composite-keys" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Composite Keys</h5>
- **@Embeddable**: Marks a class as being embedded inside another class
- **@EmbeddedId**: Marks a field to be used for an @Embeddable class
- **@Transactional**: marks the methods as transactional and removes the need to call the methods beginTransaction, commit

*Hibernate needs empty constructors*

<h4 id="relationships" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🐻 Relationships</h4>
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

<h4 id="sessionfactory" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🐻 SessionFactory</h4>
Reads the config, creates session objects, create only once in your app

<h4 id="session" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🐻 Session</h4>
A `Session` wraps a JDBC connection and is the day-to-day handle for saving and retrieving objects — obtained from the `SessionFactory`, cheap to open and close, and not thread-safe, so a session belongs to a single thread and a single unit of work.

**Persistence context:** every entity a `Session` loads, saves, or otherwise touches is registered in that session's persistence context — an in-memory identity map keyed by entity type and primary key, alive for as long as the session is open. It's also called the **first-level cache**: asking the same session for the same primary key twice returns the identical Java object the second time without hitting the database, and being in the persistence context is what makes an entity **managed** — Hibernate is actively tracking it and will include it in change detection.

**Dirty checking:** a managed entity never needs an explicit "update" call. When the session first loads an entity, Hibernate takes a snapshot of its field values alongside the entity itself. At flush time — an explicit `session.flush()`, the automatic flush Hibernate runs before a transaction commits, or the automatic flush before certain queries that could otherwise see stale data — Hibernate walks every managed entity in the persistence context and compares its *current* field values against that stored snapshot. Any entity whose current state differs from its snapshot is "dirty," and Hibernate generates an `UPDATE` statement for it; entities matching their snapshot generate no SQL at all. That's why calling a setter on a loaded entity inside a transaction is enough on its own — no `session.update()`, no explicit save — the change is picked up automatically at flush.

```java
Session session = sessionFactory.openSession();
Transaction tx = session.beginTransaction();

Employee employee = session.get(Employee.class, 1L);   // loaded; snapshot taken here
employee.setSalary(90000);                              // no save/update call needed

tx.commit();   // flush runs first: current state vs. snapshot -> salary differs -> UPDATE issued
session.close();
```

The convenience isn't free. The snapshot roughly doubles the memory a loaded entity's field data occupies, since the persistence context holds both the live object and its original values, and the comparison at flush time costs processor time proportional to how many entities the session is tracking — a session that loaded ten thousand rows and modified one still has to dirty-check all ten thousand at flush. Modern Hibernate versions offer bytecode enhancement as a way around that comparison cost: it instruments entity classes at build time so field writes are intercepted and tracked directly, letting Hibernate know exactly which entities changed without a full snapshot comparison.

<h4 id="entity-lifecycle" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🐻 Entity Lifecycle</h4>
- **Detach**: Not associated with a hibernate session
- **Merge**: does **not** reattach the detached instance you pass in — Hibernate copies its state onto a *different*, managed entity (fetched or found in the session) and returns that new reference; the original object you called `merge()` on stays detached, so callers must use the returned value, not the original
- **Persist**: Managed state. Next commit will save to db
- **Remove**: Managed entities will be removed. Next commit will delete them from db
- **Refresh**: sync to db

<h4 id="cascade-types" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🐻 Cascade Types</h4>
Persist, Remove, Refresh, Detach, Merge, All

<h3 id="nosql" style="font-size:26px;font-weight:700;margin:26px 0 10px;">📄 NoSQL</h3>

<h4 id="database-types" style="font-size:20px;font-weight:700;margin:22px 0 8px;">📄 Database Types</h4>
- **Key-Value** (Redis, DynamoDB): A giant hash map — store and fetch a value by its key, nothing more. Fastest model; ideal for caching, sessions, feature flags
- **Wide Column** (Cassandra, HBase): Rows keyed by a partition key, each holding a flexible set of columns; built for massive write throughput across a cluster
- **Graph** (Neo4j): Nodes and edges as first-class citizens; excels when the relationships *are* the query (social networks, recommendations, fraud rings)
- **Document** (MongoDB): Self-contained JSON-like documents; flexible schema, natural fit for aggregates loaded and saved as a whole

*Rule of thumb: choose the model by access pattern, not by hype — key-value for lookups, document for aggregates, graph for relationship traversal, wide-column for write-heavy scale.*

<h4 id="database-mapping" style="font-size:20px;font-weight:700;margin:22px 0 8px;">📄 Database Mapping</h4>
- **DB** → DB
- **TABLES** → COLLECTIONS
- **ROW** → DOCUMENTS
- **COLUMN** → FIELD
- **INDEX** → INDEX
- **JOIN** → EMBEDDING & LINKING

<h4 id="mongodb" style="font-size:20px;font-weight:700;margin:22px 0 8px;">📄 MongoDB</h4>

<h5 id="characteristics" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Characteristics</h5>
- Has C&P from CAP theorem
- Uses documents (JSON - BSON: EXTENDED JSON)

<h5 id="features" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Features</h5>

<h6 id="indexes" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Indexes</h6>
Support efficient execution of queries
**Types**:
- Single Field
- Multikey
- Text
- Geospatial
- Hashed
- Compound

<h6 id="aggregation-pipeline" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Aggregation Pipeline</h6>
A framework for data aggregation modeled on the concept of data processing pipelines

<h6 id="replica-sets" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Replica Sets</h6>
A group of mongodb processes that maintain the same data sets to provide redundancy and high availability

<h6 id="sharding" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Sharding</h6>
A method to distribute data across multiple machines

<h4 id="commands" style="font-size:20px;font-weight:700;margin:22px 0 8px;">📄 Commands</h4>

<h5 id="database-operations-1" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Database Operations</h5>
- **use database**: select database
- **show databases**: shows available databases
- **show collections**: show collections
- **create collection**: db.createCollection("collection")

<h5 id="crud-operations" style="font-size:16px;font-weight:600;margin:18px 0 7px;">CRUD Operations</h5>

<h6 id="create" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">CREATE</h6>
```javascript
db.collection.insertOne({object})
insertMany([array])
```

<h6 id="read" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">READ</h6>
```javascript
db.collection.find({object})/findMany():
// filter: query: {attribute: {$operator: value}}, {"attribute.sub":value} , {$and: [{amount: {$lte: 11}},{"awards.wins":3}]}
// projection: select fields: db.collection.find({attribute: value}, {attr1: 1, attr2: 1, attr3: 0}) (true/1: include, false/0: exclude)
// sort({attr: value}): 1/-1: ASC/DESC
// limit(n): limits results
// readConcern("type"): specifies read Concern
```

<h6 id="update" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">UPDATE</h6>
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

<h6 id="delete" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">DELETE</h6>
```javascript
db.collection.deleteOne(): db.collection.deleteOne({attr:value})
db.collection.deleteMany(): db.collection.deleteMany({attr:value})
db.collection.remove(): db.collection.remove({attr: value}, true) // (true for only one, no param, remove all). db.collection.remove({}) erases all the data from collection
```

<h4 id="query-operators" style="font-size:20px;font-weight:700;margin:22px 0 8px;">📄 Query Operators</h4>
- Comparison
- Logical
- Element
- Evaluation
- Geospatial
- Array
- Bitwise

<h4 id="query-projection" style="font-size:20px;font-weight:700;margin:22px 0 8px;">📄 Query Projection</h4>
Specifies the fields to return in the document that match the query (true/1: include, false/0: exclude)

<h4 id="concern" style="font-size:20px;font-weight:700;margin:22px 0 8px;">📄 Concern</h4>

<h5 id="read-concern" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Read Concern</h5>
Allows to control the consistency and isolation properties of the data read from replica sets and shards
- **Local (the default)**: returns whatever the queried node — primary **or** secondary — has right now, with no guarantee it has replicated to any other node
- **Available**: behaves like `local` on an unsharded collection; on a **sharded** cluster it additionally skips the shard-ownership check, so it can return orphaned documents left behind by an in-progress chunk migration — the trade-off is lower read latency for a small correctness risk unique to sharding
- **Majority**: data acknowledged by a majority of the replica set — not the default, must be requested explicitly
- **Linearizable**: returns data reflecting all successful majority-acknowledged writes that completed before the read started
- **Snapshot**: used inside multi-document transactions, reads from a majority-committed snapshot

<h5 id="write-concern" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Write Concern</h5>
Level of acknowledgement requested from mongodb for write operations. Level of consistency across replicas
- **w:1**: Ack only from primary
- **w:0**: No ack
- **w:n**: Ack primary + (n-1) secondary: (All nodes-1 always including primary)
- **w: majority (the default since MongoDB 5.0, paired with journaling)**
- **wtimeout**: the limit to prevent write operations from blocking indefinitely

<h4 id="dynamodb" style="font-size:20px;font-weight:700;margin:22px 0 8px;">📄 DynamoDB</h4>

- **DynamoDB**: AWS's own summary is "key-value **and document** database" — it natively stores nested JSON-like attributes (maps, lists), not just a flat key-to-value lookup

<h5 id="indexing-strategies" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Indexing Strategies</h5>
Every DynamoDB table needs a way to decide, for any given item, which physical partition it lives on and how items are found within it — that decision is made entirely by the keys covered below, which is why key design is the center of gravity of any DynamoDB table, not an afterthought bolted on once the schema exists.

**Partition key (hash key):** every table must define one, and DynamoDB hashes its value to decide which physical partition (shard) an item is stored on. Choosing it well matters in practice, not just in theory: a well-distributed partition key — one with many distinct values, each used roughly equally often — spreads read and write load evenly across partitions, while a poorly chosen one (a low-cardinality `status` field where 90% of items share one value, for instance) creates a "hot partition": all that traffic lands on the same physical partition and throttles under load, regardless of how many partitions the table has overall.

**Sort key (range key), optional:** when a table defines both a partition key and a sort key, items sharing the same partition key are stored together, physically sorted by the sort key. That ordering is what enables efficient range queries within one partition key — a table keyed on partition key `userId` and sort key `timestamp` can answer "give me this user's orders between date X and Y" as one efficient range scan confined to a single partition, instead of scanning the whole table.

```
Table: Orders          Partition key: userId     Sort key: timestamp

  userId=42 | timestamp=2024-01-03 | orderId=A1   |
  userId=42 | timestamp=2024-02-11 | orderId=A2   |  one partition, sorted by timestamp
  userId=42 | timestamp=2024-03-30 | orderId=A3   |

  userId=77 | timestamp=2024-01-15 | orderId=B1   |  a different partition,
  userId=77 | timestamp=2024-04-02 | orderId=B2   |  sorted independently
```

With the partition key and sort key each defined on their own, the two indexes built from them can be told apart by what they keep fixed and what they change. **Local Secondary Index (LSI):** keeps the base table's partition key but defines a different sort key, letting the same partition's items be queried sorted or filtered a different way — an LSI on the `Orders` table above might resort each user's orders by `totalAmount` instead of `timestamp`. An LSI must be created at table-creation time — it cannot be added later — and it shares the base table's provisioned read/write capacity and its 10 GB-per-partition-key-value size limit. **Global Secondary Index (GSI):** defines a genuinely different partition key (and, optionally, a different sort key) from the base table, effectively maintaining a differently-organized copy of the data that can be queried independently, with its own provisioned throughput separate from the base table's. Unlike an LSI, a GSI can be added or removed after the table already exists. The trade-off to know cold for an interview: a GSI is eventually consistent by default — its index update lags slightly behind the base table write it was derived from — whereas the base table and an LSI both support strongly consistent reads; asking for a strongly consistent read from a GSI is not possible by default, which is a common interview trap.

For example, a base `Orders` table keyed on (`userId`, `orderId`) could add a GSI keyed on (`status`, `createdAt`) to support "show all `PENDING` orders created this week" — a query the base table's keys cannot answer efficiently, since neither `status` nor `createdAt` is the base partition key.

**When to reach for which:** an LSI fits when an alternate sort order on the same partition key is needed and the design can commit to that need at table-creation time; a GSI fits when an entirely different access pattern — a different key altogether — needs to be queried. In practice, given DynamoDB's single-table-design philosophy, where query access patterns are meant to be decided upfront rather than discovered later through ad-hoc queries the way SQL allows, access patterns are rarely fully known and fixed before a table goes live — which is exactly why GSIs, addable after the fact, end up the far more commonly used of the two in real designs.

<h5 id="how-a-dynamo-style-store-actually-works" style="font-size:16px;font-weight:600;margin:18px 0 7px;">How a Dynamo-style store actually works</h5>
The mechanics behind DynamoDB, Cassandra, and Riak — derived from Amazon's original Dynamo paper:
- **Quorum consensus**: with `N` replicas, a write needs `W` acknowledgements and a read needs `R` responses; `W + R > N` guarantees strong consistency (a write set and a read set always overlap on at least one replica) — the common production baseline is `N=3, W=R=2`
- **Vector clocks**: a `[server, version]` pair set per data item, used to distinguish a genuine ancestor relationship (safe to overwrite) from a real concurrent conflict (neither version dominates the other, so the client must reconcile them) — this is *how* an eventually-consistent store detects that two concurrent writes actually collided
- **Gossip protocol**: nodes periodically exchange heartbeat/membership state with random peers rather than an all-to-all broadcast — the standard decentralized failure-detection mechanism at this scale
- **Sloppy quorum + hinted handoff**: writes go to the first `W` *healthy* nodes on the hash ring (skipping temporarily-down ones) rather than blocking; the temporary stand-in later hands the data back to the node that was down
- **Merkle trees**: used for anti-entropy resync after a permanent replica failure — comparing root hashes first, recursing only into mismatched subtrees, so resync cost is proportional to the actual *difference* between replicas, not their total size

---

<h2 id="-security" style="font-size:33px;font-weight:800;margin:30px 0 12px;">🔒 Security</h2>

<h3 id="authentication-vs-authorization" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🪪 Authentication vs Authorization</h3>
- **Authentication**: Verifying WHO you are (identity)
- **Authorization**: Verifying WHAT you can access (permissions)

<h3 id="authentication-methods" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🔑 Authentication Methods</h3>

<h4 id="session-based-authentication" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🔑 Session-Based Authentication</h4>
- **How**: Server creates session, stores session ID in cookie
- **Flow**: Login → Server creates session → Session ID in cookie → Client sends cookie → Server validates
- **Stateful**: Server must remember sessions
- **Pros**: Simple, server control, instant revocation
- **Cons**: Not scalable, CSRF vulnerable, poor multi-server support

<h4 id="token-based-authentication-jwt" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🔑 Token-Based Authentication (JWT)</h4>
- **How**: Server creates signed token, client stores and sends it
- **Flow**: Login → Server creates JWT → Client stores token → Client sends in Authorization header → Server validates signature
- **JWT Structure**: `header.payload.signature`
  - Header: Algorithm and token type
  - Payload: Claims (user data, expiration)
  - Signature: Ensures token integrity
- **Stateless**: Server doesn't store tokens
- **Pros**: Scalable, cross-domain, mobile-friendly
- **Cons**: Can't revoke before expiration, larger size, XSS vulnerable
- **Algorithm confusion / `alg:none` forgery**: a JWT library that trusts the `alg` header from the token itself can be tricked into accepting an unsigned token (`alg: none`) or into verifying an RS256 token's signature as if it were HMAC using the public key as the secret — the fix is to pin the expected algorithm on the verifier side and never derive it from the token

<h4 id="oauth-20" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🔑 OAuth 2.0</h4>
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
  - Password (Resource Owner Password Credentials) — **prohibited** by the IETF OAuth 2.0 Security Best Current Practice (RFC 9700): it exposes the user's raw credentials to the client and cannot support multi-factor authentication or passkeys
- **Tokens**:
  - Access Token: Short-lived, access resources
  - Refresh Token: Long-lived, get new access tokens

<h4 id="single-sign-on-sso" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🔑 Single Sign-On (SSO)</h4>
- **What**: One login for multiple applications
- **Protocols**:
  - SAML 2.0: XML-based, enterprise standard
  - OpenID Connect (OIDC): Built on OAuth 2.0, modern
- **Flow**: Access App A → Redirect to IdP → Login once → IdP sends token → Access App B (no login)
- **Benefits**: Better UX, centralized management, reduced password fatigue

<h4 id="multi-factor-authentication-mfa2fa" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🔑 Multi-Factor Authentication (MFA/2FA)</h4>
- **Factors**:
  - Something you know: Password, PIN
  - Something you have: Phone, hardware token
  - Something you are: Fingerprint, face
- **Types**: SMS codes, TOTP (Authenticator apps), Hardware tokens (YubiKey), Biometrics

<h4 id="api-keys" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🔑 API Keys</h4>
- **What**: Simple token for API access
- **Use case**: Third-party API, service-to-service
- **Pros**: Simple, easy to implement
- **Cons**: No expiration, no user context, hard to rotate

<h4 id="basic-authentication" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🔑 Basic Authentication</h4>
- **What**: Username:password encoded in Base64
- **Header**: `Authorization: Basic dXNlcjpwYXNz`
- **Pros**: Simple, built into HTTP
- **Cons**: Not secure (easily decoded), must use HTTPS

<h4 id="certificate-based-authentication" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🔑 Certificate-Based Authentication</h4>
- **What**: Uses digital certificates (X.509)
- **Use case**: Enterprise, high-security environments

<h3 id="authorization-methods" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🛂 Authorization Methods</h3>

<h4 id="role-based-access-control-rbac" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🛂 Role-Based Access Control (RBAC)</h4>
- **What**: Permissions based on roles
- **Structure**: User → Role → Permissions
- **Example**: Admin, User, Guest

```java
@PreAuthorize("hasRole('ADMIN')")
public void deleteUser() { }
```

<h4 id="attribute-based-access-control-abac" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🛂 Attribute-Based Access Control (ABAC)</h4>
- **What**: Permissions based on attributes
- **Attributes**: User attributes, resource attributes, environment
- **Example**: Allow if user.department == resource.department AND time < 5pm

<h4 id="access-control-lists-acl" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🛂 Access Control Lists (ACL)</h4>
- **What**: Permissions per resource
- **Example**: File permissions (read, write, execute)

<h3 id="security-best-practices" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🛡️ Security Best Practices</h3>

<h4 id="token-storage" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🛡️ Token Storage</h4>
- **Recommended**: an `HttpOnly` cookie — JavaScript cannot read it, so a Cross-Site Scripting bug cannot steal it. It must be paired with `SameSite=Strict` (or `Lax`) plus an anti-Cross-Site-Request-Forgery token, because a cookie is sent automatically by the browser and is therefore exposed to forgery unless something proves the request came from your own page
- **Never**: `localStorage` or `sessionStorage` — current OWASP guidance treats both the same way, not as a fallback tier: both are plain JavaScript-readable storage, so a single Cross-Site Scripting vulnerability anywhere on the page discloses every token stored there, session or access, no exceptions

<h4 id="token-refresh-strategy" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🛡️ Token Refresh Strategy</h4>
- **Access Token**: Short-lived (15 min)
- **Refresh Token**: Long-lived (7 days), `HttpOnly` + `SameSite` cookie, protected by the same anti-Cross-Site-Request-Forgery pairing as any other cookie-carried credential
- **Flow**: Access token expires → Use refresh token → Get new access token

<h4 id="password-security" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🛡️ Password Security</h4>
- **Hash, in the current OWASP-recommended order**: **Argon2id** first choice (tunable memory/time/parallelism cost, resists both GPU cracking and side-channel attacks); **scrypt** if Argon2id is unavailable; **bcrypt** for legacy systems only (fixed 72-byte password limit); **PBKDF2** last resort, reserved for environments requiring FIPS-140 compliance — never plain text, never a fast general-purpose hash like MD5/SHA-256 alone
- **Salt**: Random value added before hashing
- **Pepper**: Secret value added (stored separately)

<h4 id="common-attacks--prevention" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🛡️ Common Attacks &amp; Prevention</h4>
- **CSRF**: Use CSRF tokens, SameSite cookies
- **XSS**: Sanitize input, Content Security Policy
- **SQL Injection**: Use prepared statements
- **Brute Force**: Rate limiting, account lockout
- **OWASP (Open Worldwide Application Security Project) Top 10**: the community-maintained ranking of the most critical web application risks, current as of the **2021** edition — **A01 Broken Access Control**, **A02 Cryptographic Failures**, **A03 Injection** (now folds in Cross-Site Scripting), **A04 Insecure Design**, **A05 Security Misconfiguration**, **A06 Vulnerable and Outdated Components**, **A07 Identification and Authentication Failures**, **A08 Software and Data Integrity Failures**, **A09 Security Logging and Monitoring Failures**, **A10 Server-Side Request Forgery**
- **OWASP API Security Top 10** is a separate, API-specific list (current edition **2023**), because APIs fail in ways the general list does not fully capture: **Broken Object Level Authorization** (an endpoint returns or modifies another user's object because the object identifier alone is trusted) has topped it since the list's inception — the practical checklist item is "does every endpoint re-check ownership, or only authentication?"; **Broken Authentication**; **Broken Object Property Level Authorization** (excess data exposure and mass assignment merged into one category); and **Unrestricted Resource Consumption** (missing rate limits, formerly its own category) round out the most-cited entries
- Practical use: review every new endpoint explicitly against both lists rather than discovering the gap in production — that habit is what "OWASP" is shorthand for in a design review, more than memorizing the exact ranking

<h3 id="spring-security" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🔐 Spring Security</h3>
- Built as a **filter chain**: each request crosses an ordered list of servlet filters (authentication, authorization, Cross-Site Request Forgery protection...) before reaching the controller — a real-world Chain of Responsibility
- Configured by declaring a **`SecurityFilterChain` bean** (lambda style; the old `WebSecurityConfigurerAdapter` is deprecated)
- **Proof Key for Code Exchange (PKCE)**: an extension of the OAuth 2.0 authorization code flow that binds the token exchange to the same client that started it, closing an authorization-code-interception gap. **Mandatory** for public clients (single-page and mobile applications) that cannot keep a client secret; the IETF OAuth 2.0 Security Best Current Practice (RFC 9700) now recommends it for confidential clients too, since it also blocks authorization-code injection regardless of client type
- For service-to-service calls, use the **client credentials** flow

<h3 id="recommended-stack" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🧱 Recommended Stack</h3>

<h4 id="modern-web-app" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🧱 Modern Web App</h4>
- **Authentication**: JWT (access) + Refresh tokens (HttpOnly cookie)
- **Authorization**: RBAC
- **Social login**: OAuth 2.0 / OIDC
- **MFA**: TOTP (Google Authenticator)

<h4 id="enterprise" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🧱 Enterprise</h4>
- **SSO**: SAML 2.0 or OIDC
- **Authorization**: RBAC or ABAC
- **MFA**: Required

<h3 id="legacy-security-concepts" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🗝️ Foundational Network Security Concepts</h3>
- **Transport Layer Security (TLS)**: the encryption protocol securing HTTPS traffic in transit — **TLS 1.2 and 1.3 are the current, required versions**; TLS 1.0 and 1.1 were formally deprecated by the IETF in 2021 (RFC 8996) and must not be enabled
- **Secure Sockets Layer (SSL) Certificates**: the common name still used for what are, since 1999, actually TLS certificates — SSL itself (versions 2 and 3) is obsolete and insecure; the certificate format persisted across the SSL-to-TLS transition, which is why the old name stuck
- **Client Certificate**: Public key authentication
- **On behalf**: Microservice passes user credentials to other services
- **Encryption**: Use standard algorithms (AES, RSA)
- **Firewalls**: Network security
- **Pentesting**: Security testing
- **Automated Security Tests**: Verify API rejects unauthorized callers

---

<h2 id="-system-design" style="font-size:33px;font-weight:800;margin:30px 0 12px;">🏢 System Design</h2>

<h3 id="system-design-principles" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🏗️ System Design Principles</h3>

<h4 id="high-availability" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🏗️ High Availability</h4>
- **Redundancy**: Availability zones, Fallback, Data replication
- **Switching between servers**: DNS, Load balancers, Reverse proxy, API gateway, Service discovery
- **Protecting against client behavior**: Load shedding, Rate limiter, Shuffle sharding, Cell based architecture
- **Protecting against failures**: Timeouts, Circuit breaker, Bulkhead, Retries
- **Detecting failures**: Monitoring, Logging

<h4 id="scalability" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🏗️ Scalability</h4>
- **Vertical scaling (scale up)**: Add power (CPU, memory, disk) to one machine — simple, but capped by hardware limits and a Single Point Of Failure (SPOF) risk
- **Horizontal scaling (scale out)**: Add more servers/replicas — the route to large scale; requires a stateless application tier so any server can serve any request
- **Stateless web tier**: Push session state out of the web servers into a shared store (Redis, a database) so instances are interchangeable and auto-scaling is trivial
- **Elasticity**: Acquire resources automatically as load rises and release them when it falls
- **Message queue for async**: A durable queue decouples producer from consumer in time, absorbs spikes, and lets each side scale independently

<h4 id="scaling-building-blocks" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🏗️ Scaling Building Blocks</h4>

<h5 id="load-balancer" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Load Balancer</h5>
Distributes incoming traffic across a pool of servers. Clients reach the load balancer's public Internet Protocol (IP) address; backend servers talk over private IPs and are never directly reachable. Removes the web tier's single point of failure and lets servers be added or drained transparently.

<h5 id="content-delivery-network-cdn" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Content Delivery Network (CDN)</h5>
A geographically distributed network of edge servers that cache static assets (images, scripts, video) close to users. On a miss the edge fetches from origin, stores it, and serves until the Time-To-Live (TTL) expires. Tune the TTL (too short re-fetches often, too long serves stale), version URLs for invalidation, and fall back to origin if an edge is down.

<h5 id="caching" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Caching</h5>
An in-memory store (Redis, Memcached) for expensive or hot data, cutting database load and latency.
- **Read strategies**: *cache-aside* (the app checks the cache, on a miss reads the database and populates it — most common) and *read-through* (the cache fetches from the database itself)
- **Write strategies**: *write-through* (write cache and database synchronously — consistent, slower) and *write-back* (write cache, flush to the database asynchronously — fast, risks loss on cache failure)

| Eviction policy | Rule |
|---|---|
| Least Recently Used (LRU) | Evict the entry untouched for the longest (the usual default) |
| Least Frequently Used (LFU) | Evict the entry accessed fewest times overall |
| First In First Out (FIFO) | Evict the oldest inserted entry, regardless of access |

Avoid caching rapidly-changing data; replicate the cache across availability zones (a single node is a single point of failure); cache and database are not updated atomically, so brief staleness is possible.

<h5 id="consistent-hashing" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Consistent Hashing</h5>
Modular hashing (`key % N`) remaps almost all keys when a node is added or removed. Consistent hashing places nodes and keys on a hash ring; a key maps to the first node clockwise, so a membership change only redistributes the keys in the affected arc (`k/n` on average). **Virtual nodes** (each server holds many ring positions) even out the distribution. Used by Dynamo, Cassandra, and content delivery networks. (See also [Database → Partitioning](#partitioning--sharding).)

<h5 id="rate-limiting" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Rate Limiting</h5>
Caps how many requests a client may make per window — defending against Denial-of-Service (DoS) abuse, brute force, and runaway clients; counters usually live in Redis.

| Algorithm | Mechanism | Strength | Weakness |
|---|---|---|---|
| **Token bucket** | A bucket of N tokens refilled at a fixed rate; each request spends one | Allows short bursts up to the bucket size | Two parameters to tune (size, refill rate) |
| **Leaking bucket** | A First In First Out queue drained at a fixed rate | Smooths output to a constant rate | A burst fills the queue and starves later arrivals |
| **Fixed window counter** | A per-window counter, rejected over the threshold | Memory-efficient and simple | Edge burst — up to 2× can slip across a boundary |
| **Sliding window log** | Store each request's timestamp, count those in the rolling window | Accurate at every instant | Memory-heavy — even rejected timestamps are kept |
| **Sliding window counter** | Current window count + previous count × overlap fraction | Accurate and memory-efficient | Approximates by assuming an even prior-window spread |

<h5 id="back-of-the-envelope-estimation" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Back-of-the-Envelope Estimation</h5>
A quick capacity check early in a design discussion. State assumptions, use round numbers, label every unit, and derive Queries Per Second (QPS), peak QPS, storage per year, cache size, and server count.
- **Powers**: 1 KB = 10³, 1 MB = 10⁶, 1 GB = 10⁹, 1 TB = 10¹² bytes
- **Latencies**: main memory ~100 ns, solid-state disk read ~100 µs, same-datacenter round-trip ~0.5 ms, cross-region ~150 ms
- **Availability**: 99% ≈ 3.65 days/year downtime, 99.9% ≈ 8.7 hours, 99.99% ≈ 52 minutes

<h4 id="performance" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🏗️ Performance</h4>
- **Latency**: Time to get a response
- **Bandwidth**: Rate of data transfer across a given path
- **Throughput**: Rate at which something is processed

<h4 id="durability" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🏗️ Durability</h4>
- **Backup**: Copy data periodically and store it elsewhere
- **RAID**: Redundant storing of information
- **Replication**: Copying the data to another machines
- **Checksum**: For preventing data corruption

<h4 id="consistency" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🏗️ Consistency</h4>
- **ACID**: Database constraints are not violated when transactions are executed
- **BASE**: NoSQL consistency model
- **Linearizability**: the strongest single-object guarantee — the system behaves as if there were only one copy of the data, and every operation appears to take effect atomically at some point between its start and finish, respecting real-time order across all clients. It requires coordination (hence latency) and cannot be had with full availability during a network partition — the precise, sharper version of "CAP" (the trade-off is specifically about behavior *during* a partition, not a blanket property of the system at all times)
- **No timeout is ever fully safe**: a slow node and a dead node look identical from the caller's side, so any timeout-based failure detector is a trade-off between false positives (declaring a slow-but-alive node dead) and false negatives (waiting too long on a genuinely dead one) — worth remembering when tuning any circuit-breaker or retry timeout
- **CAP Theorem**: Consistency, Availability, Partition Tolerance

<h3 id="hardware" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🖥️ Hardware</h3>

<h4 id="compute-environment" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🖥️ Compute Environment</h4>
- **Physical Server**: Complete control, expensive, hard to manage
- **Virtual Machines**: Cheaper, easier to maintain, hypervisor-based
- **Containers**: Lightweight, portable, container engine-based
- **Serverless**: Cloud provides all resources, event-driven

<h3 id="communication" style="font-size:26px;font-weight:700;margin:26px 0 10px;">📡 Communication</h3>

<h4 id="requestresponse" style="font-size:20px;font-weight:700;margin:22px 0 8px;">📡 Request/Response</h4>
- **Sync**: RequestResponse
- **Async**: Messaging

<h4 id="async-messaging" style="font-size:20px;font-weight:700;margin:22px 0 8px;">📡 Async Messaging</h4>
- **Message Queues**: Only a single consumer gets the message
- **Publisher/Subscriber**: All subscribers get the message

<h4 id="network-protocols" style="font-size:20px;font-weight:700;margin:22px 0 8px;">📡 Network Protocols</h4>
- **TCP**: Reliability over time, connection-oriented
- **UDP**: Time over reliability, connectionless
- **HTTP**: Request/Response protocol

<h3 id="api-design" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🌍 API Design</h3>

<h4 id="api-styles--the-main-options-in-the-industry" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🌍 API Styles — the main options in the industry</h4>
| Style | Contract & transport | Best fit |
|---|---|---|
| **REST** | Resources over HTTP with JSON; no enforced contract (OpenAPI optional) | Public APIs and general-purpose web services |
| **GraphQL** | Typed schema over HTTP with JSON; the client defines the query shape | Multiple frontends needing different views of the same data |
| **gRPC** | Protocol Buffers contract; binary over HTTP/2 | Internal service-to-service calls where latency and throughput matter |
| **WebSockets** | Persistent full-duplex connection; no imposed message format | Real-time bidirectional flows (chat, trading, collaborative editing) |
| **Webhooks** | The provider calls a URL registered by the consumer; HTTP with JSON | Event notifications pushed to third parties (payment confirmed) |
| **SOAP** | XML envelope with a Web Services Description Language (WSDL) contract; over HTTP | Legacy enterprise integrations (banking, insurance) |

*Choosing in one sentence: default to REST for public-facing APIs; GraphQL when many clients need different shapes of the same data; gRPC for internal latency-sensitive calls; WebSockets or Server-Sent Events when the server must push continuously; webhooks to notify external systems of events.*

<h4 id="rest--the-default-style" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🌍 REST — the default style</h4>

<h5 id="rest-architectural-constraints" style="font-size:16px;font-weight:600;margin:18px 0 7px;">REST's Architectural Constraints</h5>
REST is not a protocol or a data format — it is an architectural style Roy Fielding defined in his 2000 doctoral dissertation as a set of constraints for building networked systems that scale, evolve independently, and stay reliable under load. Each constraint exists because it solves a concrete problem the early web faced, and a system only earns the name "REST" to the extent it actually follows them — which is exactly why the maturity model further below exists, as a way to measure that. There are six constraints in total, one of them optional:

- Client-server
- Statelessness
- Cacheability
- Uniform interface
- Layered system
- Code on demand (optional)

**Client-server:** the user-interface concerns live in the client and the data-storage concerns live in the server, with a well-defined interface between them, so each side can evolve independently. A mobile client and a web client can share the same backend without the backend knowing or caring which one is calling it — the server's job is to serve resources, not to know how they get rendered.

**Statelessness:** no client session state is stored on the server between requests — every request must carry all the information needed to understand and process it on its own, for example an auth token sent on every call rather than a server-side session remembered from a previous one. This is why horizontal scaling becomes trivial: any server instance can handle any request, since none of them is holding session-specific state that ties a particular client to a particular instance, and a load balancer can route requests wherever is convenient without sticky sessions. It also makes the server simpler and more reliable, because there is no session state to lose on a crash or to keep synchronized across instances.

**Cacheability:** every response must label itself, explicitly or by convention, as cacheable or not, so clients and intermediaries can reuse a stored response instead of re-requesting the same data. In HTTP this is the `Cache-Control` header (`max-age`, `no-store`, `public`/`private`) declaring how long and where a response may be cached, paired with `ETag` — an opaque version identifier for a resource that lets a client ask "has this changed since I last saw ETag `abc123`?" via `If-None-Match`, getting back a cheap `304 Not Modified` instead of the full payload when it has not. Skipping cache headers does not make an API more correct — it just forces every client to pay full request cost for data that rarely changes.

**Uniform interface:** the constraint that actually defines what "RESTful" means day to day, and itself made of four sub-constraints. *Resource identification in requests* — URIs identify resources (`/orders/42`), not actions. *Manipulation of resources through representations* — a client holding a JSON representation of a resource has everything it needs to modify or delete it, since the representation plus the URI is the whole contract, nothing implicit. *Self-descriptive messages* — each message carries enough information to be processed on its own, most concretely through the `Content-Type` header telling the receiver how to parse the body. *Hypermedia As The Engine Of Application State (HATEOAS)* — responses include links to related actions and resources, so a client discovers what it can do next by reading the response rather than hard-coding URIs up front; this is the sub-constraint almost no production API fully implements, worth being honest about rather than presenting as universal practice.

**Layered system:** a client cannot necessarily tell whether it is talking directly to the origin server or to an intermediary — a load balancer, a cache, an API gateway — sitting in front of it. This is precisely what legitimizes inserting proxies, gateways, and caches transparently between client and server, since the constraint guarantees doing so cannot break a correctly-written client.

**Code on demand (optional):** the one constraint Fielding marked optional — a server may temporarily extend a client's functionality by sending it executable code, the historical example being JavaScript delivered to a browser. It stays optional, and rarely comes up in typical API-design discussions, because it belongs to REST's original web-browser setting rather than to the JSON-over-HTTP style most people mean today when they say "REST API."

<h5 id="fundamentals" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Fundamentals</h5>
- **Richardson Maturity Model**: a practical, incremental measure of how fully an API actually adopts the uniform interface constraint above, not a separate topic from it. Level 1 (resources exist as distinct URIs, but the interface is not yet uniform — a single endpoint may take everything as POST) → Level 2 (proper HTTP verbs and status codes — manipulation-through-representations and self-descriptive messages are now in place) → Level 3 (hypermedia links in responses — the HATEOAS sub-constraint, the last and least-adopted piece of the uniform interface; know what it is, and admit almost nobody fully uses it)
- **Resource naming**: Nouns, plural, hierarchical (`/orders/{id}/items`), never verbs in the Uniform Resource Identifier (URI)
- **OpenAPI (formerly Swagger)**: Machine-readable description of the API — enables generated documentation, generated clients and contract tests; produced contract-first (write the specification, generate the code) or code-first (annotate the code, generate the specification)

<h5 id="http-methods-and-idempotency" style="font-size:16px;font-weight:600;margin:18px 0 7px;">HTTP Methods and Idempotency</h5>
*Idempotent = repeating the call produces the same final state as calling it once*

| Method | Purpose | Idempotent |
|---|---|---|
| GET | Read a resource | Yes |
| PUT | Replace a resource entirely | Yes |
| DELETE | Remove a resource | Yes |
| POST | Create a resource or trigger an action | No |
| PATCH | Modify a resource partially | Usually not |

<h5 id="status-codes-to-use-correctly" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Status Codes To Use Correctly</h5>
- **200 OK** (read or update succeeded), **201 Created** (plus a Location header), **204 No Content** (delete succeeded)
- **400 Bad Request** (malformed request) vs **422 Unprocessable Entity** (well formed but semantically invalid)
- **401 Unauthorized** = NOT authenticated; **403 Forbidden** = authenticated but NOT allowed — classic interview question
- **404 Not Found**, **409 Conflict** (state conflict, duplicate creation)
- **500 Internal Server Error**, **502 Bad Gateway**, **503 Service Unavailable**

<h5 id="design-topics" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Design Topics</h5>
- **Versioning strategies**: in the path (`/v1/orders` — simple and visible) vs in a header (clean paths — less discoverable) vs content negotiation (most "pure" — least used); know the trade-offs
- **Pagination**: offset-based (simple to implement — degrades on deep pages because the database still scans every skipped row) vs cursor-based (opaque pointer to the last seen element — scales regardless of depth)
- **Error responses**: One consistent envelope for the whole API; the standard is RFC 9457 "Problem Details" (2023, obsoleting the original RFC 7807) — fields: type, title, status, detail, instance
- **Idempotency keys**: The client sends a unique key with a POST; the server stores the outcome and replays it on retry instead of executing twice — mandatory thinking for payments
- **Cross-Origin Resource Sharing (CORS)**: Browser mechanism that blocks calls from a different origin unless the server explicitly allows it (allowed origins, methods, headers) — configure it server-side, deliberately

<h4 id="graphql" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🌍 GraphQL</h4>
- **One endpoint, client-shaped responses**: The client sends a typed query describing exactly the fields it wants; the server returns exactly that
- **Solves two REST pains**: **over-fetching** (receiving fields you do not need) and **under-fetching** (needing several round trips to assemble one screen)
- **The schema is the contract**: Strongly typed; three operation types — **queries** (read), **mutations** (write), **subscriptions** (server push)
- **The costs**: HTTP caching is harder (everything is a POST on a single endpoint), and naive resolvers reproduce the N+1 problem — batch the lookups with a DataLoader
- **Versioning**: Usually none — the schema evolves by adding fields and deprecating old ones
- In the Java ecosystem: Spring for GraphQL (built on graphql-java)

<h4 id="grpc" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🌍 gRPC</h4>
- **Contract-first**: Messages and services are defined in Protocol Buffers (`.proto` files); client and server code is generated for each language
- **Binary over HTTP/2**: Compact payloads and multiplexed streams — significantly faster than JSON over HTTP/1.1
- **Four call types**: Unary (one request, one response), server streaming, client streaming, bidirectional streaming
- **The limits**: Not browser-friendly (requires a grpc-web proxy), payloads not human-readable — keep it for internal east-west traffic and expose REST at the edge
- Interview sound bite: "gRPC inside the platform, REST at the boundary"

<h4 id="real-time-push-websockets-and-server-sent-events" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🌍 Real-Time Push: WebSockets and Server-Sent Events</h4>
- **WebSockets**: Persistent connection, full duplex (both directions) — chat, collaborative editing, market data with client interaction
- **Server-Sent Events (SSE)**: Plain HTTP connection, one direction only (server → client), automatic reconnection built in — notifications, live feeds; simpler than WebSockets whenever the client never needs to push

<h4 id="webhooks" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🌍 Webhooks</h4>
- **The call is inverted**: The consumer registers a URL; the provider calls it when the event occurs ("don't call us, we'll call you")
- **Provider obligations**: Retry with backoff (the consumer may be down) and sign the payload (so the consumer can verify authenticity)
- **Consumer obligations**: Respond fast (acknowledge, then process asynchronously) and stay idempotent (deliveries can arrive duplicated)

<h3 id="solid-principles-explain-with-examples-not-definitions" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🧱 SOLID Principles (explain with examples, not definitions)</h3>
- **Single Responsibility**: A class should have only one responsibility — one reason to change
- **Open Closed**: Open for extension, closed for modifications — add a new Strategy bean instead of modifying a switch statement
- **Liskov Substitution**: You should be able to substitute classes when using inheritance — the classic violation is Square extending Rectangle (setting the width silently breaks the height invariant)
  - **Checkable rule list**: a subclass method's parameter types must stay the same or widen (contravariant), its return type must stay the same or narrow (covariant), it must not throw new/broader exception types than the base method declares, it must not strengthen preconditions or weaken postconditions, and it must preserve the superclass's invariants — most "this override technically compiles but breaks the caller" bugs trace back to one of these five
- **Interface Segregation**: Do not implement things that you don't need in your interfaces. Small granularity
- **Dependency Inversion**: Your code should depend on abstractions, not implementations — **not the same thing as Dependency Injection** (DI is one common technique for satisfying this principle, not a synonym for it)

<h3 id="clean-code-habits-verbalize-them-during-a-code-challenge" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🧭 Clean Code Habits (verbalize them during a code challenge)</h3>
- Meaningful names; small functions that do one thing
- No magic numbers — extract named constants
- Early returns instead of nested if blocks
- Fail fast: validate inputs at the top of the method
- Immutability by default

<h3 id="design-principles" style="font-size:26px;font-weight:700;margin:26px 0 10px;">📐 Design Principles</h3>
- **DRY**: Don't repeat yourself (code)
- **Encapsulate what changes**
- **Favor composition over inheritance**
- **Program against an interface, not implementations**

<h3 id="design-patterns-each-with-its-spring-incarnation" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🧩 Design Patterns (each with its Spring incarnation)</h3>

> 💻 Code — Creational: [FactoryTest](../src/main/java/algorithm/concepts/designpatterns/creational/factory/FactoryTest.java) · [SingletonTest](../src/main/java/algorithm/concepts/designpatterns/creational/singleton/SingletonTest.java) · [BuilderTest](../src/main/java/algorithm/concepts/designpatterns/creational/builder/BuilderTest.java)
> 💻 Code — Behavioral: [StrategyDemo](../src/main/java/algorithm/concepts/designpatterns/behavioral/strategy/StrategyDemo.java) · [ObserverDemo](../src/main/java/algorithm/concepts/designpatterns/behavioral/observer/ObserverDemo.java) · [TemplateMethodDemo](../src/main/java/algorithm/concepts/designpatterns/behavioral/templatemethod/TemplateMethodDemo.java) · [ChainOfResponsibilityDemo](../src/main/java/algorithm/concepts/designpatterns/behavioral/chainofresponsibility/ChainOfResponsibilityDemo.java)
> 💻 Code — Structural: [AdapterTest](../src/main/java/algorithm/concepts/designpatterns/structural/adapter/AdapterTest.java) · [DecoratorDemo](../src/main/java/algorithm/concepts/designpatterns/structural/decorator/DecoratorDemo.java) · [ProxyDemo](../src/main/java/algorithm/concepts/designpatterns/structural/proxy/ProxyDemo.java)
> 💻 Code — Spring incarnations: [Strategy via Spring](../src/main/java/algorithm/concepts/spring/strategy/StrategyPatternExample.java) · [Observer via Spring events](../src/main/java/algorithm/concepts/spring/events/ApplicationEventsExample.java) · [Proxy via Spring aspects](../src/main/java/algorithm/concepts/spring/aop/AopProxyExample.java)

Two habits are worth carrying into any design discussion involving the 23-pattern catalog above. First, a pattern should only ever be applied when the flexibility it buys is actually needed — reaching for one to demonstrate cleverness rather than to solve a real, anticipated source of change is worth calling out in code review. Second, when a design starts feeling wrong, it helps to ask specifically "why am I about to need to change this?" — encapsulating what varies, favoring composition over inheritance, and programming to an interface rather than an implementation are the recurring answers, and each maps to one or more of the patterns above. One disambiguation worth having ready: Strategy and State produce near-identical class diagrams despite opposite intent — **Strategy** is a behavior a client injects from *outside* the object, while **State** is a transition the object drives from *within* itself.

<h4 id="creational" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🏭 Creational</h4>
- **Factory Method**: Lets subclasses decide which class to instantiate; delegates creation to a method rather than a constructor — Spring's `BeanFactory` and `@Bean` factory methods
- **Abstract Factory**: Creates families of related objects without naming their concrete classes — a `@Configuration` class declaring a related family of beans
- **Singleton**: One instance with a global access point — Spring beans are singletons *per container*, not static Java Virtual Machine-wide singletons; prefer the Spring-managed form
- **Builder**: Separates construction of a complex object from its representation; avoids the telescoping-constructor problem — Lombok `@Builder`, `UriComponentsBuilder`, `MockMvcRequestBuilders`
- **Prototype**: Creates objects by cloning an existing instance rather than building from scratch — Java's `Cloneable`/copy constructors; useful when construction is expensive

<h4 id="behavioral" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🎭 Behavioral</h4>
- **Strategy**: Encapsulates interchangeable algorithms behind a common interface — in Spring, inject a `Map<String, PaymentStrategy>` and pick by key; eliminates switch statements. **The most useful pattern to demonstrate in a code challenge**
- **Template Method**: A base class fixes the skeleton of an algorithm and subclasses fill in steps — `JdbcTemplate` and `RestTemplate` (the naming is literal)
- **Observer**: A one-to-many dependency where dependents are notified automatically of state changes — Spring `ApplicationEvent` and `@EventListener`; the foundation of event-driven thinking
- **Chain of Responsibility**: A request crosses a chain of handlers, each deciding to process and/or pass it along — servlet filters, the Spring Security filter chain
- **Command**: Encapsulates a request as an object so it can be queued, logged, or undone — Spring's `@Async` tasks and `TaskExecutor`; editor undo/redo stacks
- **State**: An object changes behavior as its internal state changes, as if changing class — model an order/workflow lifecycle as explicit state objects instead of nested if/else; Spring State Machine
- **Iterator**: Sequential access to a collection without exposing its internals — Java's `Iterable`/`Iterator`; Spring Data's `Page`/`Slice`
- **Mediator**: Centralizes how a set of objects interact, cutting direct dependencies — Spring's `ApplicationEventPublisher`
- **Memento**: Captures and restores an object's state without breaking encapsulation — undo history, checkpointing
- **Visitor**: Adds operations over an object structure without modifying the element classes — `JsonSerializer`/`JsonDeserializer` visiting object graphs

<h4 id="structural" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🏗️ Structural</h4>
- **Adapter**: Converts one interface into another that clients expect — wrap third-party clients or legacy data access behind your own interfaces; Spring's `HandlerAdapter` bridges requests to controller methods
- **Proxy**: A surrogate that controls access to another object — exactly how `@Transactional` and Spring Aspect-Oriented Programming (AOP) work (Java Development Kit dynamic proxy for interfaces, CGLIB subclassing for concrete classes); also Hibernate lazy-loading proxies
- **Decorator**: Adds responsibilities by wrapping, without subclassing — the Java input/output streams (`new BufferedInputStream(new FileInputStream(...))`); `HttpServletRequestWrapper`
- **Facade**: A simplified unified interface over a complex subsystem — a `PaymentService` orchestrating fraud-check, charge, and receipt behind one call; `RestTemplate`/`WebClient` over HTTP plumbing
- **Composite**: Treats individual objects and trees of objects uniformly (part-whole hierarchies) — composite discount rules; Spring Security's composite authorization manager
- **Bridge**: Decouples an abstraction from its implementation so each varies independently — separate a notification channel (email vs SMS) from its rendering (HTML vs plain text) without a subclass explosion
- **Flyweight**: Shares many fine-grained objects by splitting intrinsic (shared) from extrinsic (per-use) state — the `String` intern pool, the `Integer.valueOf()` small-integer cache

<h4 id="architectural-patterns" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🏛️ Architectural Patterns</h4>
- **Repository / Service Layer / Data Transfer Object (DTO)**: The entity is NOT the API contract — map entities to Data Transfer Objects at the service boundary, with a dedicated mapper
- **Hexagonal Architecture (Ports & Adapters)**: The business domain at the center, isolated from infrastructure behind interfaces (ports) implemented by adapters — high senior signal
- **Dependency Inversion in practice**: Depend on interfaces at module boundaries, wire the implementations at the edges

<h3 id="distributed-design-patterns" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🕸️ Distributed Design Patterns</h3>

Patterns for systems split across processes and networks. The monolith-versus-microservices framing, resilience patterns (circuit breaker, bulkhead, retry), and data-consistency patterns (saga, outbox, CQRS) below are all distributed design patterns; **Messaging** — and Kafka in particular — is the transport that makes the event-driven ones work.

<h4 id="monolith-vs-microservices--the-honest-trade-off" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🕸️ Monolith vs Microservices — the honest trade-off</h4>
- **What microservices give**: Independent deployment, fault isolation, technology freedom per service, team autonomy
- **What microservices cost**: Distributed complexity, network latency, eventual consistency, heavy operational overhead
- **When NOT to use microservices** (saying this earns senior points): Small team, unclear domain boundaries, early-stage product — start with a well-modularized monolith and split once the boundaries stabilize

<h4 id="service-oriented-architecture-soa--the-historical-predecessor" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🕸️ Service-Oriented Architecture (SOA) — the historical predecessor</h4>
The evolutionary step between the two above: independently deployable services, like microservices, but built around a shared **Enterprise Service Bus (ESB)** that centralizes routing, message transformation, and protocol translation between them, under **centralized governance** of shared contracts.
- **Where it differs from microservices**: SOA optimizes for *reusing* services across the whole organization through the bus; microservices optimize for *independent deployability* of each service, even at the cost of some duplication
- **Why it fell out of favor**: the ESB becomes a shared bottleneck and a single point of failure — the exact centralization microservices were designed to avoid — and its heavyweight protocols (SOAP, WS-* standards) added overhead that lighter REST/JSON and event-driven communication later made unnecessary

<h4 id="how-to-split-services" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🕸️ How to Split Services</h4>
- **Bounded contexts** (from Domain Driven Design): Split by business capability (orders, payments, inventory), never by technical layer
- **Database per service**: Each service owns its data; a shared database silently re-couples everything you tried to decouple

<h4 id="communication-patterns" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🕸️ Communication Patterns</h4>
- **Synchronous**: REST for general use; gRPC (Remote Procedure Calls over HTTP/2 with Protocol Buffers) when low latency and high throughput matter
- **Asynchronous**: Events through Kafka — decouples services in time and in availability
- **Rule of thumb**: Queries → synchronous; state-change notifications → asynchronous events
- **API Gateway**: Single entry point handling routing, authentication and rate limiting (Spring Cloud Gateway)
- **Service discovery**: A directory of service instances, with client-side or server-side load balancing; in Kubernetes, native Domain Name System (DNS) discovery makes a Eureka-style registry unnecessary

<h4 id="messaging" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🕸️ Messaging</h4>

Messaging is the asynchronous backbone of distributed systems: instead of one service calling another and waiting, the producer hands a message to a **broker** and moves on, and the consumer processes it whenever it is ready. This decouples services in **time** (the consumer can be down when the message is sent), in **availability** (a slow consumer cannot slow the producer), and in **load** (the broker absorbs spikes).

<h5 id="two-delivery-models" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Two delivery models</h5>
- **Message Queue (point-to-point)**: each message is delivered to exactly **one** consumer among those competing on the queue — used to distribute work
- **Publish/Subscribe (topic)**: each message is delivered to **every** subscriber — used to broadcast events

<h5 id="choosing-a-broker" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Choosing a broker</h5>
- **Apache Kafka**: a distributed, replayable commit log — enormous throughput, event streaming, and the ability to re-read history (covered in depth below)
- **RabbitMQ / ActiveMQ**: traditional smart brokers with flexible routing and per-message acknowledgement — simpler when you need work queues without replay
- **Cloud-managed**: AWS Simple Queue Service / Simple Notification Service, Azure Service Bus, Google Pub/Sub — the same models without operating the broker yourself

<h5 id="why-messaging-belongs-to-distributed-design-patterns" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Why messaging belongs to distributed design patterns</h5>
Asynchronous messaging is what makes patterns like **Saga** (choreography through events), **Outbox** (reliable event publishing), and **event-driven architecture** possible. The patterns above describe *what* to coordinate; messaging is *how* the coordination travels.

<h5 id="apache-kafka" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Kafka</h5>

**Apache Kafka:** a distributed, durable, append-only log: producers write records to it, those records are kept on disk rather than discarded once delivered, and any number of independent consumers can read through them — including re-reading records written long ago. That single design choice, replayability, is what actually distinguishes Kafka from the two delivery models introduced above: a traditional message queue or publish/subscribe broker deletes a message once it's been handled, treating "delivered" as the end of that message's life, while Kafka treats a topic more like a durable, growing history that any consumer can walk through at its own pace, as many times as it needs to. It solves the problem of a single server not being able to durably absorb or serve the message volume a large system produces, by spreading that work across a cluster of cooperating servers: a topic is split into partitions for parallelism, each partition replicated across several brokers for fault tolerance, with one broker in the cluster acting as controller to coordinate which broker leads which partition. The pieces this architecture is built from — broker, topic, partition, offset, consumer group, replication — are each worth defining precisely on their own below, since the rest of this section builds directly on them.

<h6 id="architecture-be-able-to-draw-it" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Architecture (be able to draw it)</h6>
Kafka's whole design starts from one requirement: a single server can't durably absorb and serve the message volume a large system produces, so the work has to be spread across a group of servers.

**Broker:** one Kafka server, cooperating with the others to store and serve a share of the cluster's data.

**Cluster:** the full set of brokers running together — however many brokers happen to be running is the cluster. What a cluster actually stores is organized into topics.

**Topic:** a named stream of messages, the equivalent of a named channel one service writes to and others read from — the unit a producer or consumer actually addresses by name. A single topic can easily need more throughput than one broker's disk and network can provide, so Kafka splits every topic into partitions.

**Partition:** a topic's own append-only, strictly ordered log. A partition, not the topic as a whole, is the actual unit Kafka parallelizes across brokers and consumers, spreading a topic's partitions across several brokers — which is why a topic's total capacity scales with how many partitions it has, not with the topic itself. Because a partition is just a log that messages are appended to, a reader needs some way to remember exactly where it left off.

**Offset:** the position of the next message a given reader will consume within one partition. Kafka deliberately puts the *consumer* in charge of tracking its own offset, rather than having the broker track it for every reader — that choice keeps the broker simple and lets many independent readers progress through the same partition at their own pace, with no effect on each other. Reading a high-volume partition with a single consumer would just recreate the original bottleneck one level down, so Kafka lets several consumers share the work.

**Consumer group:** a named set of consumers cooperating to read one topic. Within one group, every partition is assigned to exactly one consumer at a time, so the group's total read throughput scales with how many consumers — up to the partition count — are working in parallel; adding more consumers than partitions just leaves the extras idle, since there's nothing left to hand them. None of this protects against the most basic failure mode, though: what happens when the broker holding a partition simply dies?

**Replication:** keeping several copies of each partition spread across different brokers, so a single broker's death doesn't lose data. Every partition has one **leader** replica, which alone serves all of that partition's reads and writes, plus zero or more **follower** replicas that continuously copy the leader's log. Followers that have genuinely kept up are called the **In-Sync Replicas (ISR)** — the leader always counts as a member of its own ISR, and only ISR members are ever eligible to be promoted to leader if the current one fails. A write isn't considered durably committed until every current ISR member has it, which is exactly what makes the size and health of the ISR the thing that actually determines how much data a broker failure can lose. Which broker *is* the leader for a given partition, and how that gets decided the moment a broker fails, is itself managed by a separate piece of the cluster called the controller — covered on its own below.

<h6 id="storage-and-throughput-fundamentals" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Storage and Throughput Fundamentals</h6>
Everything above explains what a partition *is* logically — an ordered log — but the reason Kafka can sustain such enormous message volume comes down to how that log is actually written to disk. A partition is, physically, a plain append-only sequence of segment files, and Kafka never writes one message to disk at a time.

**Record batch:** a group of a producer's outgoing records for one partition, sent together over the network rather than one message at a time. Combining sequential disk appends (no random seeks the way an update-in-place workload would need) with this batching (fewer, larger network round-trips and disk writes instead of many small ones) is the entire mechanical reason Kafka sustains throughput a broker persisting and acknowledging one message at a time never could. The batching decision is tunable from the producer side, and it's worth treating as a genuine trade-off rather than a fixed default: `batch.size` caps how large one batch is allowed to grow (16KB by default), while `linger.ms` (0 by default) adds a small artificial delay before a not-yet-full batch gets sent anyway — trading a little added latency for materially better throughput once traffic is heavy enough to fill batches quickly. Raising both together is the standard first lever when tuning a producer specifically for throughput over latency. There's a second, less obvious piece to the throughput story, and it lives below Kafka entirely, in how the operating system handles the write.

**Page cache:** the operating system's own in-memory cache of recently accessed disk data. A produced record does land on the broker's filesystem, but that write goes first into the page cache — Kafka does not `fsync` to physical disk per message, leaving the OS to flush on its own schedule (Kafka does expose `log.flush.interval.messages`/`.ms` to control this directly, but it's rarely tuned in practice, because replication across brokers, not a single disk's fsync, is what production Kafka actually relies on for durability). The payoff shows up on the read side: a consumer asking for recent data is usually served straight out of page cache rather than disk.

**Zero-copy transfer:** Kafka's use of the `sendfile` system call to move bytes directly from page cache to the network socket, skipping the extra copy through the broker's own process memory that a naive implementation would need. This is *why* Kafka's consumer throughput barely degrades even when many consumers read the same recent data concurrently — they're all just hitting the same cached memory, not competing for disk I/O.

**Implementation example** — creating a topic and inspecting the architecture concepts above directly:
```bash
kafka-topics.sh --bootstrap-server localhost:9092 --create \
  --topic orders --partitions 6 --replication-factor 3 \
  --config min.insync.replicas=2

kafka-topics.sh --bootstrap-server localhost:9092 --describe --topic orders
# Topic: orders  PartitionCount: 6  ReplicationFactor: 3
# Partition: 0  Leader: 1  Replicas: 1,2,3  Isr: 1,2,3
# ...
```
Each `Partition` line above is exactly the **Broker/Topic/Partition/Replication** vocabulary made concrete: `Leader: 1` is the broker currently serving partition 0's reads/writes, `Isr: 1,2,3` is its current In-Sync Replica set.

<h6 id="partitions-and-consumer-groups-in-depth" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Partitions and Consumer Groups in Depth</h6>
Two of the concepts introduced above — partitions and consumer groups — carry more operational weight than their one-line definitions suggest. Start with partition count, since it's a decision that has to be made deliberately upfront rather than tuned casually later: a partition is the true unit of both parallelism and ordering, so a topic's total throughput ceiling is roughly (partition count) × (single-partition throughput) — under-partitioning is the single most common Kafka scaling mistake. The catch is that partition count can only be *increased* later, never decreased, and increasing it reshuffles which partition each key maps to, breaking the "same key always lands on the same partition" guarantee for every key that already existed. That guarantee itself comes from how a producer decides where to send a keyed message in the first place: the default partitioner hashes the key to a specific partition, so every message sharing a key lands in the same partition, in send order, every time. With no key at all, the default behavior (Kafka 2.4's "sticky" partitioner) instead batches a run of keyless messages onto one partition at a time before rotating to the next, rather than strict round-robin per message — trading slightly less even distribution for materially better batching efficiency.

**Custom partitioner:** an application-supplied override of Kafka's default key-hash/sticky partitioning logic, useful when, say, one alert level needs its own dedicated partition so a downstream consumer can prioritize it over the rest.

Consumer groups are Kafka's answer to the load-balancing half of the same problem, and they work in a deliberately coarser way than a traditional task queue: within one group, each partition is owned by exactly one consumer at a time, rather than balancing individual messages the way a queue would. That coarseness is the trade Kafka makes for dramatically higher throughput and cheap offset bookkeeping — a consumer only ever needs to remember "everything up to offset N is done," never acknowledge each message individually the way a queue-based consumer would.

**GroupCoordinator:** the one specific broker that tracks membership and offset commits for a given consumer group. Exactly how it divides partitions among the group's members is itself configurable via `partition.assignment.strategy`: `Range` (the default, which can unevenly stack extra partitions onto the first-listed consumers when one consumer subscribes to many topics), `RoundRobin` (evens assignment out across every subscribed topic), or `Sticky`/`CooperativeSticky` (minimizes how many partitions actually move during a rebalance — worth understanding in full once rebalancing itself has been introduced, further down).

One consequence of this design is worth calling out on its own: multiple independent consumer groups can read the very same topic without interfering with each other at all, because each group keeps its own entirely separate copy of offset-tracking state — which is how one topic can simultaneously feed, say, a real-time dashboard that's always caught up and a slower batch-analytics job that's hours behind, with neither ever affecting the other.

<h6 id="replication-factor-and-in-sync-replicas" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Replication Factor and In-Sync Replicas (ISR) in Depth</h6>
The architecture section above established that a write only counts as durably committed once every current In-Sync Replica has it — which means the practical durability of any given topic comes down to two numbers working together, not one.

**Replication factor:** commonly 3 in production, this sets how many total copies of each partition exist — the leader plus its followers — and directly determines how many broker failures a topic can survive without losing data: replication factor 3 tolerates exactly 2 broker failures before that partition becomes unavailable. Replication factor alone only describes the topic's configuration, though, not what's actually acknowledged at write time.

**`min.insync.replicas`:** commonly 2, alongside a replication factor of 3, this is the minimum number of in-sync replicas that must acknowledge a write before a producer using `acks=all` considers it successful. Without this setting, `acks=all` only requires whatever the *current* ISR happens to be to acknowledge — and if that set has shrunk to just the leader during a partial outage, the "acks=all" guarantee silently weakens to no better than a single node's durability. Combining `acks=all` with `min.insync.replicas=2` on a replication-factor-3 topic is the standard production baseline for "an acknowledged write cannot be lost": losing one broker still leaves two in-sync replicas satisfying the minimum, so writes keep flowing; losing two brokers correctly makes the partition unavailable for writes rather than silently accepting them with no real durability behind them.

This also explains why the ISR set needs active management rather than existing as a fixed snapshot of replication factor: a follower that's fallen behind on replication is dropped out of the ISR until it catches back up, which is precisely why `min.insync.replicas` matters in the first place — without it, a shrinking ISR would silently reduce the effective durability guarantee even while the topic's nominal replication factor stays unchanged. Kafka does **not** self-heal a replica count back up to the configured factor automatically the way, say, HDFS re-replicates a corrupted block — restoring a lost replica is a deliberate operational reassignment step, not something the cluster handles on its own. Two further knobs sit on top of this same trade-off between durability and availability: `unclean.leader.election.enable` (default `false`, overridable per topic) lets the controller elect a leader from *outside* the ISR when no in-sync replica survives a failure, at the cost of whatever data those out-of-sync followers never received — a deliberate choice of availability over durability when the alternative is no leader at all. And on the read side, `client.rack` on the consumer paired with `replica.selector.class=RackAwareReplicaSelector` on the broker (the default is leader-only reads) lets a consumer read from whichever in-sync replica is geographically nearest instead of always the leader, cutting cross-datacenter network cost at the price of possibly slightly stale reads if that replica happens to be lagging.

<h6 id="controller-election-kraft-vs-zookeeper" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Controller Election and Cluster Metadata: KRaft vs ZooKeeper</h6>
All of the leader election and ISR management described above has to be decided by *someone*.

**Controller:** a single broker in the cluster designated to own cluster-wide metadata — electing partition leaders, creating and deleting topics, reassigning replicas. This has to be centralized in one place rather than left to each broker's own judgment for a straightforward reason: without one coordinating authority, two brokers could each independently believe they're entitled to elect a leader for the same partition, producing a split-brain cluster where two different brokers think they're in charge of the same data. How that one controller actually gets chosen has changed completely over Kafka's history, and the old mechanism's specific weakness is exactly what motivated the new one.

The legacy mechanism, used before Kafka 4.0, delegated coordination to ZooKeeper: brokers raced to create an ephemeral znode at a known path, the first to succeed became controller, and every other broker watched that znode to be notified the instant it disappeared — from a crash, a network partition, or even a garbage-collection pause long enough to miss ZooKeeper's own heartbeats. Every new election bumped a **controller epoch** number, so brokers could safely ignore stale commands arriving from a "zombie" controller resuming activity after a pause it never realized happened. The real weakness showed up on every failover, though: the newly elected controller had to reload the *entire* replica state map from ZooKeeper before it could manage anything at all, and that reload measurably slowed down as a cluster's partition count grew — a well-documented scaling bottleneck that got worse exactly as clusters got bigger.

**KRaft:** Kafka Raft metadata mode, the only mode Kafka has supported since version 4.0, replacing ZooKeeper entirely to fix precisely that bottleneck. Instead of an external coordination service, a small quorum of dedicated controller nodes stores all cluster metadata — topics, partitions, ISRs, configuration, everything ZooKeeper used to hold — as a Kafka-style replicated log of metadata events, and that quorum elects its own leader (the **active controller**) using the Raft consensus algorithm, with no external system involved at all. The reload problem disappears because the relationship between brokers and the controller is inverted: brokers **fetch** metadata updates from the active controller rather than having them pushed, and persist that metadata locally, so a broker restart never needs a full remote reload — and because every controller in the quorum already tracks the latest state as a hot standby, failing over to a new active controller is fast rather than requiring a rebuild from scratch. The operational payoff goes beyond raw speed: a production Kafka cluster no longer needs to separately deploy, secure, and operate a ZooKeeper ensemble at all, a genuine reduction in how much distributed-systems surface area the whole deployment carries — and that reduction, not just internal performance, is what actually motivated the migration. Any Kafka deployment encountered today should be assumed to be running KRaft unless it's explicitly identified as a legacy, pre-migration cluster — ZooKeeper mode isn't merely deprecated at this point, it has been removed entirely.

<h6 id="the-ordering-guarantee" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">The Ordering Guarantee</h6>
A natural question after all of this is: given that a topic is split across several independently operating partitions, in what order do consumers actually see messages? The honest answer is narrower than it's often assumed to be — order is guaranteed only *within* a single partition, never across a topic as a whole; two messages sitting in different partitions have no defined relative order at all. This is exactly why the message **key**, already introduced above as the thing that decides which partition a message lands in, doubles as Kafka's entire ordering mechanism: the same key always hashes to the same partition, so every message sharing a key is guaranteed to arrive in the order it was sent — all the events belonging to one specific order, or one specific account, for instance — while messages under different keys carry no ordering promise relative to each other at all.

<h6 id="delivery-semantics-guaranteed-question" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Delivery Semantics (guaranteed question)</h6>
Ordering only answers "in what sequence do messages arrive," not "how many times might a consumer actually process the same one." That second question turns out to hinge entirely on *when* a consumer commits its offset relative to when it actually finishes processing a message, and there are three distinct postures a system can take:

| Semantic | How it is obtained | Trade-off |
|---|---|---|
| At-most-once | Commit offsets *before* processing | Messages can be lost, none duplicated |
| At-least-once | Commit offsets *after* processing (the default reality) | Messages can be duplicated, none lost |
| Exactly-once | Idempotent producer + Kafka transactions (mechanics below) | Strongest guarantee, costs throughput and complexity |

Committing before processing (at-most-once) risks losing a message outright if the consumer crashes mid-processing, since the offset has already advanced past a message that was never actually handled. Committing after processing (at-least-once, and the default behavior in practice) avoids that loss but opens the opposite risk: a crash *after* processing but *before* the commit lands means the same message gets redelivered and processed a second time. Exactly-once closes both gaps at once, but — as the mechanics further down make clear — it isn't free, and most systems don't actually need it: the practical, far cheaper answer to duplicates is designing **idempotent consumers** in the first place — deduplicating by a business key, and upserting instead of blindly inserting — which makes at-least-once delivery behave exactly like exactly-once from the consumer's own point of view, without ever paying for transactions.

<h6 id="producer-acknowledgements-the-acks-setting" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Producer Acknowledgements (the acks setting)</h6>
Delivery semantics describe what happens on the consumer side once a message has landed; the `acks` setting controls something earlier and just as consequential — how confident the producer needs to be that a message truly landed before it considers the send successful — and that confidence level is itself a direct trade against latency. `acks=0` is fire-and-forget: the producer doesn't wait for any confirmation at all, the fastest option and the one where messages can silently vanish with no error ever raised. `acks=1` waits for the partition leader alone to confirm the write, a middle ground still vulnerable to loss if the leader dies before its followers manage to replicate the message. `acks=all` (the client default since Kafka 3.0, KIP-679) waits for every current In-Sync Replica to confirm, guaranteeing no loss as long as at least one ISR member survives — and it's paired by default with `enable.idempotence=true`, which is exactly what turns the exactly-once row of the table above from something requiring an explicit opt-in into the out-of-the-box producer behavior.

One more producer-side lever affects both throughput and this whole picture without touching correctness at all: **compression** (`compression.type`: `snappy`, `gzip`, `lz4`, `zstd`) operates at the batch level, not per individual message — compressing a batch of many small messages together is efficient, while compressing one large message in isolation gains little, so how much benefit compression actually delivers depends heavily on typical message size and throughput.

<h6 id="producer-customization" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Producer Customization</h6>
Everything above assumes the built-in partitioning, serialization, and monitoring behavior — but each of those is a pluggable seam, not a fixed pipeline.

**Custom `Partitioner`:** implementing `Partitioner.partition(...)` can override the default key-hash/sticky routing described earlier entirely — routing a `CRITICAL` alert level to its own dedicated partition, for instance, or deliberately spreading one disproportionately hot key across several partitions instead of concentrating it on one.

**Serde:** the joint nickname for a custom `Serializer`/`Deserializer` pair, letting producer and consumer agree on a wire format beyond the built-in `StringSerializer`/Avro serializers — key and value can each use an entirely independent serializer on the same record.

**Producer interceptors:** (`interceptor.classes`, KIP-42) hook into every record just before partition assignment, intended for cross-cutting measurement and monitoring rather than business logic — Kafka Streams itself leans on this hook style more heavily internally than application code typically should.

<h6 id="idempotent-producer-and-transactions" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Idempotent Producer and Transactions: Exactly-Once Mechanics</h6>
The delivery-semantics table above named "idempotent producer plus Kafka transactions" as what it takes to reach exactly-once, without yet explaining how either piece actually works — that's the gap this section closes. Start with the simpler of the two: an **idempotent producer** (`enable.idempotence=true`) has each message carry a unique **Producer ID (PID)** plus a per-partition, monotonically increasing sequence number, and the broker tracks the last five sequence numbers it has seen per partition per producer — which is exactly why `max.in.flight.requests.per.connection` is capped at 5 for an idempotent producer, that cap is what keeps the tracking window sufficient. Whenever a message arrives whose `(PID, sequence)` pair the broker has already accepted, it's silently rejected rather than appended a second time — closing exactly the gap where a producer's own retry, issued after an acknowledgment timeout that turned out to be a false alarm, would otherwise create a visible duplicate. This tracking state isn't fragile either: it survives leader failover, because followers replicate it in memory as they replicate messages, and it survives broker restarts via periodic disk snapshots that can be rebuilt from the log itself if a snapshot goes stale.

It's worth being precise about what this mechanism does *not* fix, because it's a narrower guarantee than "no duplicates" might suggest: two separate `producer.send()` calls carrying the same logical record are completely indistinguishable from two genuinely different records, and two independent producer instances sending the same data are never deduplicated against each other either — idempotence only ever removes duplicates created by the producer's *own* retry logic, nothing broader. And the tracking state itself isn't retained forever: a PID's sequence-tracking entry lives for `transactional.id.expiration.ms` (7 days by default) after that producer goes idle, which matters in practice for workloads that spin up many short-lived producers — one per Function-as-a-Service invocation, for instance — since each new instance's state accumulates on the broker rather than freeing on process exit. A sustained 3 new producer IDs per second for a week works out to roughly 1.8 million retained entries, on the order of 5 GB of broker memory — the practical fix is either reusing a small number of long-lived producers, or lowering the expiration window for workloads that genuinely can't avoid this kind of churn.

Idempotence alone only protects a single partition against duplicate sends — it says nothing about atomicity *across* partitions, which is the gap **transactions** close. A transaction lets a producer write to multiple partitions atomically, and — via `sendOffsetsToTransaction()` — atomically commit "the offset I consumed" together with "the output I produced," which is precisely what Kafka Streams relies on for stateful exactly-once processing, since a stream processor is always, at bottom, consuming from one topic and producing to another. Making this safe across restarts requires the producer to register a stable `transactional.id` — one that stays consistent across restarts of the same logical instance — with a **transaction coordinator** broker; calling `initTransactions()` bumps a **producer epoch** that fences off any earlier "zombie" instance still trying to use that same transactional ID.

The epoch bump alone used to be a real operational constraint: before KIP-447 (Kafka 2.5+), safe fencing required statically mapping each transactional ID to one fixed set of partitions, so a restarted instance had to reuse the *exact same* transactional ID for the *exact same* partitions to be fenced correctly at all. KIP-447 relaxed this by letting the coordinator instead use the **consumer group generation** (passed via `sendOffsetsToTransaction`) to recognize that a producer belongs to a stale generation of its consumer group and fence it on that basis — a change specifically motivated by letting Kafka Streams run multiple tasks per transactional producer safely, without needing a rigid one-partition-set-per-ID mapping.

The commit protocol itself is worth walking through step by step, because it explains why a coordinator crash mid-transaction never leaves things in an ambiguous state. Modeled conceptually on Chandy-Lamport distributed snapshots and built on "marker" control messages (with an internal `__transaction_state` log backing all of it): as the producer sends to each new partition, it first logs that this partition is now part of an in-progress transaction (step 1). When the application calls `commitTransaction()` or `abortTransaction()`, the coordinator logs its **intent** to commit or abort *before* doing anything else (step 2) — and because that intent is logged first, a coordinator crash at exactly this point is still recoverable: a newly elected coordinator simply resumes from the logged intent instead of having to re-decide anything. The coordinator then writes commit or abort **markers to every partition** the transaction touched (step 3), and finally logs completion (step 4). A transaction that never reaches `commitTransaction()`/`abortTransaction()` within `transaction.timeout.ms` is auto-aborted, so a crashed producer can't leave a transaction open indefinitely.

All of that machinery is invisible to a consumer unless it explicitly asks to see it: setting `isolation.level=read_committed` means a consumer never sees records from a transaction that's still open or that was aborted — the broker withholds them from fetch responses entirely, so there's no consumer-side buffering cost, only some added latency proportional to how long transactions stay open before committing. The default, `read_uncommitted`, sees everything, including writes from transactions that later abort; non-transactional records are always visible regardless of this setting either way. Kafka Streams sets `processing.guarantee=exactly_once_v2` (the modern name for what earlier versions called `exactly_once`, then `exactly_once_beta`) to drive this entire protocol internally, per task, with no application code ever touching the transactional producer API directly — the default remains `at_least_once`, since exactly-once has to be deliberately opted into given its cost.

What Kafka Streams does internally is exactly what a hand-written exactly-once consume-process-produce loop has to do explicitly at the raw client level:
```java
producer.initTransactions();
try {
    producer.beginTransaction();
    // ...process input, send output records...
    producer.sendOffsetsToTransaction(offsets, consumerGroupMetadata);
    producer.commitTransaction();
} catch (ProducerFencedException | OutOfOrderSequenceException | AuthorizationException e) {
    producer.close();               // non-recoverable — a newer instance has taken over, this one must stop
} catch (KafkaException e) {
    producer.abortTransaction();    // recoverable — abort and retry
}
```
The consumer side needs no special API call: setting `isolation.level=read_committed` (Kafka Streams sets this automatically) is the entire consumer-side requirement — aborted or still-open transactional records are withheld by the broker before they ever reach the consumer

<h6 id="consumer-poll-loop-and-rebalancing" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Consumer Poll Loop and Rebalancing</h6>
Every consumer, under the hood, is built around one repeated call: `poll()`. It's tempting to read that as "fetch the next batch of records," but `poll()` actually carries far more responsibility than that name suggests — the very first call a new consumer makes is what discovers the GroupCoordinator, joins its consumer group, and receives its initial partition assignment, and every later rebalance (along with the listener callbacks it triggers) is likewise processed *inside* a subsequent `poll()` call, not on some separate background path. That single fact explains an otherwise-confusing symptom: most consumer-group exceptions in Kafka surface as an exception thrown *from* `poll()` itself, because `poll()` is where all of that group-membership machinery actually lives.

That machinery needs a way to detect when a consumer has genuinely stopped participating — died, or is stuck — so the group can reassign its partitions to someone still working. Kafka uses two independent detection mechanisms for this, deliberately kept separate rather than merged into one: missed **heartbeats** (governed by `session.timeout.ms`, 10 seconds by default, sent by a background thread firing every `heartbeat.interval.ms` — conventionally a third of the session timeout), and missed **polls** (governed by `max.poll.interval.ms`, 5 minutes by default). The reason these can't be the same mechanism is that the heartbeat thread runs completely independently of the thread doing the actual record processing — a consumer whose main thread is stuck grinding through one unusually slow record can keep sending heartbeats the whole time and look perfectly alive by that measure alone. `max.poll.interval.ms` exists specifically as the backstop that catches exactly this case: if the main thread doesn't call `poll()` again within that window, the background heartbeat thread itself sends a "leave group" request on the stuck consumer's behalf, and the group rebalances without it. `max.poll.records` is the direct lever for staying safely under that window in the first place — it caps how many records a single `poll()` call returns, keeping per-poll processing time predictable even when individual records are slow or variable to handle.

A rebalance means partitions are being reassigned among the group's live consumers, and a consumer that's about to lose ownership of a partition needs to know before that happens — otherwise it can't save its progress or any partition-local state safely. `ConsumerRebalanceListener` provides exactly that hook: `onPartitionsRevoked` fires (always before any `onPartitionsAssigned`) to give a consumer the chance to save offsets or state before losing a partition, and `onPartitionsAssigned` fires afterward, letting the consumer, for example, `seek()` to a custom-stored offset — this matters specifically when offsets are being committed to an external store rather than Kafka's own internal offset topic. A separate escape hatch, `consumer.assign(List<TopicPartition>)`, bypasses group coordination entirely for the rarer case where an application wants full manual partition ownership with no rebalancing at all.

How disruptive a rebalance actually is depends heavily on *which* rebalancing strategy the group is using, and this is worth seeing side by side, because the difference is the whole reason a newer strategy replaced the old default:

```
Eager rebalancing (historical default) — one consumer restarts:

  Before:  Consumer A [P0, P1]   Consumer B [P2, P3]
             |
             | A restarts
             v
  STOP:    Consumer A revokes P0, P1   Consumer B revokes P2, P3   <- entire group pauses
             |
             | partitions reassigned from scratch
             v
  After:   Consumer A [P1, P3]   Consumer B [P0, P2]   <- B lost partitions it never needed to give up


Cooperative-sticky rebalancing (modern default) — same event:

  Before:  Consumer A [P0, P1]   Consumer B [P2, P3]
             |
             | A restarts — only A's partitions are revoked
             v
  After:   Consumer A [P0, P1]   Consumer B [P2, P3]   <- B never stopped consuming at all
```

**Eager rebalancing**, the historical default, revokes *every* partition from *every* consumer in the group the instant membership changes, then reassigns everything from scratch — simple to reason about, but the "stop-the-world" pause hits the whole group even when only one consumer joined or left, and as the diagram shows, a consumer typically ends up with a different set of partitions than it had before, discarding any partition-local state or caches it had built up for no real reason. **Cooperative-sticky rebalancing** (`CooperativeStickyAssignor`, now the recommended default) fixes exactly this: only the specific partitions that actually need to move are revoked, spread across two rebalance rounds instead of one stop-the-world pause, so consumers that keep the same partitions never stop consuming at all — dramatically shrinking the blast radius of a rebalance triggered by something as routine as one consumer restarting during a rolling deployment. **Static group membership** (`group.instance.id`) goes a step further still: a consumer that restarts within the configured session timeout keeps its previous partition assignment entirely, avoiding a rebalance altogether — valuable for exactly that rolling-deployment scenario, where each pod restarting one at a time would otherwise trigger a rebalance per pod even under cooperative-sticky.

<h6 id="consumer-fetch-tuning-and-offset-commits" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Consumer Fetch Tuning and Offset Commit Modes</h6>
Two more consumer behaviors are worth understanding precisely, because both directly shape how a consumer trades latency, efficiency, and correctness against each other. The first is how a consumer decides when to actually ask the broker for more data. Left completely unconstrained, a consumer polling a quiet topic would hammer the broker with mostly-empty requests — `fetch.min.bytes` avoids that by telling the broker to wait until at least that many bytes are available before responding at all, cutting down request/response chatter on low-traffic topics. That wait can't be unbounded, though, or a quiet topic would add unpredictable latency, which is what `fetch.max.wait.ms` (500ms by default) caps. `fetch.max.bytes` (50MB by default) bounds the other direction — the total size of one fetch response — though one oversized single record is still returned in full even past that cap, guaranteeing the consumer always makes forward progress rather than getting stuck unable to fetch a message bigger than its own limit. A related per-partition setting, `max.partition.fetch.bytes` (1MB default), is harder to reason about in practice, since an application doesn't directly control how many partitions happen to land in one fetch response — `fetch.max.bytes` is the generally preferred lever for this reason.

The second behavior is when a consumer tells Kafka it has actually finished with a message, and this is where the delivery-semantics table introduced earlier becomes a concrete configuration choice rather than an abstract guarantee. The default, `enable.auto.commit=true`, commits offsets on a timer (`auto.commit.interval.ms`) regardless of whether the fetched batch has actually finished processing — which means a crash between the last timer-driven commit and completed processing re-delivers records that were already handled, landing on at-least-once behavior by accident rather than by deliberate design. Turning that off (`enable.auto.commit=false`) hands control to the application explicitly: `commitSync()` blocks until the broker acknowledges the commit, the simplest option to reason about, while `commitAsync(callback)` doesn't block but needs that callback to actually observe failures — a fire-and-forget async commit that silently fails looks identical to success right up until the next rebalance reprocesses far more than expected. Committing manually, and specifically *after* processing has genuinely succeeded, is what turns at-least-once from an accident of the default timer into a deliberate, understood guarantee.

One structural constraint applies regardless of any of these settings: a single `KafkaConsumer` instance is not thread-safe, and one thread can never run two consumers belonging to the same group. The standard pattern is one consumer per thread, with an `ExecutorService`-managed thread pool if an application genuinely needs several consumers reading one group in parallel.

<h6 id="operational-knowledge" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Operational Knowledge</h6>
Running Kafka in production comes down to watching a handful of signals and knowing where to look when something's wrong. The single most important consumer-side health signal is **consumer lag** — the distance between the offset a producer has most recently written and the offset a consumer has most recently processed. A stable or shrinking lag means the consumer is keeping pace; a steadily growing lag means it can't keep up, and is the first thing worth checking whenever a downstream system seems to be falling behind in near-real time. On the message-retention side, ordinary retention simply keeps messages by time or size regardless of whether they've been consumed, which is what makes a Kafka log replayable in the first place — a separate retention strategy, log compaction, is deep enough to deserve its own explanation just below. For messages that repeatedly fail processing, a **dead letter topic** gives a consumer somewhere to park those "poison" messages instead of blocking the rest of the partition behind one message that will never succeed. And when something at the cluster level — a replication issue, an unexpected leadership change — needs diagnosing, three broker log files are the first place to look: `server.log` (general broker activity and startup errors), `controller.log` (present only on whichever broker currently holds the controller role, recording its leadership decisions), and `state-change.log` (every partition state transition a broker received from the controller).

<h6 id="log-compaction-vs-retention" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Log Compaction vs Time/Size Retention</h6>
Ordinary retention, mentioned above, deletes whole log segments once they exceed a configured age or the partition exceeds a configured size (`cleanup.policy=delete`, the default) — a policy suited to genuine event streams, where every event (a click, a payment, a sensor reading) is independently meaningful on its own and simply ages out once it's no longer needed. But a large class of real Kafka use cases don't actually want a stream of independent events at all — they want the topic to represent *current state*, the way a database table does, where only the latest value for a given key actually matters and everything older is just noise. **Log compaction** (`cleanup.policy=compact`) is Kafka's answer to that need: instead of discarding by age, a background process retains only the most recent value written for each key, discarding every older value for that same key. Deleting a key entirely is done by writing a `null` value for it — a **tombstone** — which is retained for a grace period before the key is finally removed altogether, and is the mechanism a General Data Protection Regulation-style deletion request typically relies on to actually purge a piece of data from Kafka. The practical consequence of this design is that a compacted topic's total size is bounded by how many *distinct keys* exist, not by how much history has accumulated over time — an event stream with compaction enabled by mistake would keep growing forever; a properly compacted topic reaches a stable size once every key has been written at least once.

Compaction doesn't run continuously across the whole log — it works segment by segment, and it's worth knowing which segments are eligible. A compacted partition's segments are either **clean** (already deduplicated down to one value per key) or **dirty** (not yet processed by the compaction pass, and possibly still holding several old values for the same key). Compaction only ever runs against **inactive** segments — never the one currently being actively written to — which means a consumer reading through the log can legitimately observe more than one value for the same key until the active segment finally rolls over (governed by `log.roll.hours`, commonly set to `24`). This isn't a bug in compaction; it's the price of never having to pause writes to run cleanup.

Why this actually matters goes well beyond storage savings. Compaction is what turns a Kafka topic into a durable, replayable representation of *current state*, rather than merely a stream of past events — a state/stream duality captured well by one observation: the truth is the log, and a database is really just a cache of a subset of that log. A compacted topic is precisely what backs Kafka Streams' `KTable` abstraction, covered further below — it lets a brand-new consumer rebuild the *entire* current state simply by replaying the compacted log from the beginning, with no separate snapshot mechanism ever needed, and it's the standard target for Change Data Capture pipelines that mirror a database table's current rows into Kafka. The two policies aren't even mutually exclusive: `cleanup.policy=compact,delete` compacts by key while still enforcing an outer time/size bound on how long tombstones and superseded values are allowed to linger before compaction actually removes them.

<h6 id="kafka-connect" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Kafka Connect</h6>
Everything covered so far assumes messages are already flowing into or out of Kafka via application code that calls a producer or consumer directly. In practice, a huge fraction of real Kafka usage is instead about moving data between Kafka and something entirely outside it — a database, a search index, a file system — and hand-writing a producer or consumer for every such integration means separately reimplementing offset tracking, restart/retry handling, and format conversion every single time. **Kafka Connect** is a framework, bundled with Kafka core, built specifically to eliminate that duplicated effort: it moves data into and out of Kafka through pluggable **connectors** instead of custom code, where a **source connector** imports data (a database table becoming a topic, for instance) and a **sink connector** exports it (a topic feeding an Elasticsearch index, say). Under the hood, a connector task is just a producer (for a source) or a consumer (for a sink) — Connect's real value isn't a new capability, it's standardizing the surrounding lifecycle that every hand-rolled pipeline would otherwise reimplement from scratch.

That framing also marks Connect's boundary clearly: it's the right tool specifically when you don't control the source or sink system's code and a maintained connector for it already exists, since writing one from scratch would mean reinventing fault tolerance and offset management Connect already provides. Its **Single Message Transformation** feature covers lightweight in-flight reshaping — routing, filtering, field redaction, type conversion — but joins and aggregations are deliberately out of scope, left to Kafka Streams instead; this is the same DSL-versus-custom-logic boundary that later separates the Kafka Streams DSL from its lower-level Processor API. One especially common source-connector pattern deserves its own name: **Change Data Capture (CDC)** connectors, like Debezium, read a database's own internal replication log directly — a MySQL binlog, for instance — and emit one Kafka event per row-level change, avoiding both the inefficiency and the lag of repeatedly polling the database for what changed. This is the standard way to feed a compacted topic that mirrors a table's current rows, tying directly back to the log compaction mechanics covered above.

Running Connect at all means choosing between two deployment shapes, and the choice is really about whether one worker is enough. Standalone mode runs a single worker process with its connector's configuration passed directly on the command line — useful only when a connector genuinely must run on one specific, known machine, such as one tailing a local log file that only exists on that host. Distributed mode instead runs a cluster of workers sharing one `group.id`, which coordinate and rebalance connector tasks across themselves in essentially the same way a consumer group rebalances partitions, and are configured and monitored through a REST Application Programming Interface rather than local configuration files. A worker's own configuration governs how that coordination and format handling actually behaves: `plugin.path` names the directories Connect scans for connector jars and their dependencies — the recommended way to add a connector, since putting one directly on the classpath risks dependency conflicts between unrelated connectors sharing the same worker. `key.converter`/`value.converter` set the format data takes as it's actually stored in Kafka (built-in JSON, or Avro/Protobuf/JSON Schema through a Confluent Schema Registry), and `rest.host.name`/`rest.port` expose the REST API every worker runs for configuring and monitoring its connectors — `curl http://host:8083/connector-plugins` lists whatever's installed on a given worker. A minimal source connector, needing no custom code at all, looks like this:
```properties
name=local-file-source
connector.class=FileStreamSource
tasks.max=1
file=test.txt
topic=connect-test
```

Connect's Single Message Transformation feature raises a deeper design question worth understanding on its own terms: when data is moving through a pipeline, should it be reshaped in flight, or landed raw and reshaped only once it reaches its destination? Transforming data in-flight — **Extract-Transform-Load (ETL)**, via a Single Message Transformation — saves whatever downstream storage and compute the transformation would otherwise cost, but it locks every consumer of that topic into the pipeline author's transformation choices: if a field gets dropped in-flight, it's permanently gone for every downstream consumer, recoverable only by rebuilding the pipeline and reprocessing history. **Extract-Load-Transform (ELT)** — landing the raw data and transforming only at the target — keeps every consumer's options open, at the cost of shifting the compute and storage burden downstream to wherever the transformation eventually happens. Kafka's fan-out model, where one topic can feed many independent consumers, makes premature in-pipeline transformation a specifically sharper risk than it would be in a simpler point-to-point pipeline: a transformation decision made to suit one consumer constrains every other consumer of that same topic, not just the one that asked for it.

<h6 id="kafka-security" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Security</h6>
Everything covered so far has assumed a trusted network with no hostile actors on it — a reasonable assumption for a local development cluster, but not for production. Kafka's security model addresses this across four largely independent layers, each answering a different question, and it's worth understanding all four separately since a strong answer on one doesn't imply anything about the others.

The first question is whether traffic can be read in transit. A broker can expose several `listeners` simultaneously — `PLAINTEXT://:9092,SSL://:9093`, for instance — which is precisely what lets clients migrate to Transport Layer Security without any downtime: the old and new listeners simply run side by side until every client has moved over. Each broker needs its own keystore holding a private key and signed certificate, and clients need a truststore holding the Certificate Authority's certificate to verify what the broker presents; `security.inter.broker.protocol=SSL` separately governs broker-to-broker traffic, independent of whatever the client-facing listeners are configured to use.

The second question is who a connecting client actually *is*. Simple Authentication and Security Layer (SASL) with Kerberos is the traditional enterprise answer, common wherever a Kerberos Key Distribution Center already exists — typically Hadoop-adjacent environments — and is configured via a Java Authentication and Authorization Service login file naming a keytab and principal for each broker and client. `SASL/SCRAM` (plain username and password, no external Kerberos infrastructure required) and `SASL/OAUTHBEARER` (token-based, integrating with whatever identity provider is already in use) are the common lighter-weight alternatives when standing up a full Kerberos deployment isn't warranted.

Authentication only establishes identity — it says nothing about what that identity is allowed to *do*, which is the third question, answered by authorization. Kafka's `Authorizer` interface is pluggable, and the built-in implementation stores Access Control Lists and is managed through `kafka-acls.sh` — granting `Read` and `Write` on a specific topic to a specific principal, for example — with a deny-by-default posture kicking in the moment any Access Control List exists at all for a given resource. Grouping permissions into named roles instead of individual per-principal entries — Role-Based Access Control — is worth knowing is *not* part of open-source Kafka itself; it's a Confluent Platform extension layered on top of Kafka's own Access Control List model.

The fourth question, quotas, isn't really about security at all but about fairness and abuse prevention, and it's worth understanding precisely because its enforcement scope is easy to misjudge: quotas are enforced **per broker**, not summed across the whole cluster, so the effective limit a client actually experiences scales with how many brokers it happens to be talking to. There are two independent quota types: **network bandwidth** (`producer_byte_rate`/`consumer_byte_rate`, in bytes per second per client) and **request rate** (`request_percentage`, capping the share of a broker's Input/Output-plus-network thread capacity one client can consume) — the request-rate quota exists specifically because a bandwidth quota alone can't catch a client that's cheap in bytes but expensive in processor time, such as one repeatedly triggering costly Transport Layer Security handshakes, or one polling aggressively with `fetch.max.wait.ms=0`. Quota precedence, most specific rule first, goes: a user-plus-`client.id` combination, then the user alone, then the `client.id` alone.

Finally, one gap worth naming explicitly rather than assuming: Kafka does not encrypt log segments on disk by default. Encryption at rest, where it's genuinely required, is typically handled one layer down, at the filesystem or disk level, rather than by Kafka itself.

<h6 id="cross-cluster-replication-mirrormaker" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Cross-Cluster Replication (MirrorMaker)</h6>
Every replication mechanism covered so far — replication factor, the In-Sync Replica set, leader election — operates strictly *within* one cluster; Kafka has no built-in way to replicate data between two entirely separate clusters. That gap matters in several genuinely common situations: cross-datacenter disaster recovery, migrating a workload off one cluster onto another without downtime, or aggregating several regional clusters into one central analytics cluster — none of which replication factor alone can solve, since Kafka's own replication protocol only ever runs among brokers that belong to the same cluster metadata quorum. **MirrorMaker 2**, built directly on top of Kafka Connect, is the standard tool that closes this gap: it runs as a set of source and sink connectors that consume an entire source cluster's topics and republish them to a target cluster.

MirrorMaker 2 improves on the original, simpler MirrorMaker tool in three specific ways worth knowing individually, since each solves a distinct failure mode of the original design. **Topic renaming** prefixes a mirrored topic with its source cluster's name, so the same logical topic arriving from two different source clusters doesn't collide once it reaches the target. **Offset translation** lets a consumer that fails over from the source cluster to the target cluster resume from an equivalent offset, instead of being forced to restart consumption from the very beginning. And **active/active** replication support lets both clusters replicate to each other simultaneously, something the original tool's strictly active/passive design never allowed at all.

That last point is itself a real architectural choice worth weighing on its own terms. **Active/passive** replication keeps one cluster as the only one clients ever write to, with the other purely a disaster-recovery target — simple to reason about, at the cost of the passive cluster's capacity sitting entirely idle under normal operation. **Active/active** replication lets clients write to whichever cluster suits them, typically the geographically nearest one, but that flexibility comes with a real cost: since Kafka's replication mechanism itself has no conflict-resolution logic at all, any application writing the same key to both clusters concurrently needs its own application-level strategy for resolving that conflict — Kafka will faithfully replicate both writes, but it will never decide which one should win.

<h6 id="kafka-streams-basics" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Kafka Streams Basics</h6>
Everything so far has been about the broker, the producer, and the consumer — but processing a stream often means more than reading records and writing them somewhere else: computing a running total, enriching one event with data from elsewhere, joining two streams together. Writing all of that by hand against the raw consumer/producer client is possible but repetitive, and **Kafka Streams** is a Java library — not a separate cluster or service the way Kafka Connect or ksqlDB are — built specifically to make that kind of stream processing a first-class, structured activity on top of the same consumer/producer APIs already covered above. A Kafka Streams application is, underneath, just a regular Java process, and it's horizontally scaled the same way any consumer group is: run more instances, and they automatically split the input topic's partitions among themselves via a consumer group, with no separate scaling mechanism to learn.

Kafka Streams organizes everything around two complementary abstractions, and understanding each individually first is what makes the relationship between them click. A **KStream** represents a record stream, where every message is treated as an independent, immutable event — the natural fit for a topic using ordinary time/size retention, since nothing in a KStream ever "replaces" anything else. A **KTable**, by contrast, represents a changelog or table abstraction, where only the *latest* value for a given key is meaningful, and each new update simply overwrites whatever came before for that same key — the natural fit for a compacted topic, and conceptually a continuously-updated materialized view built from a KStream of updates. Once both are defined on their own terms, the relationship between them — the **stream-table duality** — becomes concrete and useful: joining a KStream of incoming orders against a KTable of current customer data (kept fresh by a compacted `customers` topic) is exactly how Kafka Streams implements the common "enrich an event stream with reference data" pattern, without ever making a synchronous database call per event.

Any operation that needs to remember something across records — an aggregation, a join, a windowed count — needs somewhere to keep that running state, and Kafka Streams keeps it locally: each application instance holds its state in an embedded RocksDB instance, which is itself continuously backed up to an internal compacted **changelog topic**. That backup is what makes the whole design fault-tolerant without any separate snapshot mechanism: a crashed instance can fully rebuild its local state simply by replaying its changelog partition, and rebalancing state across instances during a scaling event just means reassigning changelog-topic partitions the same way any other partition reassignment already works.

Getting from a raw stream to that kind of stateful result goes through grouping, and two pairs of near-identical-looking methods are worth telling apart precisely, since picking the wrong one has a real performance cost. `groupByKey()` and `groupBy()` both feed into an aggregation (`reduce`, `aggregate`, or `count`, all of which always produce a `KTable`), but they behave differently underneath: `groupByKey()` keeps the stream's existing key and never forces repartitioning, while `groupBy()` — used specifically when deriving a *new* key — always triggers an extra repartition topic round-trip before the aggregation can run at all, since Kafka Streams needs every record sharing a key co-located on the same partition. `groupByKey()` should be preferred whenever the key genuinely doesn't need to change. Once grouped, `reduce()` and `aggregate()` differ in what kind of result they can build: `reduce()` combines two values of the *same* type (summing volumes, for instance) and needs no initial value to start from, while `aggregate()` can produce an output type entirely different from its input — building a running top-N `PriorityQueue` out of individual records, for example — and requires both an explicit initializer and, for windowed aggregations specifically, a "subtract" function alongside the usual "add" one, since a record can fall back *out* of a session window and needs to be removed from the running result, not just added to it once.

**Implementation example** — the KStream/KTable join described above, built with the `StreamsBuilder` topology Application Programming Interface (API):
```java
@Bean
public KStream<String, EnrichedOrder> orderEnrichmentTopology(StreamsBuilder builder) {
    KStream<String, Order> orders = builder.stream("orders");                     // event stream — every record independently meaningful
    KTable<String, Customer> customers = builder.table("customers");              // changelog table — only the latest value per key matters

    KStream<String, EnrichedOrder> enriched = orders
        .join(customers,
              (order, customer) -> new EnrichedOrder(order, customer),
              Joined.with(Serdes.String(), orderSerde, customerSerde));

    enriched.to("orders-enriched");                                               // materialize the result back onto its own topic
    return enriched;
}
```
No explicit database call happens per order: the `customers` KTable is a continuously-updated local materialized view (backed by an embedded RocksDB instance, itself checkpointed to a compacted changelog topic per the mechanics above), so the join is an in-memory lookup — this is exactly what keeps Kafka Streams topologies horizontally scalable by just running more application instances.

<h6 id="kafka-streams-windowing-and-the-processor-api" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Kafka Streams: Windowing and the Processor API</h6>
An aggregation like `count()` naturally produces one running total that grows forever from the moment the application started — useful for some things, but not for a question like "how many orders arrived in the last 20 seconds," which needs the result reset, or at least re-scoped, on some kind of recurring basis. **Windowing**, applied via `KGroupedStream.windowedBy(...)`, is what buckets an aggregation's results this way instead of accumulating one unbroken total. A detail that matters more than it first appears: window boundaries are computed from **timestamps embedded in each record itself**, not from wall-clock processing time — which is exactly what lets a late or out-of-order record (arriving within the window's retention period) still land in the correct window instead of being misfiled into whatever window happens to be current when it's processed.

Kafka Streams provides three distinct windowing strategies, and they're different enough in shape that seeing them side by side clarifies each one faster than reading three separate paragraphs:

```
Tumbling (fixed size, no overlap — every record in exactly one window):
  [-- window 1 --][-- window 2 --][-- window 3 --]
  t=0            t=20           t=40           t=60

Hopping/sliding (fixed size, overlapping — one record can land in several):
  [-- window 1 --]
       [-- window 2 --]
            [-- window 3 --]
  t=0   t=5   t=10  t=15  t=20  t=25

Session (no fixed size — delimited by an inactivity gap per key):
  event  event    <gap>              event  event  event   <gap>
  |------session A------|            |--------session B--------|
```

**Tumbling windows** (`TimeWindows.of(size)`) are fixed-size, back-to-back, non-overlapping buckets — every record belongs to exactly one window, making this the natural choice whenever the question really is "what happened in this specific, clock-aligned period." **Hopping** (or sliding) **windows** (`TimeWindows.of(size).advanceBy(advance)`) are also fixed-size, but they advance by an interval *smaller* than their own size, so consecutive windows overlap and a single record can legitimately land in several of them at once — the right choice for a smoothed rolling metric rather than a hard periodic reset, since each new window shares most of its data with the one before it. **Session windows** (`SessionWindows.with(inactivityGap)`) abandon fixed sizing entirely, delimited purely by a gap of inactivity per key: two records for the same key arriving within that gap merge into one continuously growing session, while a record arriving after the gap starts an entirely new one — modeling genuine bursts of activity, like a single shopping session, rather than forcing them into arbitrary clock-aligned buckets.

Everything covered up to this point about Kafka Streams has used its high-level DSL — `KStream`, `KTable`, `.join()`, `.groupBy()` — which deliberately hides some of its own internal decisions from application code, most notably *when* exactly a record actually gets forwarded downstream (a `KTable` aggregation, for instance, doesn't forward every single intermediate update it computes internally). The **Processor API** exists for the cases where that hidden decision-making gets in the way and explicit control is needed: scheduling a periodic action on wall-clock or record time (`punctuate`), forwarding a record to only one of several possible downstream nodes based on custom logic, or implementing something the DSL simply doesn't expose an equivalent for at all. The trade-off it makes is the same one an Object-Relational Mapping framework makes against raw Structured Query Language: the DSL is faster to write and covers the overwhelming majority of cases, while the Processor API trades that convenience away for full, explicit control over the topology's wiring. Concretely, building with the Processor API means naming every node explicitly — the DSL auto-generates names, but here parent/child relationships are wired by name directly:
```java
topology.addSource(LATEST, "source", timestampExtractor, keyDeserializer, valueDeserializer, "input-topic")
        .addProcessor("enrich", () -> new MyProcessor(), "source");   // 3rd argument wires "enrich" as source's child
```
Every call here returns the same `Topology` instance being built up, rather than a fresh `KStream`/`KTable` the way the DSL's fluent calls do. The two approaches aren't mutually exclusive, either — `KStream.process()`/`.transform()` let a topology drop into Processor API logic at a specific point while staying in the DSL everywhere else, rather than forcing an all-or-nothing choice between the two styles.

Testing a topology this complex against a real, running Kafka cluster for every test run would be slow and would couple fast unit tests to cluster availability neither should depend on. `TopologyTestDriver` avoids that entirely by driving a built `Topology` in-process: `pipeInput(...)` feeds a record in, `readOutput(...)` reads whatever came out the other side, and this validates an entire topology's wiring and transformations — source, through however many processors, out to however many sinks — with no real broker and no KRaft or ZooKeeper cluster involved at all, as long as the topology itself was built as a standalone factory method rather than assembled inline inside `main()`.

<h6 id="spring-kafka" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Spring Kafka</h6>
Everything above describes Kafka's own client and streaming libraries directly; Spring Kafka is the layer that adapts those libraries to the same declarative, annotation-driven style the rest of a Spring Boot application already uses. A method annotated `@KafkaListener(topics = "...", groupId = "...")` becomes a fully working consumer with no manual `poll()` loop ever written by hand — Spring owns that loop internally and simply invokes the annotated method per record. The concurrency, deserialization, and error-handling behavior behind that annotation is configured through a `ConcurrentKafkaListenerContainerFactory` bean, and error handling itself is typically composed from a `DefaultErrorHandler` (applying the retry-with-backoff behavior already covered in the Resilience Patterns section) paired with a `DeadLetterPublishingRecoverer`, which routes a record to a dead-letter topic — the concept introduced above under Operational Knowledge — once its retries are exhausted, or non-blocking retry topics for retrying without ever pausing the main partition's consumption.

**Implementation example** — a producer publishing keyed events with the `acks=all` durability setting from above, and a consumer with dead-letter error handling:
```yaml
# application.yml
spring:
  kafka:
    bootstrap-servers: localhost:9092
    producer:
      acks: all
      properties:
        enable.idempotence: true
    consumer:
      group-id: order-service
      auto-offset-reset: earliest
```
```java
@Service
public class OrderEventProducer {
    private final KafkaTemplate<String, OrderPlacedEvent> kafkaTemplate;

    public OrderEventProducer(KafkaTemplate<String, OrderPlacedEvent> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void publish(OrderPlacedEvent event) {
        // key = orderId: guarantees every event for this order lands in the same partition, in order
        kafkaTemplate.send("orders", event.orderId(), event);
    }
}

@Configuration
public class KafkaErrorHandlingConfig {
    @Bean
    public DefaultErrorHandler errorHandler(KafkaTemplate<Object, Object> template) {
        var recoverer = new DeadLetterPublishingRecoverer(template);          // after retries exhaust, publish to "orders.DLT"
        return new DefaultErrorHandler(recoverer, new FixedBackOff(1000L, 3)); // 3 retries, 1s apart, before giving up
    }
}

@Component
public class OrderEventConsumer {
    @KafkaListener(topics = "orders", groupId = "order-service")
    public void onOrderPlaced(ConsumerRecord<String, OrderPlacedEvent> record) {
        // idempotent by design: upsert on event.orderId(), safe to process the same message twice
        orderProjectionService.upsert(record.key(), record.value());
    }
}
```

<h6 id="kafka-vs-traditional-message-brokers-rabbitmq" style="font-size:13px;font-weight:600;opacity:.72;margin:14px 0 5px;">Kafka vs Traditional Message Brokers (RabbitMQ)</h6>
Every mechanism covered in this section — partitions, consumer groups, offsets a consumer tracks itself, replayable retention — traces back to one foundational design choice: Kafka is a **dumb broker with a smart client**, where the broker's only real job is durably appending to a log and the client bears the responsibility for tracking its own position in it. RabbitMQ, the most common point of comparison, makes the opposite choice — a **smart broker with a dumb client** — and that single inversion explains every difference in the table below, not just a list of unrelated feature gaps:

| Aspect | Kafka | RabbitMQ |
|---|---|---|
| Model | Distributed replayable log (dumb broker, smart consumer) | Routing-centric queues (smart broker, dumb consumer) |
| Messages after consumption | Kept until retention expires (replay possible) | Deleted once acknowledged (no replay) |
| Strength | Massive throughput, event streaming and replay | Flexible routing, work queues and per-message guarantees |

Because Kafka's broker doesn't track per-consumer delivery state, a message isn't deleted the moment it's consumed — it simply sits in the log until retention expires, which is exactly what makes replay possible at all, and exactly what a smart broker that actively tracks and deletes acknowledged messages, like RabbitMQ, cannot offer. That trade-off cuts both ways, though — a plain, low-volume task-distribution workload with no genuine need for replay is often *worse* served by Kafka than by a simple queue, since Kafka's replayable-log model and partition-based scaling are solving a problem that workload doesn't actually have; a traditional queue in that case is operationally far simpler to run.

<h4 id="resilience-patterns-know-the-names-and-the-why" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🕸️ Resilience Patterns (know the names AND the why)</h4>

| Pattern | Mechanism | Why it matters |
|---|---|---|
| **Circuit Breaker** | Three states: **Closed** (calls pass, failures counted) → **Open** (threshold exceeded, calls fail fast without hitting the sick dependency) → **Half-Open** (a probe batch; success returns to Closed, failure stays Open) | Stops a sick dependency from cascading into total failure — Resilience4j |
| **Retry** | Re-attempt with **exponential backoff** (wait doubles) plus **jitter** (random offset prevents retry storms) | Safe only when the operation is idempotent; never retry non-idempotent writes without an idempotency key |
| **Bulkhead** | Isolate thread and connection pools per dependency | One slow dependency cannot exhaust the shared pool and drown the whole service (named after ship compartments) |
| **Timeout** | Set an explicit deadline on every outbound call | Library defaults are often infinite, so a hanging dependency would hold threads forever |
| **Rate limiting** | Cap requests accepted per window | Protects the service from abusive or runaway clients |
| **Fallback** | Return cached data or a default when the primary path fails | Degrades gracefully instead of surfacing an error to the user |

**Libraries**: Resilience4j (Java), Polly (.NET)

<h4 id="data-management-across-services-where-interviews-get-hard" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🕸️ Data Management Across Services (where interviews get hard)</h4>
- **Why not distributed transactions**: Two-Phase Commit (2PC) blocks every participant on a central coordinator — it kills availability and autonomy, so microservices avoid it
- **Saga pattern**: A distributed business transaction expressed as a sequence of local transactions, each paired with a **compensating transaction** to undo it on failure
  - **Choreography**: Services react to each other's events — no central brain, but the flow is harder to follow
  - **Orchestration**: A central coordinator drives the steps — easier to follow, but one more component to run
- **Outbox pattern**: Solves the dual-write problem (a database and a message broker cannot be updated atomically): write the event into an `outbox` table *inside* the business transaction, then a relay publishes it — typically CDC with Debezium
- **Command Query Responsibility Segregation (CQRS)**: Separate write model and read model — justified when reads and writes have very different shapes or loads; otherwise overkill
- **Eventual consistency**, explained to a stakeholder: "The order is confirmed immediately; the loyalty points appear a few seconds later — and the business is fine with that"

<h4 id="observability--the-three-pillars" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🕸️ Observability — the three pillars</h4>
- **Logs**: Structured (JSON) and centralized
- **Metrics**: Micrometer → Prometheus → dashboards and alerting
- **Traces**: Micrometer Tracing / OpenTelemetry — the trace identifier is propagated across every service hop
- **Correlation identifier**: One identifier per request, present in every log line of every service the request crossed
- **Health checks**: Spring Boot Actuator exposes **liveness** (is the process alive — restart it if not) and **readiness** (can it serve traffic — remove it from load balancing if not)

<h4 id="entry--deployment-patterns" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🕸️ Entry &amp; Deployment Patterns</h4>
- **API Gateway / Backend For Frontend (BFF)**: A single entry point for frontend calls handling routing, authentication, rate limiting, and protocol translation; the BFF variant tailors a gateway per client type (mobile, web)
- **Shared Event Bus / Message Queues**: Asynchronous communication between microservices through messages, decoupling producers from consumers in time and availability
- **Service Registry**: A live directory of service instances and addresses for discovery; in Kubernetes, native Domain Name System (DNS) resolution makes a dedicated registry (Eureka) unnecessary
- **Blue/Green deployment**: Two identical environments; the passive one runs the new version, a router switch cuts traffic over instantly, and rollback is an equally instant switch back — zero-downtime at the cost of double infrastructure
- **Canary deployment**: Route a small percentage of live traffic to the new version, watch error rates and latency, then grow the percentage or roll back — lower risk than blue/green for a large user base

<h3 id="architecture-types" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🏛️ Architecture Types</h3>

Each pattern below is worth scoring, consistently, against the same six characteristics: agility, deployability, testability, performance, scalability, and ease of development. Applying that same fixed checklist to any architecture decision — not just when choosing among these five patterns — is a good habit for an architecture decision record.

<h4 id="layered-architecture-n-tier" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🏛️ Layered Architecture (N-Tier)</h4>
Horizontal layers, each with a distinct role: **Presentation → Business → Persistence → Database**. Requests flow down through each closed layer in turn.
- **Strength**: well understood, easy to build and test (mock lower layers)
- **Weakness**: tends to deploy as a monolith; the "architecture sinkhole" anti-pattern appears when requests pass through layers that add no logic
- **When**: the default starting point when domain boundaries are not yet clear

<h4 id="event-driven-architecture" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🏛️ Event-Driven Architecture</h4>
Decoupled, single-purpose components process events asynchronously. Two topologies:
- **Mediator**: a central mediator orchestrates a multi-step event by dispatching sub-events in sequence
- **Broker**: components publish to a broker and react to each other, with no central brain
- **Strength**: high scalability and adaptability; components decoupled in time and availability
- **Weakness**: complex error handling and flow tracing; eventual consistency

<h4 id="microkernel-architecture-plugin" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🏛️ Microkernel Architecture (Plugin)</h4>
A minimal **core system** holds only what is needed to run; all extra features are independent **plug-ins** registered in a registry. The core stays stable; new capability means a new plug-in.
- **Examples**: the Eclipse IDE, browser extensions, claims processing with per-region rules as plug-ins
- **Strength**: high agility and testability; plug-ins can be deployed at runtime
- **Weakness**: usually a single deployable unit (low scalability); designing the plug-in contract is hard

<h4 id="space-based-architecture" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🏛️ Space-Based Architecture</h4>
Removes the central-database bottleneck with replicated **in-memory data grids**: multiple processing units each hold the full data set in memory, behind a virtualized middleware (messaging, data, processing grids) that routes and replicates. Units spin up and down with load.
- **Strength**: near-linear horizontal scalability; in-memory speed
- **Weakness**: expensive and complex; eventual consistency between units; unsuited to large relational datasets
- **When**: highly variable, unpredictable concurrent load (auctions, ticket booking)

<h4 id="db-centric-architecture" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🏛️ DB Centric Architecture</h4>
Has a database at the center of the application, divided into layers:
- **UI**
- **Business Logic**
- **Data Access**: DB

<h4 id="domain-centric-architecture" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🏛️ Domain Centric Architecture</h4>
The domain is at the center of the application and the layers are divided in:
- **Presentation**: UI
- **Application**: Abstractions for the use cases of the app
- **Domain**: Abstractions for the problem/business domain
- **Persistence**: Interface with the storage/DB
- **Infrastructure**: Interface with the operative system and 3rd party dependencies
- **Crosscutting**: Aspects common to all projects of the app
- **Specification**: Acceptance tests verifying the functionality of the application

<h4 id="functional-organization" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🏛️ Functional Organization</h4>
Separate the layers by functionality

<h3 id="design-tips" style="font-size:26px;font-weight:700;margin:26px 0 10px;">💡 Design Tips</h3>
- Understand the problem
- Ask questions about:
    - Features
    - Users
    - Scaling
    - Stack
- Design the most critical components first

**A repeatable seven-step interview structure**: requirements clarification → define the Application Programming Interface (API) surface → back-of-the-envelope estimation (queries per second, storage, bandwidth — before designing anything) → data model → high-level design (five or six boxes end-to-end) → detailed design on the two or three components the interviewer signals interest in, framed as trade-offs, never as a single correct answer → explicit bottleneck/single-point-of-failure walkthrough.

<h3 id="requirements" style="font-size:26px;font-weight:700;margin:26px 0 10px;">📋 Requirements</h3>

<h4 id="functional-requirements" style="font-size:20px;font-weight:700;margin:22px 0 8px;">📋 Functional Requirements</h4>
Describe behavior: APIs, Operations supported

<h4 id="non-functional-requirements" style="font-size:20px;font-weight:700;margin:22px 0 8px;">📋 Non-Functional Requirements</h4>
Describe qualities: Scalable, Fast, Secure

A system that satisfies every functional requirement while ignoring the non-functional ones (latency, availability, security) is, in practice, a badly designed system — non-functional requirements must be defined *before* the design starts, not added afterward, because they drive foundational choices (data consistency model, deployment topology, observability) that are expensive to retrofit.

---

<h2 id="-testing" style="font-size:33px;font-weight:800;margin:30px 0 12px;">🧪 Testing</h2>

> 💻 Code: [ExceptionTest (assertions & expected exceptions)](../src/main/java/algorithm/concepts/oop/exceptions/ExceptionTest.java)

The **test pyramid** sets the proportions: many fast unit tests at the base, fewer integration tests in the middle, a handful of slow end-to-end tests at the top. End-to-end tests give the highest confidence because they exercise the whole system the way a real user would, but they are slow and brittle — they depend on the database, network, and every external service being up and behaving predictably. Unit tests are fast and stable but only prove one isolated piece works, not that the pieces integrate correctly. Inverting the pyramid's proportions produces a slow, hard-to-maintain suite.

<h4 id="testing-methodologies-tdd-vs-bdd" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🧪 Testing Methodologies: Test-Driven Development vs Behavior-Driven Development</h4>
- **Test-Driven Development (TDD)**: a workflow, not a testing tool — write a failing test first, write the minimum code to make it pass, then refactor (the *red-green-refactor* cycle). Its purpose is incremental design guided by tests, not test coverage as an afterthought
- **Behavior-Driven Development (BDD)**: a way of *specifying* expected behavior in language close to the business domain (*given-when-then*, typically in Gherkin), so non-technical stakeholders can confirm the tests capture the right behavior
- **The two are not mutually exclusive**: a team can practice TDD while writing each test in BDD's given-when-then style — TDD is about *when* tests are written, BDD is about *how* they are phrased

<h4 id="unit-testing" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🧪 Unit Testing</h4>
Tests one class in isolation; collaborators are replaced by mocks. Fast and deterministic.
- **JUnit**: The Java testing framework — runs tests, provides assertions and the lifecycle
- **Mockito**: Creates mock objects so you control what dependencies return and verify how they were called

<h5 id="junit-5-annotations" style="font-size:16px;font-weight:600;margin:18px 0 7px;">JUnit 5 Annotations</h5>
```java
@BeforeEach // run before EACH test — fresh fixtures (JUnit 4 name was @Before)
@AfterEach  // run after EACH test — release resources (JUnit 4 name was @After)
@BeforeAll  // run ONCE before all tests in the class (static)
@Test       // marks a runnable test method
@Disabled   // temporarily skip a test
```

<h5 id="mockito-vs-spring-test-annotations" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Mockito vs Spring test annotations</h5>
- **`@Mock`** (Mockito): a bare mock, no Spring context involved — for pure unit tests
- **`@MockitoBean`** (Spring Framework, `spring-test`): replaces a bean inside the loaded Spring context with a mock — for slice/integration tests. Supersedes Spring Boot's own `@MockBean`, deprecated in Boot 3.4 and removed in Boot 4.0
- **`when(...).thenReturn(...)`** stubs behavior; **`verify(...)`** asserts an interaction happened

<h5 id="common-assertions" style="font-size:16px;font-weight:600;margin:18px 0 7px;">Common assertions</h5>
```java
assertEquals(expected, actual);
assertTrue(condition);
assertThrows(IllegalArgumentException.class, () -> service.call(badInput));
```

<h4 id="integration-testing" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🧪 Integration Testing</h4>
Tests several components together, often with real infrastructure.
- **`@SpringBootTest`**: boots the full context — heaviest, most realistic
- **Slices**: `@WebMvcTest` (controller layer + MockMvc), `@DataJpaTest` (repository layer + embedded database)
- **Testcontainers**: spins up a real database/Kafka in Docker for tests — production-like, a strong senior signal
- **Selenium**: drives a real browser for end-to-end web testing

<h4 id="performance-testing" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🧪 Performance Testing</h4>
- **JMeter**: load and stress testing — simulate many concurrent users, measure throughput and latency
- **curl / scripts**: quick command-line smoke checks of an endpoint

---

<h2 id="data-formats" style="font-size:33px;font-weight:800;margin:30px 0 12px;">📄 Data Formats</h2>

> 💻 Code: [TestSerialization — Java binary serialization](../src/main/java/algorithm/implementation/files/TestSerialization.java)

How services serialize the data they exchange — the choice drives payload size, speed and schema safety:

- **JSON (JavaScript Object Notation)**: Human-readable text; the default for REST APIs. Verbose, and carries no schema by default (JSON Schema is optional)
- **Binary (raw)**: Compact and fast, but opaque; both sides must agree on the exact byte layout out of band
- **Avro**: Binary format whose schema travels with the data or lives in a schema registry; supports schema evolution — the standard pairing with Kafka
- **Protocol Buffers**: Binary format with a compiled `.proto` contract and generated classes; the serialization behind gRPC

---

<h1 id="-devops" style="font-size:42px;font-weight:800;margin:34px 0 14px;">🔧 DevOps</h1>

<h2 id="features-2" style="font-size:33px;font-weight:800;margin:30px 0 12px;">✨ Features</h2>
- **Automation**
- **CI/CD**
- **Monitoring**
- **Collaboration**
- **Infrastructure as Code**

---

<h2 id="sdlc" style="font-size:33px;font-weight:800;margin:30px 0 12px;">🔄 SDLC</h2>
- **Requirement gathering**: Interact with the user to understand what the software should do, features
- **Analysis**: Analyse the requirements and understand how to build the software, roadmap for development
- **Design**: Design the architecture of the software, components, interactions, technologies, ui
- **Coding**: Write the code
- **Testing**: Test the software functionality to ensure it meets the requirements and is free of bugs
- **Deployment**: Deploy the software to a production environment
- **Maintenance**: Ongoing support and maintenance of the software, improvements, bug fixes

<h3 id="secure-sdlc" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🔒 Secure Software Development Life Cycle</h3>
Security built into every stage of the life cycle above, instead of a review bolted on right before release:
- **Static Application Security Testing (SAST)**: automated source-code scanning wired directly into the Continuous Integration pipeline, so a vulnerable pattern (injection, hard-coded credential) fails the build instead of reaching production
- **Secrets management**: credentials, API keys, and connection strings live in a dedicated secrets store (never committed in code or plain configuration files) and are injected into the running process at deploy time
- **Least privilege by design**: every component, service account, and pipeline step gets exactly the access it needs to do its job — no more — decided at design time rather than granted broadly and trimmed later

---

<h2 id="cicd-pipeline" style="font-size:33px;font-weight:800;margin:30px 0 12px;">🔄 Continuous Integration / Continuous Delivery Pipeline</h2>
Continuous Integration (CI) automates verifying that each code change does not break what already works — build plus automated tests on every change. Continuous Delivery/Deployment (CD) automates carrying that verified change all the way to production. Together they exist to shrink the gap between "the code changed" and "the change is validated and available," removing manual, error-prone steps from that path.
- **Minimal pipeline shape**: build → automated tests → static analysis (SAST) → package/image → deploy
- **Identifying and removing bottlenecks**: parallelize independent test suites instead of running them serially; cache dependency downloads and build layers between runs (see [Docker layers and caching](#docker-for-java-applications)) so an unrelated change does not re-download the world; split a slow end-to-end suite out of the fast feedback loop and run it less frequently

---

<h2 id="docker" style="font-size:33px;font-weight:800;margin:30px 0 12px;">🐳 Docker</h2>

**Docker:** a platform for packaging an application together with everything it needs to run — its code, its runtime, its system libraries, its configuration — into one self-contained unit that behaves identically wherever it's executed. It exists to solve a problem that's deceptively simple to state: software that runs correctly on a developer's machine routinely breaks when it moves to a colleague's machine, a test server, or production, because of different library versions, different operating system configuration, or some dependency installed months ago and forgotten. Docker's architecture rests on a small set of pieces built on top of each other: a **Dockerfile** is a build recipe, compiled into an **image** — a read-only, layered template — and a **container** is one running instance of that image, isolated from the host and from other containers by Linux kernel mechanisms covered in depth further below. Understanding Docker starts with understanding image and container individually before seeing how they relate.

**Image:** a read-only template — a snapshot of a filesystem plus metadata describing what should run and how — built once from a recipe called a Dockerfile (covered just below). **Container:** a running instance of that image, the same relationship a class has to an object in ordinary programming, where the image is the blueprint and the container is one live instantiation of it. Multiple containers can be started from the same image simultaneously, each running independently, each unaware of the others, in exactly the way several objects can be instantiated from one class without interfering with each other.

```
IMAGE (read-only template)          CONTAINER (running instance)
┌─────────────────────┐             ┌─────────────────────┐
│  layer: app code     │   docker    │  layer: app code     │
│  layer: dependencies │   run  ──>  │  layer: dependencies │
│  layer: base OS      │             │  layer: base OS      │
└─────────────────────┘             │  + writable layer     │  <- only this changes at runtime
                                     └─────────────────────┘
```

<h3 id="images" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🖼️ Images</h3>
Working with images day to day comes down to a handful of commands: `docker image build` compiles a Dockerfile into a new image, `docker image ls` shows what's already been built or pulled locally, `docker image pull name:version` fetches one from a registry without building it, `docker image inspect name` shows its full metadata (layers, configuration, environment), and `docker image rm` deletes one that's no longer needed.

<h3 id="containers" style="font-size:26px;font-weight:700;margin:26px 0 10px;">📦 Containers</h3>
The corresponding commands for the running instances built from those images: `docker container run` starts a new container from an image, `docker container stop id` gracefully stops a running one, and `docker container rm` removes a stopped container's remains from disk.

<h3 id="dockerfile" style="font-size:26px;font-weight:700;margin:26px 0 10px;">📋 Dockerfile</h3>
An image doesn't appear out of nowhere — it's built from a **Dockerfile**, a text recipe of instructions that the Docker daemon executes in order, top to bottom, to produce that image. Each instruction commits a new, cached **layer** on top of the previous one, which is *how* the build actually works mechanically, and which is also *why* layer ordering matters — a topic covered in full once Docker for Java Applications, just below, gets into build performance:

```dockerfile
FROM alpine
RUN apk add --no-cache nodejs npm
COPY resources /src
WORKDIR /src
RUN npm install
EXPOSE 8080
ENTRYPOINT ["node","./app.js"]
```
- **`FROM`**: the base layer everything else builds on top of
- **`RUN`**: executes a shell command at *build* time and commits its filesystem changes as a new layer (installing packages, compiling)
- **`COPY`**: adds files from the build context into the image
- **`WORKDIR`**: sets the working directory for subsequent instructions, creating it if needed
- **`EXPOSE`**: documentation only — declares which port the container listens on, does not itself publish it (`-p` at `docker run` time does that)
- **`ENTRYPOINT`**: the command that actually runs when a *container* starts from this image

<h3 id="docker-for-java-applications" style="font-size:26px;font-weight:700;margin:26px 0 10px;">☕ Docker for Java Applications</h3>
Because every Dockerfile instruction becomes its own cached layer, and Docker only rebuilds a layer (and everything after it) when something in that layer actually changes, the *order* instructions appear in a Dockerfile has a direct, measurable effect on how fast repeated builds run. The practical rule that follows: order instructions from least to most frequently changing, so a rebuild triggered by an application code change doesn't also force Docker to redo the expensive, rarely-changing steps — installing dependencies, for instance — that appear earlier in the file.

For a Java application specifically, that principle motivates **multi-stage builds**: building with the full Java Development Kit in a first stage (needed only to compile), then shipping just the Java Runtime Environment plus the compiled application in a second, final stage — the compiler and build tooling never make it into the image that actually ships. Spring Boot adds one more refinement on top of this: its **layered jars** feature splits a built application into separate layers itself — dependencies in one layer, the application's own code in another — so a rebuild triggered by an ordinary code change only invalidates the small, fast-changing application layer, leaving the much larger dependencies layer cached from the previous build. Running the resulting container as a non-root user is a security practice detailed further below, once container security has been introduced on its own terms.

**Implementation example** — a multi-stage build for a Spring Boot application, putting the practices above into effect:
```dockerfile
# Stage 1: build with the full JDK, produce a layered jar
FROM eclipse-temurin:21-jdk AS build
WORKDIR /app
COPY pom.xml .
COPY .mvn .mvn
COPY mvnw .
RUN ./mvnw dependency:go-offline          # cached unless pom.xml changes
COPY src src
RUN ./mvnw package -DskipTests
RUN java -Djarmode=layertools -jar target/*.jar extract --destination extracted

# Stage 2: ship only the JRE plus the extracted layers, least- to most-frequently-changing
FROM eclipse-temurin:21-jre
WORKDIR /app
RUN useradd --system --uid 1001 appuser
COPY --from=build /app/extracted/dependencies/ ./
COPY --from=build /app/extracted/spring-boot-loader/ ./
COPY --from=build /app/extracted/snapshot-dependencies/ ./
COPY --from=build /app/extracted/application/ ./     # your own code — changes most often, so copied last
USER appuser
EXPOSE 8080
ENTRYPOINT ["java", "org.springframework.boot.loader.launch.JarLauncher"]
```
Only the final `FROM eclipse-temurin:21-jre` stage and everything under it ships in the resulting image — the JDK, Maven, and source tree from stage 1 never leave the build machine, which is *how* multi-stage builds shrink the final image without a separate manual cleanup step.

<h3 id="docker-networking" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🌐 Networking</h3>
A container isolated from the network entirely would be useless for almost anything beyond a one-off batch job — a web application needs to accept incoming connections, and a service that talks to a database needs to reach it. Docker offers several distinct networking modes, and choosing between them is really a question of how much isolation a given container needs versus how directly it needs to reach, or be reached by, the outside world. The **bridge** network is the default: containers get their own private internal network and reach the outside world through Network Address Translation, and a container's own ports become reachable from outside only when explicitly published (`-p 8080:80` maps a host port to a container port). The **host** network takes the opposite extreme, giving a container the host's own network namespace directly — no NAT, the lowest possible latency, but no port isolation either, so two containers can never both bind port 80 at once under this mode. **none** removes networking entirely, appropriate for an isolated batch job with no network needs at all. And **overlay** networks extend a virtual network across multiple Docker hosts, used by Docker Swarm (and conceptually similar to what a Kubernetes cluster network, covered later, provides) so containers running on entirely different machines can still address each other by name.

That last phrase — "address each other by name" — depends on one more distinction worth knowing precisely: **user-defined bridge networks** give containers automatic Domain Name System resolution by container or service name, while the *default* bridge network Docker creates automatically does not. This is why two containers on the default bridge can typically reach each other only by IP address, while two containers explicitly placed on a user-defined network can reach each other by name — a difference that matters the moment an application's configuration needs to reference another container by a stable name rather than an IP that might change.

**Implementation example** — two containers reaching each other by name, which only works because they share a *user-defined* network:
```bash
docker network create app-net
docker run -d --name db --network app-net postgres:16
docker run -d --name app --network app-net -p 8080:8080 my-app:latest
# from inside "app", the hostname "db" now resolves to the db container's IP —
# the datasource URL can simply be jdbc:postgresql://db:5432/mydb
```

<h3 id="volumes--bind-mounts" style="font-size:26px;font-weight:700;margin:26px 0 10px;">💾 Volumes vs Bind Mounts</h3>
The diagram introduced at the top of this section showed a container adding one writable layer on top of an image's read-only layers — and that detail has a consequence worth confronting directly: anything written to that writable layer disappears the moment the container is removed, since it was never part of the image to begin with. A database storing its data purely in that writable layer would lose everything on every restart, which is obviously unacceptable — so Docker provides three distinct ways to persist data outside a container's own disposable lifecycle, each suited to a different situation. **Volumes**, created and managed entirely by Docker (`docker volume create`), live outside any container's writable layer and are the generally recommended way to persist real data — a database's files, user uploads — beyond any single container's lifetime; they're even portable across hosts when a volume driver supports it. **Bind mounts** instead map an exact path on the host's own filesystem directly into a container (`-v /host/path:/container/path`) — invaluable for local development, where editing source code on the host should be visible inside a running container immediately, but this convenience comes at the cost of tying the container to that specific host's directory layout, breaking the portability a properly containerized application otherwise has. **tmpfs mounts** are the third option, existing purely in memory and never touching disk at all — appropriate for secrets or scratch data that genuinely must never persist anywhere.

One more file, `.dockerignore`, is worth understanding here even though it isn't itself a storage mechanism: it excludes files — `.git`, `node_modules`, build output, secrets — from the build context sent to the Docker daemon when an image is built, producing smaller, faster, and more secure builds, and specifically preventing a secret from being accidentally baked permanently into an image layer.

**Implementation example** — a named volume outliving the container that wrote it, versus a bind mount for local development:
```bash
docker volume create pgdata
docker run -d --name db -v pgdata:/var/lib/postgresql/data postgres:16
docker rm -f db                              # container is gone...
docker run -d --name db2 -v pgdata:/var/lib/postgresql/data postgres:16
# ...but db2 sees exactly the same data, because the volume outlives any single container

docker run -v "$(pwd)/src:/app/src" -p 8080:8080 my-app:dev   # bind mount: host edits are visible inside the running container immediately
```

<h3 id="docker-compose" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🎼 Docker Compose</h3>
Every concept covered so far in this section — images, networking, volumes — is something a single `docker run` command can only configure one container at a time. A realistic application, though, is rarely just one container: a Spring Boot service plus the PostgreSQL database it talks to is already two, each needing its own image, its own network, and in the database's case, its own volume for persistence — and typing out a growing sequence of `docker run` flags for each one by hand becomes unmanageable fast. **Docker Compose** solves exactly this by letting all of it be declared once, in a single `docker-compose.yml` file: every service's image or build context, its networks, its volumes, and the order services should start in.
```yaml
services:
  app:
    build: .
    ports: ["8080:8080"]
    depends_on: [db]
    environment:
      SPRING_DATASOURCE_URL: jdbc:postgresql://db:5432/mydb
  db:
    image: postgres:16
    volumes: ["pgdata:/var/lib/postgresql/data"]
volumes:
  pgdata:
```
- **`depends_on`** controls start order only, not readiness — the dependent service can still start before the database is actually accepting connections, so application-level retry/backoff on the datasource connection is still necessary
- Common commands: `docker compose up -d`, `docker compose logs -f`, `docker compose down -v` (the `-v` also removes named volumes)

<h3 id="build-optimization--image-security" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🔒 Build Optimization &amp; Image Security</h3>
Everything covered above assumes a working, correctly-networked, persistent container — but making that container fast to build and safe to run in production raises a separate set of concerns, and it's worth walking through why each one matters rather than treating them as an unrelated checklist. A container with no resource ceiling can, by a bug or a runaway process, consume the entire host's memory or processor time and starve everything else sharing that host — `docker run --memory=512m --cpus=1.5` caps what a single container can consume, the same guarantee Kubernetes requests/limits provide at the pod level (covered later), useful even outside a cluster for catching a runaway process early. Beyond resource limits, Docker also needs a way to know whether a container is actually *working*, not merely running — a process can be alive as an operating-system process while its application logic has deadlocked or lost its database connection. The `HEALTHCHECK` Dockerfile instruction (`HEALTHCHECK CMD curl -f http://localhost:8080/actuator/health || exit 1`) closes that gap, letting Docker itself mark a container `unhealthy` when the check fails — `docker ps` surfaces that status directly, and orchestrators built on top of Docker can restart unhealthy containers automatically rather than leaving a silently broken one running.

Security follows a similar logic of closing specific, real gaps rather than following abstract best practice for its own sake. Running a container's process as an unprivileged user (`USER appuser` in the Dockerfile, or the equivalent `runAsNonRoot` in a Kubernetes pod's security context) limits the blast radius if that container is ever compromised, since a container-breakout exploit inherits whatever privileges the process inside the container was actually running with — root inside the container escaping to root on the host is a fundamentally worse outcome than an unprivileged user escaping to an unprivileged user. Minimal or **distroless** base images (`gcr.io/distroless/java`, or an Alpine-based image) push this further by shipping without a shell, package manager, or any unrelated operating system tooling at all — a smaller attack surface than a full Ubuntu or Debian base, and smaller images as a direct side effect. And before an image ever reaches production, **scanning** it — `docker scan`, Trivy, or Grype — checks every one of its layers against known Common Vulnerabilities and Exposures databases, a standard Continuous Integration/Continuous Delivery gate applied before pushing to a registry.

One more optimization is worth understanding on its own terms, since it solves a build-speed problem distinct from all of the above: **BuildKit cache mounts** (`RUN --mount=type=cache,target=/root/.m2 mvn package`) persist a dependency cache — Maven's or Gradle's — *between* builds, without ever baking that cache into the resulting image layer itself. Dependencies download once and are reused on every subsequent build, meaningfully speeding up Continuous Integration build times while keeping the final shipped image exactly as small as it would be without the cache mount at all.

**Implementation example** — the practices above combined into one build stage:
```dockerfile
# syntax=docker/dockerfile:1
FROM eclipse-temurin:21-jre
RUN --mount=type=cache,target=/var/cache/apt apt-get update      # cached across builds, not baked into the image
RUN useradd --system --uid 1001 appuser
WORKDIR /app
COPY target/app.jar .
USER appuser
EXPOSE 8080
HEALTHCHECK --interval=30s --timeout=3s CMD curl -f http://localhost:8080/actuator/health || exit 1
ENTRYPOINT ["java", "-jar", "app.jar"]
```
`docker ps` now shows this container's status as `healthy`/`unhealthy` once the interval elapses, and it runs as `appuser` (uid 1001) rather than root — check both with `docker inspect --format='{{.State.Health.Status}}' <container>` and `docker exec <container> whoami`.

<h3 id="docker-engine-architecture" style="font-size:26px;font-weight:700;margin:26px 0 10px;">⚙️ Engine Architecture</h3>
Every command covered so far — `docker run`, `docker build`, `docker network create` — is issued to something called "Docker," as if it were one monolithic program. It isn't: the Docker Engine is actually four cooperating components, each with a narrow job, and understanding how a single `docker run` command threads through all four is what explains a behavior that otherwise looks mysterious — restarting the Docker daemon no longer kills any running containers.

**`dockerd`**, the daemon, is the component a user's commands actually talk to: it exposes the REST API, and still owns image management, builds, authentication, and core networking — but, critically, it contains no container *execution* code of its own at all. That job belongs to **`containerd`**, a container supervisor whose only responsibility is lifecycle operations — starting, stopping, pausing, destroying — and which was donated to the Cloud Native Computing Foundation as an independent project; Kubernetes' own kubelet, covered later, talks to `containerd` directly too, through the same Container Runtime Interface contract. `containerd` doesn't create containers itself, though — it delegates that to **`runc`**, the reference implementation of the Open Container Initiative's container-runtime specification: a small, fast command-line tool wrapping `libcontainer` whose entire job is to create one container and then immediately exit. That word "exit" raises an obvious question — if `runc` exits the moment a container starts, what keeps that container running and supervised? The answer is **`containerd-shim`**, which becomes the container's parent process the instant `runc` exits, keeping its input/output pipes open and reporting its exit status back to `dockerd` — this handoff is exactly what decouples a running container from `dockerd`'s own lifecycle, the property sometimes called "daemonless containers." Tying the whole chain together is the **Open Container Initiative (OCI)**, a vendor-neutral pair of specifications — an image spec and a container-runtime spec, both stable at version 1.0 since July 2017 — that every one of these components implements: `containerd` converts a Docker image into an OCI-compliant bundle before it's ever handed to `runc`, which is what lets `runc` itself stay generic rather than Docker-specific.

**Implementation example** — the request path from CLI to running process, and why upgrading `dockerd` no longer kills containers:
```bash
docker container run --name web -d nginx:alpine
# 1. Docker client -> REST API call -> dockerd
# 2. dockerd -> gRPC (CRUD-style) -> containerd
# 3. containerd converts the nginx:alpine image to an OCI bundle, forks a new runc instance
# 4. runc talks to the kernel to build namespaces + cgroups, starts the container process, then EXITS
# 5. containerd-shim adopts the running process as its parent and persists for the container's lifetime
ps -ef | grep -E 'containerd-shim|runc'   # runc is gone; only the lightweight shim remains per running container
```
Because only the shim persists (not `runc`), a host can run hundreds of containers without hundreds of lingering runtime processes — and `systemctl restart docker` no longer kills any of them, since none of them are children of `dockerd`.

<h3 id="image-internals" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🧬 Image Internals</h3>
The Dockerfile section earlier described an image as a stack of layers, but left open exactly how Docker identifies and tracks those layers — a question worth answering precisely, because the answer explains two behaviors that otherwise look like unrelated conveniences: why `docker pull` so often skips re-downloading most of an image, and why pinning an image by digest is meaningfully safer than pinning it by tag. The key idea is that Docker's layers are **content-addressable**: a layer's own ID is a cryptographic hash of its actual content, and the image ID is likewise a hash of its config object — never a randomly assigned identifier the way a database's auto-increment primary key would be. This has two direct consequences. First, it makes tampering evident: changing even one byte anywhere in a layer changes its hash entirely, so a layer's identity and its content can never silently drift apart. Second, it enables deduplication: two images that happen to share an identical layer — a common base image, say — will hash that shared layer identically, meaning it only ever needs to be stored, and downloaded, once.

That second consequence is exactly what makes `docker pull` fast for an image sharing layers with something already present locally: the client first resolves the image's **manifest** — metadata listing which content-addressed layers, by digest, actually make up the image — and then checks each listed digest against the local blob store before fetching anything; digests already present are simply skipped, which is why `docker pull` output so often prints `Already exists` for most of an image's layers. A **fat manifest** extends this same idea to multi-platform images, additionally listing which per-architecture manifest to use for a given tag — `linux/amd64` versus `linux/arm64` pulled from the exact same tag, resolved automatically based on the pulling machine's own architecture.

One more subtlety is worth knowing precisely: a layer actually carries *two* separate hashes, not one. A **content hash** identifies the uncompressed layer itself — this is the stable identity used for deduplication — while a separate **distribution hash** covers the compressed form the layer takes during network transfer, since compression changes the underlying bytes and a corrupted transfer needs its own independent check. This distinction is exactly what makes pulling by content digest (`image@sha256:...`) a stronger guarantee than pulling by tag: a tag like `debian:bookworm` is a mutable pointer that can be repointed to different content later, while a digest pins the exact content itself, regardless of what any tag currently points to.

**Implementation example** — pinning a base image by content digest instead of a movable tag, so a rebuild can never silently pick up different content:
```dockerfile
# docker pull debian:bookworm  ->  Digest: sha256:d5e87cfcb730...
FROM debian@sha256:d5e87cfcb730...   # pinned to exact content, unlike FROM debian:bookworm (a movable pointer)
```
`docker image ls --digests <repo>` shows the digest alongside the tag; every subsequent build from this Dockerfile uses byte-identical base content even if `bookworm` is later repointed upstream.

<h3 id="containers-at-the-kernel-level" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🐧 Containers at the Kernel Level</h3>
It's tempting to picture a container as a lightweight virtual machine, but that mental model is wrong in a way that matters: a container is a regular Linux process, made to *look* isolated by two entirely independent kernel mechanisms doing two different jobs. Seeing each one defined on its own first is what makes the distinction between them click, because it's a common point of confusion.

**Namespaces** answer the question of what a process can *see*. Docker composes six of them per container: **pid** gives a container its own process tree with its own PID 1, unable to see any process belonging to the host or to other containers; **net** gives it its own network stack entirely — interfaces, IP addresses, port ranges, routing table — which is why every container gets its own `eth0`; **mnt** gives it a private root filesystem, so `/etc`, `/var`, and `/dev` inside the container are not the host's; **ipc** gives it its own shared-memory segments, semaphores, and message queues; **uts** gives it its own hostname; and **user**, optionally, maps the container's root user to an unprivileged user on the host.

**Control groups (cgroups)**, by contrast, answer a completely different question: not what a process can see, but how *much* of the host's resources it's allowed to consume — processor time, memory, and disk Input/Output, capped so that one container can never starve every other container sharing the same underlying kernel.

Seeing both defined separately makes the relationship between them, and why Docker needs both rather than either alone, much clearer: namespaces provide zero resource protection on their own — a namespaced process with no cgroup applied can still exhaust the entire host's memory — and they provide zero privilege restriction either, since a root process inside a namespace is still root as far as the kernel itself is concerned, unless the capabilities and seccomp mechanisms covered further below also constrain it. Isolation and resource limiting are two separate mechanisms Docker composes together, not one unified "container" primitive — and in fact, there is no such primitive in the kernel at all. A container is, mechanically, this specific organized collection of namespaces plus a cgroup applied to one ordinary process.

**Implementation example** — observing that a container's isolation is just namespaces, from the host's own process table:
```bash
docker run -d --name web nginx:alpine
docker inspect --format '{{.State.Pid}}' web        # the container's PID 1, as seen from the HOST's own pid namespace
ls -la /proc/<that-pid>/ns/                          # pid, net, mnt, ipc, uts (+ user if enabled) — one file per namespace
cat /sys/fs/cgroup/.../docker-<id>.scope/memory.max  # the cgroup enforcing this container's memory ceiling
```
The same host-visible process shows up as PID 1 *inside* the container's own pid namespace (`docker exec web ps` shows it as PID 1) — same process, two different namespace views.

<h3 id="union-overlay-filesystem" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🗂️ Union / Overlay Filesystem</h3>
Both the layered-image diagram at the top of this section and the Volumes-vs-Bind-Mounts discussion referred to a container's "writable layer" without yet explaining what actually merges an image's stacked layers into the single, coherent filesystem a running process sees. That's the job of a **union filesystem driver** — on modern Linux, specifically the `overlay2` storage driver — which takes an image's stack of independent, read-only layers and presents them as one unified view. A running container adds exactly one more layer on top of that stack: its own **writable layer**, the only layer that can ever actually change once the container starts running.

Because several layers can each contain a file at the same path, reading a file requires a defined resolution order: Docker resolves top-down, checking the writable layer first, then each read-only layer beneath it in order, and returns the first match it finds. Writing is where this design gets genuinely clever, through a technique called **copy-on-write**: modifying a file that currently lives in a lower, read-only layer doesn't edit it in place — that's impossible, since read-only layers can never be edited at all — instead, the *entire file* is copied up into the writable layer first, and the modification is applied there. This is exactly why changing even one byte of a large file baked into a lower layer is comparatively expensive, and why a frequently-modified large file should never be placed deep in an image's layer stack. Deleting a file follows the same logic: since a lower layer can't be edited, a deletion is instead recorded as a **whiteout** — a special marker written into the writable layer that hides the file from every layer beneath it, even though the file's bytes are still physically sitting untouched in that lower layer.

`docker diff` makes all of this directly observable: it reports `A` for a file added (new in the writable layer), `C` for one changed (the copy-on-write path just described, which also marks the containing parent directory as changed), and `D` for one deleted (a whiteout).

**Implementation example** — watching copy-on-write and whiteouts happen via `docker diff`:
```bash
docker run --name mod nginx:alpine sh -c "touch /new-file && rm /etc/nginx/nginx.conf"
docker diff mod
# A /new-file                 <- new in the writable layer
# C /etc                      <- parent directory marked changed
# D /etc/nginx/nginx.conf     <- whiteout; the file still exists, untouched, in the read-only layer beneath
```
`docker commit` saves exactly this writable top layer as a new immutable layer, content-addressed like any other — the mechanical basis for every `docker build` step.

<h3 id="container-security-internals" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🛡️ Container Security Internals</h3>
Running a container as a non-root user, covered earlier, closes one specific gap — but it isn't the only layer Docker relies on, and understanding the others starts from a fact worth stating plainly: the traditional Unix "root" account isn't really one privilege, it's a bundle of roughly forty entirely separate ones, and treating it as all-or-nothing is far coarser than modern security actually needs. **Capabilities** are Linux's answer to that coarseness — named privileges like `CAP_NET_BIND_SERVICE` or `CAP_SYS_ADMIN`, each grantable or revocable independently of the others. Docker **drops a fixed set of these by default** on every new container: `SYS_MODULE` (loading kernel modules), `SYS_ADMIN` (a broad administrative catch-all), `NET_ADMIN` (reconfiguring networking), `SYS_TIME` (changing the system clock), and `MAC_ADMIN`/`MAC_OVERRIDE` (bypassing Mandatory Access Control, introduced just below), among others — meaning a container can run *as* root internally while genuinely lacking most of what root would mean on the host itself. `--cap-drop`/`--cap-add` let this default set be tuned further in either direction, and a capability that's been dropped can never be silently re-added without an explicit `--cap-add`.

Capabilities alone don't cover everything, though — they answer "is this category of action permitted at all," not "which exact system calls can this process make." That's **seccomp**'s job: a kernel-level filter restricting which system calls a container's processes are allowed to invoke, entirely independent of capabilities. The two mechanisms really are separate: a process can hold a capability and still be blocked from making the corresponding system call if the active seccomp profile doesn't permit it. Docker applies a default seccomp profile to every container automatically; it can be customized, or — not recommended — disabled entirely per container.

A third, independent layer sits alongside both of these: **Mandatory Access Control (MAC)**, where Docker applies a default AppArmor profile (or SELinux, on distributions that use it instead), governing what a process can do according to policy rules that exist entirely apart from both capabilities and seccomp. And one further layer addresses a different threat model altogether — not what a *container* can do, but what happens if the Docker *daemon itself* is compromised. **Rootless mode** runs `dockerd` as an unprivileged host user rather than as root, so that even a full daemon compromise doesn't hand an attacker host-level root — a defense-in-depth measure distinct from, and complementary to, running individual containers as non-root.

**Implementation example** — verifying the default capability drop actually removes a specific privilege:
```bash
docker run --rm ubuntu:latest sh -c "apt-get update -qq && apt-get install -y -qq libcap2-bin >/dev/null; capsh --print | grep cap_sys_admin"
# cap_sys_admin is absent from the default set — confirms it was dropped, not merely unused
docker run --rm --cap-add sys_admin ubuntu:latest sh -c "apt-get update -qq && apt-get install -y -qq libcap2-bin >/dev/null; capsh --print | grep cap_sys_admin"
# now present — explicitly re-added, opt-in only
```

<h3 id="bridge-networking-internals" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🔌 Bridge Networking Internals</h3>
The Networking section earlier described the bridge network in terms of what it does for a container; this section explains the actual Linux mechanics that make it work, tying directly back to the **net** namespace introduced under Containers at the Kernel Level. For each container, Docker creates a **virtual Ethernet (veth) pair** — two ends of one virtual cable — where one end becomes the container's own `eth0` inside its private net namespace, and the other end stays in the host's namespace, attached to a Linux bridge Docker manages called `docker0`. Every bridged container's host-side veth end shares that same `docker0` bridge, which is exactly why bridged containers can reach each other directly: from the network's point of view, they're all sitting on the same virtual subnet.

It's worth being precise about what a net namespace does and doesn't provide here, because it's a common source of confusion: the namespace only gives a container its own private network stack — it does not, by itself, block any traffic at all. What actually allows or denies traffic in and out is the host's `iptables`/netfilter rules, which Docker programs automatically as containers start and stop; isolation, in other words, is a firewall concern layered on top of the namespace, not something the namespace provides on its own.

That same `iptables` machinery is also what makes port publishing actually work, and it's worth walking through mechanically rather than treating `-p` as a black box: a bridged container has no route from the host's external network interface by default, so `docker run -p 8080:80` makes the daemon insert a **DNAT (destination network address translation)** rule into the host's `iptables` `nat` table, rewriting any packet arriving on host port 8080 so it's redirected to the container's private IP on port 80. That rewrite rule *is* the literal mechanism behind "publishing" a port — not a label Docker applies, but a concrete firewall rule doing the actual work.

Finally, tying back to the Networking section's earlier claim that only user-defined bridge networks support connecting containers by name: a user-defined bridge network runs an embedded DNS resolver, reachable at `127.0.0.11` inside every container attached to it, which Docker keeps continuously updated as containers join or leave the network — resolving a container or service name to whatever its current private IP happens to be. The *default* bridge network simply has no such resolver running at all, which is the concrete mechanical reason behind the name-resolution difference noted earlier.

**Implementation example** — inspecting the actual `iptables` DNAT rule a published port creates (Linux hosts; requires root):
```bash
docker run -d --name web -p 8080:80 nginx:alpine
sudo iptables -t nat -L DOCKER -n
# DNAT  tcp -- 0.0.0.0/0  0.0.0.0/0  tcp dpt:8080 to:172.17.0.2:80
# ^ the literal rule Docker inserted: traffic to host:8080 gets rewritten to the container's private IP:80
```

---

<h2 id="kubernetes" style="font-size:33px;font-weight:800;margin:30px 0 12px;">☸️ Kubernetes</h2>

Docker, covered in the previous section, solves the problem of packaging and running one container reliably on one machine. A real production system, though, is never one container on one machine — it's many containers, spread across many machines, that need to survive a machine dying, get more copies of themselves started when load increases, find each other over the network without hardcoded addresses, and receive new versions without an outage. Handling all of that by hand — deciding which machine runs which container, restarting whatever crashes, rewiring network configuration every time something moves — becomes unmanageable almost immediately past a handful of containers. **Kubernetes:** a system built specifically to take over that decision-making — an orchestrator, meaning it continuously watches a cluster of machines and the containers that should be running on them, and takes whatever action is needed to keep reality matching what was declared, without a human manually intervening for every individual failure or scaling event. Its architecture splits cleanly into two halves, covered in depth further below: a **control plane** that makes decisions about the cluster, and **worker nodes** that actually run the containers those decisions describe — coordinated through building blocks (Deployment, Pod, Service) defined next.

<h3 id="structure" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🏗️ Structure</h3>
Kubernetes achieves that through a small set of building blocks, each wrapping the one below it, and it's worth defining each one on its own terms before seeing how they nest together:

```
Deployment
  └─ manages replicas of a →  Pod
                                 └─ wraps one or more →  Container(s)
```

**Pod:** Kubernetes' smallest deployable unit — not a single container, but one or more containers that share the same network namespace and storage, and are always scheduled onto the same machine together, started and stopped as one unit. **Deployment:** sits one level above that — it manages some number of identical Pod replicas, and takes on the ongoing work of keeping that many healthy replicas running, including rolling out new versions and rolling back a bad one. The next two sections build outward from these two pieces — Deployment further, in how it actually performs a rollout, and Pod outward, in how something else on the network actually finds and reaches one.

<h3 id="core-objects-from-the-smallest-unit-to-the-entry-point" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🔵 Core Objects (from the smallest unit to the entry point)</h3>
A Deployment's job of managing replicas becomes concrete during a rollout — the moment a new version needs to replace an old one without simply stopping every old Pod and starting every new one at once, which would mean an outage for however long the switch takes. Kubernetes controls exactly how gradual that transition is through two settings: `maxSurge` caps how many extra Pods can be created *above* the desired replica count while the rollout is in progress, and `maxUnavailable` caps how many Pods are allowed to be offline at any one moment. Together they tune a direct trade-off between rollout speed and safety margin — `maxSurge=1, maxUnavailable=0` is the conservative default, meaning the replica count is never allowed to drop below what was desired, at the cost of briefly running one extra Pod while the new version comes up.

None of this matters to anything trying to actually *reach* a Pod, though, because Pods are deliberately ephemeral — a Deployment can replace one with a freshly created replica at any time, and that replacement gets a new internal IP address every time. Something needs to provide a stable address in front of that churn. **Service:** a stable network identity that always routes to whichever Pods are currently healthy, regardless of how many times they've been individually replaced underneath it. A Service comes in three variants depending on who needs to reach it: **ClusterIP** is reachable only from inside the cluster, **NodePort** additionally opens a specific port on every node in the cluster, and **LoadBalancer** provisions an external, cloud-provider load balancer in front of it, reachable from outside the cluster entirely.

A Service alone still only understands raw network connections, though, not the structure of an actual web request — routing based on hostname or Uniform Resource Locator path requires one more layer on top. **Ingress:** a set of HTTP routing rules (host- and path-based) that point at Services rather than at Pods directly. Critically, an Ingress object by itself does nothing at all — it's inert configuration until an **Ingress controller** (NGINX Ingress, Traefik, or a cloud provider's own) is actually running in the cluster, watching for Ingress objects and configuring a real load balancer or reverse proxy to match. This is precisely what distinguishes Ingress from a Service: a Service only ever understands raw ports and connections, while Ingress understands genuinely HTTP-level concepts like host/path routing and Transport Layer Security termination.

**Implementation example** — a Deployment (3 stateless replicas of one image) fronted by a ClusterIP Service, which is *how* the objects above compose into a running, reachable application:
```yaml
apiVersion: apps/v1
kind: Deployment
metadata:
  name: order-service
spec:
  replicas: 3
  selector:
    matchLabels: { app: order-service }        # Service below finds pods via this same label
  strategy:
    rollingUpdate: { maxSurge: 1, maxUnavailable: 0 }
  template:
    metadata:
      labels: { app: order-service }
    spec:
      containers:
        - name: order-service
          image: my-registry/order-service:1.4.2
          ports:
            - containerPort: 8080
---
apiVersion: v1
kind: Service
metadata:
  name: order-service
spec:
  selector: { app: order-service }              # routes to any pod carrying this label — not to a fixed IP
  ports:
    - port: 80
      targetPort: 8080
```
`kubectl apply -f order-service.yaml` creates both; `kubectl get pods -l app=order-service` shows the 3 replicas the Deployment is managing, and any other pod in the cluster can now reach this Service at `http://order-service` (Kubernetes' native Domain Name System resolution, below).

<h3 id="nodes" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🔵 Nodes</h3>
Everything described above — Deployments creating Pods, Services routing to them — has to physically run somewhere, and a Kubernetes cluster is made up of two kinds of machines with sharply different jobs. **Worker node:** the machine a Pod's containers are physically scheduled onto and run on — where actual work happens. **Master node**, collectively called the **control plane**: does no application work at all — its entire job is making decisions *about* the cluster, deciding which worker node a new Pod should run on, whether a Pod has died and needs replacing, what the cluster's current state even is. This split matters because it means the cluster's decision-making logic is centralized and consistent, while the actual application workload can be spread arbitrarily wide across however many worker nodes exist.

<h3 id="components" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🧩 Components</h3>
The control plane's decision-making isn't one monolithic program — it's implemented as several small, cooperating processes. **apiserver:** the one every other piece, including `kubectl` itself, actually talks to — it exposes the interface through which anything communicates with the control plane at all, whether that's a person running a command or another internal component reading cluster state (the full mechanics of this — etcd, the controller manager, the scheduler — are covered in depth further below). **kubelet:** a local agent each worker node runs, actually responsible for making sure the containers the control plane has assigned to that specific node are indeed running there. **kube-proxy:** runs on every node as well, handling the networking side of the picture — it's what actually makes a Service's stable address, introduced above, resolve to a real, currently-healthy Pod (also covered in full mechanical detail further below).

<h3 id="configuration--spring-boot-integration" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🌱 Configuration &amp; Spring Boot Integration</h3>
A container image, once built, is meant to be immutable and identical across every environment it runs in — but ordinary configuration (which database to talk to) and secrets (that database's password) obviously *do* need to differ between environments, and baking either directly into an image would defeat the whole point of building one image and promoting it unchanged from testing through to production. Kubernetes solves this by keeping configuration entirely outside the image. **ConfigMap:** holds non-sensitive configuration. **Secret:** holds sensitive values. Both are exposed to a Pod as environment variables or mounted files at startup — a Spring Boot application reads either one exactly like any other property source, with no Kubernetes-specific code required at all.

Getting configuration right is only half the integration, though — Kubernetes also needs a reliable way to know whether a running Pod is actually healthy, and this connects directly back to Spring Boot's own Actuator health endpoints. Three distinct probes exist because "is this container healthy" is really three separate questions, not one. **Startup probe:** asks "has the process finished starting up yet at all?" and disables the other two probes entirely until it succeeds once — without it, a slow-starting Java application (a large heap warming up, a Spring context still initializing) can trip a liveness probe and get killed and restarted for the crime of simply still booting. **Liveness probe:** once startup succeeds, asks "is the process still alive?", wired to `/actuator/health/liveness` — Kubernetes restarts the Pod if this fails. **Readiness probe:** asks a different question again, "can it currently serve traffic?", wired to `/actuator/health/readiness` — Kubernetes stops routing traffic to the Pod if this fails, without necessarily restarting it, since a temporarily overloaded Pod may recover on its own.

One more piece of Spring integration is worth naming here because it eliminates an entire component some Spring architectures otherwise need: **service discovery is native** to Kubernetes — every Service, as introduced earlier, automatically gets a Domain Name System name (`http://order-service`) resolvable from anywhere in the cluster, which is exactly why a separate service registry like Eureka becomes unnecessary once an application is running on Kubernetes.

**Implementation example** — a ConfigMap and Secret feeding a Spring Boot pod's environment, wired to all three probe types:
```yaml
apiVersion: v1
kind: ConfigMap
metadata: { name: order-service-config }
data:
  SPRING_PROFILES_ACTIVE: "prod"
---
apiVersion: v1
kind: Secret
metadata: { name: order-service-secret }
type: Opaque
stringData:
  DB_PASSWORD: "change-me"                      # Kubernetes stores this base64-encoded, not encrypted, at rest by default
---
# inside the Deployment's pod template (spec.template.spec.containers[0]):
        envFrom:
          - configMapRef: { name: order-service-config }
        env:
          - name: DB_PASSWORD
            valueFrom:
              secretKeyRef: { name: order-service-secret, key: DB_PASSWORD }
        startupProbe:
          httpGet: { path: /actuator/health/liveness, port: 8080 }
          failureThreshold: 30                   # 30 × periodSeconds(default 10s) = 5 min to finish starting
        livenessProbe:
          httpGet: { path: /actuator/health/liveness, port: 8080 }
        readinessProbe:
          httpGet: { path: /actuator/health/readiness, port: 8080 }
```
The startup probe gates the other two: Kubernetes does not even begin evaluating liveness/readiness until the startup probe succeeds once, which is what stops a slow Spring context refresh from being mistaken for a hung process.

<h3 id="resources--the-java-virtual-machine" style="font-size:26px;font-weight:700;margin:26px 0 10px;">☕ Resources &amp; the Java Virtual Machine</h3>
A Kubernetes cluster typically packs many Pods, from many different applications, onto a shared pool of worker nodes — which means one badly behaved Pod, left unconstrained, can starve every other Pod sharing its node of processor time or memory. Kubernetes controls this through two related but distinct settings on every container. **Request:** what the scheduler *guarantees* will be available to a Pod when deciding which node to place it on. **Limit:** a hard ceiling that Pod is never allowed to exceed. The two resources behave differently once a limit is actually hit, and the difference matters in practice: exceeding a memory limit gets a container immediately killed — **OOMKilled**, Out Of Memory — since memory can't be reclaimed gradually, while exceeding a processor limit merely throttles the container, slowing it down rather than terminating it, since processor time can simply be handed out more slowly.

This has a direct, non-obvious consequence for a Java application specifically: the Java Virtual Machine has traditionally been configured with a fixed heap size (`-Xmx512m`, for instance), but a fixed value doesn't know anything about the container's own memory limit, which the underlying infrastructure might resize independently of the application's configuration. The safer approach is `-XX:MaxRAMPercentage=75.0`, sizing the heap as a percentage of whatever memory the container actually has available *at startup*, rather than a number baked in ahead of time — so the heap sizing automatically tracks the container's real limit instead of silently drifting out of sync with it.

Requests and limits describe a fixed allocation per Pod, but load on a real application varies over time — and reacting to that variation by manually adding or removing replicas is exactly the kind of repetitive operational work Kubernetes is built to automate away. **Horizontal Pod Autoscaler:** watches an observed metric (processor utilization, memory, or a custom metric) against a target, and adds or removes Pod replicas to keep that metric near the target as load actually changes.

**Implementation example** — requests/limits sized relative to the container (feeding `-XX:MaxRAMPercentage`), plus a Horizontal Pod Autoscaler reacting to processor load:
```yaml
# inside the Deployment's pod template:
        resources:
          requests: { cpu: "250m", memory: "512Mi" }   # scheduler guarantees this much is available
          limits:   { cpu: "1",    memory: "512Mi" }   # exceeding memory → OOMKilled; exceeding cpu → throttled, not killed
        env:
          - name: JAVA_OPTS
            value: "-XX:MaxRAMPercentage=75.0"          # 75% of the 512Mi limit, not a hard-coded -Xmx
---
apiVersion: autoscaling/v2
kind: HorizontalPodAutoscaler
metadata: { name: order-service-hpa }
spec:
  scaleTargetRef: { apiVersion: apps/v1, kind: Deployment, name: order-service }
  minReplicas: 3
  maxReplicas: 10
  metrics:
    - type: Resource
      resource: { name: cpu, target: { type: Utilization, averageUtilization: 70 } }
```
Above 70% average processor utilization across the Deployment's pods, the Horizontal Pod Autoscaler adds replicas (up to 10); below it, it scales back down (never under the 3-replica floor) — `kubectl get hpa` shows the current/target metric and replica count live.

<h3 id="commands-1" style="font-size:26px;font-weight:700;margin:26px 0 10px;">⌨️ Commands</h3>
`kubectl` is the command-line client every one of the sections above ultimately gets driven through; a handful of its commands cover the overwhelming majority of day-to-day work:
```bash
kubectl get nodes / pods / services
kubectl describe pod mypod    # events and state — first reflex when debugging
kubectl logs mypod
kubectl exec -it mypod -- sh
kubectl apply -f pod.yml
kubectl get pods --watch
kubectl delete -f pod.yml
```

<h3 id="workload-types" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🧱 Workload Types</h3>
The Deployment introduced earlier assumes something specific about the Pods it manages: that they're **stateless**, meaning every replica is interchangeable, and any one of them can be destroyed and replaced by a fresh replica with a brand-new name, with no assumption anywhere about which particular replica handled a previous request. That assumption is exactly right for a typical web service, but it breaks down for a genuinely **stateful** workload — a database, or a message-broker node — where each individual instance actually has its own identity and its own data that must follow it specifically, not just any replacement replica. **StatefulSet:** the workload type built for exactly this case — each Pod gets a stable, predictable network identity (`pod-0`, `pod-1`, and so on) and its own dedicated PersistentVolumeClaim that follows that specific Pod across restarts, and — unlike a Deployment's replicas, which can be created or destroyed in any order — a StatefulSet's Pods are created, updated, and deleted in strict ordinal order.

Neither of those two workload types fits a third common shape: something that needs to run once, identically, on *every* node in the cluster — a log collector, a metrics exporter, a networking plugin. **DaemonSet:** exists specifically for this, guaranteeing exactly one copy of a Pod runs on every node (or a selected subset of them), automatically scaling its own Pod count up or down as the cluster itself grows or shrinks.

All three workload types above assume something is meant to keep running indefinitely — but plenty of real work is a one-off task that should run to completion and then simply stop. **Job:** covers exactly that — it runs a Pod to completion, retrying on failure up to a configured limit, and is never expected to keep running the way a Deployment is. **CronJob:** builds one more layer on top of Job, scheduling it to run repeatedly on a cron-style time schedule — the Kubernetes-native equivalent of a crontab entry, suited to periodic batch work like nightly reports or scheduled cleanup tasks.

**Implementation example** — a StatefulSet (stable identity per replica) versus a CronJob (runs to completion on a schedule):
```yaml
apiVersion: apps/v1
kind: StatefulSet
metadata: { name: kafka }
spec:
  serviceName: kafka                              # a headless Service, giving each pod kafka-0.kafka, kafka-1.kafka, ...
  replicas: 3
  selector: { matchLabels: { app: kafka } }
  template:
    metadata: { labels: { app: kafka } }
    spec:
      containers:
        - name: kafka
          image: apache/kafka:3.7.0
          volumeMounts: [{ name: data, mountPath: /var/lib/kafka/data }]
  volumeClaimTemplates:                            # one dedicated PersistentVolumeClaim PER replica, following it across restarts
    - metadata: { name: data }
      spec: { accessModes: ["ReadWriteOnce"], resources: { requests: { storage: 20Gi } } }
---
apiVersion: batch/v1
kind: CronJob
metadata: { name: nightly-report }
spec:
  schedule: "0 2 * * *"                            # 02:00 every day, standard crontab syntax
  jobTemplate:
    spec:
      template:
        spec:
          restartPolicy: OnFailure
          containers:
            - { name: report, image: my-registry/report-job:1.0, command: ["./run-report.sh"] }
```

<h3 id="namespaces--rbac" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🗂️ Namespaces &amp; Role-Based Access Control (RBAC)</h3>
A single cluster is frequently shared by several teams or environments at once — `dev`, `staging`, `prod`, or one slice per team — and without some way to keep their objects apart, a `dev` team's Pod named `worker` would collide with a `prod` team's Pod of the same name. **Namespace:** A namespace partitions a single cluster into isolated logical sub-clusters: most object names only need to be unique *within* a namespace, not across the whole cluster, and resource quotas and network policies (covered further below) are commonly scoped per namespace as well.

Namespaces solve isolation of *names*, but say nothing about who's allowed to *do* what inside them — that's a separate problem, answered by **Role-Based Access Control (RBAC)**, which governs precisely who can perform which actions on which resources. **Role and ClusterRole:** A Role is a set of permitted verbs — get, list, create, delete, and so on — on a set of resource types, scoped to exactly one namespace; a ClusterRole is the same idea but scoped cluster-wide instead. Defining a Role or ClusterRole alone grants nothing yet, though — it's just a description of permissions sitting unattached. **RoleBinding and ClusterRoleBinding:** These are what actually grant a Role or ClusterRole to somebody — a specific user, a group, or, for a Pod calling the Kubernetes API on its own behalf, a **ServiceAccount**, the identity a Pod itself runs as. Putting these three pieces together is what makes the principle of least privilege enforceable in practice: a Pod's ServiceAccount should be bound only to the specific verbs and resources it genuinely needs — "read ConfigMaps in this namespace," say — never granted cluster-admin by default just because it was the easiest binding to create.

A handful of operational details round this out. The verbs a Role or ClusterRole grants map directly onto familiar Hypertext Transfer Protocol methods: `create`→POST, `delete`→DELETE, `get`/`list`/`watch`→GET, `patch`→PATCH, `update`→PUT, plus `proxy`→GET for connecting through a streaming WebSocket proxy. Kubernetes ships several **built-in ClusterRoles** out of the box — `cluster-admin` (full cluster access), `admin` (full access within one namespace), `edit` (modify resources in a namespace, but not RBAC itself), and `view` (read-only) — and the API server **auto-reconciles** these on every restart, silently overwriting any manual edit unless the `rbac.authorization.kubernetes.io/autoupdate: "false"` annotation is set first. `kubectl auth can-i create pods` (add `--subresource=logs` for subresources) tests authorization directly, the fastest way to validate a policy or diagnose a user's "unauthorized" error without reproducing the failing call by hand. And a ClusterRole doesn't have to be written with hand-copied rules at all — it can instead declare `aggregationRule.clusterRoleSelector`, a label selector that automatically merges in the rules of every ClusterRole matching it and keeps that merge in sync as the constituent roles change; this is exactly how Kubernetes' own built-in `edit`/`view` roles are composed internally.

**Implementation example** — a namespace-scoped ServiceAccount allowed only to read ConfigMaps in its own namespace:
```yaml
apiVersion: v1
kind: Namespace
metadata: { name: orders }
---
apiVersion: v1
kind: ServiceAccount
metadata: { name: order-service-sa, namespace: orders }
---
apiVersion: rbac.authorization.k8s.io/v1
kind: Role
metadata: { name: configmap-reader, namespace: orders }
rules:
  - apiGroups: [""]
    resources: ["configmaps"]
    verbs: ["get", "list", "watch"]                # no create/update/delete — least privilege
---
apiVersion: rbac.authorization.k8s.io/v1
kind: RoleBinding
metadata: { name: order-service-configmap-reader, namespace: orders }
subjects:
  - { kind: ServiceAccount, name: order-service-sa, namespace: orders }
roleRef: { kind: Role, name: configmap-reader, apiGroup: rbac.authorization.k8s.io }
```
The Deployment's pod template then sets `spec.serviceAccountName: order-service-sa`; a call from this pod to `create` a ConfigMap, or to read one in a *different* namespace, is rejected by the apiserver — `kubectl auth can-i create configmaps --as=system:serviceaccount:orders:order-service-sa -n orders` verifies this without needing to actually run the pod.

<h3 id="storage-1" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🗄️ Storage</h3>
A Pod, as defined earlier, is ephemeral by design — Kubernetes can destroy and replace one at any time — which is exactly the problem the StatefulSet's dedicated volume claim solved for stateful workloads. That mechanism rests on three cooperating pieces, worth defining in the order a request for storage actually flows through them. **PersistentVolume (PV):** A PersistentVolume is a piece of storage that's already been provisioned somewhere in the cluster — backed by a cloud disk, a Network File System, or similar — and, crucially, exists entirely independently of any single Pod's lifecycle, so it survives a Pod being destroyed and recreated. **PersistentVolumeClaim (PVC):** A PersistentVolumeClaim is the other side of that same relationship: a Pod's own *request* for storage matching certain criteria — a size, an access mode — which Kubernetes binds to a matching available PersistentVolume on the Pod's behalf. A Pod always mounts the PVC, never the PV directly, which is what keeps a Pod's own definition decoupled from whatever specific underlying storage happens to satisfy it.

That still leaves one gap: someone has to have created a matching PersistentVolume in the first place before a claim can bind to it. **StorageClass:** A StorageClass defines *how* a PersistentVolume actually gets provisioned on demand — which storage backend, which performance tier — and this is what enables **dynamic provisioning**: a PersistentVolumeClaim with no pre-existing matching PersistentVolume automatically triggers the creation of a brand-new one through its StorageClass, rather than requiring an operator to pre-create volumes by hand ahead of time.

**Implementation example** — a PersistentVolumeClaim that dynamically provisions its own PersistentVolume via a StorageClass, then gets mounted into a pod:
```yaml
apiVersion: storage.k8s.io/v1
kind: StorageClass
metadata: { name: fast-ssd }
provisioner: kubernetes.io/aws-ebs                # cloud-specific; this one provisions Amazon Elastic Block Store volumes
parameters: { type: gp3 }
---
apiVersion: v1
kind: PersistentVolumeClaim
metadata: { name: order-service-data }
spec:
  accessModes: ["ReadWriteOnce"]
  storageClassName: fast-ssd
  resources: { requests: { storage: 10Gi } }
---
# inside a pod spec:
      volumes:
        - name: data
          persistentVolumeClaim: { claimName: order-service-data }
      containers:
        - name: order-service
          volumeMounts: [{ name: data, mountPath: /var/lib/app/data }]
```
No PersistentVolume object was written by hand — the moment the PersistentVolumeClaim is applied with no matching existing PersistentVolume, the `fast-ssd` StorageClass's provisioner creates one automatically and binds it; `kubectl get pv,pvc` shows the resulting bound pair.

<h3 id="scheduling" style="font-size:26px;font-weight:700;margin:26px 0 10px;">📍 Scheduling</h3>
By default, the scheduler treats every worker node as interchangeable, placing a Pod wherever there's sufficient capacity — but real clusters often need finer control than that, and Kubernetes offers two distinct, complementary mechanisms for it, worth telling apart clearly since they express opposite kinds of preference. **Node affinity and anti-affinity:** These are rules that attract or repel a Pod's scheduling toward nodes matching certain labels — "prefer nodes in this availability zone," for instance — expressible as either `requiredDuringScheduling` (a hard constraint the scheduler must satisfy) or `preferredDuringScheduling` (a soft preference it tries to honor but won't block on). **Pod affinity and anti-affinity:** This is the same underlying idea, but expressed relative to *other Pods'* placement rather than to node labels — anti-affinity to spread a Deployment's replicas across different nodes for resilience against a single node failing, or affinity to co-locate a cache alongside the specific service that uses it, for lower latency between the two.

Both of those mechanisms are a Pod expressing what it wants; **taints and tolerations** invert that relationship entirely. **Taints and tolerations:** A **taint** applied to a node repels Pods by default — marking a node reserved for a specific workload, or one currently under maintenance — and only a Pod carrying a matching **toleration** is permitted to schedule there at all. The distinction that matters: affinity is a Pod expressing a preference the scheduler tries to honor; a taint is a node actively refusing every Pod that doesn't explicitly tolerate it, a much stronger and more one-sided guarantee.

**Implementation example** — spreading replicas of one Deployment across nodes (pod anti-affinity), while also requiring a GPU-labeled node (node affinity) that other workloads are kept off (a taint + matching toleration):
```yaml
# node setup (once): kubectl taint nodes gpu-node-1 workload=gpu:NoSchedule
# inside the Deployment's pod template:
      affinity:
        podAntiAffinity:
          requiredDuringSchedulingIgnoredDuringExecution:
            - topologyKey: "kubernetes.io/hostname"      # never co-locate two replicas on the same node
              labelSelector: { matchLabels: { app: order-service } }
        nodeAffinity:
          requiredDuringSchedulingIgnoredDuringExecution:
            nodeSelectorTerms:
              - matchExpressions:
                  - { key: gpu, operator: In, values: ["true"] }
      tolerations:
        - { key: "workload", operator: "Equal", value: "gpu", effect: "NoSchedule" }
```
Without the toleration, the scheduler would refuse to place this pod on `gpu-node-1` at all (the taint repels it); the node affinity separately *requires* a GPU-labeled node specifically, and the pod anti-affinity then spreads however many replicas exist across the different nodes matching that requirement.

<h3 id="helm" style="font-size:26px;font-weight:700;margin:26px 0 10px;">⎈ Helm</h3>
A real application is rarely one manifest — it's a Deployment, a Service, a ConfigMap, and an Ingress together, and every one of them typically needs slightly different values per environment (replica counts, resource limits, image tags for `dev` versus `prod`). Hand-editing several raw YAML Ain't Markup Language files per environment, keeping them all consistent, gets unwieldy fast. **Helm:** Helm is the de facto package manager for Kubernetes, solving exactly this: it bundles a set of related manifests into a versioned, templated **chart**, parameterized by a single `values.yaml` file rather than several hand-maintained copies of the raw manifests. `helm install` installs a chart for the first time, `helm upgrade` applies a new version with new values, and `helm rollback` reverts to a previous release's exact rendered manifests — that last command is Helm's main practical advantage over plain `kubectl apply`, since Helm tracks full release history and `kubectl apply` on its own does not. The common pattern in practice is one chart per microservice, with `values-dev.yaml`/`values-prod.yaml` override files supplying whatever differs per environment on top of the chart's shared defaults.

**Implementation example** — a minimal chart parameterizing the Deployment shown earlier in this section:
```
order-service-chart/
├── Chart.yaml              # name, version
├── values.yaml             # default parameters
└── templates/
    └── deployment.yaml     # the manifest, with {{ }} placeholders filled from values.yaml
```
```yaml
# values.yaml
replicaCount: 3
image: { repository: my-registry/order-service, tag: "1.4.2" }
```
```yaml
# templates/deployment.yaml
apiVersion: apps/v1
kind: Deployment
metadata: { name: {{ .Release.Name }}-order-service }
spec:
  replicas: {{ .Values.replicaCount }}
  template:
    spec:
      containers:
        - name: order-service
          image: "{{ .Values.image.repository }}:{{ .Values.image.tag }}"
```
```bash
helm install prod ./order-service-chart -f values-prod.yaml   # renders the template, applies the result
helm upgrade prod ./order-service-chart --set image.tag=1.4.3  # new version, no manifest hand-editing
helm rollback prod 1                                            # back to release revision 1 if it goes wrong
```

<h3 id="control-plane-internals" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🧠 Control Plane Internals</h3>
The Components section earlier named the apiserver, kubelet, and kube-proxy without yet explaining how the control plane's decision-making actually holds together as a system — that's the gap this section closes. "The control plane" is not one black-box process; it's five components, each with a narrow job, and understanding it starts with the one piece everything else ultimately depends on. **etcd:** etcd is a distributed key-value store holding the **entire cluster state** — nothing else in Kubernetes is the actual source of truth. It runs as its own separate cluster of 3 or 5 nodes (an odd number, for quorum) apart from every other control-plane component, so it can stay highly available on its own.

Everything reads from and writes to that one store through a single front door. **API server (`kube-apiserver`):** The API server exposes Kubernetes' REST interface and is deliberately **stateless** — every read and write it handles actually goes to or from etcd, never held anywhere inside the API server process itself. That statelessness is exactly what lets the API server scale horizontally, simply by running more replicas behind a load balancer, since none of them need to coordinate state with each other; it also caches reads locally to reduce direct load on etcd.

Reading and writing state is only half the picture, though — something also has to *act* on that state to keep reality matching what was declared. **Controller manager (`kube-controller-manager`):** This is a single binary bundling many independent controllers — for replication, endpoints, services, and more — each running its own reconciliation loop (defined in full further below) against state it reads through the API server, exactly like any other client would. An optional **cloud controller manager** splits off cloud-provider-specific responsibilities — managing load balancers, instances, and routes — from the general controller manager, activated by setting `--cloud-provider=external` on it. The scheduler and kubelet, the two remaining control-plane pieces, are substantial enough to warrant their own sections just below.

The reason this five-piece split actually works, rather than becoming five ways for the cluster to disagree with itself, comes back to the same two properties just established: because the API server is stateless and etcd is the one and only source of truth, every component here is independently replaceable or horizontally scalable — and a custom controller, a custom scheduler, or a Custom Resource Definition's own controller (covered further below) is never anything more than another ordinary client of the same API server, with no special access that Kubernetes' own built-in controllers don't equally have.

**Implementation example** — proving the API server is stateless by watching it survive a restart with cluster state intact (state lives in etcd, not the API server process):
```bash
kubectl get pods -A -o wide | wc -l           # baseline pod count, served from the API server's view of etcd
kubectl -n kube-system delete pod -l component=kube-apiserver --wait=false  # force an API server restart (managed clusters only)
kubectl get pods -A -o wide | wc -l           # unchanged once the new API server pod is Ready — nothing was lost, because nothing was held in the API server itself
```

<h3 id="api-request-path" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🔐 The API Request Path</h3>
The previous section established that literally everything in Kubernetes flows through the API server — which raises an obvious question: what actually happens to a request between arriving at the API server and being persisted to etcd? Every request passes through three sequential stages, each answering a genuinely different question, in a fixed order.

**Authentication:** The first stage asks simply "who is this?" — resolved via client certificates, static token files, cloud identity and access management integration, or an OpenID Connect provider. Even a request that authenticates as nobody in particular still receives an identity: the `system:unauthenticated` group, rather than being rejected outright at this stage.

**Authorization:** The second stage takes that established identity and asks "is this identity allowed to do this?" — the Role-Based Access Control mechanism covered earlier in Namespaces & RBAC is the standard mode Kubernetes uses to answer it, though Kubernetes also supports ABAC (privileges read from a static file) and a Webhook mode that delegates the decision entirely to an external service via a `SubjectAccessReview` object.

**Admission control:** The third and final stage asks a different question again: "should this specific request additionally be transformed, or rejected, beyond what identity and permissions alone determine?" It deliberately runs only *after* authentication and authorization have already succeeded, so it only ever has to reason about the request body itself, never re-derive who's making the request or what they're allowed to do. Built-in admission controllers handle generic policy — defaulting resource limits on a Pod that doesn't specify any, for instance — while custom policy is added through **webhooks**, of which there are two kinds with a specific ordering between them. A **validating admission webhook** (`ValidatingWebhookConfiguration`) can only allow or reject a request outright, with a reason attached on rejection. A **mutating admission webhook** (`MutatingWebhookConfiguration`) can go further, rewriting the request body in flight via a JSONPatch before it's ever persisted — auto-injecting a sidecar container, or defaulting a field the client left unset. Mutating webhooks always run *before* validating webhooks in the chain, which is precisely what lets a mutating webhook's defaulting logic supply a value that a subsequent validating webhook then checks. Both kinds are ordinary HTTP(S) services the API server calls out to, in-cluster or external — and because the API server **requires HTTPS** for these calls, a webhook needs a certificate the cluster's own certificate authority can issue through a `CertificateSigningRequest` object.

**Implementation example** — a mutating webhook that defaults a missing field, registered without any API server restart:
```yaml
apiVersion: admissionregistration.k8s.io/v1
kind: MutatingWebhookConfiguration
metadata: { name: pod-defaulter }
webhooks:
  - name: defaulter.example.com
    rules:
      - apiGroups: [""]
        apiVersions: ["v1"]
        operations: ["CREATE"]
        resources: ["pods"]
    clientConfig:
      service: { name: pod-defaulter-svc, namespace: default, path: "/mutate" }
      caBundle: <base64 CA cert>
    sideEffects: None
    admissionReviewVersions: ["v1"]
```
On a matching `CREATE`, the API server POSTs an `AdmissionReview` (request metadata + object body) to the webhook; the webhook's response can carry a base64-encoded JSONPatch that the API server applies to the object *before* it's ever written to etcd — the pod object that ends up persisted was never exactly what the client submitted.

<h3 id="scheduler-internals" style="font-size:26px;font-weight:700;margin:26px 0 10px;">📐 Scheduler Internals</h3>
The affinity, anti-affinity, and taint/toleration rules covered earlier under Scheduling describe *what* a Pod or node wants, but not *how* the scheduler actually turns a whole set of those wants into a single placement decision for one Pod — that's genuinely a two-phase process, not one step, and the two phases explain something those earlier rules only told half of. The scheduler first **filters**, applying what are sometimes called predicates: it eliminates every node that flatly cannot run the Pod at all — insufficient resources, a taint with no matching toleration, a required node-affinity term that isn't met. Only after that elimination does it **score** whatever nodes remain, ranking them by priority and picking the highest-scoring one. This two-phase split is exactly why affinity, anti-affinity, and taints/tolerations were only ever half the scheduling picture: they operate almost entirely in the filtering phase, deciding which nodes are even eligible, while resource-based bin-packing preferences are what actually drive the scoring phase among whatever nodes survive filtering. In practice, resource requirements, node/Pod affinity and anti-affinity, taints/tolerations, data locality, and deadlines all feed into this same single filter-then-score pass together, rather than being evaluated as independent, disconnected checks.

None of this scheduling logic is hard-wired into Kubernetes as a fixed, unchangeable algorithm, either — a cluster can run a **custom scheduler** alongside the built-in default one, and a Pod opts into using it by setting `spec.schedulerName`, so only that specific subset of Pods uses the custom logic while everything else in the cluster continues being placed by the default scheduler, unmodified.

**Implementation example** — a pod explicitly opting into a second, custom scheduler running alongside the default one:
```yaml
apiVersion: v1
kind: Pod
metadata: { name: batch-worker }
spec:
  schedulerName: my-custom-scheduler   # any pod omitting this field still uses the built-in default-scheduler
  containers:
    - { name: worker, image: my-registry/batch-worker:1.0 }
```
`kubectl get events --field-selector reason=Scheduled` shows which scheduler placed a given pod — useful to confirm `my-custom-scheduler`, not `default-scheduler`, made this particular placement decision.

<h3 id="kubelet-cri-kube-proxy" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🔗 kubelet, the Container Runtime Interface &amp; kube-proxy</h3>
The Components section introduced the kubelet as the agent responsible for making sure a node's assigned containers are actually running — but it never explained how the kubelet actually talks to a container runtime to make that happen, and the answer mirrors something already covered on the Docker side. **Container Runtime Interface (CRI):** The CRI is a gRPC Application Programming Interface that lets the kubelet talk to *any* compliant container runtime — containerd, CRI-O — without needing runtime-specific code baked into the kubelet itself. This is exactly the same decouple-with-a-stable-interface pattern behind Docker's own `containerd`/`runc` split, covered earlier in the Docker section, applied one layer up at the orchestrator level instead of the engine level. Concretely, the CRI defines two gRPC services: `ImageService` (`PullImage`, `ListImages`, `RemoveImage`, and similar) and `RuntimeService` (`RunPodSandbox`, `CreateContainer`, `StartContainer`, `ExecSync`, and similar) — the kubelet calls these remote procedures directly and never needs to know which specific runtime is actually satisfying them underneath.

Once containers are running, something still has to route traffic to the right one when a client reaches a Service's stable address, introduced earlier — that's kube-proxy's job, and it can do it in either of two distinct ways. In **iptables mode**, kube-proxy watches the API server for Service and Endpoint changes and programs rules directly into the kernel's netfilter tables, rewriting — via destination network address translation — any packet addressed to a Service's virtual Cluster IP straight to a real backing Pod's IP. The kernel itself performs that rewrite; kube-proxy is **not in the data path** for any individual packet, it only maintains the rule set, rewriting it whenever endpoints change (Pods coming and going, or failing readiness). That absence from the data path has a direct consequence worth understanding: kube-proxy can't retry a failed request against a different Pod on its own, since it's never actually touching the traffic — which is exactly why a correctly configured readiness probe matters so much here, since a Pod failing readiness is pulled out of the `iptables` rules entirely rather than being silently retried around.

**IP Virtual Server (IPVS) mode** is the newer alternative, built on the kernel's IPVS load-balancing subsystem instead of sequential `iptables` rule matching — an O(1) hash-table lookup of the right backend, versus `iptables`' O(n) linear scan through its rule chain, plus a wider choice of load-balancing algorithms than iptables mode's effectively random selection. This difference matters most once a cluster's Service and endpoint counts grow large enough that `iptables`' own rule-chain length becomes the actual bottleneck.

**Implementation example** — inspecting the literal `iptables` DNAT rule kube-proxy programs for a Service (any node, iptables mode; requires root):
```bash
kubectl get svc order-service -o jsonpath='{.spec.clusterIP}'   # e.g. 10.96.12.34
sudo iptables -t nat -L KUBE-SERVICES -n | grep 10.96.12.34
# KUBE-SVC-XXXX  tcp -- 0.0.0.0/0  10.96.12.34  /* default/order-service */ tcp dpt:80
sudo iptables -t nat -L KUBE-SVC-XXXX -n
# KUBE-SEP-YYYY ... statistic mode random probability 0.33333  -> DNAT to one of 3 pod IPs
```
Each Service Cluster IP resolves to a chain that randomly DNATs to one of the ready endpoint pods — literally what "load balancing" means under iptables mode.

<h3 id="cni-networkpolicy" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🕸️ Container Network Interface &amp; NetworkPolicy</h3>
Every Pod needs a real network interface and an IP address the moment it's created, and Kubernetes deliberately doesn't hard-code how that happens — it delegates the job through a plugin contract. **Container Network Interface (CNI):** For Kubernetes, the unit CNI wires up is the **Pod** as a whole, not each individual container within it, since — as established earlier — every container in a Pod already shares one network namespace and one IP. The **container runtime**'s own job in this handoff is narrow: create that network namespace, then invoke a CNI plugin as a subprocess, passing it a JSON network configuration on stdin plus context through environment variables (`CNI_COMMAND=ADD|DEL|VERSION`, `CNI_CONTAINERID`, `CNI_NETNS`, `CNI_IFNAME`). The **CNI plugin** itself then does the actual networking work: adding an interface into the Pod's namespace, bridging it to the host via a virtual Ethernet pair, assigning an IP address (typically delegating that specific step to a separate IP address management plugin), and setting up routes — on success, it streams the resulting interface, IP, and route configuration back as JSON on stdout. Because the entire contract boils down to "read JSON from stdin, write JSON to stdout," a CNI plugin can be written in literally any language, with no shared library dependency required at all.

**NetworkPolicy:** A NetworkPolicy is a Kubernetes object that restricts which Pods are allowed to talk to which other Pods, but there's a subtlety worth being precise about: the Kubernetes API only ever *stores* a NetworkPolicy object — actually enforcing it requires a networking solution whose CNI plugin specifically implements policy enforcement (Calico is a common example). This has a real security implication, not just a technical footnote: if an attacker can reach the Pod network directly and create a Pod matching a policy's allowed selectors, that attacker still communicates freely, since NetworkPolicy only constrains legitimate Pod-to-Pod traffic patterns between Pods the cluster itself created and scheduled — it is not a perimeter security boundary on its own.

**Implementation example** — a default-deny-then-allow NetworkPolicy restricting a database pod to only accept traffic from labeled frontend pods on one port:
```yaml
apiVersion: networking.k8s.io/v1
kind: NetworkPolicy
metadata: { name: db-allow-frontend, namespace: default }
spec:
  podSelector: { matchLabels: { role: db } }
  policyTypes: ["Ingress"]
  ingress:
    - from: [{ podSelector: { matchLabels: { role: frontend } } }]
      ports: [{ protocol: TCP, port: 5432 }]
```
Any pod without `role: frontend` — even one on the same node, same namespace — is dropped by the enforcing CNI plugin's node-level agent before it reaches the database pod; `kubectl describe networkpolicy db-allow-frontend` confirms the applied selector and rule.

<h3 id="crd-operators" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🔁 Custom Resource Definitions &amp; the Operator Pattern</h3>
Every controller mentioned so far — the controller manager's replication controller, a custom scheduler, anything reacting to cluster state — actually operates on one underlying pattern, and it's worth naming and defining before looking at how it extends to entirely custom behavior. **Reconciliation loop:** A reconciliation loop continuously compares **desired state** — what a spec says *should* exist — against **observed state** — what's actually running right now, discovered fresh via a label query rather than any hard-coded reference — and acts to close whatever gap exists between the two. The same loop handles both cases transparently: an explicit user action, like scaling a Deployment, and an entirely implicit environmental change, like a node failing and its Pods needing rescheduling, are both just "observed state doesn't match desired state; act" to the loop — there's no special-cased failure-handling branch distinguishing the two. Watching for state changes uses the API server's **watch API**, a live stream of change events, rather than polling — polling would add latency bounded by however often it polls, and unnecessary load on the API server besides.

That reconciliation pattern only ever operates on Kubernetes' own built-in object types by default — Deployments, Services, and so on — unless the API itself is extended with something new. **Custom Resource Definition (CRD):** A CRD is a meta-resource that adds an entirely new API object type to a cluster: namespaced or cluster-scoped, subject to RBAC exactly like a built-in type, usable with `kubectl` exactly like a built-in type too. Its name must follow the form `<resource-plural>.<api-group>`, which is what guarantees the name stays unique across the whole cluster, and exactly one of its declared `version`s must be marked `storage: true`, specifying which representation etcd actually persists when multiple versions of the same custom type coexist.

A CRD alone, though, only yields a CRUD API for inert data — defining the shape of a `LoadTest` object, say, doesn't make load tests actually run. **Operator:** An Operator is exactly the combination of a CRD plus a controller: a controller running the reconciliation loop just defined, specifically against instances of that custom resource, which is what actually makes something happen — creating, modifying, or deleting whatever real Kubernetes resources a custom object's spec describes.

**Implementation example** — a CRD for a `LoadTest` custom resource, which by itself does nothing until a controller reconciles it:
```yaml
apiVersion: apiextensions.k8s.io/v1
kind: CustomResourceDefinition
metadata: { name: loadtests.beta.example.com }
spec:
  group: beta.example.com
  versions: [{ name: v1, served: true, storage: true }]
  scope: Namespaced
  names: { plural: loadtests, singular: loadtest, kind: LoadTest, shortNames: ["lt"] }
---
apiVersion: beta.example.com/v1
kind: LoadTest
metadata: { name: checkout-flow-test }
spec: { service: order-service, requestsPerSecond: 1000, paths: ["/checkout"] }
```
`kubectl get loadtests` works immediately after applying the CRD — but nothing runs a load test until a separate controller process watches `LoadTest` objects (via the watch API) and reconciles each one into real worker pods; the CRD is the API surface, the controller is the behavior.

<h3 id="init-containers-multi-container-patterns" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🧩 Init Containers &amp; Multi-Container Pod Patterns</h3>
The startup probe covered earlier under Configuration & Spring Boot Integration solves one specific problem: distinguishing a slow-but-healthy startup from a genuinely hung process. But a fixed `initialDelaySeconds` on its own forces an uncomfortable choice — set it too short, and a genuinely slow start gets misclassified as a failure; set it too long "just in case," and every single rollout wastes that entire delay even when startup is normally fast, which at scale can make a service effectively unavailable for the duration of a rollout. **Init container:** An init container, declared in `spec.initContainers`, runs to completion **in order** before any regular container in the Pod starts at all, and it exists specifically to absorb that non-deterministic setup work — waiting for a dependency to become reachable, say — so the main container's own probe delay only has to cover its own startup time, which is typically far more predictable.

Beyond init containers, several established patterns place a *second*, permanently-running container alongside the main application container in the same Pod, each solving a distinct problem by leaning on the fact that containers sharing a Pod already share network and, optionally, storage. **Sidecar pattern:** A sidecar is a second container co-located in the Pod that the main application container remains entirely unaware of — a logging agent shipping the main container's `stdout` to a central service, for instance. Because the application container never references the sidecar directly, swapping the logging backend means changing only the sidecar; the application container itself can never be broken by that change. **Ambassador pattern:** An ambassador is a local proxy container representing some remote service as if it were local — exposed on `localhost:6379` inside the Pod, say, routing writes to a database primary and reads to its replicas. The application only ever talks to `localhost`, so a topology change on the remote side — a failover, adding a replica — only ever requires updating the ambassador, never the application itself. **Adapter pattern:** An adapter standardizes the main container's output for downstream consumers still expecting an older format — during an incremental rollout, for instance, an adapter sharing the Pod's filesystem with the main container rewrites new-format output back into the old format until every downstream consumer has upgraded. Unlike the sidecar and ambassador patterns, which run independently alongside the application with no direct coupling, the adapter pattern specifically depends on a **shared filesystem** with the main container, since that's the only way it can actually observe and transform the main container's own output.

**Implementation example** — an init container blocking on a dependency, plus a sidecar shipping logs, in one pod:
```yaml
apiVersion: v1
kind: Pod
metadata: { name: order-service }
spec:
  initContainers:
    - name: wait-for-db                      # runs to completion FIRST
      image: busybox:1.36
      command: ["sh", "-c", "until nc -z db 5432; do sleep 2; done"]
  containers:
    - name: order-service
      image: my-registry/order-service:1.4.2
      volumeMounts: [{ name: logs, mountPath: /var/log/app }]
    - name: log-shipper                      # sidecar: unaware to the app, ships /var/log/app to a central service
      image: my-registry/log-shipper:1.0
      volumeMounts: [{ name: logs, mountPath: /var/log/app, readOnly: true }]
  volumes: [{ name: logs, emptyDir: {} }]
```
The `order-service` container never starts until `wait-for-db` exits successfully; once running, `order-service` and `log-shipper` run concurrently, sharing only the `logs` volume — the application code has zero awareness that shipping is happening.

---

<h2 id="cloud" style="font-size:33px;font-weight:800;margin:30px 0 12px;">☁️ Cloud</h2>

<h3 id="aws" style="font-size:26px;font-weight:700;margin:26px 0 10px;">☁️ AWS</h3>

<h4 id="computing" style="font-size:20px;font-weight:700;margin:22px 0 8px;">☁️ Computing</h4>
- **EC2**: Elastic Compute Cloud with autoscaling
- **Lambda**: Serverless functions, virtual functions, autoscalable, reactive
- **Batch**: fully managed batch-computing service that plans, schedules, and runs containerized jobs across EC2, Spot, or Fargate capacity — not itself a scheduler; recurring runs are triggered on a timer by EventBridge calling Batch's `SubmitJob`
- **Lightsail**: Easy user friendly computing + services for quick startup

<h4 id="storage" style="font-size:20px;font-weight:700;margin:22px 0 8px;">☁️ Storage</h4>
- **S3**: Simple Storage Service for objects
- **EBS**: Elastic Block Store for EC2
- **EFS**: Elastic File System
- **DynamoDB**: NoSQL key/value based
- **DocumentDB**: NoSQL MongoDB document based
- **RDS**: Relational database service for MySQL, SQL Server, Oracle, PostgreSQL, etc.
- **Aurora**: an AWS-built relational engine, **MySQL- and PostgreSQL-compatible** — the SQL dialect and wire protocol are standard, so existing drivers and tooling work unchanged; only the underlying distributed storage layer is proprietary, which is what gives it higher throughput than stock MySQL/PostgreSQL on RDS

<h4 id="networking" style="font-size:20px;font-weight:700;margin:22px 0 8px;">☁️ Networking</h4>
- **VPC (Virtual Private Cloud)**: an isolated private network inside AWS — the base every other networking concept sits on. Inside it, **subnets** split the address space into **public** (direct internet route) and **private** (no direct internet route) segments; **security groups** act as stateful, instance-level firewalls that allow traffic only where a rule explicitly permits it, while **Network Access Control Lists (NACLs)** are stateless, subnet-level rules evaluated in order — together they are the concrete mechanism behind the least-privilege principle from [Security](#-security): nothing talks to anything unless a rule says so
- **CloudFront**: Content Delivery Network
- **API Gateway**: API management service
- **Route 53**: DNS service
- **ELB**: Elastic Load Balancer

<h4 id="monitoring" style="font-size:20px;font-weight:700;margin:22px 0 8px;">☁️ Monitoring</h4>
- **CloudWatch**: Metrics and monitoring
- **Amazon QuickSight**: Dashboard for analytics

<h4 id="events" style="font-size:20px;font-weight:700;margin:22px 0 8px;">☁️ Events</h4>
- **EventBridge**:  Event/cron based event trigger service

<h4 id="containers-1" style="font-size:20px;font-weight:700;margin:22px 0 8px;">☁️ Containers</h4>
- **ECR**: Container repository
- **ECS**: AWS's own container orchestrator; a task runs on one of two **launch types** — **EC2** (you manage and pay for the underlying instances) or **Fargate** (serverless, no instances to manage) — Fargate is not a separate competing service, it is a launch mode of ECS (and of EKS)
- **Fargate**: the serverless launch type shared by ECS and EKS — you specify container resource needs, AWS runs them with no instance to patch or size
- **EKS**: Elastic Kubernetes Service, a managed Kubernetes control plane; worker nodes run on the same EC2-or-Fargate choice as ECS

<h4 id="cicd" style="font-size:20px;font-weight:700;margin:22px 0 8px;">☁️ CI/CD</h4>
- **CodeCommit**: managed Git source control — **closed to new customers since mid-2024** (existing repositories keep working, but AWS no longer onboards new ones); for a new project, point to GitHub, GitLab, or Amazon CodeCatalyst instead
- **CodeBuild**: Build service
- **CodeDeploy**: Deployment service
- **CodePipeline**: CI/CD service

<h4 id="identity-and-access-management-iam--governance" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🔑 Identity and Access Management (IAM) &amp; Governance</h4>
Identity and Access Management (IAM) is the identity and permission system underneath every other AWS service — networking (security groups) enforces *what traffic* is allowed, IAM enforces *who is allowed to act*.
- **Users vs Roles**: a **user** represents a person or system with long-lived credentials that can leak if mishandled; a **role** is a set of permissions *assumed* temporarily (by a service, or by an already-authenticated identity) with no fixed credentials to steal — prefer roles wherever the caller can assume one
- **Least privilege**: every role or user carries exactly the permissions its job requires, no more — the same principle already covered in [Security Best Practices](#security-best-practices), materialized here as IAM policies
- **AWS Organizations**: groups multiple AWS accounts (per project, per team, per environment) under one management hierarchy, enabling consolidated billing and centralized policy
- **Service Control Policies (SCPs)**: guardrails applied at the Organizations level that cap what member accounts can do, *regardless* of what their own IAM policies allow — the mechanism that lets a company enforce "no account may disable logging" account-wide without trusting every account's local configuration

<h4 id="high-availability--disaster-recovery" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🏗️ High Availability &amp; Disaster Recovery</h4>
Distinct from the generic [High Availability](#high-availability) principles above: HA absorbs routine, partial failures (one instance, one Availability Zone) without the business ever declaring an incident; Disaster Recovery (DR) is the plan for a full regional loss, sized against two numbers set by the business, not by engineering:
- **Recovery Time Objective (RTO)**: the maximum acceptable delay between the interruption of service and its restoration — how long the business tolerates being down
- **Recovery Point Objective (RPO)**: the maximum acceptable amount of data loss, measured as time since the last recoverable state — how much recent work the business tolerates losing
- **Multi-Availability Zone (Multi-AZ) vs multi-region**: Multi-AZ spreads resources across physically separate data centers within one region and is enough for most HA needs; multi-region additionally survives losing an entire region, at materially higher cost and complexity — justified only when the business impact of a full-region outage exceeds that cost

<h5 id="the-four-aws-disaster-recovery-strategies" style="font-size:16px;font-weight:600;margin:18px 0 7px;">The four AWS disaster recovery strategies</h5>
Each strategy trades cost against RTO/RPO — the tighter the objective, the more standby infrastructure must already be running before the disaster happens:
| Strategy | What is already running in the recovery site | RTO / RPO |
|---|---|---|
| **Backup & Restore** | Nothing — only backups exist | Hours — restoring and provisioning from scratch takes time |
| **Pilot Light** | The smallest core (typically just the database, replicating continuously) | Tens of minutes — the rest of the stack is provisioned and scaled up on failover |
| **Warm Standby** | A scaled-down but fully functional replica of the whole stack | Minutes — traffic shifts to it and it scales up under load |
| **Multi-Site Active/Active** | A full-scale replica already serving live traffic in both sites | Seconds, near-zero data loss — the most expensive tier, reserved for the strictest objectives |

- **The RTO/RPO trade-off drives replication strategy directly**: an RPO near zero demands synchronous cross-region replication, paying its latency cost on every write; a looser RPO allows cheaper, faster asynchronous replication — the same synchronous-vs-asynchronous replication trade-off covered in [Database → Replication](#synchronous-vs-asynchronous), applied at infrastructure scale
- **Disaster Recovery is proven by drills, not by the design document alone**: a scheduled failover exercise is what actually validates that RTO/RPO targets are achievable, not just theoretical

<h3 id="azure" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🔷 Azure</h3>

<h4 id="mapping-aws-knowledge-to-azure-equivalents" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🔷 Mapping AWS Knowledge to Azure Equivalents</h4>
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

<h4 id="talking-points-for-the-interview" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🔷 Talking Points for the Interview</h4>
- **Event Hubs exposes a Kafka-compatible endpoint**: existing Kafka producer and consumer code can often point at it with configuration changes only
- **Managed Identity**: No credentials in configuration files — Azure's answer to Identity and Access Management roles
- **Spring Cloud Azure**: Ready-made starters for Key Vault, Service Bus, Event Hubs, and the rest
- Honest positioning: "Deep AWS experience; cloud concept transfer — here is the mapping I have already studied"

---

<h2 id="infrastructure-as-code" style="font-size:33px;font-weight:800;margin:30px 0 12px;">🏗️ Infrastructure as Code</h2>

Creating resources by hand in a cloud console is not reproducible, not versionable, and not auditable — the same environment can never be recreated with certainty, and nothing records *why* a setting changed. Infrastructure as Code (IaC) describes the desired infrastructure in configuration files that a tool interprets and applies, solving three problems at once: **reproducibility** (the same files always produce the same environment), **version control** (infrastructure changes are reviewed as code, the same way application code is), and **environment consistency** (development, testing, and production are generated from the same definition, differing only in the parameters that must differ).

<h3 id="terraform" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🏗️ Terraform</h3>
Never hardcode an Amazon Machine Image (AMI) ID: it is region-specific and gets deregistered over time, so a pinned ID silently breaks months later. Look it up with a `data` source instead, which always resolves to the current image at `plan` time:
```hcl
provider "aws" {
  region = "us-east-1"
}

data "aws_ami" "amazon_linux" {
  most_recent = true
  owners      = ["amazon"]
  filter {
    name   = "name"
    values = ["al2023-ami-*-x86_64"]
  }
}

resource "aws_instance" "example" {
  ami           = data.aws_ami.amazon_linux.id
  instance_type = "t2.micro"
}
```

<h3 id="commands-2" style="font-size:26px;font-weight:700;margin:26px 0 10px;">⌨️ Commands</h3>
```bash
terraform init
terraform validate
terraform plan
terraform apply
terraform destroy
```

---

<h2 id="git" style="font-size:33px;font-weight:800;margin:30px 0 12px;">🌿 Git</h2>

<h3 id="concepts" style="font-size:26px;font-weight:700;margin:26px 0 10px;">💡 Concepts</h3>
- **Merging strategies**
- **Rebase vs Merge**
- **Cherry pick**

---

<h2 id="jenkins" style="font-size:33px;font-weight:800;margin:30px 0 12px;">🤵 Jenkins</h2>
- **Jenkinsfile**: Descriptor file for configuring the pipeline
- **Pipeline block**: the complete script
- **Agent**: the agent that's going to run the pipeline
- **Stages**: Stages of the pipeline
- **Steps**: Steps in the stage

---

<h1 id="-frontend" style="font-size:42px;font-weight:800;margin:34px 0 14px;">🌐 Frontend</h1>

<h2 id="html5" style="font-size:33px;font-weight:800;margin:30px 0 12px;">📄 HTML5</h2>
- Audio/Video
- Web Workers/Service Workers (Threads js)
- Local Storage (global)
- Session Storage (tab)

---

<h2 id="css" style="font-size:33px;font-weight:800;margin:30px 0 12px;">🎨 CSS</h2>
- Box model: margin (external), padding (internal)
- CSS selectors and combiners
- Specificity

---

<h2 id="javascript" style="font-size:33px;font-weight:800;margin:30px 0 12px;">🟨 JavaScript</h2>
- **Scopes**
- **Callbacks**: A function that be passed as argument to be called later
- **Hoisting**: JS automatically moves all variable declarations at the top when compiling
- **Closures**
- **Promises**
- **Async functions**
- **Await operations/methods**

---

<h2 id="typescript" style="font-size:33px;font-weight:800;margin:30px 0 12px;">🔷 TypeScript</h2>
- **Superset of JS**: All JS code is valid TS code
- **Transpiled to JS**: TS code is converted to JS code
- **Static typing**: Types are checked at compile time
- **Optional typing**: Types can be omitted and inferred
- **Modern JS features**: ES6+ features like classes, modules, arrow functions, destructuring, etc

```bash
npm install -g typescript
```

<h3 id="testing" style="font-size:26px;font-weight:700;margin:26px 0 10px;">🧪 Testing</h3>
```javascript
// Jasmine
it("should be called", function() {})
beforeEach/beforeAll/afterEach/afterAll
expect().equals()
spyOn() // listener
toHaveBeenCalled()/toHaveBeenCalledWith(x,y)
```

<h4 id="features-1" style="font-size:20px;font-weight:700;margin:22px 0 8px;">🧪 Features</h4>
- **Type Annotations**: `let x: string = 'My string';`
- **Type Inference**
- **Union types**: `let somevalue: number | string`
- **Type assertions**: `let fixedstring: string = (value as number).toFixed(4)`
- **Optional parameters**: `message?: string`
- **Typed functions**: `function(): string{}`

<h3 id="react" style="font-size:26px;font-weight:700;margin:26px 0 10px;">⚛️ React</h3>
- **Component**: Building blocks of React applications
- **Props**: Properties to pass data from parent to child (unidirectional)
- **State**: Data that belongs to the component
- **Hooks**: functions that allow access to low-level react features
    - **useState**: used to manage the state
    - **useEffect**: used when component is mounted and when state changes
    - **useContext**: used to share data across all the component tree
    - **useRef**: creates a mutable object that keeps the reference between renders

---

<h1 id="-ai" style="font-size:42px;font-weight:800;margin:34px 0 14px;">🤖 AI</h1>

*Outline to be filled as the study progresses — the structure below marks the topics that matter for a backend developer integrating artificial intelligence into services.*

<h2 id="large-language-model-fundamentals" style="font-size:33px;font-weight:800;margin:30px 0 12px;">🧠 Large Language Model Fundamentals</h2>
- **Tokens**: The unit models read and produce; pricing and limits are counted in tokens
- **Context window**: The maximum amount of tokens a model can consider at once
- **Temperature and sampling**: Controls randomness — low for deterministic answers, higher for creative output
- Pre-training vs fine-tuning vs in-context learning (examples inside the prompt)

<h2 id="prompt-engineering" style="font-size:33px;font-weight:800;margin:30px 0 12px;">💬 Prompt Engineering</h2>
- System prompt vs user prompt; role separation
- Few-shot examples; structured (JSON) outputs
- Why clear, explicit instructions beat clever tricks

<h2 id="retrieval-augmented-generation-rag" style="font-size:33px;font-weight:800;margin:30px 0 12px;">🔎 Retrieval-Augmented Generation (RAG)</h2>
- **Embeddings**: Text converted to vectors capturing meaning
- **Vector databases**: Similarity search over embeddings (pgvector, Pinecone, and similar)
- Chunking strategies and their effect on retrieval quality
- The pipeline: ingest → embed → store → retrieve → inject into the prompt

<h2 id="agents--tool-use" style="font-size:33px;font-weight:800;margin:30px 0 12px;">🤖 Agents &amp; Tool Use</h2>
- The tool-use loop: the model requests a tool call, the application executes it, the result feeds back into the model
- **Model Context Protocol (MCP)**: Open standard for exposing tools and data sources to models
- Orchestration patterns: single agent vs planner plus workers

<h2 id="java-ecosystem" style="font-size:33px;font-weight:800;margin:30px 0 12px;">☕ Java Ecosystem</h2>
- **Spring AI**: Spring Boot starters for calling model providers, embeddings and vector stores
- **LangChain4j**: Java library for chains, memory, tool use and Retrieval-Augmented Generation

<h2 id="evaluation--safety" style="font-size:33px;font-weight:800;margin:30px 0 12px;">🛡️ Evaluation &amp; Safety</h2>
- Hallucinations and grounding; when to force the model to cite retrieved sources
- Evaluation sets and regression testing for prompts
- Guardrails: input validation, output filtering, human approval for sensitive actions
