package system.hamming.chapter3.executearoundpattern;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.Function;

import static system.hamming.Main.printStringOnConsole;

public class BufferedReaderFileLineReaderProcessorTest {

    public static void main() throws IOException {

        BufferedReaderFileLineReaderProcessor singleLineProcessor = BufferedReader::readLine; // lambda expression assigned to functional interface

        //reading & printing line using lambda
        printStringOnConsole.accept(singleLineProcessor.readLines(new BufferedReader(new FileReader("./pom.xml"))));

        //reading & printing line using execute around pattern
        processFile(singleLineProcessor); // Here benefit is, Do not write code common code everytime i.e. creating BufferedReader object,

        BufferedReaderFileLineReaderProcessor fiveLineProcessor = (BufferedReader b) -> b.readLine() + b.readLine() + b.readLine() + b.readLine() + b.readLine(); // lambda expression assigned to functional interface
        processFile(fiveLineProcessor);
    }

    private static void processFile(BufferedReaderFileLineReaderProcessor processor) throws IOException { // Behaviour parameterization
        try (BufferedReader currentFile = new BufferedReader(new FileReader("./pom.xml"))) {
            printStringOnConsole.accept(processor.readLines(currentFile));
        }
    }

    private static void processFile(Function<BufferedReader, String> fn) throws Exception {
        printStringOnConsole.accept(fn.apply(new BufferedReader(new FileReader("./pom.xml"))));
    }

    public static void main(String[] args) throws IOException {
        main();
    }
}
