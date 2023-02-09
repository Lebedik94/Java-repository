package by.it.academy.hw2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of seconds" );
        int x = in.nextInt();
        int m = 60;
        int h = 3600;
        int d = 86400;
        int w = 604800;

        int weeks = x/w;
        int days = x/d-weeks*7;
        int hours = x/h-days*24-weeks*7*24;
        int minutes = x/m-hours*60-days*24*60-weeks*7*24*60;
        int seconds = x-minutes*60-hours*60*60-days*24*60*60-weeks*7*24*60*60;



        System.out.println("Weeks: " + weeks +"\nDays: " + days +"\nHours: " + hours +"\nMinutes: " + minutes +"\nSeconds: " + seconds);
    }
}

