package by.it.academy.hw7;

public abstract class  Fruits {
    int weightGram;
    double priceGram;

    public Fruits(int weight, double price) {
        this.weightGram = weight;
        this.priceGram = price;
    }

    public void printManufacturerInfo() {
        System.out.println("Made in Belarus");
    }

    public double getPrice(){
        return priceGram;
    }

    public int getWeight() {
        return weightGram;
    }
}
