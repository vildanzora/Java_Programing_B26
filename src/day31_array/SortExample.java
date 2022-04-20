package day31_array;

import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {

        int [] nums = {3, 6, 2, 68, 35, -2, 24};
        int [] norSorted = nums;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(norSorted));

        System.out.println("min: " + nums[0]);
        System.out.println("Max: " + nums[nums.length-1]);
        System.out.println("==================================");


        int max= Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > max) {
                max = nums[i];
            } if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
