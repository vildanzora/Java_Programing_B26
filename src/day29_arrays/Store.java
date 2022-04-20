package day29_arrays;

public class Store {
    public static void main(String[] args) {

        String [] items = { "Shoes", "Jackets", "Gloves", "AirPod", "Ipod", "Backpack" };
        double [] prices = { 89.99, 150.0, 399.99, 250.0, 439.5, 39.99 };
        int [] itemIds = { 12345, 12346, 12347, 12348, 12349, 12350 };

        //print catalog

        for (int i = 0; i < items.length; i++) {

            System.out.println("This is yours item information : " + itemIds[i] + ", " + items[i] + ", $ " + prices[i]);
        }

        // Task find index of gloves


        int indexOfGloves = -1; // to have a value if the gloves wasnt there

        for (int i = 0; i < items.length; i++) {
            if(items[i].equalsIgnoreCase("gloves")) {

                indexOfGloves = i;
                break;
            }
        }
        System.out.println(indexOfGloves);
      System.out.println( "price gloves: " + prices[indexOfGloves]);


        System.out.println("==================================");

        // Task: Find and print the information of the most expensive item. Name, price, id


        double mostExpensive = prices[0];      // Integer.MIN_VALUE;;
        int indexOfMostExpensive = 0;


        for (int i = 0; i < prices.length; i++) {

            if(prices[i] > mostExpensive) {
                mostExpensive = prices[i];
                indexOfMostExpensive = i;

            }
        }

        System.out.println("Expensive item is: " + items[indexOfMostExpensive] + "Price is: " + prices[indexOfMostExpensive]);



    }
}
