public class Checking extends Account {

    public Checking() {

        this(1000);
    }

    public Checking(double initialBalance) {

        this.currentBalance = initialBalance;
        this.accountType = "Checking";

    }

    public double getCurrentBal(){
        return currentBalance;

    }

    public void setCurrentBal(double currentBal) {
        this.currentBalance = currentBal;
    }

    public double depositOnChecking(double amountDeposit) {

        double newTotalAmount = getCurrentBal() + amountDeposit;

        return newTotalAmount;
    }

    public double withDrawFromChecking(double amountWithDrawed) {
        double moneyLeft = currentBalance - amountWithDrawed;
        return moneyLeft;
    }
}
