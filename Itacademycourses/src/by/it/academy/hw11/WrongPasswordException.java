package by.it.academy.hw11;

public class WrongPasswordException extends RuntimeException{
    private String message;

    public WrongPasswordException (String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
