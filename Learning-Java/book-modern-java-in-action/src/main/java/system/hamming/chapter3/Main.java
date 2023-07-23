package system.hamming.chapter3;

import system.hamming.chapter3.consumer.ConsumerExample;
import system.hamming.chapter3.executearoundpattern.BufferedReaderFileLineReaderProcessorTest;
import system.hamming.chapter3.predicate.PredicateExample;

import java.io.IOException;

import static system.hamming.Main.*;

public class Main {

    public static void main() throws IOException {
        printStringOnConsole.accept(BLUE);
        printStringOnConsole.accept("\n=== Chapter-3 Main execution started ===\n");

        // execute around pattern using functional interface.
        BufferedReaderFileLineReaderProcessorTest.main();
        // Predicate<T> functional interface, taking generic type T object and return boolean.
        PredicateExample.main();
        // Consumer<T> functional interface, taking generic type T object and return nothing(void).
        ConsumerExample.main();
        // Function<T,R> functional interface, taking generic type T object and return type R object.

        printStringOnConsole.accept("\n=== Chapter-3 Main execution completed ===\n");
        printStringOnConsole.accept(RESET);
    }

    public static void main(String[] args) throws Exception {
        main();
    }
}
