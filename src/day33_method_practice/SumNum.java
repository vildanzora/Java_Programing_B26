package day33_method_practice;

import java.util.Scanner;

public class SumNum {

    public static void SummaryNumbers (int [] arr) {

        int total = 0;
        for(int each : arr) {
            total += each;
        }
        System.out.println(total);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");

        int [] numbers1 = new int [] {scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt()};
        SummaryNumbers(numbers1);
    }
}
