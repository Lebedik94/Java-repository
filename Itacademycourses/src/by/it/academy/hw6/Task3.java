package by.it.academy.hw6;

public class Task3 {
    public static void main(String[] args) {

        String text = "Я попытался объяснить, что не рисовал никогда в жизни.";

        String regex = "\\s*[\\s!\\.,-]\\s*";

        String[] strings = text.split(regex);

        int lengthMax = 0;
        int lengthMin = strings[0].length();

        int indexMax = 0;
        int indexMin = 0;

        for (int i = 0; i < strings.length; i++) {

            if (lengthMax < strings[i].length()) {
                lengthMax = strings[i].length();
                indexMax = i;

            }
            if (lengthMin >= strings[i].length()) {
                lengthMin = strings[i].length();
                indexMin = i;
            }

        }

        wordSubstitution (text, indexMax, indexMin);
    }
    static void wordSubstitution (String text, int indexMax, int indexMin) {
        String[] strings2 = text.split("\\s*[\\s\\.]\\s*");

        String s = strings2[indexMax];
        strings2[indexMax] = strings2[indexMin];
        strings2[indexMin] = s;

        StringBuilder stringBuilder = new StringBuilder();

        for (String word : strings2) {
            stringBuilder.append(word).append(" ");
        }

        System.out.println(stringBuilder.insert(stringBuilder.lastIndexOf(" "), "."));

    }
}
