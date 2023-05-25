package system.hamming;

public class Main {

    public static final String RESET = "\033[0m";
    public static final String GREEN = "\033[0;32m";
    public static final String YELLOW = "\033[0;33m";
    public static final String BLUE = "\033[0;34m";
    public static final String PURPLE = "\033[0;35m";
    public static final String GREEN_BOLD = "\033[1;32m";
    public static final String YELLOW_BOLD = "\033[1;33m";
    public static final String BLUE_BOLD = "\033[1;34m";
    public static final String PURPLE_BOLD = "\033[1;35m";

    public static void main(String[] args) {
        system.hamming.chapter1.Main.main();
        system.hamming.chapter2.Main.main();
        system.hamming.chapter3.Main.main();
    }
}
