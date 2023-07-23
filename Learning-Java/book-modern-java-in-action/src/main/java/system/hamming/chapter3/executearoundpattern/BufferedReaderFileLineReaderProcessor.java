package system.hamming.chapter3.executearoundpattern;

import java.io.BufferedReader;
import java.io.IOException;

@FunctionalInterface
public interface BufferedReaderFileLineReaderProcessor {
    /*
     * Here readLine is an only abstract method which accept object of type BufferedReader and return String object.
     * So we can write lambda expression in which argument is type of BufferedReader class and return String class can be called.
     * */
    String readLines(BufferedReader bufferedReader) throws IOException;
}
