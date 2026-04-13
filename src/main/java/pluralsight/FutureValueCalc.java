package pluralsight;
import java.util.Scanner;

public class FutureValueCalc {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // variable declaration = user input
        //convert the variables to relevant values per formula
        System.out.print("Enter deposit amount ");
        double deposit = input.nextDouble();

        System.out.println("What is the interest rate");
        double interestRate = input.nextDouble();
        interestRate = interestRate/100;

        System.out.println("In years, how long does it take to mature?");
        double numOfYears = input.nextDouble();

        // formula = fv=p*(1+(r/365))^(365*t)
        double dailyInterestRate = interestRate/365;
        double totalDays = numOfYears*365;

        double futureValue = (double) deposit * Math.pow(1+dailyInterestRate,totalDays);
        double interestEarned = futureValue - deposit;

        System.out.printf("The future value is " + futureValue+ " and the interest earned is " + interestEarned);
    }


}
