package accounts;

import java.util.UUID;

public class Account {

    private static UUID uuid;
    private double balance = 0;

    public Account() {
        uuid = UUID.randomUUID();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public UUID getUuid() {
        return uuid;
    }

    public void withDraw(double amount) {

        if (amount > balance) {
            System.out.println("Sorry, you have insufficient funds...");
            return;
        }
        balance -= amount;
        System.out.println("You have withdraw " + amount + " dollars...");
        System.out.println("Your current balance is " + balance);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Sorry can't deposit less than " + amount);
            return;
        }
        balance += amount;
        System.out.println("You have deposited $" + amount + " dollars");
        System.out.println("Your current balance is " + balance);
    }
}
