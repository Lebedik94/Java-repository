package by.it.academy.hw3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        if (num1 < num2 && num2 < num3) {
            System.out.printf("num1 = %d \nnum2 = %d \nnum3 = %d", num1, num2, num3);
        } else if (num1 < num3 && num3 < num2) {
            System.out.printf("num1 = %d \nnum3 = %d \nnum2 = %d", num1, num3, num2);
        } else if (num2 < num1 && num1 < num3) {
            System.out.printf("num2 = %d \nnum1 = %d \nnum3 = %d", num2, num1, num3);
        } else if (num2 < num3 && num3 < num1) {
            System.out.printf("num2 = %d \nnum3 = %d \nnum1 = %d", num2, num3, num1);
        } else if (num3 < num2 && num2 < num1) {
            System.out.printf("num3 = %d \nnum2 = %d \nnum1 = %d", num3, num2, num1);
        } else {
            System.out.printf("num3 = %d \nnum1 = %d \nnum2 = %d", num3, num1, num2);
        }
    }
}

