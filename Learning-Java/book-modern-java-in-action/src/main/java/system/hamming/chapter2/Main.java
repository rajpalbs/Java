package system.hamming.chapter2;

import system.hamming.chapter2.behaviourParameterization.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static system.hamming.Main.RESET;
import static system.hamming.Main.YELLOW;

public class Main {

    public static final Consumer<String> printStringOnConsole = System.out::println;

    public static void main() {
        printStringOnConsole.accept(YELLOW);
        printStringOnConsole.accept("\n=== Chapter-2 Main execution started ===\n");
        Car car_1 = getCarInventory().get(0);

        // Filtering car using strategy pattern
        // Strategy - 1
        CarFilter expensiveCarFilter = new ExpensiveCarFilter();
        printStringOnConsole.accept("is " + car_1 + " is expensive ? " + expensiveCarFilter.isFilterable(car_1));
        // Strategy - 2
        CarFilter redColorCarFilter = new RedColorCarFilter();
        printStringOnConsole.accept("is " + car_1 + " is red in color ? " + redColorCarFilter.isFilterable(car_1));

        // Filtering car using anonymous class
        CarFilter anonymousCarFilter =  new CarFilter() {
            @Override
            public boolean isFilterable(Car car) {
                return car.getColor() == Color.WHITE && car.getPrice() < 15000;
            }
        };
        printStringOnConsole.accept("is " + anonymousCarFilter + " is white and cheap ? " + anonymousCarFilter.isFilterable(car_1));

        // In case we want to filter the car having criteria like color is either BLUE || RED And Price is between 12000 and 18000,
        // we need to create one more implementation(strategy) of CarFilter. and in similar line for every possible case we need to write dedicated strategy for it.
        CarFilter filterExpensiveCar = (Car car) -> car.getPrice() > 18000;
        printStringOnConsole.accept("is " + car_1 + " is expensive ? " + filterExpensiveCar.isFilterable(car_1));

        // Generic way for filtering element by using java8 functional interface Predicate
        List<Car> whiteCars = filter(getCarInventory(), (car -> car.getColor() == Color.WHITE));
        printStringOnConsole.accept("Filtering and printing WHITE car.");
        whiteCars.forEach(Main::printObj);

        // Like car, we can also filter for another type.
        List<Integer> evenNumbers = filter(Arrays.asList(1, 2, 3, 4, 5, 6, 7), number -> number % 2 == 0);
        printStringOnConsole.accept("Filtering and printing even numbers.");
        evenNumbers.forEach(Main::printObj);

        printStringOnConsole.accept("\n=== Chapter-2 Main execution completed ===\n");
        printStringOnConsole.accept(RESET);
    }

    static List<Car> getCarInventory(){
        return Arrays.asList(
                new Car(Color.WHITE, 10000),
                new Car(Color.BLUE, 11000),
                new Car(Color.RED, 12000),
                new Car(Color.YELLOW, 13000),
                new Car(Color.BLACK, 14000),
                new Car(Color.WHITE, 15000),
                new Car(Color.BLUE, 16000),
                new Car(Color.RED, 17000),
                new Car(Color.YELLOW, 1800),
                new Car(Color.BLACK, 19000),
                new Car(Color.WHITE, 20000),
                new Car(Color.BLUE, 21000),
                new Car(Color.RED, 22000),
                new Car(Color.YELLOW, 23000),
                new Car(Color.BLACK, 24000),
                new Car(Color.WHITE, 25000),
                new Car(Color.BLUE, 26000),
                new Car(Color.RED, 27000),
                new Car(Color.YELLOW, 28000),
                new Car(Color.BLACK, 29000));
    }

    private static <T> List<T> filter(List<T> inventory, Predicate<T> predicate) {
        List<T> filteredElements = new ArrayList<>();
        for (T element : inventory) {
            if (predicate.test(element)) {
                filteredElements.add(element);
            }
        }
        return filteredElements;
    }

    private static void printObj(Object o) {
        printStringOnConsole.accept(o.toString());
    }

    public static void main(String[] args) {
        main();
    }
}