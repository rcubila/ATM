public class Investment extends Account{

    public Investment() {

        this(5000);
    }

    public Investment(double initialBalance) {

        this.currentBalance = initialBalance;
        this.accountType = "Investment";
    }

    public double getCurrentBal(){
        return this.currentBalance;

    }

}
