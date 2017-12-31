package accounts;

import accounts.Account;

public class Savings extends Account {

    public Savings(double initialDeposit) {
        super();
        this.setBalance(initialDeposit);

    }

    @Override
    public String toString() {
        String accountType = "Savings";
        return "Account Type: " + accountType + "Account\n" +
                "Account Number " + this.getUuid() + "\n" +
                "Balance: " + this.getBalance() + "\n";
    }
}
