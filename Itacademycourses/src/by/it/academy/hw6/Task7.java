package by.it.academy.hw6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {
    public static void main(String[] args) {

        String regex = "(\\w{6,})@(\\w+\\.)([a-z]{2,3})";
        String text = "адреса электронной почты: myemail@gmail.com,a.petrov@gmail.com.au,coder4575@yandex.ru";


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println("e-mail: " + matcher.group());
        }
    }

}
