package by.it.academy.hw7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Vitali", "Lebedik", 3, "Group 31403116", 5.0);
        Student student2 = new Student("Violetta", "Lebedik", 3, "Group 31403116", 5.0);
        Student student3 = new Student("Daniil", "Kuncewith", 1, "Group 2587463", 3.4);
        Student student4 = new Student("Victor", "Kuncewith", 4, "Group 12345698", 4.0);
        Aspirant aspirant1 = new Aspirant("Aleksey", "Skripko", 2, "Group 31402114", 3.5, true);
        Aspirant aspirant2 = new Aspirant("Dima", "Seledkin", 5, "Group 4561236", 5.0, true);
        Aspirant aspirant3 = new Aspirant("Artyom", "Ivanech", 5, "Group 54612698", 4.8, false);
        Aspirant aspirant4 = new Aspirant("Andrey", "Romaschko", 4, "Group 54636988", 5.0, true);

        System.out.println(student1.getInfo() + student1.getStipend());
        System.out.println(aspirant1.getInfo() + aspirant1.getStipend());
        System.out.println("==========================================================");// пробельчик
        String[] students = {student1.getInfo() + student1.getStipend() + "\n" + student2.getInfo() + student2.getStipend() + "\n" + student3.getInfo() + student3.getStipend() + "\n" + student4.getInfo() + student4.getStipend()};
        System.out.println(Arrays.toString(students));
        System.out.println("============================================================");
        String[] aspirants = {aspirant1.getInfo() + aspirant1.getStipend() + "\n" + aspirant2.getInfo() + aspirant2.getStipend() + "\n" + aspirant3.getInfo() + aspirant3.getStipend() + "\n" + aspirant4.getInfo() + aspirant4.getStipend()};
        System.out.println(Arrays.toString(aspirants));


        System.out.println("========================================================");// пробельчик

        Conversion celsius = new Conversion(20); // вторая задача
        System.out.println("Цельсии : " + celsius.celsius + "\nКельвины : " + celsius.conversionToKelvins() + "\nФаренгейты : " + celsius.conversionToFahrenheits());


        System.out.println("===========================================================");// пробельчик

        Apple apple = new Apple(2500, 0.02);
        Pear pear = new Pear(7800, 0.035);
        Apricot apricot = new Apricot(2500, 0.060);
        System.out.println("Цена Яблок : " + apple.computeCost() + " BLR");
        apple.printManufacturerInfo();
        System.out.println("Цена Груш : " + pear.computeCost() + " BLR");
        pear.printManufacturerInfo();
        System.out.println("Цена Абрикосов : " + apricot.computeCost() + " BLR");
        apricot.printManufacturerInfo();
        System.out.println("Общая стоимость фруктов : " + (apple.computeCost() + pear.computeCost() + apricot.computeCost()) + " BLR");
        System.out.println("====================================================================");

        Rose rose = new Rose("Red", 5, 8, 10);
        Tulip tulip = new Tulip("Yellow", 4, 10, 5);
        Peony peony = new Peony("Purple", 5, 12, 15);


        Flower[] bouquet = new Flower[]{rose, tulip, peony};

        double bouquetCost = 0;
        int bouquetFresh = 0;
        System.out.print("Цвет букета : ");
        for (Flower flower : bouquet) {
            bouquetCost = bouquetCost + flower.priceForFlower();
            System.out.print(" " + flower.color);

            if (bouquetFresh < flower.freshPeriod) {
                bouquetFresh = flower.freshPeriod;
            }
        }

        System.out.println("\nСтоимость букета : " + bouquetCost + " BLR");
        System.out.println("Букет останется свежим : " + bouquetFresh + " дней");


    }

}
