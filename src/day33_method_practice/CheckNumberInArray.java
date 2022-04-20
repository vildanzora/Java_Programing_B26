package day33_method_practice;

import day15_switch.Schedule;

import java.util.Scanner;

public class CheckNumberInArray {
    public static void CheckNum (int [] arr, int n) {

        int times = 0;

        for (int i = 0; i < arr.length; i++) {
            if(n == arr[i]) {
                times++;
            }

        }

        System.out.println(times > 0 ? "true" : "false");

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        int [] numbers1 = new int [] {scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt()};
        System.out.println("Enter a number which you want to check: ");

        int checkNumber = scan.nextInt();

        CheckNum(numbers1, checkNumber);
    }


}
