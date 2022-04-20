package day28_array;

public class AddElements {
    public static void main(String[] args) {

        int [] nums = {3, 6, 10};
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

        }
        System.out.println(sum);



    }
}
