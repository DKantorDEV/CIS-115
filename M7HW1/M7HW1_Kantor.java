// Daniel Kantor
// M7HW1
// May 4, 2026
// Program collects weekly sales and returns data

import java.util.Scanner;

public class M7HW1_Kantor {

    static Scanner k = new Scanner(System.in);
    // Constant for widget price since it doesn't change
    static final double WIDGET_PRICE = 4.79;

    public static void main(String[] args) {
        runProgram();
    }

    // runProgram method to run the entire program and call respective methods
    public static void runProgram() {
        String keepGoing = "yes";

        System.out.println("Enter salesperson's name: ");
        String name = k.nextLine();

        while (keepGoing.equalsIgnoreCase("yes")) {
            displayInfo(name);

            // Run each method so the program has all pertinent information to work effectively
            int widgetsSold = getSales();
            int widgetsReturned = getReturns();
            int netWidgetsSold = calWidSold(widgetsSold, widgetsReturned);
            double widgetSalesAmt = calWidSalesAmt(netWidgetsSold);
            double commissionAmt = calComm(netWidgetsSold, widgetSalesAmt);
            double monthlySalary = calSalary(commissionAmt);

            displayValues(name, widgetsSold, widgetsReturned, netWidgetsSold, widgetSalesAmt, commissionAmt, monthlySalary);

            System.out.println("\nDo you want to run the program again? Enter yes or no: ");
            keepGoing = k.next();
            k.nextLine();
            System.out.println();
        }

        k.close();
        System.out.println("Program has terminated!");
    }

    // Displays salesman's name and description
    public static void displayInfo(String name) {
        System.out.println();
        System.out.println(name);
        System.out.println("Weekly Commission Calculator");
        System.out.println();
    }

    // Asks for sales for weeks 1-4 and stores them
    public static int getSales() {
        int widgetsSold = 0;
        for (int week = 1; week <= 4; week++) {
            System.out.println("Enter the widgets sold for week " + week + ": ");
            widgetsSold += k.nextInt();
        }
        return widgetsSold;
    }

    // Asks for returns for weeks 1-4 and stores them
    public static int getReturns() {
        int widgetsReturned = 0;
        for (int week = 1; week <= 4; week++) {
            System.out.println("Enter widgets returned for week " + week + ": ");
            widgetsReturned += k.nextInt();
        }
        return widgetsReturned;
    }

    // Take total widgets sold and returned to get the actual amount sold
    public static int calWidSold(int widgetsSold, int widgetsReturned) {
        return widgetsSold - widgetsReturned;
    }

    // Calculate how much of those sold equals to what $ amount
    public static double calWidSalesAmt(int netWidgetsSold) {
        return netWidgetsSold * WIDGET_PRICE;
    }

    // Based of the widgets sold, calculate the salesman's commission
    public static double calComm(int netWidgetsSold, double widgetSalesAmt) {
        double commissionRate;
        if (netWidgetsSold >= 0 && netWidgetsSold <= 100) {
            commissionRate = 0.10;
        } else if (netWidgetsSold >= 101 && netWidgetsSold <= 199) {
            commissionRate = 0.15;
        } else if (netWidgetsSold >= 200 && netWidgetsSold <= 299) {
            commissionRate = 0.20;
        } else {
            commissionRate = 0.25;
        }
        return widgetSalesAmt * commissionRate;
    }

    // Calculate their salary for the month based of base pay and commission
    public static double calSalary(double commissionAmt) {
        return 2000.00 + commissionAmt;
    }

    // Display all the info for the respective salesperson
    public static void displayValues(String name, int widgetsSold, int widgetsReturned, int netWidgetsSold,
                                     double widgetSalesAmt, double commissionAmt, double monthlySalary) {
        System.out.println("\nSales Person: " + name);
        System.out.println("Widgets Sold: " + widgetsSold);
        System.out.println("Widgets Returned: " + widgetsReturned);
        System.out.println("Net Widgets Sold: " + netWidgetsSold);
        System.out.printf("Widget Sales Amount: $%.2f%n", widgetSalesAmt);
        System.out.printf("Commission Amount: $%.2f%n", commissionAmt);
        System.out.printf("Monthly Salary: $%.2f%n", monthlySalary);
    }
}
