package system.hamming.thread;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Consumer;

public class BSampleThread extends Thread {

    private static Consumer<String> PRINT_ON_CONSOLE = System.out::println;

    private static void printWithTimestampAndThread(String message) {
        String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss.SSS"));
        String thread = Thread.currentThread().getName();
        PRINT_ON_CONSOLE.accept(date + " , " + thread + " : " + message);
    }

    private final String message;

    public BSampleThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            printWithTimestampAndThread(message + " my name is : " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        BSampleThread helloThread = new BSampleThread("Hello, i am newly created thread by extending `Thread` class.");
        helloThread.setName("Sample Thread");
        printWithTimestampAndThread("Before calling start method, Thread state is : " + helloThread.getState().name());
        helloThread.start();
        printWithTimestampAndThread("After calling start method, Thread state is : " + helloThread.getState().name());
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        printWithTimestampAndThread("After execution completed of run method, Thread state is : " + helloThread.getState().name());
    }
}
