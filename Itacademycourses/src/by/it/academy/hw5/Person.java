package by.it.academy.hw5;

public class Person {

    String fullName;
    int age;

    Person() {
    }

    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    void move() {
        System.out.println(fullName + " говорит");
    }

    void talk() {
        System.out.println(fullName + " двигается");
    }

}
