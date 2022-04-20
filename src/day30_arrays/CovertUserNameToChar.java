package day30_arrays;

import java.util.Scanner;

public class CovertUserNameToChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name = input.next().toUpperCase();

        char [] convert = name.toCharArray();

        System.out.println("The first letter of name: " + convert[0] + "\nThe last letter of name: " + convert[convert.length-1] );





    }
}
