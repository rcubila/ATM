import org.junit.Test;
import org.junit.Assert;

public class CheckingTest {


    @Test
    public void checkingAccountTest(){
        Checking checking = new Checking();

        double expected = 1000.00;

        double actual = checking.getCurrentBal();

        Assert.assertEquals("The boolean values are equals", expected, actual, 0);
    }

    @Test
    public void savingTest(){
        Saving saving = new Saving();

        double expected = 3000.00;

        double actual = saving.getCurrentBal();

        Assert.assertEquals("The boolean values are equals", expected, actual, 0);
    }




}
