package day21_loops;
import java.util.Scanner;
public class Add5Number {
    public static void main(String[] args) {
        /*
        write a program that will add 5 numbers from the console
         */
       Scanner input = new Scanner(System.in);


        int number = 1;
        int total = 0;

        while (number <= 5) {
            System.out.println("Enter number " + number + " :");
        number++;

        total += input.nextInt();


        }
        System.out.println(total);


    }
}
