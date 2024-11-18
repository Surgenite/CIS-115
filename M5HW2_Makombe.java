/**
 * M5HW2_Makombe
 */
import java.util.Scanner;
public class M5HW2_Makombe
{

    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        // variables
        String choice = "yes";
        while (choice.equalsIgnoreCase("yes"))
        {
            final double  widgetsSalesAmount, PRICE = 4.79, Salary = 2000;
            double commRate, commissionAmount;
            int widgetsSold, widgetsReturned, netWidgetsSold, totWidgetsSold = 0, totWidgetsReturned = 0, weeks = 4, i;
            str name;
            // for loop for widgets sold
            for(i = 1;i <= weeks; i++)
            {
                System.out.print("Enter Widgets sold for week #" + i + ": ");
                widgetsSold = k.nextInt();
                totWidgetsSold += widgetsSold;
            }
            System.out.println("Total Widgets Sold: " + totWidgetsSold);
            // widgets returned for loop
            for(i = 1;i <= weeks; i++)
            {
                System.out.print("Enter Widgets returned for week #" + i + ": ");
                widgetsReturned = k.nextInt();
                totWidgetsReturned += widgetsReturned;
            }
            System.out.println("Total Widgets Returned: " + totWidgetsReturned);
            // Net widgets sold calculations
            netWidgetsSold = totWidgetsSold - totWidgetsReturned;
            System.out.println("Net Widgets Sold: " + netWidgetsSold);
            // Widgets Sales Amount
            widgetsSalesAmount = netWidgetsSold * PRICE;
            System.out.println("Widget Sales Amount: " + widgetsSalesAmount);

            //Commision
            if (netWidgetsSold <=100)
            {
                commRate = .1;
            }
            else if (netWidgetsSold < 200)
            {
                commRate = .15;
            }

            System.out.println();
            System.out.println();
            System.out.print("Would you like to run the program again? Enter yes or no: ");
            choice = k.next();
        }
        k.close();
        System.out.println();
        System.out.println("Program has exited!");
    }
}