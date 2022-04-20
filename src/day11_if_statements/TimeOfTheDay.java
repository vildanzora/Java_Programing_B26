package day11_if_statements;
import java.util.Scanner;
public class TimeOfTheDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the current hour");

        int time = scan.nextInt();

        if(time >=6 && time <= 11 ){
            System.out.println("Good Morning!");
        }

        if(time >=12 && time <= 16 ){
            System.out.println("Good Evening!");
        }

        if(time >=17 && time <= 23 ){
            System.out.println("Good Night!");
        }
    }
}
