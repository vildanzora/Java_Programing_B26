package day09_scanner;
import java.util.Scanner;

public class ScannerOrder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter the product name: ");
        String productName = scanner.nextLine();

        System.out.println("enter the price: ");
        double price = scanner.nextDouble();

        System.out.println("enter the quantity: ");
        int quantity = scanner.nextInt();

        scanner.nextLine();

        System.out.println(" Your Full Name: ");
        String fullName = scanner.nextLine();

        double totalCoast = (price * quantity);

        System.out.println(fullName + ", your scanner for " +  quantity + " " +  productName + "(s) has been placed. Your total is  $" + totalCoast);



    }

}
/* Challenge for today: Try it yourself and see otherwise we will go through it together.

        - Place an order
        - Ask the user the enter the product name (String, multiple words)
                - Ask the user to enter the price (double)
                - Ask the user to enter the quantity(int)
                - Ask the user to enter their full name (String, multiple word)
                - Print in the following format:
        "$firstName, your order for $quantity $productName has been placed. Your total is $totalCost(price * quantity)."
        Ex:
        Input: "Apples" , 1.5, 5. "Luke"
        Output: Luke, your order for 5 Apples has been places. Your total is 7.5. */