package by.it.academy.hw4;

public class Task4 {
    public static void main(String[] args) {
       int [] array = {43, 28, 74, 15, 3, 89, 2, 67};
        int numMax = array[0];
        int numMin = array[0];
        int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] > numMax) {
                numMax = array[i];
                indexOfMax = i;
            }
            if (array[i] < numMin) {
                numMin = array[i];
                indexOfMin = i;
            }

        }
        System.out.println("Minimum number index: " + indexOfMin);
        System.out.println("Max number index: " + indexOfMax);
    }


}