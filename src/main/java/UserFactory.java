import java.util.ArrayList;

public class UserFactory {

String nameOfUserSelected = "";


    public String userGenerator(String checkingID){

//        //System.out.println("Please user name....");
//
//        ArrayList<String> name = new ArrayList<String>();
//
//        name.add("Raul");
//
//        for(int i =0; i < name.size();i++){
//
//            if(name.contains(name.equals("raul"))){
//              userWelcomeMessage();
//                nameOfUserSelected+=name.get(0);
//            }
// }
        return nameOfUserSelected;
    }

    public void userWelcomeMessage(){
        System.out.println("Welcome Mr/Ms " + nameOfUserSelected + " would you like to access to your 'CHECKING', SAVING or INVESMENT ACCOUNT ...?");
        System.out.println("Press '1' for CHECKING, '2' for SAVING or '3' for INVESMENT " );
    }

}
