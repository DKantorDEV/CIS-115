// CIS-115
// Daniel Kantor
// M5CW2
// This program receives user input of prices and calculates the average and total

import java.util.Scanner;

public class M5CW2_Kantor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Variables to begin the program/track values.
        double total = 0;
        int count = 1;
        double price;

        do {
            System.out.print("Enter the price for item " + count + ": ");
            price = scanner.nextDouble();

            // Check if the users # is within parameters
            while (price <= 0 || price > 10000) {
                System.out.println("Invalid price. Please enter a value between 0 and 10,000.");
                price = scanner.nextDouble();
            }

            // Once past the while loop, the number is valid and tracked.
            total += price;
            count++;

        } while (count <= 5);

        // Once statement is true, calculates the average for final display
        double averagePrice = total / 5;

        // Displays the statements back to the user with calculated totals.
        System.out.println("\nAll prices were entered successfully.");
        System.out.printf("Total cost: $%.2f%n", total);
        System.out.printf("Average price: $%.3f%n", averagePrice);

        scanner.close();
    }
}