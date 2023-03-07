package by.it.academy.hw6;

public class Task3 {
    public static void main(String[] args) {

        String text = "Я попытался объяснить, что не рисовал никогда в жизни.";

        String[] wordArray = text.split("\\s*[\\s+\\.,]\\s*");

        int indexMax = 0;
        int indexMin = 0;
        int lengthMax = 0;
        int lengthMin = wordArray[0].length();


        for (int i = 0; i < wordArray.length; i++) {

            if (lengthMax < wordArray[i].length()) {
                lengthMax = wordArray[i].length();
                indexMax = i;

            }
            if (lengthMin >= wordArray[i].length()) {
                lengthMin = wordArray[i].length();
                indexMin = i;
            }

        }

        textSubstitution(text, indexMax, indexMin);
    }

    static void textSubstitution(String text, int indexMax, int indexMin) {

        String[] newArray = text.split("\\s+");
        StringBuilder textSub = new StringBuilder();

        String wordMemory = newArray[indexMax];
        newArray[indexMax] = newArray[indexMin];
        newArray[indexMin] =wordMemory;

        for (String word : newArray) {
            textSub.append(word).append(" ");
        }
        System.out.println(textSub);
    }
}
