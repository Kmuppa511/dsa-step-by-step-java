package dsa.foundation.conditionals;


import java.util.Scanner;

/**
 * Problem  : Check if a number is positive, negative or zero
 * Approach : if-else if-else — 3 independent paths
 * Concepts : Conditional statements, input validation
 * Author   : Kavitha
 *
 * Validation Note:
 * No explicit validation needed here because:
 * 1. Scanner automatically rejects non-integer input
 * 2. Java's int type guarantees value is always within
 * Integer.MIN_VALUE to Integer.MAX_VALUE range
 * 3. All valid int values are handled by the if-else if-else logic
 */
public class PositiveNegativeZero {
    public String findNumIsPosNegZero(int number) {

        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }

    }

    public static void main(String[] args) {

        PositiveNegativeZero obj = new PositiveNegativeZero();

        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String result = obj.findNumIsPosNegZero(num);
        System.out.println(result);

    }
}
