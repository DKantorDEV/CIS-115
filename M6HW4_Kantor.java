// Daniel Kantor
// CIS-115
// April 26, 2026
// This program uses the methods of M6HW1, M6HW2 and M6HW3 to be used within one main method. 
// Essentially creating a program the user can interact with and choose.

import java.util.Scanner;

public class M6HW4_Kantor {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        runProgram();
    }

    // A loop to continue running the program until user quits
    public static void runProgram() {
        System.out.println("Method Project");
        String keep_going = "yes";
        while (keep_going.equalsIgnoreCase("yes")) {
            displayMenu();
            System.out.println();
            System.out.println("You have quit the menu!");
            System.out.print("Do you want to see the menu again? Enter yes or no: ");
            keep_going = in.next();
            System.out.println();
        }
        in.close();
        System.out.println("Program has quit!");
    }

    // Method to display menu options to the user
    public static void displayMenu() {
        // Menu options presented to the user
        System.out.println();
        System.out.println("Menu");
        System.out.println("1) M6HW1: Gross Pay Calculator");
        System.out.println("2) M6HW2: Water Bill Calculator");
        System.out.println("3) M6HW3: Sales Commission Program");
        System.out.println("4) Quit");
        System.out.print("Selection: ");
        // Switch case based off user's input
        int selection = in.nextInt();
        in.nextLine();
        switch (selection) {
            case 1:
                getM6HW1();
                displayMenu();
                break;
            case 2:
                getM6HW2();
                displayMenu();
                break;
            case 3:
                getM6HW3();
                displayMenu();
                break;
            case 4:
                System.out.println("Quitting the program...");
                break;
            default:
                System.out.println("Invalid selection. Try again.");
                displayMenu();
        }
    }

    // M6HW1: This method calculates the gross pay of an individual based on hours worked
    public static void getM6HW1() {
        // Ask for employee's name
        System.out.print("Enter employee name: ");
        String employeeName = in.nextLine();

        // Ask their pay rate
        System.out.print("Enter pay rate ($/hr): ");
        double payRate = in.nextDouble();

        // Ask hours worked
        System.out.print("Enter hours worked: ");
        double hoursWorked = in.nextDouble();
        in.nextLine();

        // Calculate the gross pay
        double grossPay = payRate * hoursWorked;

        // Print all the information back to the user
        System.out.println("\n--- Employee Pay Summary ---");
        System.out.println("Employee Name: " + employeeName);
        System.out.printf("Pay Rate:      $%.2f/hr%n", payRate);
        System.out.printf("Hours Worked:  %.2f hrs%n", hoursWorked);
        System.out.printf("Gross Pay:     $%.2f%n", grossPay);
    }

    // M6HW2: This method calculates the water bill the homeowner will have to pay based on their usage
    public static void getM6HW2() {
        // Ask for homeowner's name
        System.out.print("Enter homeowner name: ");
        String homeownerName = in.nextLine();

        // Ask for previous month's water reading
        System.out.print("Enter previous month's meter reading: ");
        double previousReading = in.nextDouble();

        // Ask for current month's water reading
        System.out.print("Enter current month's meter reading: ");
        double currentReading = in.nextDouble();
        in.nextLine();

        // Calculate the usage and total the homeowner will have to pay
        double usage = currentReading - previousReading;
        double totalCharge = (usage * 0.20) + 50.00;

        // Print all the information back to the user
        System.out.println("\n--- Water Bill Summary ---");
        System.out.println("Homeowner:        " + homeownerName);
        System.out.printf("Previous Reading: %.2f%n", previousReading);
        System.out.printf("Current Reading:  %.2f%n", currentReading);
        System.out.printf("Total Charge:     $%.2f%n", totalCharge);
    }

    // M6HW3: This method calculates the commission a person earns based on widgets sold
    public static void getM6HW3() {
        // Ask for the salesperon's name
        System.out.print("Enter salesperson's name: ");
        String salespersonName = in.nextLine();

        // Ask how many widgets sold
        System.out.print("Enter widgets sold: ");
        int widgetsSold = in.nextInt();

        // Ask how many widgets returned
        System.out.print("Enter widgets returned: ");
        int widgetsReturned = in.nextInt();
        in.nextLine();

        // Calculate net widgets and commission
        int netWidgets = widgetsSold - widgetsReturned;
        double totalCommission = 500.00 + (netWidgets * 0.10);

        // Print all the infromation back to the user
        System.out.println("\n--- Sales Commission Summary ---");
        System.out.println("Salesperson:      " + salespersonName);
        System.out.println("Net Widgets Sold: " + netWidgets);
        System.out.printf("Total Commission: $%.2f%n", totalCommission);
    }
}
