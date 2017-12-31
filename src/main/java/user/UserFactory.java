package user;

import java.util.ArrayList;

public class UserFactory {

    private ArrayList<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public User getUser(int account) {

        return users.get(account);
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
