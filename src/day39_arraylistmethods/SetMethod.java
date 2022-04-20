package day39_arraylistmethods;

import java.util.ArrayList;

public class SetMethod {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);
        System.out.println(nums);

        nums.set(0, -100);
        System.out.println(nums);

        nums.set(2,50000);
        System.out.println(nums);

       //  nums.set(10, 700); it goes out of bounds



    }
}
