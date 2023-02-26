package by.it.academy.hw4;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] array = {5, -2, 4, 10, -22, 35, -14, 45};
        int numPositive = 0;
        int numNegative = 0;

        for (int num : array) {
            if (num > 0) {
                numPositive++;
            } else {
                numNegative++;
            }
        }

        int[] arrayPositive = new int[numPositive];
        int[] arrayNegative = new int[numNegative];
        int positive = 0;
        int negative = 0;

        for (int i = 0; i < array.length; i++){

            if (array[i] > 0){
                arrayPositive[positive] = array[i];
                positive++;
            } else {
                arrayNegative[negative] = array[i];
                negative++;
            }
        }
        System.out.println(Arrays.toString(arrayPositive));
        System.out.println(Arrays.toString(arrayNegative));
    }

}
