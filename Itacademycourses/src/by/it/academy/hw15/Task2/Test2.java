package by.it.academy.hw15.Task2;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        CollectionIntService intService = new CollectionIntService(integerList);

        intService.writingValuesToCollection();
        intService.findMinNumber();
        intService.findMaxNumber();
        intService.arithmeticMeanCalc();
        intService.multiAllNumbers();
        intService.sumAllNumbers();
        intService.sumAllDigits();

    }
}
