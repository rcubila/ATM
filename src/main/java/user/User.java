package user;

import accounts.Account;

public class User {

    private String firstName;
    private String lastName;
    private String gender;
    private Account account;

    public User(String firstName, String lastName, String gender, Account account) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.account = account;
    }

    @Override
    public String toString() {
        return "\nUser Information\n" +
                "FirstName: " + firstName +"\n" +
                "Last Name: " + lastName  +"\n" +
                "gender: " + gender + "\n" +
                account;
    }

    public String basicInfo() {
        return "FirstName: " + firstName + ", " +
                "Last Name: " + lastName + ", " +
                "gender: " + gender + "\n" +
                account;
    }


    public Account getAccount() {
        return account;
    }
}
