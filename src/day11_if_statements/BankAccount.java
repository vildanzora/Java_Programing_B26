package day11_if_statements;
import java.util.Scanner;
public class BankAccount {
    public static void main(String[] args) {

        double balance = 100;
        double withdraw = 150;
        balance -= withdraw;

        if(balance < 0 ){
            System.out.println("Took out too much money, $100 overdraft applied" );
            balance -=100; // balance = balance -100;
        }
        System.out.println("Balance $" + balance);



    }
}
