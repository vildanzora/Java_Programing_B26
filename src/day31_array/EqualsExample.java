package day31_array;

import java.util.Arrays;

public class EqualsExample {
    public static void main(String[] args) {

        int [] a = { 1, 2, 3};
        int [] b = { 1, 2, 3};
        int c [] = a;

        System.out.println(a == b);
        System.out.println(Arrays.equals(a,b));
        System.out.println(a == c);
        System.out.println();

        int [] d = {3, 2, 1};
        System.out.println(Arrays.equals(a, d));




    }
}
