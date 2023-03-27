package by.it.academy.hw7.Task2;

public class Fahrenheit extends Celsius implements Transformation {
    public Fahrenheit(double celsius) {
        super(celsius);
    }

    @Override
    public double degree() {
        return celsius * 1.8 + 32;
    }
}
