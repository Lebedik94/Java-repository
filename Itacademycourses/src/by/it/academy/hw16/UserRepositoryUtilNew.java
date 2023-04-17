package by.it.academy.hw16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRepositoryUtilNew {

    private UserRepositoryUtilNew(){
    }

    public static boolean validLogin (String login) {
        Pattern pattern = Pattern.compile("\\w{5,20}");
        Matcher matcher = pattern.matcher(login);
        if(!matcher.matches()){
            throw new WrongLoginExceptionNew("Login does not meet requirements");
        } else return true;
    }

    public static boolean validPassword(String password){
        Pattern pattern = Pattern.compile("\\w{8,}");
        Matcher matcher = pattern.matcher(password);
        if (!matcher.matches()){
            throw new WrongPasswordExceptionNew("Password does not meet requirements");
        } else return true;
    }

    public static boolean checkingForLogin(UserRepositoryNew userRepository, String login) {
        for (UserNew user : userRepository.getUserList()) {
            if(user.getLogin().equals(login)){
                return false;
            }
        }
        return true;
    }

    public static UserNew loginExist (UserRepositoryNew userRepository, String login){
        UserNew user = null;
        for (UserNew userTest : userRepository.getUserList()){
            if (userTest.getLogin().contains(login)) {
                user = userTest;
                break;
            }
        }
        if(user == null) {
            throw new UserNotExistExceptionNew("User with this login does not exist");
        }
        return user;
    }

    public static boolean passwordExist (String enteredPassword, UserNew user){
        boolean coincidence = enteredPassword.equals(user.getPassword());
        if (!coincidence){
            throw new WrongPasswordExceptionNew("Password entered incorrectly");
        }
        return true;
    }


}
