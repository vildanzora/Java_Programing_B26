package day20_string;

import java.util.Scanner;

public class ReplaceProgram {
    public static void main(String[] args) {
       /* [ Replace program] Will do this later when we learn replace method
        Given a String message with some text and a number (1-3) replace certain characters from the String message.
                When the number is:
        1: replace 'a' with 'e'
        2: replace 's' with 'r'
        3: replace 'o' with 'z'
        Ex:
        message: java class is fun
                number: 1
        Output: jeve cless is fun
        Ex:
        message: java class is fun
                number: 2
        Output: java clarr ir fun*/

        Scanner input = new Scanner(System.in);
        System.out.println("Write your sentence");
        String sentence = input.nextLine();

        boolean aInclude = sentence.contains("a");
        boolean sInclude = sentence.contains("s");

        if (aInclude){
            sentence = sentence.replace('a' , 'e');
            System.out.println(sentence);
        } if (sInclude) {
            sentence = sentence.replace('s' , 'r');
            System.out.println(sentence);
        }

    }
}
