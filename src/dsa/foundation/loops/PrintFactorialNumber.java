package dsa.foundation.loops;

import java.util.Scanner;

/**
 * Problem  : Find factorial of n
 * Approach : for loop with result accumulator
 * Concepts : For loop, long overflow, factorial math
 * Author   : Kavitha
 *
 * Validation Note:
 * n must be >= 0 (0! = 1 is valid)
 * n must be <= 20 (21! overflows long)
 */

public class PrintFactorialNumber {

    private boolean isValid(int num){
        return num >= 0 && num <= 20;
    }

    public void printFactorialOfGivenNumber(int num){
        if(!isValid(num)){
            System.out.println("Invalid - number must be greater than 0 and 20");
            return;
        }
        System.out.println("=== Factorial Number ===");
        long forwardResult = 1;

        for(int i = 1; i <= num; i++){
            forwardResult *= i;
        }
        System.out.println("Forward: " + num + "! =  " + forwardResult);

        System.out.println("=========================");

        long backwardResult = 1;

        for(int i = num; i >= 1; i--){
            backwardResult *= i;
        }
        System.out.println("Reverse: " + num + "! =  " + backwardResult);
    }

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        PrintFactorialNumber obj = new PrintFactorialNumber();
        obj.printFactorialOfGivenNumber(number);
    }
}
