//Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number) – limitation is n.

//Class name
public class Fibonacci_Sequence {

    //Main Method
    public static void main(String[] args) {
        int n = 8; // range value for n
        int a = 1, b = 1;

        // Print the first two terms
        System.out.print(a + " " + b + " ");

        // Calculate and print the next terms
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

    }


}
