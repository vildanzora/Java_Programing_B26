package day30_arrays;

import java.util.Arrays;

public class ReverseMiddleWord {
    public static void main(String[] args) {

        String str= "Java always fun";
        String [] words = str.split(" ");

        String reversed = "";

        char [] middleWord = words[1].toCharArray();

        for (int i = middleWord.length-1; i >=0; i--) {
            reversed += middleWord[i];


        }

        System.out.println(words[0] + " " + reversed + " " + words[2]);

        System.out.println();

        System.out.println(Arrays.toString(str.split("")));






    }
}
