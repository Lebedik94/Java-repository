package by.it.academy.hw16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static by.it.academy.hw16.UserRepositoryUtilNew.*;

public class RegistrationServiceNew {

    private UserRepositoryNew userRepository;

    public RegistrationServiceNew(UserRepositoryNew userRepository){
        this.userRepository = userRepository;
    }

    public void registration (Scanner scanner) {
        System.out.println("Enter login:\n(Login must contain only Latin letters, numbers and underscores, " +
                "length must be from 5 to 20 characters)");
        String login = scanner.next();
        if (!validLogin(login)) {
            try {
                validLogin(login);
            } catch (WrongLoginExceptionNew e) {
                System.out.println(e.getMessage());
                System.out.println("Try again");
            }
        } else if (!checkingForLogin(userRepository, login)){
            System.out.println("This username already exists, please enter another one");
        }else {
            System.out.println("Enter password:\n(The password must contain only Latin letters, numbers and " +
                    "underscores, at least 8 characters)");
        }
        String password = scanner.next();

        if (!validPassword(password)) {
            try {
                validPassword(password);
            } catch (WrongPasswordExceptionNew e) {
                System.out.println(e.getMessage());
                System.out.println("Try again");
            }
        }else {
            userRepository.addUser(login, password);
            System.out.println("Registration was successful.\n" +
                    "Your login: " + login + " Your password: "
                    + password);
            System.out.println(userRepository);
        }
    }

    public void getUser(UserRepositoryNew userRepository, Scanner scanner){

        System.out.println("Here you can see all users who have registered in a certain period of time");
        LocalDateTime dateStart = getDateStart(scanner);
        LocalDateTime dateEnd = getDateEnd(scanner);

        System.out.println("During the given period of time were registered:");

        for (UserNew user : userRepository.getUserList()){
            if(user.getRegistrationDate().isAfter(dateStart) && user.getRegistrationDate().isBefore(dateEnd)){
                System.out.println(user);
            }
        }
    }
    public LocalDateTime getDateStart(Scanner scanner){
        System.out.println("Enter the start date in the format: yyyy-MM-dd-HH:mm");
        String start = scanner.next();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH:mm");
        return LocalDateTime.parse(start, format);
    }

    public LocalDateTime getDateEnd(Scanner scanner){
        System.out.println("Enter the end date in the format: yyyy-MM-dd-HH:mm");
        String end = scanner.next();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH:mm");
        return LocalDateTime.parse(end, format);
    }
}
