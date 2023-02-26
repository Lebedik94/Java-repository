package by.it.academy.hw7;

public class Conversion {
    double celsius;

    public Conversion(double celsius) {
        this.celsius = celsius;
    }

    double conversionToFahrenheits() {
        return celsius * 1.8 + 32;
    }

    double conversionToKelvins() {
        return celsius + 275.15;
    }
}
