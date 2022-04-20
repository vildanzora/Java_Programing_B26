package day20_string;
import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Enter First Name");
        String firstName = input.next();

        System.out.println("Enter last Name");
        String lastName = input.next();

       firstName = firstName.trim().toLowerCase();
        lastName = lastName.trim().toLowerCase();

      String fixedFirst = firstName.substring(0,1).toUpperCase();
        fixedFirst += firstName.substring(1);

        String fixedLast = lastName.substring(0,1).toUpperCase();
        fixedLast += lastName.substring(1);
        System.out.println(fixedFirst + " " + fixedLast);

    }
}
