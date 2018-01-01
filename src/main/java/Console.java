
import accounts.Account;
import accounts.Checking;
import accounts.Savings;
import user.User;
import user.UserFactory;

import java.util.ArrayList;
import java.util.Scanner;

public class Console {

    private Scanner scanner = new Scanner(System.in);
    private UserFactory userFactory = new UserFactory();
    WaitTime waitTime = new WaitTime();
    private boolean exit;


    public static void main(String[] args) throws InterruptedException {
        Console console = new Console();
        console.runMenu();
    }

    private void userGreeting() {
        System.out.println("+---------------------------------+");
        System.out.println("|                                 |");
        System.out.println("| Welcome to Svegara's App!!!     |");
        System.out.println("|                                 |");
        System.out.println("+---------------------------------+");

    }


    private void runMenu() throws InterruptedException {
        userGreeting();
        while (!exit) {
            printMenu();
            int choice = getInput();
            menuOptions(choice);
        }
    }

    private void printMenu() {
        System.out.println("What would you like to do next..?");
        System.out.println("1 - Create a new account");
        System.out.println("2 - Make a deposit ");
        System.out.println("3 - Make a withdraw ");
        System.out.println("4 - Account Summary ");
        System.out.println("0 - Exit");
    }

    private int getInput() {

        int choice = -1;
        do {
            System.out.println("Enter your choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Just numbers please, try again...");
            }
            if (choice < 0 || choice > 4) {
                System.out.println("Please choose a number between 1 and 4, try again.");
            }
        } while (choice < 0 || choice > 4);
        return choice;
    }

    private void menuOptions(int choice) throws InterruptedException {

        switch (choice) {
            case 0:
                System.out.println("Thank you for visiting us today, come back !!!");
                System.exit(0);
            case 1:
                createNewAccount();
                break;
            case 2:
                makeADeposit();
                break;
            case 3:
                makeAwithdraw();
                break;
            case 4:
                accountSummary();
                break;
            default:
                System.out.println("Something went wrong...Reloading");

        }
    }

    private void createNewAccount() throws InterruptedException {
        String firstName, lastName, ssn, accountType = "";
        double initialDeposit = 0;
        boolean valid = false;

        while (!valid) {

            System.out.println("Please enter an account type: Press 1) for checking, 2) for savings or 3) for Investment");

            accountType = scanner.nextLine();
            if (accountType.equalsIgnoreCase("1") || accountType.equalsIgnoreCase("2")) {
                valid = true;
                System.out.println("One second please we're building up your new account...");
                waitTime.dots();
                System.out.println();
            } else {
                System.out.println("Invalid account type selected. Please enter 1 or 2");
            }
        }
        System.out.print("Please enter your firstName: ");
        firstName = scanner.nextLine();
        System.out.print("Please enter your Last Name: ");
        lastName = scanner.nextLine();
        System.out.print("Gender: ");
        ssn = scanner.nextLine();
        valid = false;

        while (!valid) {
            System.out.println("Please enter an initial deposit: ");

            try {
                initialDeposit = Double.parseDouble(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Deposit must be numbers");
            }
            if (accountType.equalsIgnoreCase("1")) {
                if (initialDeposit < 100) {
                    System.out.println("Checking account require a minimum of $100 to open ");
                } else {

                    valid = true;
                    System.out.println("One second please please we are saving your deposit...");
                    waitTime.dots();
                    System.out.println();
                }
            } else if (accountType.equalsIgnoreCase("2")) {
                if (initialDeposit < 50) {
                    System.out.println("Savings account require a minimum of $100 to open ");
                } else {
                    valid = true;
                }
            }
        }

        Account account;
        if (accountType.equalsIgnoreCase("1")) {
            account = new Checking(initialDeposit);

        } else {

            account = new Savings(initialDeposit);

        }

        User user = new User(firstName, lastName, ssn, account);
        userFactory.addUser(user);

    }

    private void makeADeposit() {
        int account = selectAccount();

        if (account >= 0) {

            System.out.println("How much would like to deposit ?... ");
            double amount = 0;
            try {
                amount = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                amount = 0;
            }
            userFactory.getUser(account).getAccount().deposit(amount);
        }

    }

    private void accountSummary() {

        int account = selectAccount();

        if (account >= 0) {

            System.out.println(userFactory.getUser(account).getAccount());

        }
    }

    private int selectAccount() {

        ArrayList<User> users = userFactory.getAllUsers();

        if (users.size() <= 0) {
            System.out.println("No users at your userFactory...");
            return -1;
        }
        System.out.println("Select an account...");

        for (int i = 0; i < users.size(); i++) {

            System.out.println((i + 1) + ") " + users.get(i).basicInfo());
        }
        int account = 0;
        System.out.println("Please select an account...");
        try {
            account = Integer.parseInt(scanner.nextLine()) - 1;
        } catch (NumberFormatException e) {
            account = -1;
        }

        if (account < 0 || account > users.size()) {
            System.out.println("Invalid account selected...");
            account = -1;
        }
        return account;
    }


    private void makeAwithdraw() {

        int account = selectAccount();

        if (account >= 0) {

            System.out.println("How much would like to withdraw... ? ");
            double amount = 0;
            try {
                amount = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                amount = 0;
            }
            userFactory.getUser(account).getAccount().withDraw(amount);
        }
    }


}
