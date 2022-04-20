package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class AllPalindrome {
    /*
    Create a method that will accept an ArrayList of Strings and return an ArrayList of Palindrome Strings
Ignore case sensitivity
Ex:
Input:
"Anna",  "Java",  "Python", "Racecar", "Level", "Cydeo”, "Eye"
Output:
Anna, Racecar, Level, Eye
     */

    public static ArrayList<String> allPalindrome (ArrayList<String> list) {

        ArrayList<String> palindromeWords = new ArrayList<>();
        for (String each : list) {
            String result = "";

            for (int i = each.length()-1; i >=0 ; i--) {
                result += each.charAt(i);
            }

            if (each.equalsIgnoreCase(result)){
                palindromeWords.add(each);
            }

        }

        return palindromeWords;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Anna", "Java", "Python", "Racecar", "Level", "Cydeo", "Eye"));
        System.out.println(allPalindrome(list));
    }
}
