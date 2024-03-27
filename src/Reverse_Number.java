// Reverse a number using for Loop

import java.util.Scanner;

public class Reverse_Number {


    public static void main(String[] args) {

        //Object for the scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a double digit number : ");
        int num = scanner.nextInt();


        int reversed = reverseNumber(num);
        System.out.println("Reversed number: " + reversed);
    }

    // Function to reverse a number
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}
