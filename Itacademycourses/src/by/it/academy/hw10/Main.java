package by.it.academy.hw10;

import java.util.*;

import static by.it.academy.hw10.Money.max;

public class Main {
    public static void main(String[] args) {
        Set<Integer> iSet1 = new TreeSet<>();
        Collections.addAll(iSet1, 7, 4, 9, 2, 5);
        Collection.printSet("set2", iSet1);
        Set<Integer> iSet2 = new LinkedHashSet<>();
        Collections.addAll(iSet2, 10, 2, 99, 98, 1, 5, 4);
        Collection.printSet("set3", iSet2);
        Set<Integer> iSet3 = Collection.intersect(iSet1, iSet2);
        Collection.printSet("set1 intersect set2", iSet3);
        Collection.printSet("set1 intersect set2 union set3", Collection.union(iSet2, iSet1));


        System.out.println("------------------------------");

        Stack<Integer> money = new Stack<>();
        money.push(12);
        money.push(15);
        money.push(60);
        money.push(25);
        money.push(30);
        System.out.println("What banknotes are in the stack: " + money);
        System.out.println("Removing the top bill: " + money.pop());
        System.out.println("Checking the top bill: " + money.peek());
        System.out.println("Revisiting all banknotes: " + money);
        System.out.println("The largest banknote in the stack: " + max(money));


        System.out.println("---------------------------");

        PetShop animal1 = new Cat("Barsik", 20.48, 3);
        PetShop animal2 = new Cat("Vasja", 40, 1);
        PetShop animal3 = new Dog("Lucky", 110, 1.5);
        PetShop animal4 = new Dog("Tosha", 90, 2);
        PetShop animal5 = new Horse("Tom", 54.8, 0.6);
        PetShop animal6 = new Horse("James", 60, 0.8);

        List<PetShop> petShop = new ArrayList<>();
        petShop.add(animal1);
        petShop.add(animal2);
        petShop.add(animal3);
        petShop.add(animal4);
        petShop.add(animal5);
        petShop.add(animal6);

        System.out.println("Sort by name:");
        Collections.sort(petShop);
        for (PetShop petShop1 : petShop) {
            System.out.println(petShop1);
        }

        Collections.sort(petShop, petShopComparator());
        System.out.println("\nSort by price: " + petShop);

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nChoose a pet name from the following: Barsik, Vasja, Lucky, Tosha, Tom, James");
        String petsName = scanner.next();

        purchase(petsName, petShop);
        System.out.println("The store has: " + petShop + "\n");

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Choose from the following price ranges: \n1. up to 50 rubles\n" +
                "2. from 51 to 80 rubles\n" +
                "3. from 81 rubles");
        int number = scanner1.nextInt();
        sortByPrice(number, petShop);

            }
    public static Comparator<PetShop> petShopComparator () {
        return new Comparator<PetShop>() {
            @Override
            public int compare(PetShop o1, PetShop o2) {
                if (o1.getPrice() == o2.getPrice()) {
                    return 0;
                } else if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        };
    }

    public static void purchase (String name, List < PetShop > petShop){
        Iterator<PetShop> petShopIterator = petShop.iterator();
        while (petShopIterator.hasNext()) {
            PetShop petShop1 = petShopIterator.next();
            if (petShop1.getName().equals(name)) {
                System.out.println(petShop1.getName() + " purchased");
                petShopIterator.remove();
            }
        }
    }

    public static void sortByPrice ( int a, List <PetShop > list){
        switch (a) {
            case (1):
                for (PetShop pet : list) {
                    if (pet.getPrice() <= 50) {
                        System.out.println("At this price: " + pet);
                    }
                }
                break;
            case (2):
                for (PetShop pet : list) {
                    if (pet.getPrice() > 50 && pet.getPrice() <= 80) {
                        System.out.println("At this price: " + pet);
                    }
                }
                break;
            case (3):
                for (PetShop pet : list) {
                    if (pet.getPrice() > 80) {
                        System.out.println("At this price: " + pet);
                    }
                }
                break;


        }
    }
}
