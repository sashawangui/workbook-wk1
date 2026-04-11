package pluralsight;
import java.util.Scanner;


public class PayrollCalculator {
    public static void main(String[] args){

        Scanner input  = new Scanner(System.in);

        //declare variables and assign them to user input
        System.out.print("What is your name? ");
        String yourName = input.nextLine();

        System.out.print("How many hours have you worked? ");
        float hoursWorked = input.nextFloat();

        System.out.print("What is your pay rate per hour? ");
        float payRate = input.nextFloat();

        //Calculate gross pay (hours * rate / hour)
        //if they worked > 40 hours, pay 1.5* more per overtime hour
        float regularHoursGrossPay = (payRate * hoursWorked);
        float totalGrossPay = 0;

        if (hoursWorked > 40) {
            totalGrossPay = regularHoursGrossPay + (float) ((1.5 * payRate) * (hoursWorked - 40));
        }
        else {
             totalGrossPay = regularHoursGrossPay;
            }

        System.out.println("Hey " + yourName + ", your gross pay for " + hoursWorked + " hours is $" + totalGrossPay );
    }
}
