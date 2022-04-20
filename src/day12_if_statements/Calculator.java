package day12_if_statements;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
/*        - do it without Scanner
        declare and assign 2 number variables
        declare and assign a char variable for an operator
        create a calculator based on the operator picked
        + : add num1 and num2
        - : minus num1 and num2
	* : multiply num1 and num2
	/ : divide num1 and num2
        any other char: "invalid operator"*/
        double num1 = 20;
        double num2 = 40;

        char a = '+';

        if (a == '+') {
            System.out.println((num1 + num2));
        } else if (a == '-') {
            System.out.println((num1 - num2));
        } else if (a == '*'){
            System.out.println( (num1 * num2) );
        } else if (a == '/') {
            System.out.println( (num1 / num2));
        }
    }
}