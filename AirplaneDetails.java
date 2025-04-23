import java.util.Scanner;

class Airplane {
    String flightNumber;  // package-private access
    String destination;   // package-private access
    String departureTime; // package-private access
    boolean isDelayed;    // package-private access
    int delayMinutes;     // package-private access
    
    // Constructor
    Airplane(String flightNumber, String destination, String departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.isDelayed = false;
        this.delayMinutes = 0;
    }
    
    // Method to delay flight
    void delayFlight(int minutes) {
        if (minutes > 0) {
            isDelayed = true;
            delayMinutes += minutes;
        }
    }
    
    // Method to check flight status
    void checkFlightStatus() {
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Destination: " + destination);
        System.out.println("Departure Time: " + departureTime);
        System.out.println("Status: " + (isDelayed ? "Delayed by " + delayMinutes + " minutes" : "On Time"));
    }
}

public class AirplaneDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: flight details
        System.out.print("Enter flight number: ");
        String flightNumber = scanner.nextLine();
        System.out.print("Enter destination: ");
        String destination = scanner.nextLine();
        System.out.print("Enter departure time (e.g., 14:30): ");
        String departureTime = scanner.nextLine();
        
        // Create Airplane object
        Airplane flight = new Airplane(flightNumber, destination, departureTime);
        System.out.println("\nInitial Flight Status:");
        flight.checkFlightStatus();
        
        // Input: delay minutes
        System.out.print("\nEnter delay minutes (0 for no delay): ");
        int delay = scanner.nextInt();
        scanner.close();
        
        if (delay < 0) {
            System.out.println("Invalid delay: Please enter a non-negative number");
            return;
        }
        
        // Update and display flight status
        flight.delayFlight(delay);
        System.out.println("\nUpdated Flight Status:");
        flight.checkFlightStatus();
    }
}
