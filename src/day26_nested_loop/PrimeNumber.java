package day26_nested_loop;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter a range to check what are the prime numbers it contains: ");
        int range = input.nextInt();

        String prime = "";


        for (int i = 2; i <= range ; i++) { // the purpose of the loop is to check all the numbers from 2 the value the range variable.

           int count = 0;

            for (int j = 2; j < i ; j++) {

                if (i % j == 0) {
                    count++;

                }
            } // en of the inner loop

            if (count ==0) {
                System.out.print(i + " , ");
            }

        }


        System.out.println(prime);





    }

}