public class Sports extends Car implements Bookable, Rentable, Deliverable, Droppable {
    private int horsePower;

    public Sports(String plateNumber, int numberOfTires, double dailyFee,
                  String color, int seatingCapacity, int numOfDoors, int horsePower) {
        super(plateNumber, numberOfTires, dailyFee, color, seatingCapacity, numOfDoors);
        this.horsePower = horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}