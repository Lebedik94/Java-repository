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
        Pattern p = Pattern.compile("(?i)Object-oriented programming");
        String[] arrayStr = text.split("Object-oriented programming");
        for(int i = 1; i < arrayStr.length; i++) {
            arrayStr[i] = "Object-oriented programming" + arrayStr[i];
        }
        for (int i = 1; i < arrayStr.length; i++) {
            if (i % 2 == 0) {
                arrayStr[i] = arrayStr[i].replaceAll(p.pattern(), "OOP");
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String s : arrayStr) {
            sb.append(s);
        }
        String newText = sb.toString();
        return newText;
    }
    }


