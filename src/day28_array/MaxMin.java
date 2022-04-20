package day28_array;

public class MaxMin {
    public static void main(String[] args) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int [] nums = {500, 120, -80, 250, -10};



        for (int i = 0; i < nums.length; i++) {

           //  int numbers = nums[i]; --> you can write this way.

            if (nums[i] > max){
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }

        }
        System.out.println("max number: " + max );
        System.out.println("min number: " + min);

    }
}
