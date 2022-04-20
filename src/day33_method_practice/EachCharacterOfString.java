package day33_method_practice;


import java.util.Scanner;

public class EachCharacterOfString {
    public static void EachCharacters (String sentence){

        String [] sentence2 = sentence.split(" ");
        for(String eachWord : sentence2) {
            for (int i = 0; i < eachWord.length(); i++) {
                System.err.println(eachWord.charAt(i));

            }

        }


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String a = scan.nextLine();

        EachCharacters(a);
    }
}
