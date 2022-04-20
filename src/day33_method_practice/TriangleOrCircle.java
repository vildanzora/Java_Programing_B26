package day33_method_practice;

import java.util.Scanner;

public class TriangleOrCircle {
    public static void TriangleCircle(int number1, int number2, int number3){
        if((number1 + number2 + number3) == 180) {
            System.out.println("This is a triangle");
        } else if ((number1 + number2 + number3) == 360) {
            System.out.println("This is a circle");
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        TriangleCircle(a,b,c);
    }
}
