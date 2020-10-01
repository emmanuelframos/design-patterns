# Design Patterns - A Case Study

A software design pattern is a general, reusable solution to a commonly occurring problem within a given context in software design. 

It is not a finished design that can be transformed directly into source or machine code. 

Rather, it is a description or template for how to solve a problem that can be used in many different situations. 

Design patterns are formalized best practices that the programmer can use to solve common problems when designing an application or system.

Design patterns may be viewed as a structured approach to computer programming intermediate between the levels of a programming paradigm and a concrete algorithm.

### Creational Patterns
#### Abstract Factory
 A class requests the objects it requires from a factory object instead of creating the objects directly. 
 
 Provides a way to encapsulate a group of individual factories that have a common theme.
 
 **Solve problems like:**
 - How can an application be independent of how its objects are created?
 - How can a class be independent of how the objects it requires are created?
 - How can families of related or dependent objects be created?
 
#### Builder
It intent is to separate the construction of a complex object from its representation.

 **Solve problems like:**
- How can a class (the same construction process) create different representations of a complex object?
- How can a class that includes creating a complex object be simplified?

#### Prototype
Specifies the kind of object to create using a prototypical instance, and creates new objects by cloning this prototype.

Used when we have an instance of the class (prototype) and we'd like to create new objects by just copying the prototype.
  
  **Solve problems like:**
- How can objects be created so that which objects to create can be specified at run-time?
- How can dynamically loaded classes be instantiated?

#### Singleton
 
Restricts the instantiation of a class to one "single" instance. 

This is useful when exactly one object is needed to coordinate actions across the system. 

The term comes from the mathematical concept of a singleton.

  **Solve problems like:**
- How can it be ensured that a class has only one instance?
- How can the sole instance of a class be accessed easily?
- How can a class control its instantiation?
- How can the number of instances of a class be restricted?
- How can a global variable be accessed?

### Structural Patterns
#### Adapter
It allows the interface of an existing class to be used as another interface.

It is often used to make existing classes work with others without modifying their source code.

  **Solve problems like:**
- How can a class be reused that does not have an interface that a client requires?
- How can classes that have incompatible interfaces work together?
- How can an alternative interface be provided for a class?

#### Bridge
Decouples an abstraction from its implementation so that the two can vary independently.

The bridge uses encapsulation, aggregation, and can use inheritance to separate responsibilities into different classes.

**Solve problems like:**
- An abstraction and its implementation should be defined and extended independently from each other.
- A compile-time binding between an abstraction and its implementation should be avoided so that an implementation can be selected at run-time.

#### Composite
The composite pattern describes a group of objects that are treated the same way as a single instance of the same type of object. 
 
The intent of a composite is to "compose" objects into tree structures to represent part-whole hierarchies. 
 
Implementing the composite pattern lets clients treat individual objects and compositions uniformly

**Solve problems like:**
- A part-whole hierarchy should be represented so that clients can treat part and whole objects uniformly.
- A part-whole hierarchy should be represented as tree structure.

#### Decorator
Allows behavior to be added to an individual object, dynamically, without affecting the behavior of other objects from the same class.

**Solve problems like:**
- Responsibilities should be added to (and removed from) an object dynamically at run-time.
- A flexible alternative to subclassing for extending functionality should be provided.

#### Facade
A facade is an object that serves as a front-facing interface masking more complex underlying or structural code.

**Solve problems like:**
- To make a complex subsystem easier to use, a simple interface should be provided for a set of interfaces in the subsystem.
- The dependencies on a subsystem should be minimized.

#### Flyweight
A flyweight is an object that minimizes memory usage by sharing as much data as possible with other similar objects. 

Often some parts of the object state can be shared, and it is common practice to hold them in external data structures and pass them to the objects temporarily when they are used.

**Solve problems like:**
- Large numbers of objects should be supported efficiently.
- Creating large numbers of objects should be avoided.

#### Proxy
A proxy, in its most general form, is a class functioning as an interface to something else. 

The proxy could interface to anything: a network connection, a large object in memory, a file loading, or some other resource. 

**Solve problems like:**
- The access to an object should be controlled.
- Additional functionality should be provided when accessing an object.

### Behavioral Patterns
#### Command
Encapsulates all information needed to perform an action or trigger an event at a later time. 

This information includes the method name, the object that owns the method and values for the method parameters.

**Solve problems like:**
- Coupling the invoker of a request to a particular request should be avoided. 
That is, hard-wired requests should be avoided.
- It should be possible to configure an object (that invokes a request) with a request.

#### Chain of Responsibility
Defines a chain of receiver objects having the responsibility, depending on run-time conditions, to either handle a request or forward it to the next receiver on the chain (if any).

**Solve problems like:**
- Coupling the sender of a request to its receiver should be avoided.
- It should be possible that more than one receiver can handle a request.
 
#### Mediator
Defines an object that encapsulates how a set of objects interact.
 
Communication between objects is encapsulated within a mediator object. 

Objects no longer communicate directly with each other, but instead communicate through the mediator. 

This reduces the dependencies between communicating objects, thereby reducing coupling.

**Solve problems like:**
- Tight coupling between a set of interacting objects should be avoided.
- It should be possible to change the interaction between a set of objects independently. 
  
#### Observer
The observer pattern is a software design pattern in which an object, called the subject, maintains a list of its dependents, called observers, and notifies them automatically of any state changes, usually by calling one of their methods.

**Solve problems like:**
- A one-to-many dependency between objects should be defined without making the objects tightly coupled.
- It should be ensured that when one object changes state an open-ended number of dependent objects are updated automatically.
- It should be possible that one object can notify an open-ended number of other objects.

### Dependencies
```
*   Java 1.8 (https://www.oracle.com/java/technologies/javase-jdk8-downloads.html)
*   Maven (http://maven.apache.org/install.html)
```