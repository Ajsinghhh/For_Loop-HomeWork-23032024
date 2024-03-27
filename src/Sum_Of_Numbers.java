// write a program that prints the sum of x ranging from 1 to 20.

//Class Name
public class Sum_Of_Numbers {

    // Main Method
    public static void main(String[] args) {
// set the limit
        int n = 20;

        int sum = 0;

        //for loop
        for (int x = 1; x <= n; x++) {
            sum += x;
        }

        System.out.println("Sum of numbers from 1 to " + n + " = " + sum);
    }

}



