package day28_array;

import java.util.Arrays;

public class Store {
    public static void main(String[] args) {



        String [] items = {"shoes", "Jacket", "Gloves", "Airpods", "Ipad"};

        boolean hasJacket = false;


        for (int i = 0; i < items.length; i++) {
            if(items [i].equalsIgnoreCase("jacket") ) {
                hasJacket = true;
                break;
            }
        }
        System.out.println(hasJacket ? "Jackets in stock" : "Jackets out of stock");
        System.out.println(Arrays.toString(items).toLowerCase().contains("jacket") );








    }
}
