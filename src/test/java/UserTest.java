import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class UserTest {

    User user = new User("raul", 1);

    @Test
    public void getNameTest(){
        String name = "raul";
        user.setName(name);
        String expected = "raul";
        String actual = user.getName();
        Assert.assertEquals(expected, actual);

    }

    @Test

    public void addAccountTest(){





    }


}
