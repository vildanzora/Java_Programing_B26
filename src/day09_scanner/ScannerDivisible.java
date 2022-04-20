package day09_scanner;
import java.util.Scanner;
public class ScannerDivisible {
    public static void main(String[] args) {

        Scanner divisible = new Scanner(System.in);

        System.out.println("Please enter a number: ");

        double num1 = divisible.nextDouble();

        boolean divisible2 = num1 % 2 == 0;
        boolean divisible3 = num1 % 3 == 0;
        boolean divisible5 = num1 % 5 == 0;
        System.out.println(divisible2);
        System.out.println(divisible3);
        System.out.println(divisible5);
    }
}
