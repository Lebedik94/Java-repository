package by.it.academy.hw16;

import java.time.LocalDateTime;
import java.util.Objects;

public class UserNew {
    private String login;
    private String password;
    private LocalDateTime registrationDate;
    private LocalDateTime lastAuthorizationDate;

    public UserNew(String login, String password){
        this.login = login;
        this.password = password;
        registrationDate = LocalDateTime.now();
        lastAuthorizationDate = null;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public LocalDateTime getLastAuthorizationDate() {
        return lastAuthorizationDate;
    }

    public void setLastAuthorizationDate(LocalDateTime lastAuthorizationDate) {
        this.lastAuthorizationDate = lastAuthorizationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserNew)) return false;
        UserNew userNew = (UserNew) o;
        return Objects.equals(login, userNew.login) && Objects.equals(password, userNew.password) && Objects.equals(registrationDate, userNew.registrationDate) && Objects.equals(lastAuthorizationDate, userNew.lastAuthorizationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, registrationDate, lastAuthorizationDate);
    }

    @Override
    public String toString() {
        return "UserNew{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", registrationDate=" + registrationDate +
                ", lastAuthorizationDate=" + lastAuthorizationDate +
                '}';
    }
}
