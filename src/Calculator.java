/* Making Calculator using the switch statement (The program takes three inputs
from the user: one operator and 2 numbers. Based on the operator provided
by the user, it performs the calculation on the numbers. Then the result is
displayed on the screen.) */

import java.util.Scanner;

//Class name
public class Calculator {

// Main Method
    public static void main(String[] args) {


        //Object for scanner class
        Scanner inputScanner = new Scanner(System.in);
        char operator;
        double number1, number2, result;

        //user to enter an operator
        System.out.print("Choose an operator (+, -, *, or /): ");
        operator = inputScanner.next().charAt(0);

        //user to enter two numbers
        System.out.print("Enter the first number: ");
        number1 = inputScanner.nextDouble();
        System.out.print("Enter the second number: ");
        number2 = inputScanner.nextDouble();

        // Switch Logic
        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println(number1 + " / " + number2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator!");
        }


    }
}



