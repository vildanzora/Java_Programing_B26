package day10_scanner;
import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // popular names for scanner : scan, input , scanner , keyboard

        System.out.println(" Enter the price of the item: ");
        double price = scanner.nextDouble();

        System.out.println("Enter the quantity: ");
        int quantity = scanner.nextInt();

        double revenue = price * quantity;

        System.out.println("This is your revenue: " + revenue);
//        System.out.println(" This revenue is $" + (price * quantity));
//        System.out.println(" This revenue is: " + (scanner.nextDouble() * scanner.nextInt()));

    }

}
