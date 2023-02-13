package by.it.academy.hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num %2 !=0 && num >0){
            System.out.println("Число нечетное положительное");
        }else if (num %2 ==0 && num <0)
            System.out.println("Число четное отрицательное");

    }
}

