package day14_if_statements;

public class AmazonPrime {
    public static void main(String[] args) {

        double price = 15.99;
        boolean hasPrime = false;

        if (hasPrime) {

            System.out.println("Eligible for 2 day shipping");

        } else {
            if (price >= 25) {
                System.out.println("Eligible for free shipping");
            } else {
                System.out.println("Not eligible for free shipping. Shipping fee : $3.99");
                price += 3.99;
                System.out.println("Your total price is " + price);
            }

        }


    }
}