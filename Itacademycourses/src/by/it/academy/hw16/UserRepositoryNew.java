package by.it.academy.hw16;

import java.util.List;
import java.util.Objects;

public class UserRepositoryNew {
    private List<UserNew> userList;

    public UserRepositoryNew(List<UserNew> userList){
        this.userList = userList;
    }

    public List<UserNew> getUserList() {
        return userList;
    }

    public void setUserList(List<UserNew> userList) {
        this.userList = userList;
    }

    public void addUser(String login, String password){
        userList.add(new UserNew(login, password));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserRepositoryNew)) return false;
        UserRepositoryNew that = (UserRepositoryNew) o;
        return Objects.equals(userList, that.userList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userList);
    }

    @Override
    public String toString() {
        return "UserRepositoryNew{" +
                "userList=" + userList +
                '}';
    }
}
