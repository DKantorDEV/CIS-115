// Daniel Kantor's Final Project for CIS-115
// May 12, 2026
// CIS-115
// This program is a receipt "printer"/"displayer"

import java.util.Scanner;

public class KantorFinal {

    // Prints students info and statements
    public static void displayInfo() {
        System.out.println("========================================");
        System.out.println("Daniel Kantor");
        System.out.println("2026 Fall CIS 115 Final Exam");
        System.out.println("I did not use AI to help me with this final");
        System.out.println("I used only concepts covered in class");
        System.out.println("========================================");
        System.out.println();
    }

    // Asks the user how many items purchased or will be purchased
    public static int getItemCount(Scanner scanner) {
        System.out.print("How many items do you plan to purchase today? ");
        int itemCount = scanner.nextInt();
        return itemCount;
    }

    // Ask for each item price and if there is an error, handles that error
    public static double getItemPrices(Scanner scanner, int itemCount) {
        double totalItemCost = 0.0;

        for (int itemNumber = 1; itemNumber <= itemCount; itemNumber++) {
            System.out.print("Enter item #" + itemNumber + ": ");
            double itemPrice = scanner.nextDouble();

            while (itemPrice < 0) {
                System.out.println("Item price cannot be less than zero! Please try again");
                System.out.print("Please re-enter the price for item #" + itemNumber + ": ");
                itemPrice = scanner.nextDouble();
            }

            totalItemCost = totalItemCost + itemPrice;
        }

        return totalItemCost;
    }

    // Calculates the sales tax
    public static double getSalesTax(double totalItemCost) {
        final double TAX_RATE = 0.07;
        double salesTax = TAX_RATE * totalItemCost;
        return salesTax;
    }

    // Calculates total owed by user
    public static double getTotalOwed(double totalItemCost, double salesTax) {
        double totalOwed = totalItemCost + salesTax;
        return totalOwed;
    }

    // Displays everything on the receipt
    public static void displayValues(int itemCount, double subtotal, double taxDue, double totalOwed) {
        System.out.println();
        System.out.println("========================================");
        System.out.println("             CAMERON'S STORE            ");
        System.out.println("========================================");
        System.out.printf("Number of Items: %d%n", itemCount);
        System.out.printf("Subtotal:        $%,.2f%n", subtotal);
        System.out.printf("Tax Due:         $%,.2f%n", taxDue);
        System.out.printf("Total Owed:      $%,.2f%n", totalOwed);
        System.out.println("========================================");
    }

    // Main program that runs each method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        displayInfo();

        int itemCount = getItemCount(scanner);

        double subtotal = getItemPrices(scanner, itemCount);

        double taxDue = getSalesTax(subtotal);

        double totalOwed = getTotalOwed(subtotal, taxDue);

        displayValues(itemCount, subtotal, taxDue, totalOwed);

        scanner.close();
    }

}