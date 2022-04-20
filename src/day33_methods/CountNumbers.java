package day33_methods;

import java.util.Scanner;

public class CountNumbers {
    /**
     * count up to a certain number
     * start from 0
     * all the numbers until the number input
     * method(5) --> 0 1 2 3 4 5
     * method(10) --> 0 1 2 3 ... 10
     */

    public static void count (int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a nuumber: ");
        count(input.nextInt());
    }
}
