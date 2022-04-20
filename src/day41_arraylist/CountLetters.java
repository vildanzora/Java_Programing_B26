package day41_arraylist;

import my_utilities.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class CountLetters {
    /*
    Create a method that will accept an ArrayList of Strings and a letter (char) print how many times the letter is found in the ArrayList elements
Ex:
Input:
”java”, ”html”, “css”, “java”, “javascript”, “selenium”
letter: ‘a’
Output:
6
     */

    public static int countLetters (ArrayList<String> letter, ArrayList<Character> ch) {
        int  count = 0;
        for (String each : letter) {
            for (int i = 0; i < each.length(); i++) {
                if (ch.contains(each.charAt(i))) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>(Arrays.asList("java","html","css","java","javascript","selenium"));
        ArrayList<Character> str2 = new ArrayList<>(Arrays.asList('a'));
        System.out.println(countLetters(str,str2));
    }
}






