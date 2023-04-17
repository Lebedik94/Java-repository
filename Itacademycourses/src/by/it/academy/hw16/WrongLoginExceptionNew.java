package by.it.academy.hw16;

public class WrongLoginExceptionNew extends RuntimeException{
    private String message;

    public WrongLoginExceptionNew(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}