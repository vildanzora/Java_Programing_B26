package day16_review;
import java.util.Scanner;
public class Calculator2 {
    public static void main(String[] args) {
/*
    declare and assign 2 number variables
    declare and assign a char variable for an operator

    create a calculator based on the operator picked
        + : add num1 and num2
        - : minus num1 and num2
        * : multiply num1 and num2
        / : divide num1 and num2
        any other char: "invalid operator"
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number one: ");
        double numOne = input.nextDouble();
        System.out.println("Pick operators: + - * / %");
        String operators = input.next();
        System.out.println("Enter number two: ");
        double numTwo = input.nextDouble();

        double result = 0;
        boolean validCalculation = true;

        switch(operators){
            case "+": case "plus":
                result = numOne + numTwo;
                break;
            case "-":
                result = numOne - numTwo;
                break;

            case"x": case"*":
                result = numOne * numTwo;
                break;

            case "/":

                if (numTwo != 0 ) {
                    result = numOne / numTwo;
                } else {
                    System.out.println("can not divide by 0");
                    validCalculation = false;
                }
                break;

            case "%":
                if (numTwo != 0 ) {
                    result = numOne % numTwo;
                } else {
                    System.out.println("can not take remainder of 0");
                    validCalculation = false;
                }
                break;
            default :
                System.out.println(operators + " is not a valid operator");
                validCalculation = false;

        }

        if(validCalculation) {
            System.out.println(numOne + " " + operators + " " + numTwo + " = " + result);
                }



    }
}
