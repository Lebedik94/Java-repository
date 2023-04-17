package by.it.academy.hw7.Task4;

public class Main {
    public static void main(String[] args) { //task-1
        Flower tulip = new Flower("Tulip", "White", 5, 3);
        Flower rose = new Flower("Rose", "red", 7, 5);
        Flower violet = new Flower("Violet", "violet", 4, 8);
        Bouquet bouquet = new Bouquet();
        bouquet.addFlowersInBouquet(tulip);
        bouquet.addFlowersInBouquet(rose);
        bouquet.addFlowersInBouquet(violet);
        System.out.println("Весь букет: ");
        bouquet.printNameOfFlowers();
        System.out.println("\nЦвета в букете: ");
        bouquet.printColorOfFlowers();
        System.out.println("\nЦена букета");
        bouquet.printPriceOfBouquet();
        System.out.println("\nБукет сохранит свою свежеть");
        bouquet.printBestBeforeDay();




    }
}
