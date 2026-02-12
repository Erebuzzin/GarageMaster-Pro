import java.util.ArrayList;

public class VehiclePark {
    private ArrayList<Vehicle> vehicles;

    public VehiclePark() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
    }

    public void removeVehicle(Vehicle v) {
        vehicles.remove(v);
    }

    public void displayVehicles() {
        for (Vehicle v : vehicles) {
            System.out.println("Plate: " + v.getPlateNumber() + " | Type: " + v.getClass().getSimpleName());
        }
    }

    public void customerMenu(java.util.Scanner scanner) {
        System.out.println("[Customer Menu] Under construction...");
    }

    public void adminMenu(java.util.Scanner scanner) {
        System.out.println("[Admin Menu] Under construction...");
    }
}