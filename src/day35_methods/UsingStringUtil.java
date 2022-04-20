package day35_methods;

import my_utilities.StringUtil;

import java.util.Scanner;

public class UsingStringUtil {
    public static void main(String[] args) {
        System.out.println(StringUtil.reverse("apple"));
        System.out.println(StringUtil.fixFormat("JaMES"));

        System.out.println(StringUtil.frequencyOfCharacter("apple", 'p'));
        System.out.println(StringUtil.frequencyOfCharacter("apple", 'z'));

        System.out.println(StringUtil.uniqueCharacters("aaaabcddeeeff"));
        System.out.println(StringUtil.uniqueCharacters("java"));
        System.out.println(StringUtil.uniqueCharacters("apple"));






    }
}
