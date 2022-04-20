package day15_switch;
import java.util.Scanner;
public class Starbucks {
    public static void main(String[] args) {
 /*
    Declare price and calories variables
    Ask the user to enter which size drink they want
    Based on the drink size determine the price and calories of the order
    At the end print the details of the order
        data:
            size: tall
            price: 2.50
            calories: 100

            size: grande
            price: 4.00
            calories: 150

            size: venti
            price: 4.50
            calories: 200
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("***Welcome to Starbucks***\nWhich size drink do you want?");
        String size = scan.next();

        double price = 0;
        int calories = 0;
        boolean validOrder = true;

        switch (size) {
            case "Tall": case "tall" : case "TALL" :

                price= 2.50;
                calories= 100;
                break;
            case "grande" : case "Grande" : case "GRANDE":
                price = 4.00;
                calories= 150;
                break;
            case "venti": case "Venti" : case "VENTI":
                price= 4.50;
                calories= 200;
                break;
            default:
                validOrder = !true;
                System.out.println("We dont have that size");


        }
        if(validOrder) {

            System.out.println("Price: " + price + "\nCalories: " + calories);
        }
    }
}
