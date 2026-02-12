public abstract class Vehicle {
    protected String id;
    protected String plateNumber;
    protected int numberOfTires;
    protected double dailyFee;

    public Vehicle(String plateNumber, int numberOfTires, double dailyFee) {
        this.plateNumber = plateNumber;
        this.numberOfTires = numberOfTires;
        this.dailyFee = dailyFee;
    }

    public double getTotalFee(int numberOfDays) {
        return numberOfDays * dailyFee;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public int getNumberOfTires() {
        return numberOfTires;
    }

    public double getDailyFee() {
        return dailyFee;
    }
}