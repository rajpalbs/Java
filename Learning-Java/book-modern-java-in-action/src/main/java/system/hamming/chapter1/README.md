- From java 8, Java method also becomes first class member of class. What it means is, Like we pass the variable value
  at the runtime; same way we pass the method behaviour at runtime.<br/>
  E.g.
  ``` java
  public static final Consumer<String> printStringOnConsole = System.out::println;
  ```
  In above example, `printStringOnConsole` can be passed around which executes `println` method at runtime.<br/>
  ``` java
  printStringOnConsole.accept("Hello World"); // print Hello World at console
  printStringOnConsole.accept(num + (num % 2 == 0 ? " is even" : " is odd")); // based on value of num, it will print `num` is even/odd. 
  ```
- **In simple term, You decide the behaviour of method. Assign variable to that method, Apply your use cases to that
  variable.**
- Similar to method, `lambda` is also first class member of class. which implies, we can also pass around lambda like we
  pass around variable/method.
- The primary meaning of `functional` in **functional programming** is, **\`USING FUNCTIONS AS FIRST CLASS VALUE\`**.
- In simple term, Behaviour parameterization means implementing strategy pattern.
- Java 8 added default methods to support *Evolvable* interfaces. it means, Without breaking the existing contract, We
  can add more behaviour(method) to the interface.
- Using methods and lambdas as a first class values, And methods can efficiently and safety executed in parallel (using
  parallelStream) in the **absence of mutable shared object**.
  Both these ideas are exploited by the new Streams API.