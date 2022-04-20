package day32_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {

        /**
         * Have nums starting array
         * you want to add a number to the end
         * so make your array bigger to store the new number
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want to start with");
        int size = scan.nextInt();
        int [] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter a number");
            nums[i] = scan.nextInt();
        }

        System.out.println("Array so far: " + Arrays.toString(nums));

        int [] expanded = Arrays.copyOf(nums, size+1); // you can write nums.length+1

        System.out.println("Enter the last number: ");
        expanded[expanded.length-1] = scan.nextInt();
        System.out.println(Arrays.toString(expanded));







    }
}
