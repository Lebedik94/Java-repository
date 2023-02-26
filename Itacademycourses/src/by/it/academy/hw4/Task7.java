package by.it.academy.hw4;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int [] arrayNumbers = {9, 23, 13, 15, 11, 46, 38, 88, 79, 46};

        System.out.println(Arrays.toString(arrayNumbers));

        for (int i = 0; i < arrayNumbers.length / 2; i++) {

            int num = arrayNumbers[i];
            arrayNumbers[i] = arrayNumbers[arrayNumbers.length - i - 1];
            arrayNumbers[arrayNumbers.length - i - 1] = num;
        }

        System.out.println(Arrays.toString(arrayNumbers));
    }
    }

