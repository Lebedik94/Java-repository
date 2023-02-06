package by.it.academy.hw3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 number");
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int number3 = in.nextInt();
        if (number1 < (number2 + number3) && number2 < (number1 + number3) && number3 < (number1 + number2)) {
            System.out.println("Треугольник может существовать");
        } else {
            System.out.println("Такой треугольник не существует");
        }

    }
}
