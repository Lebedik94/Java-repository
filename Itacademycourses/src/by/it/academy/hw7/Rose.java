package by.it.academy.hw7;

public class Rose extends Flower {

    int quantity;
    double price;

    public Rose (String color,int freshPeriod,int quantity,double price) {
        super(color,freshPeriod);
        this.quantity =quantity;
        this.price =price;
    }

    double priceForFlower() {
        return quantity * price;
    }
}





