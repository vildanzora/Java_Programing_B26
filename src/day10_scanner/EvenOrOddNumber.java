package day10_scanner;
import java.util.Scanner;
public class EvenOrOddNumber {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num1 = keyboard.nextInt();

        boolean isOdd = num1 % 2 ==0;
        boolean isEven = num1 % 2 !=0; // or you can write num1 % 2 ==1

        System.out.println( "It is a odd number: " + isOdd);
        System.out.println("Is it a even number: " + isEven);


    }

}
