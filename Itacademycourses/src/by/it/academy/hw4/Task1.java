package by.it.academy.hw4;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("    1  2  3  4  5  6  7  8  9  10");
        int num1 = 1;
        while (num1 <= 10) {
            System.out.print(num1 + " | ");
            int num2 = 2;
            while (num2 <= 10) {
                int mul = num1 * num2;
                if (mul <= 10)
                    System.out.print(mul + "  ");
                else
                    System.out.print(mul + " ");
                num2++;
            }
            System.out.println();
            num1++;
        }
    }
}