package by.it.academy.hw16;

public class WrongPasswordExceptionNew extends RuntimeException{
    private String message;

    public WrongPasswordExceptionNew(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
