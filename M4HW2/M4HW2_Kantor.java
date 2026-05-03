// Daniel Kantor
// M4HW2
// March 22, 2026
// This program checks if a user is eligible to vote in the state of NC following certain parameters

import java.util.Scanner;

public class M4HW2_Kantor {
    
    public static void main(String[] args) {

        // Declaring Variables
        boolean isCitizen;
        int daysInCounty;
        int age;
        boolean onProbation;
        boolean hasFelony;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Are you a US Citizen? (true/false): ");
        isCitizen = scanner.nextBoolean();

        System.out.print("How many days have you lived in this county? ");
        daysInCounty = scanner.nextInt();

        System.out.print("How old are you? ");
        age = scanner.nextInt();

        System.out.print("Are you on probation? (true/false): ");
        onProbation = scanner.nextBoolean();

        System.out.print("Are you a felon? (true/false): ");
        hasFelony = scanner.nextBoolean();

        if (isCitizen) {
            if (daysInCounty >= 30) {
                if (age >= 18) {
                    if (!onProbation) {
                        if (!hasFelony) {
                            System.out.println("You are eligible to vote!");
                        } else {
                            System.out.println("You're a felon! Ineligible to vote!");
                        }
                    } else {
                        System.out.println("You're on parole, ineligible to vote!");
                    }
                } else {
                    System.out.println("You're under 18 and are ineligible to vote!");
                }
            } else {
                System.out.println("Must have lived in the county for over 30 days, you're ineligible.");
            }
        } else {
            System.out.println("Must be a US citizen to vote.");
        }

        scanner.close();

    }

}
