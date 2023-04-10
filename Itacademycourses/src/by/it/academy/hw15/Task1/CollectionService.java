package by.it.academy.hw15.Task1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionService {
    private final Collection<String> stringCollection;

    public CollectionService(Collection<String> stringCollection) {
        this.stringCollection = stringCollection;
    }

    public void searchWordLogin() {
        boolean isLogin = stringCollection.stream()
                .anyMatch(x -> x.startsWith("Логин"));
        System.out.println("Логин должен содержать строки: " + isLogin);
    }

    public void findLongestString() {
        Optional<String> optionalMax = stringCollection.stream()
                .max(Comparator.comparingInt(String::length));
        System.out.print("Самая длинная линия: ");
        optionalMax.ifPresent(System.out::println);
    }

    public void findShortestString() {
        Optional<String> optionalMin = stringCollection.stream().min(Comparator.comparingInt(String::length));
        System.out.print("Самая короткая линия: ");
        optionalMin.ifPresent(System.out::println);
    }

    public void wordStringSearch() {
        System.out.println("Строчные слова: ");
        stringCollection.stream()
                .filter((s) -> s.matches("[А-Яа-яA-Za-z]+"))
                .forEach(System.out::println);
    }

    public void searchWordsInString() {
        System.out.println("Все слова в строчку: ");
        stringCollection.stream()
                .map(s -> s.split("\\s*[\\s!,\\.-]\\s*"))
                .flatMap(Arrays::stream).distinct()
                .collect(Collectors.toList()).forEach(System.out::println);
    }

}
