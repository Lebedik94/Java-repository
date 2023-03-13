package by.it.academy.hw8;

public class Cloth extends Shop {
    public enum Dimensions{
        XS, S, M, L, XL ;
    }

    private String manufacturer;
    private double price;
    Dimensions dimensions;


    public Cloth(String product, String manufacturer, String color, double price, Dimensions dimensions) {
        super(product, color);
        this.manufacturer = manufacturer;
        this.price = price;
        this.dimensions = dimensions;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getInfoSize() {
        return getProduct() + " " + getManufacturer() +  " " + getColor() +  " price: " + getPrice();
    }

    public String getInfoColor() {
        return getProduct() + " " + getManufacturer() + " price: " + getPrice() + " " + dimensions;
    }
}
