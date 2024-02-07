# Outline

- From Java8, The only difference remains between `interface` and `abstract class` is: **Instance variable**.
  `interface` can not have instance variable. it has only constant(public static final) variables. Due to
  it, `interface` does not have `constuctor` or `non-static methods`.
- Java8 favour evolvable `interface`. Which means, Without affecting the implementation, we can update the `interface`
  contract. To achieve it, we can provide `default` implementation of method in `interface` itself. those method are
  known as `default` methods.

# References

- [Baeldung](https://www.baeldung.com/java-8-lambda-expressions-tips) article about the best practices for lambda and
  functional interface.

# TODO