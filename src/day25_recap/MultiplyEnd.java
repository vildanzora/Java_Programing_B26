package day25_recap;
import java.util.Scanner;
public class MultiplyEnd {
    public static void main(String[] args) {
        /*
        Given a String and a number return a String that has the ending character duplicated and attached by the number amount of times

	Ex:
		Input:
			Hello?
			3
		Output:
			Hello????

	Ex:
		Input:
			java
			5
		Output:
			javaaaaaa
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter word: ");
        String str = input.nextLine();

        System.out.println("How many times do you want to repeat?");
        int repeat = input.nextInt();

        for (int i = 0; i < repeat ; i++) {
            str += str.charAt(str.length()-1);

        }

        System.out.println(str);
    }
}
