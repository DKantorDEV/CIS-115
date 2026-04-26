// Daniel Kantor
// CIS-115
// April 26, 2026
// This program calculates the water bill the homeowner will have to pay based on their usage

import java.util.Scanner;

public class M6HW2_Kantor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for homeowner's name
        System.out.print("Enter homeowner name: ");
        String homeownerName = scanner.nextLine();

        // Ask for previous month's water reading
        System.out.print("Enter previous month's meter reading: ");
        double previousReading = scanner.nextDouble();

        // Ask for current month's water reading
        System.out.print("Enter current month's meter reading: ");
        double currentReading = scanner.nextDouble();

        // Calculate the usage difference with this formula
        double usage = currentReading - previousReading;
        double totalCharge = (usage * 0.20) + 50.00;

        // Print the summary of all information
        System.out.println("\n--- Water Bill Summary ---");
        System.out.println("Homeowner:        " + homeownerName);
        System.out.printf("Previous Reading: %.2f%n", previousReading);
        System.out.printf("Current Reading:  %.2f%n", currentReading);
        System.out.printf("Total Charge:     $%.2f%n", totalCharge);

        scanner.close();
    }
}
