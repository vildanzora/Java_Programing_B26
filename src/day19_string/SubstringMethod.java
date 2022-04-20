package day19_string;
import java.util.Scanner;
public class SubstringMethod {
    public static void main(String[] args) {
        String str = "sunday";
        //            012345

        System.out.println(str.substring(1));
        System.out.println(str.substring(3));
        System.out.println(str);
        System.out.println("satur" + str.substring(3));
        System.out.println(str.substring(   2, 4));
        System.out.println(str.substring(0, str.length()-3));

        System.out.println(str.substring(0, 5)); // space is doesnt matter
        System.out.println(str.substring(0,6)); // keep whole word

        // System.out.println(str.substring(0, 7)); out of bounds because 6 index is read






    }
}
