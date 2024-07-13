# OOPS

- **Abstraction** - Is hiding complexities of implementation and exposing simpler interfaces. Like Car, car provide us a
  simple interface to drive it without bothering about inner details. it gives general perception about the functional
  offering instead of how it is offering. Like mobile phone given (WHAT) offering of Calling,SMS,Power storage,User
  Interface. **Represents “WHAT” part operation instead of “HOW”**.
- **Encapsulation** - is hiding the state or internal representation of an object from the consumer of an API. Like
  car's accelerator hides the information of speed up/down.
- Abstraction is general level of information hiding but Encapsulation is special level of information hiding.
  Abstraction is higher(System Design level)degree of information hiding while Encapsulation is lower(Class level)
  degree of information hiding.
- **Inheritance** - Is the mechanism that allows one class to acquire all the properties from another class by
  inheriting the class. When we extend a class, we form an **IS-A** relationship.
- **Polymorphism** - As name suggest, it has many forms(Flavours), Like Ice-cream, Chocolate Ice-cream, Hot Ice-cream.
  method overloading is compile time polymorphism(As we know at the compile time that which flavour of method we are
  calling) and method overriding is runtime polymorphism(As which class's method is to be called is decided on runtime
  based on the actual object type).

# Composition, Aggregation, and Association

- **Composition** - Is a form of ``HAS-A`` relationship. it's a strong type of relationship between objects as lifecycle
  of one object belongs-to(owning) another object. Like Pencil nip lifecycle is belongs to Pencil object itself. Inner
  classes in java is example of composition.
- **Aggregation** - Is a form of ``HAS-A`` relationship. unlike composition aggregation not owning lifecycle of other
  object. Like car has a tyre but tyre's lifecycle not bind to car.
- **Association** - Is a form of ``HAS-A`` relationship. it's the weakest type of relationship between the objects as
  they are just aware about each other and have managing own lifecycle not depend on other object. like Human drives
  Car, Human and Car are two saparate object manger their own lifecycle and occasionally interact with each other.

# References

- https://www.baeldung.com/java-composition-aggregation-association

# TODO

- Prefer Composition(``HAS-A``) to
  inheritance(``IS-A``) - https://blogs.oracle.com/javamagazine/post/java-inheritance-composition