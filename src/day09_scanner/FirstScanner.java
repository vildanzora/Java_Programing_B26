package day09_scanner;

import java.util.Scanner;

public class FirstScanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // input is just variable name

        System.out.println("Please enter your number");
        int number = input.nextInt();
        System.out.println("Hello " + number);

    }



}