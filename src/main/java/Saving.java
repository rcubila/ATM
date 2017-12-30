public class Saving extends Account{

    public Saving() {

        this(0);
    }

    public Saving(double initialBalance) {
        setCurrentBalance (initialBalance);
    }

    public double getCurrentBalance() {
        return getCurrentBalance ();
    }

    public double depositOnSaving(double amountDeposit) {
        return getCurrentBalance () + amountDeposit;
    }

    public double withDrawFromSaving(double amountWithDrawed) {
        return getCurrentBalance () - amountWithDrawed;
    }

    public void showSavingBalance() {
        System.out.println (getCurrentBalance ());
    }

}
