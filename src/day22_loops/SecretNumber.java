package day22_loops;
import java.util.Scanner;
public class SecretNumber {
    public static void main(String[] args) {
/*
create a program to guess the secret number.
flow will be as follows:
define the secret number, hard coded
ask the user to guess a number
based on the guess tell them a message:

  if they guess higher than the number:
      too high

  if they guess lower than the number:
      too low

  if they guess the number:
      you guessed correctly

      -> this will stop the guessing flow

Challenge: keep track of the number of attempts taken to guess right
 */
      /*  Scanner input = new Scanner(System.in);
        int secretNumber = 1234;
        int atttempt = 0;

        do {
            System.out.println("Guess number: ");
            int number = input.nextInt();

            if (number > secretNumber){
                System.out.println("Too High");
                atttempt++;
            } else if (number < secretNumber) {
                System.out.println("Too low");
                atttempt++;
            } else if (number == secretNumber){
                System.out.println("You guessed correctly");
                atttempt++;
                break;
            }
        } while(atttempt < 4);*/

        Scanner input = new Scanner(System.in);
        int secretNumber = 80; // in the future we will learn how to make a random numbers
        int guess;

        do {
            System.out.println("Guess number from 1 - 100: ");
            guess = input.nextInt();

            if (guess > secretNumber){
                System.out.println("Too High");

            } else if (guess < secretNumber) {
                System.out.println("Too low");

            }

        } while(guess != secretNumber);

        System.out.println("You guessed correct");





    }
}
