package by.it.academy.hw4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int num = in.nextInt();
        int sum = 0;
        int mul = 1;
        while (num != 0) {
            sum += (num % 10);
            mul *= (num % 10);
            num /= 10;
        }
        System.out.println(sum + " ");
        System.out.println(mul + "  ");
    }
}

