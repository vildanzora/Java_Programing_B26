package day11_if_statements;
import java.util.Scanner;
public class BankAccountScanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double balance = 1500;
        System.out.println("Your current balance is $1500\nHow much do you want to withdraw?");
        double withdraw = scan.nextDouble();
         balance -= withdraw;

        if(balance <0){
            System.out.println("Took out too much money, $100 overdraft applied" );
            balance -=100; // balance = balance -100;
        }

        System.out.println("Your balance is now $" + balance);


    }


}
