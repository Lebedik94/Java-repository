package by.it.academy.hw15.Task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {

        List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");
        collectionProcessing(myList);

    }

    public static void collectionProcessing(List<String> myList){
        long a = myList.stream()
                .filter((d) -> d.matches("[a-z][^3]"))
                .sorted(Comparator.comparingInt(d -> d.charAt(1)))
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .limit(myList.size() - 4)
                .map(String::toUpperCase)
                .peek(System.out::println)
                .count();
        System.out.println("Количество оставшихся элементов: " + a);
    }
}
