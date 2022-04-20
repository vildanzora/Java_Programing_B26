package day18_string;
import java.util.Locale;
import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        /*
        Ask the user to enter a username
        make sure the username is in lowercase

        Ask the user to enter a password
        make sure the password is more than 8 characters long

        Valid system password : "jamesbond"

         => if the entered password is matches the system password

         logged in

         otherwise print: invalid password

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the username");
        //   String userName = input.next();
        String userName = input.next().toLowerCase();
        // String username = input.next();
        //        username = username.toLowerCase();
        userName = userName.toLowerCase();

        System.out.println("Please enter a password");
        String password = input.next();

        if(password.length() >=8 && password.equals("jamesbond")){
            System.out.println("Logged in with " + userName);
        } else {
            System.out.println("Invalid Password");
        }








    }
}
