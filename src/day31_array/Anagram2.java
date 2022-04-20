package day31_array;

import java.util.Arrays;

public class Anagram2 {
    public static void main(String[] args) {

        /*
        Given two string
        find if they are anagram or not

        the characters are the same in both strings. but the order is different

        listen
        silent
         */

        String str1 = "listen";
        String str2 = "silent";

        char [] one = str1.toCharArray();
        char [ ] two = str2.toCharArray();

        Arrays.sort(one);
        Arrays.sort(two);

        System.out.println(Arrays.toString(one));
        System.out.println(Arrays.toString(two));

        System.out.println(Arrays.equals(one,two));

        if (Arrays.equals(one,two)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not a anagram");
        }

        System.out.println(Arrays.equals(one,two)? "Anagram" : "Not a anagram");







    }
}
