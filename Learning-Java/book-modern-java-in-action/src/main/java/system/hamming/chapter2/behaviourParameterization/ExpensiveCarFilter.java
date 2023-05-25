package system.hamming.chapter2.behaviourParameterization;

public class ExpensiveCarFilter implements CarFilter{
    @Override
    public boolean isFilterable(Car car) {
        return car.getPrice() > 18000;
    }
}
