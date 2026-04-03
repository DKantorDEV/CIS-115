// CIS-115
// Daniel Kantor
// M5HW1
// This program calculates the users average and provides a grade

import java.util.Scanner;

public class M5HW1_Kantor {
    public static void main(String[] args) {

        char grade;
        Scanner k  = new Scanner(System.in);
        String runProgram = "y";

        while (runProgram.equalsIgnoreCase("y")) {

            System.out.print("How many grades to calculate? ");
            int totalGrades = k.nextInt();

            double total = 0;
            int count = 0;

            do {
                System.out.print("Enter grade " + (count + 1) + ": ");
                double gradeInput = k.nextDouble();

                while (gradeInput < 0 || gradeInput > 100) {
                    System.out.println("That grade cannot exist. Must be between 0 and 100.");
                    System.out.print("Enter grade " + (count + 1) + ": ");
                    gradeInput = k.nextDouble();
                }

                total += gradeInput;
                count ++;

            } while (count < totalGrades);

            double average = total / totalGrades;
            System.out.printf("Average: %.1f%n", average);

            if (average >= 90) {
                grade = 'A';
            } else if (average >= 80) {
                grade = 'B';
            } else if (average >= 70) {
                grade = 'C';
            } else if (average >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            System.out.println("Your grade is: " + grade);
            System.out.print("Run this program again? (y) for yes and (n) for no: ");
            runProgram = k.next();

        }

        System.out.println("Program has been quit.");
        k.close();

    }
}