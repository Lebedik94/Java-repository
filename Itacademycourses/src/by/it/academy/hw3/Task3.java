package by.it.academy.hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number from 1 to 7");
        int number = in.nextInt();

        switch (number) {
            case (1):
                System.out.println("Понедельник");
                break;
            case (2):
                System.out.println("Вторник");
                break;
            case (3):
                System.out.println("Среда");
                break;
            case (4):
                System.out.println("Четверг");
                break;
            case (5):
                System.out.println("Пятница");
                break;
            case (6):
            case (7):
                System.out.println("Выходной");
                break;
            default:
                System.out.println("Error!!!Enter number from 1 to 7");
        }
    }
}

