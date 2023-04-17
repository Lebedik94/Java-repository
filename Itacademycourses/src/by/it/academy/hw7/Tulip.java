package by.it.academy.hw7;

public class Tulip extends Flower{

    int quantity;
    double price;

    public Tulip (String color,int freshPeriod,int quantity,double price) {
        super(color,freshPeriod);
        this.quantity =quantity;
        this.price =price;
    }

    double priceForFlower() {
        return quantity * price;
    }
}
