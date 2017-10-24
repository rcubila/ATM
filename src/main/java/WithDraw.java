public class WithDraw {

    Checking checking;
    Saving saving;

    public double withDrawFromChecking(double checking, double amountWithdrawed){


        double result = checking - amountWithdrawed;
        return result;
    }

    public double withDrawFromSaving(double saving, double amountWithDrawed){

        double result = saving - amountWithDrawed;

        return result;
    }
}
