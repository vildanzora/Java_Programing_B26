package day32_arrays;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {

        int [] nums = {4, 10, 30, 100};
        System.out.println(Arrays.binarySearch(nums, 4));
        System.out.println(Arrays.binarySearch(nums, 100));
        System.out.println();
        System.out.println(Arrays.binarySearch(nums, 200)); // If there is a 200 element, it would be in forth position but written in output +1 position // would be +1
        System.out.println(Arrays.binarySearch(nums, 6)); // it would be an 1 position. // would be +1
    }
}
