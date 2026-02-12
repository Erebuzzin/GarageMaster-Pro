public class SUV extends Car implements Rentable {
    private String wheelDrive;

    public SUV(String plateNumber, int numberOfTires, double dailyFee,
               String color, int seatingCapacity, int numOfDoors, String wheelDrive)
               throws InvalidWheelDriveException {
        super(plateNumber, numberOfTires, dailyFee, color, seatingCapacity, numOfDoors);
        if (!wheelDrive.equals("RWD") && !wheelDrive.equals("FWD") &&
            !wheelDrive.equals("4WD") && !wheelDrive.equals("AWD")) {
            throw new InvalidWheelDriveException("Invalid wheel drive: " + wheelDrive);
        }
        this.wheelDrive = wheelDrive;
    }

    public void setWheelDrive(String wheelDrive) throws InvalidWheelDriveException {
        if (!wheelDrive.equals("RWD") && !wheelDrive.equals("FWD") &&
            !wheelDrive.equals("4WD") && !wheelDrive.equals("AWD")) {
            throw new InvalidWheelDriveException("Invalid wheel drive: " + wheelDrive);
        }
        this.wheelDrive = wheelDrive;
    }
}