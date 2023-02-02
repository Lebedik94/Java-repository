package by.it.academy;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

      int x = in.nextInt();

        if (x % 2 == 0) {
            System.out.println("0");
        } else {
            System.out.println( x % 2);
        }
    }
    }

