package by.it.academy.hw5;

public class Phone {


    String number;

    String model;

    double weight;


    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;

    }


    public Phone(String number, String model) {
        this.number = number;
        this.model = model;

    }

    public Phone() {

    }

    void receiveCall(String name) {
        System.out.println("Calling " + name);
    }

    void receiveCall(String name, String number) {

        System.out.println(name + " " + number);
    }

    void sendMessage(String message, String... numbers) {

        for (String number : numbers) {
            System.out.println(message + number);
        }
    }

    String getNumber() {
        return number;
    }
}
