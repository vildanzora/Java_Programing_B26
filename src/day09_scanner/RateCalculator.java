package day09_scanner;
import java.util.Scanner;
public class RateCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your salary?: ");
        double salary = input.nextDouble();

        System.out.println("How many hours do you work in a week?: ");
        int hours = input.nextInt();

        System.out.println("This is your hourly rate: $" + (salary / (hours * 52)));



    }


}
