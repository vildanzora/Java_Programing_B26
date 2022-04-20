package day10_scanner;
import java.util.Scanner;

public class SecondCalculator {

    public static void main(String[] args) {
        //WRITE YOUR CODE BELOW:
        Scanner input = new Scanner(System.in);

        System.out.println("Enter seconds:");

        int inputSeconds, seconds, minutes, hours;

        inputSeconds = input.nextInt();
        hours = (inputSeconds/60)/60;
        minutes = (inputSeconds/60)% 60;
        seconds = inputSeconds %60;

        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");



    }
}