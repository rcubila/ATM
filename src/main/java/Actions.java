import java.util.Scanner;

public class Actions {

    Scanner scanner = new Scanner(System.in);

    public void userGreeting() {

        System.out.println("|-------------------------------|");
        System.out.println("|                               |");
        System.out.println("| Welcome to Cubila USA Bank..!!|");
        System.out.println("|                               |");
        System.out.println("|                               |");
        System.out.println("|-------------------------------|");

        System.out.println("What would like to do, 1-Create account, 2- Sign in, 3- QUIT");
    }


    public void getUserInput(int selection) {

        selection = -1;

        do {
            try {
                selection = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Sorry just numbers... try again");
            }
            if (selection < 0 || selection > 3) {
                System.out.println("Please try again, the option are from 1 to 3.... ");
            }

        } while (selection < 0 || selection > 3);

    }


}


