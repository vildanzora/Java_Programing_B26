package day19_string;
import java.util.Scanner;
public class UserAndPass {
    public static void main(String[] args) {
        /*
        create a class UserAndPass
ask the user to enter a userName and password. Check if they are valid based on the following requirements:

- The password cannot be less than 5 characters
	If it is less print: "Password cannot be less than 5 characters"
	If it is more than or equal to 5 print: "Valid password"

- Also, the password should not contain the userName
	If the password has the userName in it print: "Invalid password, userName should not be in it" and in that case change the password to have the value: "password"

Print the information in the end

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your userName: ");
        String userName = input.nextLine();
        userName= userName.toLowerCase();


        System.out.println("Enter your password: ");
        String password = input.nextLine();


        if (password.contains(userName) || password.length() < 5)  {
            if (password.length() < 5 ) {
                System.out.println("Password can not be less than 5 characters");

            } if (password.contains(userName)){
                    System.out.println("Invalid password, userName shouldn't be in it");
                }

        } else {
            System.out.println("Valid password");
        }





    }
}
