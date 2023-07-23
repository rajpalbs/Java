package system.hamming.chapter3.predicate;

import java.util.function.Predicate;

import static system.hamming.Main.printStringOnConsole;

public class PredicateExample {

    public static void main(){
        Predicate<String> isStringContaninWorldPredicate = string -> string.contains("world");
        printStringOnConsole.accept("Is `hello world` contains `world` ? "+isStringContaninWorldPredicate.test("hello world"));
    }

    public static void main(String[] args) {
        main();
    }
}
