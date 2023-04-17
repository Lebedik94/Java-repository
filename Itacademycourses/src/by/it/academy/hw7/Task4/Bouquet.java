package by.it.academy.hw7.Task4;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    final List<Flower> flowers;
    public Bouquet(){
        flowers = new ArrayList<>();
    }
    public void addFlowersInBouquet(Flower flower){
        flowers.add(flower);
    }
    public void printNameOfFlowers(){
        for (Flower flower : flowers){
            System.out.println(flower.getName() + " ");
        }
    }
    public void printColorOfFlowers(){
        for (Flower flower : flowers){
            System.out.println(flower.getColor() + " ");
        }
    }
    public void printPriceOfBouquet(){
        int priceOfAllFlowers = 0;
        for (Flower flower : flowers){
            priceOfAllFlowers += flower.getPrice();
        }
        System.out.println(priceOfAllFlowers);
    }
    public void printBestBeforeDay(){
        int bestBeforeDay = 0;
        for (Flower flower : flowers){
            if (flower.getBestBeforeDay() > bestBeforeDay)
                bestBeforeDay = flower.getBestBeforeDay();
        }
        System.out.println(bestBeforeDay);
    }
}