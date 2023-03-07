package by.it.academy.hw6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String text = "У Пети 55555 яблок, у Васи 4444444444, а у Насти 7777777777777";
        Pattern pattern = Pattern.compile("(.)\\1+");
        Matcher matcher = pattern.matcher(text);

        String max = null;
        int num = 0;
        while (matcher.find()) {
            int start=matcher.start();
            int end=matcher.end();
            int numLength = text.substring(start, end).length();

            if (numLength > num) {
                num = numLength;
                max = text.substring(start, end);
            }
        }
        System.out.println("Наибольшее количество идущих подряд цифр : " + max);

    }
}
