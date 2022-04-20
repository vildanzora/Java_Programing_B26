package day15_switch;

import java.util.Scanner;

public class SeasonFinder {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter month number:");
        int monthNum = scan.nextInt();


        switch (monthNum) {
            case 1 :
                System.out.println("January. This is a winter season.\nWear a coat, glove and hat");
                break;

            case 2 :
                System.out.println("February.This is a winter season.\nkeep wearing a coat, glove and hat");
                break;

            case 3:
                System.out.println("March.This is a Spring season.\n You may wear  a trench-coat and use scarf.");
                break;

            case 4:
                System.out.println("April. This is a Spring season.\n You may wear a only trench-coat.");
                break;

            case 5:
                System.out.println("May. This is a Spring season.\n You may wear a shirt.");
                break;

            case 6:
                System.out.println("June");
                break;

            case 7:
                System.out.println("July");
                break;

            case 8:
                System.out.println("August");
                break;

            case 9:
                System.out.println("September");
                break;

            case 10:
                System.out.println("October");
                break;

            case 11:
                System.out.println("November");
                break;

            case 12:
                System.out.println("December");
                break;

            default:
                System.out.println("Invalid month number");



        }//end of the switch

    }
}