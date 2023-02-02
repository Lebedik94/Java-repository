package by.it.academy;

import java.util.Scanner;

public class Task2 {

        public static void main (String[] args){
            Scanner in = new Scanner(System.in);

            System.out.println("Enter num 1");
            int num1 = in.nextInt();

            System.out.println("Enter num 2");
            int num2 = in.nextInt();

            int total = sumMultiplication(num1, num2);
            System.out.println("total = " + total);

        }
        public static int sumMultiplication(int num1, int num2) {
            return num1 + num2 + (num1 * num2);

        }

    }