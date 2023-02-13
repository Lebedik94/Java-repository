package by.it.academy.hw3;

public class Task1 {

    public static void main (String[] args){

        int number1 = 10;
        Integer number2 =number1;

        System.out.println(number2);

        unboxingnumber (number1,number2);

    }

    public static void unboxingnumber (int number1, Integer number2) {
        number1 = number2;

        System.out.println(number1);
    }

}
