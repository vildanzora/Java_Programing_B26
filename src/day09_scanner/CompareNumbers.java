package day09_scanner;
import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {

        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 numbers: ");
        int number = input.nextInt();
        int number2 = input.nextInt();
        boolean isEqual = number == number2;
        System.out.println(isEqual);*/

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = input.nextInt();
        System.out.println("enter number 2");
        int num2 = input.nextInt();

        System.out.println("The numbers are equal: " + (num1 == num2));



    }

}
