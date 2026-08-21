# Design Patterns: Elements of Reusable Object-Oriented Software (the "Gang of Four" book)

Source: Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides, *Design Patterns: Elements of Reusable Object-Oriented Software* (Addison-Wesley, 1994, 417 pages). The foundational catalog of 23 object-oriented design patterns; examples in the original are C++ and Smalltalk. Sampled: the full pattern intent list (front matter), and a detailed read of Chapter 1's core design-principles discussion (pages 20-31: favor composition over inheritance, delegation, parameterized types, designing for change, the causes-of-redesign table, application/toolkit/framework distinctions, and how to select/use a pattern).

This is the canonical source that essentially every later design-patterns book (including `head-first-design-patterns.md` and `design-patterns-explained.md` in this folder, and the OCP exam's design-patterns chapter in `doc/references/Java/ocp-java-se8-programmer-2.md`) draws its vocabulary and pattern definitions from. This file captures the book's foundational principles precisely (its own words, not later simplifications) plus a complete, accurate catalog of all 23 patterns' intents and classification — the other two files in this folder go deeper on individual pattern walkthroughs and mnemonics without repeating this structural overview.

## The Two Foundational Principles

The book states these as its core, recurring design guidance, restated implicitly by nearly every pattern in the catalog:

1. **"Program to an interface, not an implementation."** Committing to a concrete class when creating or depending on an object locks in an implementation choice that becomes expensive to change later. Depending on an abstract interface instead lets the concrete implementation vary independently of the code that uses it.
2. **"Favor object composition over class inheritance."** Inheritance is the more immediately obvious reuse mechanism, but the book explicitly states designers **overuse inheritance**, and that designs are "often made more reusable (and simpler) by depending more on object composition." The stated trade-off: composition lets behavior change at runtime and doesn't require creating new classes for every combination of behavior, but it requires more indirection and can make a design's structure harder to read purely from its class hierarchy (since the interesting behavior lives in a network of composed *objects* at runtime, not in the static compile-time class hierarchy).

### Delegation
Presented as "an extreme example of object composition" and the concrete mechanism for realizing principle 2: a receiving object forwards ("delegates") an operation to a separate delegate object, passing itself as needed so the delegate can call back. The book's illustrative example: instead of `Window extends Rectangle` (inheriting rectangle behavior because windows happen to be rectangular), give `Window` a `Rectangle` instance field and forward area/geometry operations to it explicitly. Advantage: a `Window` can become circular at runtime just by swapping in a `Circle` instance instead of a `Rectangle` (assuming a shared interface) — impossible with static inheritance. Named cost: highly dynamic, delegation-heavy designs are harder to read than static ones, so delegation is worth it "only when it simplifies more than it complicates" — best used in the standardized, recognizable shapes that patterns like State, Strategy, and Visitor give it, rather than ad hoc.

### Compile-Time Structure vs. Run-Time Structure
A point the book emphasizes and later design-patterns literature often loses: **an object-oriented program's class hierarchy (fixed at compile time) often bears little resemblance to its actual object collaboration graph at runtime** (which changes constantly as objects are created, composed, and communicate). Understanding one from the other is described as being "like trying to understand the dynamism of living ecosystems from the static taxonomy of plants and animals." Patterns with **object scope** (Composite, Decorator, Observer, Chain of Responsibility in particular) exist specifically to build and manage complex runtime structures that the class diagram alone won't reveal — a good answer to "why can't I just read the class hierarchy to understand how this system actually behaves at runtime."

Two specific relationship types worth distinguishing, per the book: **aggregation** (one object owns/is responsible for another; they share the same lifetime) versus **acquaintance/association** (one object merely knows of another, can request operations of it, but isn't responsible for it — a much looser, more transient coupling). The distinction is about *intent*, not language mechanics — both are typically implemented as plain object references in most languages, so the difference has to be understood from design intent, not read off the code.

## Designing for Change: The Causes-of-Redesign Table

The book frames the entire pattern catalog as a response to eight common, recurring causes of costly redesign, each mapped to the specific patterns that address it — a genuinely useful lookup table for "which pattern should I even be looking at":

| Cause of redesign | Patterns that address it |
|---|---|
| Creating an object by specifying a class explicitly (locks in an implementation) | Abstract Factory, Factory Method, Prototype |
| Dependence on specific operations (hard-coded request handling) | Chain of Responsibility, Command |
| Dependence on hardware/software platform | Abstract Factory, Bridge |
| Dependence on object representations or implementations | Abstract Factory, Bridge, Memento, Proxy |
| Algorithmic dependencies (algorithm likely to change) | Builder, Iterator, Strategy, Template Method, Visitor |
| Tight coupling (classes too interdependent to reuse in isolation) | Abstract Factory, Bridge, Chain of Responsibility, Command, Facade, Mediator, Observer |
| Extending functionality by subclassing (class explosion, fragile overriding) | Bridge, Chain of Responsibility, Composite, Decorator, Observer, Strategy |
| Inability to conveniently modify an existing class (no source access, or too many dependent subclasses) | Adapter, Decorator, Visitor |

The book's own suggested workflow for selecting a pattern (Section 1.7): consider how patterns solve design problems generally, scan the intent sections for something relevant, study how patterns interrelate, study patterns grouped by purpose (creational/structural/behavioral), examine the causes-of-redesign table above against your actual problem, or — its stated inverse approach — explicitly ask **"what do I want to be able to change without redesign"** and look for the pattern that lets exactly that aspect vary independently (Table 1.2 in the book maps each of the 23 patterns to the specific "aspect that can vary," reproduced in the full catalog below).

**Explicit warning against overuse**: "A design pattern should only be applied when the flexibility it affords is actually needed" — patterns buy flexibility through added indirection, which has a real complexity and performance cost; applying one where the flexibility isn't needed is a net loss, not a free improvement.

## Applications, Toolkits, and Frameworks

A three-way distinction worth having precise, since the terms are often used loosely:
- **Application programs** (e.g., a document editor): priorities are internal reuse, maintainability, and extension. Design patterns here reduce internal dependencies so components can be recombined without excess duplicate implementation.
- **Toolkits** (e.g., a collections library): "a set of related and reusable classes designed to provide useful, general-purpose functionality... the object-oriented equivalent of subroutine libraries." A toolkit doesn't impose a design on the application using it — you call into it, not the other way around.
- **Frameworks**: "a set of cooperating classes that make up a reusable design for a specific class of software." Distinguishing feature: **inversion of control** — with a toolkit, you write the main program and call the toolkit's code; with a framework, the framework's main body calls *your* code (via subclasses/callbacks you provide). This is stated as the origin of the term "inversion of control" / "Hollywood principle" ("don't call us, we'll call you") that later became central to dependency-injection framework design (see `doc/references/Spring/`).

Three explicit distinctions between patterns and frameworks: (1) patterns are more abstract — only pattern *examples* can be embodied in code, a framework is directly executable; (2) patterns are smaller architectural elements — a framework typically contains several patterns, never the reverse; (3) patterns are less specialized — a framework always targets a specific application domain, while the same catalog of patterns applies across nearly any domain.

## The Complete Pattern Catalog (23 Patterns)

### Creational Patterns (concern object creation)
- **Abstract Factory** — provide an interface for creating families of related or dependent objects without specifying their concrete classes. *Varies*: families of product objects.
- **Builder** — separate the construction of a complex object from its representation, so the same construction process can create different representations. *Varies*: how a composite object gets created. (See detailed coverage in `doc/references/Java/ocp-java-se8-programmer-2.md`.)
- **Factory Method** — define an interface for creating an object, but let subclasses decide which class to instantiate; lets a class defer instantiation to subclasses. *Varies*: the subclass of object instantiated.
- **Prototype** — specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype. *Varies*: the class of object instantiated.
- **Singleton** — ensure a class only has one instance, and provide a global point of access to it. *Varies*: the sole instance of a class. (See detailed coverage, including double-checked locking, in `doc/references/Java/ocp-java-se8-programmer-2.md`.)

### Structural Patterns (concern how classes/objects are composed)
- **Adapter** — convert the interface of a class into another interface clients expect; lets classes work together that couldn't otherwise because of incompatible interfaces. *Varies*: interface to an object.
- **Bridge** — decouple an abstraction from its implementation so the two can vary independently. *Varies*: implementation of an object.
- **Composite** — compose objects into tree structures to represent part-whole hierarchies; lets clients treat individual objects and compositions of objects uniformly. *Varies*: structure and composition of an object.
- **Decorator** — attach additional responsibilities to an object dynamically; a flexible alternative to subclassing for extending functionality. *Varies*: responsibilities of an object without subclassing.
- **Facade** — provide a unified interface to a set of interfaces in a subsystem; defines a higher-level interface that makes the subsystem easier to use. *Varies*: interface to a subsystem.
- **Flyweight** — use sharing to support large numbers of fine-grained objects efficiently. *Varies*: storage costs of objects.
- **Proxy** — provide a surrogate or placeholder for another object to control access to it. *Varies*: how an object is accessed, its location.

### Behavioral Patterns (concern algorithms and responsibility assignment between objects)
- **Chain of Responsibility** — avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request; chain the receiving objects and pass the request along until an object handles it. *Varies*: object that can fulfill a request.
- **Command** — encapsulate a request as an object, letting you parameterize clients with different requests, queue or log requests, and support undoable operations. *Varies*: when and how a request is fulfilled.
- **Interpreter** — given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language. *Varies*: grammar and interpretation of a language.
- **Iterator** — provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation. *Varies*: how an aggregate's elements are accessed/traversed.
- **Mediator** — define an object that encapsulates how a set of objects interact; promotes loose coupling by keeping objects from referring to each other explicitly, and lets you vary their interaction independently. *Varies*: how and which objects interact with each other.
- **Memento** — without violating encapsulation, capture and externalize an object's internal state so the object can be restored to this state later. *Varies*: what private information is stored outside an object, and when.
- **Observer** — define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically. *Varies*: number of objects that depend on another object; how the dependents stay up to date.
- **State** — allow an object to alter its behavior when its internal state changes; the object will appear to change its class. *Varies*: states of an object.
- **Strategy** — define a family of algorithms, encapsulate each one, and make them interchangeable; lets the algorithm vary independently from clients that use it. *Varies*: an algorithm.
- **Template Method** — define the skeleton of an algorithm in an operation, deferring some steps to subclasses; lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure. *Varies*: steps of an algorithm. (See a real-world Java implementation example — balanced binary search tree rebalancing hooks — in `doc/references/Algorithms & Data Structures/data-structures-and-algorithms-in-java.md`.)
- **Visitor** — represent an operation to be performed on the elements of an object structure; lets you define a new operation without changing the classes of the elements it operates on. *Varies*: operations that can be applied to objects without changing their classes.

## Takeaways for a Senior Backend Java Developer

- The two foundational principles ("program to an interface, not an implementation" and "favor composition over inheritance") predate and underlie nearly every piece of modern Java framework design — dependency injection (Spring), the Java Collections Framework's interface-first design (`List`/`Map`/`Set` over concrete classes), and the general advice to accept interface types as method parameters (see the OCP guide's "polymorphic parameters" coverage in `doc/references/Java/ocp-java-se8-programmer-2.md`) are all direct applications of these two rules.
- The causes-of-redesign table is a genuinely practical diagnostic tool: when facing a design problem, identifying *which* of the eight listed causes is actually in play narrows the pattern search dramatically, rather than trying to pattern-match the whole catalog.
- The explicit warning against overusing patterns — "should only be applied when the flexibility it affords is actually needed" — is worth repeating in code review: gratuitous Factory/Strategy/Observer indirection where a plain object or direct call would suffice is a common junior-to-mid-level engineering anti-pattern, and this book (the patterns' own origin) says so explicitly.
- The toolkit-vs-framework distinction (who calls whom — "inversion of control") is the cleanest historical explanation available for why the term exists and what problem dependency-injection frameworks were originally solving.
