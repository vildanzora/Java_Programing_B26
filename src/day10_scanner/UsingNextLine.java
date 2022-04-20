package day10_scanner;

import java.util.Scanner;
public class UsingNextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("what is today?");
        String day = input.nextLine();

        System.out.println("Enter your first name: ");
        String firstName = input.nextLine();

        System.out.println("Enter your last name");
        String lastName = input.next();
        input.nextLine(); // the enter input from the line above id absorbed here

        System.out.println("What is your address");
        String address = input.nextLine();

        System.out.println(" Today " + day);
        System.out.println("First name " + firstName);
        System.out.println("Last name " + lastName);
        System.out.println("Address: " + address);




    }
}
