package dsa.foundation.loops;

import java.util.Scanner;

/**
 * Problem  : Print all numbers from 1 to n
 * Approach : for loop — we know exact iterations
 * Concepts : For loop, validation
 * Author   : Kavitha
 *
 * Validation Note:
 * n must be > 0 — printing 1 to 0 or negative makes no sense
 */

public class PrintOneToN {


    public void printing1toNIntegerNumbers(int num) {
        // ✅ return — loop is flat, no nesting
        if (num <= 0) {
            System.out.println("Invalid");
            return;   // exit immediately

        }
        for (int i = 1; i <= num; i++) {     // flat, no nesting
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        PrintOneToN obj = new PrintOneToN();
        obj.printing1toNIntegerNumbers(number);

    }

}