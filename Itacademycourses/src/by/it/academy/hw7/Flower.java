package by.it.academy.hw7;

public abstract class Flower {
    String color;
    int freshPeriod;

    public Flower(String color, int freshPeriod) {
        this.color = color;
        this.freshPeriod = freshPeriod;
    }
    abstract double priceForFlower();
}





