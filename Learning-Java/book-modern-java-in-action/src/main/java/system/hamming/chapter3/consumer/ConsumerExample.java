package system.hamming.chapter3.consumer;

import java.util.function.Consumer;

import static system.hamming.Main.printStringOnConsole;


public class ConsumerExample {

    private static Integer value = 0;

    public static void main() {
        Consumer<Integer> addConsumer = ConsumerExample::add;
        Consumer<Integer> subtractConsumer = ConsumerExample::subtract;
        Consumer<Integer> multiplicationConsumer = ConsumerExample::multiply;
        Consumer<Integer> resetConsumer = ConsumerExample::reset;

        printStringOnConsole.accept("Latest value : " + value);
        addConsumer.accept(10);
        printStringOnConsole.accept("Value after adding 10 into latest value. Now, Latest value : " + value);
        subtractConsumer.accept(5);
        printStringOnConsole.accept("Value after subtracting 5 from the latest value. Now, Latest value : " + value);
        resetConsumer.accept(0);
        printStringOnConsole.accept("Value after resetting latest value. Now, Latest value : " + value);

        addConsumer.andThen(multiplicationConsumer.andThen(subtractConsumer)).accept(15); // value = 15*15-15 = 210
        printStringOnConsole.accept("Value after adding 15. Then, multiply with 15. Then, subtracting 15. Now, Latest value : " + value);
    }

    private static void add(Integer amount){
        value += amount;
    }

    private static void subtract(Integer amount){
        value -= amount;
    }

    private static void multiply(Integer multiplicationFactor){
        value *= multiplicationFactor;
    }

    private static void reset(Integer resetTo){
        value = 0;
    }

    public static void main(String[] args) {
        main();
    }
}
