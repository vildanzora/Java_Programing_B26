package day37_wrapper_arraylist;

import java.util.Arrays;

public class CountCharacters {

    /*
  /*

    given some string, count the number of uppercase letter, lowercase letters, numbers, and other characters

        aP3d572&*jd@jdJU

    Character.isUpperCase(char) --> checks if a char is uppercase
    Character.isLowerCase(char) --> checks if the char is lowercase
    Character.isDigit(char) --> checks if the character is a number


     */
    public static void main(String[] args) {

        String str = "aP3d572&*jd@jdJU";
        String uppercaseCharacters = "";
        int upper = 0, lower = 0, number = 0, other = 0;

        for (int i = 0; i < str.length(); i++) {

            char letter = str.charAt(i);

            if ( Character.isUpperCase(letter)) {
                upper++;
                uppercaseCharacters += letter;
            } else if(( Character.isLowerCase(letter))) {
                lower++;
            } else if (( Character.isDigit(letter))){
                number++;
            } else{
                other++;
            }



        }

        System.out.println("Uppercase " + upper);
        System.out.println("Uppercase Letter: " + Arrays.toString(uppercaseCharacters.toCharArray()));
        System.out.println("Lowercase : " + lower);
        System.out.println("Number: " + number);
        System.out.println("Other: " + other);






    }
}
