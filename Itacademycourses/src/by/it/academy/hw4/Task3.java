package by.it.academy.hw4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int number = in.nextInt();
        int result = 1;

        for (int i = 1; i <= number; i++ ) {
            result = result * i;

        }
        System.out.println(number  +  "!= " + result);
    }

}
