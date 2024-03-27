// Finding factorial of a number entered by user


import java.util.Scanner;

//Class Name
public class Factorial_Number {

    //Main Method

    public static void main(String[] args) {

        // Object for the scanner class
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = inputScanner.nextInt();

//for loop
        long factorial = 1;
        for (int i = 1; i <= num; ++i) {
            factorial *= i;
        }

        System.out.printf("Factorial of %d = %d%n", num, factorial);
    }


}



