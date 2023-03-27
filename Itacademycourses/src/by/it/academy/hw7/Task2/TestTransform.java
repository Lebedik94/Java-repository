package by.it.academy.hw7.Task2;

public class TestTransform {
    public static void main(String[] args) {
        Kelvin kelvinsTransform = new Kelvin(25);
        System.out.println(kelvinsTransform.celsius + " Celsius to Kelvins: " + kelvinsTransform.degree());
        Fahrenheit fahrenheitsTransform = new Fahrenheit(12);
        System.out.println(fahrenheitsTransform.celsius + " Celsius to Fahrenheits " + fahrenheitsTransform.degree());
    }
}
