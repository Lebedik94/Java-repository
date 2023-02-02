package by.it.academy;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of seconds" );
        int x = in.nextInt();
        int m = x / 60;
        int h = m / 60;
        int d = h / 24;
        int w = d / 7;

        System.out.println("Seconds = " + x +"\nMinutes = " + m +"\nHours = " + h +"\nDays = " + d +"\nWeeks = " + w);
    }
}
