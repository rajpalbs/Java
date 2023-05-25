package system.hamming.chapter1.behaviourAsParameter;

public abstract class MarutiSuzukiSwift implements Car {

    abstract void start();
    abstract void drive();
    abstract void stop();
    abstract boolean isLatestModel(String manufacturingYear);

    @Override
    public String getType() {
        return "Hatchback";
    }
    @Override
    public boolean isAutomatic() {
        return false;
    }
    @Override
    public boolean isSelfDrive() {
        return false;
    }

    @Override
    public void doTrip() {
        this.start();
        this.drive();
        this.stop();
    }
}