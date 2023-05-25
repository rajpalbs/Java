package system.hamming.chapter1.behaviourAsParameter;

public interface Car extends Vehicle {
    abstract String getType(); // hatchback,suv,sedan

    abstract boolean isAutomatic();

    abstract boolean isSelfDrive();

    abstract String getVariant();
}
