
public class SwitchOptions {

    Checking checking = new Checking();
    Account account = new Account();
    Saving saving = new Saving();
    Investment investment = new Investment();


    public void userOptions(String value) {
        String response = "";
        int exitCode = 0;
        switch (value) {

            case "1":
                response = "Your current balance is $" + checking.getCurrentBal();
                break;

            case "2":
                response = "Your current saving balance is $" + saving.getCurrentBal();
                break;

            case "3":

                response = "You have been doing good, you Inverstment went up to $" + investment.getCurrentBal();
                break;
            case "4":

                response =   "How much would you like to WITHDRAW...?";
                exitCode = 4;

                break;
            case "5":
                response = "Where would you like to deposit ...Write 1 for CHECKING OR 2 FOR SAVINGS";
                exitCode = 5;
                break;

            default:
                System.out.println("Please type a number between 1 and 5, option no accepted");
        }
        System.out.println(response);

    }

}
