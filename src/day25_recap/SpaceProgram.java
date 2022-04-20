package day25_recap;

import java.util.Scanner;

public class SpaceProgram {
    public static void main(String[] args) {
        /*
        Given a String return a version of with spaces between all of the letters.
If there is already a space in the String put an underscore

	Ex: java	-> j a v a
		space 	-> s p a c e
		more words -> m o r e _ w o r d s
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter: ");
        String response = input.nextLine().trim();
        String fixed = "";

        for (int i = 0; i < response.length() ; i++) {

            if (response.charAt(i) == ' ') {
                fixed += "_ ";
            } else {
                fixed += response.charAt(i) + " ";
            }

        }

        System.out.println(fixed.trim());
    }
}
