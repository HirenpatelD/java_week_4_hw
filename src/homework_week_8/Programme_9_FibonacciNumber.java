package homework_week_8;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

public class Programme_9_FibonacciNumber {

    public static void main(String[] args) {
        int n = 8; // Change this value to print more or fewer Fibonacci numbers

        int first = 1;
        int second = 1;

        System.out.print("Fibonacci Sequence: ");

        for (int i = 0; i < n; i++) {
            if (i < 2) {
                System.out.print(first + " ");
            } else {
                int next = first + second;
                System.out.print(next + " ");
                first = second;
                second = next;
            }
        }
    }
}

