package by.it.academy.hw7.Task3;

public class Main {
    public static void main(String[] args) {
        Fruit apple = new Fruit("Apple",3500, 0.15);
        System.out.print("Apple ");
        apple.printManufactureInfo();
        Fruit apricot = new Fruit("Apricot",4350, 0.44);
        System.out.print("Apricot ");
        apricot.printManufactureInfo();
        Fruit pear = new Fruit("Pear",2700, 0.5);
        System.out.print("Pear ");
        apricot.printManufactureInfo();
        Basket basket = new Basket();
        basket.addFruitsInBasket(apple);
        basket.addFruitsInBasket(apricot);
        basket.addFruitsInBasket(pear);
        System.out.println("\nКорзина фруктов: ");
        basket.calculatingTheCostOfFruits();
    }
}
