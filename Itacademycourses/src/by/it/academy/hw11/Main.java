package by.it.academy.hw11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Приветствуем тебя на нашем сайте!\n" +
                "Выбери один из предложенных вариантов:\n" +
                "1. Регистрация\n" +
                "2. Авторизация\n" +
                "3. Выход");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        List<User> userList = new ArrayList<>();
        userList.add(new User("ViollaLebedik", "password111111111"));
        UserRepository userRepository = new UserRepository(userList);
        UserRepositoryService userRepositoryService = new UserRepositoryService();

        registrationAuthorization (choice, userList, userRepository,
                userRepositoryService);

        //System.out.println(userRepository);

    }

    public static void registrationAuthorization (int choice, List<User> userList, UserRepository userRepository,
                                                  UserRepositoryService userRepositoryService) {

        switch (choice) {
            case 1:
                System.out.println("Введите логин:");
                Scanner scanner1 = new Scanner(System.in);
                String login = scanner1.next();
                try {
                    System.out.println(userRepositoryService.validLogin(login));
                } catch (WrongLoginException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Попробуйте еще раз");
                    break;
                }
                System.out.println("Введите пароль:");
                Scanner scanner2 = new Scanner(System.in);
                String password = scanner2.next();
                try {
                    System.out.println(userRepositoryService.validPassword(password));
                } catch (WrongPasswordException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Попробуйте еще раз");
                    break;
                }
                User user = new User(login, password);
                userList.add(user);
                System.out.println("Регистрация прошла успешно.\n" +
                        "Твой логин: " + user.getLogin() + "  Твой пароль: "
                        + user.getPassword());
                break;
            case 2:
                System.out.println("Введите логин:");
                Scanner scanner3 = new Scanner(System.in);
                String login2 = scanner3.next();
                try {
                    System.out.println(userRepositoryService.loginExist(userRepository, login2));
                } catch (UserNotExistException ex) {
                    System.out.println(ex.getMessage());
                    System.out.println("Попробуйте еще раз");
                    break;
                }
                System.out.println("Введите пароль:");
                Scanner scanner4 = new Scanner(System.in);
                String password2 = scanner4.next();
                try {
                    System.out.println(userRepositoryService.passwordExist(userRepository, password2));
                } catch (WrongPasswordException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Попробуйте еще раз");
                    break;
                }

                System.out.println("Авторизация прошла успешно");
                break;
        }

    }
}