package day33_methods;

import java.util.Scanner;

public class Greeting {
    public static void hello (String name) {
        System.out.println("Hello " + name + ". How can I help you today");

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name please: ");
        String userNAme = input.nextLine();
        hello(userNAme);
        hello("Jamie");
    }
}
