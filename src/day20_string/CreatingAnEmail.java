package day20_string;
import java.util.Scanner;
public class CreatingAnEmail {
    /*
    [Creating an email]

    Ask user to enter two strings. Both strings should be at least 6 character long. If they are shorter than that print “Invalid data” and program should end.
    If the information provided is valid, you will take the first 4 characters of first string and combine them with the last three characters of the second string. At the end of your combined string add “@cybertek.com” and print the final string as your created email. The final email should be in all lowercase.
input: JamesBond Secret
output: jameret@cybertek.com
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 Words: ");

        String word1 = input.next().toLowerCase();
        String word2 = input.next().toLowerCase();


        String mail = "@cybertek.com";
        String merged= "";


        if((word1.length()< 6) && (word2.length() < 6)){
            System.out.println("Invalid Data");

        } else if ( (word1.length() >= 6) && (word2.length() >= 6)   ){
            String first4Characters = word1.substring(0 , 4);
            String last3Characters = word2.substring( word2.length()-3   );

            merged += first4Characters + last3Characters + mail;

        }
        System.out.println(merged);



    }
}
