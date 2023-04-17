package by.it.academy.hw16;

import java.time.LocalDateTime;
import java.util.Scanner;

import static by.it.academy.hw16.UserRepositoryUtilNew.loginExist;
import static by.it.academy.hw16.UserRepositoryUtilNew.passwordExist;

public class AuthorizationServiceNew {

    private UserRepositoryNew userRepository;
    public AuthorizationServiceNew(UserRepositoryNew userRepository){
        this.userRepository = userRepository;
    }

    public void authorization (Scanner scanner){
        System.out.println("Enter login:");
        String login = scanner.next();
        loginExist(userRepository, login);
        System.out.println("Enter password:");
        String password = scanner.next();
        if(!passwordExist(password, loginExist(userRepository, login))) {
            try {
                passwordExist(password, loginExist(userRepository, login));
            } catch (WrongPasswordExceptionNew e) {
                System.out.println(e.getMessage());
                System.out.println("Try again");
            }
        }else {
            loginExist(userRepository, login).setLastAuthorizationDate(LocalDateTime.now());
            System.out.println("Authorization was successful.");
            System.out.println(userRepository);
        }
    }
}