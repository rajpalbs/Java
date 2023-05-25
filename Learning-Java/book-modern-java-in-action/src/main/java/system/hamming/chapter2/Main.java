package system.hamming.chapter2;

import system.hamming.chapter2.behaviourParameterization.*;

import java.util.Arrays;
import java.util.List;

import static system.hamming.Main.RESET;
import static system.hamming.Main.YELLOW;

public class Main {
    public static void main() {
        System.out.println(YELLOW);System.out.println("\n=== Chapter-2 Main execution started ===\n");
        Car car_1 = getCarInventory().get(0);

        // Filtering car using strategy pattern
        // Strategy - 1
        CarFilter expensiveCarFilter = new ExpensiveCarFilter();
        System.out.println("is "+ car_1 +" is expensive ? " + expensiveCarFilter.isFilterable(car_1));
        // Strategy - 2
        CarFilter redColorCarFilter = new RedColorCarFilter();
        System.out.println("is "+ car_1 +" is red in color ? " + redColorCarFilter.isFilterable(car_1));

        // Filtering car using anonymous class
        CarFilter anonymousCarFilter =  new CarFilter() {
            @Override
            public boolean isFilterable(Car car) {
                return car.getColor() == Color.WHITE && car.getPrice() < 15000;
            }
        };

        System.out.println("is "+ anonymousCarFilter +" is white and cheap ? " + anonymousCarFilter.isFilterable(car_1));

        // In case we want to filter the car having criteria like color is either BLUE || RED And Price is between 12000 and 18000,
        // we need to create one more implementation(strategy) of CarFilter. and in similar line for every possible case we need to write dedicated strategy for it.
        CarFilter filterExpensiveCar = (Car car) -> car.getPrice() > 18000;
        System.out.println("is "+ car_1 +" is expensive ? " + filterExpensiveCar.isFilterable(car_1));

        System.out.println("\n=== Chapter-2 Main execution completed ===\n");System.out.println(RESET);
    }

    static List<Car> getCarInventory(){
        return Arrays.asList(
                new Car(Color.WHITE,10000),
                new Car(Color.BLUE,11000),
                new Car(Color.RED,12000),
                new Car(Color.YELLOW,13000),
                new Car(Color.BLACK,14000),
                new Car(Color.WHITE,15000),
                new Car(Color.BLUE,16000),
                new Car(Color.RED,17000),
                new Car(Color.YELLOW,1800),
                new Car(Color.BLACK,19000),
                new Car(Color.WHITE,20000),
                new Car(Color.BLUE,21000),
                new Car(Color.RED,22000),
                new Car(Color.YELLOW,23000),
                new Car(Color.BLACK,24000),
                new Car(Color.WHITE,25000),
                new Car(Color.BLUE,26000),
                new Car(Color.RED,27000),
                new Car(Color.YELLOW,28000),
                new Car(Color.BLACK,29000));
    }
}