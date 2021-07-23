import java.util.Scanner; 

// This program demonstrates a nested if statement

public class LoanQualifier 
{
    public static void main(String[] args)
    {
        double salary; // Annual salary
        double yearsOnJob; // Years at current job

        // Create a Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Get the user's annual salary
        System.out.print("Enter your normal salary: ");
        salary = keyboard.nextDouble();

        // Get the number of years at current job
        System.out.print("Enter the number of years " + " at your current job: ");
        yearsOnJob = keyboard.nextDouble();

        // Determine if user qualifies for loan
        if (salary >= 20000)
            {
        if (yearsOnJob >= 2)
                {
                    System.out.println("You qualify for the loan.");
                }
            else
                {
                    System.out.println("You must have been on your " +
                        "current job for at least " +
                        "two years to qualify."); 
                }
            }
            else
                {
                    System.out.println("You must earn at least " + 
                    "$20,000 yper year to qualify.");
                }
    }
}



