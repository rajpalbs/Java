package system.hamming.chapter3.executearoundpattern;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderFileLineReaderProcessorTest {
    public static void main(String[] args) throws IOException{
        BufferedReaderFileLineReaderProcessor singleLineProcessor = (BufferedReader b) -> b.readLine(); // lambda expression assigned to functional interface

        String line1 = processFile(singleLineProcessor);
        System.out.println("Printing first line --> " + line1);

        BufferedReaderFileLineReaderProcessor fiveLineProcessor = (BufferedReader b) -> b.readLine() + b.readLine() + b.readLine() + b.readLine() + b.readLine(); // lambda expression assigned to functional interface
        String firstFiveLines = processFile(fiveLineProcessor);
        System.out.println("Printing first 5 lines --> " + firstFiveLines);
    }

    private static String processFile(BufferedReaderFileLineReaderProcessor processor) throws IOException {
        try (BufferedReader currentFile = new BufferedReader(new FileReader("./pom.xml"))) {
            System.out.println(processor);
            return processor.readLine(currentFile);
        }
    }
}
