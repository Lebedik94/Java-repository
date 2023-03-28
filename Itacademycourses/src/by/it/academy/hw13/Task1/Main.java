package by.it.academy.hw13.Task1;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        try {
            Thread thread = new Thread(new SomeThread());
            Thread thread2 = new Thread(new ShowThread());
            System.out.println(thread.getState() + " new");
            thread.start();
            thread2.start();
            sleep(500);
            System.out.println(thread.getState() + " timed_waiting");
            Object object = ShowThread.getObject();
            synchronized (object) {
                object.notify();
            }
            System.out.println(thread2.getState() + " blocked");
            sleep(2000);
            System.out.println(thread.getState() + " terminated thread 2");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
