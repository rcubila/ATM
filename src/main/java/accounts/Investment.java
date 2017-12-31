package accounts;

public class Investment extends Account{

    public Investment(double initialDeposit) {
        super();
        this.setBalance(initialDeposit);

    }

    @Override
    public String toString() {
        String accountType = "Investment";
        return "Account Type: " + accountType + "Account\n" +
                "Account Number " + this.getUuid() + "\n" +
                "Balance: " + this.getBalance() + "\n";
    }
}
