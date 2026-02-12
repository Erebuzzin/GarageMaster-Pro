import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VehiclePark park = new VehiclePark();
        System.out.println("Welcome to the VPark System");
        System.out.println("Are you a customer or admin?");
        System.out.print("Enter '1' for Customer or '2' for Admin: ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            park.customerMenu(scanner);
        } else if (choice == 2) {
            park.adminMenu(scanner);
        } else {
            System.out.println("Invalid option. Exiting...");
        }
    }
}