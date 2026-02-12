public class TransportTruck extends Truck {
    private boolean goesAbroad;

    public TransportTruck(String plateNumber, int numberOfTires, double dailyFee,
                          int loadingCapacity, boolean goesAbroad) {
        super(plateNumber, numberOfTires, dailyFee, loadingCapacity);
        this.goesAbroad = goesAbroad;
    }

    public void setGoesAbroad(boolean goesAbroad) {
        this.goesAbroad = goesAbroad;
    }
}