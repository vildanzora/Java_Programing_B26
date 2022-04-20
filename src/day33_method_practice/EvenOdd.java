package day33_method_practice;

import java.util.Scanner;

public class EvenOdd {
    public static void Even (int nums) {
        if(nums %2 == 0) {
            System.out.print( nums + " ");
        }
    }

    public static void Odd (int nums) {
        if(nums %2 != 0) {
            System.out.print( nums + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();
        for (int i = 1; i <= number; i++) {
            Even(i);
        }
        System.out.println();
        for (int i = 1; i <= number; i++) {
            Odd(i);
        }
    }



}
