import org.junit.Assert;
import org.junit.Test;

public class SavingTest {

    @Test
    public void getCurrentBalanceTest(){
        Saving saving = new Saving();

        double expected = 0;

        double actual = saving.getCurrentBalance();

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void withdrawFromSavingsTest(){
        Saving saving = new Saving();

        double expected = 0;

        double actual = saving.withDrawFromSaving (expected);

        Assert.assertEquals(expected, actual,0);

    }

    @Test
    public void depositOnSavingTest(){

        Saving saving = new Saving();

        double withDraw = 30;
        double expected = 50;
        saving.depositOnSaving (80);
        double actual = saving.withDrawFromSaving (withDraw);

        Assert.assertEquals(expected, actual, 0);

    }
}
