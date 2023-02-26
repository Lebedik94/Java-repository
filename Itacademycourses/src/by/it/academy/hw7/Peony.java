package by.it.academy.hw7;

public class Peony extends Flower{

    int quantity;
    double price;

    public Peony (String color,int freshPeriod,int quantity,double price) {
        super(color,freshPeriod);
        this.quantity =quantity;
        this.price =price;
    }

    double priceForFlower() {
        return quantity * price;
    }
}
