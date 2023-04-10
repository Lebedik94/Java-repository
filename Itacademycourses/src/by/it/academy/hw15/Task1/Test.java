package by.it.academy.hw15.Task1;
import by.it.academy.hw15.Task1.CollectionService;

import java.util.Arrays;
import java.util.List;
public class Test {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Добро пожаловать", ", ", ", ", "пользователь ", "это ", "твой ", "логин",
                ", ", " рады", "что вы ", "выбрали нас");
        CollectionService service = new CollectionService(stringList);

        service.searchWordLogin();
        service.findLongestString();
        service.findShortestString();
        service.wordStringSearch();
        service.searchWordsInString();

    }
}
