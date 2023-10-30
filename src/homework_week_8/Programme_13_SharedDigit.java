package homework_week_8;

/**
 * Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 */


public class Programme_13_SharedDigit {

    public static boolean hasShareDigit(int num1, int num2) {

        int digit1 = num1 % 10;
        int digit2 = num2 % 10;
        int count1 = num1 / 10;
        int count2 = num2 / 10;

        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        } else if (num1 == num2) {
            return true;
        } else if (digit1 == digit2) {
            return true;
        } else if (count1 == count2) {
            return true;
        } else if (count1 == digit2) {
            return true;
        } else if (count2 == digit1) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(hasShareDigit(12,23));
        System.out.println(hasShareDigit(9,99));
        System.out.println(hasShareDigit(15,55));
    }

}









