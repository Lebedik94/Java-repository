package by.it.academy.hw8;

import java.util.Objects;

public class User1 {
    private String login,password ;

    public class Query{
        public void printToLog(){
            System.out.println("User c логином " + login + " и паролем " + password + " отправил запрос");
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public User1(String login, String password) {
        this.login = login;
        this.password = password;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User1 user1 = (User1) o;
        return Objects.equals(login, user1.login) && Objects.equals(password, user1.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }

    @Override
    public String toString() {
        return "User1{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
