import java.util.Scanner;

public class App {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        Account account = new Account();
        UserGreeting hello = new UserGreeting();
        UserFactory userFactory = new UserFactory();
        Checking checking = new Checking();
        Saving saving = new Saving();
        Invesment invesment = new Invesment();
        WithDraw withDraw = new WithDraw();

        String checkingId = "";
        String gettingPass = "";
        String userCheSavInvWdrawDepOptions = "";

        hello.userGreeting();

        String userInputNewOrCurrent = scanner.next();

        if (userInputNewOrCurrent.equalsIgnoreCase("yes")) {
            userFactory.userGenerator(checkingId);

            System.out.println(" Welcome again, what would you like to do... Press '1' for SEE CHECKING, '2' for SAVING, '3' for INVESTMENT, '4' for WITHDRAW or '5' for DEPOSIT  ");
            userCheSavInvWdrawDepOptions = scanner.next();

            if(userCheSavInvWdrawDepOptions.equalsIgnoreCase("1")){
                System.out.println(checking.currentBalance());
            } else if(userCheSavInvWdrawDepOptions.equalsIgnoreCase("2")){
                System.out.println(saving.savingCurrentBalance());
            }else if(userCheSavInvWdrawDepOptions.equalsIgnoreCase("3")){
                System.out.println(invesment.investmentCurrentBalance());
            }else if(userCheSavInvWdrawDepOptions.equalsIgnoreCase("4")){
                System.out.println("From where would you like to withdraw...? 1 from CHECKING or 2 for SAVING please ");
                String withDrawSavingOrChecking = scanner.next();
                if(withDrawSavingOrChecking.equalsIgnoreCase("1")){

                    System.out.println("How much would you like to WITHDRAW from your checking account...?");
                                      double withDrawFromChecking = scanner.nextDouble();
                    System.out.println(" Please take your money $" + withDrawFromChecking);
                    System.out.println(" your remaining balance is $" + withDraw.withDrawFromChecking(checking.currentBalance(), withDrawFromChecking));
                }else if(withDrawSavingOrChecking.equalsIgnoreCase("2")){

                    System.out.println("How much would you like to WITHDRAW from your Saving account...?");
                                      double withDrawFromSaving = scanner.nextDouble();
                    System.out.println(" Please take your money $" + withDrawFromSaving);

                    System.out.println(" your remaining balance is $" + withDraw.withDrawFromSaving(saving.savingCurrentBalance(), withDrawFromSaving));

                }
            }


        } else if(userInputNewOrCurrent.equalsIgnoreCase("new")){
            System.out.println("Would like to create a new account ...? ");
        }else{
            System.out.println("Please choose one the option above... no");
        }



    }

}



