package system.hamming.chapter3;

public class LocalVariableWithLambda {
    public static void main(String[] args) {
        Object o = new Object();
        // o = new Object(); if we uncomment this line then this code will not compile as local variable in lambda must be final or effectively-final(not final but still not re-assign).
        Runnable runnable = () -> System.out.println(o);
        runnable.run();
    }
}