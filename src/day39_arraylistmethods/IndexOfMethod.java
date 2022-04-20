package day39_arraylistmethods;

import java.util.ArrayList;

public class IndexOfMethod {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(100);
        nums.add(500);
        nums.add(800);
        System.out.println(nums);
        // give first 100

        System.out.println(nums.indexOf(100)); //0

        System.out.println(nums.indexOf(700)); // 700 is not a object default result is -1

        // last 100
        System.out.println(nums.lastIndexOf(100));

        // middle 100
        nums.set(nums.indexOf(100),0 );
        System.out.println(nums.indexOf(100));




    }
}
