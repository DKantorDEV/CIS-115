// CIS-115
// Daniel Kantor
// M5CW1
// This program uses a for loop to add numbers together

public class M5CW1_Kantor {

    public static void main(String[] args) {

        // Total tracker outside of for loop
        int total = 0;

        // For loop logic
        for (int i=1; i < 6; i++) {
            total += i;
        }

        String statement = "The sum of the numbers is: " + total;

        System.out.println(statement);

    }

}
