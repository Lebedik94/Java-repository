package by.it.academy.hw10;

import java.util.Objects;

public class PetShop implements Comparable <PetShop>{

    private String name;
    private double price;
    private double age;

    PetShop(String name, double price, double age){
        this.name = name;
        this.price = price;
        this.age = age;
    }

    public static void add(PetShop animal1) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }


    @Override
    public int compareTo(PetShop animalStore) {
        return name.compareTo(animalStore.name);
    }

    @Override
    public String toString() {
        return "PetShop{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", age=" + age +
                '}';
    }

    public static double getSum (double age, double price) {
        return age + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PetShop petShop = (PetShop) o;
        return Double.compare(petShop.price, price) == 0 && Double.compare(petShop.age, age) == 0 && Objects.equals(name, petShop.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, age);
    }
}
