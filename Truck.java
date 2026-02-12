public abstract class Truck extends Vehicle {
    protected int loadingCapacity;

    public Truck(String plateNumber, int numberOfTires, double dailyFee, int loadingCapacity) {
        super(plateNumber, numberOfTires, dailyFee);
        this.loadingCapacity = loadingCapacity;
    }

    public void setLoadingCapacity(int loadingCapacity) {
        this.loadingCapacity = loadingCapacity;
    }
}