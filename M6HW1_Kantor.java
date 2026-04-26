// Daniel Kantor
// CIS-115
// April 26, 2026
// This program calculates the gross pay of an individual based on hours worked

import java.util.Scanner;

public class M6HW1_Kantor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for employee's name
        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();

        // Ask for their pay rate
        System.out.print("Enter pay rate ($/hr): ");
        double payRate = scanner.nextDouble();

        // Ask how many hours worked
        System.out.print("Enter hours worked: ");
        double hoursWorked = scanner.nextDouble();

        // Calculate the gross pay
        double grossPay = payRate * hoursWorked;

        // Print all the information
        System.out.println("\n--- Employee Pay Summary ---");
        System.out.println("Employee Name: " + employeeName);
        System.out.printf("Pay Rate:      $%.2f/hr%n", payRate);
        System.out.printf("Hours Worked:  %.2f hrs%n", hoursWorked);
        System.out.printf("Gross Pay:     $%.2f%n", grossPay);

        scanner.close();
    }
}
