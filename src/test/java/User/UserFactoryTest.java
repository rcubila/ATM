package User;

import accounts.Account;
import org.junit.Assert;
import org.junit.Test;
import user.User;
import user.UserFactory;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;

public class UserFactoryTest {


    UserFactory userFactory = new UserFactory();

    @Test
    public void addUserTestAndGetAllUsersTest() {
        Account checkingAccount1 = new Account();
        Account savingAccount1 = new Account();
        User john = new User("John", "Dits", "Masculine", checkingAccount1);
        User molly = new User("Molly", "Bentz", "Feminine", savingAccount1);
        userFactory.addUser(john);
        userFactory.addUser(molly);
        int expected = 2;
        int actual = userFactory.getAllUsers().size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getUserTest() {

        Account checkingAccount1 = new Account();
        Account savingAccount1 = new Account();
        User john = new User("John", "Dits", "Masculine", checkingAccount1);
        User molly = new User("Molly", "Bentz", "Feminine", savingAccount1);
        userFactory.addUser(john);
        userFactory.addUser(molly);
        User expected = userFactory.getAllUsers().get(1);
        User actual = userFactory.getUser(1);
        Assert.assertThat(actual, is(expected));

    }


}
