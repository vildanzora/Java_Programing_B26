package OfficeHoursTask;

import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {

        /*
        Write a function:
				    		 that, given a positive integer N  However, any number divisible by 2, 3 or 5 should be replaced by the word
				    			Codility -- 2
				    			Test     -- 3
				    			Coders   -- 5
         */

        int number = 30;
        String result = "";


        if (number % 2 == 0) {
            result += "Codility";
            //System.out.print("Codility");
        }

        if (number % 3 == 0) {
            result += "Test";
            //System.out.print("Test");
        }

        if (number % 5 == 0) {
            result += "Coders";
            //System.out.print("Coders");
        }
        System.out.println(result);

        number = 15;

        if (number % 2 == 0 && number % 3 == 0 && number % 5 == 0) {
            result = "CodilityTestCoders";
        } else if (number % 2 == 0 && number % 3 == 0) {
            result = "CodilityTest";
        } else if (number % 2 == 0 && number % 5 == 0) {
            result = "CodilityCoders";
        } else if (number % 3 == 0 && number % 5 == 0) {
            result = "TestCoders";
        } else if (number % 5 == 0) {
            result = "Coders";
        } else if (number % 3 == 0) {
            result = "Test";
        } else if (number % 2 == 0) {
            result = "Codility";
        }

        System.out.println("result = " + result);
    }
}
