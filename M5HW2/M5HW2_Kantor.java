// Daniel Kantor
// M5HW2
// April 3, 2026
// Program collects weekly sales and returns data

import java.util.Scanner;

public class M5HW2_Kantor {
    public static void main(String[] args) {

        // Declare variables
        final double WIDGET_PRICE = 4.79;
        String name;
        int widgetsSold,
            widgetsReturned,
            netWidgetsSold,
            weeklyAmount;
        double baseSalary = 2000.00;
        double widgetsSalesAmount,
               commissionRate,
               commissionAmount,
               monthlySalary;
        int monthCount = 0;
        char runAgain = 'y';

        Scanner k = new Scanner(System.in);

        System.out.println("Enter salesperson's name: ");
        name = k.nextLine();

        // While loop to run the program again if user wants to
        while (runAgain == 'y' || runAgain == 'Y') {
            monthCount++;
            widgetsSold = 0;
            widgetsReturned = 0;

            // For loop to collect the weekly sales
            for (int week = 1; week <= 4; week++) {
                System.out.println("Month " + monthCount + ": Enter the widgets sold for week " + week + ": ");
                weeklyAmount = k.nextInt();
                widgetsSold += weeklyAmount;
            }

            // For loop to collect the returns
            for (int week = 1; week <= 4; week++) {
                System.out.println("Month " + monthCount + ": Enter widgets returned for week " + week + ": ");
                weeklyAmount = k.nextInt();
                widgetsReturned += weeklyAmount;
            }

            // Calculations for the monthly total
            netWidgetsSold = widgetsSold - widgetsReturned;
            widgetsSalesAmount = netWidgetsSold * WIDGET_PRICE;
        
            // If statements to determine the commission rate
            if (netWidgetsSold >= 0 && netWidgetsSold <= 100) {
                commissionRate = 0.10;
            } else if (netWidgetsSold >= 101 && netWidgetsSold <= 199) {
                commissionRate = 0.15;
            } else if (netWidgetsSold >= 200 && netWidgetsSold <= 299) {
                commissionRate = 0.20;
            } else {
                commissionRate = 0.25;
            }

            // Calculation for the salary of the salesperson
            commissionAmount = widgetsSalesAmount * commissionRate;
            monthlySalary = baseSalary + commissionAmount;

            // Display table of all the data collected
            System.out.println("\nSales Person: " + name);
            System.out.println("Month #" + monthCount);
            System.out.println("Widgets Sold: " + widgetsSold);
            System.out.println("Widgets Returned: " + widgetsReturned);
            System.out.println("Net Widgets Sold: " + netWidgetsSold);
            System.out.printf("Widgets Sales Amount: $%.2f%n", widgetsSalesAmount);
            System.out.printf("Commission Amount: $%.2f%n", commissionAmount);
            System.out.printf("Monthly Salary: $%.2f%n", monthlySalary);

            // Ask user to run program again or quit
            System.out.println("\nRun the program again or quit? (y/n): ");
            runAgain = k.next().charAt(0);

        }

        System.out.println("Program has quit.");
        k.close();
        
    }
}