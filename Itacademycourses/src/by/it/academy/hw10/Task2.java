package by.it.academy.hw10;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        String text = "в темноте поймала кошка саранчу," +
                "в темноте играла кошка с саранчой," +
                "саранчой хрустела кошка на свету," +
                "саранчу пожрала кошка саранчу.";

        String regex = "\\s*[\\s!\\.,-]\\s*";

        String[] words = text.split(regex);

        Map<String, Integer> map = new HashMap<>();

        for (String w : words) {
            map.putIfAbsent(w, 0);
            if (map.containsKey(w)) {
                map.put(w, map.get(w) + 1);
            }
        }

        for (Map.Entry<String, Integer> word : map.entrySet()) {
            System.out.println("Key: " + word.getKey() + ", " + " Value: " + word.getValue());
        }
    }
}
