package by.it.academy.hw2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of seconds" );
        int number = in.nextInt();
        int weeks = number / (3600 * 24 * 7);
        int days = number / (3600 * 24) % 7;
        int hours = (number - weeks * 3600 * 24 * 7 - days * 3600 * 24 ) / 3600;
        int minute = (number - weeks * 3600 * 24 * 7 - days * 3600 * 24 - days * 3600 ) / 60;
        int seconds = number % 60;
        System.out.println("Weeks = " + weeks +"\nDays = " + days +"\nHours = " + hours +"\nMinutes = " + minute +"\nSeconds = " + seconds);
    }
}

