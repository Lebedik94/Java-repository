package by.it.academy.hw4;

public class Task5 {
    public static void main(String[] args) {
        int[] array = {54, 57, 18, 41, 65, 20, 3};

        int minNum = array[0];

        for (int i = 0; i < array.length; i++)  {
            if (array[i] < minNum && i %2 != 0)
                minNum = array[i];
        }
        System.out.println(minNum);

    }
}
