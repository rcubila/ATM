import java.util.Scanner;

public class App {

  static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        int getUserInput = 0;

        UserFactory userFactory = new UserFactory();

        Actions actions = new Actions();
        actions.userGreeting();

        // getting user menu selecttion
        getUserInput = scanner.nextInt();

        actions.getUserInput(getUserInput);

        // getting user first name
        String firstNameInput = scanner.nextLine();




        

       




    }

}







