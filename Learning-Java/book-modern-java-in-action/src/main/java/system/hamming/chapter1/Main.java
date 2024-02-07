package system.hamming.chapter1;

import system.hamming.chapter1.behaviourAsParameter.MarutiSuzukiSwiftLDI;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

import static system.hamming.Main.GREEN;
import static system.hamming.Main.RESET;

public class Main {

    public static final Consumer<String> printStringOnConsole = System.out::println;

    private static void execute() {
        printStringOnConsole.accept(GREEN);

        printStringOnConsole.accept("=== Chapter-1 Main execution started ===\n");

        // method as reference
        Function<Integer, Double> calculateAreaOfSquare = Main::calculateAreaOfSquare; // Assign method behaviour to variable. i.e. method as a value
        Double areaOfCircleHavingRadius10 = calculateAreaOfSquare.apply(10);
        Double areaOfCircleHavingRadius15 = calculateAreaOfSquare.apply(15);

        printStringOnConsole.accept("Area of circle having radius 10 is : " + areaOfCircleHavingRadius10);
        printStringOnConsole.accept("Area of circle having radius 15 is : " + areaOfCircleHavingRadius15);

        // Another example
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5); // create stream
        Consumer<Integer> printNumberOddEvenDetail = Main::printNumberOddEvenDetail; // method as a value
        integerStream.forEach(printNumberOddEvenDetail); // Apply method behaviour to all stream member.

        // One more method reference example
        methodAsReference();

        printStringOnConsole.accept("\n=== Chapter-1 Main execution completed ===\n");
        printStringOnConsole.accept(RESET);
    }

    private static Double calculateAreaOfSquare(Integer radius) {
        return Math.PI * radius * radius;
    }

    private static void printNumberOddEvenDetail(Integer number) {
        printStringOnConsole.accept(number + (number % 2 == 0 ? " is even." : " is odd."));
    }

    private static void methodAsReference() {
        MarutiSuzukiSwiftLDI XX01YY1234 = new MarutiSuzukiSwiftLDI("CHASSIS-123456", "ENGINE-654321");

        Consumer<MarutiSuzukiSwiftLDI> marutiSuzukiSwiftLDITrip = MarutiSuzukiSwiftLDI::doTrip; // method as a reference. i.e. method as value
        marutiSuzukiSwiftLDITrip.accept(XX01YY1234); // pass method as reference

        Function<MarutiSuzukiSwiftLDI, String> marutiSuzukiSwiftLDIVariant = MarutiSuzukiSwiftLDI::getVariant; // method as a reference. i.e. method as value
        String variant = marutiSuzukiSwiftLDIVariant.apply(XX01YY1234); // pass method as reference
        printStringOnConsole.accept("Car variant is : " + variant);

        BiFunction<MarutiSuzukiSwiftLDI, String, Boolean> marutiSuzukiSwiftLDIISLatest = MarutiSuzukiSwiftLDI::isLatestModel; // method as a reference. i.e. method as value
        Boolean isLatest = marutiSuzukiSwiftLDIISLatest.apply(XX01YY1234, "2022"); // pass method as reference
        printStringOnConsole.accept("Is latest car ? " + isLatest);
    }

    public static void main(String... args) {
        execute();
    }
}