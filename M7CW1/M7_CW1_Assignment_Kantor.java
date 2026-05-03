import java.util.Scanner;

public class M7_CW1_Assignment_Kantor { // change to your last name

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        // Print all choices to the user
        do {
            System.out.println("\n---- M7CW1 Menu ----");
            System.out.println("1. Sum Function");
            System.out.println("2. Greeting Function");
            System.out.println("3. Area of a circle");
            System.out.println("4. Larger of two numbers");
            System.out.println("5. Temperature Converter");
            System.out.println("6. Find Student Info");
            System.out.println("7. Discount Calculator");
            System.out.println("8. Check Even or Odd");
            System.out.println("9. String length");
            System.out.println("10. Average of three numbers");
            System.out.println("0. Exit");
            System.out.print("Enter your choice (0-9): ");
            choice = input.nextInt();
            input.nextLine();

            // Case choices for the menue based off users input #
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter two integers: ");
                    int a = input.nextInt(), b = input.nextInt();
                    System.out.println("Sum = " + add(a, b));
                }
                case 2 -> {
                    System.out.print("Enter your name: ");
                    String name = input.nextLine();
                    greet(name);
                }
                case 3 -> {
                    System.out.print("Enter radius: ");
                    double r = input.nextDouble();
                    System.out.println("Area = " + circleArea(r));
                }
                case 4 -> {
                    System.out.print("Enter two numbers: ");
                    int x = input.nextInt(), y = input.nextInt();
                    larger(x, y);
                }
                case 5 -> {
                    System.out.print("Enter Fahrenheit temperature: ");
                    double f = input.nextDouble();
                    System.out.println("Celsius = " + toCelsius(f));
                }
                case 6 -> {
                    System.out.print("Enter student name: ");
                    String sname = input.nextLine();
                    System.out.print("Enter grade: ");
                    int grade = input.nextInt();
                    showStudent(sname, grade);
                }
                case 7 -> {
                    System.out.print("Enter price and discount (%): ");
                    double price = input.nextDouble(), percent = input.nextDouble();
                    System.out.println("Discounted price = " + discounted(price, percent));
                }
                case 8 -> {
                    System.out.print("Enter a number: ");
                    int n = input.nextInt();
                    System.out.println("The number is " + isEvenOdd(n));
                }
                case 9 -> {
                    System.out.print("Enter a string: ");
                    String str = input.nextLine();
                    System.out.println("Length = " + strLength(str));
                }
                case 10 -> {
                    System.out.print("Enter three integers: ");
                    int n1 = input.nextInt(), n2 = input.nextInt(), n3 = input.nextInt();
                    System.out.println("Average = " + average(n1, n2, n3));
                }
                case 0 -> System.out.println("Exiting program. Goodbye!");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);
        input.close();
    }

    // 1. Sum Method that adds 2 numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // 2. Greeting method which greets users inputted name
    public static void greet(String name) {
        System.out.println("Hello, " + name);
    }

    // 3. Calculates the area of a circle with a given radius
    public static double circleArea(double r) {
        return Math.PI * r * r;
    }

    // 4. Prints which of two numbers is larger
    public static void larger(int x, int y) {
        if (x > y)
            System.out.println(x + " is larger.");
        else if (y > x)
            System.out.println(y + " is larger.");
        else
            System.out.println("They are equal.");
    }

    // 5. Converts Fahrenheit to Celsius
    public static double toCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    // 6. Prints student name and grade
    public static void showStudent(String name, int grade) {
        System.out.println("Name: " + name + ", Grade: " + grade);
    }

    // 7. Returns price after discount is applied
    public static double discounted(double price, double percent) {
        return price - (price * percent / 100);
    }

    // 8. Returns even or odd
    public static String isEvenOdd(int n) {
        if (n % 2 == 0)
            return "even";
        else
            return "odd";
    }

    // 9. Returns the length of a string
    public static int strLength(String str) {
        return str.length();
    }

    // 10. Returns the average of three integers as a double
    public static double average(int n1, int n2, int n3) {
        return (n1 + n2 + n3) / 3.0;
    }
}
