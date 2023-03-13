package by.it.academy.hw8;
import java.util.Objects;

public class Shop {
    private String product ;
    private String color;


    public Shop(String product, String color) {
        this.product = product;
        this.color = color;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getInfoSize() {
        return null;
    }

    public String getInfoColor() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return Objects.equals(product, shop.product) && Objects.equals(color, shop.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, color);
    }

    public Cloth.Dimensions getDimensions() {
        return null;
    }

    public Integer getDimensionsShoes() {
        return null;
    }
}
