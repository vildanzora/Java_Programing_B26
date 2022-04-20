package day09_scanner;
import java.util.Scanner;
public class ScannerObject {
    public static void main(String[] args) {

        Scanner z = new Scanner(System.in);

        System.out.println(" Enter 3 angle numbers, click enter after putting each number ");

        float num1 = z.nextFloat();
        float num2 = z.nextFloat();
        float num3 = z.nextFloat();

        boolean triangle = (num1 + num2 + num3) == 180.0;
        boolean circle = (num1 + num2 + num3)   == 360.0;
        System.out.println(" Is it triangle: " + triangle);
        System.out.println( "Is it circle " + circle);



    }
}
