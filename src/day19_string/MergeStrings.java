package day19_string;

import java.sql.SQLOutput;

public class MergeStrings {
    public static void main(String[] args) {
        /*
        two strings : hard code to have 3 characters each
        merge to strings together
        abc
        xyz
        axbycz : output
         */

        String a = "abc";
        String b = "XYZ";
        String merged = "";
        merged += a.charAt(0);
        merged += b.charAt(0);
        merged += a.charAt(1);
        merged += b.charAt(1);
        merged += a.charAt(2);
        merged += b.charAt(2);

        System.out.println(merged);

    }
}
