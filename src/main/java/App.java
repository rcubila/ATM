import java.util.Scanner;

public class App {


    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Account account = new Account();
        SwitchOptions switchOptions = new SwitchOptions();
        Checking checking = new Checking();
        // UserFactory userFactory = new UserFactory();

        UserGreeting hello = new UserGreeting();
        String currentUser = "";
        String existingUserChoice = "";
        String checkingUserName = "";
        String userInputLastName = "";
        String checkingPassword = "";
        String existingUserOptions = "";
        String goBackToMainMenuInput = "";
        String fromWhereToWithDraw = "";
        double withDrawingFromCheckingAmount;
        double withDrawingFromSavingAmount;

        hello.userGreeting(currentUser);

        userInput();

    }


    public static void userInput() {



        String currentUser;
        String checkingUserName;
        String checkingPassword;
        String existingUserOptions;
        System.out.println("Are you an existing customer or you would like to open a new Account...?");
        System.out.println("Write 'YES for current user or 'NEW for new account...'");


        try{
        currentUser = scanner.nextLine();

        System.out.println("Let's check user name and password");

        System.out.println("User ID please...");
        checkingUserName = scanner.nextLine();

        System.out.println("password");
        checkingPassword = scanner.nextLine();


        userAuthentification(checkingUserName, checkingPassword);


        existingUserOptions = scanner.nextLine();

      }catch (Exception e){
            System.out.println("Ups!!! somthing went wrong try again");
        }
    }



    private static void existingUserPrompt(String value, String userName, String pass) {

        if (value.equalsIgnoreCase("yes")) {
            userAuthentification(userName, pass);
        } else if (value.equalsIgnoreCase("new")) {

            System.out.println("Lets create a new account...");

        }
    }

    private static void userAuthentification(String userName, String pass) {
        SwitchOptions switchOptions = new SwitchOptions();

        if (userName.equals("raul") && (pass.equals("123"))) {


            System.out.println("Welcome back Mr " + userName + " What would you like to do...?");
            System.out.println("Press '1' for SEE CHECKING, '2' for SAVING, '3' for INVESTMENT, '4' for WITHDRAW or '5' for DEPOSIT  ");
            String optionGiven = scanner.nextLine();
            switchOptions.userOptions(optionGiven);
            gettingTheMoney();

        }else{
            System.out.println("Try again please, the user name or password doesn't match");

            userInput();

        }

    }

    private static void gettingTheMoney() {

        Account account = new Account();
        Checking checking = new Checking();
        double amountToRetire = scanner.nextDouble();
        checking.withDrawFromChecking(amountToRetire);
        System.out.println("Here is your money $"+ amountToRetire);

        System.out.println("Your remeinder balance is $" + checking.withDrawFromChecking(amountToRetire));


        }

}





