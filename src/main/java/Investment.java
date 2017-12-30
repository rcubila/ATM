public class Investment extends Account{

    public Investment() {

        this(0);
    }

    public Investment(double initialBalance) {
        setCurrentBalance (initialBalance);
    }

    public double getCurrentBalance() {
        return getCurrentBalance ();
    }

    public double depositOnInvestment(double amountDeposit) {
        return getCurrentBalance () + amountDeposit;
    }

    public double withDrawFromInvestment(double amountWithDrawed) {
        return getCurrentBalance () - amountWithDrawed;
    }

    public void showInvesmentBalance() {
        System.out.println (getCurrentBalance ());
    }



}
