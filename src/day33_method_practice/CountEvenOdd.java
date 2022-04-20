package day33_method_practice;

import java.util.Arrays;
import java.util.Scanner;

public class CountEvenOdd {
    public static void CountEvenOrOdd (int [] arr) {

        int evenCount = 0;
        int oddCount = 0;

        for(int each : arr) {
            if(each %2 == 0) {
                evenCount++;
            }
            if(each %2 != 0) {
                oddCount++;
            }
        }

        int [] [] arr2 = {{evenCount}, {oddCount}};
        System.out.println(Arrays.deepToString(arr2));


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 4 numbers: ");
        int [] numbers1 = new int [] {scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt()};
        CountEvenOrOdd(numbers1);
    }


}
