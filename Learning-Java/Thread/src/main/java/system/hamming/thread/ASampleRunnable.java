package system.hamming.thread;

import java.util.function.Consumer;

public class ASampleRunnable implements Runnable {

    private static Consumer<String> PRINT_ON_CONSOLE = System.out::println;
    private String message;

    public ASampleRunnable(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        PRINT_ON_CONSOLE.accept(message + " my name is : " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        new Thread(new ASampleRunnable("Hello, i am newly created thread by implementing `Runnable` interface")).start();
    }
}
