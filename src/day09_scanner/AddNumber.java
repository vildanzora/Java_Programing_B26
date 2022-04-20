package day09_scanner;
import java.util.Scanner;

public class AddNumber {
    public static void main(String[] args) {

        Scanner a  = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");

        int num1 = a.nextInt();
        int num2 = a.nextInt();
        int num3 = a.nextInt();

        double sum = (num1 + num2 + num3) / 3;

        System.out.println( "sum : " + sum);


    }


}
