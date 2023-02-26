package by.it.academy.hw4;

public class Task5 {
    public static void main(String[] args) {
        int[] array = {54, 2, 18, 41, 65, 20, 3, 17};

        int minNum = array[0];

        for (int i = 1; i < array.length; i = i+2)  {
            if (array[i] < minNum )
                minNum = array[i];
        }
        System.out.println(minNum);

    }
}
