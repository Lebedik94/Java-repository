package by.it.academy.hw11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRepositoryService {

    public boolean validLogin (String login) {
        Pattern pattern = Pattern.compile("\\w{5,20}");
        Matcher matcher = pattern.matcher(login);
        if(!matcher.matches()){
            throw new WrongLoginException("Неверные параметры логина");
        } return true;
    }

    public boolean validPassword(String password){
        Pattern pattern = Pattern.compile("\\w{8,}");
        Matcher matcher = pattern.matcher(password);
        if (!matcher.matches()){
            throw new WrongPasswordException("Неверные параметры пароля");
        } return true;
    }

    public boolean loginExist (UserRepository userRepository, String login){
        for (User userTest : userRepository.getUserList()){

            if(!userTest.getLogin().contains(login)){
                throw new UserNotExistException("Этот логин не существует.");
            }
        } return true;
    }

    public boolean passwordExist (UserRepository userRepository, String password){
        for (User userTest : userRepository.getUserList()){
            if(!userTest.getPassword().contains(password)){
                throw new WrongPasswordException("Этот пароль не существует.");
            }
        } return true;
    }
}