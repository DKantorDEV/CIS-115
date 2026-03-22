// Daniel Kantor
// M4 Hands-On Test
// March 22, 2026
// This program converts a users given temperature in Fahrenheit and displays a message based on the temperature.

import java.util.Scanner;

public class M4Test_Kantor {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit: ");
        double temp = scanner.nextDouble();

        if (temp < 0) {
            System.out.println("Unusual input detected. Double-check your entry.");
        } else if (temp < 32) {
            System.out.println("Freezing - bundle up!");
        } else if (temp <= 50) {
            System.out.println("Cold - wear a jacket.");
        } else if (temp <= 70) {
            System.out.println("Mild - a light sweater will do.");
        } else if (temp <= 90) {
            System.out.println("Warm - enjoy the day.");
        } else {
            System.out.println("Hot - stay hydrated!");
        }

        scanner.close();

    }

}