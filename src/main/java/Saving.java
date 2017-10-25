public class Saving extends Account{

    public Saving() {

        this(1000);
    }

    public Saving(double initialBalance) {

        this.currentBalance = initialBalance;
        this.accountType = "Saving";
    }

    public double getCurrentBal(){
        return this.currentBalance;
    }

    public double withdrawFromSavings(double amount){

        this.currentBalance -= amount;
        return this.currentBalance;
    }

}
