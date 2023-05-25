package system.hamming.chapter1;

import system.hamming.chapter1.behaviourAsParameter.MarutiSuzukiSwiftLDI;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

import static system.hamming.Main.GREEN;
import static system.hamming.Main.RESET;

public class Main {
    public static void main() {
        System.out.println(GREEN);System.out.println("\n=== Chapter-1 Main execution started ===\n");

        MarutiSuzukiSwiftLDI XX01YY1234 = new MarutiSuzukiSwiftLDI("CHASSIS-123456", "ENGINE-654321");

        Consumer<MarutiSuzukiSwiftLDI> marutiSuzukiSwiftLDITrip = MarutiSuzukiSwiftLDI::doTrip;
        marutiSuzukiSwiftLDITrip.accept(XX01YY1234); // pass method as reference

        Function<MarutiSuzukiSwiftLDI, String> marutiSuzukiSwiftLDIVariant = MarutiSuzukiSwiftLDI::getVariant;
        String variant = marutiSuzukiSwiftLDIVariant.apply(XX01YY1234); // pass method as reference
        System.out.println("Car variant is : " + variant);

        BiFunction<MarutiSuzukiSwiftLDI, String, Boolean> marutiSuzukiSwiftLDIISLatest = MarutiSuzukiSwiftLDI::isLatestModel;
        Boolean isLatest = marutiSuzukiSwiftLDIISLatest.apply(XX01YY1234, "2022"); // pass method as reference
        System.out.println("Is latest car ? " + isLatest);

        System.out.println("\n=== Chapter-1 Main execution completed ===\n");
        System.out.println(RESET);
    }
}