package by.it.academy.hw6;

public class Task1 {
    public static void main(String[] args) {
        String text = "  Я   начал   учить  джава      ";
        text = text.replaceAll("\\s+", " ");
        text = text.trim();

        System.out.println(text);

    }


}
