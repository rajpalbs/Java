package system.hamming.chapter3.function;

import java.util.function.Function;

import static system.hamming.Main.printStringOnConsole;

public class FunctionExample {
    public static void main() {
        String sentence = "Java8 is huge leap toward making java a first choice for programmer.";

        Function<String, String> getFirstWordOfSentence = FunctionExample::findFirstWordOfSentence;
        printStringOnConsole.accept("First word of sentence is : " + getFirstWordOfSentence.apply(sentence));

        Function<String, Integer> findLengthOfString = FunctionExample::findLengthOfString;
        Integer lengthOfFirstWord = getFirstWordOfSentence.andThen(findLengthOfString).apply(sentence);
        printStringOnConsole.accept("Length of first word is : " + lengthOfFirstWord);
    }

    private static String findFirstWordOfSentence(String sentence) {
        return sentence.substring(0, sentence.indexOf(" "));
    }

    private static Integer findLengthOfString(String string) {
        return string.length();
    }

    public static void main(String[] args) {
        main();
    }
}
