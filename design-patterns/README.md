# Design Pattern

https://refactoring.guru/design-patterns

## Singleton

Singleton is a creational design pattern that lets you ensure that a class has only one instance, while providing a
global access point to this instance.

https://refactoring.guru/design-patterns/singleton

### Comparison of Implementations

| Implementation         | Lazy Initialization | Thread-Safe | Performance | Complexity |
|------------------------|---------------------|-------------|-------------|------------|
| Eager Initialization   | No                  | Yes         | High        | Low        |
| Lazy Initialization    | Yes                 | No          | High        | Low        |
| Thread-Safe Singleton  | Yes                 | Yes         | Moderate    | Moderate   |
| Double-Checked Locking | Yes                 | Yes         | High        | High       |
| Bill Pugh Singleton    | Yes                 | Yes         | High        | Low        |
| Enum Singleton         | No                  | Yes         | High        | Very Low   |
| Multiton               | Conditional         | Yes         | Varies      | Moderate   |

### Recommendation

* **Simple projects**: Use Eager Initialization or Bill Pugh Singleton.
* **Multithreaded applications**: Use Double-Checked Locking or Bill Pugh Singleton.
* **Serialization safety**: Use Enum Singleton.
* **Parameterized singletons**: Use Multiton.

## Factory Method

**Factory method** is a creational design pattern which solves the problem of creating product objects without
specifying
their concrete classes.

https://refactoring.guru/design-patterns/factory-method

## Abstract Factory

Abstract Factory is a creational design pattern that lets you produce families of related objects without specifying
their concrete classes.

https://refactoring.guru/design-patterns/abstract-factory

### Abstract Factory vs. Factory Method

#### Purpose

* Factory Method:
  Defines a method to create an object and allows subclasses to alter the type of object that will be created.
  Focuses on creating a single product.

* Abstract Factory:
  Provides an interface to create families of related or dependent objects without specifying their concrete classes.
  Focuses on creating multiple related products.

#### Key Differences

| Feature             | 	Factory Method                                                   | 	Abstract Factory                                                     |
|---------------------|-------------------------------------------------------------------|-----------------------------------------------------------------------|  
| Object Creation     | Delegates object creation to subclasses via a single method.      | Creates families of related objects through multiple factory methods. |
| Hierarchy           | Requires a single base class/interface for the product.	          | Requires multiple product interfaces to represent the product family. |
| Complexity	         | Simpler and easier to implement.                                  | More complex due to multiple factories and families.                  |                                                                        |
| Use Case            | When a class needs to delegate object creation to its subclasses. | When multiple related products are created, ensuring consistency.     |
| Number of Products	 | Focused on one type of product.	                                  | Focused on families of related products.                              |

## Builder

Builder is a creational design pattern that lets you construct complex objects step by step. The pattern allows you to
produce different types and representations of an object using the same construction code.

https://refactoring.guru/design-patterns/builder

## Prototype

https://refactoring.guru/design-patterns/prototype

Prototype is a creational design pattern that lets you copy existing objects without making your code dependent on their
classes.

## Adapter

Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.

## Bridge

Bridge is a structural design pattern that divides business logic or huge class into separate class hierarchies that can
be developed independently.

## Composite

Composite is a structural design pattern that lets you compose objects into tree structures and then work with these
structures as if they were individual objects.

## Decorator

Decorator is a structural design pattern that lets you attach new behaviors to objects by placing these objects inside
special wrapper objects that contain the behaviors.

## Flyweight

https://refactoring.guru/design-patterns/flyweight

Flyweight is a structural design pattern that lets you fit more objects into the available amount of RAM by sharing
common parts of state between multiple objects instead of keeping all of the data in each object.

## Facade
Facade is a structural design pattern that provides a simplified interface to a library, a framework, or any other
complex set of classes.


## Proxy
Proxy is a structural design pattern that lets you provide a substitute or placeholder for another object. A proxy
controls access to the original object, allowing you to perform something either before or after the request gets
through to the original object.


