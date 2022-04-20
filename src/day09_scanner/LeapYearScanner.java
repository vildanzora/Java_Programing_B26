package day09_scanner;
import java.util.Scanner;
public class LeapYearScanner {

    public static void main(String[] args) {

        Scanner leapYear = new Scanner(System.in);

        System.out.println(" Please enter current year: ");

        int num1 = leapYear.nextInt();

        boolean isLeapYear = num1 % 4 == 0 || (num1 % 100 ==0 && num1 % 400 != 0);

        System.out.println( "Is it a leap year?: "  + isLeapYear);

    }
}
