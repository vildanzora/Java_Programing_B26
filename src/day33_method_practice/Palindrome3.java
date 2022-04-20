package day33_method_practice;

import my_utilities.StringUtil;

import java.util.Scanner;

public class Palindrome3 {
    public static void PalindromeOrNot(String word) {


        String reversed = "";

        for (int i = 0; i < word.length(); i++) {
            reversed += word.charAt(i);

        }
        if (reversed.equals(word)) {
            System.out.println("Palindrome " + word);
        } else {
            System.out.println("Not Palindrome " + word);
        }
    }

    public static boolean isPalindrome (String str) {
        String reversed = StringUtil.reverse(str);
        return reversed.equalsIgnoreCase(str);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scan.nextLine();
        PalindromeOrNot(word);

        System.out.println("===============");

        System.out.println(isPalindrome("civic"));
    }
}
