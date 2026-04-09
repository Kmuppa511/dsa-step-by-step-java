package dsa.foundation.loops;

import java.util.Scanner;

/**
 * Problem  : Print numbers from n to 1 in reverse
 * Approach : for loop with i-- update
 * Concepts : For loop, reverse iteration
 * Author   : Kavitha
 */

public class ReverseNumbers {

    public void printReverseNumbersNTo1(int num) {

        if (num <= 0) {
            System.out.println("Invalid input - n must be greater than 0");
            return;
        }

        System.out.println("=== Reverse Numbers ===");

        for (int i = num; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter the number n: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        ReverseNumbers obj = new ReverseNumbers();
        obj.printReverseNumbersNTo1(number);

    }

}
