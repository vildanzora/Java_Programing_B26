package day16_review;
import java.util.Scanner;
public class SoccerGame {
    public static void main(String[] args) {
          /*
    declare and assign a minutes variable
    use the minutes value to determine how much time is left in the soccer game

    use these ranges to determine the outputs:

    - any number less than 0 and more than 90 are not valid:

        when the minutes is less than 0:
            print: minutes cannot be a negative number
        when the minutes is more than 90:
            print: games cannot be longer than 90 minutes

    - when the minutes are between 90 - 75
        print: just getting started

    - when the minutes are between 74 - 60
        print: players are doing their best

    - when the minutes are between 59 - 30
        print: middle of the game is going great

    - when the minutes are between 29 - 0
        print: the end of the same is approaching

     */

        Scanner input = new Scanner(System.in);
        System.out.println("How many minutes are left in the game?");
        int minutes = input.nextInt();

        if (minutes >0 && minutes <90){
            // positive flow
            if(minutes >=75) {//if(minutes >=75)
                System.out.println("Game just getting started");
            } else if(minutes >=60) {
                System.out.println("players are doing their best");
            } else if (minutes >=30){
                System.out.println("middle of the game is going great");
            } else {
                System.out.println("the end of the same is approaching");
            }

        } /* end of the main if */ else {
            // negative or false outcome
            if (minutes <0){
              /*  System.out.println("minutes cannot be a negative number");*/
            } else if (minutes >90){
                /*System.out.println("Games cannot be longer than 90 minutes");*/
            }

            System.out.println( minutes < 0 ? "minutes cannot be a negative number" : "Games cannot be longer than 90 minutes");
        } // en of the main else


    }
}
