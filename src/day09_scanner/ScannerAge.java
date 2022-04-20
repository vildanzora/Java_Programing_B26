package day09_scanner;
import java.util.Scanner;

public class ScannerAge {
    public static void main(String[] args) {

        Scanner A = new Scanner(System.in);
        System.out.println(" Please enter your age: ");
        byte num1 = A.nextByte();
        System.out.println("Please enter your favorite number: ");
        long num2 = A.nextLong();
        System.out.println(" Please enter your favorite book: ");
        String book = A.next();

        System.out.println( num1 + " " + num2 + " " + book);

    }
}
