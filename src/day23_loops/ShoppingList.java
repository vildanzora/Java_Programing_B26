package day23_loops;
import java.util.Scanner;
public class ShoppingList {
    public static void main(String[] args) {

           /*
            repeated steps:
                ask the user to enter the item
                add item to shopping list
                ask the user if they want to add more items

                at the end show the full shopping list

         */

        Scanner input = new Scanner (System.in);
        String list = "Shopping List:";
        String addMore;

        do {
            System.out.println("Enter the name of the item");
           list += "\n*" + input.nextLine(); // this could also be done seperate. You can assign t oa String variable first then  concatenate to list


            System.out.println("Do you want to add more to your shopping list?");
            addMore = input.nextLine();



        } while ( (addMore.equalsIgnoreCase("Yes")) || (addMore.equalsIgnoreCase("Okay")) ); // if the user types 'yes' in the console about wanting to add more items, then the loop will iterate again

        // if the user types anything besides 'yes' the equals method will give false and the loop will stop

        System.out.println(list);






    }

}
