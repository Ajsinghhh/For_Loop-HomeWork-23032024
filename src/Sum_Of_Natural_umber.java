//Display Sum of n Natural Number


import java.util.Scanner;

//Class name
public class Sum_Of_Natural_umber {

    //MAin Method
    public static void main(String[] args) {

        //Object for scanner class
        Scanner scanner = new Scanner(System.in);
//user input
        System.out.print("Enter a positive integer (n): ");
        int n = scanner.nextInt();

//for loop
        int sum = 0;
        for (int i = 1; i <= n; ++i) {
            sum += i;
        }

        System.out.println("Sum of natural numbers from 1 to " + n + " = " + sum);
    }

}
