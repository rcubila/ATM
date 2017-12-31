package accounts;

public class Checking extends Account {

    public Checking(double initialDeposit) {
        super();
        this.setBalance(initialDeposit);

    }

    @Override
    public String toString() {
        String accountType = "Checking";
        return "Account Type: " + accountType + "Account\n" +
                "Account Number " + this.getUuid() + "\n" +
                "Balance: " + this.getBalance() + "\n";
    }
}
