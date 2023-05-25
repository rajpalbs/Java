package system.hamming.chapter1.behaviourAsParameter;

public final class MarutiSuzukiSwiftLDI extends MarutiSuzukiSwift {

    private String chassisNumber;
    private String engineNumber;

    public MarutiSuzukiSwiftLDI(String chassisNumber, String engineNumber) {
        this.chassisNumber = chassisNumber;
        this.engineNumber = engineNumber;
    }

    @Override
    public String getVariant() {
        return "Diesel";
    }

    @Override
    public void start() {
        System.out.println("Staring MarutiSuzukiSwiftLDI, chassisNumber : " + chassisNumber + ", engineNumber : " + engineNumber);
    }

    @Override
    public void drive() {
        System.out.println("Driving MarutiSuzukiSwiftLDI, chassisNumber : " + chassisNumber + ", engineNumber : " + engineNumber);
    }

    @Override
    public void stop() {
        System.out.println("Stopping MarutiSuzukiSwiftLDI, chassisNumber : " + chassisNumber + ", engineNumber : " + engineNumber);
    }

    @Override
    public boolean isLatestModel(String manufacturingYear) {
        return true;
    }
}
