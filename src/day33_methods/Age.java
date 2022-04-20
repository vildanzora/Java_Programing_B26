package day33_methods;

import java.util.Scanner;

public class Age {
    public static void CalculateAge (int birthYear) {
        /*
        make a method that calculates the prints the age
        takes the birth year as an input
     */
        System.out.println("Your age is " + (2022 - birthYear) );
    }

    public static void main(String[] args) {
       CalculateAge(2000);
        int year = 1990;
        CalculateAge(year);
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your birth year: ");
        CalculateAge(input.nextInt()); // int birthYear = input.nextInt();


    }

}
