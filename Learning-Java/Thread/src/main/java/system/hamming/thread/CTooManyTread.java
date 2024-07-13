package system.hamming.thread;

import java.util.function.Consumer;

public class CTooManyTread {

    private static Consumer<String> PRINT_ON_CONSOLE = System.out::println;
    private static int NUM = 0;
    private static final Runnable task = () -> {
        try { // UNCOMMENT THIS AND OBSERVE THE BEHAVIOUR. --> spawn thread put into sleep mode hence other thread will execute the task.
            Thread.sleep(1);
        }catch (InterruptedException e){
            PRINT_ON_CONSOLE.accept("*** ERROR *** : SLEEP INTERRUPTED !!!");
        }
        PRINT_ON_CONSOLE.accept("i am thread : " + Thread.currentThread().getName() + ", Before updating value : " + NUM);
        NUM += 1;
        PRINT_ON_CONSOLE.accept("i am thread : " + Thread.currentThread().getName() + ", After updating value : " + NUM);
    };

    public static void main(String[] args) {
        PRINT_ON_CONSOLE.accept("i am thread : " + Thread.currentThread().getName() + ", Initial value of NUM : " + NUM);
        for (int i = 0; i < 100; i++) {
            new Thread(task).start();
            /*try { // UNCOMMENT THIS AND OBSERVE THE BEHAVIOUR. --> this will actually pause execution of "main" thread.
                Thread.sleep(1);
            }catch (InterruptedException e){
                PRINT_ON_CONSOLE.accept("*** ERROR *** : SLEEP INTERRUPTED !!!");
            }*/
        }
        PRINT_ON_CONSOLE.accept("i am thread : " + Thread.currentThread().getName() + ", Final value of NUM : " + NUM);
    }
}
