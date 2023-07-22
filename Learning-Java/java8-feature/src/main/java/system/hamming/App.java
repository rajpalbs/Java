package system.hamming;

public class App {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        System.out.println("Hello World!");
        Class cls = App.class;
        Object o = (App) cls.newInstance();
    }
}
