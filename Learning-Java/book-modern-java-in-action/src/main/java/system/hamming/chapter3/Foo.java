package system.hamming.chapter3;

import system.hamming.chapter3.executearoundpattern.PrintColoredOutput;

import java.util.function.Consumer;
import java.util.function.IntSupplier;

import static system.hamming.Main.GREEN;
import static system.hamming.Main.YELLOW;

public class Foo {
    public static void main(String[] args) {
        Consumer<String> stringConsumer =  color -> System.out.println(color);
        stringConsumer.accept(GREEN);

        IntSupplier intSupplier = () -> 42;
        System.out.println(intSupplier);

        PrintColoredOutput colouredOutput = color -> System.out.println(color);
        colouredOutput.withColor(YELLOW);
        System.out.println(new Foo().new InnerFoo());
    }
    class InnerFoo{}
}
