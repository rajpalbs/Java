package system.hamming.chapter3.executearoundpattern;

import java.io.BufferedReader;
import java.io.IOException;

@FunctionalInterface
public interface BufferedReaderFileLineReaderProcessor {
    /*
    * Here processFile is an only abstract method which accept object of type BufferedReader and return String object.
    * So we can write lambda expression in which any method of BufferedReader class which returns String can be called.
    * */
    String readLine(BufferedReader bufferedReader) throws IOException;
}
