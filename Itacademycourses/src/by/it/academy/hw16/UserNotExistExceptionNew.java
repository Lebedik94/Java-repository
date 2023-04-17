package by.it.academy.hw16;

public class UserNotExistExceptionNew extends RuntimeException{
    private String message;

    public UserNotExistExceptionNew(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
