//write a program that prints the sum of x ranging from 1 to 20.

//Class name
public class Divisible_Numbers {

    //Main method
    public static void main(String[] args) {


        // condition , for loop
        System.out.println("Numbers divided by 3:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }

        System.out.println("\n\nNumbers divided by 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }

        System.out.println("\n\nNumbers divided by both 3 and 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }

            }

}

