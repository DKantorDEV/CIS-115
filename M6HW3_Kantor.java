// Daniel Kantor
// CIS-115
// April 26, 2026
// This program calculates the commission a person earns based on widgets sold

import java.util.Scanner;

public class M6HW3_Kantor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for salesperson's name
        System.out.print("Enter salesperson's name: ");
        String salespersonName = scanner.nextLine();

        // Ask how many widgets sold
        System.out.print("Enter widgets sold: ");
        int widgetsSold = scanner.nextInt();

        // Ask how many widgets returned
        System.out.print("Enter widgets returned: ");
        int widgetsReturned = scanner.nextInt();

        // Calculate the net widgets
        int netWidgets = widgetsSold - widgetsReturned;
        double totalCommission = 500.00 + (netWidgets * 0.10);

        // Print the summary of all the information
        System.out.println("\n--- Sales Commission Summary ---");
        System.out.println("Salesperson:      " + salespersonName);
        System.out.println("Net Widgets Sold: " + netWidgets);
        System.out.printf("Total Commission: $%.2f%n", totalCommission);

        scanner.close();
    }
}
