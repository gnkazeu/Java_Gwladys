package Java_Assignment_1;

import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("third number: ");
        int num3 = scanner.nextInt();

        int greatest = num1;

        if (num2 > greatest) {
            greatest = num2;
        }

        if (num3 > greatest) {
            greatest = num3;
        }


        System.out.println("The greatest number is: " + greatest);

        scanner.close();
    }
}