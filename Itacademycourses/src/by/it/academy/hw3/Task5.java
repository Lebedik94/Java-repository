package by.it.academy.hw3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter minute from 0 to 59");
        int minute = in.nextInt();
        if (minute <= 14) {
            System.out.println("Первая четверть");
        } else if (minute <= 29) {
            System.out.println("Вторая четверть");
        } else if (minute <= 44) {
            System.out.println("Третья четверть");
        } else if (minute <= 59) {
            System.out.println("Четвертая четверть");
        }else {
            System.out.println("Число не в диапазоне");

        }


    }
}
