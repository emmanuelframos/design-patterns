# Design Patterns - A Case Study

A software design pattern is a general, reusable solution to a commonly occurring problem within a given context in software design. 

It is not a finished design that can be transformed directly into source or machine code. 

Rather, it is a description or template for how to solve a problem that can be used in many different situations. 

Design patterns are formalized best practices that the programmer can use to solve common problems when designing an application or system.

Design patterns may be viewed as a structured approach to computer programming intermediate between the levels of a programming paradigm and a concrete algorithm.

### Creational Patterns
####Abstract Factory
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

### Dependencies
```
*   Java 1.8 (https://www.oracle.com/java/technologies/javase-jdk8-downloads.html)
*   Maven (http://maven.apache.org/install.html)
```