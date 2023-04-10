package by.it.academy.hw15.Task2;

import java.util.Collection;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalLong;

public class CollectionIntService {
    private final Collection<Integer> integerCollection;

    public CollectionIntService(Collection<Integer> integerCollection) {
        this.integerCollection = integerCollection;
    }

    public void writingValuesToCollection(){
        for (int i = 0; i < 10; i++) {
            integerCollection.add(1 + (int) (Math.random() * 30));
        }
        for(int d : integerCollection){
            System.out.println(d);
        }
    }

    public void findMinNumber(){
        System.out.print("Минимальное число: ");
        Optional<Integer> optionalMin = integerCollection.stream()
                .min(Integer::compareTo);
        ((Optional<?>) optionalMin).ifPresent(System.out::println);
    }

    public void findMaxNumber(){
        System.out.print("Максимальное число: ");
        Optional<Integer> optionalMax = integerCollection.stream()
                .max(Integer::compareTo);
        optionalMax.ifPresent(System.out::println);
    }

    public void arithmeticMeanCalc(){
        System.out.print("Среднее арифметическое всех чисел: ");
        OptionalDouble average = integerCollection.stream()
                .mapToInt(Integer::valueOf).average();
        average.ifPresent(System.out::println);
    }

    public void multiAllNumbers(){
        System.out.print("Результат умножения всех чисел: ");
        OptionalLong multi = integerCollection.stream()
                .mapToLong(Integer::valueOf)
                .reduce((x, y) -> x * y);
        multi.ifPresent(System.out::println);
    }

    public void sumAllNumbers(){
        System.out.print("Сумма всех чисел: ");
        int sum = integerCollection.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }

    public void sumAllDigits(){
        System.out.print("Сумма всех цифр: ");
        int sumDigit = integerCollection.stream()
                .mapToInt((d) -> {
                    int sumDig = 0;
                    while (d != 0){
                        sumDig += d % 10;
                        d /= 10;
                    } return sumDig;
                })
                .sum();
        System.out.println(sumDigit);
    }

}
