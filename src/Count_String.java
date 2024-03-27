//WAP to enter any String and count total number of 'a' in that String.

import java.util.Scanner;
//cals name
public class Count_String {

//main method
    public static void main(String[] args) {

        //object for scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int count = 0; // Initialize the count of 'a'

        //for loop
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == 'a' || inputString.charAt(i) == 'A') {
                count++; // Increment count when 'a' or 'A' is found
            }
        }
    }
    }

