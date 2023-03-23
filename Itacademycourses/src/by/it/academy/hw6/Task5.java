package by.it.academy.hw6;

import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        String text = ("Object-oriented programming is a programming language" +
                " Object-oriented programming blabla. Object-oriented programming bla." +
                "Object-oriented programming is a programming language" +
                " Object-oriented programming blabla. Object-oriented programming bla.");
        System.out.println(text);
        System.out.println(resultTwoString(text));
    }
    static String resultTwoString(String text) {
        String regex = "Object-oriented programming";
        Pattern pattern = Pattern.compile(regex);
        String[] arrayString = text.split(regex);
        for (int i = 1; i < arrayString.length; i++) {
            arrayString[i] = regex + arrayString[i];
        }
        for (int i = 0; i < arrayString.length; i = i + 2) {
            arrayString[i] = arrayString[i].replaceAll(pattern.pattern(), "OOP");
            {
            }
        }
        StringBuilder textBuilder = new StringBuilder();
        for (String string : arrayString) {
            textBuilder.append(string);
        }
        return textBuilder.toString();
    }
    }


