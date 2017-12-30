public class Checking extends Account {

    public static double acctNumb = 0;

    public Checking() {

    }
    public Checking(double initialBalance) {
        setCurrentBalance (initialBalance);
    }

    public double getCurrentBalance() {
        return getCurrentBalance ();
    }

    public double depositOnChecking(double amountDeposit) {
        return getCurrentBalance () + amountDeposit;
    }

    public double withDrawFromChecking(double amountWithDrawed) {
        return getCurrentBalance () - amountWithDrawed;
    }

    public void showCheckingBalance() {
        System.out.println (getCurrentBalance ());
    }



}
