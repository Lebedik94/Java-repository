package by.it.academy.hw12.Task1;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    private static final String PATH_IN1 = "D:\\TestGitProject\\Itacademycourses\\src\\by\\it\\academy\\hw12\\Task1\\in1.txt";
    private static final String PATH_IN2 = "D:\\TestGitProject\\Itacademycourses\\src\\by\\it\\academy\\hw12\\Task1\\in2.txt";

    public static void main(String[] args) throws FileNotFoundException {

        File fileIn1 = new File(PATH_IN1);
        File fileIn2 = new File(PATH_IN2);
        try {
            fileIn1.createNewFile();
            fileIn2.createNewFile();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        writingNumbers(fileIn1, fileIn2);
        writingNewNumbers(creatingNewFile(), readingNumbers(fileIn1, fileIn2));

    }

    private static void writingNumbers(File file1, File file2) {
        try (DataOutputStream dos1 = new DataOutputStream(Files.newOutputStream(file1.toPath()));
             DataOutputStream dos2 = new DataOutputStream(Files.newOutputStream(file2.toPath()))) {
            for (int i = 0; i < 1000; i++) {
                int num1 = (int) (1 + (Math.random() * 100000));
                dos1.writeInt(num1);
            }
            for (int i = 0; i < 1000; i++) {
                int num2 = (int) (1 + (Math.random() * 100000));
                dos2.writeInt(num2);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static List<Integer> readingNumbers(File file1, File file2) {
        List<Integer> numsList = new ArrayList<>();
        try (DataInputStream dis1 = new DataInputStream(Files.newInputStream(file1.toPath()));
             DataInputStream dis2 = new DataInputStream(Files.newInputStream(file2.toPath()))) {

            for (int i = 0; i < 1000; i++) {
                numsList.add(dis1.readInt());
            }

            for (int i = 0; i < 1000; i++) {
                numsList.add(dis2.readInt());
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        Collections.sort(numsList);
        return numsList;
    }

    private static File creatingNewFile() {
        File newFile = new File("D:\\TestGitProject\\Itacademycourses\\src\\by\\it\\academy\\hw12\\Task1\\out.txt");
        try {
            newFile.createNewFile();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return newFile;
    }

    private static void writingNewNumbers(File file, List<Integer> listNum) {
        try (DataOutputStream dos = new DataOutputStream(Files.newOutputStream(file.toPath()))) {
            for (int num : listNum) {
                dos.writeInt(num);
                System.out.println(num);
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

}