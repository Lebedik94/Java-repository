package by.it.academy.hw13.Task3;

public class Main {
    public static void main(String[] args) {
        Object object = new Object();
        Thread thread1 = new Thread(object::increment);
        Thread thread2 = new Thread(object::increment);
        Thread thread3 = new Thread(object::increment);
        try {
            thread1.start();
            thread2.start();
            thread3.start();
        } catch (Exception ex) {
            System.out.println("Ошибка");
        }
    }
}