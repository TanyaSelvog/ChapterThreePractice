import java.util.Scanner; // Needed for Scanner

// This program demonstrates the logical && operator

public class LogicalAnd
{
    public static void main(String[] args)
    {
        double salary; // Annual salary
        double yearsOnJob; // years at current job


        // Create a Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Get the user's annual salary
        System.out.print("Enter your salary: ");
        salary = keyboard.nextDouble();

        // Get the number of years at the current job
        System.out.print("Enter the number of years " +
        "at your current job: ");
        yearsOnJob = keyboard.nextDouble();

        // Determine whether the user qualifies for the loan
        if (salary >= 20000 && yearsOnJob >= 2)
            {
                System.out.println("You qualify for the loan.");
            }
            else
            {
                System.out.println("You do not qualify.");
            }
    }
}
