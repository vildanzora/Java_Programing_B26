package day24_loops;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str1 = input.next();
        String str2 = input.next();
        String check = "";
        String result = "";

        // check each letter in str1 to see if str2 contains it
        // replace each letter if it is found

        if(str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                check += str1.charAt(i);
                if (!str2.contains(check)) {
                    result = "Not an anagram";
                } else {
                    check = "";
                    result = "Anagram";
                }
            }
        }else {
            result = "Not an anagram";
        }
        System.out.println(result);

    }
}
