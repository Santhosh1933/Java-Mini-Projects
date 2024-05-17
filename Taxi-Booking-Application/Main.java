import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaxiBookingSystem system = new TaxiBookingSystem();
        Scanner sc = new Scanner(System.in);

        // Initial Taxi Assign

        system.addTaxi("T1", "Driver 1");
        system.addTaxi("T2", "Driver 2");
        system.addTaxi("T3", "Driver 3");

        // Loop Run -> options (Terminal)

        while (true) {
            System.out.println("\n Taxi Booking System");
            System.out.println("1. Display Available Taxis");
            System.out.println("2. Book a Taxi");
            System.out.println("3. Display Booking");
            System.out.println("4. Exit");
            System.out.println("Enter your Choice...");
            int choice = sc.nextInt();
            sc.nextLine(); //line space
            switch (choice) {
                case 1:
                    system.displayAvailableTaxis();
                    break;
                
                case 2:
                    System.out.println("Enter your Name");
                    String name = sc.nextLine();
                    system.bookTaxi(name);
                    break;
                
                case 3:
                    system.displayBookings();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Ïnvalid Choice");
                    break;
            }

        }

    }
}
