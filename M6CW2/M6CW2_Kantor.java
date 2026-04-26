import java.util.Scanner;

public class M6CW2_Kantor {

    // The main function which calls the other methods in order to be executed/ran
    public static void main(String[] args) {
        displayGreeting();
        calculateArea();
        displayClosing();
    }

    // The displayGreeting function prints a greeting
    public static void displayGreeting() {
        System.out.println("Welcome to the Area Calculator!");
    }

    // The calculateArea takes user input for length and width, calculates the area then display's it
    public static void calculateArea() {
        Scanner scanner = new Scanner(System.in);

        // Asks user for length and uses that input for the length variable
        System.out.print("Enter the length: ");
        double length = scanner.nextDouble();

        // Asks user for width and uses that input for the width variable
        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();

        // Calculates the area
        double area = length * width;

        // Prints the area along with a message
        System.out.println("The area of the rectangle is " + area + ".");

        scanner.close();
    }

    // The displayClosing function prints a closing message
    public static void displayClosing() {
        System.out.println("Thank you for using this program!");
    }

}