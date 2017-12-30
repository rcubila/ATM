import org.junit.Assert;
import org.junit.Test;

public class InvestmentTest {


    @Test

    public void investmentConstructorTest(){

        Investment investment = new Investment();

        double expected = 5000;
        double actual = investment.getCurrentBalance ();

        Assert.assertEquals(expected, actual, 0);
    }
}
