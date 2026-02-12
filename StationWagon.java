public class StationWagon extends Car implements Rentable, Deliverable, Droppable {
    private int loadingCapacity;

    public StationWagon(String plateNumber, int numberOfTires, double dailyFee,
                        String color, int seatingCapacity, int numOfDoors, int loadingCapacity) {
        super(plateNumber, numberOfTires, dailyFee, color, seatingCapacity, numOfDoors);
        this.loadingCapacity = loadingCapacity;
    }

    public void setLoadingCapacity(int loadingCapacity) {
        this.loadingCapacity = loadingCapacity;
    }
}