package dsa.foundation.io;

import java.util.Scanner;

public class InputOutput {
     public void inputOutputReading() {

         //input reading
         Scanner sc = new Scanner(System.in);

         int age = sc.nextInt();
         sc.nextLine(); // consume leftover \n
         String name = sc.nextLine();

         //output printing
         System.out.println("name: " + name + " age:" + age);
     }

    public static void main(String[] args) {
        InputOutput io = new InputOutput();
        io.inputOutputReading();
    }

}
