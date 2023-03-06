package by.it.academy.hw9;

public class Calculator {

    public static <T extends Number, V extends Number> void  getInfo(T a, V b){

        System.out.println("Sum result: " + (a.doubleValue() + b.doubleValue()));
        System.out.println("Multiply result: " + (a.doubleValue() * b.doubleValue()));
        System.out.println("Divide result: " + (a.doubleValue() / b.doubleValue()));
        System.out.println("Subtraction result: " + (a.doubleValue() - b.doubleValue()));

    }
}
