package day29_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {

        String[] bankAccountOne = {"Brad Smith", "Checking", "0123456987", "100,000.000" };

        System.out.println(bankAccountOne.length);
        System.out.println( "Whole Array: " +  Arrays.toString(bankAccountOne));
        System.out.println("Name " + bankAccountOne[0]);
        System.out.println("Account Type: " + bankAccountOne[1]);
        System.out.println("Account Number " + bankAccountOne[2]);
        System.out.println("Balance " + bankAccountOne[3]);

        System.out.println("========================");

        String [] bankAccountTwo = new String [4];
        System.out.println(Arrays.toString(bankAccountTwo));
        bankAccountTwo[0] = "Jamie Fox";
        bankAccountTwo[1] = "Savings";
        bankAccountTwo[2] = "879654123";
        bankAccountTwo[3] = "158.213.897";
       // bankAccountTwo[20] = ""; out of bound
        System.out.println(Arrays.toString(bankAccountTwo));

        System.out.println("=============================");

//        String [] bankAccountThree = new String [4];
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your first name: ");
//        String firstNAme = input.nextLine();
//        bankAccountThree[0] = firstNAme;
//        System.out.println("Enter your account type: ");
//        bankAccountThree[1] = input.nextLine();
//        System.out.println("Enter your account number: ");
//        bankAccountThree[2] = input.nextLine();
//        System.out.println("Enter your balance: ");
//        bankAccountThree[3] = input.nextLine();
//        System.out.println(Arrays.toString(bankAccountThree));

        System.out.println("==================");

        String [] bankAccountFour = new String [4];
        String[] questions = {"full name", "account type", " account number", "balance"};


        for (int i = 0; i < bankAccountFour.length; i++) {
            System.out.println("Enter your " + questions[i]);
           bankAccountFour[i] =  input.nextLine();
        }

        System.out.println(Arrays.toString(bankAccountFour));





    }
}
