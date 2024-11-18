import java.util.Scanner;
public class M5HW1_Makombe
{
    public static void main(String[] args) 
    {
        Scanner k = new Scanner(System.in);
        char runAgain;
         
         do 
         {
            System.out.print("Enter the number of grades: ");
            int numGrades = k.nextInt();

            double totalSum = 0;
            double grade;
            int validGrades = 0;
 
            for (int i = 0; i < numGrades; i++) 
            {
                do 
                {
                    System.out.print("Enter grade #" + (i + 1) + ": ");
                    grade = k.nextDouble();
                 
                    if (grade < 0 || grade > 100) {
                        System.out.println("Invalid grade! Grade must be between 0 and 100. Please enter a valid grade.");
                    }
                } while (grade < 0 || grade > 100);  
                
                totalSum += grade;
                validGrades++;
            }

            
            double average = totalSum / validGrades;

            char gradeLetter;
            if (average >= 90) {
                gradeLetter = 'A';
            } else if (average >= 80) {
                gradeLetter = 'B';
            } else if (average >= 70) {
                gradeLetter = 'C';
            } else if (average >= 60) {
                gradeLetter = 'D';
            } else {
                gradeLetter = 'F';
            }


            System.out.println("Average: " + average);
            System.out.println("Letter Grade: " + gradeLetter);

            System.out.print("Do you want to enter another set of grades? (y/n): ");
            runAgain = k.next().charAt(0);
            
        } while (runAgain == 'y' || runAgain == 'Y'); 

        System.out.println("Program has exited. Goodbye!");

        k.close();
    }
}
