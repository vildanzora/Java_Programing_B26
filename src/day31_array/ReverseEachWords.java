package day31_array;

import java.util.Arrays;

public class ReverseEachWords {
    public static void main(String[] args) {

        String sentence = "It started to snow in Chicago";
        String [] eachword = sentence.split(" ");
        String res = "";
        String message = "";

        for (int i = 0; i < eachword.length; i++) {
            for (int j = eachword[i].length()-1; j >= 0; j--) {
                res += eachword[i].charAt(j);
            }
            eachword[i] = res;
            res = "";

        }

        for (String s : eachword) {
            message += s + " ";
        }




        System.out.println("\n---------RESULT----------");
        System.out.println(message);






    }
}
