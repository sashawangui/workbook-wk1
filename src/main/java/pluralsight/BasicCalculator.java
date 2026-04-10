package pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String [] args){
        System.out.println("Welcome to Sasha's basic calculator");

        Scanner input = new Scanner(System.in);

        //prompt user to enter two numbers
        System.out.print("Enter the first number: ");
        double firstNumber = input.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = input.nextDouble();

        //introduce possible options, get the first letter
        System.out.println("Do you wanna Add, Subtract, Multiply or Divide? ");
        String arithmeticOperation = input.next();
        char arithmeticOpLetter = arithmeticOperation.charAt(0);

        // declare result then add conditionals to change it
        double result = 0;

        //use the first character to choose the operation
        if (arithmeticOpLetter == 'M'){
            result = firstNumber * secondNumber;
        }
        else if (arithmeticOpLetter == 'A'){
            result = firstNumber + secondNumber;
        }
        else if (arithmeticOpLetter == 'S'){
            result = firstNumber - secondNumber;
        }
        else if (arithmeticOpLetter == 'D'){
            result = firstNumber / secondNumber;
        }
        else {
            System.out.println("Invalid");
        }
        //print out the result
        System.out.println(result);
        }


    }

