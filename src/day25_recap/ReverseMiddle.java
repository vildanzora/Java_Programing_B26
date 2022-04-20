package day25_recap;
import java.util.Scanner;
public class ReverseMiddle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your 3 words: ");
        String str = input.nextLine();

        int firstSpace = str.indexOf(" ");

        int lastSpace = str.lastIndexOf(" "); // str.indexOf(" ", firstSpace +1);

        String middleWord = str.substring(firstSpace, lastSpace).trim(); // instead of trim() we can use firstspace +1

        String reverse = "";

        for (int i = middleWord.length()-1; i >= 0 ; i--) {
            reverse += middleWord.charAt(i);


        }
        System.out.println(str.substring(0, firstSpace+1) +  reverse + str.substring(lastSpace));



    }
}
