package day09_scanner;
import java.util.Scanner;
public class WorkStatus {
    public static void main(String[] args) {

        Scanner b = new Scanner(System.in);
        System.out.println("First Name: ");

        String firstName = b.next();

        System.out.println("Last Name: ");
        String lastName = b.next();

        System.out.println("Are you a employee?: ");
        boolean isEmployeed = b.nextBoolean();
        System.out.println("Are you a student?: ");
        boolean isStudent = b.nextBoolean();

        String details = firstName + " " + lastName + " " + " is employed : " + isEmployeed + " and they are a student " + isStudent;
        


    }



}
