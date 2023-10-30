package homework_week_8;

import java.util.Scanner;

public class Programme_10_ArmstrongNumber {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            scanner.close();

            if (isArmstrongNumber(number)) {
                System.out.println(number + " is an Armstrong number.");
            } else {
                System.out.println(number + " is not an Armstrong number.");
            }
        }

        public static boolean isArmstrongNumber(int number) {
            int originalNumber, remainder, result = 0;
            int n = 0;

            originalNumber = number;

            // Find the number of digits
            for (; originalNumber != 0; originalNumber /= 10, ++n);

            originalNumber = number;

            // Check if it is an Armstrong number
            while (originalNumber != 0) {
                remainder = originalNumber % 10;
                result += Math.pow(remainder, n);
                originalNumber /= 10;
            }

            return result == number;
        }
    }

