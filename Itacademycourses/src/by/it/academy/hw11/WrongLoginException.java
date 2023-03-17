package by.it.academy.hw11;

public class WrongLoginException extends RuntimeException{
    private String message;

    public WrongLoginException (String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
