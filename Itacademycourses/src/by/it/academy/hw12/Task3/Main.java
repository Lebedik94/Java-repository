package by.it.academy.hw12.Task3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) {

        writeReadProcessNumbers(fileCreation());

    }

    private static File fileCreation() {
        File binaryFile = new File("D:\\TestGitProject\\Itacademycourses\\src\\by\\it\\academy\\hw12\\Task3\\binaryFile.bin");
        try {
            boolean result = binaryFile.createNewFile();
            if (result) {
                System.out.println("Файл создан");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return binaryFile;
    }

    private static void writeReadProcessNumbers(File binaryFile) {

        try (DataOutputStream dos = new DataOutputStream(Files.newOutputStream(binaryFile.toPath()));
             DataInputStream readNumbers = new DataInputStream (Files.newInputStream(binaryFile.toPath()))) {

            for(int i = 0; i < 30; i++){
                int num = (int) (1 + (Math.random() * 100));
                String numbers = Integer.toBinaryString(num);
                dos.writeUTF(numbers);
            }
            System.out.print("Все читаемые числа: ");
            int[] number = new int[30];
            for(int i = 0; i < number.length; i++){
                String numbers = readNumbers.readUTF();
                number[i] = Integer.parseInt(numbers, 2);
                System.out.print(number[i] + " ");
            }

            int result = 0;
            for (int num : number){
                result += num;
            }
            System.out.println("\nСреднее арифметическое всех читаемых чисел: " + result / number.length);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
