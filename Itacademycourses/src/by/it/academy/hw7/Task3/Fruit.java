package by.it.academy.hw7.Task3;

import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

public class Fruit implements Printable {
    private final String name;
    private final double weightInGram;
    private final double priceForGram;

    public Fruit(String name, double weightInGram, double priceForGram) {
        this.name = name;
        this.weightInGram = weightInGram;
        this.priceForGram = priceForGram;
    }

    public void printManufactureInfo() {
        System.out.println("Made in Belarus");
    }

    public double getCost() {
        return weightInGram * priceForGram;
    }

    public String getNameOfFruit() {
        return name;
    }

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        return 0;
    }
}
