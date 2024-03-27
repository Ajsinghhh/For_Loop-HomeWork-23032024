/* Write a program to calculate the sum of following series where n is
input by user. (where n is a positive integer and input by user.)
1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n */


import java.util.Scanner;

//class name
public class Sum_Of_Series {

    //main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer (n): ");
        int n = scanner.nextInt();

        double sum = 0.0; // Initialize the sum

        for (double i = 1; i <= n; i++) {
            sum += 1 / i; // Add each term to the sum
        }

        System.out.printf("Sum of the series up to %d terms: %.6f%n", n, sum);
    }


}

