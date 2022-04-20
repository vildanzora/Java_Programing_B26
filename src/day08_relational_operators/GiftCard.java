package day08_relational_operators;

public class GiftCard {
    public static void main(String[] args) {

        double giftCard = 200;

        System.out.println("I have a gif card " + giftCard + " balance."); //200
        giftCard -=100.5;

        System.out.println( "I bought 1 item which was a $40 and my current balance is " + giftCard); // 100

        giftCard -=40;

        System.out.println(" I bought 1 item again which was a $60 and my current balance ise " + giftCard); //60
        System.out.println(giftCard); //60
    }

}
