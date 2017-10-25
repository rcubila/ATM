
public class Account {

    protected String accountType;
    protected double currentBalance;

    protected double deposit(double amount) {
        this.currentBalance += amount;
        return  this.currentBalance;
    }
}
