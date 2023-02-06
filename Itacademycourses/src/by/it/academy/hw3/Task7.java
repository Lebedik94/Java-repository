package by.it.academy.hw3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter digit");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("Каков результат умножения первого числа на второе?");
        int resultUser = in.nextInt();
        String answer = resultUser == (num1*num2) ? "Result is correct" : "Result is wrong" + "\ncorrect result "  + num1 * num2;
        System.out.println(answer);







    }
}
