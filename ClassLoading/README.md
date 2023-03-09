Basic Java command for compiling java file and running java code.
=============
- Command for compiling java file and put that generated class file(using -d) into appropriate directory(in our case, `classes` directory).
```console
foo@bar:~/.../1_Basic_Class_Loading/Version1$ javac -d classes src/com/hamming/Main.java
```
Here our `Main.java` class present under directory src/com/hamming where directory com & hamming are part of java package so whenever `Main.java` compiles it will create directory com & hamming at destination directory. i.e. `classes` directory in our case. 

- Command for execute java.
```console
foo@bar:~/.../1_Basic_Class_Loading/Version1$ java -cp classes com.hamming.Main
```
Here we are executing `Main` class which is under package `com.hamming` by keeping `classes` directory in classpath (using `-cp` option).
For executing java, we need to provide its fully qualified name i.e. `com.hamming.Main` in our case.

- Below is a command for compile class with its dependent classes. Here `Main.java` have reference of `org.foo.MessageProvider` class and `org.bar.MessageProvider` class.
```console
foo@bar:~/.../1_Basic_Class_Loading/Version2$ javac -d classes src/com/hamming/Main.java src/org/foo/MessageProvider.java src/org/bar/MessageProvider.java
```
> **_NOTE:_**  In above command, Order or java file not matters.

    `.class` file generated at appropriate package under `classes` directory.

- Below is command for running `Main` class which is havind dependency of other class.
```console
foo@bar:~/.../1_Basic_Class_Loading/Version2$ java -cp classes com.hamming.Main
```

- Below is command to compile java class with dependent class present in jar.
```console
foo@bar:~/.../1_Basic_Class_Loading/Version3$ javac -d classes -cp lib/commons-lang3-3.12.0.jar src/com/hamming/Main.java
```

- Below is a command to execute `Main` class using dependency jar.
```console
foo@bar:~/.../1_Basic_Class_Loading/Version3$ java -cp classes:lib/commons-lang3-3.12.0.jar com.hamming.Main
```


