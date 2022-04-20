package day18_string;
import java.util.Scanner;
public class filter_java {
    public static void main(String[] args) {
        /*
    ask the user to enter a message
    clean the message for empty spaces in the beginning and end
    check the message for bad phrases:

        java is bad
        quit
        have fun
        crying

    if there is a bad phrase in the message print:

        message failed to send

    otherwise print:

    $message sent
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your message");
        String msg = input.nextLine(); // input.nextLine().toLowerCase().trim();
        msg = msg.toLowerCase();
        msg = msg.trim();

        System.out.println("Your message is " +"\"" + msg + "\"" + "\nDo you want to sent this message?");
        String response = input.nextLine();


        if(msg.contains("java is bad") ||msg.contains("Quit") || msg.contains("have fun") || msg.contains("crying") ) {
            System.out.println("Message failed to send");
        } else {
            System.out.println("\"" + msg + "\"" + " was sent.");
        }








    }
}
