package dsa.foundation.loops;

import java.util.Scanner;

/**
 * Problem  : Find sum of all numbers from 1 to n
 * Approach : for loop + accumulator variable
 * Concepts : For loop, variable scope, long vs int
 * Author   : Kavitha
 *
 * Validation Note:
 * n must be > 0 — sum from 1 to 0 or negative makes no sense
 */
public class SumOfOneToN {
    public void printSumOfOneToNumberUsingLoop(int num){


        if(num <= 0){
            System.out.println("Invalid - number must be 1 or more than One");
            return;
        }

        long sum = 0;  // ✅ inside METHOD, outside LOOP

        for(int i = 1; i <= num; i++){
             sum += i; // updates sum each iteration
        }
        System.out.println(sum); // prints final sum after loop
    }

    public void printSumOfOneToNumberUsingFormula(int num){
        if(num <= 0){
            System.out.println("Invalid - number must be 1 or grater than 1");
        }

        long sum = (long) num * (num + 1) / 2; // one line no loop

        System.out.println(sum);
    }


    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        SumOfOneToN obj = new SumOfOneToN();

        System.out.println("=== Loop Approach ===");
        obj.printSumOfOneToNumberUsingLoop(number);

        System.out.println("=== Formula Approach ===");
        obj.printSumOfOneToNumberUsingFormula(number);
    }

}
