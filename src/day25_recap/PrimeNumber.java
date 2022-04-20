package day25_recap;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
/*
Give a number determine if it is a prime number. A prime number is a number that is only divisible by 1 and itself.
Ex:
	Input:
		11
	Output:
		prime
Ex:
	Input:
		10
	Output:
		not prime
 */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = input.nextInt();
        boolean isPrime = true;

       /* if(num %4 != 0 && num %5 !=0 && num %3 !=0 && num % 7 !=0 && num % 8 !=0 && num % num == 0) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }*/

        for(int i = 2; i < num; i++) {
            if ( num % i ==0 ) {
                isPrime = false;
                break;
            }

        }
        if (isPrime) {
            System.out.println(num + " prime");
        } else {
            System.out.println(num + " not prime");
        }



    }
}
