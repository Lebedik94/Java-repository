package by.it.academy.hw9;

public class Main {
    public static void main(String[] args) {

        Calculator.getInfo(100, 40.25);

        System.out.println("==================================================");


        Pair<Integer, String> obj1 = new Pair<>(23, "Hi");

        System.out.println(obj1.getFirst());
        System.out.println(obj1.getSecond());
        System.out.println(obj1.changeSeats(new Pair<>(" Я перестал понимать темы после дженериков", 26082023)).toString());
        obj1.setFirst(26082023);
        obj1.setSecond(" Я перестал понимать темы после дженериков");

        System.out.println(obj1.toString());
    }


}

