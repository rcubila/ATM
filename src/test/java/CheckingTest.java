import org.junit.Test;
import org.junit.Assert;

public class CheckingTest {

    @Test
    public void getCurrentBalanceanceTest(){
        Checking checking = new Checking();

        double expected = 0;

        double actual = checking.getCurrentBalance();

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void depositOnCheckingTest(){
        Checking checking = new Checking();


        double expected = 40;
        checking.depositOnChecking(expected);

        double actual = checking.getCurrentBalance();

        Assert.assertEquals( expected, actual, 0);
    }


    @Test
    public void withDrawFromCheckingTest(){
        Checking checking = new Checking();
        double withDrawAmount = 10;
        double expected = 20;
        checking.depositOnChecking(30);
        double actual = checking.withDrawFromChecking(withDrawAmount);

        Assert.assertEquals(expected, actual, 0);

    }


    @Test
    public void gettingTheMoneyTest(){
        Checking checking = new Checking();
        double expected = 1000;


    }



    @Test
    public void setCurrentBalanceAndGetterTest(){

        Checking checking = new Checking();
        double expected = 0;
        checking.setCurrentBalance (expected);
        double actual = checking.getCurrentBalance();
    }



}
