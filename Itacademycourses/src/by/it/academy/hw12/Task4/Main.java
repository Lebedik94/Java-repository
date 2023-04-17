package by.it.academy.hw12.Task4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Дмитрий", "Бекаревич", 28));
        personList.add(new Person("Татьяна", "Тимошенко", 45));
        personList.add(new Person("Александра", "Можанова", 30));
        personList.add(new Person("Анастасия", "Мелешко", 33));
        personList.add(new Person("Андрей", "Кузнецов", 38));

        serializationPerson(fileCreation(), personList);
        deserializationSorting(fileCreation());

    }

    private static File fileCreation(){
        File filePerson = new File("D:\\TestGitProject\\Itacademycourses\\src\\by\\it\\academy\\hw12\\Task4\\filePerson.txt");
        try {
            boolean result = filePerson.createNewFile();
            if(result){
                System.out.println(filePerson.getName() + " created");
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }return filePerson;
    }

    private static void serializationPerson(File file, List<Person> personList){
        try (FileOutputStream personOut = new FileOutputStream(file)) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(personOut);
            for (Person person : personList) {
                objectOutputStream.writeObject(person);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void deserializationSorting(File file){
        List<Person> personList = new ArrayList<>();
        try (FileInputStream personIn = new FileInputStream(file)) {
            ObjectInputStream objectInputStream = new ObjectInputStream(personIn);
            for (int i = 0; i < 5; i++) {
                personList.add((Person) objectInputStream.readObject());
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        Collections.sort(personList);
        System.out.println("Сортировка по имени: ");
        for (Person person : personList) {
            System.out.println(person);
        }

        personList.sort(personComparator());
        System.out.println("Сортировка по фамилии: ");
        for (Person person : personList) {
            System.out.println(person);
        }
    }

    private static Comparator<Person> personComparator() {
        return new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getSurname().compareTo(o2.getSurname());

            }
        };
    }
}
