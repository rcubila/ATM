
public class SwitchOptions {

    Checking checking = new Checking();
    Account account = new Account();
    Saving saving = new Saving();
    Investment investment = new Investment();


    public String userOptions(int value) {
        String response = "";

        switch (value) {

            case 1:
                response += checking.getCurrentBalance();
                break;

            case 2:
                response += saving.getCurrentBalance();
                break;

            case 3:

                response += investment.getCurrentBalance();
                break;
            case 4:

                response = "How much would you like to WITHDRAW...?";

                break;
            case 5:
                response = "How much would you like to deposit...?";
                break;


            default:
                System.out.println("Please type a number between 1 and 5, option no accepted");
        }
        return response;

    }

    public int WithDrawOrDepositOptions(int optionGiven) {
        if (optionGiven == 4) {
            // depositMoney();
        } else if (optionGiven == 5) {
            //   gettingTheMoney();
        }
        return optionGiven;
    }

}
