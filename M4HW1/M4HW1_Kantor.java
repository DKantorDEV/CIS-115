// Daniel Kantor
// M4HW1
// February 25, 2026
// Generates a salesmans salary and commission for the data they input

import java.util.Scanner;

public class M4HW1_Kantor {
    public static void main(String[] args) {
        
        // Declare Constant
        final double WIDGET_PRICE = 4.79;
        
        // Declare Variables
        String name;
        int widgetsSold, widgetsReturned, netWidgetsSold;
        double baseSalary = 2000.00;
        double widgetsSalesAmount, commissionRate, commissionAmount, monthlySalary;

        // User inputs we need (name and widget info)
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter salesperson's name: ");
        name = keyboard.nextLine();

        System.out.println("Enter widgets sold: ");
        widgetsSold = keyboard.nextInt();

        System.out.println("Enter widgets returned: ");
        widgetsReturned = keyboard.nextInt();

        // Calculation of widgets data
        netWidgetsSold = widgetsSold - widgetsReturned;
        widgetsSalesAmount = netWidgetsSold * WIDGET_PRICE;

        // IF/ELSE statement to calculate commission rate
        if (netWidgetsSold >= 0 && netWidgetsSold <= 100) {
            commissionRate = 0.10;
        }
        else if (netWidgetsSold >= 101 && netWidgetsSold <= 199) {
            commissionRate = 0.15;
        }
        else if (netWidgetsSold >= 200 && netWidgetsSold <= 299) {
            commissionRate = 0.20;
        }
        else {
            commissionRate = 0.25;
        }

        // Salesperson's earnings calculations
        commissionAmount = widgetsSalesAmount * commissionRate;
        monthlySalary = baseSalary + commissionAmount;

        // 8. Display Results
        System.out.println("\nSales Person: " + name);
        System.out.println("Net Widgets Sold: " + netWidgetsSold);
        System.out.printf("Widgets Sales Amount: $%.2f%n", widgetsSalesAmount);
        System.out.printf("Commission Earnings: $%.2f%n", commissionAmount);
        System.out.printf("Monthly Salary: $%.2f%n", monthlySalary);

        keyboard.close();

    }
}