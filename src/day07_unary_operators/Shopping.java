package day07_unary_operators;

public class Shopping {
    public static void main(String[] args) {
        int numOfItems = 0;
        double price = 0.0;

        System.out.println(" we pick up 1 water");
        System.out.println("how many items in the cart?" + ++numOfItems); //preincrement, so the number of items increases right away and then it is printed
        price = price + 2.5; // take the price value, which is 0, and add 2.5 and they reassign to the price variable

        System.out.println("we pick up 2 eggs");
        System.out.println("how many items in the cart?" + ++numOfItems);
        System.out.println("how many items in the cart?" + ++numOfItems);

        System.out.println(numOfItems++);

    }
}