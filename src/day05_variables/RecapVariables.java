package day05_variables;

public class RecapVariables {

    public static void main(String[]args){
        //Declare Variables

        byte numberOfCoffeeCups;
        double totalPriceOfCoffee;
        int totalStudentInClass;
        // We can not print value because they dont have a value at this time. And we'll assign variable.

        numberOfCoffeeCups = 2;
        totalPriceOfCoffee = 10.25;
        totalStudentInClass = 432;

        System.out.println(numberOfCoffeeCups);
        System.out.print(totalPriceOfCoffee);
        System.out.println(totalStudentInClass);

        //If I want to write at the same line with escape or # mark or - mark. we use concatenation to print the values of two variables at the same time
        System.out.println(numberOfCoffeeCups + " " + totalPriceOfCoffee + " " + totalStudentInClass);

        // Declare and assign, all of one line
        double temperature = 20.6;
        int javaDays = 5;

        System.out.println("This is my temperature: " + temperature);
        System.out.println("It is day " + javaDays + " in Java class.");






    }


}
