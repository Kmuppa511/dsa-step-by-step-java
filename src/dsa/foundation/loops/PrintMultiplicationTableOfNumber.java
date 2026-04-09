package dsa.foundation.loops;

import java.util.Scanner;

/**
 * Problem  : Print Multiplication table of all numbers from 1 to n
 * Approach : for loop + accumulator variable
 * Concepts : For loop, variable scope, long vs int
 * Author   : Kavitha
 *
 * Validation Note:
 * n must be > 0 — multiplication table from 1 to 0 or negative makes no sense
 */
public class PrintMultiplicationTableOfNumber {

    private boolean isValid(int num){
        return num > 0;
    }

    public void printMultiplicationTableOfNumber(int num){

        if(!isValid(num)){
            System.out.println("Invalid - number must be grater than zero");
            return;
        }

        System.out.println("=== Multiplication Table ===");

        for(int i = 1; i <= 10; i++){

            long result = (long) num * i;
            System.out.println(num + " * " + i + " = " + result);

        }

    }

    public static void main(String[] args) {

        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        PrintMultiplicationTableOfNumber obj = new PrintMultiplicationTableOfNumber();
        obj.printMultiplicationTableOfNumber(number);

    }

}
