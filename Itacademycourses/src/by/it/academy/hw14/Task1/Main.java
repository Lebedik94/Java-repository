package by.it.academy.hw14.Task1;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    private static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите интервал времени");
        int sec = scanner.nextInt();

        Thread thread = new Thread(clock(sec));
        thread.setDaemon(true);
        thread.start();

        try {
            Thread.sleep(20000);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Спасибо");
    }

    public static Runnable clock(int sec) {
        return new Runnable() {

            @Override
            public void run() {
                while (true) {
                    System.out.println(LocalDateTime.now().toLocalTime());
                    try {
                        Thread.sleep(sec * 1000);
                    } catch (InterruptedException ex) {
                        System.out.println(LocalDateTime.now());
                    }

                }
            }
        };
    }
}