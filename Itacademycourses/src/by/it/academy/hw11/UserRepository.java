package by.it.academy.hw11;

import java.util.List;
import java.util.Objects;

public class UserRepository {
    private List<User> userList;

    public UserRepository (List<User> userList){
        this.userList = userList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String
    toString() {
        return "UserRepository{" +
                "userList=" + userList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRepository that = (UserRepository) o;
        return Objects.equals(userList, that.userList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userList);
    }
}