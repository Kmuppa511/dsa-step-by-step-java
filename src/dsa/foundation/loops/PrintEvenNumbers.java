package dsa.foundation.loops;

import java.util.Scanner;

/**
 * Problem  : Print even numbers from 1 to n
 * Approach : for loop + accumulator variable
 * Concepts : For loop, variable scope, validation()
 * Author   : Kavitha
 *
 * Validation Note:
 * n must be > 0 — printing even number from 1 to 0 or negative makes no sense
 */
public class PrintEvenNumbers {

    private boolean isValid(int num){
        return num > 0;
    }

    public void printEvenNumbersOneToNum(int num){
        if(!isValid(num)){
            System.out.println("Invalid - number must be greater than 0");
            return;
        }

        if(num < 2){
            System.out.println("No even numbers from 1 to " + num);
            return;
        }

        System.out.println("=== Even Numbers ===");

        for (int i = 2; i <= num; i += 2){
            System.out.println(i);
        }

    }

    private void printEvenNumbersUsingModule(int num){

        if(!isValid(num)) {
            System.out.println("Invalid - number must be greater than 0");
            return;
        }

        if(num < 2){
            System.out.println("No even numbers from 1 to " + num);
            return;
        }

        System.out.println("=== Even Number ===");

        for(int i = 1; i <= num; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {

        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        PrintEvenNumbers obj = new PrintEvenNumbers();
        obj.printEvenNumbersOneToNum(number);
        obj.printEvenNumbersUsingModule(number);
    }

}
