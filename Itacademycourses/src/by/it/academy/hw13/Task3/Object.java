package by.it.academy.hw13.Task3;

public class Object {
    private int value = 1;

    public synchronized void increment() {
        System.out.println(Thread.currentThread().getName() + " ");
        for (int i = 0; i < 100; i++) {
            System.out.println(value);
        }
        value++;
        System.out.println();
    }
}
