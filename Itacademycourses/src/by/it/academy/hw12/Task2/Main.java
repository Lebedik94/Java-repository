package by.it.academy.hw12.Task2;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        textWrite (fileCreation());
        textCountingAndRead (fileCreation());

    }
    private static File fileCreation() {
        File fileText = new File("D:\\TestGitProject\\Itacademycourses\\src\\by\\it\\academy\\hw12\\Task2\\fileText.txt");
        try {
            boolean result = fileText.createNewFile();
            if (result) {
                System.out.println(fileText.getName() + " created");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return fileText;
    }

    private static void textWrite (File file){
        try(Writer writerText = new FileWriter(file)){
            String text = "Help yourself to tasty dinner, my dear godmother. Honestly, there’s nothing more to entertain you.";
            writerText.write(text);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    private static void textCountingAndRead (File file){
        try(Reader readText = new FileReader(file)){
            StringBuilder text = new StringBuilder();
            int i = -1;
            while ((i = readText.read()) != -1) {
                text.append((char)i);
            }
            Pattern pattern = Pattern.compile("[A-Za-z]+");
            Matcher matcher = pattern.matcher(text);
            int word = 0;
            while (matcher.find()){
                word++;
            }
            System.out.println("Колличество слов в тексте: " + word);

            Pattern pattern2 = Pattern.compile("[\\.,:!?-]");
            Matcher matcher2 = pattern2.matcher(text);
            int punctuationMarks = 0;
            while (matcher2.find()){
                punctuationMarks++;
            }
            System.out.println("Колличество знаков препинания в тексте: " + punctuationMarks);

        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
