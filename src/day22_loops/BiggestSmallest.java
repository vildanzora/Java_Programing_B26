package day22_loops;
import java.util.Scanner;
public class BiggestSmallest {
    public static void main(String[] args) {
        /*
        write a program that asks user to enter 5 numbers and returns the biggest and smallest numbers from those 5

         */

        /*
        Repeated steps:
        ask for a number

        check is it the biggest
        check is it the smallest
         */

        Scanner input = new Scanner(System.in);

       System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        int max = -2147483648;
        int min = 2147483647;

        int n = 0;

        while (n<5) {
            n++;
            System.out.println("Enter a number");
            int number = input.nextInt();

            if (number > max){
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);



      /*  System.out.println("Enter first number: ");
        int total = 0;
        int num = input.nextInt();
        int biggest = -2147483648;
        int smallest = 2147483647;

        do{
            System.out.println("Enter number: ");
            if(num > biggest){
                biggest = num;
            } else if(num < smallest){
                smallest = num;
            }
            num = input.nextInt();
            total++;
        }while(total < 4);


        System.out.println(biggest + " is biggest number " + smallest + " is smallest number");*/


    }

    }

