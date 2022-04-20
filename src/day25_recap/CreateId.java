package day25_recap;
import java.util.Scanner;
public class CreateId {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String firstName = input.next().toLowerCase().trim();
        System.out.println("Please enter your last name: ");
        String lastName = input.next().toLowerCase().trim();

        String id = firstName.substring(0,1).toLowerCase() +  lastName.substring(0,1).toUpperCase() + lastName.substring(1,3).toLowerCase();

        int multiple = firstName.length() * 2;

        System.out.println("Your id: " + id + multiple);



    }
}
