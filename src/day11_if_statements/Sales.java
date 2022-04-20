package day11_if_statements;
import java.util.Scanner;
public class Sales {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Type your sales amount to find out if you get the bonus.");
        int salesAmount = scan.nextInt();

        if(salesAmount < 10000 ){
            System.out.println("You don't get any bonus");
        }

        if( salesAmount >= 10000 && salesAmount < 15000 ){
            System.out.println("You get a bonus of 5000");
        }

        if( salesAmount >= 15000 && salesAmount < 15000 ){
            System.out.println("You get a bonus of 7000");
        }

    }
}
/*
create a sales amount variable
use the sales amount to determine the bonus you get at end of the month

	if your sales amount is less than 10000 you don't get any bonus

	if your sales amount is more than or equal to 10000 and less than 15000 you get a bonus of 5000

	if your sales amount is more than or equal to 15000 you get a bonus of 7000

	print your bonus number
 */