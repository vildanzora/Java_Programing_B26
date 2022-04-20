package day37_wrapper_arraylist;

import java.util.Scanner;

public class UppercaseEqualLowercase {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        boolean isEqual = false;
        int uppercase = 0;
        int lowercase =0;

        for (int i = 0; i <s.length() ; i++) {
            char letter = s.charAt(i);

            if(Character.isUpperCase(letter)) {
                uppercase++;
            } else if (Character.isLowerCase(letter)) {
                lowercase++;
            }

        }

        if(uppercase == lowercase) {
            isEqual = true;
        }
        System.out.println(isEqual);

    }
}
