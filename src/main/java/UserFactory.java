import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserFactory {

    ArrayList<User> usersList = new ArrayList<> ();

    public void createUser(User users) {
        usersList.add (users);
    }

    public User findUserById(long id) {
        return usersList.get (((int) id));
    }

    public void deletedUserById(long id) {
        usersList.remove (id);
    }

    public User findUserByName(String name) {
        for (User user : usersList) {
            if (user.equals (name)) {
                return user;
            }
        }
        return null;
    }

    public void deletedUserByName(String name) {
        for (User user : usersList) {
            if (user.equals (name)) {
                usersList.remove (user);
            }
        }
    }
}







