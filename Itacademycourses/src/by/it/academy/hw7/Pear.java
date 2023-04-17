package by.it.academy.hw7;

public class Pear extends Fruits {

    public Pear(int weightGram, double priceGram) {
        super(weightGram, priceGram);
    }

    public double computeCost() {
        return getWeight() * getPrice();
    }
}
