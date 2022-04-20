package day34_methods;

import java.util.Scanner;

public class NumberAsWords {

    public static void main (String [] args) {

        numberAsWord(10);
        System.out.println(numberAsWord(10));

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        System.out.println(numberAsWord(input.nextInt()));

        /*
        Why can't I do this:
        int num = numberAsWord(input.nextInt());

        the method returns String, so we must store into a String variable
        String num = numberAsWord(input.nextInt());
         */

    }

    public static String numberAsWord (int num) {

        if(num < 1 || num > 10) {
            return num + " is invalid number";
        }

        String [] words = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

      return  words [num -1];



    }




}
