package accounts;

import org.junit.Assert;
import org.junit.Test;

public class AccountTest {

    Account account = new Account();


    @Test
    public void withDrawTest(){
        account.setBalance(100);
        account.withDraw(30);
        double expected = 70;
        double actual = account.getBalance();
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void depositTest(){
        account.deposit(100);
        double expected = 100;
        double actual = account.getBalance();
        Assert.assertEquals(expected, actual, 0);
    }

}
