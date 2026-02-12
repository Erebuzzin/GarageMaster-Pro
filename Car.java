public abstract class Car extends Vehicle {
    protected String color;
    protected int seatingCapacity;
    protected int numOfDoors;

    public Car(String plateNumber, int numberOfTires, double dailyFee,
               String color, int seatingCapacity, int numOfDoors) {
        super(plateNumber, numberOfTires, dailyFee);
        this.color = color;
        this.seatingCapacity = seatingCapacity;
        this.numOfDoors = numOfDoors;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }
}