package day15_switch;
import java.util.Scanner;
public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please write name of the month. Please use lowercase");
        String monthName = scan.next();

        switch(monthName) {
//January, March, May, July, August, October, December:
            case "january": case "march": case "may": case "july": case "august":
            case "october": case "december":
                System.out.println("There are 31 days");
                break;
            case "april": case "june": case "september": case "november":
                System.out.println("There are 30 days");
                break;
            case "february":
                System.out.println("There are 28 days");
                break;

            default:
                System.out.println("Invalid Month Written");


        } // en of the switch





    }
}
