package by.it.academy.hw16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<UserNew> userList = new ArrayList<>();
        UserRepositoryNew userRepository = new UserRepositoryNew(userList);
        RegistrationServiceNew registrationService = new RegistrationServiceNew(userRepository);
        AuthorizationServiceNew authorizationService = new AuthorizationServiceNew(userRepository);
        Scanner scanner = new Scanner(System.in);

        registrationAuthorizationMenu (registrationService, authorizationService, scanner);
        registrationService.getUser(userRepository, scanner);

    }

    public static void registrationAuthorizationMenu (RegistrationServiceNew registrationService, AuthorizationServiceNew authorizationService, Scanner scanner) {
        System.out.println("Welcome to our site!\n" +
                "Choose one of the suggested options:\n" +
                "1. Registration\n" +
                "2. Authorization\n" +
                "3. Exit");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                registrationService.registration(scanner);
                backTtoMenu(registrationService, authorizationService, scanner);
                break;
            case 2:
                authorizationService.authorization(scanner);
                backTtoMenu(registrationService, authorizationService, scanner);
                break;
            case 3:
                System.out.println("See you again :)");

        }

    }

    public static void backTtoMenu(RegistrationServiceNew registrationService, AuthorizationServiceNew authorizationService, Scanner scanner){
        System.out.println("To exit the main menu, press: 1\n" +
                "if you want to stay press: 2");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                registrationAuthorizationMenu (registrationService, authorizationService, scanner);
                break;
            case 2:
                System.out.println("We continue to work in the main menu");
                break;
        }
    }

}
