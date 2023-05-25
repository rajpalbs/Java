package system.hamming.chapter2.behaviourParameterization;

public class RedColorCarFilter implements CarFilter{
    @Override
    public boolean isFilterable(Car car) {
        return car.getColor() == Color.RED;
    }
}
