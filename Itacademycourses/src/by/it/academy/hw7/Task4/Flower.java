package by.it.academy.hw7.Task4;

public class Flower {
    private final String name;
    private final String color;
    private final int bestBeforeDay;
    private final double priceForOneFlower;


    public Flower(String name, String color, int bestBeforeDay, double priceForOneFlower) {
        this.name = name;
        this.color = color;
        this.bestBeforeDay = bestBeforeDay;
        this.priceForOneFlower = priceForOneFlower;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getBestBeforeDay() {
        return bestBeforeDay;
    }

    public double getPrice() {
        return priceForOneFlower;
    }
}
