package day28_array;

import java.util.Scanner;

public class StoreScanner {
    public static void main(String[] args) {

        String [] items = {"shoes", "Jacket", "Gloves", "Airpods", "Ipad"};

        Scanner input = new Scanner(System.in);
        System.out.println("Which item are you looking for?");
        String item = input.nextLine();
        boolean inStock = false;

        for (int i = 0; i < items.length; i++) {
            if(items[i].equalsIgnoreCase(item)){
                inStock = true;
                break;
            }

        }

        System.out.println( item + (inStock ? " in stock" : " out of stock"));

    }
}
