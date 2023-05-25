package system.hamming.chapter2.behaviourParameterization;

public class Car {

    private final Color color;
    private final Integer price;

    public Car(Color color, Integer price) {
        this.color = color;
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color=" + color +
                ", price=" + price +
                '}';
    }
}

