# ⚙️ Backend

## 📑 Data Structures

### ArrayList
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

#### Pros:

- **Fast random access O(1)**
- **Dynamic sizing**
- **Cache-friendly**
- **Good for read-heavy operations**

#### Cons:

- **Slow insertions/deletions in middle**
- **Resize operation is expensive**
- **Wasted capacity**

### LinkedList
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

#### Pros:

- **Fast insertions/deletions at head/tail O(1)**
- **No resize needed**
- **Good for queue/deque operations**

#### Cons:

- **Slow random access O(n)**
- **More memory per element**
- **Not cache-friendly (scattered in memory)**
- **Poor for read-heavy operations**

### Queues:
First In First out, adds to the tail, removes from the head
### Stacks: 
First in, Last out, adds to the top, removes from the top
### Deques: 
Double ended queues, you can add or remove from the beginning or the end

### Binary Search Tree
- **Structure**: Data structure with 1 data value and 2 pointers left and right
- **Insertion**: O(log n)
- **Traversal**: O(n)
- **Search**: O(log n)
- **Deletion rebalancing**: Take the leftmost child of the right child of the deleted node (El mas izquierdo del hijo derecho del nodo eliminado)
  - Retain rule of smaller to the left, greater to the right

---

## 🔍 Algorithms

### Big O Notation
Notation to measure algorithm efficiency in terms of time and space complexity

- **O(1) Constant**: Time regardless of input size. Example: Array access by index, hash table lookup
- **O(log n) Logarithmic**: Grows slower than input size, divides problem in half each step. Example: Binary search, balanced tree operations
- **O(n) Linear**: Grows proportionally with input size. Example: Single loop, linear search
- **O(n log n) Linearithmic**: Efficient sorting algorithms. Example: Merge sort, quick sort (average), heap sort
- **O(n²) Quadratic**: Nested loops over input. Example: Bubble sort, selection sort, naive string matching
- **O(2ⁿ) Exponential**: Doubles with each input increase. Example: Recursive fibonacci, power set generation
- **O(n!) Factorial**: Grows extremely fast. Example: Generating all permutations, traveling salesman (brute force)

### Algorithm Categories

#### String Manipulation
- **What**: Algorithms that process, transform, or analyze strings
- **Techniques**: Character frequency counting, sliding window, two pointers
- **Examples**: Palindromes, anagrams, reverse string, longest palindrome, valid anagram, string compression

#### Multiple Pointers
- **What**: Use two or more pointers to iterate through data structure
- **Use cases**: Sorted arrays, linked lists, finding pairs/triplets
- **Complexity**: Often reduces O(n²) to O(n)
- **Examples**: Two pointers (start/end), fast/slow pointers, two sum (sorted), remove duplicates, container with most water, cycle detection

#### HashTables
- **What**: Use hash map/set for O(1) lookup to optimize solutions
- **Trade-off**: Space O(n) for time O(1) lookup
- **Examples**: Frequency counting, caching results, two sum, group anagrams, contains duplicate, longest substring without repeating chars

#### Sliding Window
- **What**: Maintain a window that slides through array/string
- **Complexity**: O(n) instead of O(n²)
- **Examples**: Fixed-size window, variable-size window, maximum sum subarray, longest substring without repeating, minimum window substring

#### Greedy Algorithms
- **What**: Make locally optimal choice at each step
- **When to use**: When local optimum leads to global optimum
- **Note**: Doesn't always work, need to prove correctness
- **Examples**: Activity selection, coin change, interval scheduling, jump game, gas station, meeting rooms

#### Backtracking
- **What**: Explore all possibilities by building solution incrementally
- **Complexity**: Often exponential O(2ⁿ) or O(n!)
- **Examples**: Permutations, combinations, subsets, constraint satisfaction, N-Queens, sudoku solver, generate parentheses, word search

#### Divide and Conquer
- **What**: Break problem into smaller subproblems, solve recursively, combine results
- **Complexity**: Often O(n log n)
- **Examples**: Split in half/solve/merge, merge sort, quick sort, binary search, closest pair of points

#### Bit Manipulation
- **What**: Use bitwise operations for optimization
- **Operations**: AND (&), OR (|), XOR (^), NOT (~), shifts (<<, >>)
- **Tricks**: XOR for finding unique, AND for checking bits
- **Examples**: Set operations, single number, counting bits, power of two, reverse bits

#### Graph Algorithms
- **What**: Algorithms for traversing and analyzing graphs
- **Data structures**: Adjacency list, adjacency matrix, union-find
- **Examples**: DFS, BFS, topological sort, shortest path, number of islands, course schedule, clone graph, word ladder, cycle detection

#### Dynamic Programming
- **What**: Break problem into overlapping subproblems, store results
- **Complexity**: Trade space for time
- **Examples**: Top-down (memoization), bottom-up (tabulation), fibonacci, coin change, longest common subsequence, knapsack


### Sorting
- BubbleSort
- SelectionSort
- MergeSort
- QuickSort

### Arrays/Matrix: MxN bidimensional arrays, iteration to find patterns, values

### Search: Iterate to find a pattern, element
- **Binary search**
- **Depth First Search**: Searches a structure deep inside a node before asking his children. Uses recursion and Queues
- **Breadth First Search**: Searches a structure wide first asking neighbors before going deep. Iterates using Queues
- Graphs
- Trees
- Recursion
- Dynamic programming

### Recursion: Functions that call itself, contain an exit condition
- fibonacci

## 🎯 Top Interview Questions

### Graphs

0. [Clone Graph](https://lnkd.in/dV2P2TEs)
1. [Course Schedule](https://lnkd.in/de8Q3NBS)
2. [01 Matrix](https://lnkd.in/dV2P2TEs)
3. [Number of Islands](https://lnkd.in/drT2MpTz)
4. [Rotting Oranges](https://lnkd.in/dUQVwJ-d)

### Arrays

5. [Insert Interval](https://lnkd.in/dfcEDFwB)
6. [3Sum](https://lnkd.in/duGvuCjf)
7. [Product of Array Except Self](https://lnkd.in/dkGkjQVk)
8. [Combination Sum](https://lnkd.in/d3iStbGc)
9. [Merge Intervals](https://lnkd.in/dmFZxrVQ)

### Stacks

10. [Evaluate Reverse Polish Notation](https://lnkd.in/d-y7Zw4C)
11. [Min Stack](https://lnkd.in/dqbh7PeV)
12. [Trapping Rain Water](https://lnkd.in/dS_svBAm)

### Binary Trees

13. [Binary Tree Level Order Traversal](https://lnkd.in/dM-VYbVB)
14. [Lowest Common Ancestor of a Binary Tree](https://lnkd.in/dUvJykgA)
15. [Serialize and Deserialize Binary Tree](https://lnkd.in/dW2cP5Wn)

### Dynamic Programming

16. [Maximum Subarray](https://lnkd.in/dvjYye6E)
17. [Coin Change](https://lnkd.in/d7zZRg7H)

### Binary Search

18. [Search in Rotated Sorted Array](https://lnkd.in/dEuh3gie)
19. [Time-Based Key-Value Store](https://lnkd.in/dbERGKUB)

### Strings

20. [Longest Substring Without Repeating Characters](https://lnkd.in/d_vZrZda)
21. [Minimum Window Substring](https://lnkd.in/de8aeeQD)

### Heap

22. [K Closest Points to Origin](https://lnkd.in/dUtCqYf4)
23. [Find Median from Data Stream](https://lnkd.in/ddDgWqUv)

### Recursion

24. [Permutations](https://lnkd.in/dTUqmAfy)


---
## Data formats
-**Json**:
-**Binary**:
-**Avro**:
-**Protobuffers**:
---

## ☕ Java

### Core

#### Memory Management
- **Heap**: Stores objects
- **Stack**: Stores methods and refs

### OOP

#### Four Pillars
- **Inheritance**: Ability of classes to inherit properties and methods from the superclass by extending its logic
- **Encapsulation**: Protecting the access to fields and methods to keep code integrity
- **Polymorphism**: Ability to perform different behaviors based on the object passed
- **Abstraction**: Hides the implementation details

#### Key Concepts
- The compiler sees only the methods in the ref class (left assign)
- But executes the instance's method (right assign)

#### Override/Overload
When working with objects:
- The overridden methods run the instance method (runtime)
- The overloaded methods take the reference method (compile time)

#### equals()/hashCode()
- **equals()**: Compares if two objects are meaningfully equal
- **hashCode()**: Generates a hashCode for placing the object in a collection Hashxxx
- If two objects are equal, their hashcodes must be equal as well
- Consider the same attributes for equals and hashcode

### Exceptions

#### Checked
- Extend from Exception. Compile time
- You can recover
- IOException, SQLException, ClassNotFoundException

#### Unchecked
- Extend from RuntimeException. Run time
- You can't recover
- NullPointerException, ClassCastException, IndexOutOfBoundException, ArithmeticException

### Errors
- Errors represent serious problems that are typically beyond the control of the application, such as system failures or resource exhaustion
- Errors are subclasses of the java.lang.Error class, and they are not meant to be caught or handled by regular application code
- Examples of errors include OutOfMemoryError and StackOverflowError

### Collections

#### Hierarchy
- **Collection**: Super class of all the other collections
- **Collections**: Utility class that contains methods to work with collections

#### List (Interface)
- **Properties**: Ordered, Duplicated, Indexed
- **ArrayList**: Has a backing array (init size 10 doubling as req), best performance, O(1)
- **LinkedList**: Double linked (next node, previous node), also implements Queue, lower performance, O(n), add/remove from Head and Tail

#### Set (Interface)
- Uses the equals/hashcode method to define uniqueness
- **SortedSet (Interface)**: Order insertion
- **HashSet**: Based on HashMap
- **TreeSet**: Implements SortedSet, elements are sorted, tree structure, implements SortedSet (Ordered) and NavigableSet

#### Queue (Interface)
- Orders elements as FIFO, supports ordering
- **LinkedList**: Works as a queue and list, less efficient
- **ArrayDeque**: Double ended queue, stores in a resizable array, pure, more efficient

#### Map (Interface)
- Maps key value pairs, no duplicates
- **HashMap**: Stores keys in a hash table
- **TreeMap**: Stores keys in a sorted way
- **LinkedHashMap**: Stores keys in the insertion order

#### Comparable<T>
- Natural order
- implements int objOne.compareTo(T objTwo)
- returns 0 if = arg, returns -1 if < arg, returns 1 if > arg
- Only one sort sequence can be created

#### Comparator<T>
- Multiple, defined by programmer
- implements int compare(T objOne, T objTwo);
- returns objOne.getAttribute().compareTo(objTwo.getAttribute())
- Many sort sequences can be created

#### Conversions
- **Arrays**: collection.toArray()
- **List and Set**: List list = Arrays.asList(array)

### Functional Interfaces

Contain only one abstract method, may contain any static or default methods

```java
Consumer<String> c2 = x -> System.out.println(x); c2.accept("Annie");
Function<String, Integer> f2 = x -> x.length(); f2.apply("cluck");
Predicate<String> p2 = x -> x.isEmpty(); p2.test("");
Supplier<StringBuilder> sb2 = () -> new StringBuilder(); sb2.get();
UnaryOperator<String> u2 = x -> x.toUpperCase(); u2.apply("chirp");
```

### Streams

It's like a wrapper for treatment and processing of big collections like a pipeline function

#### Operation Types
- **Intermediate operations**: Don't terminate the stream
- **Terminal operations**: Terminate the stream. Collectors, reductors, forEach
  - **Need all**: Require all elements to operate
    - forEach
    - count
  - **Short circuit**: Any matching element can be enough
    - allMatch
    - noneMatch

Streams should not affect external things, instead of altering a collection with foreach use collect, reduce

#### Stream Constructors
```java
collection.stream()
Stream.empty()
Stream.of("one","two")
Arrays.stream(array)
```

#### Pattern Map/Filter/Reduce
Transforms(apply functions, change type, maintain order) data → Filter(apply predicates, maintain types, remove objects) → Collect(apply bifunction, Aggregate) result

#### Mapping Stream Types
- **mapToObj**: primitives to objects
- **mapToInt,Long,Double**: object to primitives

#### Collectors
```java
Map<K,V> map = Collectors.groupingBy(Function, collection); //returns multiple values
Map<K,V> map = Collectors.partitioningBy(Predicate, collection); //returns only two values
```
#### File to Stream
```java
Stream<String> lines = Files.lines(path,encoding);
```

### Optional

Wrapper that could contain a value or not

- **isPresent()**: validates if contains a value
- **get()**: if present returns value, else throws an exception
- **ifPresent(Consumer c)**: if present calls consumer with value, else does nothing
- **orElse(T other)**: if present returns value, else returns other
- **orElseGet(Supplier s)**: if present returns value, else returns the supplier result
- **orElseThrow(Supplier s)**: if present returns value, else throws exception created by calling supplier

### Concurrency

#### Creation
- Implement Runnable (void)
- Implement Callable (<T> return result)
- Extend Thread
- **ExecutorService**:
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
- **ForkJoinPool**: Uses recursion to finish a task
  - RecursiveAction: Like execute()
  - RecursiveTask<T>: Like submit()

#### Atomics
Atomic(primitives) supports thread safe operations

#### Java Reflection
Extract and invoke methods from a class whose code we don't have access
```java
Method[] metodos=c.getClass().getMethods()
String cadena=(String) m.invoke(c, null)
```

#### Reactive Programming
Declarative asynchronous style of programming that reacts to events
- Nonblocking
- Asynchronous
- Functional/Declarative

**Interfaces**:
- Publisher
- Subscriber
- CompletableFuture

---

## 🌱 Spring Framework

### Spring Core

#### Core Concepts
- **Dependency Injection**: Allow to inject dependencies dynamically
- **Inversion of Control**: Passing the control of how to create object from the programmer to the framework

#### Core Container
- **Factory for managing beans**: Spring container manages object lifecycle
- **Application Context**: Main interface for Spring IoC container

#### Infrastructure
- **Aspect Oriented Programming**: Add functionality to objects declaratively. Logging, Security, Transactions
- **AOP**: Aspects
- **Instrumentation**: JMX (Java Management Extension) Remotely monitoring apps
- **Messaging**

#### Data Access Layer
Handles JDBC
- **JDBC**: Helper classes for managing DB
- **ORM**
- **Transactions**
- **OXM**
- **JMS**: Messaging service

#### Web Layer
MVC Framework
- **Servlet**
- **Web Socket**
- **Web**
- **Portlet**

#### Test Layer
Support for TDD. Mocking objects and out of container testing
- **Unit**
- **Integration**
- **Mock**

#### Beans
- A "Spring Bean" is simply a Java object
- When Java objects are created by the Spring Container, then Spring refers to them as "Spring Beans"
- Spring Beans are created from normal Java classes .... just like Java objects

#### Scopes
- **Singleton**: Only one instance per container (default scope)
- **Prototype**: A bean instance for each container request
- **Request**: Scoped to an http request
- **Session**: Scoped to an http session
- **Global session**: Scoped to a global session

#### Bean Lifecycle
Instantiation > Populate properties(injected, fileconfig) > BeanNameAware Context(aware to other resources) > BeanFactoryAware (aware to context) > ApplicationContextAware > PreInitialization > Init() > PostInitialization() > Ready > Container Shutdown > Destroy() > Terminated

#### Application Context Implementations
The Spring framework provides several implementations of the ApplicationContext interface: ClassPathXmlApplicationContext and FileSystemXmlApplicationContext for standalone applications, and WebApplicationContext for web applications

**WebApplicationContext**: Creates objects and handles the lifecycle. Extends the ApplicationContext

#### Injection Types
- **Constructor injection**: Through constructor. When the class cannot function without the dependent class. Immutability
- **Setter Injection**: Through setters. When the class can function without the dependent class. Changeable dependencies
- **Field Injection**: Through fields. Avoid. Tight coupling. Immutability

---

### 🚀 Spring Boot

#### Annotations

##### Component Annotations
- **@Component**: Generic stereotype for any Spring managed component, indicates a bean is created
- **@Repository**: Stereotype for persistence layer, Provides the data, database interaction, mapping
- **@Service**: Stereotype for service layer, Business logic, data manipulation, starts transactions
- **@Controller**: Stereotype for presentation layer (spring mvc), Process requests, builds response
- **@RestController** (@Controller & @ResponseBody): Stereotype for REST controller

*Annotations should be placed on the implementation, not the interface maintain decoupling*

##### Configuration Annotations
- **@Configuration**: Declares that the class contains @Bean methods to be processed by the Spring container
- **@ComponentScan**: Configures which packages to scan for classes
- **@EnableAutoConfiguration**: Autoconfigures beans based on the classpath
- **@SpringBootApplication** (@SpringBootConfiguration, @EnableAutoConfiguration, @ComponentScan): Stereotype marking a class for bootstrapping and setting the @ComponentScan from that class level down

##### Web Annotations
- **@RequestMapping**: Indicates the mapping of the request to a path
- **@GetMapping, @PostMapping**, etc: Mark controller to respond to the http method
- **@RestController**(@Controller && @ResponseBody): Marks as a controller that returns data
- **@PathVariable**: Maps a path var to a param in spring
- **@RequestParam**: Maps a query param to a java param
- **@PathParam**: Maps a path param to a param in jaxrs
- **@RequestBody**: Deserializes HttpRequest (JSON) to an object
- **@ResponseBody**: Serializes the object and sends it as a response (JSON)
- **@Value**: For injecting values from the properties/yml file

##### Transactional
- **@EnableTransactionManagement**: Use in a @Configuration class to enable transactional support

##### Request/Response Entities
- **RequestEntity**
- **ResponseEntity**

##### Run on Start
- **CommandLineRunner**: Receives argument
- **ApplicationRunner**

---

### 🌐 Spring MVC

#### Architecture
Controller > Model > View
Web browser > Request > DispatcherServlet
DispatcherServlet (Entry point) > Controller(pass/request data to the model) > View
View > renderize data/view to the browser

#### Spring MVC Configuration
- Configure DispatcherServlet
- Setup URL mappings to the DispatcherServlet
- Setup ComponentScanning
- Configure conversion, formatting, validation
- Configure ViewResolver

#### Mapping Concepts
- **Servlet Mapping**: Which web container of the Java servlet should be invoked for a given URL. The Servlet container decides which Servlet it should forward the request to
- **Request Mapping**: Maps a Request to a controller method to invoke as a response to the request
- **View Resolver**: Locates the view to rendered as a response to a request (application.properties prefix + suffix)

#### Template Engine
- **Thymeleaf**: Replace JSP

---

### ⚡ Spring WebFlux

#### Characteristics
- **Nonblocking API** (Servlet v3.1)
- **Asynchronous nature** (like callbacks) though messages
- **Publisher/Subscriber model** through a Subscription
- **Functional/Declarative style**
- **Functional programming**: Pure functions, Lambdas, Immutability
- **Concurrent connections** handles by few threads
- **Continuous stream of data** live connection(MediaType.TEXT_EVENT_STREAM_VALUE)

#### Reactive Streams
1. Subscriber > subscribe() > Publisher
2. Subscription is created
3. Publisher > onSubscribe(Subscription) > Subscriber
4. Subscriber > request() > Subscription
5. Publisher > onNext() > Subscriber
   - If no more elems: Publisher > onComplete() > Subscriber > Subscription cancelled
   - If error: Publisher > onError() > Subscriber > Subscription cancelled

**Properties**: ASYNC, NONBLOCKING, BACKPRESSURE

##### Interfaces
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

### Project Reactor (Reactive Library)
- **FLUX**: Publish [0... n] for Object or void
- **MONO**: Publish [0,1] for Lists
- Flux and Mono are implementations of the Publisher interface

### ServerWebExchange
Reactive container
- **ServerHttpRequest**: Reactive request
- **ServerHttpResponse**: Reactive response

### Functional Endpoints
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

#### RequestPredicate Class
```java
public abstract class RequestPredicate{
    static RequestPredicate accept(MediaType... mediaTypes) // tests if the request contains a particular accept header
    static RequestPredicate GET(String pattern) // checks if the request pattern matches against the request path
    static RequestPredicate method(HttpMethod method) // to test any request http method
    static RequestPredicate path(String pattern) // test against the given path pattern
}
```

#### Functional Endpoint Example
```java
RouterFunctions<ServerResponse> myRoute =
    RouterFunctions.route(
        RequestPredicates.path(/products), // test if the request was made against the path
        request->Response.ok().body(productFlux) // pass an implementation of the handler function interface
    );

// or

RouterFunctions<ServerResponse> myRoute =
    RouterFunctions.route()
    .RequestPredicates.GET("/product",handler::getProduct)
    .RequestPredicates.POST("/product",handler::saveProduct)
    .build();
```

---

# 🗄️ Database

## CAP Theorem
- **Consistency**: Data is consistent across all the nodes
- **Availability**: Data is available at any time
- **Partition Tolerance**: System does not fail regardless any data drop or updated in any node

*Only two of these requirements can be achieved at a time. Not all three may be possible*


## 🗃️ SQL

### Database Operations
```sql
CREATE DATABASE name -- creates database
CREATE TABLE name (id int, field1 varchar, field2 varchar) -- creates table
ALTER TABLE name ADD column_name -- adds a new column
ALTER TABLE name DROP column_name -- deletes a column
DROP TABLE name -- deletes a table
DROP DATABASE name -- drops a database
```

### Query Operations
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

### Joins
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

### Advanced Operations
- **UNIONS**: combines queries in the same resultset if the columns match the number and types
- **CREATE VIEW** name AS query: virtual table from query
- **CREATE INDEX** name ON table (fields): creates an index to accelerate search on those fields

### Relations
- **1 TO MANY**: By FK
- **MANY TO MANY**: Should be avoided and modeled as a joining table

### Database Tuning Techniques
- **Indexing**: CREATE INDEX index_name ON table (column);
- **Views**
- **Partitioning**
- **Caching**
- **Denormalization**, duplication with load balancers
- **Separate write/read master/slave**

### Concurrency
#### Locks
- **Exclusive locking (write lock)**: while one transaction is running with update/insert/delete statements, this lock prevents other transactions from accessing the same data until the first transaction finishes
- **Shared locking (read lock)**: While one transaction is running select, other transactions are prevented from update/insert/delete the same data until the read finishes. Other transactions can read the data.

### ACID Properties
- **Atomicity**: A transaction should be executed as a single unit
- **Consistency**: Data should be consistent with the restrictions/rules
- **Isolation**: One operation should not affect the result of other transactions
- **Durability**: There's no data loss in case of failure



## 🔗 ORM

### Definitions
- **ORM**: Object Relational Mapping
- **JPA**: Java Persistence API
- **JDBC**: Java Database Connectivity and provides a set of Java API for accessing the relational databases from Java

### JPA vs Hibernate
- **JPA**: Specification
    - EntityManagerFactory
- **Hibernate**: Implementation
    - SessionFactory

## 📊 Spring Data JPA

### Annotations
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

### Constants
- **GenerationType**(strategy = TABLE,AUTO,IDENTITY,SEQUENCE)
- **FetchType**(fetch = EAGER,LAZY)
- **CascadeType**(ALL,PERSIST,MERGE,REMOVE,DETACH,LOCK,REFRESH,REPLICATE,SAVE_UPDATE)
- **EnumType**(ORDINAL,STRING)

### Repository
**CrudRepository<T,ID>**


## 🐻 Hibernate

### Hibernate Objects
- **Configuration**: Represents a configuration or properties file required by the Hibernate
- **SessionFactory**: Configures Hibernate for the application using the supplied configuration file and allows for a Session object to be instantiated
- **Session**: Used to get a physical connection with a database
- **Transaction**: Represents a unit of work with the database and most of the RDBMS supports transaction functionality
- **Query**: Uses SQL or Hibernate Query Language (HQL) string to retrieve data from the database and create objects
- **Criteria**: Used to create and execute object oriented criteria queries to retrieve objects

### Configuration Steps
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

### persistence.xml Example
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

### Mapping Annotations
1. Map class to table
2. Map fields to columns

#### Core Annotations
- **@Entity**: Marks the class as a DB entity
- **@Table**(name="table_name"): Indicates the mapping table
- **@SecondaryTables** and **@SecondaryTables**: defines secondary tables and the logic for populating those tables
- **@Id**: Indicates the field is an id
- **@GeneratedValue**(strategy=GenerationType.IDENTITY): Defines strategy for the autogeneration id
- **@Column**(name="column_name"): Indicates the mapping column
- **@Access**(AccessType.Type): Method to access the persistent state of the entity:
    - AccessType.FIELD: Based Annotations on fields
    - AccessType.PROPERTY: Based Annotations on methods

#### Composite Keys
- **@Embeddable**: Marks a class as being embedded inside another class
- **@EmbeddedId**: Marks a field to be used for an @Embeddable class
- **@Transactional**: marks the methods as transactional and removes the need to call the methods beginTransaction, commit

*Hibernate needs empty constructors*

### Relationships
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

### SessionFactory
Reads the config, creates session objects, create only once in your app

### Session
Wraps JDBC connection, used for saving retrieving objects from db, Retrieved from SessionFactory

### Entity Lifecycle
- **Detach**: Not associated with a hibernate session
- **Merge**: Merging will reattach to the session
- **Persist**: Managed state. Next commit will save to db
- **Remove**: Managed entities will be removed. Next commit will delete them from db
- **Refresh**: sync to db

### Cascade Types
Persist, Remove, Refresh, Detach, Merge, All

---

## 📄 NoSQL

### Database Types
- **Key-Value**
- **Wide Column**
- **Graph**
- **Document**: MongoDB

### Database Mapping
- **DB** → DB
- **TABLES** → COLLECTIONS
- **ROW** → DOCUMENTS
- **COLUMN** → FIELD
- **INDEX** → INDEX
- **JOIN** → EMBEDDING & LINKING


### 🍃 MongoDB

#### Characteristics
- Has C&P from CAP theorem
- Uses documents (JSON - BSON: EXTENDED JSON)

#### Features

##### Indexes
Support efficient execution of queries
**Types**:
- Single Field
- Multikey
- Text
- Geospatial
- Hashed
- Compound

##### Aggregation Pipeline
A framework for data aggregation modeled on the concept of data processing pipelines

##### Replica Sets
A group of mongodb processes that maintain the same data sets to provide redundancy and high availability

##### Sharding
A method to distribute data across multiple machines

### Commands

#### Database Operations
- **use database**: select database
- **show databases**: shows available databases
- **show collections**: show collections
- **create collection**: db.createCollection("collection")

#### CRUD Operations

##### CREATE
```javascript
db.collection.insertOne({object})
insertMany([array])
```

##### READ
```javascript
db.collection.find({object})/findMany():
// filter: query: {attribute: {$operator: value}}, {"attribute.sub":value} , {$and: [{amount: {$lte: 11}},{"awards.wins":3}]}
// projection: select fields: db.collection.find({attribute: value}, {attr1: 1, attr2: 1, attr3: 0}) (true/1: include, false/0: exclude)
// sort({attr: value}): 1/-1: ASC/DESC
// limit(n): limits results
// readConcern("type"): specifies read Concern
```

##### UPDATE
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

##### DELETE
```javascript
db.collection.deleteOne(): db.collection.deleteOne({attr:value})
db.collection.deleteMany(): db.collection.deleteMany({attr:value})
db.collection.remove(): db.collection.remove({attr: value}, true) // (true for only one, no param, remove all). db.collection.remove({}) erases all the data from collection
```

### Query Operators
- Comparison
- Logical
- Element
- Evaluation
- Geospatial
- Array
- Bitwise

### Query Projection
Specifies the fields to return in the document that match the query (true/1: include, false/0: exclude)

### Concern

#### Read Concern
Allows to control the consistency and isolation properties of the data read from replica sets and shards
- **Local**: reading from primary replica, may not exists in other replicas
- **Available**: reading from secondary replica, data may not be replicated to the majority of replicas
- **Majority**: default for all the fixed operators, data acknowledged by majority of replicas
- **Linearizable**: returns data that has the majority of successful writes previous to the read operation
- **Snapshot**: Multidocument transaction, reads from majority of committed data

#### Write Concern
Level of acknowledgement requested from mongodb for write operations. Level of consistency across replicas
- **w1**: Ack only from primary
- **w0**: No ack
- **w(n)**: Ack primary + (n-1) secondary: (All nodes-1 always including primary)
- **w: majority**
- **wtimeout**: the limit to prevent write operations from blocking indefinitely


### ⚡ DynamoDB

- **DynamoDB**: Key-value database

---

# 🔒 Security

## Authentication vs Authorization
- **Authentication**: Verifying WHO you are (identity)
- **Authorization**: Verifying WHAT you can access (permissions)

## Authentication Methods

### Session-Based Authentication
- **How**: Server creates session, stores session ID in cookie
- **Flow**: Login → Server creates session → Session ID in cookie → Client sends cookie → Server validates
- **Stateful**: Server must remember sessions
- **Pros**: Simple, server control, instant revocation
- **Cons**: Not scalable, CSRF vulnerable, poor multi-server support

### Token-Based Authentication (JWT)
- **How**: Server creates signed token, client stores and sends it
- **Flow**: Login → Server creates JWT → Client stores token → Client sends in Authorization header → Server validates signature
- **JWT Structure**: `header.payload.signature`
  - Header: Algorithm and token type
  - Payload: Claims (user data, expiration)
  - Signature: Ensures token integrity
- **Stateless**: Server doesn't store tokens
- **Pros**: Scalable, cross-domain, mobile-friendly
- **Cons**: Can't revoke before expiration, larger size, XSS vulnerable

### OAuth 2.0
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

### Single Sign-On (SSO)
- **What**: One login for multiple applications
- **Protocols**:
  - SAML 2.0: XML-based, enterprise standard
  - OpenID Connect (OIDC): Built on OAuth 2.0, modern
- **Flow**: Access App A → Redirect to IdP → Login once → IdP sends token → Access App B (no login)
- **Benefits**: Better UX, centralized management, reduced password fatigue

### Multi-Factor Authentication (MFA/2FA)
- **Factors**:
  - Something you know: Password, PIN
  - Something you have: Phone, hardware token
  - Something you are: Fingerprint, face
- **Types**: SMS codes, TOTP (Authenticator apps), Hardware tokens (YubiKey), Biometrics

### API Keys
- **What**: Simple token for API access
- **Use case**: Third-party API, service-to-service
- **Pros**: Simple, easy to implement
- **Cons**: No expiration, no user context, hard to rotate

### Basic Authentication
- **What**: Username:password encoded in Base64
- **Header**: `Authorization: Basic dXNlcjpwYXNz`
- **Pros**: Simple, built into HTTP
- **Cons**: Not secure (easily decoded), must use HTTPS

### Certificate-Based Authentication
- **What**: Uses digital certificates (X.509)
- **Use case**: Enterprise, high-security environments

## Authorization Methods

### Role-Based Access Control (RBAC)
- **What**: Permissions based on roles
- **Structure**: User → Role → Permissions
- **Example**: Admin, User, Guest

```java
@PreAuthorize("hasRole('ADMIN')")
public void deleteUser() { }
```

### Attribute-Based Access Control (ABAC)
- **What**: Permissions based on attributes
- **Attributes**: User attributes, resource attributes, environment
- **Example**: Allow if user.department == resource.department AND time < 5pm

### Access Control Lists (ACL)
- **What**: Permissions per resource
- **Example**: File permissions (read, write, execute)

## Security Best Practices

### Token Storage
- **Best**: HttpOnly cookies (prevents XSS)
- **Better**: sessionStorage
- **Never**: localStorage (XSS risk)

### Token Refresh Strategy
- **Access Token**: Short-lived (15 min)
- **Refresh Token**: Long-lived (7 days), HttpOnly cookie
- **Flow**: Access token expires → Use refresh token → Get new access token

### Password Security
- **Hash**: bcrypt, Argon2, PBKDF2 (never plain text)
- **Salt**: Random value added before hashing
- **Pepper**: Secret value added (stored separately)

### Common Attacks & Prevention
- **CSRF**: Use CSRF tokens, SameSite cookies
- **XSS**: Sanitize input, Content Security Policy
- **SQL Injection**: Use prepared statements
- **Brute Force**: Rate limiting, account lockout

## Recommended Stack

### Modern Web App
- **Authentication**: JWT (access) + Refresh tokens (HttpOnly cookie)
- **Authorization**: RBAC
- **Social login**: OAuth 2.0 / OIDC
- **MFA**: TOTP (Google Authenticator)

### Enterprise
- **SSO**: SAML 2.0 or OIDC
- **Authorization**: RBAC or ABAC
- **MFA**: Required

## Legacy Security Concepts
- **Transport Layer Security(TLS)**: Encryption protocol for secure communication
- **SSL Certificates**: Digital certificates for HTTPS
- **Client Certificate**: Public key authentication
- **On behalf**: Microservice passes user credentials to other services
- **Encryption**: Use standard algorithms (AES, RSA)
- **Firewalls**: Network security
- **Pentesting**: Security testing
- **Automated Security Tests**: Verify API rejects unauthorized callers



---

# 🏢 System Design

## System Design Principles

### High Availability
- **Redundancy**: Availability zones, Fallback, Data replication
- **Switching between servers**: DNS, Load balancers, Reverse proxy, API gateway, Service discovery
- **Protecting against client behavior**: Load shedding, Rate limiter, Shuffle sharding, Cell based architecture
- **Protecting against failures**: Timeouts, Circuit breaker, Bulkhead, Retries
- **Detecting failures**: Monitoring, Logging

### Scalability
- **Vertical**: Adding compute power (Scale up)
- **Horizontal**: Adding servers/replicas (Scale out)
- **Elasticity**: Ability to acquire resources as needed and release them when not needed

### Performance
- **Latency**: Time to get a response
- **Bandwidth**: Rate of data transfer across a given path
- **Throughput**: Rate at which something is processed

### Durability
- **Backup**: Copy data periodically and store it elsewhere
- **RAID**: Redundant storing of information
- **Replication**: Copying the data to another machines
- **Checksum**: For preventing data corruption

### Consistency
- **ACID**: Database constraints are not violated when transactions are executed
- **BASE**: NoSQL consistency model
- **CAP Theorem**: Consistency, Availability, Partition Tolerance

## Hardware

### Compute Environment
- **Physical Server**: Complete control, expensive, hard to manage
- **Virtual Machines**: Cheaper, easier to maintain, hypervisor-based
- **Containers**: Lightweight, portable, container engine-based
- **Serverless**: Cloud provides all resources, event-driven

## Communication

### Request/Response
- **Sync**: RequestResponse
- **Async**: Messaging

### Async Messaging
- **Message Queues**: Only a single consumer gets the message
- **Publisher/Subscriber**: All subscribers get the message

### Network Protocols
- **TCP**: Reliability over time, connection-oriented
- **UDP**: Time over reliability, connectionless
- **HTTP**: Request/Response protocol

## SOLID Principles
- **Single Responsibility**: A class should have only one responsibility
- **Open Closed**: Open for extension, closed for modifications
- **Liskov Substitution**: You should be able to substitute classes when using inheritance
- **Interface Segregation**: Do not implement things that you don't need in your interfaces. Small granularity
- **Dependency Injection**: Your code should depend on abstractions, not implementations

## Design Principles
- **DRY**: Don't repeat yourself (code)
- **Encapsulate what changes**
- **Favor composition over inheritance**
- **Program against an interface, not implementations**

## Design Patterns

### Creational
- **Factory**: Delegates the creation to another class, hides creation logic
- **Singleton**: Returns a single instance of an object
- **Builder**: Makes a complex object immutable upon construction, avoids the need to write many constructors

### Behavioral
- **Strategy**: Use composition to delegate behaviors

### Structural
- **Adapter**: Create new interfaces that act as a bridge between incompatible interfaces

## Microservices Patterns
- **Api Gateway/Backend For Frontend**: acts as a single entry point for the frontend calls
- **Shared Event Bus/Message Queues**: uses a bus to communicate ms async by using messages
- **Service Registry**: Keeps a directory of the services with ip addresses for discovery
- **Blue Green swap**: swap the passive service to the active with the new code blue>green

## Distributed Design Patterns
- **Circuit Breaker**: Between client and server. Allows all calls to go through. If enough errors are detected, it blocks the calls and fails fast
- **Bulkhead**:
- **Saga**:

- **Libraries**Resilience4j, Polly

## Architecture Types

### DB Centric Architecture
Has a database at the center of the application and its divided in the layers:
- **UI**
- **Business Logic**
- **Data Access**: DB

### Domain Centric Architecture
The domain is at the center of the application and the layers are divided in:
- **Presentation**: UI
- **Application**: Abstractions for the use cases for of the app
- **Domain**: Abstractions for the problem/business domain
- **Persistence**: Interface with the storage/DB
- **Infrastructure**: Interface with the operative system and 3rd party dependencies
- **Crosscutting**: Aspects common to all projects of the app
- **Specification**: Acceptance tests verifying the functionality of the application

### Functional Organization
Separate the layers by functionality

## Design Tips
- Understand the problem
- Ask questions about:
    - Features
    - Users
    - Scaling
    - Stack
- Design the most critical components first

## Requirements

### Functional Requirements
Describe behavior: APIs, Operations supported

### Non-Functional Requirements
Describe qualities: Scalable, Fast, Secure

---

# 🔧 DevOps

## 🚀 Features
- **Automationm**
- **CI/CD**
- **Monitoring**
- **Collaboration**
- **Infrastructure as Code**

## 🔄 SDLC
- **Requirement gathering**: Interact with the user to understand wht the software should do, features
- **Analysis**: Analyse the requirements and understand how to build the software, roadmap for development
- **Design**: Design the architecture of the software, components, interactions, technologies, ui
- **Coding**: Write the code
- **Testing**: Test the software functionality to ensure it meets the requirements and is free of bugs
- **Deployment**: Deploy the software to a production environment
- **Maintenance**: Ongoing support and maintenance of the software, improvements, bug fixes


## 🐳 Docker

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

## ☸️ Kubernetes

### Structure
Deployment contains > Pods contains > Containers

### Nodes
- **Master node**: Takes decisions about the cluster
- **Worker node**: Carries on work

### Components
- **apiserver**: exposes API to communicate with the master node
- **kubelet**: Main kubernetes agent
- **kube-proxy**: Networking component

### Commands
```bash
kubectl get nodes
kubectl apply -f pod.yml
kubectl get pods --watch
kubectl describe pods hellopod
kubectl delete -f pod.yml
```

## ☁️ Cloud

### 🟠 AWS

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

## 🏢 Infrastructure as Code

### 🟣 Terraform
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

## 📚 Git

### Concepts
- **Merging strategies**
- **Rebase vs Merge**
- **Cherry pick**

## 🔄 Jenkins
- **Jenkinsfile**: Descriptor file for configuring the pipeline
- **Pipeline block**: the complete script
- **Agent**: the agent that's going to run the pipeline
- **Stages**: Stages of the pipeline
- **Steps**: Steps in the stage


---


# 🌐 Frontend

## 🌐 HTML5
- Audio/Video
- Web Workers/Service Workers (Threads js)
- Local Storage (global)
- Session Storage (tab)

## 🎨 CSS
- Box model: margin (external), padding (internal)
- CSS selectors and combiners
- Specificity

## 📜 JavaScript
- **Scopes**
- **Callbacks**: A function that be passed as argument to be called later
- **Hoisting**: JS automatically moves all variable declarations at the top when compiling
- **Closures**
- **Promises**
- **Async functions**
- **Await operations/methods**

## 🔷 TypeScript
- **Superset of JS**: All JS code is valid TS code
- **Transpiled to JS**: TS code is converted to JS code
- **Static typing**: Types are checked at compile time
- **Optional typing**: Types can be omitted and inferred
- **Modern JS features**: ES6+ features like classes, modules, arrow functions, destructuring, etc

```bash
npm install -g typescript
```


### Testing
```javascript
// Jasmine
it("should be called", function() {})
beforeEach/beforeAll/afterEach/afterAll
expect().equals()
spyOn() // listener
toHaveBeenCalled()/toHaveBeenCalledWith(x,y)
```


#### Features
- **Type Annotations**: `let x: string = 'My string';`
- **Type Inference**
- **Union types**: `let somevalue: number | string`
- **Type assertions**: `let fixedstring: string = (value as number).toFixed(4)`
- **Optional parameters**: `message?: string`
- **Typed functions**: `function(): string{}`

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

## 🧪 Testing

### ⚙️ Unit Testing
- **JUnit**: Java testing framework
- **Mockito**: Mocking framework

#### Annotations
```java
@Before // For preparing data before being tested
@After // For finalizing using resources after the test
@Test // for marking a method as a runnable test
@MockBean, @Mock // for marking an object as a bean to be mocked
```

### 🔗 Integration Testing
- **Selenium**: Web application testing

### 🚀 Performance Testing
- **JMeter**: Load testing tool
- **CURL Scripts**: Command-line testing

---

# 📖 Recommended Books

### ☕ Java Books
- Java Precise
- Java the Complete Reference
- Java Language Specification
- Effective Java

### 🎨 Design Patterns
- Head First Design Patterns
- Java Design Patterns Essentials

### 🔄 Concurrency
- Java Concurrency in Practice

---

*This comprehensive study guide covers all essential backend development concepts from data structures and algorithms to modern cloud technologies and best practices.*