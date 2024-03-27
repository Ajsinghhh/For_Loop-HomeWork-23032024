// Program to check whether input number is prime or not


import java.util.Scanner;

//Class Name
public class Prime_Number_Check {

    //Main Method
    public static void main(String[] args) {

        // Object for scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number ");

        int num = scanner.nextInt();

// conditions to print

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    // check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}







