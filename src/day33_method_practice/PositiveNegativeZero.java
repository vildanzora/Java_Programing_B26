package day33_method_practice;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void NumberType (int number){
        if(number > 0) {
            System.out.println("Number " + number + " is positive number");
        } else if (number < 0) {
            System.out.println("Number " + number + " is negative number");
        } else {
            System.out.println( number + " is equal zero");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scan.nextInt();
        NumberType(a);
    }
}
