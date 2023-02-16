package by.it.academy.hw5;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.fullName = "Vitalik";
        person1.age = 28;

        Person person2 = new Person("Violetta", 26);

        person1.move();
        person1.talk();
        person2.move();
        person2.talk();
        System.out.println();

        Phone myPhone1 = new Phone();
        myPhone1.number = "+375445521232";
        myPhone1.model = "Apple";
        myPhone1.weight = 10.3;


        Phone myPhone2 = new Phone("+375444561236", "Xiaomi");


        Phone myPhone3 = new Phone("+375448965214", "Xiaomi", 12.5);


        Phone phoneBook = new Phone();

        myPhone1.receiveCall("Vitalik");
        myPhone2.receiveCall("Violetta");
        myPhone3.receiveCall("Daniil");
        System.out.println();// чтобы был пробельчик

        System.out.println(myPhone1.getNumber());
        System.out.println(myPhone2.getNumber());
        System.out.println(myPhone3.getNumber());
        System.out.println();// чтобы был пробельчик

        myPhone1.receiveCall("Vitalik", myPhone1.number);
        myPhone2.receiveCall("Violetta", myPhone2.number);
        myPhone3.receiveCall("Daniil", myPhone3.number);
        System.out.println();// чтобы был пробельчик

        phoneBook.sendMessage("Call back later ", "+375294567345", "+375298764523", "+375335674323", "375253456732", "+375335672345");

    }
}
