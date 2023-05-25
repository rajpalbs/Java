- In java 8, Designer introduce functional interface which have only onw abstract method and that method directly invoked by lambda.
- Above sentence implies that, When interface have more than one abstract method, lambda failed to identify which abstract method to invoke.
- Below is syntax for lambda expression,
  ``` java
  (parameters) -> expression // No semicolon
    e.g
    (String s) -> s.length()
    (String s) -> s.length() + 5
    () -> 0 
  ```
  ``` java
  (parameters) -> { statements; }
    e.g
    () -> { System.out.println("Hello World"); }
    (String s) -> { return s.length(); }
  ```

    